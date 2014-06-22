
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
	$(document).ready(function() """),format.raw/*12.31*/("""{"""),format.raw/*12.32*/("""
		var connection = new WebSocket('ws://localhost:9000');

		connection.onopen = function() """),format.raw/*15.34*/("""{"""),format.raw/*15.35*/("""
		"""),format.raw/*16.3*/("""}"""),format.raw/*16.4*/("""

		$("#create").click(function() """),format.raw/*18.33*/("""{"""),format.raw/*18.34*/("""
			$.post("/addCourse", """),format.raw/*19.25*/("""{"""),format.raw/*19.26*/("""
				courseName : $("#course").val()
			"""),format.raw/*21.4*/("""}"""),format.raw/*21.5*/(""")
		"""),format.raw/*22.3*/("""}"""),format.raw/*22.4*/(""");

		/*    $("#create").click(function()"""),format.raw/*24.38*/("""{"""),format.raw/*24.39*/("""
		    	var courseName = $('#course').val();
		    
		    	 $('#courses')
		         .append(
		           '<div style="background-color: white; margin: 0 10px 10px 0; padding: 7px; border-radius:5px;">'
		             + courseName
		             + '</div>');
		    """),format.raw/*32.7*/("""}"""),format.raw/*32.8*/(""");*/

		$("#cancel").click(function() """),format.raw/*34.33*/("""{"""),format.raw/*34.34*/("""
			$("#q_area").hide();
		"""),format.raw/*36.3*/("""}"""),format.raw/*36.4*/(""");

		$("#addCourse").click(function() """),format.raw/*38.36*/("""{"""),format.raw/*38.37*/("""
			$("#q_area").show();
		"""),format.raw/*40.3*/("""}"""),format.raw/*40.4*/(""");

	"""),format.raw/*42.2*/("""}"""),format.raw/*42.3*/(""");
</script>

</head>
<body>
	<div id="container">
		<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
			<img src=""""),_display_(Seq[Any](/*49.15*/routes/*49.21*/.Assets.at(" images/logo.png"))),format.raw/*49.51*/("""" height="50px"
				width="150px" alt="Live Feed">
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

		<div id="courses" >
			"""),_display_(Seq[Any](/*63.5*/for(course <- courseList) yield /*63.30*/{_display_(Seq[Any](format.raw/*63.31*/("""
			<div style="clear: both;">
				
				<div class="well" style="margin-left: 100px; width: 200px; float: left;">"""),_display_(Seq[Any](/*66.79*/course)),format.raw/*66.85*/("""</div>
				<div class="well" style="margin-left: 100px; width: 200px; float: left;">
					<a type="button" class="btn btn-primary btn-group-justified"
					id="addCourse">Add New Lecture</a>
				</div>
				
			</div>
			""")))})),format.raw/*73.5*/("""
		</div>

		
		

		<div class="well col-lg-4" style="margin-left: 100px; width: 200px;">
			<a type="button" class="btn btn-primary btn-group-justified"
				id="addCourse">Create New Course</a>
		</div>
		<br>
		<br>
		<br>
		<br>
		<div id="q_area" class="well col-sm-10"
			style="margin-left: 100px; width: 500px; display: none;">
			<textarea class="form-control" rows="3" columns="50" id="course"
				placeholder="Course Name"></textarea>
			<div class="btn-group-justified" style="margin-top: 20px;">
				<a type="button" class="btn btn-success" id="create">Submit</a> <a
					type="button" class="btn btn-danger" id="cancel">Cancel</a>
			</div>
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
                    DATE: Sun Jun 22 13:04:30 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/profHome.scala.html
                    HASH: 855a5705aa3812c71baf63a6a300621ca9aac9bc
                    MATRIX: 783->1|903->27|1020->109|1034->115|1089->149|1178->203|1192->209|1245->241|1330->291|1344->297|1419->350|1472->368|1486->374|1552->419|1658->497|1687->498|1810->593|1839->594|1870->598|1898->599|1962->635|1991->636|2045->662|2074->663|2143->705|2171->706|2203->711|2231->712|2302->755|2331->756|2632->1030|2660->1031|2728->1071|2757->1072|2813->1101|2841->1102|2910->1143|2939->1144|2995->1173|3023->1174|3057->1181|3085->1182|3267->1328|3282->1334|3334->1364|3913->1908|3954->1933|3993->1934|4146->2051|4174->2057|4433->2285
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|40->12|40->12|43->15|43->15|44->16|44->16|46->18|46->18|47->19|47->19|49->21|49->21|50->22|50->22|52->24|52->24|60->32|60->32|62->34|62->34|64->36|64->36|66->38|66->38|68->40|68->40|70->42|70->42|77->49|77->49|77->49|91->63|91->63|91->63|94->66|94->66|101->73
                    -- GENERATED --
                */
            