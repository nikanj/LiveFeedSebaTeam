package models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.DB;

@Entity
public class Question {

	@Id
	public Long ID;
	
	@Constraints.Required
	public Long ID_prof;
	
	@Constraints.Required
	public String Question;
	
	@Constraints.Required
	public String CourseName;
	
	public static int updateDB(int idProf, int courseId, String question) throws SQLException {
		int questionId = 0;
		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql;
		sql = "Insert into question (ID_prof, Question, Course_Id) values (" + idProf + ", '" + question + "'," + courseId + ");";
		stmt.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
		ResultSet rs = stmt.getGeneratedKeys();
		if(rs.next()){
			System.out.println("QuestionID: " + rs.getString(1));
			questionId = Integer.parseInt(rs.getString(1)); 
		}
		System.out.println("QuestionID returned: " + questionId);
		return questionId;
	}
	
	public static ResultSet readDB(int profID) throws SQLException {

		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql,sql1;
		sql = "SELECT COUNT(*) FROM question WHERE ID_prof = " + profID ;
		sql1 = "SELECT * FROM question WHERE ID_prof = " + profID ;
		ResultSet result = stmt.executeQuery(sql);
		ResultSet result2 = stmt.executeQuery(sql1);
		return result2;
	}
}
