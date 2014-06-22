package models;

import java.sql.ResultSet;
import java.sql.SQLException;

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
	
	public static ResultSet readDB(int profID) throws SQLException {

		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql;
		sql = "SELECT COUNT(*) FROM question WHERE ID_prof = " + profID ;
		ResultSet result = stmt.executeQuery(sql);
		return result;
	}
}
