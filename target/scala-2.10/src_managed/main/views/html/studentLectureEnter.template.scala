
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
		<img src=""""),_display_(Seq[Any](/*14.14*/routes/*14.20*/.Assets.at("images/logonew.png"))),format.raw/*14.52*/("""" height="50px"
			width="150px" alt="Live Feed">
	</div>
	<header class="navbar navbar-static-top bs-docs-nav" id="top"
		role="banner">
		<div class="btn-group" style="float: right;">
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
		<div class="form-group">
			<label class="col-sm-2 control-label">Course Name</label>
			<div class="col-sm-4">
				<input type=text class="form-control" id="courseNameId" name="courseName" placeholder="CourseName">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">Lecture Number</label>
			<div class="col-sm-2">
				<input type=text class="form-control" id="lectureId" name="lectureNumber"
					placeholder="LectureUniqeNumber">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-default">Enter</button>
			</div>
			
		</div>
		"""),_display_(Seq[Any](/*50.4*/if(flag == 0 )/*50.18*/{_display_(Seq[Any](format.raw/*50.19*/("""
		<div class="row">
			<div class="col-md-4 col-md-offset-2">
						<div class="error message" id="notify_error">
						         <p class="bg-danger"> <i><b>Please enter correct lecture id and course name!</b></i></p>
						</div>
			</div>
			</div>			
					""")))})),format.raw/*58.7*/("""
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
                    DATE: Tue Jun 24 18:54:19 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/studentLectureEnter.scala.html
                    HASH: 2ef52d45225b42e3902b5d3fe52d9d6075310755
                    MATRIX: 789->1|915->17|942->35|1053->111|1067->117|1122->151|1210->204|1224->210|1277->242|1365->295|1379->301|1432->333|1516->382|1530->388|1605->441|1658->458|1673->464|1740->509|1912->645|1927->651|1981->683|3363->2030|3386->2044|3425->2045|3717->2306
                    LINES: 26->1|30->1|30->2|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|42->14|42->14|42->14|78->50|78->50|78->50|86->58
                    -- GENERATED --
                */
            