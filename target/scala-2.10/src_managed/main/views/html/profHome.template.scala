
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
object profHome extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>

<html>
    <head>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*5.54*/routes/*5.60*/.Assets.at("stylesheets/main.css"))),format.raw/*5.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*7.55*/routes/*7.61*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*7.114*/("""">
        <script src=""""),_display_(Seq[Any](/*8.23*/routes/*8.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*8.74*/("""" type="text/javascript"></script>
        
        <script>
        
       
        
        $(document).ready(function() """),format.raw/*14.38*/("""{"""),format.raw/*14.39*/("""
        	var connection = new WebSocket('ws://localhost:9000');

    		connection.onopen = function() """),format.raw/*17.38*/("""{"""),format.raw/*17.39*/("""
    			//
    		"""),format.raw/*19.7*/("""}"""),format.raw/*19.8*/("""
        	
        $("#create").click(function() """),format.raw/*21.39*/("""{"""),format.raw/*21.40*/("""
     		$.post("/addCourse", """),format.raw/*22.29*/("""{"""),format.raw/*22.30*/("""
     				courseName : $("#course").val()
     		"""),format.raw/*24.8*/("""}"""),format.raw/*24.9*/(""")
     	"""),format.raw/*25.7*/("""}"""),format.raw/*25.8*/(""");	
        	
        $("#cancel").click(function() """),format.raw/*27.39*/("""{"""),format.raw/*27.40*/("""
			$("#q_area").hide();
		"""),format.raw/*29.3*/("""}"""),format.raw/*29.4*/(""");

		$("#addCourse").click(function() """),format.raw/*31.36*/("""{"""),format.raw/*31.37*/("""
			$("#q_area").show();
		"""),format.raw/*33.3*/("""}"""),format.raw/*33.4*/(""");
		
        """),format.raw/*35.9*/("""}"""),format.raw/*35.10*/(""");
        
		</script>
        
    </head>
    <body>
        <div class="page-header" style="padding-bottom: 0px; margin-top:5px;">
    		<img src=""""),_display_(Seq[Any](/*42.18*/routes/*42.24*/.Assets.at("images/logo.png"))),format.raw/*42.53*/("""" height="50px" width="150px" alt="Live Feed"> 
    	</div> 
    	<header class="navbar navbar-static-top bs-docs-nav"  id="top" role="banner">
  			<div class="btn-group" style="float:right;">
  				<a type="button" class="btn btn-default" href="/home">Home</a>
  				<a type="button" class="btn btn-default" href="/aboutus">About Us</a>
  				<a type="button" class="btn btn-default" href="/contact">Contact</a>
  				<a type="button" class="btn btn-default" href="/feedback">Feedback</a>
  			</div>
		</header>
		
		
		<div class="well col-lg-4" style="margin-left: 100px; width: 200px;">
			<button name="newCourse" id="addCourse" type="submit" class="btn btn-primary">Create New Course</button>
			</div>
			<div id="q_area" class="well col-sm-10" style="margin-left: 100px; display: none;">
		    	<form class="navbar-form pull-left" id="courses">
  						<input type="text" id="course" placeholder="Course Name" class="span2">
  						<button type="submit" class="btn btn-success" id="create">Create</button>
  						<button type="submit" class="btn btn-danger" id="cancel">Cancel</button>
  				</form>
			</div> 
		
		
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
                    DATE: Thu Jun 19 13:13:53 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/profHome.scala.html
                    HASH: 3eb82f0132c1287808c21a1ab65dc7e0d2beaa83
                    MATRIX: 858->0|985->92|999->98|1054->132|1151->194|1165->200|1218->232|1311->290|1325->296|1400->349|1461->375|1475->381|1541->426|1699->556|1728->557|1862->663|1891->664|1937->683|1965->684|2044->735|2073->736|2131->766|2160->767|2238->818|2266->819|2302->828|2330->829|2412->883|2441->884|2497->913|2525->914|2594->955|2623->956|2679->985|2707->986|2750->1002|2779->1003|2974->1162|2989->1168|3040->1197
                    LINES: 29->1|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|45->17|45->17|47->19|47->19|49->21|49->21|50->22|50->22|52->24|52->24|53->25|53->25|55->27|55->27|57->29|57->29|59->31|59->31|61->33|61->33|63->35|63->35|70->42|70->42|70->42
                    -- GENERATED --
                */
            