
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
object studentLectureEnter extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Integer,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(flag : Integer):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.18*/(""" """),format.raw/*2.1*/("""<!DOCTYPE html>

<html>
<head>
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*6.46*/routes/*6.52*/.Assets.at("stylesheets/main.css"))),format.raw/*6.86*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*7.51*/routes/*7.57*/.Assets.at("images/favicon.png"))),format.raw/*7.89*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*8.51*/routes/*8.57*/.Assets.at("images/logonew.png"))),format.raw/*8.89*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*9.47*/routes/*9.53*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*9.106*/("""">
<script src=""""),_display_(Seq[Any](/*10.15*/routes/*10.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*10.66*/("""" type="text/javascript"></script>
</head>
<body>
	<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
		<img src=""""),_display_(Seq[Any](/*14.14*/routes/*14.20*/.Assets.at("images/logonew.png"))),format.raw/*14.52*/("""" height="60px"
			width="130px" alt="Live Feed">
	</div>
	<header class="navbar navbar-static-top bs-docs-nav" id="top"
		role="banner">
		<div class="btn-group" style="margin-left: 75%;">
			<a type="button" class="btn btn-default" href="/home">Home</a> <a
				type="button" class="btn btn-default" href="/aboutus">About Us</a> <a
				type="button" class="btn btn-default" href="/contact">Contact</a> <a
				type="button" class="btn btn-default" href="/feedback">Feedback</a>
		</div>
	</header>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<div class="container">
	<form  method="get" action="/studentValidate" class="form-horizontal" role="form">
	<div id="q_area" class="col-sm-4" style="margin-left: 350px;">
		<h1>Please Log In</h1>
		
		<div class="input-group" style="margin-top: 20px;">
			<span class="input-group-addon">Course Name</span> 
			<input type="text" class="form-control" id="courseNameId" placeholder="CourseName" style="width: 280px" name="courseName">
		</div>
			
		<div class="input-group" style="margin-top: 20px;">
			<span class="input-group-addon" >Lecture Number</span> 
			<input type="text" class="form-control" id="lectureId" placeholder="LectureUniqeNumber" style="width: 265px" name="lectureNumber">
		</div>
		
		<div class="btn-group-justified" style="margin-top: 20px;">
			<button type="submit" class="btn btn-success" style="width: 212px">Enter</button>
		</div>				
	</div>
		"""),_display_(Seq[Any](/*48.4*/if(flag == 0)/*48.17*/{_display_(Seq[Any](format.raw/*48.18*/("""	
			<div class="row col-md-4 col-md-offset-2 error message" id="notify_error" style="padding: 5px 0 0 10px; color: #ff0000;">
				
						<p>
							<i><b> Please enter correct lecture id and course name!</b></i>
						</p>
			</div>		
					""")))})),format.raw/*55.7*/("""
	
	</form>
	</div>
</body>
</html>"""))}
    }
    
    def render(flag:Integer): play.api.templates.HtmlFormat.Appendable = apply(flag)
    
    def f:((Integer) => play.api.templates.HtmlFormat.Appendable) = (flag) => apply(flag)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jun 28 11:38:26 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Final/livefeed/app/views/studentLectureEnter.scala.html
                    HASH: c39654a49dacb42cf565b43793ec9c6508c43e9c
                    MATRIX: 789->1|915->17|942->35|1053->111|1067->117|1122->151|1210->204|1224->210|1277->242|1365->295|1379->301|1432->333|1516->382|1530->388|1605->441|1658->458|1673->464|1740->509|1912->645|1927->651|1981->683|3486->2153|3508->2166|3547->2167|3820->2409
                    LINES: 26->1|30->1|30->2|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|42->14|42->14|42->14|76->48|76->48|76->48|83->55
                    -- GENERATED --
                */
            