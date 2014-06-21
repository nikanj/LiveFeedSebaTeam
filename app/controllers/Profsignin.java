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
	public static int flag = 1;
	private static List<String> courseName = new ArrayList<String>();
	public static Result profSignIn() {

		return ok(views.html.profSignIn.render(flag));

	}

	public static Result profHome() throws SQLException
	{
		System.out.println("Reached Here also!!!!");
		courseName = Course.readDb(profId);
		return ok(views.html.profHome.render());
	}

	public static Result validate() throws SQLException
	{
		DynamicForm form = Form.form().bindFromRequest();
		String username = form.get("p_username");
		String password = form.get("p_password");

		System.out.println("Test");
		System.out.println("uname: " + username);
		System.out.println("pwd: " + password);

		result = Prof.profDetails(username, password);
		profId = NewCourse.getProfId();

		
		System.out.println("Result: " + result);
		if(result)
		{
			
			System.out.println("In validate function");
			return ok(views.html.profHome.render());
			
		}
		else
		{
			flag = 0;
			return ok(views.html.profSignIn.render(flag));
		}
	}
	



}