package models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;
import play.data.validation.Constraints;
import play.db.DB;
import play.db.ebean.Model;
import play.db.ebean.Transactional;
import play.db.jpa.JPA;
import play.libs.Akka;

@Entity
public class Stats extends Model  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int pauseVotes = 0;
	private static int speedOK = 0;
	private static int speedLow = 0;
	private static int speedHigh = 0;
	private static int volumeOK = 0;
	private static int volumeLow = 0;
	private static int volumeHigh = 0;
	

	@Id
	public Long ID_stats;
	
	@Constraints.Required
	public Long  speedCount;
	
	@Constraints.Required
	public Long  pauseCount;
	
	@Constraints.Required
	public Long  volumeCount;
	
	public static void updateDb(String vote) throws SQLException
	{
		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql;
		if(vote.contains("speed_low"))
		{ 
			speedLow ++;
			sql = "update stats set Speed_Low =" + speedLow + " where ID_stats=1";
			boolean rs = stmt.execute(sql);
		}
		else if(vote.contains("speed_ok"))
		{ 
			speedOK ++;
			sql = "update stats set Speed_OK =" + speedOK + " where ID_stats=1";
			boolean rs = stmt.execute(sql);
		}
		else if(vote.contains("speed_high"))
		{ 
			speedHigh ++;
			sql = "update stats set Speed_High =" + speedHigh + " where ID_stats=1";
			boolean rs = stmt.execute(sql);
		}
		else if(vote.contains("voice_low"))
		{ 
			volumeLow ++;
			sql = "update stats set Volume_Low =" + volumeLow + " where ID_stats=1";
			boolean rs = stmt.execute(sql);
		}
		else if(vote.contains("voice_ok"))
		{ 
			volumeOK ++;
			sql = "update stats set Volume_OK =" + volumeOK + " where ID_stats=1";
			boolean rs = stmt.execute(sql);
		}
		else if(vote.contains("voice_high"))
		{ 
			volumeHigh ++;
			sql = "update stats set Volume_High =" + volumeHigh + " where ID_stats=1";
			boolean rs = stmt.execute(sql);
		}
		else if (vote.contains("pause"))
		{
			pauseVotes ++;
			sql = "update stats set Pause_count =" + pauseVotes + " where ID_stats=1";
			boolean rs = stmt.execute(sql);
		}
	}
	
	public static ResultSet readDB(int statsID) throws SQLException {

		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql;
		sql = "SELECT ID_stats, Speed_Low, Speed_OK, Speed_High, Volume_Low, Volume_OK, Volume_High, Pause_count FROM stats WHERE ID_stats =" + statsID;
		ResultSet rs = stmt.executeQuery(sql);
		return rs;
	}
}
