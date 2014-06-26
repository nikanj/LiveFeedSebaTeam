
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
object feedbackPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>

<title>Test</title>
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*6.46*/routes/*6.52*/.Assets.at("stylesheets/main.css"))),format.raw/*6.86*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*7.51*/routes/*7.57*/.Assets.at("images/logonew.png"))),format.raw/*7.89*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*8.51*/routes/*8.57*/.Assets.at("images/favicon.png"))),format.raw/*8.89*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*9.47*/routes/*9.53*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*9.106*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*10.47*/routes/*10.53*/.Assets.at("stylesheets/bootstrap/css/social-buttons.css"))),format.raw/*10.111*/("""">
<script src=""""),_display_(Seq[Any](/*11.15*/routes/*11.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*11.66*/("""" type="text/javascript"></script>


</head>
<body>
	<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
		<img src=""""),_display_(Seq[Any](/*17.14*/routes/*17.20*/.Assets.at("images/logonew.png"))),format.raw/*17.52*/("""" height="60px"
			width="120px" alt="Live Feed">
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

	<div class="container">

		<div class="row">
			<div class="col-xs-9">
				<h3>Evaluate our Service!</h3>
				<div class="btn-group">
					<button type="button" class="btn btn-success">
						<b>VeryGood</b>
					</button>

					<button type="button" class="btn btn-info">
						<b>Good</b>
					</button>

					<button type="button" class="btn btn-warning">
						<b>Bad</b>
					</button>

					<button type="button" class="btn btn-danger">
						<b>VeryBad</b>
					</button>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-6">
				<h4>Leave a comment...</h4>
				<form role="form">
					<p>
						<textarea class="form-control" rows="5"></textarea>
					</p>
					<button type="submit" class="btn btn-default">Send</button>
				</form>
			</div>
		</div>

	</div>

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
                    DATE: Thu Jun 26 15:15:37 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Final/livefeed/app/views/feedbackPage.scala.html
                    HASH: 47766f454a78524c5c2dab4834fcb0ed9cd556fe
                    MATRIX: 862->0|998->101|1012->107|1067->141|1156->195|1170->201|1223->233|1312->287|1326->293|1379->325|1464->375|1478->381|1553->434|1639->484|1654->490|1735->548|1789->566|1804->572|1871->617|2051->761|2066->767|2120->799
                    LINES: 29->1|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|45->17|45->17|45->17
                    -- GENERATED --
                */
            