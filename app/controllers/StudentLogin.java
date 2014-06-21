package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class StudentLogin extends Controller {
	public static Result login() 
	{
		return ok(views.html.studentLogin.render());
	}
}
