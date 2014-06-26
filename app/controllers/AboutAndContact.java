package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class AboutAndContact extends Controller {

	// rendering of AboutUs page
	public static Result aboutUsPage() {
		return ok(views.html.aboutUsPage.render());
	}

	// rendering of ContactUs page
	public static Result contactUsPage() {
		return ok(views.html.contactUsPage.render());
	}

	// rendering of Feedback page
	public static Result feedbackPage() {
		return ok(views.html.feedbackPage.render());
	}
}
