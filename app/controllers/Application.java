package controllers;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

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
	private static int speedSlow = 0;
	private static int speedOk = 0;
	private static int speed_Ok = 0;
	private static int speedFast = 0;
	private static int speed_Fast = 0;
	private static int volLow = 0;
	private static int volOk = 0;
	private static int vol_Ok = 0;
	private static int volHigh = 0;
	private static int vol_High = 0;
//	private static double avgSpeed = 0;
//	private static double avgVol = 0;
	private static double pause = 0;
	private static double sumOfSpeedVotes = 0;
	private static double sumOfVolVotes = 0;
	private static int IdStats = 0;
	public static ArrayList<String> questions = new ArrayList<String>();
	
	public static class Hello {
		@Required
		public String question;
	}

	@Transactional
	public static Result homePage() throws SQLException {
		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql;
		sql = "SELECT ID_prof, ProfName, Password FROM prof";
		ResultSet rs = stmt.executeQuery(sql);

		// STEP 5: Extract data from result set
		while (rs.next()) {
			// Retrieve by column name
			int id = rs.getInt("ID_prof");
			String name = rs.getString("ProfName");
			String password = rs.getString("Password");

			// Display values
			System.out.print("ID: " + id);
			System.out.print(", ProfName: " + name);
			System.out.println(", Password: " + password);
		}
		// STEP 6: Clean-up environment
		rs.close();
		stmt.close();
		conn.close();

		return ok(views.html.mainPage.render());
	}

	private static ArrayList<WebSocket.Out<String>> channels = new ArrayList<>();

	public static WebSocket<String> index() throws SQLException {
		// public static Result index() throws SQLException {

		return new WebSocket<String>() {

			// Called when the Websocket Handshake is done.
			public void onReady(WebSocket.In<String> in,
					final WebSocket.Out<String> out) {

				channels.add(out);

				// For each event received on the socket,
				in.onMessage(new Callback<String>() {
					public void invoke(String message) {
						// vote = Long.parseLong(message);
						System.out.println("DEBUG THE INPUT --> " + message);
						event = message.substring(0, message.length());
						System.out.println("DEBUG EVENT --> " + event);
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
	
			
		public static Result postQuestion() throws SQLException {

		DynamicForm form = Form.form().bindFromRequest();
		String question = form.get("p_question");
		System.out.println("Reached in App controller (postQuestion function)");
		System.out.println("question: " + question);
		int idProf = NewCourse.getProfId();
		int courseId = NewCourse.getCourseId();
		int questionID = Question.updateDB(idProf, courseId, question);
		
		ResultSet rs = Question.readDB(courseId);
		while (rs.next()) {
			int id = rs.getInt("ID_prof");
			int courseID = rs.getInt("Course_Id");
			int ID_question = rs.getInt("ID_question");
			String Question = rs.getString("Question");
			
			if(questionID == ID_question)
			{
				System.out.println("question_" + Question);
				for (WebSocket.Out<String> ws : channels) {
					ws.write("question_" + Question);
				}
			}
			
			// Display values
			System.out.print("ID_prof: " + id);
			System.out.print(", Course_Id: " + courseID);
			System.out.print(", ID_question: " + ID_question);
			System.out.println(", Question: " + Question);
		}
		return indexStudent();
	}

	public static Result vote() throws SQLException {
		
		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql;
		
		IdStats = Stats.getIdStats();

		DynamicForm form = Form.form().bindFromRequest();
		chosenOption = form.get("p_vote"); 
				
		System.out.println("\n In app controller before update IdStats: " + IdStats + " ChosenOption: " + chosenOption);
		Stats.updateDb(IdStats, chosenOption);
		sql = "SELECT * FROM stats where ID_stats=" + IdStats;
		ResultSet rs = stmt.executeQuery(sql);

		// STEP 5: Extract data from result set
		while (rs.next()) {
			// Retrieve by column name
			int id =         rs.getInt("ID_stats");
			int speedLow =   rs.getInt("Speed_Low");
			int speedOk =    rs.getInt("Speed_OK");
			int speedHigh =  rs.getInt("Speed_High");
			int pauseCount = rs.getInt("Pause_count");
			int volLow =     rs.getInt("Volume_Low");
			int volOk =      rs.getInt("Volume_OK");
			int volHigh =    rs.getInt("Volume_High");
			
			System.out.print("ID_stats: " + id);
			System.out.print(", speedLow: " + speedLow);
			System.out.print(", speedOk: " + speedOk);
			System.out.print(", speedHigh: " + speedHigh);
			System.out.print(", volLow: " + volLow);
			System.out.print(", volOk: " + volOk);
			System.out.print(", volHigh: " + volHigh);
			System.out.println(", pauseCount: " + pauseCount);
			
			double avgSpeed = 50,avgVol = 50;
			double totalSpeedVotes = speedLow + speedOk + speedHigh;
			double totalVolVotes = volLow + volOk + volHigh;
			if(totalSpeedVotes != 0)
			{	
				
				double sum = (speedLow) + (speedOk * 2) + (speedHigh * 3);
				
				avgSpeed = (double) (sum / totalSpeedVotes);
				
				avgSpeed = ((avgSpeed - 1) / 2) * 100;
				
			}
			if(totalVolVotes != 0)
			{
				double sum = (volLow) + (volOk * 2) + (volHigh * 3);
				
				avgVol = (double) (sum / totalVolVotes);
				
				avgVol = ((avgVol - 1) / 2) * 100;
				
			}
			
			for (WebSocket.Out<String> ws : channels) {
				ws.write("pause_" + String.valueOf(pauseCount));
				ws.write("loudness_" + String.valueOf(avgVol));
				ws.write("speed_" + String.valueOf(avgSpeed));
				
			}

		}

		// STEP 6: Clean-up environment
		rs.close();
		stmt.close();
		conn.close();
		return indexStudent();
	}

	public static Result indexStudent() {
		
		return ok();
	}

	public static Result profPageDisplay() throws SQLException {
		DynamicForm form = Form.form().bindFromRequest();
		String selectedCourse = form.get("course");
		System.out.println("Course name: " + selectedCourse);

		int courseId = Course.getCourseIdByCourseName(selectedCourse);
		NewCourse.setCourseId(courseId);
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
		ResultSet result = Question.readDB(idOfCourse);
		while (result.next()) {
			String Question = result.getString("Question");
			questions.add(Question);
		}
		return ok(views.html.profPage.render(questions,vote, lectureNumber));
	}

}
