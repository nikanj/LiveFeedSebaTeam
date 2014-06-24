package models;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
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
	
	public static Long createLecture(int courseId) throws SQLException {
		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql;
		
		Date date = new Date();
		String modifiedDate= new SimpleDateFormat("yyyy-MM-dd").format(date);
		Long CourseId = (long) courseId; 
		int IDstats = Stats.insertDB();
		Long lectureNumber = generateLectureId();
		boolean rs;
		Stats.setIdStats(IDstats);
		
		sql = "Insert into lecture (Course_Id, ID_stats, Lecture_number, Lecture_date) values (" + CourseId + "," + IDstats + "," + lectureNumber + ",'" + modifiedDate + "');";
		rs = stmt.execute(sql);
		return lectureNumber;
	}
	
	public static boolean lectureEnter(int lectureId, String courseName) throws SQLException {
				
		int courseId = 0;
		boolean result = false;
		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String query;
		courseId = Course.getCourseIdByCourseName(courseName);
		query = "SELECT TOP 1 lecture.Lecture_number as lectureId, course.CourseName as courseName "
				+ "FROM lecture "
				+ "JOIN course "
				+ "ON course.Course_Id = lecture.Course_Id "
				+ "WHERE course.Course_Id= " + courseId + "ORDER BY lecture.Lecture_date DESC";
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			Long idOfLecture = rs.getLong("lectureId");
			String nameOfCourse = rs.getString("courseName");
			
			if(((long)lectureId == idOfLecture) && (courseName.equalsIgnoreCase(nameOfCourse)))
			{
				result = true;
			}
			
		}
		
		return result;
	}
}
