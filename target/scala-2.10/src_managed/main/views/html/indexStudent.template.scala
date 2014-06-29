
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

function displayQuestion(question) """),format.raw/*27.36*/("""{"""),format.raw/*27.37*/("""
	$('#posted_question')
			.append(
					'<div style="background-color: white; margin: 0 10px 10px 0; padding: 7px; border-radius:5px;">'
							+ question + '</div>');
	$(".test").show();
"""),format.raw/*33.1*/("""}"""),format.raw/*33.2*/("""

	 $(document).ready(function() """),format.raw/*35.32*/("""{"""),format.raw/*35.33*/("""
		 var connection = new WebSocket('ws://localhost:9000');

			connection.onopen = function() """),format.raw/*38.35*/("""{"""),format.raw/*38.36*/("""
				//
			"""),format.raw/*40.4*/("""}"""),format.raw/*40.5*/("""
			
			connection.onmessage = function(e) """),format.raw/*42.39*/("""{"""),format.raw/*42.40*/("""
				server_message = e.data;
				if (server_message.indexOf("question_") > -1) """),format.raw/*44.51*/("""{"""),format.raw/*44.52*/("""
					server_message = server_message.replace(
							"question_", "");
					displayQuestion(server_message);
				"""),format.raw/*48.5*/("""}"""),format.raw/*48.6*/("""
			  /*if (server_message.indexOf("question_") > -1) """),format.raw/*49.54*/("""{"""),format.raw/*49.55*/("""
					server_message = server_message.replace(
							"question_", "");
					displayQuestion(server_message);
				"""),format.raw/*53.5*/("""}"""),format.raw/*53.6*/("""*/
			"""),format.raw/*54.4*/("""}"""),format.raw/*54.5*/(""";
			
			connection.onclose = function(e) """),format.raw/*56.37*/("""{"""),format.raw/*56.38*/("""
				//
			"""),format.raw/*58.4*/("""}"""),format.raw/*58.5*/("""
			
			$("#submit_speed").click(function() """),format.raw/*60.40*/("""{"""),format.raw/*60.41*/("""
				$.post("/postVotes", """),format.raw/*61.26*/("""{"""),format.raw/*61.27*/("""
					p_vote: $('input[name=radioGroup]:checked').val()
				"""),format.raw/*63.5*/("""}"""),format.raw/*63.6*/(""")
				document.getElementById("submit_speed").disabled = true;
				document.getElementById("submit_speed").innerHTML = "Voted".bold();
			    
			    setTimeout(function()"""),format.raw/*67.29*/("""{"""),format.raw/*67.30*/("""
			    	document.getElementById("submit_speed").disabled = false;
					document.getElementById("submit_speed").innerHTML = "Vote";	
			    """),format.raw/*70.8*/("""}"""),format.raw/*70.9*/(""", 3000);
			"""),format.raw/*71.4*/("""}"""),format.raw/*71.5*/(""");
			
			$("#submit_volume").click(function() """),format.raw/*73.41*/("""{"""),format.raw/*73.42*/("""
				$.post("/postVotes", """),format.raw/*74.26*/("""{"""),format.raw/*74.27*/("""
					p_vote: $('input[name=radioGroup1]:checked').val()
				"""),format.raw/*76.5*/("""}"""),format.raw/*76.6*/(""")
				document.getElementById("submit_volume").disabled = true;
				document.getElementById("submit_volume").innerHTML = "Voted".bold();

			    setTimeout(function()"""),format.raw/*80.29*/("""{"""),format.raw/*80.30*/("""
			    	document.getElementById("submit_volume").disabled = false;
					document.getElementById("submit_volume").innerHTML = "Vote";	
			    """),format.raw/*83.8*/("""}"""),format.raw/*83.9*/(""", 3000);
			"""),format.raw/*84.4*/("""}"""),format.raw/*84.5*/(""");
			
			$("#submit_pause").click(function() """),format.raw/*86.40*/("""{"""),format.raw/*86.41*/("""
				$.post("/postVotes", """),format.raw/*87.26*/("""{"""),format.raw/*87.27*/("""
					p_vote: $(this).attr("value")
				"""),format.raw/*89.5*/("""}"""),format.raw/*89.6*/(""")
				document.getElementById("submit_pause").disabled = true;
			"""),format.raw/*91.4*/("""}"""),format.raw/*91.5*/(""");
			
			$("#submit_button").click(function() """),format.raw/*93.41*/("""{"""),format.raw/*93.42*/("""
				$.post("/postStudentQuestion", """),format.raw/*94.36*/("""{"""),format.raw/*94.37*/("""
					p_question: $("#question").val()
				"""),format.raw/*96.5*/("""}"""),format.raw/*96.6*/(""").done(function()"""),format.raw/*96.23*/("""{"""),format.raw/*96.24*/("""
					$("#q_area").hide();
					$('#question	').val('');
				"""),format.raw/*99.5*/("""}"""),format.raw/*99.6*/(""")
			"""),format.raw/*100.4*/("""}"""),format.raw/*100.5*/(""");
		
			$("#add").click(function() """),format.raw/*102.31*/("""{"""),format.raw/*102.32*/("""
				$("#q_area").show();
			"""),format.raw/*104.4*/("""}"""),format.raw/*104.5*/(""");		
		
			$("#cancel_button").click(function() """),format.raw/*106.41*/("""{"""),format.raw/*106.42*/("""
    				$("#q_area").hide();
  		 	"""),format.raw/*108.7*/("""}"""),format.raw/*108.8*/(""");
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
					"""),_display_(Seq[Any](/*199.7*/for(questions <- questionList) yield /*199.37*/{_display_(Seq[Any](format.raw/*199.38*/("""
					<div id="posted-question">
							 """),_display_(Seq[Any](/*201.10*/questions)),format.raw/*201.19*/(""" </div>
					""")))})),format.raw/*202.7*/("""
					
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
                    DATE: Sun Jun 29 11:00:02 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Final/livefeed_Final/livefeed/app/views/indexStudent.scala.html
                    HASH: e02dafd18271f39635286d64c268232dfb26561d
                    MATRIX: 787->1|909->29|1041->126|1055->132|1110->166|1198->219|1212->225|1265->257|1353->310|1367->316|1420->348|1509->401|1524->407|1578->439|1663->488|1678->494|1742->536|1827->585|1842->591|1918->644|1971->661|1986->667|2053->712|2151->782|2180->783|2295->870|2324->871|2419->939|2447->940|2491->957|2519->958|2584->995|2613->996|2829->1185|2857->1186|2918->1219|2947->1220|3069->1314|3098->1315|3136->1326|3164->1327|3235->1370|3264->1371|3372->1451|3401->1452|3542->1566|3570->1567|3652->1621|3681->1622|3822->1736|3850->1737|3883->1743|3911->1744|3981->1786|4010->1787|4048->1798|4076->1799|4148->1843|4177->1844|4231->1870|4260->1871|4347->1931|4375->1932|4574->2103|4603->2104|4770->2244|4798->2245|4837->2257|4865->2258|4940->2305|4969->2306|5023->2332|5052->2333|5140->2394|5168->2395|5362->2561|5391->2562|5560->2704|5588->2705|5627->2717|5655->2718|5729->2764|5758->2765|5812->2791|5841->2792|5908->2832|5936->2833|6029->2899|6057->2900|6132->2947|6161->2948|6225->2984|6254->2985|6324->3028|6352->3029|6397->3046|6426->3047|6514->3108|6542->3109|6575->3114|6604->3115|6669->3151|6699->3152|6756->3181|6785->3182|6862->3230|6892->3231|6956->3267|6985->3268|7018->3273|7047->3274|7263->3453|7279->3459|7334->3491|10162->6283|10209->6313|10249->6314|10328->6356|10360->6365|10406->6379
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|45->17|45->17|49->21|49->21|51->23|51->23|53->25|53->25|55->27|55->27|61->33|61->33|63->35|63->35|66->38|66->38|68->40|68->40|70->42|70->42|72->44|72->44|76->48|76->48|77->49|77->49|81->53|81->53|82->54|82->54|84->56|84->56|86->58|86->58|88->60|88->60|89->61|89->61|91->63|91->63|95->67|95->67|98->70|98->70|99->71|99->71|101->73|101->73|102->74|102->74|104->76|104->76|108->80|108->80|111->83|111->83|112->84|112->84|114->86|114->86|115->87|115->87|117->89|117->89|119->91|119->91|121->93|121->93|122->94|122->94|124->96|124->96|124->96|124->96|127->99|127->99|128->100|128->100|130->102|130->102|132->104|132->104|134->106|134->106|136->108|136->108|137->109|137->109|144->116|144->116|144->116|227->199|227->199|227->199|229->201|229->201|230->202
                    -- GENERATED --
                */
            