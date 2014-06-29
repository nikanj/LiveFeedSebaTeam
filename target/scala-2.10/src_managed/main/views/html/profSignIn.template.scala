
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

<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.46*/routes/*8.52*/.Assets.at("stylesheets/main.css"))),format.raw/*8.86*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.51*/routes/*9.57*/.Assets.at("images/favicon.png"))),format.raw/*9.89*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.51*/routes/*10.57*/.Assets.at("images/logonew.png"))),format.raw/*10.89*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*11.47*/routes/*11.53*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*11.106*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*12.47*/routes/*12.53*/.Assets.at("stylesheets/warningmsg.css"))),format.raw/*12.93*/("""">
<script src=""""),_display_(Seq[Any](/*13.15*/routes/*13.21*/.Assets.at("javascripts/warningmsg.js"))),format.raw/*13.60*/("""" type="text/javascript"></script>
<script>
        	$(document).ready(function() """),format.raw/*15.39*/("""{"""),format.raw/*15.40*/("""
        		var connection = new WebSocket('ws://localhost:9000');
    			connection.onopen = function() """),format.raw/*17.39*/("""{"""),format.raw/*17.40*/("""
    			//
    		"""),format.raw/*19.7*/("""}"""),format.raw/*19.8*/("""

    		
    		$.fn.notify = function(settings_overwrite)"""),format.raw/*22.49*/("""{"""),format.raw/*22.50*/("""
    		    settings = """),format.raw/*23.22*/("""{"""),format.raw/*23.23*/("""
    		        placement:"top",
    		        default_class: ".message",
    		        delay:0
    		    """),format.raw/*27.11*/("""}"""),format.raw/*27.12*/(""";
    		    $.extend(settings, settings_overwrite);
    		    
    		    $(settings.default_class).each(function()"""),format.raw/*30.52*/("""{"""),format.raw/*30.53*/("""$(this).hide();"""),format.raw/*30.68*/("""}"""),format.raw/*30.69*/(""");
    		    
    		    $(this).show().css(settings.placement, -$(this).outerHeight());
    		    obj = $(this);
    		    
    		    if(settings.placement == "bottom")"""),format.raw/*35.45*/("""{"""),format.raw/*35.46*/("""
    		        setTimeout(function()"""),format.raw/*36.36*/("""{"""),format.raw/*36.37*/("""obj.animate("""),format.raw/*36.49*/("""{"""),format.raw/*36.50*/("""bottom:"0""""),format.raw/*36.60*/("""}"""),format.raw/*36.61*/(""", 500)"""),format.raw/*36.67*/("""}"""),format.raw/*36.68*/(""",settings.delay);
    		    """),format.raw/*37.11*/("""}"""),format.raw/*37.12*/("""
    		    else"""),format.raw/*38.15*/("""{"""),format.raw/*38.16*/("""
    		        setTimeout(function()"""),format.raw/*39.36*/("""{"""),format.raw/*39.37*/("""obj.animate("""),format.raw/*39.49*/("""{"""),format.raw/*39.50*/("""top:"0""""),format.raw/*39.57*/("""}"""),format.raw/*39.58*/(""", 500)"""),format.raw/*39.64*/("""}"""),format.raw/*39.65*/(""",settings.delay);
    		    """),format.raw/*40.11*/("""}"""),format.raw/*40.12*/("""
    		"""),format.raw/*41.7*/("""}"""),format.raw/*41.8*/("""


    		    $("a.info_trigger").click(function()"""),format.raw/*44.47*/("""{"""),format.raw/*44.48*/("""
    		        $("#notify_info").notify("""),format.raw/*45.40*/("""{"""),format.raw/*45.41*/("""
    		            placement:"bottom"
    		        """),format.raw/*47.15*/("""}"""),format.raw/*47.16*/(""");
    		        return false;
    		    """),format.raw/*49.11*/("""}"""),format.raw/*49.12*/(""");
    		    
    		    $("a.warning_trigger").click(function()"""),format.raw/*51.50*/("""{"""),format.raw/*51.51*/("""
    		        $("#notify_warning").notify();
    		        return false;
    		    """),format.raw/*54.11*/("""}"""),format.raw/*54.12*/(""");
    		    $("a.error_trigger").click(function()"""),format.raw/*55.48*/("""{"""),format.raw/*55.49*/("""
    		        $("#notify_error").notify();
    		        return false;
    		    """),format.raw/*58.11*/("""}"""),format.raw/*58.12*/(""");
    		    $("a.success_trigger").click(function()"""),format.raw/*59.50*/("""{"""),format.raw/*59.51*/("""
    		        $("#notify_success").notify();
    		        return false;
    		    """),format.raw/*62.11*/("""}"""),format.raw/*62.12*/(""");
    		
    		   
    		$("#notify_autopop").notify("""),format.raw/*65.35*/("""{"""),format.raw/*65.36*/("""
    		        delay:500
    		    """),format.raw/*67.11*/("""}"""),format.raw/*67.12*/(""");

    		
    		"""),_display_(Seq[Any](/*70.8*/if(flag == 0)/*70.21*/ {_display_(Seq[Any](format.raw/*70.23*/("""
		        $("#notify_error").notify();
		        return false;
    		""")))})),format.raw/*73.8*/("""
    	     
        	"""),format.raw/*75.10*/("""}"""),format.raw/*75.11*/(""");
        </script>
