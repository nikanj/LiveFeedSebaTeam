
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object profHome extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[String],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(courseList: List[String]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.28*/("""
<!DOCTYPE html>

<html>
<head>
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*6.46*/routes/*6.52*/.Assets.at("stylesheets/main.css"))),format.raw/*6.86*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*7.51*/routes/*7.57*/.Assets.at("images/favicon.png"))),format.raw/*7.89*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*8.47*/routes/*8.53*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*8.106*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*9.47*/routes/*9.53*/.Assets.at("stylesheets/profHome.css"))),format.raw/*9.91*/("""">
<script src=""""),_display_(Seq[Any](/*10.15*/routes/*10.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*10.66*/("""" type="text/javascript"></script>

<script>
	$(document).ready(function() """),format.raw/*13.31*/("""{"""),format.raw/*13.32*/("""
		var connection = new WebSocket('ws://localhost:9000');

		connection.onopen = function() """),format.raw/*16.34*/("""{"""),format.raw/*16.35*/("""
		"""),format.raw/*17.3*/("""}"""),format.raw/*17.4*/("""

	
		$("#cancel").click(function() """),format.raw/*20.33*/("""{"""),format.raw/*20.34*/("""
			$("#q_area").hide();
		"""),format.raw/*22.3*/("""}"""),format.raw/*22.4*/(""");

		$("#addCourse").click(function() """),format.raw/*24.36*/("""{"""),format.raw/*24.37*/("""
			$("#q_area").show();
		"""),format.raw/*26.3*/("""}"""),format.raw/*26.4*/(""");

	"""),format.raw/*28.2*/("""}"""),format.raw/*28.3*/(""");
</script>

</head>
<body>
	<div id="container">
		<div class="page-header">
			<a href="/home"><img src=""""),_display_(Seq[Any](/*35.31*/routes/*35.37*/.Assets.at("images/logonew.png"))),format.raw/*35.69*/("""" height="70px"
				width="150px" alt="Live Feed"></a>
		</div>
		<header class="navbar navbar-static-top bs-docs-nav" id="top"
			role="banner">
			<div class="btn-group" style="float: right;">
				<a type="button" class="btn btn-default" href="/home">Home</a> <a
					type="button" class="btn btn-default" href="/aboutus">About Us</a>
				<a type="button" class="btn btn-default" href="/contact">Contact</a>
				<a type="button" class="btn btn-default" href="/feedback">Feedback</a>
			</div>
		</header>

		<form>
			<div id="courses">
				"""),_display_(Seq[Any](/*50.6*/for(course <- courseList) yield /*50.31*/{_display_(Seq[Any](format.raw/*50.32*/("""
				<div id="course">
					<div class="well" id="course-name">"""),_display_(Seq[Any](/*52.42*/course)),format.raw/*52.48*/("""</div>
					<div id="add-lecture-button-container">
						<a type="button" class="btn btn-primary" id="addLecture"
							href="/profPage?course="""),_display_(Seq[Any](/*55.32*/course)),format.raw/*55.38*/("""">Add New Lecture</a>
					</div>
					<div class="clear" style="clear: both;"></div>
				</div>
				""")))})),format.raw/*59.6*/("""
			</div>
		</form>

		<div id="create-course-container">
			<div id="add-course-button-container">
				<a type="button" class="btn btn-primary" id="addCourse">Create
					New Course</a>
			</div>
			<form method="get" action="/addCourse">
				<div id="q_area" class="well col-sm-10">
					<input type="text" class="form-control" id="course" placeholder="Course Name" name="courseName">
					<div class="btn-group-justified">
					<button type="submit" class="btn btn-success" id="create" style="width:231px;">Add Course</button>
					<button type="button" class="btn btn-danger" id="cancel" style="width:231px;">Cancel</button>
						<!--a type="submit" class="btn btn-success" id="create">Add Course</a>
						<a type="button" class="btn btn-danger" id="cancel">Cancel</a-->
					</div>
				</div>
			</form>
			<div class="clear" style="clear: both;"></div>
		</div>

		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	</div>
</body>
</html>
"""))}
    }
    
    def render(courseList:List[String]): play.api.templates.HtmlFormat.Appendable = apply(courseList)
    
    def f:((List[String]) => play.api.templates.HtmlFormat.Appendable) = (courseList) => apply(courseList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 29 23:37:54 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Final/livefeed/app/views/profHome.scala.html
                    HASH: ff2003cd047d4c41919ac6beba8cf8e6a5559bb0
                    MATRIX: 783->1|903->27|1020->109|1034->115|1089->149|1178->203|1192->209|1245->241|1330->291|1344->297|1419->350|1504->400|1518->406|1577->444|1631->462|1646->468|1713->513|1819->591|1848->592|1971->687|2000->688|2031->692|2059->693|2126->732|2155->733|2211->762|2239->763|2308->804|2337->805|2393->834|2421->835|2455->842|2483->843|2635->959|2650->965|2704->997|3298->1556|3339->1581|3378->1582|3480->1648|3508->1654|3693->1803|3721->1809|3858->1915
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|41->13|41->13|44->16|44->16|45->17|45->17|48->20|48->20|50->22|50->22|52->24|52->24|54->26|54->26|56->28|56->28|63->35|63->35|63->35|78->50|78->50|78->50|80->52|80->52|83->55|83->55|87->59
                    -- GENERATED --
                */
            