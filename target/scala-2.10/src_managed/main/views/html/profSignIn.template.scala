
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
    		    
    		$("#notify_autopop").notify("""),format.raw/*63.35*/("""{"""),format.raw/*63.36*/("""
    		        delay:500
    		    """),format.raw/*65.11*/("""}"""),format.raw/*65.12*/(""");

    		
    		"""),_display_(Seq[Any](/*68.8*/if(flag == 0)/*68.21*/ {_display_(Seq[Any](format.raw/*68.23*/("""
		        $("#notify_error").notify();
		        return false;
    		""")))})),format.raw/*71.8*/("""
    	     
        	"""),format.raw/*73.10*/("""}"""),format.raw/*73.11*/(""");
        </script>
 </head>
    
    
    <body>
    <div class="page-header" style="padding-bottom: 0px; margin-top:5px;">
    		<img src=""""),_display_(Seq[Any](/*80.18*/routes/*80.24*/.Assets.at("images/logo.png"))),format.raw/*80.53*/("""" height="50px" width="150px" alt="Live Feed"> 
    	</div> 
    	<header class="navbar navbar-static-top bs-docs-nav"  id="top" role="banner">
  			<div class="btn-group" style="margin-left: 75%;">
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
					"""),_display_(Seq[Any](/*109.7*/if(flag == 0 )/*109.21*/{_display_(Seq[Any](format.raw/*109.22*/("""
						<div class="error message" id="notify_error">
						         <h4>Wrong username or password</h4>
						</div>
					""")))})),format.raw/*113.7*/("""
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
                    DATE: Tue Jun 24 10:47:22 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/profSignIn.scala.html
                    HASH: 61d04993e3c1937fb5ee26f74fa39956f40c3837
                    MATRIX: 780->1|906->17|933->35|1062->129|1076->135|1131->169|1227->230|1241->236|1294->268|1387->325|1402->331|1478->384|1571->441|1586->447|1649->487|1718->520|1733->526|1794->565|1906->649|1935->650|2067->754|2096->755|2140->772|2168->773|2253->830|2282->831|2332->853|2361->854|2494->959|2523->960|2665->1074|2694->1075|2737->1090|2766->1091|2962->1259|2991->1260|3055->1296|3084->1297|3124->1309|3153->1310|3191->1320|3220->1321|3254->1327|3283->1328|3339->1356|3368->1357|3411->1372|3440->1373|3504->1409|3533->1410|3573->1422|3602->1423|3637->1430|3666->1431|3700->1437|3729->1438|3785->1466|3814->1467|3848->1474|3876->1475|3953->1524|3982->1525|4050->1565|4079->1566|4159->1618|4188->1619|4257->1660|4286->1661|4377->1724|4406->1725|4518->1809|4547->1810|4625->1860|4654->1861|4764->1943|4793->1944|4873->1996|4902->1997|5014->2081|5043->2082|5119->2130|5148->2131|5211->2166|5240->2167|5293->2185|5315->2198|5355->2200|5457->2271|5506->2292|5535->2293|5714->2436|5729->2442|5780->2471|7314->3969|7338->3983|7378->3984|7533->4107
                    LINES: 26->1|30->1|30->2|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|42->14|42->14|44->16|44->16|46->18|46->18|49->21|49->21|50->22|50->22|54->26|54->26|57->29|57->29|57->29|57->29|62->34|62->34|63->35|63->35|63->35|63->35|63->35|63->35|63->35|63->35|64->36|64->36|65->37|65->37|66->38|66->38|66->38|66->38|66->38|66->38|66->38|66->38|67->39|67->39|68->40|68->40|71->43|71->43|72->44|72->44|74->46|74->46|76->48|76->48|78->50|78->50|81->53|81->53|82->54|82->54|85->57|85->57|86->58|86->58|89->61|89->61|91->63|91->63|93->65|93->65|96->68|96->68|96->68|99->71|101->73|101->73|108->80|108->80|108->80|137->109|137->109|137->109|141->113
                    -- GENERATED --
                */
            