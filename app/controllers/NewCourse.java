package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import models.Course;

import play.data.DynamicForm;
import play.data.Form;
import play.db.DB;
import play.mvc.Controller;
import play.mvc.Result;

public class NewCourse extends Controller {
	
	
	private static int profId;
	private static int courseId = 0;
	
	public static int getProfId() {
		return profId;
	}

	public static void setProfId(int profId) {
		NewCourse.profId = profId;
	}

	public static ArrayList<String> existingCourses(int prof_Id) throws SQLException
	{
		ResultSet courseNames = Course.readDb(prof_Id);
		ArrayList <String> courses = new ArrayList<String> ();
		while (courseNames.next()) {
			String course = courseNames.getString("CourseName");
			courses.add(course);
		}
		
		return courses;
	}
	
	/*
	public static Result addCourse() throws SQLException
	{
		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql;
		DynamicForm form = Form.form().bindFromRequest();
		String courseName = form.get("courseName");
		courseId ++;
		System.out.println("Before Update:" + profId + " " + courseId + " " + courseName);
		Course.updateDb(profId,courseId,courseName);
		courseNames = Course.readDb(profId);
	//	Course courses = Course.find.byId((long) profId);
		sql = "SELECT ID_prof, Course_Id, CourseName FROM course";
		  ResultSet rs = stmt.executeQuery(sql);

			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				int id = rs.getInt("ID_prof");
				int courseId = rs.getInt("Course_Id");
				String course = rs.getString("CourseName");
				
				// Display values
				System.out.print("ID: " + id);
				System.out.print(", courseId: " + courseId);
				System.out.println(", course: " + course);
						
		
			}
			return ok(views.html.profHome.render());	
	}*/
}