</head>


<body>
	<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
		<a href="/home"><img src=""""),_display_(Seq[Any](/*82.30*/routes/*82.36*/.Assets.at("images/logonew.png"))),format.raw/*82.68*/("""" height="70px"
			width="150px" alt="Live Feed"></a>
	</div>
	<header class="navbar navbar-static-top bs-docs-nav" id="top"
		role="banner">
		<div class="btn-group" style="float: right;">
			<a type="button" class="btn btn-default" href="/home">Home</a>
			<a type="button" class="btn btn-default" href="/aboutus">About Us</a>
			<a type="button" class="btn btn-default" href="/contact">Contact</a>
			<a type="button" class="btn btn-default" href="/feedback">Feedback</a>
		</div>
	</header>

	<div>
		<form method="get" action="/validate" class="form-horizontal">
			<div id="q_area" class="col-sm-4" style="margin-left: 350px;">
				<h1>Please Sign In</h1>
				<div class="input-group" style="margin-top: 20px; width: 100%;">
					<span class="input-group-addon">Username</span> <input type="text"
						class="form-control" id="username" placeholder="Username"
						name="p_username">
				</div>
				<div class="input-group" style="margin-top: 20px; width: 100%;">
					<span class="input-group-addon">Password</span> <input
						type="password" class="form-control" id="password"
						placeholder="Password" name="p_password">
				</div>
				<div class="btn-group-justified" style="margin-top: 20px;">
					<button type="submit" class="btn btn-success" style="width: 212px">Sign In</button>
				</div>
				"""),_display_(Seq[Any](/*112.6*/if(flag == 0 )/*112.20*/{_display_(Seq[Any](format.raw/*112.21*/("""
			<div class="error message" id="notify_error" style="margin-top:10px; color: #ff0000; font-weight: bold; font-style: italic;">
				<p>Please enter correct combination of username and password!</p>
			</div>
			""")))})),format.raw/*116.5*/("""
			</div>
			
			
		</form>
		
	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
</body>
</html>"""))}
    }
    
    def render(flag:Integer): play.api.templates.HtmlFormat.Appendable = apply(flag)
    
    def f:((Integer) => play.api.templates.HtmlFormat.Appendable) = (flag) => apply(flag)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 29 11:00:03 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Final/livefeed_Final/livefeed/app/views/profSignIn.scala.html
                    HASH: cca246d5b670634dc897c62c477eef2c98507c4d
                    MATRIX: 780->1|906->17|933->35|1046->113|1060->119|1115->153|1203->206|1217->212|1270->244|1359->297|1374->303|1428->335|1513->384|1528->390|1604->443|1689->492|1704->498|1766->538|1819->555|1834->561|1895->600|2005->682|2034->683|2166->787|2195->788|2239->805|2267->806|2352->863|2381->864|2431->886|2460->887|2593->992|2622->993|2764->1107|2793->1108|2836->1123|2865->1124|3061->1292|3090->1293|3154->1329|3183->1330|3223->1342|3252->1343|3290->1353|3319->1354|3353->1360|3382->1361|3438->1389|3467->1390|3510->1405|3539->1406|3603->1442|3632->1443|3672->1455|3701->1456|3736->1463|3765->1464|3799->1470|3828->1471|3884->1499|3913->1500|3947->1507|3975->1508|4052->1557|4081->1558|4149->1598|4178->1599|4258->1651|4287->1652|4356->1693|4385->1694|4476->1757|4505->1758|4617->1842|4646->1843|4724->1893|4753->1894|4863->1976|4892->1977|4972->2029|5001->2030|5113->2114|5142->2115|5224->2169|5253->2170|5316->2205|5345->2206|5398->2224|5420->2237|5460->2239|5562->2310|5611->2331|5640->2332|5816->2472|5831->2478|5885->2510|7238->3827|7262->3841|7302->3842|7548->4056
                    LINES: 26->1|30->1|30->2|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|43->15|43->15|45->17|45->17|47->19|47->19|50->22|50->22|51->23|51->23|55->27|55->27|58->30|58->30|58->30|58->30|63->35|63->35|64->36|64->36|64->36|64->36|64->36|64->36|64->36|64->36|65->37|65->37|66->38|66->38|67->39|67->39|67->39|67->39|67->39|67->39|67->39|67->39|68->40|68->40|69->41|69->41|72->44|72->44|73->45|73->45|75->47|75->47|77->49|77->49|79->51|79->51|82->54|82->54|83->55|83->55|86->58|86->58|87->59|87->59|90->62|90->62|93->65|93->65|95->67|95->67|98->70|98->70|98->70|101->73|103->75|103->75|110->82|110->82|110->82|140->112|140->112|140->112|144->116
                    -- GENERATED --
                */
            