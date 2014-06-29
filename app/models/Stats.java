package models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

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
public class Stats extends Model {
	private static final long serialVersionUID = 1L;
	private static int IdStats = 0;

	@Id
	public Long ID_stats;

	@Constraints.Required
	public Long speedCount;

	@Constraints.Required
	public Long pauseCount;

	@Constraints.Required
	public Long volumeCount;

	public static int getIdStats() {
		return IdStats;
	}

	public static void setIdStats(int idStats) {
		IdStats = idStats;
	}

	public static void updateDb(int IdStats, String vote) throws SQLException {
		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql;
		int result = 0;
		sql = "select " + vote + " FROM stats where ID_stats=" + IdStats;
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			result = rs.getInt(vote);
			result++;
		}

		sql = "update stats set " + vote + " =" + result + " where ID_stats="
				+ IdStats;
		stmt.execute(sql);

		rs.close();
		stmt.close();
		conn.close();

	}

	public static ResultSet readDB(int statsID) throws SQLException {

		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql;
		sql = "SELECT ID_stats, Speed_Low, Speed_OK, Speed_High, Volume_Low, Volume_OK, Volume_High, Pause_count FROM stats WHERE ID_stats ="
				+ statsID;
		ResultSet rs = stmt.executeQuery(sql);

		return rs;
	}

	public static int insertDB() throws SQLException {
		int statId = 0;
		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql;
		sql = "Insert into stats (Speed_Ok, Speed_Low, Speed_High, Volume_Ok, Volume_Low, Volume_High, Pause_count) values (0, 0, 0, 0, 0, 0, 0);";
		stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
		ResultSet rs = stmt.getGeneratedKeys();
		if (rs.next()) {
			System.out.println("Keys: " + rs.getString(1));
			statId = Integer.parseInt(rs.getString(1));
		}

		return statId;
	}

}
