package models;


import java.sql.ResultSet;
import java.sql.SQLException;
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

		
	public static void updateDb(int profId, int courseId, String courseName2) throws SQLException {
		
		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql;
		System.out.println("In Course.java:" + profId + " " + courseId + " " + courseName2);
		sql = "Insert into course (ID_prof, Course_Id, CourseName) values (" + profId + "," + courseId + ",'" + courseName2 +"')";
		boolean rs = stmt.execute(sql);
		
		
	}
	
	@SuppressWarnings("unchecked")
	public static ResultSet readDb(int profId) throws SQLException
	{
		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql;
		sql = "SELECT CourseName FROM course where ID_prof=" + profId;
		ResultSet rs = stmt.executeQuery(sql);
		return rs;
	}
	
	public static Finder<Long, Course> find = new Finder<Long, Course>(Long.class, Course.class);
	
}
