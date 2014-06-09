
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
                    DATE: Mon Jun 09 11:36:35 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Play app's/LiveFeed/app/views/profMainPage.scala.html
                    HASH: 74a2e1716fb75e4f75496fd625db02dffe2a8173
                    MATRIX: 862->2|994->99|1008->105|1061->137|1154->195|1168->201|1243->254|1304->280|1318->286|1384->331|1498->417|1527->418|1591->454|1620->455|1680->488|1708->489|1777->530|1806->531|1866->564|1894->565|1928->572|1956->573|2129->710|2144->716|2195->745
                    LINES: 29->2|33->6|33->6|33->6|34->7|34->7|34->7|35->8|35->8|35->8|37->10|37->10|38->11|38->11|40->13|40->13|42->15|42->15|44->17|44->17|45->18|45->18|50->23|50->23|50->23
                    -- GENERATED --
                */
            