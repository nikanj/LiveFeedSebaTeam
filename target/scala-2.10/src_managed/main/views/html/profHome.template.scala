
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

Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>

<html>
    <head>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*6.54*/routes/*6.60*/.Assets.at("stylesheets/main.css"))),format.raw/*6.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*7.59*/routes/*7.65*/.Assets.at("images/favicon.png"))),format.raw/*7.97*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*8.55*/routes/*8.61*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*8.114*/("""">
        <script src=""""),_display_(Seq[Any](/*9.23*/routes/*9.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*9.74*/("""" type="text/javascript"></script>
        
        <script>
        
       
        
        $(document).ready(function() """),format.raw/*15.38*/("""{"""),format.raw/*15.39*/("""
        	var connection = new WebSocket('ws://localhost:9000');

    		connection.onopen = function() """),format.raw/*18.38*/("""{"""),format.raw/*18.39*/("""
    			//
    		"""),format.raw/*20.7*/("""}"""),format.raw/*20.8*/("""
        	
        $("#create").click(function() """),format.raw/*22.39*/("""{"""),format.raw/*22.40*/("""
     		$.post("/addCourse", """),format.raw/*23.29*/("""{"""),format.raw/*23.30*/("""
     				courseName : $("#course").val()
     		"""),format.raw/*25.8*/("""}"""),format.raw/*25.9*/(""")
     	"""),format.raw/*26.7*/("""}"""),format.raw/*26.8*/(""");	
        
    /*    $("#create").click(function()"""),format.raw/*28.40*/("""{"""),format.raw/*28.41*/("""
        	var courseName = $('#course').val();
        
        	 $('#courses')
             .append(
               '<div style="background-color: white; margin: 0 10px 10px 0; padding: 7px; border-radius:5px;">'
                 + courseName
                 + '</div>');
        """),format.raw/*36.9*/("""}"""),format.raw/*36.10*/(""");*/
        
       
        	
        $("#cancel").click(function() """),format.raw/*40.39*/("""{"""),format.raw/*40.40*/("""
			$("#q_area").hide();
		"""),format.raw/*42.3*/("""}"""),format.raw/*42.4*/(""");

		$("#addCourse").click(function() """),format.raw/*44.36*/("""{"""),format.raw/*44.37*/("""
			$("#q_area").show();
		"""),format.raw/*46.3*/("""}"""),format.raw/*46.4*/(""");
		
        """),format.raw/*48.9*/("""}"""),format.raw/*48.10*/(""");
        
		</script>
        
    </head>
    <body>
        <div class="page-header" style="padding-bottom: 0px; margin-top:5px;">
    		<img src=""""),_display_(Seq[Any](/*55.18*/routes/*55.24*/.Assets.at("images/logo.png"))),format.raw/*55.53*/("""" height="50px" width="150px" alt="Live Feed"> 
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
			<a type="button" class="btn btn-primary btn-group-justified" id="addCourse">Create New Course</a>
		</div>
		<br><br><br><br>
		<div id="q_area" class="well col-sm-10" style="margin-left: 100px; width: 500px; display: none;">
			<textarea class="form-control" rows="3" columns="50" id="course" placeholder="Course Name"></textarea>
				<div class="btn-group-justified" style="margin-top: 20px;">
						<a type="button" class="btn btn-success" id="create">Submit</a> 
						<a type="button" class="btn btn-danger" id="cancel">Cancel</a>
				</div>
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
                    DATE: Thu Jun 19 19:01:57 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/profHome.scala.html
                    HASH: 4640316038c4e861e3fd196c852ac25619347d97
                    MATRIX: 858->2|985->94|999->100|1054->134|1151->196|1165->202|1218->234|1311->292|1325->298|1400->351|1461->377|1475->383|1541->428|1699->558|1728->559|1862->665|1891->666|1937->685|1965->686|2044->737|2073->738|2131->768|2160->769|2238->820|2266->821|2302->830|2330->831|2412->885|2441->886|2758->1176|2787->1177|2889->1251|2918->1252|2974->1281|3002->1282|3071->1323|3100->1324|3156->1353|3184->1354|3227->1370|3256->1371|3451->1530|3466->1536|3517->1565
                    LINES: 29->2|33->6|33->6|33->6|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|42->15|42->15|45->18|45->18|47->20|47->20|49->22|49->22|50->23|50->23|52->25|52->25|53->26|53->26|55->28|55->28|63->36|63->36|67->40|67->40|69->42|69->42|71->44|71->44|73->46|73->46|75->48|75->48|82->55|82->55|82->55
                    -- GENERATED --
                */
            