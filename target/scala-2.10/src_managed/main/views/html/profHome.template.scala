
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

	/*	$("#create").click(function() """),format.raw/*19.35*/("""{"""),format.raw/*19.36*/("""
			$.post("/addCourse", """),format.raw/*20.25*/("""{"""),format.raw/*20.26*/("""
				courseName : $("#course").val()
			"""),format.raw/*22.4*/("""}"""),format.raw/*22.5*/(""")
		"""),format.raw/*23.3*/("""}"""),format.raw/*23.4*/(""");*/

		$("#cancel").click(function() """),format.raw/*25.33*/("""{"""),format.raw/*25.34*/("""
			$("#q_area").hide();
		"""),format.raw/*27.3*/("""}"""),format.raw/*27.4*/(""");

		$("#addCourse").click(function() """),format.raw/*29.36*/("""{"""),format.raw/*29.37*/("""
			$("#q_area").show();
		"""),format.raw/*31.3*/("""}"""),format.raw/*31.4*/(""");

	"""),format.raw/*33.2*/("""}"""),format.raw/*33.3*/(""");
</script>

</head>
<body>
	<div id="container">
		<div class="page-header">
			<a href="/home"><img src=""""),_display_(Seq[Any](/*40.31*/routes/*40.37*/.Assets.at("images/logonew.png"))),format.raw/*40.69*/("""" height="60px"
				width="130px" alt="Live Feed"></a>
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
				"""),_display_(Seq[Any](/*55.6*/for(course <- courseList) yield /*55.31*/{_display_(Seq[Any](format.raw/*55.32*/("""
				<div id="course">
					<div class="well" id="course-name">"""),_display_(Seq[Any](/*57.42*/course)),format.raw/*57.48*/("""</div>
					<div id="add-lecture-button-container">
						<a type="button" class="btn btn-primary" id="addLecture"
							href="/profPage?course="""),_display_(Seq[Any](/*60.32*/course)),format.raw/*60.38*/("""">Add New Lecture</a>
					</div>
					<div class="clear" style="clear: both;"></div>
				</div>
				""")))})),format.raw/*64.6*/("""
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
                    DATE: Sat Jun 28 11:38:26 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Final/livefeed/app/views/profHome.scala.html
                    HASH: 3640bedc3f559e63059f859b636f539d12f8ad23
                    MATRIX: 783->1|903->27|1020->109|1034->115|1089->149|1178->203|1192->209|1245->241|1330->291|1344->297|1419->350|1504->400|1518->406|1577->444|1631->462|1646->468|1713->513|1819->591|1848->592|1971->687|2000->688|2031->692|2059->693|2125->731|2154->732|2208->758|2237->759|2306->801|2334->802|2366->807|2394->808|2462->848|2491->849|2547->878|2575->879|2644->920|2673->921|2729->950|2757->951|2791->958|2819->959|2971->1075|2986->1081|3040->1113|3634->1672|3675->1697|3714->1698|3816->1764|3844->1770|4029->1919|4057->1925|4194->2031
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|41->13|41->13|44->16|44->16|45->17|45->17|47->19|47->19|48->20|48->20|50->22|50->22|51->23|51->23|53->25|53->25|55->27|55->27|57->29|57->29|59->31|59->31|61->33|61->33|68->40|68->40|68->40|83->55|83->55|83->55|85->57|85->57|88->60|88->60|92->64
                    -- GENERATED --
                */
            