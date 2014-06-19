package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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

public class Profsignin extends Controller {
	
	public static boolean result = Boolean.FALSE;
	
	public static Result profSignIn() {

		return ok(views.html.profSignIn.render());
		
	}
	
	public static Result profHome()
	{
		System.out.println("Reached Here also!!!!");
		return ok(views.html.profHome.render());
	}
	
	public static Result postLogin() throws SQLException {

		DynamicForm form = Form.form().bindFromRequest();
		String username = form.get("username");
		String password = form.get("password");
		
		System.out.println("uname: " + username);
		System.out.println("pwd: " + password);
		result = Prof.profDetails(username, password);
		System.out.println("Result: " + result);
		if(result)
		{
			/*System.out.println("Reached Here!!!!");
			profHome();*/
			return redirect(routes.Profsignin.profHome());
		}
		else
		{
			return redirect(routes.Application.homePage());
		}
		

	}
	
	
}
