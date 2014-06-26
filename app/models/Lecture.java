package models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.persistence.*;

import play.data.validation.*;
import play.db.jpa.*;
import play.data.validation.Constraints;
import play.db.DB;

@Entity
public class Lecture {

	@Id
	public Long Lecture_number;

	@Constraints.Required
	public Date Lecture_date;

	public Long getLecture_number() {
		return Lecture_number;
	}

	public void setLecture_number(Long lecture_number) {
		Lecture_number = lecture_number;
	}

	public static long generateLectureId() {
		long LOWER_RANGE = 0;
		long UPPER_RANGE = 1000000;
		Random random = new Random();
		long randomValue = LOWER_RANGE
				+ (long) (random.nextDouble() * (UPPER_RANGE - LOWER_RANGE));
		return randomValue;
	}

	public static Long createLecture(int courseId) throws SQLException {
		Course courseObejct = new Course();
		Lecture lectureObject = new Lecture();
		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql;

		Date date = new Date();
		String modifiedDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
		//Long CourseId = (long) courseId;
		courseObejct.setCourse_Id(courseId);
		int IDstats = Stats.insertDB();
		// Long lectureNumber = generateLectureId();
		lectureObject.setLecture_number(generateLectureId());
		// boolean rs;
		Stats.setIdStats(IDstats);

		sql = "Insert into lecture (Course_Id, ID_stats, Lecture_number, Lecture_date) values ("
				+ // CourseId
				courseObejct.getCourse_Id() + "," + IDstats + "," + // lectureNumber
				lectureObject.getLecture_number() + ",'" + modifiedDate + "');";
		// rs = stmt.execute(sql);
		// @Antoniya - test
		stmt.executeUpdate(sql);
		return lectureObject.getLecture_number();
	}

	public static boolean lectureEnter(long lectureId, String courseName)
			throws SQLException {
		Course courseObject = new Course();
		Lecture lectureObject = new Lecture();
		int courseId = 0;
		boolean isLectureId = false;
		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		courseId = Course.getCourseIdByCourseName(courseName);
		String query;
		// query that returns a specific lecture id and course name for given
		// course and by latest date
		query = "SELECT TOP 1 lecture.Lecture_number as lectureId, course.CourseName as courseName "
				+ "FROM lecture "
				+ "JOIN course "
				+ "ON course.Course_Id = lecture.Course_Id "
				+ "WHERE course.Course_Id= "
				+ courseId
				+ "ORDER BY lecture.Lecture_date DESC";

		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			lectureObject.setLecture_number(rs.getLong(1));
			courseObject.setCourseName(rs.getString(2));
			// validate the lecture id and course name from the result from
			// the database
			if ((lectureId == lectureObject.getLecture_number())
					&& (courseName.equalsIgnoreCase(courseObject
							.getCourseName()))) {
				isLectureId = true;
			}

		}
		// close connection
		rs.close();
		stmt.close();
		conn.close();

		return isLectureId;
	}
}
