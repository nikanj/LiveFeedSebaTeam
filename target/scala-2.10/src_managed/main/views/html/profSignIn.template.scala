
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
object profSignIn extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Integer,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(flag : Integer):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.18*/(""" """),format.raw/*2.1*/("""
<!DOCTYPE html>

<html>
    <head>
    
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png"))),format.raw/*9.97*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*10.55*/routes/*10.61*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*10.114*/("""">
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*11.74*/("""" type="text/javascript"></script>
		<script>
        	$(document).ready(function() """),format.raw/*13.39*/("""{"""),format.raw/*13.40*/("""
        		var connection = new WebSocket('ws://localhost:9000');

    		connection.onopen = function() """),format.raw/*16.38*/("""{"""),format.raw/*16.39*/("""
    			//
    		"""),format.raw/*18.7*/("""}"""),format.raw/*18.8*/("""
        	"""),format.raw/*19.10*/("""}"""),format.raw/*19.11*/(""");
        </script>
 </head>
    
    
    <body>
    <div class="page-header" style="padding-bottom: 0px; margin-top:5px;">
    		<img src=""""),_display_(Seq[Any](/*26.18*/routes/*26.24*/.Assets.at("images/logo.png"))),format.raw/*26.53*/("""" height="50px" width="150px" alt="Live Feed"> 
    	</div> 
    	<header class="navbar navbar-static-top bs-docs-nav"  id="top" role="banner">
  			<div class="btn-group" style="float:right;">
  				<a type="button" class="btn btn-default" href="/home">Home</a>
  				<a type="button" class="btn btn-default" href="/aboutus">About Us</a>
  				<a type="button" class="btn btn-default" href="/contact">Contact</a>
  				<a type="button" class="btn btn-default" href="/feedback">Feedback</a>
  			</div>
		</header>
	
		<div>
			<form method="get" action="/validate">
				<div id="q_area" class="col-sm-4" style="margin-left: 350px; " >
				<h1>Please Sign In</h1>
					<div class="input-group" style="margin-top:20px;">
			  			<span class="input-group-addon">Username</span>
  			  			<input type="text" class="form-control" id="username" placeholder="Username" name="p_username">
					</div>
					<div class="input-group" style="margin-top:20px;">
  						<span class="input-group-addon">Password</span>
  						<input type="password" class="form-control" id="password" placeholder="Password" name="p_password">
					</div>
					<div style="margin-top:20px;"><input type="checkbox"> Remember Me  </div>
						<div class="btn-group-justified" style="margin-top: 20px;">
							<button type="submit" class="btn btn-success" style="width:212px">Sign In</button>
							<button type="submit" class="btn btn-default" style="width:212px" href="/home">Cancel</button>
						</div>
					</div>
			</form>
			
		</div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    </body>
</html>"""))}
    }
    
    def render(flag:Integer): play.api.templates.HtmlFormat.Appendable = apply(flag)
    
    def f:((Integer) => play.api.templates.HtmlFormat.Appendable) = (flag) => apply(flag)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jun 21 18:09:07 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/profSignIn.scala.html
                    HASH: c1512a3800423bc58959d85fbf9de5ca5eebd90a
                    MATRIX: 780->1|906->17|933->35|1062->129|1076->135|1131->169|1227->230|1241->236|1294->268|1387->325|1402->331|1478->384|1539->409|1554->415|1621->460|1733->544|1762->545|1894->649|1923->650|1967->667|1995->668|2033->678|2062->679|2241->822|2256->828|2307->857
                    LINES: 26->1|30->1|30->2|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|44->16|44->16|46->18|46->18|47->19|47->19|54->26|54->26|54->26
                    -- GENERATED --
                */
            