
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
object profSignIn extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
    
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png"))),format.raw/*9.97*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*10.55*/routes/*10.61*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*10.114*/("""">
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*11.74*/("""" type="text/javascript"></script>
        
        
        
        <script>
        $(document).ready(function() """),format.raw/*16.38*/("""{"""),format.raw/*16.39*/("""
        	var connection = new WebSocket('ws://localhost:9000');

    		connection.onopen = function() """),format.raw/*19.38*/("""{"""),format.raw/*19.39*/("""
    			//
    		"""),format.raw/*21.7*/("""}"""),format.raw/*21.8*/("""
        	
               
        $("#signin").click(function() """),format.raw/*24.39*/("""{"""),format.raw/*24.40*/("""
			$.post("/postLogin", """),format.raw/*25.25*/("""{"""),format.raw/*25.26*/("""
				username : $("#username").val(),
				password : $("#password").val()
			"""),format.raw/*28.4*/("""}"""),format.raw/*28.5*/(""")
		"""),format.raw/*29.3*/("""}"""),format.raw/*29.4*/(""");
        
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/(""");
        </script>
    
    
    
    </head>
    
    
    <body>
    <div class="page-header" style="padding-bottom: 0px; margin-top:5px;">
    		<img src=""""),_display_(Seq[Any](/*41.18*/routes/*41.24*/.Assets.at("images/logo.png"))),format.raw/*41.53*/("""" height="50px" width="150px" alt="Live Feed"> 
    	</div> 
    	<header class="navbar navbar-static-top bs-docs-nav"  id="top" role="banner">
  			<div class="btn-group" style="float:right;">
  				<a type="button" class="btn btn-default" href="/home">Home</a>
  				<a type="button" class="btn btn-default" href="/aboutus">About Us</a>
  				<a type="button" class="btn btn-default" href="/contact">Contact</a>
  				<a type="button" class="btn btn-default" href="/feedback">Feedback</a>
  			</div>
		</header>
		
	<form class="form-horizontal" action="/validate" >
	<div class="col-lg-4" style="margin-left:400px;">
	<h1> Please Sign In</h1>
	<div class="input-group" style="margin-top:20px;">
  		<span class="input-group-addon">Username</span>
  		
  		<input type="text" class="form-control" id="username" placeholder="Username">
	</div>
	<div class="input-group" style="margin-top:20px;">
  		<span class="input-group-addon">Password</span>
  		<input type="password" class="form-control" id="password" placeholder="Password">
	</div>
	<div style="margin-top:20px;"><input type="checkbox"> Remember Me  </div>
	<div class="btn-group-justified" style="margin-top:20px;">
		<a class="btn btn-success" type="submit" id="signin">  Sign In  </a>
		<a class="btn btn-default" type="button" href="/home">  Cancel  </a>
	</div>
</div>
</form>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    </body>
</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jun 19 18:39:10 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/profSignIn.scala.html
                    HASH: 7cf29d10391545e336ebcef9717074c68712f8a8
                    MATRIX: 860->2|988->95|1002->101|1057->135|1153->196|1167->202|1220->234|1313->291|1328->297|1404->350|1465->375|1480->381|1547->426|1691->542|1720->543|1851->646|1880->647|1924->664|1952->665|2045->730|2074->731|2127->756|2156->757|2260->834|2288->835|2319->839|2347->840|2394->860|2423->861|2620->1022|2635->1028|2686->1057
                    LINES: 29->3|34->8|34->8|34->8|35->9|35->9|35->9|36->10|36->10|36->10|37->11|37->11|37->11|42->16|42->16|45->19|45->19|47->21|47->21|50->24|50->24|51->25|51->25|54->28|54->28|55->29|55->29|57->31|57->31|67->41|67->41|67->41
                    -- GENERATED --
                */
            