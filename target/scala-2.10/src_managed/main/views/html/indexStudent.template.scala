
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
object indexStudent extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[String],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(questionList: List[String]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.30*/("""
<!DOCTYPE html>
<html>
<head>

<title>Test</title>
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*7.46*/routes/*7.52*/.Assets.at("stylesheets/main.css"))),format.raw/*7.86*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*8.51*/routes/*8.57*/.Assets.at("images/favicon.png"))),format.raw/*8.89*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.51*/routes/*9.57*/.Assets.at("images/logonew.png"))),format.raw/*9.89*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.51*/routes/*10.57*/.Assets.at("images/voteImg.png"))),format.raw/*10.89*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*11.47*/routes/*11.53*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*11.106*/("""">
<script src=""""),_display_(Seq[Any](/*12.15*/routes/*12.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*12.66*/("""" type="text/javascript"></script>

<script>

function disablePause() """),format.raw/*16.25*/("""{"""),format.raw/*16.26*/("""

	document.getElementById("submit_pause").disabled = true;
	
    setTimeout(function()"""),format.raw/*20.26*/("""{"""),format.raw/*20.27*/("""
    	document.getElementById("submit_pause").disabled = false;
    """),format.raw/*22.5*/("""}"""),format.raw/*22.6*/(""", 5000);  	
    
"""),format.raw/*24.1*/("""}"""),format.raw/*24.2*/("""

function displayQuestion(question) """),format.raw/*26.36*/("""{"""),format.raw/*26.37*/("""
	$('#posted_question')
			.append(
					'<div style="background-color: white; margin: 0 10px 10px 0; padding: 7px; border-radius:5px;">'
							+ question + '</div>');
	$(".test").show();
"""),format.raw/*32.1*/("""}"""),format.raw/*32.2*/("""

	 $(document).ready(function() """),format.raw/*34.32*/("""{"""),format.raw/*34.33*/("""
		 var connection = new WebSocket('ws://localhost:9000');

			connection.onopen = function() """),format.raw/*37.35*/("""{"""),format.raw/*37.36*/("""
				//
			"""),format.raw/*39.4*/("""}"""),format.raw/*39.5*/("""
			
			connection.onmessage = function(e) """),format.raw/*41.39*/("""{"""),format.raw/*41.40*/("""
				server_message = e.data;
				if (server_message.indexOf("question_") > -1) """),format.raw/*43.51*/("""{"""),format.raw/*43.52*/("""
					server_message = server_message.replace(
							"question_", "");
					displayQuestion(server_message);
				"""),format.raw/*47.5*/("""}"""),format.raw/*47.6*/("""
			  /*if (server_message.indexOf("question_") > -1) """),format.raw/*48.54*/("""{"""),format.raw/*48.55*/("""
					server_message = server_message.replace(
							"question_", "");
					displayQuestion(server_message);
				"""),format.raw/*52.5*/("""}"""),format.raw/*52.6*/("""*/
			"""),format.raw/*53.4*/("""}"""),format.raw/*53.5*/(""";
			
			connection.onclose = function(e) """),format.raw/*55.37*/("""{"""),format.raw/*55.38*/("""
				//
			"""),format.raw/*57.4*/("""}"""),format.raw/*57.5*/("""
			
			$("#submit_speed").click(function() """),format.raw/*59.40*/("""{"""),format.raw/*59.41*/("""
				$.post("/postVotes", """),format.raw/*60.26*/("""{"""),format.raw/*60.27*/("""
					p_vote: $('input[name=radioGroup]:checked').val()
				"""),format.raw/*62.5*/("""}"""),format.raw/*62.6*/(""")
				document.getElementById("submit_speed").disabled = true;
				document.getElementById("submit_speed").innerHTML = "Voted".bold();
			    
			    setTimeout(function()"""),format.raw/*66.29*/("""{"""),format.raw/*66.30*/("""
			    	document.getElementById("submit_speed").disabled = false;
					document.getElementById("submit_speed").innerHTML = "Vote";	
			    """),format.raw/*69.8*/("""}"""),format.raw/*69.9*/(""", 3000);
			"""),format.raw/*70.4*/("""}"""),format.raw/*70.5*/(""");
			
			$("#submit_volume").click(function() """),format.raw/*72.41*/("""{"""),format.raw/*72.42*/("""
				$.post("/postVotes", """),format.raw/*73.26*/("""{"""),format.raw/*73.27*/("""
					p_vote: $('input[name=radioGroup1]:checked').val()
				"""),format.raw/*75.5*/("""}"""),format.raw/*75.6*/(""")
				document.getElementById("submit_volume").disabled = true;
				document.getElementById("submit_volume").innerHTML = "Voted".bold();

			    setTimeout(function()"""),format.raw/*79.29*/("""{"""),format.raw/*79.30*/("""
			    	document.getElementById("submit_volume").disabled = false;
					document.getElementById("submit_volume").innerHTML = "Vote";	
			    """),format.raw/*82.8*/("""}"""),format.raw/*82.9*/(""", 3000);
			"""),format.raw/*83.4*/("""}"""),format.raw/*83.5*/(""");
			
			$("#submit_pause").click(function() """),format.raw/*85.40*/("""{"""),format.raw/*85.41*/("""
				$.post("/postVotes", """),format.raw/*86.26*/("""{"""),format.raw/*86.27*/("""
					p_vote: $(this).attr("value")
				"""),format.raw/*88.5*/("""}"""),format.raw/*88.6*/(""")
				document.getElementById("submit_pause").disabled = true;
			"""),format.raw/*90.4*/("""}"""),format.raw/*90.5*/(""");
			
			$("#submit_button").click(function() """),format.raw/*92.41*/("""{"""),format.raw/*92.42*/("""
				$.post("/postStudentQuestion", """),format.raw/*93.36*/("""{"""),format.raw/*93.37*/("""
					p_question: $("#question").val()
				"""),format.raw/*95.5*/("""}"""),format.raw/*95.6*/(""").done(function()"""),format.raw/*95.23*/("""{"""),format.raw/*95.24*/("""
					$("#q_area").hide();
				"""),format.raw/*97.5*/("""}"""),format.raw/*97.6*/(""")
			"""),format.raw/*98.4*/("""}"""),format.raw/*98.5*/(""");
		
			$("#add").click(function() """),format.raw/*100.31*/("""{"""),format.raw/*100.32*/("""
				$("#q_area").show();
			"""),format.raw/*102.4*/("""}"""),format.raw/*102.5*/(""");		
		
			$("#cancel_button").click(function() """),format.raw/*104.41*/("""{"""),format.raw/*104.42*/("""
    				$("#q_area").hide();
  		 	"""),format.raw/*106.7*/("""}"""),format.raw/*106.8*/(""");

  		 	
		"""),format.raw/*109.3*/("""}"""),format.raw/*109.4*/(""");
</script>

</head>
<body onload="disablePause()">
	<div id="container">
		<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
			<a href="/home"><img src=""""),_display_(Seq[Any](/*116.31*/routes/*116.37*/.Assets.at("images/logonew.png"))),format.raw/*116.69*/("""" height="70px"
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
									id="radio3" value="Speed_High" type="radio"> FAST
								</label>
							</div>
							<div>
								<label class="radio-inline"> <input name="radioGroup"
									id="radio2" value="Speed_OK" checked="checked" type="radio">
									OK
								</label>
							</div>
							<div>
								<label class="radio-inline"> <input name="radioGroup"
									id="radio1" value="Speed_Low" type="radio"> LOW
								</label>
							</div>
							<div align="center">
								<button id="submit_speed" type="button" class="btn btn-primary" style="margin-top: 15px; border: 3px solid white;">Vote</button>
							</div>  
						</div>
			 	<!-- </form> -->
				</div>
				<div class="loudness_container" style="border: 1px solid black; display: inline-block; background-color: #D6DBFD; padding: 0px 60px 40px 60px; margin: 0 30px; border-radius: 7px; border-color: #3333FF; width: 190px;">
			<!-- 	<form id="voice_vote" method="get" action="/vote"> -->
						<div>
							<h3><b><i>Voice</i></b></h3>
							<div>
								<label class="radio-inline"> <input name="radioGroup1"
									id="radio6" value="Volume_High" type="radio"> LOUD
								</label>
							</div>
							<div>
								<label class="radio-inline"> <input name="radioGroup1"
									id="radio5" value="Volume_OK" checked="checked" type="radio">
									OK
								</label>
							</div>
							<div>
								<label class="radio-inline"> <input name="radioGroup1"
									id="radio4" value="Volume_Low" type="radio"> LOW
								</label>
							</div>
							<div align="center">
								<button id="submit_volume" type="button" class="btn btn-primary" style="margin-top: 15px; border: 3px solid white;">Vote</button>
							</div>
						</div>
		 	<!--		</form> -->
				</div>
				<div class="pause_container">
				<!--	<form id="pause_vote" method="get" action="/vote"--> 
						<div class="col-md-4 col-md-offset-2" style="margin-top: 20px">
						
					<button name="pause_vote" value="Pause_count" type="button" id="submit_pause"
			            class="btn btn-warning" style="width: 300px; height: 56px; font-size: 18px;"><b>Pause</b></button> 
						</div>
					<!--/form-->  
				</div>
				<div class="clear" style="clear: both;"></div>
			</div>
			
			<div id="question-container" style="border: 1px solid #3333FF; width: 80%; margin: 10px auto; padding: 0 20px 20px 20px; background-color: #D6DBFD; border-radius: 7px;">
				<h3><b><i>Q&A Section</i></b></h3>
				
				<div id="questions_row1">
					<div id="posted_question">
					"""),_display_(Seq[Any](/*199.7*/for(questions <- questionList) yield /*199.37*/{_display_(Seq[Any](format.raw/*199.38*/("""
					<div style="background-color: white; margin: 0 10px 10px 0; padding: 7px; border-radius:5px;">
							 """),_display_(Seq[Any](/*201.10*/questions)),format.raw/*201.19*/(""" </div>
					""")))})),format.raw/*202.7*/("""
					
					</div> 
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
    
    def render(questionList:List[String]): play.api.templates.HtmlFormat.Appendable = apply(questionList)
    
    def f:((List[String]) => play.api.templates.HtmlFormat.Appendable) = (questionList) => apply(questionList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jun 28 11:38:26 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Final/livefeed/app/views/indexStudent.scala.html
                    HASH: bcc039d649c9f9ee536ca5d725efede2f217ffdb
                    MATRIX: 787->1|909->29|1041->126|1055->132|1110->166|1198->219|1212->225|1265->257|1353->310|1367->316|1420->348|1509->401|1524->407|1578->439|1663->488|1678->494|1754->547|1807->564|1822->570|1889->615|1987->685|2016->686|2131->773|2160->774|2255->842|2283->843|2327->860|2355->861|2420->898|2449->899|2665->1088|2693->1089|2754->1122|2783->1123|2905->1217|2934->1218|2972->1229|3000->1230|3071->1273|3100->1274|3208->1354|3237->1355|3378->1469|3406->1470|3488->1524|3517->1525|3658->1639|3686->1640|3719->1646|3747->1647|3817->1689|3846->1690|3884->1701|3912->1702|3984->1746|4013->1747|4067->1773|4096->1774|4183->1834|4211->1835|4410->2006|4439->2007|4606->2147|4634->2148|4673->2160|4701->2161|4776->2208|4805->2209|4859->2235|4888->2236|4976->2297|5004->2298|5198->2464|5227->2465|5396->2607|5424->2608|5463->2620|5491->2621|5565->2667|5594->2668|5648->2694|5677->2695|5744->2735|5772->2736|5865->2802|5893->2803|5968->2850|5997->2851|6061->2887|6090->2888|6160->2931|6188->2932|6233->2949|6262->2950|6320->2981|6348->2982|6380->2987|6408->2988|6473->3024|6503->3025|6560->3054|6589->3055|6666->3103|6696->3104|6760->3140|6789->3141|6830->3154|6859->3155|7075->3334|7091->3340|7146->3372|10759->6949|10806->6979|10846->6980|10993->7090|11025->7099|11071->7113
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|44->16|44->16|48->20|48->20|50->22|50->22|52->24|52->24|54->26|54->26|60->32|60->32|62->34|62->34|65->37|65->37|67->39|67->39|69->41|69->41|71->43|71->43|75->47|75->47|76->48|76->48|80->52|80->52|81->53|81->53|83->55|83->55|85->57|85->57|87->59|87->59|88->60|88->60|90->62|90->62|94->66|94->66|97->69|97->69|98->70|98->70|100->72|100->72|101->73|101->73|103->75|103->75|107->79|107->79|110->82|110->82|111->83|111->83|113->85|113->85|114->86|114->86|116->88|116->88|118->90|118->90|120->92|120->92|121->93|121->93|123->95|123->95|123->95|123->95|125->97|125->97|126->98|126->98|128->100|128->100|130->102|130->102|132->104|132->104|134->106|134->106|137->109|137->109|144->116|144->116|144->116|227->199|227->199|227->199|229->201|229->201|230->202
                    -- GENERATED --
                */
            