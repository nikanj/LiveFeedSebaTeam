package models;

import java.sql.ResultSet;

import controllers.NewCourse;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.DB;
import play.db.jpa.JPA;

;

@Entity
public class Prof {
	@Id
	public Long ID_prof;
	@Constraints.Required
	public String ProfName;
	@Constraints.Required
	public String Password;

	public static boolean profDetails(String uname, String pwd)
			throws SQLException {
		boolean flag = Boolean.FALSE;
		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql;
		sql = "SELECT ID_prof, ProfName, Password FROM prof";
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			int id = rs.getInt("ID_prof");
			String name = rs.getString("ProfName");
			String password = rs.getString("Password");

			if ((uname.equals(name)) && (pwd.equals(password))) {
				flag = Boolean.TRUE;
				NewCourse.setProfId(id);
			}
		}
		// STEP 6: Clean-up environment
		rs.close();
		stmt.close();
		conn.close();

		return flag;
	}

}