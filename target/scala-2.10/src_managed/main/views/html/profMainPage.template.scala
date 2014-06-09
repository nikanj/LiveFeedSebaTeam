
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
object profMainPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>

<html>
    <head>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*7.55*/routes/*7.61*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*7.114*/("""">
        <script src=""""),_display_(Seq[Any](/*8.23*/routes/*8.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*8.74*/("""" type="text/javascript"></script>
        <script>
			$(document).ready(function() """),format.raw/*10.33*/("""{"""),format.raw/*10.34*/("""
				$("#cancel").click(function() """),format.raw/*11.35*/("""{"""),format.raw/*11.36*/("""
					$("#q_area").hide();
				"""),format.raw/*13.5*/("""}"""),format.raw/*13.6*/(""");
				
				$("#add").click(function() """),format.raw/*15.32*/("""{"""),format.raw/*15.33*/("""
					$("#q_area").show();
				"""),format.raw/*17.5*/("""}"""),format.raw/*17.6*/(""");
			"""),format.raw/*18.4*/("""}"""),format.raw/*18.5*/(""");
		</script>
    </head>
    <body>
     	<div class="page-header" style="padding-bottom: 0px; margin-top:5px;">
    		<img src=""""),_display_(Seq[Any](/*23.18*/routes/*23.24*/.Assets.at("images/logo.png"))),format.raw/*23.53*/("""" height="50px" width="150px" alt="Live Feed"> 
    	</div> 
    	<header class="navbar navbar-static-top bs-docs-nav"  id="top" role="banner">
  			<div class="btn-group" style="float:right;">
  				<a type="button" class="btn btn-default" href="/home">Home</a>
  				<a type="button" class="btn btn-default" href="/aboutus">About Us</a>
  				<a type="button" class="btn btn-default" href="/contact">Contact</a>
  				<a type="button" class="btn btn-default" href="/feedback">Feedback</a>
  			</div>
		</header>
		
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    </body>
</html>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 09 13:44:05 CEST 2014
                    SOURCE: /home/aalfath/git/LiveFeedSebaTeam/app/views/profMainPage.scala.html
                    HASH: 309913056a2f12788e63b7d0164679c599eef86a
                    MATRIX: 862->1|990->94|1004->100|1057->132|1149->189|1163->195|1238->248|1298->273|1312->279|1378->324|1490->408|1519->409|1582->444|1611->445|1669->476|1697->477|1764->516|1793->517|1851->548|1879->549|1912->555|1940->556|2108->688|2123->694|2174->723
                    LINES: 29->2|33->6|33->6|33->6|34->7|34->7|34->7|35->8|35->8|35->8|37->10|37->10|38->11|38->11|40->13|40->13|42->15|42->15|44->17|44->17|45->18|45->18|50->23|50->23|50->23
                    -- GENERATED --
                */
            