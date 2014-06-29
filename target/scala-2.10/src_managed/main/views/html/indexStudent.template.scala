
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
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*11.47*/routes/*11.53*/.Assets.at("stylesheets/indexStudent.css"))),format.raw/*11.95*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*12.47*/routes/*12.53*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*12.106*/("""">
<script src=""""),_display_(Seq[Any](/*13.15*/routes/*13.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*13.66*/("""" type="text/javascript"></script>

<script>

function disablePause() """),format.raw/*17.25*/("""{"""),format.raw/*17.26*/("""

	document.getElementById("submit_pause").disabled = true;
	
    setTimeout(function()"""),format.raw/*21.26*/("""{"""),format.raw/*21.27*/("""
    	document.getElementById("submit_pause").disabled = false;
    """),format.raw/*23.5*/("""}"""),format.raw/*23.6*/(""", 5000);  	
    
"""),format.raw/*25.1*/("""}"""),format.raw/*25.2*/("""

function recalculatePause() """),format.raw/*27.29*/("""{"""),format.raw/*27.30*/("""
	$.post("/postVotes", """),format.raw/*28.23*/("""{"""),format.raw/*28.24*/("""
		p_vote: "unpause"
	"""),format.raw/*30.2*/("""}"""),format.raw/*30.3*/(""")	
"""),format.raw/*31.1*/("""}"""),format.raw/*31.2*/("""

function displayQuestion(question) """),format.raw/*33.36*/("""{"""),format.raw/*33.37*/("""
	$('#posted_question')
			.append(
					'<div style="background-color: white; margin: 0 10px 10px 0; padding: 7px; border-radius:5px;">'
							+ question + '</div>');
	$(".test").show();
"""),format.raw/*39.1*/("""}"""),format.raw/*39.2*/("""

	 $(document).ready(function() """),format.raw/*41.32*/("""{"""),format.raw/*41.33*/("""
		 var connection = new WebSocket('ws://localhost:9000');

			connection.onopen = function() """),format.raw/*44.35*/("""{"""),format.raw/*44.36*/("""
				//
			"""),format.raw/*46.4*/("""}"""),format.raw/*46.5*/("""
			
			connection.onmessage = function(e) """),format.raw/*48.39*/("""{"""),format.raw/*48.40*/("""
				server_message = e.data;
				if (server_message.indexOf("question_") > -1) """),format.raw/*50.51*/("""{"""),format.raw/*50.52*/("""
					server_message = server_message.replace(
							"question_", "");
					displayQuestion(server_message);
				"""),format.raw/*54.5*/("""}"""),format.raw/*54.6*/("""
			  /*if (server_message.indexOf("question_") > -1) """),format.raw/*55.54*/("""{"""),format.raw/*55.55*/("""
					server_message = server_message.replace(
							"question_", "");
					displayQuestion(server_message);
				"""),format.raw/*59.5*/("""}"""),format.raw/*59.6*/("""*/
			"""),format.raw/*60.4*/("""}"""),format.raw/*60.5*/(""";
			
			connection.onclose = function(e) """),format.raw/*62.37*/("""{"""),format.raw/*62.38*/("""
				//
			"""),format.raw/*64.4*/("""}"""),format.raw/*64.5*/("""
			
			$("#submit_speed").click(function() """),format.raw/*66.40*/("""{"""),format.raw/*66.41*/("""
				$.post("/postVotes", """),format.raw/*67.26*/("""{"""),format.raw/*67.27*/("""
					p_vote: $('input[name=radioGroup]:checked').val()
				"""),format.raw/*69.5*/("""}"""),format.raw/*69.6*/(""")
				document.getElementById("submit_speed").disabled = true;
				document.getElementById("submit_speed").innerHTML = "Voted".bold();
			    
			    setTimeout(function()"""),format.raw/*73.29*/("""{"""),format.raw/*73.30*/("""
			    	document.getElementById("submit_speed").disabled = false;
					document.getElementById("submit_speed").innerHTML = "Vote";	
			    """),format.raw/*76.8*/("""}"""),format.raw/*76.9*/(""", 3000);
			"""),format.raw/*77.4*/("""}"""),format.raw/*77.5*/(""");
			
			$("#submit_volume").click(function() """),format.raw/*79.41*/("""{"""),format.raw/*79.42*/("""
				$.post("/postVotes", """),format.raw/*80.26*/("""{"""),format.raw/*80.27*/("""
					p_vote: $('input[name=radioGroup1]:checked').val()
				"""),format.raw/*82.5*/("""}"""),format.raw/*82.6*/(""")
				document.getElementById("submit_volume").disabled = true;
				document.getElementById("submit_volume").innerHTML = "Voted".bold();

			    setTimeout(function()"""),format.raw/*86.29*/("""{"""),format.raw/*86.30*/("""
			    	document.getElementById("submit_volume").disabled = false;
					document.getElementById("submit_volume").innerHTML = "Vote";	
			    """),format.raw/*89.8*/("""}"""),format.raw/*89.9*/(""", 3000);
			"""),format.raw/*90.4*/("""}"""),format.raw/*90.5*/(""");
			
			$("#submit_pause").click(function() """),format.raw/*92.40*/("""{"""),format.raw/*92.41*/("""
				$.post("/postVotes", """),format.raw/*93.26*/("""{"""),format.raw/*93.27*/("""
					p_vote: $(this).attr("value")
				"""),format.raw/*95.5*/("""}"""),format.raw/*95.6*/(""")
				document.getElementById("submit_pause").disabled = true;
			"""),format.raw/*97.4*/("""}"""),format.raw/*97.5*/(""");
			
			$("#submit_button").click(function() """),format.raw/*99.41*/("""{"""),format.raw/*99.42*/("""
				$.post("/postStudentQuestion", """),format.raw/*100.36*/("""{"""),format.raw/*100.37*/("""
					p_question: $("#question").val()
				"""),format.raw/*102.5*/("""}"""),format.raw/*102.6*/(""").done(function()"""),format.raw/*102.23*/("""{"""),format.raw/*102.24*/("""
					$("#q_area").hide();
					$('#question	').val('');
				"""),format.raw/*105.5*/("""}"""),format.raw/*105.6*/(""")
			"""),format.raw/*106.4*/("""}"""),format.raw/*106.5*/(""");
		
			$("#add").click(function() """),format.raw/*108.31*/("""{"""),format.raw/*108.32*/("""
				$("#q_area").show();
			"""),format.raw/*110.4*/("""}"""),format.raw/*110.5*/(""");		
		
			$("#cancel_button").click(function() """),format.raw/*112.41*/("""{"""),format.raw/*112.42*/("""
    				$("#q_area").hide();
  		 	"""),format.raw/*114.7*/("""}"""),format.raw/*114.8*/(""");
		"""),format.raw/*115.3*/("""}"""),format.raw/*115.4*/(""");
</script>

</head>
<body onload="disablePause();recalculatePause();">
	<div id="container">
		<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
			<a href="/home"><img src=""""),_display_(Seq[Any](/*122.31*/routes/*122.37*/.Assets.at("images/logonew.png"))),format.raw/*122.69*/("""" height="70px"
			width="150px" alt="Live Feed"></a>
		</div>
		<header class="navbar navbar-static-top bs-docs-nav" id="top">
			<div class="btn-group">
				<a type="button" class="btn btn-default" href="/home">Home</a> <a
					type="button" class="btn btn-default" href="/aboutus">About Us</a> <a
					type="button" class="btn btn-default" href="/contact">Contact</a> <a
					type="button" class="btn btn-default" href="/feedback">Feedback</a>
			</div>
		</header>
		
		<div class="voting-questions-container">
			<div id="test">
				<div class="speed_container">
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
								<button id="submit_speed" type="button" class="btn btn-primary">Vote</button>
							</div>  
						</div>
			 	<!-- </form> -->
				</div>
				<div class="loudness_container">
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
								<button id="submit_volume" type="button" class="btn btn-primary">Vote</button>
							</div>
						</div>
		 	<!--		</form> -->
				</div>
				<div class="pause_container">
				<!--	<form id="pause_vote" method="get" action="/vote"--> 
						<div class="col-md-4 col-md-offset-2" style="margin-top: 20px">
						
					<button name="pause_vote" value="Pause_count" type="button" id="submit_pause"
			            class="btn btn-warning"><b>Pause</b></button> 
						</div>
					<!--/form-->  
				</div>
				<div class="clear" style="clear: both;"></div>
			</div>
			
			<div id="question-container">
				<h3><b><i>Q&A Section</i></b></h3>
				
				<div id="questions_row1">
					<div id="posted_questions">
					"""),_display_(Seq[Any](/*205.7*/for(questions <- questionList) yield /*205.37*/{_display_(Seq[Any](format.raw/*205.38*/("""
					<div id="posted-question">
							 """),_display_(Seq[Any](/*207.10*/questions)),format.raw/*207.19*/(""" </div>
					""")))})),format.raw/*208.7*/("""
					
					</div> 
					<div style="margin-top: 20px;">
						<a type="button" class="btn btn-primary" id="add">Add Question</a>
					</div>

					<div id="q_area">
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
                    DATE: Sun Jun 29 14:26:18 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Final/livefeed_Final/livefeed/app/views/indexStudent.scala.html
                    HASH: 484d1b28ec4cac2c4f8772e14b5d02a166ba65f1
                    MATRIX: 787->1|909->29|1041->126|1055->132|1110->166|1198->219|1212->225|1265->257|1353->310|1367->316|1420->348|1509->401|1524->407|1578->439|1663->488|1678->494|1742->536|1827->585|1842->591|1918->644|1971->661|1986->667|2053->712|2151->782|2180->783|2295->870|2324->871|2419->939|2447->940|2491->957|2519->958|2577->988|2606->989|2657->1012|2686->1013|2735->1035|2763->1036|2793->1039|2821->1040|2886->1077|2915->1078|3131->1267|3159->1268|3220->1301|3249->1302|3371->1396|3400->1397|3438->1408|3466->1409|3537->1452|3566->1453|3674->1533|3703->1534|3844->1648|3872->1649|3954->1703|3983->1704|4124->1818|4152->1819|4185->1825|4213->1826|4283->1868|4312->1869|4350->1880|4378->1881|4450->1925|4479->1926|4533->1952|4562->1953|4649->2013|4677->2014|4876->2185|4905->2186|5072->2326|5100->2327|5139->2339|5167->2340|5242->2387|5271->2388|5325->2414|5354->2415|5442->2476|5470->2477|5664->2643|5693->2644|5862->2786|5890->2787|5929->2799|5957->2800|6031->2846|6060->2847|6114->2873|6143->2874|6210->2914|6238->2915|6331->2981|6359->2982|6434->3029|6463->3030|6528->3066|6558->3067|6629->3110|6658->3111|6704->3128|6734->3129|6823->3190|6852->3191|6885->3196|6914->3197|6979->3233|7009->3234|7066->3263|7095->3264|7172->3312|7202->3313|7266->3349|7295->3350|7328->3355|7357->3356|7593->3555|7609->3561|7664->3593|10492->6385|10539->6415|10579->6416|10658->6458|10690->6467|10736->6481
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|45->17|45->17|49->21|49->21|51->23|51->23|53->25|53->25|55->27|55->27|56->28|56->28|58->30|58->30|59->31|59->31|61->33|61->33|67->39|67->39|69->41|69->41|72->44|72->44|74->46|74->46|76->48|76->48|78->50|78->50|82->54|82->54|83->55|83->55|87->59|87->59|88->60|88->60|90->62|90->62|92->64|92->64|94->66|94->66|95->67|95->67|97->69|97->69|101->73|101->73|104->76|104->76|105->77|105->77|107->79|107->79|108->80|108->80|110->82|110->82|114->86|114->86|117->89|117->89|118->90|118->90|120->92|120->92|121->93|121->93|123->95|123->95|125->97|125->97|127->99|127->99|128->100|128->100|130->102|130->102|130->102|130->102|133->105|133->105|134->106|134->106|136->108|136->108|138->110|138->110|140->112|140->112|142->114|142->114|143->115|143->115|150->122|150->122|150->122|233->205|233->205|233->205|235->207|235->207|236->208
                    -- GENERATED --
                */
            