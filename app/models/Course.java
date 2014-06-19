package models;


import java.sql.ResultSet;
import java.sql.SQLException;

import javax.persistence.Entity;
import javax.persistence.Id;
import play.data.validation.Constraints;
import play.db.DB;

@Entity
public class Course {
	
	@Id
	public long ID_prof;
	
	@Constraints.Required
	public long Course_Id;
	  
	@Constraints.Required
	public String CourseName;

	public static void updateDb(int profId, int courseId, String courseName2) throws SQLException {
		
		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql;
		System.out.println("In Course.java:" + profId + " " + courseId + " " + courseName2);
		sql = "Insert into course (ID_prof, Course_Id, CourseName) values (" + profId + "," + courseId + ",'" + courseName2 +"')";
		//sql = "update course set Course_Id=" + courseId + ", CourseName='" + courseName2 + "' where ID_prof=" + profId;
		boolean rs = stmt.execute(sql);
		
		
	}
	
	
}
