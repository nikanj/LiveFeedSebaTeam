package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.persistence.Entity;
import javax.persistence.Id;
import play.data.validation.Constraints;
import play.db.DB;
import play.db.ebean.Model.Finder;

@Entity
public class Course {

	@Id
	public long ID_prof;

	@Constraints.Required
	public long Course_Id;

	@Constraints.Required
	public String CourseName;

	public long getCourse_Id() {
		return Course_Id;
	}

	public void setCourse_Id(long course_Id) {
		Course_Id = course_Id;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public static void updateDb(int profId, int courseId, String courseName2)
			throws SQLException {
		int flag = 0;
		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql;
		ResultSet rs = readDb(profId);

		while (rs.next()) {
			String course = rs.getString("CourseName");
			if (course.equalsIgnoreCase(courseName2)) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Added to database");
			sql = "Insert into course (ID_prof, CourseName) values (" + profId
					+ ",'" + courseName2 + "')";

			stmt.executeUpdate(sql);
		}
		rs.close();
		stmt.close();
		conn.close();
	}

	@SuppressWarnings("unchecked")
	public static ResultSet readDb(int profId) throws SQLException {
		Connection conn = DB.getConnection();
		Statement stmt = conn.createStatement();
		String sql;
		sql = "SELECT * FROM course where ID_prof=" + profId;
		ResultSet rs = stmt.executeQuery(sql);
		return rs;
	}

	public static int getCourseIdByCourseName(String courseName) {
		int courseId = 0;

		try (Connection conn = DB.getConnection();
				Statement stmt = conn.createStatement();) {

			String sql = "SELECT Course_Id FROM course where CourseName='"
					+ courseName + "'";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				// Retrieve by column name
				courseId = rs.getInt("Course_Id");
			}

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return courseId;
	}

}
