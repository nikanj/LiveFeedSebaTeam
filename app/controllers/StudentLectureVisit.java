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
		if (result) {
			return ok(views.html.indexStudent.render());
		} else {
			flag = 0;
			return ok(views.html.studentLectureEnter.render(flag));
		}
	}

}

