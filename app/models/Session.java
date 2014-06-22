package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.DB;

@Entity
public class Session {

	@Id
	public Long Course_Id;
	
	@Constraints.Required
	public Long  ID_stats;
	
	@Constraints.Required
	public Long Session_number;
	
	public static void insertSession(int courseId) {
		
		try (Connection conn = DB.getConnection();
				Statement stmt = conn.createStatement();) {

			String sql = "INSERT Course_Id FROM course where CourseName=" + courseName;
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				// Retrieve by column name
				courseId = rs.getInt("Course_Id");
			}

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	private int generateSessionId() {
		long randomNumber = (long) Math.floor(Math.random() * 9000000L) + 1000000L;
		return parseInt(randomNumber);
	}
}
