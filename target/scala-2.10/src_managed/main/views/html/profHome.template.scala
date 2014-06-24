
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
$(document).ready(function() """),format.raw/*13.30*/("""{"""),format.raw/*13.31*/("""
	var connection = new WebSocket('ws://localhost:9000');

	connection.onopen = function() """),format.raw/*16.33*/("""{"""),format.raw/*16.34*/("""
	"""),format.raw/*17.2*/("""}"""),format.raw/*17.3*/("""
/*
	$("#createCourse").click(function() """),format.raw/*19.38*/("""{"""),format.raw/*19.39*/("""
		$.post("/addCourse", """),format.raw/*20.24*/("""{"""),format.raw/*20.25*/("""
			courseName : $("#course").val()
		"""),format.raw/*22.3*/("""}"""),format.raw/*22.4*/(""")
	"""),format.raw/*23.2*/("""}"""),format.raw/*23.3*/(""");*/


	$("#cancel").click(function() """),format.raw/*26.32*/("""{"""),format.raw/*26.33*/("""
		$("#q_area").hide();
	"""),format.raw/*28.2*/("""}"""),format.raw/*28.3*/(""");

	$("#addCourse").click(function() """),format.raw/*30.35*/("""{"""),format.raw/*30.36*/("""
		$("#q_area").show();
	"""),format.raw/*32.2*/("""}"""),format.raw/*32.3*/(""");

"""),format.raw/*34.1*/("""}"""),format.raw/*34.2*/(""");
</script>

</head>
<body>
	<div id="container">
		<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
			<img src=""""),_display_(Seq[Any](/*41.15*/routes/*41.21*/.Assets.at(" images/logo.png"))),format.raw/*41.51*/("""" height="50px"
				width="150px" alt="Live Feed">
		</div>
		<header class="navbar navbar-static-top bs-docs-nav" id="top"
			role="banner">
			<div class="btn-group" style="margin-left: 75%;">
				<a type="button" class="btn btn-default" href="/home">Home</a> 
				<a type="button" class="btn btn-default" href="/aboutus">About Us</a>
				<a type="button" class="btn btn-default" href="/contact">Contact</a>
				<a type="button" class="btn btn-default" href="/feedback">Feedback</a>
			</div>
		</header>

		<form>
		<div id="courses" >
			"""),_display_(Seq[Any](/*56.5*/for(course <- courseList) yield /*56.30*/{_display_(Seq[Any](format.raw/*56.31*/("""
			<div style="clear: both;">
				<div class="well" style="margin-left: 100px; width: 200px; float: left;">"""),_display_(Seq[Any](/*58.79*/course)),format.raw/*58.85*/("""</div>
				<div class="well" style="margin-left: 100px; width: 200px; float: left;">
				<a type="button" class="btn btn-primary btn-group-justified" id="addLecture" href="/profPage?course="""),_display_(Seq[Any](/*60.106*/course)),format.raw/*60.112*/("""">Add New Lecture</a>
				</div>
			</div>
			""")))})),format.raw/*63.5*/("""
		</div>
		</form>



		<div class="well col-lg-4" style="margin-left: 100px; width: 200px;">
			<a type="button" class="btn btn-primary btn-group-justified" id="addCourse">Create New Course</a>
		</div>
		<br>
		<br>
		<br>
		<br>
		<form method="get" action="/addCourse">
		<div id="q_area" class="well col-sm-10"	style="margin-left: 100px; width: 500px; display: none;">
		<input type="text" class="form-control"id="course" placeholder="Course Name" name="courseName">
			<div class="btn-group-justified" style="margin-top: 20px;">
				<button type="submit" class="btn btn-success" style="width:214px">Add Course</button>
				<button type="button" class="btn btn-danger" style="width:214px" id="cancel">Cancel</button>
			</div>
		</div>
		</form>


		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	</div>
</body>
</html>"""))}
    }
    
    def render(courseList:List[String]): play.api.templates.HtmlFormat.Appendable = apply(courseList)
    
    def f:((List[String]) => play.api.templates.HtmlFormat.Appendable) = (courseList) => apply(courseList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 24 18:54:19 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/profHome.scala.html
                    HASH: e269b0b71542201b0137e10410cd53b2a4f51968
                    MATRIX: 783->1|903->27|1020->109|1034->115|1089->149|1178->203|1192->209|1245->241|1330->291|1344->297|1419->350|1504->400|1518->406|1577->444|1631->462|1646->468|1713->513|1818->590|1847->591|1968->684|1997->685|2027->688|2055->689|2126->732|2155->733|2208->758|2237->759|2304->799|2332->800|2363->804|2391->805|2460->846|2489->847|2543->874|2571->875|2639->915|2668->916|2722->943|2750->944|2783->950|2811->951|2993->1097|3008->1103|3060->1133|3653->1691|3694->1716|3733->1717|3880->1828|3908->1834|4137->2026|4166->2032|4247->2082
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|41->13|41->13|44->16|44->16|45->17|45->17|47->19|47->19|48->20|48->20|50->22|50->22|51->23|51->23|54->26|54->26|56->28|56->28|58->30|58->30|60->32|60->32|62->34|62->34|69->41|69->41|69->41|84->56|84->56|84->56|86->58|86->58|88->60|88->60|91->63
                    -- GENERATED --
                */
            