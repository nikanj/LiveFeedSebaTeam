
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
<script src=""""),_display_(Seq[Any](/*9.15*/routes/*9.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*9.66*/("""" type="text/javascript"></script>

<script>
$(document).ready(function() """),format.raw/*12.30*/("""{"""),format.raw/*12.31*/("""
	var connection = new WebSocket('ws://localhost:9000');

	connection.onopen = function() """),format.raw/*15.33*/("""{"""),format.raw/*15.34*/("""
	"""),format.raw/*16.2*/("""}"""),format.raw/*16.3*/("""
/*
	$("#createCourse").click(function() """),format.raw/*18.38*/("""{"""),format.raw/*18.39*/("""
		$.post("/addCourse", """),format.raw/*19.24*/("""{"""),format.raw/*19.25*/("""
			courseName : $("#course").val()
		"""),format.raw/*21.3*/("""}"""),format.raw/*21.4*/(""")
	"""),format.raw/*22.2*/("""}"""),format.raw/*22.3*/(""");*/


	$("#cancel").click(function() """),format.raw/*25.32*/("""{"""),format.raw/*25.33*/("""
		$("#q_area").hide();
	"""),format.raw/*27.2*/("""}"""),format.raw/*27.3*/(""");

	$("#addCourse").click(function() """),format.raw/*29.35*/("""{"""),format.raw/*29.36*/("""
		$("#q_area").show();
	"""),format.raw/*31.2*/("""}"""),format.raw/*31.3*/(""");

"""),format.raw/*33.1*/("""}"""),format.raw/*33.2*/(""");
</script>

</head>
<body>
	<div id="container">
		<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
			<img src=""""),_display_(Seq[Any](/*40.15*/routes/*40.21*/.Assets.at(" images/logo.png"))),format.raw/*40.51*/("""" height="50px"
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
			"""),_display_(Seq[Any](/*55.5*/for(course <- courseList) yield /*55.30*/{_display_(Seq[Any](format.raw/*55.31*/("""
			<div style="clear: both;">
				<div class="well" style="margin-left: 100px; width: 200px; float: left;">"""),_display_(Seq[Any](/*57.79*/course)),format.raw/*57.85*/("""</div>
				<div class="well" style="margin-left: 100px; width: 200px; float: left;">
				<a type="button" class="btn btn-primary btn-group-justified" id="addLecture" href="/profPage?course="""),_display_(Seq[Any](/*59.106*/course)),format.raw/*59.112*/("""">Add New Lecture</a>
				</div>
			</div>
			""")))})),format.raw/*62.5*/("""
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
</html>
"""))}
    }
    
    def render(courseList:List[String]): play.api.templates.HtmlFormat.Appendable = apply(courseList)
    
    def f:((List[String]) => play.api.templates.HtmlFormat.Appendable) = (courseList) => apply(courseList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 24 10:47:21 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/profHome.scala.html
                    HASH: 6534b7309ace48862e15322d14addc88c82f3593
                    MATRIX: 783->1|903->27|1020->109|1034->115|1089->149|1178->203|1192->209|1245->241|1330->291|1344->297|1419->350|1472->368|1486->374|1552->419|1657->496|1686->497|1807->590|1836->591|1866->594|1894->595|1965->638|1994->639|2047->664|2076->665|2143->705|2171->706|2202->710|2230->711|2299->752|2328->753|2382->780|2410->781|2478->821|2507->822|2561->849|2589->850|2622->856|2650->857|2832->1003|2847->1009|2899->1039|3492->1597|3533->1622|3572->1623|3719->1734|3747->1740|3976->1932|4005->1938|4086->1988
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|40->12|40->12|43->15|43->15|44->16|44->16|46->18|46->18|47->19|47->19|49->21|49->21|50->22|50->22|53->25|53->25|55->27|55->27|57->29|57->29|59->31|59->31|61->33|61->33|68->40|68->40|68->40|83->55|83->55|83->55|85->57|85->57|87->59|87->59|90->62
                    -- GENERATED --
                */
            