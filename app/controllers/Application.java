package controllers;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import models.*;
import play.data.DynamicForm;
import play.data.Form;
import play.data.validation.Constraints.Required;
import play.db.DB;
import play.libs.F.Callback;
import play.libs.F.Callback0;
import play.mvc.*;
import play.db.jpa.Transactional;


public class Application extends Controller {
	private static SecureRandom random = new SecureRandom();
	public static Long vote = 0L;
	static String event = "";
	private static String chosenOption;
	private static int speedSlow = 0;
	private static int speedOk = 0;
	private static int speed_Ok = 0;
	private static int speedFast = 0;
	private static int speed_Fast = 0;
	private static int volLow = 0;
	private static int volOk = 0;
	private static int vol_Ok = 0;
	private static int volHigh = 0;
	private static int vol_High = 0;
	private static double avgSpeed = 0;
	private static double avgVol = 0;
	private static double pause = 0;
	private static double sumOfSpeedVotes = 0;
	private static double sumOfVolVotes = 0;

	public static class Hello {
		@Required
		public String question;
	}

	@Transactional
	public static Result homePage() throws SQLException {
		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql;
		sql = "SELECT ID_prof, ProfName, Password FROM prof";
		ResultSet rs = stmt.executeQuery(sql);

		// STEP 5: Extract data from result set
		while (rs.next()) {
			// Retrieve by column name
			int id = rs.getInt("ID_prof");
			String name = rs.getString("ProfName");
			String password = rs.getString("Password");

			// Display values
			System.out.print("ID: " + id);
			System.out.print(", ProfName: " + name);
			System.out.println(", Password: " + password);
		}
		// STEP 6: Clean-up environment
		rs.close();
		stmt.close();
		conn.close();
		
		return ok(views.html.mainPage.render());
	}

	private static ArrayList<WebSocket.Out<String>> channels = new ArrayList<>();

	public static WebSocket<String> index() throws SQLException {
	//public static Result index() throws SQLException {
		
		return new WebSocket<String>() {
			
			// Called when the Websocket Handshake is done.
			public void onReady(WebSocket.In<String> in,
					final WebSocket.Out<String> out) {

				channels.add(out);
				

				// For each event received on the socket,
				in.onMessage(new Callback<String>() {
					public void invoke(String message) {
						// vote = Long.parseLong(message);
						System.out.println("DEBUG THE INPUT --> " + message);
						event = message.substring(0, message.length());
						System.out.println("DEBUG EVENT --> " + event);
					}
				});

				// When the socket is closed.
				in.onClose(new Callback0() {
					public void invoke() {

						System.out.println("Disconnected");
					}
				});

				if (event.isEmpty()) {
					out.write("NULL"); // Initialization for the charts
				} else {
					out.write(event);
				}
				
			}

		}; 
	}

	public static Result postQuestion() {

		 DynamicForm form = Form.form().bindFromRequest();
		  String question = form.get("p_question");
		  System.out.println("Reached Here");
		  System.out.println(question);
		  
		  for (WebSocket.Out<String> ws : channels) {
		   ws.write("question_" + question);
		  }
		  return indexStudent();

	}
	
