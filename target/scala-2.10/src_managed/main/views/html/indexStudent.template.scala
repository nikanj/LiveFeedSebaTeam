
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

function displayQuestion(question) """),format.raw/*16.36*/("""{"""),format.raw/*16.37*/("""
	$('#posted_question')
			.append(
					'<div style="background-color: white; margin: 0 10px 10px 0; padding: 7px; border-radius:5px;">'
							+ question + '</div>');
	$(".test").show();
"""),format.raw/*22.1*/("""}"""),format.raw/*22.2*/("""

	 $(document).ready(function() """),format.raw/*24.32*/("""{"""),format.raw/*24.33*/("""
		 var connection = new WebSocket('ws://localhost:9000');

			connection.onopen = function() """),format.raw/*27.35*/("""{"""),format.raw/*27.36*/("""
				//
			"""),format.raw/*29.4*/("""}"""),format.raw/*29.5*/("""
			
			connection.onmessage = function(e) """),format.raw/*31.39*/("""{"""),format.raw/*31.40*/("""
				server_message = e.data;
				if (server_message.indexOf("question_") > -1) """),format.raw/*33.51*/("""{"""),format.raw/*33.52*/("""
					server_message = server_message.replace(
							"question_", "");
					displayQuestion(server_message);
				"""),format.raw/*37.5*/("""}"""),format.raw/*37.6*/("""
			  /*if (server_message.indexOf("question_") > -1) """),format.raw/*38.54*/("""{"""),format.raw/*38.55*/("""
					server_message = server_message.replace(
							"question_", "");
					displayQuestion(server_message);
				"""),format.raw/*42.5*/("""}"""),format.raw/*42.6*/("""*/
			"""),format.raw/*43.4*/("""}"""),format.raw/*43.5*/(""";
			
			connection.onclose = function(e) """),format.raw/*45.37*/("""{"""),format.raw/*45.38*/("""
				//
			"""),format.raw/*47.4*/("""}"""),format.raw/*47.5*/("""
			
			$("#submit_speed").click(function() """),format.raw/*49.40*/("""{"""),format.raw/*49.41*/("""
				$.post("/postVotes", """),format.raw/*50.26*/("""{"""),format.raw/*50.27*/("""
					p_vote: $('input[name=radioGroup]:checked').val()
				"""),format.raw/*52.5*/("""}"""),format.raw/*52.6*/(""")
			"""),format.raw/*53.4*/("""}"""),format.raw/*53.5*/(""");
			
			$("#submit_volume").click(function() """),format.raw/*55.41*/("""{"""),format.raw/*55.42*/("""
				$.post("/postVotes", """),format.raw/*56.26*/("""{"""),format.raw/*56.27*/("""
					p_vote: $('input[name=radioGroup1]:checked').val()
				"""),format.raw/*58.5*/("""}"""),format.raw/*58.6*/(""")
			"""),format.raw/*59.4*/("""}"""),format.raw/*59.5*/(""");
			
			$("#submit_pause").click(function() """),format.raw/*61.40*/("""{"""),format.raw/*61.41*/("""
				$.post("/postVotes", """),format.raw/*62.26*/("""{"""),format.raw/*62.27*/("""
					p_vote: $(this).attr("value")
				"""),format.raw/*64.5*/("""}"""),format.raw/*64.6*/(""")
			"""),format.raw/*65.4*/("""}"""),format.raw/*65.5*/(""");
			
			$("#submit_button").click(function() """),format.raw/*67.41*/("""{"""),format.raw/*67.42*/("""
				$.post("/postStudentQuestion", """),format.raw/*68.36*/("""{"""),format.raw/*68.37*/("""
					p_question: $("#question").val()
				"""),format.raw/*70.5*/("""}"""),format.raw/*70.6*/(""").done(function()"""),format.raw/*70.23*/("""{"""),format.raw/*70.24*/("""
					$("#q_area").hide();
				"""),format.raw/*72.5*/("""}"""),format.raw/*72.6*/(""")
			"""),format.raw/*73.4*/("""}"""),format.raw/*73.5*/(""");
		
			$("#add").click(function() """),format.raw/*75.31*/("""{"""),format.raw/*75.32*/("""
				$("#q_area").show();
			"""),format.raw/*77.4*/("""}"""),format.raw/*77.5*/(""");		
		
			$("#cancel_button").click(function() """),format.raw/*79.41*/("""{"""),format.raw/*79.42*/("""
    				$("#q_area").hide();
  		 	"""),format.raw/*81.7*/("""}"""),format.raw/*81.8*/(""");

  		 	
		"""),format.raw/*84.3*/("""}"""),format.raw/*84.4*/(""");
</script>

</head>
<body>
	<div id="container">
		<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
			<a href="/home"><img src=""""),_display_(Seq[Any](/*91.31*/routes/*91.37*/.Assets.at("images/logonew.png"))),format.raw/*91.69*/("""" height="70px"
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
									id="radio1" value="Speed_Low" type="radio"> LOW
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
									id="radio3" value="Speed_High" type="radio"> FAST
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
									id="radio4" value="Volume_Low" type="radio"> LOW
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
									id="radio6" value="Volume_High" type="radio"> LOUD
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
					"""),_display_(Seq[Any](/*172.7*/for(questions <- questionList) yield /*172.37*/{_display_(Seq[Any](format.raw/*172.38*/("""
					<div style="background-color: white; margin: 0 10px 10px 0; padding: 7px; border-radius:5px;">
							 """),_display_(Seq[Any](/*174.10*/questions)),format.raw/*174.19*/(""" </div>
					""")))})),format.raw/*175.7*/("""
					
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
                    DATE: Thu Jun 26 21:18:21 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Final/livefeed/app/views/indexStudent.scala.html
                    HASH: ff3c80cee4d2806e9ebf4d45fc4efb24c0200e68
                    MATRIX: 787->1|909->29|1041->126|1055->132|1110->166|1198->219|1212->225|1265->257|1353->310|1367->316|1420->348|1509->401|1524->407|1578->439|1663->488|1678->494|1754->547|1807->564|1822->570|1889->615|1998->696|2027->697|2243->886|2271->887|2332->920|2361->921|2483->1015|2512->1016|2550->1027|2578->1028|2649->1071|2678->1072|2786->1152|2815->1153|2956->1267|2984->1268|3066->1322|3095->1323|3236->1437|3264->1438|3297->1444|3325->1445|3395->1487|3424->1488|3462->1499|3490->1500|3562->1544|3591->1545|3645->1571|3674->1572|3761->1632|3789->1633|3821->1638|3849->1639|3924->1686|3953->1687|4007->1713|4036->1714|4124->1775|4152->1776|4184->1781|4212->1782|4286->1828|4315->1829|4369->1855|4398->1856|4465->1896|4493->1897|4525->1902|4553->1903|4628->1950|4657->1951|4721->1987|4750->1988|4820->2031|4848->2032|4893->2049|4922->2050|4980->2081|5008->2082|5040->2087|5068->2088|5132->2124|5161->2125|5217->2154|5245->2155|5321->2203|5350->2204|5413->2240|5441->2241|5481->2254|5509->2255|5700->2410|5715->2416|5769->2448|9524->6167|9571->6197|9611->6198|9758->6308|9790->6317|9836->6331
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|44->16|44->16|50->22|50->22|52->24|52->24|55->27|55->27|57->29|57->29|59->31|59->31|61->33|61->33|65->37|65->37|66->38|66->38|70->42|70->42|71->43|71->43|73->45|73->45|75->47|75->47|77->49|77->49|78->50|78->50|80->52|80->52|81->53|81->53|83->55|83->55|84->56|84->56|86->58|86->58|87->59|87->59|89->61|89->61|90->62|90->62|92->64|92->64|93->65|93->65|95->67|95->67|96->68|96->68|98->70|98->70|98->70|98->70|100->72|100->72|101->73|101->73|103->75|103->75|105->77|105->77|107->79|107->79|109->81|109->81|112->84|112->84|119->91|119->91|119->91|200->172|200->172|200->172|202->174|202->174|203->175
                    -- GENERATED --
                */
            