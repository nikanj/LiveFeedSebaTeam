package controllers;

import static play.data.Form.form;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import models.*;
import play.Routes;
import play.data.Form;
import play.data.validation.Constraints.Required;
import play.db.DB;
import play.libs.F.Callback;
import play.libs.F.Callback0;
import play.mvc.*;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;

public class Application extends Controller {
	public static Random randomGenerator = new Random();
	public static Long vote = 0L;
	public static String event;
	
	public static class Hello {
        @Required public String question;
	}

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

	
	public static WebSocket<String> index() throws SQLException {
		  return new WebSocket<String>() {
		      
			    // Called when the Websocket Handshake is done.
			    public void onReady(WebSocket.In<String> in, final WebSocket.Out<String> out) {
			      
			      // For each event received on the socket,
			      in.onMessage(new Callback<String>() {
			         public void invoke(String event) {
			        	 if(event.isEmpty() == false) {
			        		 
			        		 vote = Long.parseLong(event);
			        		 
			        		 
			        		 
			        		 
			        		 System.out.println("THE INPUT --> " + event);
			        		 System.out.println("DEBUG --> " + vote);
			        		 out.write(event.toString());
			        	 }
			         } 
			      });
			      
			      // When the socket is closed.
			      in.onClose(new Callback0() {
			         public void invoke() {
			             
			           System.out.println("Disconnected");
			             out.write("0");
			         }
			      });
			      
			      // Send a single 'Hello!' message
//			      out.write("50");
			      
			    }
			    
			  };
	}
	
@SuppressWarnings("rawtypes")
@Transactional
	public static Result profSignIn() {
	/*
	Set set = Prof.options().entrySet();
   
    Iterator i = set.iterator();
    
    while(i.hasNext()) {
       Map.Entry me = (Map.Entry)i.next();
       System.out.print(me.getKey() + ": ");
       System.out.println(me.getValue());
    }*/
    
		return ok(views.html.profSignIn.render());
	}

public static Result profMainPage() {
	//return ok(views.html.profMainPage.render(form(Hello.class)));
	return ok(views.html.profMainPage.render());
}

public static void Question() {
    Form<Hello> form = form(Hello.class).bindFromRequest();
    Hello data = form.get();
    System.out.println("Question: " + data.question);
 }

public static Result indexStudent() {
	return ok(views.html.indexStudent.render());
}

public static Result profPageDisplay() {
	
//	Stats stats1 = new Stats();
//	List<Stats> stat = stats1.options();
	return ok(views.html.profPage.render(vote));
}

}