	 public static Result vote() throws SQLException {
		 java.sql.Connection conn = DB.getConnection();
			java.sql.Statement stmt = conn.createStatement();
			String sql;
			
			sql = "SELECT ID_stats, Speed_count, Pause_count, Volume_count FROM stats";
			  ResultSet rs = stmt.executeQuery(sql);

				// STEP 5: Extract data from result set
				while (rs.next()) {
					// Retrieve by column name
					int id = rs.getInt("ID_stats");
					int speedCount = rs.getInt("Speed_count");
					int pauseCount = rs.getInt("Pause_count");
					int volCount = rs.getInt("Volume_count");

					// Display values
					System.out.print("ID: " + id);
					System.out.print(", speedCount: " + speedCount);
					System.out.println(", pauseCount: " + pauseCount);
					System.out.println(", volCount: " + volCount);
				}
			
			
			
		  DynamicForm requestData = play.data.Form.form().bindFromRequest();
		  chosenOption = requestData.get("radioGroup");
		  System.out.println(chosenOption);
		  
		  if (chosenOption == null) {
		  chosenOption = requestData.get("pause_vote");
		  }
		  if(chosenOption.equals("speed_low"))
		  {
			  speedSlow ++;
			  
			  sumOfSpeedVotes ++;
			//  sql = "update table stats set Speed_slow =" + speedSlow + " where ID_stats=1";
			 // stmt.executeQuery(sql);
		  }
		  else if(chosenOption.equals("speed_ok"))
		  {
			  speedOk ++;
			  sumOfSpeedVotes ++;
			  speed_Ok = speedOk * 2 ;
			//  sql = "update table stats set speed_ok =" + speedOk + " where ID_stats=1";
			//  stmt.executeQuery(sql);
		  }
		  else if(chosenOption.equals("speed_fast"))
		  {
			 
			  speedFast ++;
			  sumOfSpeedVotes ++;
			  speed_Fast = speedFast * 3;
		//	  sql = "update table stats set Speed_fast =" + speedFast + " where ID_stats=1";
		//	  stmt.executeQuery(sql);
		  }
		  else if(chosenOption.equals("voice_low"))
		  {
			  volLow ++;
			  sumOfVolVotes ++;
		//	  sql = "update table stats set Volume_low =" + volLow + " where ID_stats=1";
		//	  stmt.executeQuery(sql);
		  }
		  else if(chosenOption.equals("voice_ok"))
		  {
			  volOk ++;
			  sumOfVolVotes ++;
			  vol_Ok = volOk * 2 ;
		//	  sql = "update table stats set Volume_ok =" + volOk + " where ID_stats=1";
		//	  stmt.executeQuery(sql);
		  }
		  else if(chosenOption.equals("voice_loud"))
		  {
			  volHigh ++;
			  sumOfVolVotes ++;
			  vol_High = volHigh * 3;
		//	  sql = "update table stats set Volume_high =" + volHigh + " where ID_stats=1";
		//	  stmt.executeQuery(sql);
		  }
		  else
		  {
			  pause ++;
		//	  sql = "update table stats set Pause =" + pause + " where ID_stats=1";
		//	  stmt.executeQuery(sql);
		  }
		  if(chosenOption.contains("speed"))
		  {
			  
			  		  
			  avgSpeed = (double)(speedSlow+speed_Ok+speed_Fast) / sumOfSpeedVotes;
			 
			  avgSpeed = ((avgSpeed-1) / 2) * 100;
			  
			  for (WebSocket.Out<String> ws : channels) {
					ws.write("speed_" + String.valueOf(avgSpeed));
					
				}
			//  System.out.println("Wrote speed average");
		  }
		  if(chosenOption.contains("voice"))
		  {
		  
		  avgVol = (double)(volLow+vol_Ok+vol_High) / sumOfVolVotes;
		  
		  avgVol = ((avgVol-1) / 2) * 100;
		
		  for (WebSocket.Out<String> ws : channels) {
				ws.write("loudness_" + String.valueOf(avgVol));
			}
		//  System.out.println("Wrote loudness average");
		 
		  }
		  if(chosenOption.contains("pause"))
		  {
			  for (WebSocket.Out<String> ws : channels) {
					ws.write("pause_" + String.valueOf(pause));
				}
		  }
		  
		  Stats.updateDb(chosenOption);
		  
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		    return indexStudent();
		 }

	
	public static Result indexStudent() {
		return ok(views.html.indexStudent.render());
	}

	public static Result profPageDisplay() {
		
		String sessionId = new BigInteger(130, random).toString(32);

		return ok(views.html.profPage.render(vote));
	}

}
