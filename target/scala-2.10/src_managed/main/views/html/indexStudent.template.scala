
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
object indexStudent extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>

<title>Test</title>
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*6.46*/routes/*6.52*/.Assets.at("stylesheets/main.css"))),format.raw/*6.86*/("""">
 <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*7.52*/routes/*7.58*/.Assets.at("images/favicon.png"))),format.raw/*7.90*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*8.47*/routes/*8.53*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*8.106*/("""">
<script src=""""),_display_(Seq[Any](/*9.15*/routes/*9.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*9.66*/("""" type="text/javascript"></script>


</head>
<body>
<div class="page-header" style="padding-bottom: 0px; margin-top:5px;">
    		<img src=""""),_display_(Seq[Any](/*15.18*/routes/*15.24*/.Assets.at("images/logo.png"))),format.raw/*15.53*/("""" height="50px" width="150px" alt="Live Feed"> 
    	</div> 
    	<header class="navbar navbar-static-top bs-docs-nav"  id="top" role="banner">
  			<div class="btn-group" style="float:right;">
  				<a type="button" class="btn btn-default" href="/home">Home</a>
  				<a type="button" class="btn btn-default" href="/aboutus">About Us</a>
  				<a type="button" class="btn btn-default" href="/contact">Contact</a>
  				<a type="button" class="btn btn-default" href="/feedback">Feedback</a>
  			</div>
		</header>

<!-- """),_display_(Seq[Any](/*26.7*/routes/*26.13*/.Application.vote())),format.raw/*26.32*/(""" -->
	<div class="container">
		<form id="speed_vote" method="get" action="/vote">
			<div class="col-md-6 col-md-offset-2"">
				<h3>Speed</h3>
				<div class="row">
					<label class="radio-inline"> <input name="radioGroup"
						id="radio1" value="speed_low" type="radio">
						LOW
					</label>
				</div>
				<div class="row">
					<label class="radio-inline"> <input name="radioGroup"
						id="radio2" value="speed_ok" checked="checked" type="radio"> OK
					</label>
				</div>
				<div class="row">
					<label class="radio-inline"> <input name="radioGroup"
						id="radio3" value="speed_fast" type="radio"> FAST
					</label>
				</div>
				<button type="submit" class="btn btn-primary">Vote</button>
			</div>
		</form>

		<form id="voice_vote" method="get" action="/vote">
			<div class="col-md-6 col-md-offset-2"">
				<h3>Voice</h3>
				<div class="row">
					<label class="radio-inline"> <input name="radioGroup"
						id="radio4" value="voice_low" type="radio">
						LOW
					</label>
				</div>
				<div class="row">
					<label class="radio-inline"> <input name="radioGroup"
						id="radio5" value="voice_ok" checked="checked" type="radio"> OK
					</label>
				</div>
				<div class="row">
					<label class="radio-inline"> <input name="radioGroup"
						id="radio6" value="voice_loud" type="radio"> LOUD
					</label>
				</div>
				<button type="submit" class="btn btn-primary">Vote</button>
			</div>
		</form>
		<form id="pause_vote" method="get" action="/vote">
		<div class="col-md-6 col-md-offset-2" style="margin-top: 20px">
			<button name="pause_vote" value="pause" type="submit" class="btn btn-primary">Want a Pause? :D</button>
			</div>
		</form>
		
	</div>


</body>
</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jun 19 13:13:53 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/indexStudent.scala.html
                    HASH: 96d51d5f28db541a863b3985ae3901b5e3b5666f
                    MATRIX: 862->0|993->96|1007->102|1062->136|1151->190|1165->196|1218->228|1302->277|1316->283|1391->336|1443->353|1457->359|1523->404|1699->544|1714->550|1765->579|2322->1101|2337->1107|2378->1126
                    LINES: 29->1|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|43->15|43->15|43->15|54->26|54->26|54->26
                    -- GENERATED --
                */
            