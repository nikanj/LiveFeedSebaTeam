package controllers;

import java.security.SecureRandom;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.*;
import play.data.DynamicForm;
import play.data.Form;
import play.data.validation.Constraints.Required;
import play.db.DB;
import play.libs.F.Callback;
import play.libs.F.Callback0;
import play.mvc.*;
import play.db.jpa.Transactional;

public class Application extends Controller {
	private static SecureRandom random = new SecureRandom();
	public static Long vote = 0L;
	static String event = "";
	private static String chosenOption;
	private static int IdStats = 0;
	public static double percentagePause = 0.0;
	public static ArrayList<String> questions = new ArrayList<String>();
	private static ArrayList<WebSocket.Out<String>> channels = new ArrayList<>();

	public static class Hello {
		@Required
		public String question;
	}

	@Transactional
	public static Result homePage() {
		return ok(views.html.mainPage.render());
	}

	/*
	 * Open a websocket connection for the student and professor page
	 */

	public static WebSocket<String> index() throws SQLException {

		return new WebSocket<String>() {

			// Called when the Websocket Handshake is done.
			public void onReady(WebSocket.In<String> in,
					final WebSocket.Out<String> out) {

				channels.add(out);

				// For each event received on the socket,
				in.onMessage(new Callback<String>() {
					public void invoke(String message) {
						event = message.substring(0, message.length());
					}
				});

				// When the socket is closed.
				in.onClose(new Callback0() {
					public void invoke() {
						System.out.println("Disconnected");
					}
				});

				if (event.isEmpty()) {
					out.write("NULL"); // Initialization for the charts
				} else {
					out.write(event);
				}

			}

		};
	}

	/*
	 * Questions are read from student and prof page here, stored in database
	 * and then written into the websocket.
	 */

	public static Result postQuestion() throws SQLException {

		DynamicForm form = Form.form().bindFromRequest();
		String question = form.get("p_question");

		int idProf = NewCourse.getProfId();
		int courseId = NewCourse.getCourseId();

		// Store Question in DB
		int questionID = Question.updateDB(idProf, courseId, question);

		ResultSet rs = Question.readDB(courseId);
		while (rs.next()) {
			int id = rs.getInt("ID_prof");
			int courseID = rs.getInt("Course_Id");
			int ID_question = rs.getInt("ID_question");
			String Question = rs.getString("Question");

			// Send only the new question into the websocket
			if (questionID == ID_question) {
				System.out.println("question_" + Question);
				for (WebSocket.Out<String> ws : channels) {
					ws.write("question_" + Question);
				}
			}

			// Display all questions in DB
			System.out.print("ID_prof: " + id);
			System.out.print(", Course_Id: " + courseID);
			System.out.print(", ID_question: " + ID_question);
			System.out.println(", Question: " + Question);
		}
		return ok();
	}

	/*
	 * Everytime student votes for speed, volume or pause
	 */
	public static Result vote() throws SQLException {

		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql;

		IdStats = Stats.getIdStats();

		DynamicForm form = Form.form().bindFromRequest();
		chosenOption = form.get("p_vote");

		if (!chosenOption.equals("unpause")) {
			Stats.updateDb(IdStats, chosenOption);
		}

		sql = "SELECT * FROM stats where ID_stats=" + IdStats;
		ResultSet rs = stmt.executeQuery(sql);

		// Extract data from result set
		while (rs.next()) {
			// Retrieve by column name
			int id = rs.getInt("ID_stats");
			int speedLow = rs.getInt("Speed_Low");
			int speedOk = rs.getInt("Speed_OK");
			int speedHigh = rs.getInt("Speed_High");
			int pauseCount = rs.getInt("Pause_count");
			int volLow = rs.getInt("Volume_Low");
			int volOk = rs.getInt("Volume_OK");
			int volHigh = rs.getInt("Volume_High");

			System.out.print("ID_stats: " + id);
			System.out.print(", speedLow: " + speedLow);
			System.out.print(", speedOk: " + speedOk);
			System.out.print(", speedHigh: " + speedHigh);
			System.out.print(", volLow: " + volLow);
			System.out.print(", volOk: " + volOk);
			System.out.print(", volHigh: " + volHigh);
			System.out.println(", pauseCount: " + pauseCount);

			double avgSpeed = 50, avgVol = 50;
			double totalSpeedVotes = speedLow + speedOk + speedHigh;
			double totalVolVotes = volLow + volOk + volHigh;

			// Calculate the average speed and loudness.
			if (totalSpeedVotes != 0) {

				double sum = (speedLow) + (speedOk * 2) + (speedHigh * 3);

				avgSpeed = (double) (sum / totalSpeedVotes);

				avgSpeed = ((avgSpeed - 1) / 2) * 100;

			}
			if (totalVolVotes != 0) {
				double sum = (volLow) + (volOk * 2) + (volHigh * 3);

				avgVol = (double) (sum / totalVolVotes);

				avgVol = ((avgVol - 1) / 2) * 100;

			}
			
			percentagePause = (double)pauseCount / (double)StudentLectureVisit.getStudentCounter() * 100;
			
			for (WebSocket.Out<String> ws : channels) {
				ws.write("pause_" + String.valueOf(percentagePause));
				ws.write("loudness_" + String.valueOf(avgVol));
				ws.write("speed_" + String.valueOf(avgSpeed));

			}

		}

		// Clean-up environment
		rs.close();
		stmt.close();
		conn.close();
		return ok();
	}

	/*
	 * Called when profPage is loaded for first time
	 */
	public static Result profPageDisplay() throws SQLException {
		DynamicForm form = Form.form().bindFromRequest();
		String selectedCourse = form.get("course");
		System.out.println("Course name: " + selectedCourse);

		int courseId = Course.getCourseIdByCourseName(selectedCourse);
		NewCourse.setCourseId(courseId);

		// New Lecture created for an existing course
		Long lectureNumber = Lecture.createLecture(courseId);
		System.out.println("Course_Id: " + courseId);

		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql;
		sql = "SELECT * FROM lecture";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			// Retrieve by column name
			int Course_Id = rs.getInt("Course_Id");
			int ID_stats = rs.getInt("ID_stats");
			int Lecture_number = rs.getInt("Lecture_number");

			// Display values
			System.out.print("Course Id: " + Course_Id);
			System.out.print(", Id stats: " + ID_stats);
			System.out.println(", Lec Number: " + Lecture_number);
		}

		int idOfCourse = NewCourse.getCourseId();

		// Retrieve Questions which were present for the course from earlier
		// lecture sessions
		ResultSet result = Question.readDB(idOfCourse);
		while (result.next()) {
			String Question = result.getString("Question");
			questions.add(Question);
		}
		return ok(views.html.profPage.render(questions, vote, lectureNumber));
	}

}
