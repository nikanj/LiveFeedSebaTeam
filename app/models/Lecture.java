package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.DB;

@Entity
public class Lecture {
		
	@Id
	public Long Course_Id;
	
	@Constraints.Required
	public Long ID_stats;
	
	@Constraints.Required
	public Long Lecture_number;
	
	public static long generateLectureId()
	{
		long LOWER_RANGE = 0; 
		long UPPER_RANGE = 1000000; 
		Random random = new Random();
		long randomValue = LOWER_RANGE + (long)(random.nextDouble()*(UPPER_RANGE - LOWER_RANGE));
		return randomValue;
	}
	
	public static void createLecture(int courseId) throws SQLException {
		Long CourseId = (long) courseId; 
		Long IDstats = Stats.insertDB();
		Long Lecturenumber = generateLectureId();
		boolean rs;
		
		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql;
		sql = "Insert into lecture (Course_Id, ID_stats, Lecture_number) values (" + CourseId + "," + IDstats + "," + Lecturenumber + ");";
		rs = stmt.execute(sql);
	}
	
	
}
