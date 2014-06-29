
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


function recalculatePause() """),format.raw/*28.29*/("""{"""),format.raw/*28.30*/("""
	$.post("/postVotes", """),format.raw/*29.23*/("""{"""),format.raw/*29.24*/("""
		p_vote: "unpause"
	"""),format.raw/*31.2*/("""}"""),format.raw/*31.3*/(""")
"""),format.raw/*32.1*/("""}"""),format.raw/*32.2*/("""

function displayQuestion(question) """),format.raw/*34.36*/("""{"""),format.raw/*34.37*/("""
	$('#posted_question')
			.append(
					'<div style="background-color: white; margin: 0 10px 10px 0; padding: 7px; border-radius:5px;">'
							+ question + '</div>');
	$(".test").show();
"""),format.raw/*40.1*/("""}"""),format.raw/*40.2*/("""

	 $(document).ready(function() """),format.raw/*42.32*/("""{"""),format.raw/*42.33*/("""
		 var connection = new WebSocket('ws://localhost:9000');

			connection.onopen = function() """),format.raw/*45.35*/("""{"""),format.raw/*45.36*/("""
				//
			"""),format.raw/*47.4*/("""}"""),format.raw/*47.5*/("""
			
			connection.onmessage = function(e) """),format.raw/*49.39*/("""{"""),format.raw/*49.40*/("""
				server_message = e.data;
				if (server_message.indexOf("question_") > -1) """),format.raw/*51.51*/("""{"""),format.raw/*51.52*/("""
					server_message = server_message.replace(
							"question_", "");
					displayQuestion(server_message);
				"""),format.raw/*55.5*/("""}"""),format.raw/*55.6*/("""
			  
			"""),format.raw/*57.4*/("""}"""),format.raw/*57.5*/(""";
			
			connection.onclose = function(e) """),format.raw/*59.37*/("""{"""),format.raw/*59.38*/("""
				//
			"""),format.raw/*61.4*/("""}"""),format.raw/*61.5*/("""
			
			$("#submit_speed").click(function() """),format.raw/*63.40*/("""{"""),format.raw/*63.41*/("""
				$.post("/postVotes", """),format.raw/*64.26*/("""{"""),format.raw/*64.27*/("""
					p_vote: $('input[name=radioGroup]:checked').val()
				"""),format.raw/*66.5*/("""}"""),format.raw/*66.6*/(""")
				document.getElementById("submit_speed").disabled = true;
				document.getElementById("submit_speed").innerHTML = "Voted".bold();
			    
			    setTimeout(function()"""),format.raw/*70.29*/("""{"""),format.raw/*70.30*/("""
			    	document.getElementById("submit_speed").disabled = false;
					document.getElementById("submit_speed").innerHTML = "Vote";	
			    """),format.raw/*73.8*/("""}"""),format.raw/*73.9*/(""", 3000);
			"""),format.raw/*74.4*/("""}"""),format.raw/*74.5*/(""");
			
			$("#submit_volume").click(function() """),format.raw/*76.41*/("""{"""),format.raw/*76.42*/("""
				$.post("/postVotes", """),format.raw/*77.26*/("""{"""),format.raw/*77.27*/("""
					p_vote: $('input[name=radioGroup1]:checked').val()
				"""),format.raw/*79.5*/("""}"""),format.raw/*79.6*/(""")
				document.getElementById("submit_volume").disabled = true;
				document.getElementById("submit_volume").innerHTML = "Voted".bold();

			    setTimeout(function()"""),format.raw/*83.29*/("""{"""),format.raw/*83.30*/("""
			    	document.getElementById("submit_volume").disabled = false;
					document.getElementById("submit_volume").innerHTML = "Vote";	
			    """),format.raw/*86.8*/("""}"""),format.raw/*86.9*/(""", 3000);
			"""),format.raw/*87.4*/("""}"""),format.raw/*87.5*/(""");
			
			$("#submit_pause").click(function() """),format.raw/*89.40*/("""{"""),format.raw/*89.41*/("""
				$.post("/postVotes", """),format.raw/*90.26*/("""{"""),format.raw/*90.27*/("""
					p_vote: $(this).attr("value")
				"""),format.raw/*92.5*/("""}"""),format.raw/*92.6*/(""")
				document.getElementById("submit_pause").disabled = true;
			"""),format.raw/*94.4*/("""}"""),format.raw/*94.5*/(""");
			
			$("#submit_button").click(function() """),format.raw/*96.41*/("""{"""),format.raw/*96.42*/("""
				$.post("/postStudentQuestion", """),format.raw/*97.36*/("""{"""),format.raw/*97.37*/("""
					p_question: $("#question").val()
				"""),format.raw/*99.5*/("""}"""),format.raw/*99.6*/(""").done(function()"""),format.raw/*99.23*/("""{"""),format.raw/*99.24*/("""
					$("#q_area").hide();
					$('#question	').val('');
				"""),format.raw/*102.5*/("""}"""),format.raw/*102.6*/(""")
			"""),format.raw/*103.4*/("""}"""),format.raw/*103.5*/(""");
		
			$("#add").click(function() """),format.raw/*105.31*/("""{"""),format.raw/*105.32*/("""
				$("#q_area").show();
			"""),format.raw/*107.4*/("""}"""),format.raw/*107.5*/(""");		
		
			$("#cancel_button").click(function() """),format.raw/*109.41*/("""{"""),format.raw/*109.42*/("""
    				$("#q_area").hide();
  		 	"""),format.raw/*111.7*/("""}"""),format.raw/*111.8*/(""");
		"""),format.raw/*112.3*/("""}"""),format.raw/*112.4*/(""");
