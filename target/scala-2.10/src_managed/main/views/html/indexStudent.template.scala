
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
object indexStudent extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.51*/routes/*9.57*/.Assets.at("images/voteImg.png"))),format.raw/*9.89*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*10.47*/routes/*10.53*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*10.106*/("""">
<script src=""""),_display_(Seq[Any](/*11.15*/routes/*11.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*11.66*/("""" type="text/javascript"></script>

<script>

function displayQuestion(question) """),format.raw/*15.36*/("""{"""),format.raw/*15.37*/("""
	$('#posted_question')
			.replaceWith(
					'<div style="background-color: white; margin: 0 10px 10px 0; padding: 7px; border-radius:5px;">'
							+ question + '</div>');
	$(".test").show();
"""),format.raw/*21.1*/("""}"""),format.raw/*21.2*/("""

	 $(document).ready(function() """),format.raw/*23.32*/("""{"""),format.raw/*23.33*/("""
		 var connection = new WebSocket('ws://localhost:9000');

			connection.onopen = function() """),format.raw/*26.35*/("""{"""),format.raw/*26.36*/("""
				//
			"""),format.raw/*28.4*/("""}"""),format.raw/*28.5*/("""
			
			connection.onmessage = function(e) """),format.raw/*30.39*/("""{"""),format.raw/*30.40*/("""
				server_message = e.data;
				if (server_message.indexOf("question_") > -1) """),format.raw/*32.51*/("""{"""),format.raw/*32.52*/("""
					server_message = server_message.replace(
							"question_", "");
					displayQuestion(server_message);
				"""),format.raw/*36.5*/("""}"""),format.raw/*36.6*/("""
			  /*if (server_message.indexOf("question_") > -1) """),format.raw/*37.54*/("""{"""),format.raw/*37.55*/("""
					server_message = server_message.replace(
							"question_", "");
					displayQuestion(server_message);
				"""),format.raw/*41.5*/("""}"""),format.raw/*41.6*/("""*/
			"""),format.raw/*42.4*/("""}"""),format.raw/*42.5*/(""";
			
			connection.onclose = function(e) """),format.raw/*44.37*/("""{"""),format.raw/*44.38*/("""
				//
			"""),format.raw/*46.4*/("""}"""),format.raw/*46.5*/("""
			
			$("#submit_speed").click(function() """),format.raw/*48.40*/("""{"""),format.raw/*48.41*/("""
				$.post("/postVotes", """),format.raw/*49.26*/("""{"""),format.raw/*49.27*/("""
					p_vote: $('input[name=radioGroup]:checked').val()
				"""),format.raw/*51.5*/("""}"""),format.raw/*51.6*/(""")
			"""),format.raw/*52.4*/("""}"""),format.raw/*52.5*/(""");
			
			$("#submit_volume").click(function() """),format.raw/*54.41*/("""{"""),format.raw/*54.42*/("""
				$.post("/postVotes", """),format.raw/*55.26*/("""{"""),format.raw/*55.27*/("""
					p_vote: $('input[name=radioGroup1]:checked').val()
				"""),format.raw/*57.5*/("""}"""),format.raw/*57.6*/(""")
			"""),format.raw/*58.4*/("""}"""),format.raw/*58.5*/(""");
			
			$("#submit_pause").click(function() """),format.raw/*60.40*/("""{"""),format.raw/*60.41*/("""
				$.post("/postVotes", """),format.raw/*61.26*/("""{"""),format.raw/*61.27*/("""
					p_vote: $(this).attr("value")
				"""),format.raw/*63.5*/("""}"""),format.raw/*63.6*/(""")
			"""),format.raw/*64.4*/("""}"""),format.raw/*64.5*/(""");
			
			$("#submit_button").click(function() """),format.raw/*66.41*/("""{"""),format.raw/*66.42*/("""
				$.post("/postStudentQuestion", """),format.raw/*67.36*/("""{"""),format.raw/*67.37*/("""
					p_question: $("#question").val()
				"""),format.raw/*69.5*/("""}"""),format.raw/*69.6*/(""").done(function()"""),format.raw/*69.23*/("""{"""),format.raw/*69.24*/("""
					$("#q_area").hide();
				"""),format.raw/*71.5*/("""}"""),format.raw/*71.6*/(""")
			"""),format.raw/*72.4*/("""}"""),format.raw/*72.5*/(""");
		
			$("#add").click(function() """),format.raw/*74.31*/("""{"""),format.raw/*74.32*/("""
				$("#q_area").show();
			"""),format.raw/*76.4*/("""}"""),format.raw/*76.5*/(""");		
		
			$("#cancel_button").click(function() """),format.raw/*78.41*/("""{"""),format.raw/*78.42*/("""
    				$("#q_area").hide();
  		 	"""),format.raw/*80.7*/("""}"""),format.raw/*80.8*/(""");

  		 	
		"""),format.raw/*83.3*/("""}"""),format.raw/*83.4*/(""");
</script>

</head>
<body>
	<div id="container">
		<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
			<a href="/home"><img src=""""),_display_(Seq[Any](/*90.31*/routes/*90.37*/.Assets.at("images/logonew.png"))),format.raw/*90.69*/("""" height="70px"
			width="150px" alt="Live Feed"></a>
		</div>
		<header class="navbar navbar-static-top bs-docs-nav" id="top">
			<div class="btn-group" style="float: right;">
				<a type="button" class="btn btn-default" href="/home">Home</a> <a
					type="button" class="btn btn-default" href="/aboutus">About Us</a> <a
					type="button" class="btn btn-default" href="/contact">Contact</a> <a
					type="button" class="btn btn-default" href="/feedback">Feedback</a>
			</div>
		</header>
		
		<div class="voting-questions-container" style="width: 80%; margin: 0 auto;">
			<div id="test" style="width: 55%; margin: 0 auto; padding: 0 20px 20px 20px;">
				<div class="speed_container" style="border: 1px solid black; display: inline-block; background-color: #D6DBFD; padding: 0px 60px 40px 60px; margin: 0 30px; border-radius: 7px; border-color: #3333FF; width: 190px;">
				<!-- <form id="speed_vote" method="get" action="/vote"> -->
						<div>
							<h3><b><i>Speed</i></b></h3>
							<div>
								<label class="radio-inline"> <input name="radioGroup"
									id="radio1" value="speed_low" type="radio"> LOW
								</label>
							</div>
							<div>
								<label class="radio-inline"> <input name="radioGroup"
									id="radio2" value="speed_ok" checked="checked" type="radio">
									OK
								</label>
							</div>
							<div>
								<label class="radio-inline"> <input name="radioGroup"
									id="radio3" value="speed_fast" type="radio"> FAST
								</label>
							</div>
						<a id="submit_speed" class="btn btn-primary" type="button" style="margin-top: 15px; border: 3px solid white;">Vote</a>	
						<!-- button type="submit" class="btn btn-primary" style="margin-top: 15px; border: 3px solid white;">Vote</button--> 
						</div>
			 	<!-- </form> -->
				</div>
				<div class="loudness_container" style="border: 1px solid black; display: inline-block; background-color: #D6DBFD; padding: 0px 60px 40px 60px; margin: 0 30px; border-radius: 7px; border-color: #3333FF; width: 190px;">
			<!-- 	<form id="voice_vote" method="get" action="/vote"> -->
						<div>
							<h3><b><i>Voice</i></b></h3>
							<div>
								<label class="radio-inline"> <input name="radioGroup1"
									id="radio4" value="voice_low" type="radio"> LOW
								</label>
							</div>
							<div>
								<label class="radio-inline"> <input name="radioGroup1"
									id="radio5" value="voice_ok" checked="checked" type="radio">
									OK
								</label>
							</div>
							<div>
								<label class="radio-inline"> <input name="radioGroup1"
									id="radio6" value="voice_loud" type="radio"> LOUD
								</label>
							</div>
							<a id="submit_volume" class="btn btn-primary" type="button" style="margin-top: 15px; border: 3px solid white;">Vote</a>	
						 <!-- button type="submit" class="btn btn-primary" style="margin-top: 15px; border: 3px solid white;">Vote</button--> 
						</div>
		 	<!--		</form> -->
				</div>
				<div class="pause_container">
				<!--	<form id="pause_vote" method="get" action="/vote"--> 
						<div class="col-md-4 col-md-offset-2" style="margin-top: 20px">
						
					<button name="pause_vote" value="pause" type="button" id="submit_pause"
			            class="btn btn-warning" style="width: 300px; height: 56px; font-size: 18px;"><b>Pause</b></button> 
						</div>
					<!--/form-->  
				</div>
				<div class="clear" style="clear: both;"></div>
			</div>
			
			<div id="question-container" style="border: 1px solid #3333FF; width: 80%; margin: 10px auto; padding: 0 20px 20px 20px; background-color: #D6DBFD; border-radius: 7px;">
				<h3><b><i>Q&A Section</i></b></h3>
				
				<div id="questions_row1">
					<div id="posted_question"></div> 
					<div style="margin-top: 20px;">
						<a type="button" class="btn btn-primary" id="add" style="margin-top: 10px; border: 3px solid white;">Add Question</a>
					</div>

					<div id="q_area" style="display: none; margin-top: 10px;">
						<textarea class="form-control" rows="4" columns="50"
							id="question" placeholder="Enter Question Here" name="p_question"></textarea>
						<div class="btn-group-justified" style="margin-top: 20px;">
							<a id="submit_button" class="btn btn-success" type="button">Submit</a>
							<a id="cancel_button" class="btn btn-danger" type="button">Cancel</a>
						</div>
					</div>
				</div>
				
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
                    DATE: Thu Jun 26 15:15:37 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Final/livefeed/app/views/indexStudent.scala.html
                    HASH: 3ffddfa1e1078e7e5fe8f9a2cdb531e8bdc468b7
                    MATRIX: 862->0|993->96|1007->102|1062->136|1150->189|1164->195|1217->227|1305->280|1319->286|1372->318|1460->371|1474->377|1527->409|1612->458|1627->464|1703->517|1756->534|1771->540|1838->585|1947->666|1976->667|2197->861|2225->862|2286->895|2315->896|2437->990|2466->991|2504->1002|2532->1003|2603->1046|2632->1047|2740->1127|2769->1128|2910->1242|2938->1243|3020->1297|3049->1298|3190->1412|3218->1413|3251->1419|3279->1420|3349->1462|3378->1463|3416->1474|3444->1475|3516->1519|3545->1520|3599->1546|3628->1547|3715->1607|3743->1608|3775->1613|3803->1614|3878->1661|3907->1662|3961->1688|3990->1689|4078->1750|4106->1751|4138->1756|4166->1757|4240->1803|4269->1804|4323->1830|4352->1831|4419->1871|4447->1872|4479->1877|4507->1878|4582->1925|4611->1926|4675->1962|4704->1963|4774->2006|4802->2007|4847->2024|4876->2025|4934->2056|4962->2057|4994->2062|5022->2063|5086->2099|5115->2100|5171->2129|5199->2130|5275->2178|5304->2179|5367->2215|5395->2216|5435->2229|5463->2230|5654->2385|5669->2391|5723->2423
                    LINES: 29->1|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|43->15|43->15|49->21|49->21|51->23|51->23|54->26|54->26|56->28|56->28|58->30|58->30|60->32|60->32|64->36|64->36|65->37|65->37|69->41|69->41|70->42|70->42|72->44|72->44|74->46|74->46|76->48|76->48|77->49|77->49|79->51|79->51|80->52|80->52|82->54|82->54|83->55|83->55|85->57|85->57|86->58|86->58|88->60|88->60|89->61|89->61|91->63|91->63|92->64|92->64|94->66|94->66|95->67|95->67|97->69|97->69|97->69|97->69|99->71|99->71|100->72|100->72|102->74|102->74|104->76|104->76|106->78|106->78|108->80|108->80|111->83|111->83|118->90|118->90|118->90
                    -- GENERATED --
                */
            