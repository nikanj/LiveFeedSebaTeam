import static org.fest.assertions.Assertions.assertThat;
import static play.mvc.Http.Status.OK;
import static play.mvc.Http.Status.BAD_REQUEST;

import static play.test.Helpers.GET;
import static play.test.Helpers.callAction;
import static play.test.Helpers.charset;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.contentType;
import static play.test.Helpers.status;

import java.sql.SQLException;

import controllers.Application;

import org.junit.Test;

import play.mvc.Result;
import play.test.FakeRequest;

//import play.twirl.api.Content;
/*http://www.playframework.com/documentation/1.2/api/play/mvc/results/package-summary.html*/

public class ApplicationControllerTest {
	@Test
	public void testControllerIndex() throws SQLException {
		Result result = Application.index();
		// аsserts that the Http request code is 200 (OK)
		assertThat(status(result)).isEqualTo(OK);
		// аsserts that Http request code is not 400 (BAD_REQUEST)
		assertThat(status(result)).isNotEqualTo(BAD_REQUEST);
		assertThat(contentType(result)).isEqualTo("text/html");
		assertThat(charset(result)).isEqualTo("utf-8");
		assertThat(contentAsString(result)).contains("Welcome");
	}

	// Test for Web socket status - WebSocketResult

	/*@Test - not working, but can be rebviewed
	public void testCallIndex() {
		//FakeRequest is a mock object for Request Data
		Result result = callAction(controllers.ref.Application.index(),
				new FakeRequest(GET, "/"));
		assertThat(status(result)).isEqualTo(OK);
	}*/
}
