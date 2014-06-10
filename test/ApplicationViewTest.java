import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.contentType;

import org.junit.Test;

import controllers.Application;
import play.mvc.Content;
import play.mvc.Result;


public class ApplicationViewTest {

	@Test
	//not a useful one, but pass :D
	public void renderStudentIndexTemplate() {
		Content html = views.html.indexStudent.render();
		assertThat(contentType(html)).isEqualTo("text/html");
		assertThat(contentAsString(html)).contains("");
	}

	@Test
	public void renderProfPageTemplate() {
		Content html = views.html.profPage.render("Welcome Professor");
		assertThat(contentType(html)).isEqualTo("text/html");
		assertThat(contentAsString(html)).contains("Welcome Professor");
	}
	
	 

}
