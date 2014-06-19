package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;

import play.db.DB;
import play.mvc.Controller;
import play.mvc.Result;

public class Report extends Controller {

	public static Result report() throws SQLException{

		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql;
		sql = "SELECT ID_stats, speed_Count, pause_Count, volume_Count FROM stats"; //WHERE clause not yet defined
		ResultSet rs = stmt.executeQuery(sql);
		
		int speed_count = 0;
		int pause_count = 0;
		int volume_count = 0;

		// STEP 5: Extract data from result set
		while (rs.next()) {
			// Retrieve by column name
			speed_count = rs.getInt("speed_Count");
			pause_count = rs.getInt("pause_Count");
			volume_count = rs.getInt("volume_Count");
		}
		
		int questionCount = 0;

		sql = "SELECT COUNT(*) FROM question WHERE ID_prof = 1";
		ResultSet rs2 = stmt.executeQuery(sql);
	    while(rs2.next()){
	        questionCount = rs2.getInt("count(*)");
	    }
		
		return ok(views.html.report.render(speed_count, pause_count, volume_count, questionCount));
	}

	
}
