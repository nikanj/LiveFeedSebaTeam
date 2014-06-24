
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
        <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*11.55*/routes/*11.61*/.Assets.at("stylesheets/warningmsg.css"))),format.raw/*11.101*/("""">        
        <script src=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("javascripts/warningmsg.js"))),format.raw/*12.68*/("""" type="text/javascript"></script>
		<script>
        	$(document).ready(function() """),format.raw/*14.39*/("""{"""),format.raw/*14.40*/("""
        		var connection = new WebSocket('ws://localhost:9000');
    			connection.onopen = function() """),format.raw/*16.39*/("""{"""),format.raw/*16.40*/("""
    			//
    		"""),format.raw/*18.7*/("""}"""),format.raw/*18.8*/("""

    		/*
    		$.fn.notify = function(settings_overwrite)"""),format.raw/*21.49*/("""{"""),format.raw/*21.50*/("""
    		    settings = """),format.raw/*22.22*/("""{"""),format.raw/*22.23*/("""
    		        placement:"top",
    		        default_class: ".message",
    		        delay:0
    		    """),format.raw/*26.11*/("""}"""),format.raw/*26.12*/(""";
    		    $.extend(settings, settings_overwrite);
    		    
    		    $(settings.default_class).each(function()"""),format.raw/*29.52*/("""{"""),format.raw/*29.53*/("""$(this).hide();"""),format.raw/*29.68*/("""}"""),format.raw/*29.69*/(""");
    		    
    		    $(this).show().css(settings.placement, -$(this).outerHeight());
    		    obj = $(this);
    		    
    		    if(settings.placement == "bottom")"""),format.raw/*34.45*/("""{"""),format.raw/*34.46*/("""
    		        setTimeout(function()"""),format.raw/*35.36*/("""{"""),format.raw/*35.37*/("""obj.animate("""),format.raw/*35.49*/("""{"""),format.raw/*35.50*/("""bottom:"0""""),format.raw/*35.60*/("""}"""),format.raw/*35.61*/(""", 500)"""),format.raw/*35.67*/("""}"""),format.raw/*35.68*/(""",settings.delay);
    		    """),format.raw/*36.11*/("""}"""),format.raw/*36.12*/("""
    		    else"""),format.raw/*37.15*/("""{"""),format.raw/*37.16*/("""
    		        setTimeout(function()"""),format.raw/*38.36*/("""{"""),format.raw/*38.37*/("""obj.animate("""),format.raw/*38.49*/("""{"""),format.raw/*38.50*/("""top:"0""""),format.raw/*38.57*/("""}"""),format.raw/*38.58*/(""", 500)"""),format.raw/*38.64*/("""}"""),format.raw/*38.65*/(""",settings.delay);
    		    """),format.raw/*39.11*/("""}"""),format.raw/*39.12*/("""
    		"""),format.raw/*40.7*/("""}"""),format.raw/*40.8*/("""


    		    $("a.info_trigger").click(function()"""),format.raw/*43.47*/("""{"""),format.raw/*43.48*/("""
    		        $("#notify_info").notify("""),format.raw/*44.40*/("""{"""),format.raw/*44.41*/("""
    		            placement:"bottom"
    		        """),format.raw/*46.15*/("""}"""),format.raw/*46.16*/(""");
    		        return false;
    		    """),format.raw/*48.11*/("""}"""),format.raw/*48.12*/(""");
    		    
    		    $("a.warning_trigger").click(function()"""),format.raw/*50.50*/("""{"""),format.raw/*50.51*/("""
    		        $("#notify_warning").notify();
    		        return false;
    		    """),format.raw/*53.11*/("""}"""),format.raw/*53.12*/(""");
    		    $("a.error_trigger").click(function()"""),format.raw/*54.48*/("""{"""),format.raw/*54.49*/("""
    		        $("#notify_error").notify();
    		        return false;
    		    """),format.raw/*57.11*/("""}"""),format.raw/*57.12*/(""");
    		    $("a.success_trigger").click(function()"""),format.raw/*58.50*/("""{"""),format.raw/*58.51*/("""
    		        $("#notify_success").notify();
    		        return false;
    		    """),format.raw/*61.11*/("""}"""),format.raw/*61.12*/(""");
    		
    		    
    		$("#notify_autopop").notify("""),format.raw/*64.35*/("""{"""),format.raw/*64.36*/("""
    		        delay:500
    		    """),format.raw/*66.11*/("""}"""),format.raw/*66.12*/(""");

    		
    		"""),_display_(Seq[Any](/*69.8*/if(flag == 0)/*69.21*/ {_display_(Seq[Any](format.raw/*69.23*/("""
		        $("#notify_error").notify();
		        return false;
    		""")))})),format.raw/*72.8*/("""
    	     
        	"""),format.raw/*74.10*/("""}"""),format.raw/*74.11*/("""); */
        </script>
 </head>
    
    
    <body>
    <div class="page-header" style="padding-bottom: 0px; margin-top:5px;">
    		<img src=""""),_display_(Seq[Any](/*81.18*/routes/*81.24*/.Assets.at("images/logo.png"))),format.raw/*81.53*/("""" height="50px" width="150px" alt="Live Feed"> 
    	</div> 
    	<header class="navbar navbar-static-top bs-docs-nav"  id="top" role="banner">
  			<div class="btn-group" style="margin-left: 75%;">
  				<a type="button" class="btn btn-default" href="/home">Home</a>
  				<a type="button" class="btn btn-default" href="/aboutus">About Us</a>
  				<a type="button" class="btn btn-default" href="/contact">Contact</a>
  				<a type="button" class="btn btn-default" href="/feedback">Feedback</a>
  			</div>
		</header>
	<script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
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
					"""),_display_(Seq[Any](/*110.7*/if(flag == 0 )/*110.21*/{_display_(Seq[Any](format.raw/*110.22*/("""
						<div class="row">
							<div class="col-md-4 col-md-offset-2">
								<div class="error message" id="notify_error">
						         	<p class="bg-danger"> <i><b>Please enter correct User Name OR Password!</b></i></p>
								</div>
							</div>
						</div>		
					""")))})),format.raw/*118.7*/("""
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
                    DATE: Tue Jun 24 15:51:15 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/profSignIn.scala.html
                    HASH: 53b42990c3b21d3b632b3d1e597bedb906b3f562
                    MATRIX: 780->1|906->17|933->35|1062->129|1076->135|1131->169|1227->230|1241->236|1294->268|1387->325|1402->331|1478->384|1571->441|1586->447|1649->487|1718->520|1733->526|1794->565|1906->649|1935->650|2067->754|2096->755|2140->772|2168->773|2255->832|2284->833|2334->855|2363->856|2496->961|2525->962|2667->1076|2696->1077|2739->1092|2768->1093|2964->1261|2993->1262|3057->1298|3086->1299|3126->1311|3155->1312|3193->1322|3222->1323|3256->1329|3285->1330|3341->1358|3370->1359|3413->1374|3442->1375|3506->1411|3535->1412|3575->1424|3604->1425|3639->1432|3668->1433|3702->1439|3731->1440|3787->1468|3816->1469|3850->1476|3878->1477|3955->1526|3984->1527|4052->1567|4081->1568|4161->1620|4190->1621|4259->1662|4288->1663|4379->1726|4408->1727|4520->1811|4549->1812|4627->1862|4656->1863|4766->1945|4795->1946|4875->1998|4904->1999|5016->2083|5045->2084|5128->2139|5157->2140|5220->2175|5249->2176|5302->2194|5324->2207|5364->2209|5466->2280|5515->2301|5544->2302|5726->2448|5741->2454|5792->2483|7416->4071|7440->4085|7480->4086|7787->4361
                    LINES: 26->1|30->1|30->2|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|42->14|42->14|44->16|44->16|46->18|46->18|49->21|49->21|50->22|50->22|54->26|54->26|57->29|57->29|57->29|57->29|62->34|62->34|63->35|63->35|63->35|63->35|63->35|63->35|63->35|63->35|64->36|64->36|65->37|65->37|66->38|66->38|66->38|66->38|66->38|66->38|66->38|66->38|67->39|67->39|68->40|68->40|71->43|71->43|72->44|72->44|74->46|74->46|76->48|76->48|78->50|78->50|81->53|81->53|82->54|82->54|85->57|85->57|86->58|86->58|89->61|89->61|92->64|92->64|94->66|94->66|97->69|97->69|97->69|100->72|102->74|102->74|109->81|109->81|109->81|138->110|138->110|138->110|146->118
                    -- GENERATED --
                */
            