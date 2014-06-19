package controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.*;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;

public class Profsignin extends Controller {
	
	public static boolean result = Boolean.FALSE;
	public static int profId;
	private static List<String> courseName = new ArrayList<String>();
	public static Result profSignIn() {

		return ok(views.html.profSignIn.render());
		
	}
	
	public static Result profHome() throws SQLException
	{
		System.out.println("Reached Here also!!!!");
		courseName = Course.readDb(profId);
		return ok(views.html.profHome.render());
	}
	
	public static Result postLogin() throws SQLException {

		DynamicForm form = Form.form().bindFromRequest();
		String username = form.get("username");
		String password = form.get("password");
		
		
		System.out.println("uname: " + username);
		System.out.println("pwd: " + password);
		
		result = Prof.profDetails(username, password);
		profId = NewCourse.getProfId();
		
		//Course course = Course.find.byId(profId);
		System.out.println("Result: " + result);
		if(result)
		{
			//rs = Course.readDb(profId);
			//return ok(views.html.profHome.render());
			return redirect(routes.Profsignin.profHome());
		}
		else
		{
			return redirect(routes.Application.homePage());
		}
		

	}
	
	
}
