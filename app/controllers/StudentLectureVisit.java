package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.Lecture;
import models.Prof;
import models.Question;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.WebSocket;

public class StudentLectureVisit extends Controller {

	public static boolean result = false;
	public static int flag = 1;
	public static ArrayList<String> questions = new ArrayList<String>();
	public static int studentCounter = 0;
	
	public static int getStudentCounter() {
		return studentCounter;
	}

	public static void setStudentCounter(int studentCounter) {
		StudentLectureVisit.studentCounter = studentCounter;
	}
	
	public static Result lectureEnter() {
		return ok(views.html.studentLectureEnter.render(flag));
	}

	public static Result enterLectureValidate() throws SQLException {
		DynamicForm form = Form.form().bindFromRequest();
		String courseName = form.get("courseName");
		int lectureId = Integer.parseInt(form.get("lectureNumber"));

		System.out.println("Test Student enter lecture.... let's see the magic");
		System.out.println("CourseName " + courseName);
		System.out.println("LectureID " + lectureId);

		result = Lecture.lectureEnter(lectureId, courseName);
		int courseId = NewCourse.getCourseId();
		ResultSet rs = Question.readDB(courseId);
		while (rs.next()) {
			String Question = rs.getString("Question");
			questions.add(Question);
		}
		if (result) {
			studentCounter++;
			return ok(views.html.indexStudent.render(questions));
		} else {
			flag = 0;
			return ok(views.html.studentLectureEnter.render(flag));
		}
	}

}

