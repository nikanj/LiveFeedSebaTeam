package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

	public static void updateDb(int profId, int courseId, String courseName2)
			throws SQLException {

		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql;
		System.out.println("In Course.java:" + profId + " " + courseId + " "
				+ courseName2);
		sql = "Insert into course (ID_prof, Course_Id, CourseName) values ("
				+ profId + "," + courseId + ",'" + courseName2 + "')";
		boolean rs = stmt.execute(sql);

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

			String sql = "SELECT Course_Id FROM course where CourseName="
					+ courseName;
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

	public static Finder<Long, Course> find = new Finder<Long, Course>(
			Long.class, Course.class);

}
