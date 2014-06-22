
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
object contactUsPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>

<title>Test</title>
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*6.46*/routes/*6.52*/.Assets.at("stylesheets/main.css"))),format.raw/*6.86*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*7.51*/routes/*7.57*/.Assets.at("images/favicon.png"))),format.raw/*7.89*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*8.51*/routes/*8.57*/.Assets.at("images/logonew.png"))),format.raw/*8.89*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*9.47*/routes/*9.53*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*9.106*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*10.47*/routes/*10.53*/.Assets.at("stylesheets/bootstrap/css/social-buttons.css"))),format.raw/*10.111*/("""">
<script src=""""),_display_(Seq[Any](/*11.15*/routes/*11.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*11.66*/("""" type="text/javascript"></script>


</head>
<body>
	<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
		<img src=""""),_display_(Seq[Any](/*17.14*/routes/*17.20*/.Assets.at("images/logonew.png"))),format.raw/*17.52*/("""" height="60px"
			width="130px" alt="Live Feed">
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

	<div class="container">

		<div class="row">
			<div class="col-xs-6">
				<iframe
					src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2656.115247523726!2d11.669299229638678!3d48.26215664893155!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x479e72edc2fcfaad%3A0x4a09e085aed7b413!2sBoltzmannstra%C3%9Fe+3!5e0!3m2!1sen!2sde!4v1403183301319"
					width="500" height="350" frameborder="0" style="border: 0"></iframe>
			</div>
			<div class="col-xs-6 col-md-4">
				<h3>Contact Information</h3>
				<p>
					<b>Office hours: </b>Monday - Friday, 9-17h
				</p>
				<p>
					<b>Mobile: </b>+49 5222 445
				</p>
				<p>
					<b>Email: </b>livefeed(at)gmail.com
				</p>
				<p>
					<b>Fax: </b>685 846 777
				</p>
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
                    DATE: Sun Jun 22 17:34:14 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/contactUsPage.scala.html
                    HASH: 963cf0bf4508bbb9b67a60c76a0d82283ec5f50a
                    MATRIX: 863->0|999->101|1013->107|1068->141|1157->195|1171->201|1224->233|1313->287|1327->293|1380->325|1465->375|1479->381|1554->434|1640->484|1655->490|1736->548|1790->566|1805->572|1872->617|2052->761|2067->767|2121->799
                    LINES: 29->1|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|45->17|45->17|45->17
                    -- GENERATED --
                */
            