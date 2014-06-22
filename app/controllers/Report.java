package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;

import models.Question;
import models.Stats;
import play.db.DB;
import play.mvc.Controller;
import play.mvc.Result;

public class Report extends Controller {

	private static ResultSet rs;
	private static int questionCount; 
	
	public static Result report() throws SQLException{
		
		rs = Stats.readDB(1);
		
		int speed_ok = 0;
		int speed_low = 0;
		int speed_high = 0;
		int volume_ok = 0;
		int volume_low = 0;
		int volume_high = 0;
		int pause_count = 0;
		
		// STEP 5: Extract data from result set
		while (rs.next()) {
			// Retrieve by column name
			speed_ok = rs.getInt("Speed_OK");
			speed_low = rs.getInt("Speed_Low");
			speed_high = rs.getInt("Speed_High");
			volume_ok = rs.getInt("Volume_OK");
			volume_low = rs.getInt("Volume_Low");
			volume_high = rs.getInt("Volume_High");
			pause_count = rs.getInt("pause_count");
		}
		
		ResultSet rs = Question.readDB(1); 
	
	    while(rs.next()){
	        questionCount = rs.getInt("count(*)");
	    }
		
		return ok(views.html.report.render(speed_low, speed_ok, speed_high, volume_low, volume_ok, volume_high, pause_count, questionCount));
	}

	
}
