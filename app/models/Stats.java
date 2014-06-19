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
	private static int speedVotes = 0;
	private static int pauseVotes = 0;
	private static int volVotes = 0;
	

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
		if(vote.contains("speed"))
		{ 
			speedVotes ++;
			sql = "update stats set Speed_count =" + speedVotes + " where ID_stats=1";
			boolean rs = stmt.execute(sql);
		}
		else if (vote.contains("pause"))
		{
			pauseVotes ++;
			sql = "update stats set Pause_count =" + pauseVotes + " where ID_stats=1";
			boolean rs = stmt.execute(sql);
		}
		else
		{
			volVotes ++;
			sql = "update stats set Volume_count =" + volVotes + " where ID_stats=1";
			boolean rs = stmt.execute(sql);
		}
	}
}
