package controllers;

import java.sql.SQLException;

import models.Lecture;
import models.Prof;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

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

		result = Lecture.lectureEnter(lectureId, courseName);
		if (result) {
			return ok(views.html.indexStudent.render());
		} else {
			flag = 0;
			return ok(views.html.studentLectureEnter.render(flag));
		}
	}

}
