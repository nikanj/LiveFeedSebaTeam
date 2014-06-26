
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
object profPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[String],Long,Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(questionList: List[String],stats : Long, lectureNumber : Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.65*/(""" """),format.raw/*2.1*/("""

<!DOCTYPE html>

<html>
<head>
<title>Professor Page</title>
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.46*/routes/*9.52*/.Assets.at("stylesheets/main.css"))),format.raw/*9.86*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.51*/routes/*10.57*/.Assets.at("images/favicon.png"))),format.raw/*10.89*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.51*/routes/*11.57*/.Assets.at("images/logonew.png"))),format.raw/*11.89*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*12.47*/routes/*12.53*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*12.106*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*13.47*/routes/*13.53*/.Assets.at("stylesheets/bootstrap/css/table.css"))),format.raw/*13.102*/("""">

<script src=""""),_display_(Seq[Any](/*15.15*/routes/*15.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*15.66*/("""" type="text/javascript"></script>
<script>
/*
	function getUrlVars()	
		"""),format.raw/*19.3*/("""{"""),format.raw/*19.4*/("""
    		var vars = [], hash;
    		var hashes = window.location.href.slice(window.location.href.indexOf('?') + 1).split('&');
    		for(var i = 0; i < hashes.length; i++)
    			"""),format.raw/*23.8*/("""{"""),format.raw/*23.9*/("""
        			hash = hashes[i].split('=');
        			vars.push(hash[0]);
        			vars[hash[0]] = hash[1];
    			"""),format.raw/*27.8*/("""}"""),format.raw/*27.9*/("""
    		return vars;
		"""),format.raw/*29.3*/("""}"""),format.raw/*29.4*/("""

	$("#logout").click(function() """),format.raw/*31.32*/("""{"""),format.raw/*31.33*/("""
		$.post("/postReport", """),format.raw/*32.25*/("""{"""),format.raw/*32.26*/("""
				
				courseName: getUrlVars()["course"]
		"""),format.raw/*35.3*/("""}"""),format.raw/*35.4*/(""" )
	"""),format.raw/*36.2*/("""}"""),format.raw/*36.3*/(""");
	
*/
	var speed_y;
	var voice_y;
	var newVal;
	var server_message;

	function displayQuestion(question) """),format.raw/*44.37*/("""{"""),format.raw/*44.38*/("""
		$('#posted_question')
				.append(
						'<div style="background-color: white; margin: 0 10px 10px 0; padding: 7px; border-radius:5px;">'
								+ question + '</div>');
		$(".test").show();
	"""),format.raw/*50.2*/("""}"""),format.raw/*50.3*/("""
	
	$(document).ready(function() """),format.raw/*52.31*/("""{"""),format.raw/*52.32*/("""

		var connection = new WebSocket('ws://localhost:9000');

		connection.onopen = function() """),format.raw/*56.34*/("""{"""),format.raw/*56.35*/("""
			//
		"""),format.raw/*58.3*/("""}"""),format.raw/*58.4*/("""

		connection.onmessage = function(e) """),format.raw/*60.38*/("""{"""),format.raw/*60.39*/("""
			server_message = e.data;

			if (server_message.indexOf("speed_") > -1) """),format.raw/*63.47*/("""{"""),format.raw/*63.48*/("""
				server_message = server_message.replace("speed_", "");
				speed_y = Number(server_message);
				console.log('speed y: ' + y);
			"""),format.raw/*67.4*/("""}"""),format.raw/*67.5*/(""" else if (server_message.indexOf("loudness_") > -1) """),format.raw/*67.57*/("""{"""),format.raw/*67.58*/("""
				server_message = server_message.replace("loudness_", "");
				voice_y = Number(server_message);
				console.log('Loud y: ' + voice_y);
			"""),format.raw/*71.4*/("""}"""),format.raw/*71.5*/(""" else if (server_message.indexOf("pause_") > -1) """),format.raw/*71.54*/("""{"""),format.raw/*71.55*/("""
				server_message = server_message.replace("pause_", "");
				newVal = parseInt(server_message);
			"""),format.raw/*74.4*/("""}"""),format.raw/*74.5*/("""
			else if (server_message.indexOf("question_") > -1) """),format.raw/*75.55*/("""{"""),format.raw/*75.56*/("""
				server_message = server_message.replace(
						"question_", "");
				displayQuestion(server_message);
			"""),format.raw/*79.4*/("""}"""),format.raw/*79.5*/("""

		"""),format.raw/*81.3*/("""}"""),format.raw/*81.4*/(""";

		connection.onclose = function(e) """),format.raw/*83.36*/("""{"""),format.raw/*83.37*/("""
			//
		"""),format.raw/*85.3*/("""}"""),format.raw/*85.4*/("""
		
		$("#submit_button").click(function() """),format.raw/*87.40*/("""{"""),format.raw/*87.41*/("""
			$.post("/postTheQuestion", """),format.raw/*88.31*/("""{"""),format.raw/*88.32*/("""
				p_question: $("#question").val()
			"""),format.raw/*90.4*/("""}"""),format.raw/*90.5*/(""").done(function()"""),format.raw/*90.22*/("""{"""),format.raw/*90.23*/("""
				$("#q_area").hide();
			"""),format.raw/*92.4*/("""}"""),format.raw/*92.5*/(""")
		"""),format.raw/*93.3*/("""}"""),format.raw/*93.4*/(""");

		
      $("#cancel_button").click(function() """),format.raw/*96.44*/("""{"""),format.raw/*96.45*/("""
       $("#q_area").hide();
      """),format.raw/*98.7*/("""}"""),format.raw/*98.8*/(""");

      $("#add").click(function() """),format.raw/*100.34*/("""{"""),format.raw/*100.35*/("""
       $("#q_area").show();
      """),format.raw/*102.7*/("""}"""),format.raw/*102.8*/(""");
	"""),format.raw/*103.2*/("""}"""),format.raw/*103.3*/(""");

	$(function() """),format.raw/*105.15*/("""{"""),format.raw/*105.16*/("""

		$(document).ready(
				function() """),format.raw/*108.16*/("""{"""),format.raw/*108.17*/("""
					Highcharts.setOptions("""),format.raw/*109.28*/("""{"""),format.raw/*109.29*/("""
						global : """),format.raw/*110.16*/("""{"""),format.raw/*110.17*/("""
							useUTC : false
						"""),format.raw/*112.7*/("""}"""),format.raw/*112.8*/("""
					"""),format.raw/*113.6*/("""}"""),format.raw/*113.7*/(""");

					var chart;
					$('#container-speed-chart').highcharts(
							"""),format.raw/*117.8*/("""{"""),format.raw/*117.9*/("""
								chart : """),format.raw/*118.17*/("""{"""),format.raw/*118.18*/("""
									type : 'spline',
									animation : Highcharts.svg, // don't animate in old IE
									marginRight : 5,
									events : """),format.raw/*122.19*/("""{"""),format.raw/*122.20*/("""
										load : function() """),format.raw/*123.29*/("""{"""),format.raw/*123.30*/("""

											// set up the updating of the chart each second
											var series = this.series[0];
											//var y = 0;

											setInterval(function() """),format.raw/*129.35*/("""{"""),format.raw/*129.36*/("""

												var x = (new Date()).getTime(); // current time
												if (speed_y == null) """),format.raw/*132.34*/("""{"""),format.raw/*132.35*/("""
													speed_y = 50; //used for initialization
												"""),format.raw/*134.13*/("""}"""),format.raw/*134.14*/("""
												series.addPoint([ x, speed_y ],
														true, true);

											"""),format.raw/*138.12*/("""}"""),format.raw/*138.13*/(""", 1000);
										"""),format.raw/*139.11*/("""}"""),format.raw/*139.12*/("""
									"""),format.raw/*140.10*/("""}"""),format.raw/*140.11*/("""
								"""),format.raw/*141.9*/("""}"""),format.raw/*141.10*/(""",
								title : """),format.raw/*142.17*/("""{"""),format.raw/*142.18*/("""
									text : 'Speed'
								"""),format.raw/*144.9*/("""}"""),format.raw/*144.10*/(""",
								xAxis : """),format.raw/*145.17*/("""{"""),format.raw/*145.18*/("""
									title : """),format.raw/*146.18*/("""{"""),format.raw/*146.19*/("""
										text : 'Time'
									"""),format.raw/*148.10*/("""}"""),format.raw/*148.11*/(""",
									type : 'datetime',
									tickPixelInterval : 150
								"""),format.raw/*151.9*/("""}"""),format.raw/*151.10*/(""",

								yAxis : """),format.raw/*153.17*/("""{"""),format.raw/*153.18*/("""
									title : """),format.raw/*154.18*/("""{"""),format.raw/*154.19*/("""
										text : 'Percentage'
									"""),format.raw/*156.10*/("""}"""),format.raw/*156.11*/(""",
									min : 0,
									max : 100,
									labels : """),format.raw/*159.19*/("""{"""),format.raw/*159.20*/("""
										formatter : function() """),format.raw/*160.34*/("""{"""),format.raw/*160.35*/("""
											if (this.value == 100) """),format.raw/*161.35*/("""{"""),format.raw/*161.36*/("""
												return 'Too Fast';
											"""),format.raw/*163.12*/("""}"""),format.raw/*163.13*/("""

											if (this.value == 50) """),format.raw/*165.34*/("""{"""),format.raw/*165.35*/("""
												return 'OK';
											"""),format.raw/*167.12*/("""}"""),format.raw/*167.13*/("""

											if (this.value == 0) """),format.raw/*169.33*/("""{"""),format.raw/*169.34*/("""
												return 'Too Slow';
											"""),format.raw/*171.12*/("""}"""),format.raw/*171.13*/("""
										"""),format.raw/*172.11*/("""}"""),format.raw/*172.12*/("""
									"""),format.raw/*173.10*/("""}"""),format.raw/*173.11*/(""",
								"""),format.raw/*174.9*/("""}"""),format.raw/*174.10*/(""",
								tooltip : """),format.raw/*175.19*/("""{"""),format.raw/*175.20*/("""
									formatter : function() """),format.raw/*176.33*/("""{"""),format.raw/*176.34*/("""
										return 'At time: '
												+ Highcharts.dateFormat(
														'%H:%M:%S', this.x)
												+ '<br/>'
												+ 'Average speed requested '
												+ Highcharts.numberFormat(
														this.speed_y, 2) + '%';
									"""),format.raw/*184.10*/("""}"""),format.raw/*184.11*/("""
								"""),format.raw/*185.9*/("""}"""),format.raw/*185.10*/(""",
								legend : """),format.raw/*186.18*/("""{"""),format.raw/*186.19*/("""
									enabled : false
								"""),format.raw/*188.9*/("""}"""),format.raw/*188.10*/(""",
								exporting : """),format.raw/*189.21*/("""{"""),format.raw/*189.22*/("""
									enabled : false
								"""),format.raw/*191.9*/("""}"""),format.raw/*191.10*/(""",
								series : [ """),format.raw/*192.20*/("""{"""),format.raw/*192.21*/("""
									name : 'Random data',
									data : (function() """),format.raw/*194.29*/("""{"""),format.raw/*194.30*/("""
										// generate an array of random data
										var data = [], time = (new Date())
												.getTime(), i;

										for (i = -19; i <= 0; i++) """),format.raw/*199.38*/("""{"""),format.raw/*199.39*/("""
											data.push("""),format.raw/*200.22*/("""{"""),format.raw/*200.23*/("""
												x : time + i * 1000,
												speed_y : 50
											"""),format.raw/*203.12*/("""}"""),format.raw/*203.13*/(""");
										"""),format.raw/*204.11*/("""}"""),format.raw/*204.12*/("""
										return data;
									"""),format.raw/*206.10*/("""}"""),format.raw/*206.11*/(""")()
								"""),format.raw/*207.9*/("""}"""),format.raw/*207.10*/(""" ]
							"""),format.raw/*208.8*/("""}"""),format.raw/*208.9*/(""");
				"""),format.raw/*209.5*/("""}"""),format.raw/*209.6*/(""");

	"""),format.raw/*211.2*/("""}"""),format.raw/*211.3*/(""");

	$(function() """),format.raw/*213.15*/("""{"""),format.raw/*213.16*/("""
		$(document).ready(
				function() """),format.raw/*215.16*/("""{"""),format.raw/*215.17*/("""
					Highcharts.setOptions("""),format.raw/*216.28*/("""{"""),format.raw/*216.29*/("""
						global : """),format.raw/*217.16*/("""{"""),format.raw/*217.17*/("""
							useUTC : false
						"""),format.raw/*219.7*/("""}"""),format.raw/*219.8*/("""
					"""),format.raw/*220.6*/("""}"""),format.raw/*220.7*/(""");

					var chart;
					$('#container-loudness-chart').highcharts(
							"""),format.raw/*224.8*/("""{"""),format.raw/*224.9*/("""
								chart : """),format.raw/*225.17*/("""{"""),format.raw/*225.18*/("""
									type : 'spline',
									animation : Highcharts.svg, // don't animate in old IE
									marginRight : 5,
									events : """),format.raw/*229.19*/("""{"""),format.raw/*229.20*/("""
										load : function() """),format.raw/*230.29*/("""{"""),format.raw/*230.30*/("""

											// set up the updating of the chart each second
											var series = this.series[0];
											//var y = 0;
											//var server_message;

											setInterval(function() """),format.raw/*237.35*/("""{"""),format.raw/*237.36*/("""

												//var connection = new WebSocket('ws://localhost:9000');  //initialize the websocket inside the "interval loop"

												var x = (new Date()).getTime(); // current time
												if (voice_y == null) """),format.raw/*242.34*/("""{"""),format.raw/*242.35*/("""
													voice_y = 50; //used for initialization
												"""),format.raw/*244.13*/("""}"""),format.raw/*244.14*/("""
												series.addPoint([ x, voice_y ],
														true, true);

											"""),format.raw/*248.12*/("""}"""),format.raw/*248.13*/(""", 1000);
										"""),format.raw/*249.11*/("""}"""),format.raw/*249.12*/("""
									"""),format.raw/*250.10*/("""}"""),format.raw/*250.11*/("""
								"""),format.raw/*251.9*/("""}"""),format.raw/*251.10*/(""",
								title : """),format.raw/*252.17*/("""{"""),format.raw/*252.18*/("""
									text : 'Loudness'
								"""),format.raw/*254.9*/("""}"""),format.raw/*254.10*/(""",
								xAxis : """),format.raw/*255.17*/("""{"""),format.raw/*255.18*/("""
									title : """),format.raw/*256.18*/("""{"""),format.raw/*256.19*/("""
										text : 'Time'
									"""),format.raw/*258.10*/("""}"""),format.raw/*258.11*/(""",
									type : 'datetime',
									tickPixelInterval : 150
								"""),format.raw/*261.9*/("""}"""),format.raw/*261.10*/(""",

								yAxis : """),format.raw/*263.17*/("""{"""),format.raw/*263.18*/("""
									title : """),format.raw/*264.18*/("""{"""),format.raw/*264.19*/("""
										text : 'Percentage'
									"""),format.raw/*266.10*/("""}"""),format.raw/*266.11*/(""",
									min : 0,
									max : 100,
									labels : """),format.raw/*269.19*/("""{"""),format.raw/*269.20*/("""
										formatter : function() """),format.raw/*270.34*/("""{"""),format.raw/*270.35*/("""
											if (this.value == 100) """),format.raw/*271.35*/("""{"""),format.raw/*271.36*/("""
												return 'Too Loud';
											"""),format.raw/*273.12*/("""}"""),format.raw/*273.13*/("""

											if (this.value == 50) """),format.raw/*275.34*/("""{"""),format.raw/*275.35*/("""
												return 'OK';
											"""),format.raw/*277.12*/("""}"""),format.raw/*277.13*/("""

											if (this.value == 0) """),format.raw/*279.33*/("""{"""),format.raw/*279.34*/("""
												return 'Too Low';
											"""),format.raw/*281.12*/("""}"""),format.raw/*281.13*/("""
										"""),format.raw/*282.11*/("""}"""),format.raw/*282.12*/("""
									"""),format.raw/*283.10*/("""}"""),format.raw/*283.11*/(""",
								"""),format.raw/*284.9*/("""}"""),format.raw/*284.10*/(""",
								tooltip : """),format.raw/*285.19*/("""{"""),format.raw/*285.20*/("""
									formatter : function() """),format.raw/*286.33*/("""{"""),format.raw/*286.34*/("""
										return 'At time: '
												+ Highcharts.dateFormat(
														'%H:%M:%S', this.x)
												+ '<br/>'
												+ 'Average loudness requested '
												+ Highcharts.numberFormat(
														this.voice_y, 2) + '%';
									"""),format.raw/*294.10*/("""}"""),format.raw/*294.11*/("""
								"""),format.raw/*295.9*/("""}"""),format.raw/*295.10*/(""",
								legend : """),format.raw/*296.18*/("""{"""),format.raw/*296.19*/("""
									enabled : false
								"""),format.raw/*298.9*/("""}"""),format.raw/*298.10*/(""",
								exporting : """),format.raw/*299.21*/("""{"""),format.raw/*299.22*/("""
									enabled : false
								"""),format.raw/*301.9*/("""}"""),format.raw/*301.10*/(""",
								series : [ """),format.raw/*302.20*/("""{"""),format.raw/*302.21*/("""
									name : 'Random data',
									data : (function() """),format.raw/*304.29*/("""{"""),format.raw/*304.30*/("""
										// generate an array of random data
										var data = [], time = (new Date())
												.getTime(), i;

										for (i = -19; i <= 0; i++) """),format.raw/*309.38*/("""{"""),format.raw/*309.39*/("""
											data.push("""),format.raw/*310.22*/("""{"""),format.raw/*310.23*/("""
												x : time + i * 1000,
												voice_y : 50
											//initialization 
											"""),format.raw/*314.12*/("""}"""),format.raw/*314.13*/(""");
										"""),format.raw/*315.11*/("""}"""),format.raw/*315.12*/("""
										return data;
									"""),format.raw/*317.10*/("""}"""),format.raw/*317.11*/(""")()
								"""),format.raw/*318.9*/("""}"""),format.raw/*318.10*/(""" ]
							"""),format.raw/*319.8*/("""}"""),format.raw/*319.9*/(""");
				"""),format.raw/*320.5*/("""}"""),format.raw/*320.6*/(""");

	"""),format.raw/*322.2*/("""}"""),format.raw/*322.3*/(""");

	$(function() """),format.raw/*324.15*/("""{"""),format.raw/*324.16*/("""

		var gaugeOptions = """),format.raw/*326.22*/("""{"""),format.raw/*326.23*/("""

			chart : """),format.raw/*328.12*/("""{"""),format.raw/*328.13*/("""
				type : 'solidgauge'
			"""),format.raw/*330.4*/("""}"""),format.raw/*330.5*/(""",

			title : null,

			pane : """),format.raw/*334.11*/("""{"""),format.raw/*334.12*/("""
				center : [ '50%', '85%' ],
				size : '140%',
				startAngle : -90,
				endAngle : 90,
				background : """),format.raw/*339.18*/("""{"""),format.raw/*339.19*/("""
					backgroundColor : (Highcharts.theme && Highcharts.theme.background2)
							|| '#EEE',
					innerRadius : '60%',
					outerRadius : '100%',
					shape : 'arc'
				"""),format.raw/*345.5*/("""}"""),format.raw/*345.6*/("""
			"""),format.raw/*346.4*/("""}"""),format.raw/*346.5*/(""",

			tooltip : """),format.raw/*348.14*/("""{"""),format.raw/*348.15*/("""
				enabled : true
			"""),format.raw/*350.4*/("""}"""),format.raw/*350.5*/(""",

			// the value axis
			yAxis : """),format.raw/*353.12*/("""{"""),format.raw/*353.13*/("""
				stops : [ [ 0.1, '#55BF3B' ], // green
				[ 0.5, '#DDDF0D' ], // yellow
				[ 0.9, '#DF5353' ] // red
				],
				lineWidth : 0,
				minorTickInterval : null,
				tickPixelInterval : 400,
				tickWidth : 0,
				title : """),format.raw/*362.13*/("""{"""),format.raw/*362.14*/("""
					y : -70
				"""),format.raw/*364.5*/("""}"""),format.raw/*364.6*/(""",
				labels : """),format.raw/*365.14*/("""{"""),format.raw/*365.15*/("""
					y : 16
				"""),format.raw/*367.5*/("""}"""),format.raw/*367.6*/("""
			"""),format.raw/*368.4*/("""}"""),format.raw/*368.5*/(""",

			plotOptions : """),format.raw/*370.18*/("""{"""),format.raw/*370.19*/("""
				solidgauge : """),format.raw/*371.18*/("""{"""),format.raw/*371.19*/("""
					dataLabels : """),format.raw/*372.19*/("""{"""),format.raw/*372.20*/("""
						y : 5,
						borderWidth : 0,
						useHTML : true
					"""),format.raw/*376.6*/("""}"""),format.raw/*376.7*/(""",
					states : """),format.raw/*377.15*/("""{"""),format.raw/*377.16*/("""
						hover : """),format.raw/*378.15*/("""{"""),format.raw/*378.16*/("""
							enabled : true
						"""),format.raw/*380.7*/("""}"""),format.raw/*380.8*/("""
					"""),format.raw/*381.6*/("""}"""),format.raw/*381.7*/("""

				"""),format.raw/*383.5*/("""}"""),format.raw/*383.6*/("""

			"""),format.raw/*385.4*/("""}"""),format.raw/*385.5*/("""
		"""),format.raw/*386.3*/("""}"""),format.raw/*386.4*/(""";

		// The speed gauge
		$('#container-speed')
				.highcharts(
						Highcharts
								.merge(
										gaugeOptions,
										"""),format.raw/*394.11*/("""{"""),format.raw/*394.12*/("""
											yAxis : """),format.raw/*395.20*/("""{"""),format.raw/*395.21*/("""
												min : 0,
												max : 100,
												title : """),format.raw/*398.21*/("""{"""),format.raw/*398.22*/("""
													text : 'Pause'
												"""),format.raw/*400.13*/("""}"""),format.raw/*400.14*/("""
											"""),format.raw/*401.12*/("""}"""),format.raw/*401.13*/(""",

											credits : """),format.raw/*403.22*/("""{"""),format.raw/*403.23*/("""
												enabled : false
											"""),format.raw/*405.12*/("""}"""),format.raw/*405.13*/(""",

											series : [ """),format.raw/*407.23*/("""{"""),format.raw/*407.24*/("""
												name : 'Pause',
												data : [ 0 ],
												dataLabels : """),format.raw/*410.26*/("""{"""),format.raw/*410.27*/("""
													format : '<div style="text-align:center"><span style="font-size:25px;color:'
															+ ((Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black')
															+ '">"""),format.raw/*413.21*/("""{"""),format.raw/*413.22*/("""y"""),format.raw/*413.23*/("""}"""),format.raw/*413.24*/("""</span><br/>'
															+ '<span style="font-size:12px;color:silver">Pause counts</span></div>'
												"""),format.raw/*415.13*/("""}"""),format.raw/*415.14*/(""",
												tooltip : """),format.raw/*416.23*/("""{"""),format.raw/*416.24*/("""
													valueSuffix : 'Number of persons voted for pause'
												"""),format.raw/*418.13*/("""}"""),format.raw/*418.14*/("""
											"""),format.raw/*419.12*/("""}"""),format.raw/*419.13*/(""" ]

										"""),format.raw/*421.11*/("""}"""),format.raw/*421.12*/("""));

		// The RPM gauge
		;
		//var newVal;
		// Bring life to the dials
		setInterval(function() """),format.raw/*427.26*/("""{"""),format.raw/*427.27*/("""

			// Speed
			var chart = $('#container-speed').highcharts();
			if (chart) """),format.raw/*431.15*/("""{"""),format.raw/*431.16*/("""
				var point = chart.series[0].points[0];
				//   inc = Math.round((Math.random() - 0.5) * 100);

				// newVal = point.y + inc;
				/*  if (newVal < 0 || newVal > 100) """),format.raw/*436.41*/("""{"""),format.raw/*436.42*/("""
				      newVal = point.y - inc;
				  """),format.raw/*438.7*/("""}"""),format.raw/*438.8*/("""*/
				console.log('pause 2: ' + newVal);
				point.update(newVal);
			"""),format.raw/*441.4*/("""}"""),format.raw/*441.5*/("""

		"""),format.raw/*443.3*/("""}"""),format.raw/*443.4*/(""", 2000);

	"""),format.raw/*445.2*/("""}"""),format.raw/*445.3*/(""");
</script>

</head>
<body>
	<div id="container">
		<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
			<img src=""""),_display_(Seq[Any](/*452.15*/routes/*452.21*/.Assets.at("images/logonew.png"))),format.raw/*452.53*/("""" height="70px"
				width="150px" alt="Live Feed" style="border: 1px solid black;">
			<form method="get" action="/signout" style="display: inline-block; float: right; margin-top: 30px;">
				<button type="submit" class="btn btn-danger" id="logout" name="logoutButton" style="width:150px">Logout</button>
			</form>
		</div>
		<header class="navbar navbar-static-top bs-docs-nav" id="top">
			<div class="btn-group" style="float: right;">
				<a type="button" class="btn btn-default" href="/home">Home</a> 
				<a type="button" class="btn btn-default" href="/aboutus">About Us</a> 
				<a type="button" class="btn btn-default" href="/contact">Contact</a> 
				<a type="button" class="btn btn-default" href="/feedback">Feedback</a>
			</div>
		</header>
		
		
		<div class="well" style="width: 200px; float: left;">"""),_display_(Seq[Any](/*468.57*/lectureNumber)),format.raw/*468.70*/("""</div>
		<table>
			<thead>
				<tr>
					<th width=50% height=50%><script
							src="http://code.highcharts.com/highcharts.js"></script> <script
							src="http://code.highcharts.com/modules/exporting.js"></script>
						<div id="container-speed-chart"></div></th>
					<th width=50%><script
							src="http://code.highcharts.com/highcharts.js"></script> <script
							src="http://code.highcharts.com/modules/exporting.js"></script>
						<div id="container-loudness-chart"></div></th>
				</tr>
			</thead>
			
			<tbody>
				<tr>
					<td width="50%" height="50%">
						<div id="questions_row1" style="margin-left: 100px; height: 400px;">
							<h2>Question Section</h2>
							
							<div id="posted_question">
							"""),_display_(Seq[Any](/*490.9*/for(questions <- questionList) yield /*490.39*/{_display_(Seq[Any](format.raw/*490.40*/("""
								<div style="background-color: white; margin: 0 10px 10px 0; padding: 7px; border-radius:5px;">
								 """),_display_(Seq[Any](/*492.11*/questions)),format.raw/*492.20*/("""	 </div>
							""")))})),format.raw/*493.9*/("""
							</div>
	
							<div class="well col-lg-4">
								<a type="button" class="btn btn-primary btn-group-justified"
									id="add">Add Question</a>
							</div>
							<div id="q_area" class="well col-sm-10" style="display: none;">
								<textarea class="form-control" rows="3" columns="50"
									id="question" placeholder="Enter Question Here" name="p_question"></textarea>
								<div class="btn-group-justified" style="margin-top: 20px;">
									<a id="submit_button" class="btn btn-success" type="button">Submit</a>
									<a id="cancel_button" class="btn btn-danger" type="button">Cancel</a>
								</div>
							</div>
							
						</div>
					</td>
					<td width="50%">
						<div id="pause_gauge">
							<script src="http://code.highcharts.com/highcharts.js"></script>
							<script src="http://code.highcharts.com/highcharts-more.js"></script>
	
							<script
								src="http://code.highcharts.com/modules/solid-gauge.src.js"></script>
	
							<div style="width: 600px; height: 400px; margin: 0 auto">
								<div id="container-speed"
									style="width: 300px; height: 200px; float: left"></div>
								<div id="container-rpm"
									style="width: 300px; height: 200px; float: left"></div>
							</div>
						</div>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>"""))}
    }
    
    def render(questionList:List[String],stats:Long,lectureNumber:Long): play.api.templates.HtmlFormat.Appendable = apply(questionList,stats,lectureNumber)
    
    def f:((List[String],Long,Long) => play.api.templates.HtmlFormat.Appendable) = (questionList,stats,lectureNumber) => apply(questionList,stats,lectureNumber)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jun 26 21:18:21 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Final/livefeed/app/views/profPage.scala.html
                    HASH: 8de5a90aecf41b7874e289049f3b8d9a3a53c43e
                    MATRIX: 793->1|967->64|994->83|1144->198|1158->204|1213->238|1303->292|1318->298|1372->330|1462->384|1477->390|1531->422|1617->472|1632->478|1708->531|1794->581|1809->587|1881->636|1937->656|1952->662|2019->707|2123->784|2151->785|2359->966|2387->967|2533->1086|2561->1087|2612->1111|2640->1112|2703->1147|2732->1148|2786->1174|2815->1175|2892->1225|2920->1226|2952->1231|2980->1232|3123->1347|3152->1348|3380->1549|3408->1550|3471->1585|3500->1586|3625->1683|3654->1684|3692->1695|3720->1696|3789->1737|3818->1738|3925->1817|3954->1818|4120->1957|4148->1958|4228->2010|4257->2011|4431->2158|4459->2159|4536->2208|4565->2209|4697->2314|4725->2315|4809->2371|4838->2372|4979->2486|5007->2487|5040->2493|5068->2494|5136->2534|5165->2535|5203->2546|5231->2547|5304->2592|5333->2593|5393->2625|5422->2626|5492->2669|5520->2670|5565->2687|5594->2688|5652->2719|5680->2720|5712->2725|5740->2726|5821->2779|5850->2780|5914->2817|5942->2818|6010->2857|6040->2858|6105->2895|6134->2896|6167->2901|6196->2902|6245->2922|6275->2923|6345->2964|6375->2965|6433->2994|6463->2995|6509->3012|6539->3013|6598->3044|6627->3045|6662->3052|6691->3053|6795->3129|6824->3130|6871->3148|6901->3149|7069->3288|7099->3289|7158->3319|7188->3320|7383->3486|7413->3487|7540->3585|7570->3586|7667->3654|7697->3655|7814->3743|7844->3744|7893->3764|7923->3765|7963->3776|7993->3777|8031->3787|8061->3788|8109->3807|8139->3808|8202->3843|8232->3844|8280->3863|8310->3864|8358->3883|8388->3884|8453->3920|8483->3921|8585->3995|8615->3996|8665->4017|8695->4018|8743->4037|8773->4038|8844->4080|8874->4081|8964->4142|8994->4143|9058->4178|9088->4179|9153->4215|9183->4216|9257->4261|9287->4262|9353->4299|9383->4300|9451->4339|9481->4340|9546->4376|9576->4377|9650->4422|9680->4423|9721->4435|9751->4436|9791->4447|9821->4448|9860->4459|9890->4460|9940->4481|9970->4482|10033->4516|10063->4517|10350->4775|10380->4776|10418->4786|10448->4787|10497->4807|10527->4808|10591->4844|10621->4845|10673->4868|10703->4869|10767->4905|10797->4906|10848->4928|10878->4929|10969->4991|10999->4992|11190->5154|11220->5155|11272->5178|11302->5179|11404->5252|11434->5253|11477->5267|11507->5268|11571->5303|11601->5304|11642->5317|11672->5318|11711->5329|11740->5330|11776->5338|11805->5339|11840->5346|11869->5347|11918->5367|11948->5368|12016->5407|12046->5408|12104->5437|12134->5438|12180->5455|12210->5456|12269->5487|12298->5488|12333->5495|12362->5496|12469->5575|12498->5576|12545->5594|12575->5595|12743->5734|12773->5735|12832->5765|12862->5766|13091->5966|13121->5967|13375->6192|13405->6193|13502->6261|13532->6262|13649->6350|13679->6351|13728->6371|13758->6372|13798->6383|13828->6384|13866->6394|13896->6395|13944->6414|13974->6415|14040->6453|14070->6454|14118->6473|14148->6474|14196->6493|14226->6494|14291->6530|14321->6531|14423->6605|14453->6606|14503->6627|14533->6628|14581->6647|14611->6648|14682->6690|14712->6691|14802->6752|14832->6753|14896->6788|14926->6789|14991->6825|15021->6826|15095->6871|15125->6872|15191->6909|15221->6910|15289->6949|15319->6950|15384->6986|15414->6987|15487->7031|15517->7032|15558->7044|15588->7045|15628->7056|15658->7057|15697->7068|15727->7069|15777->7090|15807->7091|15870->7125|15900->7126|16190->7387|16220->7388|16258->7398|16288->7399|16337->7419|16367->7420|16431->7456|16461->7457|16513->7480|16543->7481|16607->7517|16637->7518|16688->7540|16718->7541|16809->7603|16839->7604|17030->7766|17060->7767|17112->7790|17142->7791|17274->7894|17304->7895|17347->7909|17377->7910|17441->7945|17471->7946|17512->7959|17542->7960|17581->7971|17610->7972|17646->7980|17675->7981|17710->7988|17739->7989|17788->8009|17818->8010|17872->8035|17902->8036|17946->8051|17976->8052|18034->8082|18063->8083|18127->8118|18157->8119|18300->8233|18330->8234|18533->8409|18562->8410|18595->8415|18624->8416|18671->8434|18701->8435|18754->8460|18783->8461|18850->8499|18880->8500|19142->8733|19172->8734|19220->8754|19249->8755|19294->8771|19324->8772|19371->8791|19400->8792|19433->8797|19462->8798|19513->8820|19543->8821|19591->8840|19621->8841|19670->8861|19700->8862|19795->8929|19824->8930|19870->8947|19900->8948|19945->8964|19975->8965|20034->8996|20063->8997|20098->9004|20127->9005|20163->9013|20192->9014|20227->9021|20256->9022|20288->9026|20317->9027|20486->9167|20516->9168|20566->9189|20596->9190|20693->9258|20723->9259|20795->9302|20825->9303|20867->9316|20897->9317|20952->9343|20982->9344|21053->9386|21083->9387|21139->9414|21169->9415|21281->9498|21311->9499|21541->9700|21571->9701|21601->9702|21631->9703|21775->9818|21805->9819|21859->9844|21889->9845|21996->9923|22026->9924|22068->9937|22098->9938|22143->9954|22173->9955|22306->10059|22336->10060|22448->10143|22478->10144|22684->10321|22714->10322|22785->10365|22814->10366|22916->10440|22945->10441|22979->10447|23008->10448|23049->10461|23078->10462|23261->10608|23277->10614|23332->10646|24200->11477|24236->11490|25024->12242|25071->12272|25111->12273|25264->12389|25296->12398|25346->12416
                    LINES: 26->1|30->1|30->2|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|43->15|43->15|43->15|47->19|47->19|51->23|51->23|55->27|55->27|57->29|57->29|59->31|59->31|60->32|60->32|63->35|63->35|64->36|64->36|72->44|72->44|78->50|78->50|80->52|80->52|84->56|84->56|86->58|86->58|88->60|88->60|91->63|91->63|95->67|95->67|95->67|95->67|99->71|99->71|99->71|99->71|102->74|102->74|103->75|103->75|107->79|107->79|109->81|109->81|111->83|111->83|113->85|113->85|115->87|115->87|116->88|116->88|118->90|118->90|118->90|118->90|120->92|120->92|121->93|121->93|124->96|124->96|126->98|126->98|128->100|128->100|130->102|130->102|131->103|131->103|133->105|133->105|136->108|136->108|137->109|137->109|138->110|138->110|140->112|140->112|141->113|141->113|145->117|145->117|146->118|146->118|150->122|150->122|151->123|151->123|157->129|157->129|160->132|160->132|162->134|162->134|166->138|166->138|167->139|167->139|168->140|168->140|169->141|169->141|170->142|170->142|172->144|172->144|173->145|173->145|174->146|174->146|176->148|176->148|179->151|179->151|181->153|181->153|182->154|182->154|184->156|184->156|187->159|187->159|188->160|188->160|189->161|189->161|191->163|191->163|193->165|193->165|195->167|195->167|197->169|197->169|199->171|199->171|200->172|200->172|201->173|201->173|202->174|202->174|203->175|203->175|204->176|204->176|212->184|212->184|213->185|213->185|214->186|214->186|216->188|216->188|217->189|217->189|219->191|219->191|220->192|220->192|222->194|222->194|227->199|227->199|228->200|228->200|231->203|231->203|232->204|232->204|234->206|234->206|235->207|235->207|236->208|236->208|237->209|237->209|239->211|239->211|241->213|241->213|243->215|243->215|244->216|244->216|245->217|245->217|247->219|247->219|248->220|248->220|252->224|252->224|253->225|253->225|257->229|257->229|258->230|258->230|265->237|265->237|270->242|270->242|272->244|272->244|276->248|276->248|277->249|277->249|278->250|278->250|279->251|279->251|280->252|280->252|282->254|282->254|283->255|283->255|284->256|284->256|286->258|286->258|289->261|289->261|291->263|291->263|292->264|292->264|294->266|294->266|297->269|297->269|298->270|298->270|299->271|299->271|301->273|301->273|303->275|303->275|305->277|305->277|307->279|307->279|309->281|309->281|310->282|310->282|311->283|311->283|312->284|312->284|313->285|313->285|314->286|314->286|322->294|322->294|323->295|323->295|324->296|324->296|326->298|326->298|327->299|327->299|329->301|329->301|330->302|330->302|332->304|332->304|337->309|337->309|338->310|338->310|342->314|342->314|343->315|343->315|345->317|345->317|346->318|346->318|347->319|347->319|348->320|348->320|350->322|350->322|352->324|352->324|354->326|354->326|356->328|356->328|358->330|358->330|362->334|362->334|367->339|367->339|373->345|373->345|374->346|374->346|376->348|376->348|378->350|378->350|381->353|381->353|390->362|390->362|392->364|392->364|393->365|393->365|395->367|395->367|396->368|396->368|398->370|398->370|399->371|399->371|400->372|400->372|404->376|404->376|405->377|405->377|406->378|406->378|408->380|408->380|409->381|409->381|411->383|411->383|413->385|413->385|414->386|414->386|422->394|422->394|423->395|423->395|426->398|426->398|428->400|428->400|429->401|429->401|431->403|431->403|433->405|433->405|435->407|435->407|438->410|438->410|441->413|441->413|441->413|441->413|443->415|443->415|444->416|444->416|446->418|446->418|447->419|447->419|449->421|449->421|455->427|455->427|459->431|459->431|464->436|464->436|466->438|466->438|469->441|469->441|471->443|471->443|473->445|473->445|480->452|480->452|480->452|496->468|496->468|518->490|518->490|518->490|520->492|520->492|521->493
                    -- GENERATED --
                */
            