</script>

</head>
<body onload="disablePause();recalculatePause();">
	<div id="container">
		<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
			<a href="/home"><img src=""""),_display_(Seq[Any](/*119.31*/routes/*119.37*/.Assets.at("images/logonew.png"))),format.raw/*119.69*/("""" height="70px"
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
					<div id="posted_question">
					"""),_display_(Seq[Any](/*202.7*/for(questions <- questionList) yield /*202.37*/{_display_(Seq[Any](format.raw/*202.38*/("""
					<div style="background-color: white; margin: 0 10px 10px 0; padding: 7px; border-radius:5px;">
							 """),_display_(Seq[Any](/*204.10*/questions)),format.raw/*204.19*/(""" </div>
					""")))})),format.raw/*205.7*/("""
					
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
                    DATE: Sun Jun 29 23:37:54 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Final/livefeed/app/views/indexStudent.scala.html
                    HASH: f93a83e64aaa9f10528a9bc427bdb701260b1bbf
                    MATRIX: 787->1|909->29|1041->126|1055->132|1110->166|1198->219|1212->225|1265->257|1353->310|1367->316|1420->348|1509->401|1524->407|1578->439|1663->488|1678->494|1742->536|1827->585|1842->591|1918->644|1971->661|1986->667|2053->712|2151->782|2180->783|2295->870|2324->871|2419->939|2447->940|2491->957|2519->958|2578->989|2607->990|2658->1013|2687->1014|2736->1036|2764->1037|2793->1039|2821->1040|2886->1077|2915->1078|3131->1267|3159->1268|3220->1301|3249->1302|3371->1396|3400->1397|3438->1408|3466->1409|3537->1452|3566->1453|3674->1533|3703->1534|3844->1648|3872->1649|3909->1659|3937->1660|4007->1702|4036->1703|4074->1714|4102->1715|4174->1759|4203->1760|4257->1786|4286->1787|4373->1847|4401->1848|4600->2019|4629->2020|4796->2160|4824->2161|4863->2173|4891->2174|4966->2221|4995->2222|5049->2248|5078->2249|5166->2310|5194->2311|5388->2477|5417->2478|5586->2620|5614->2621|5653->2633|5681->2634|5755->2680|5784->2681|5838->2707|5867->2708|5934->2748|5962->2749|6055->2815|6083->2816|6158->2863|6187->2864|6251->2900|6280->2901|6350->2944|6378->2945|6423->2962|6452->2963|6541->3024|6570->3025|6603->3030|6632->3031|6697->3067|6727->3068|6784->3097|6813->3098|6890->3146|6920->3147|6984->3183|7013->3184|7046->3189|7075->3190|7311->3389|7327->3395|7382->3427|10209->6218|10256->6248|10296->6249|10443->6359|10475->6368|10521->6382
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|45->17|45->17|49->21|49->21|51->23|51->23|53->25|53->25|56->28|56->28|57->29|57->29|59->31|59->31|60->32|60->32|62->34|62->34|68->40|68->40|70->42|70->42|73->45|73->45|75->47|75->47|77->49|77->49|79->51|79->51|83->55|83->55|85->57|85->57|87->59|87->59|89->61|89->61|91->63|91->63|92->64|92->64|94->66|94->66|98->70|98->70|101->73|101->73|102->74|102->74|104->76|104->76|105->77|105->77|107->79|107->79|111->83|111->83|114->86|114->86|115->87|115->87|117->89|117->89|118->90|118->90|120->92|120->92|122->94|122->94|124->96|124->96|125->97|125->97|127->99|127->99|127->99|127->99|130->102|130->102|131->103|131->103|133->105|133->105|135->107|135->107|137->109|137->109|139->111|139->111|140->112|140->112|147->119|147->119|147->119|230->202|230->202|230->202|232->204|232->204|233->205
                    -- GENERATED --
                */
            