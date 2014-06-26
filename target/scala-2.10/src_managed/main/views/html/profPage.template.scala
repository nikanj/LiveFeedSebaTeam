
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
object profPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(stats : Long, lectureNumber : Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.38*/(""" """),format.raw/*2.1*/("""

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
			alert("CONNECTION IS CLOSED~");
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
							
							<div id="posted_question"></div>
	
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
    
    def render(stats:Long,lectureNumber:Long): play.api.templates.HtmlFormat.Appendable = apply(stats,lectureNumber)
    
    def f:((Long,Long) => play.api.templates.HtmlFormat.Appendable) = (stats,lectureNumber) => apply(stats,lectureNumber)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jun 26 15:15:37 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Final/livefeed/app/views/profPage.scala.html
                    HASH: 1a49556e7f13c2505bf619adf16344a4ae88dbe1
                    MATRIX: 780->1|927->37|954->56|1104->171|1118->177|1173->211|1263->265|1278->271|1332->303|1422->357|1437->363|1491->395|1577->445|1592->451|1668->504|1754->554|1769->560|1841->609|1897->629|1912->635|1979->680|2083->757|2111->758|2319->939|2347->940|2493->1059|2521->1060|2572->1084|2600->1085|2663->1120|2692->1121|2746->1147|2775->1148|2852->1198|2880->1199|2912->1204|2940->1205|3083->1320|3112->1321|3340->1522|3368->1523|3431->1558|3460->1559|3585->1656|3614->1657|3652->1668|3680->1669|3749->1710|3778->1711|3885->1790|3914->1791|4080->1930|4108->1931|4188->1983|4217->1984|4391->2131|4419->2132|4496->2181|4525->2182|4657->2287|4685->2288|4769->2344|4798->2345|4939->2459|4967->2460|5000->2466|5028->2467|5096->2507|5125->2508|5192->2548|5220->2549|5293->2594|5322->2595|5382->2627|5411->2628|5481->2671|5509->2672|5554->2689|5583->2690|5641->2721|5669->2722|5701->2727|5729->2728|5810->2781|5839->2782|5903->2819|5931->2820|5999->2859|6029->2860|6094->2897|6123->2898|6156->2903|6185->2904|6234->2924|6264->2925|6334->2966|6364->2967|6422->2996|6452->2997|6498->3014|6528->3015|6587->3046|6616->3047|6651->3054|6680->3055|6784->3131|6813->3132|6860->3150|6890->3151|7058->3290|7088->3291|7147->3321|7177->3322|7372->3488|7402->3489|7529->3587|7559->3588|7656->3656|7686->3657|7803->3745|7833->3746|7882->3766|7912->3767|7952->3778|7982->3779|8020->3789|8050->3790|8098->3809|8128->3810|8191->3845|8221->3846|8269->3865|8299->3866|8347->3885|8377->3886|8442->3922|8472->3923|8574->3997|8604->3998|8654->4019|8684->4020|8732->4039|8762->4040|8833->4082|8863->4083|8953->4144|8983->4145|9047->4180|9077->4181|9142->4217|9172->4218|9246->4263|9276->4264|9342->4301|9372->4302|9440->4341|9470->4342|9535->4378|9565->4379|9639->4424|9669->4425|9710->4437|9740->4438|9780->4449|9810->4450|9849->4461|9879->4462|9929->4483|9959->4484|10022->4518|10052->4519|10339->4777|10369->4778|10407->4788|10437->4789|10486->4809|10516->4810|10580->4846|10610->4847|10662->4870|10692->4871|10756->4907|10786->4908|10837->4930|10867->4931|10958->4993|10988->4994|11179->5156|11209->5157|11261->5180|11291->5181|11393->5254|11423->5255|11466->5269|11496->5270|11560->5305|11590->5306|11631->5319|11661->5320|11700->5331|11729->5332|11765->5340|11794->5341|11829->5348|11858->5349|11907->5369|11937->5370|12005->5409|12035->5410|12093->5439|12123->5440|12169->5457|12199->5458|12258->5489|12287->5490|12322->5497|12351->5498|12458->5577|12487->5578|12534->5596|12564->5597|12732->5736|12762->5737|12821->5767|12851->5768|13080->5968|13110->5969|13364->6194|13394->6195|13491->6263|13521->6264|13638->6352|13668->6353|13717->6373|13747->6374|13787->6385|13817->6386|13855->6396|13885->6397|13933->6416|13963->6417|14029->6455|14059->6456|14107->6475|14137->6476|14185->6495|14215->6496|14280->6532|14310->6533|14412->6607|14442->6608|14492->6629|14522->6630|14570->6649|14600->6650|14671->6692|14701->6693|14791->6754|14821->6755|14885->6790|14915->6791|14980->6827|15010->6828|15084->6873|15114->6874|15180->6911|15210->6912|15278->6951|15308->6952|15373->6988|15403->6989|15476->7033|15506->7034|15547->7046|15577->7047|15617->7058|15647->7059|15686->7070|15716->7071|15766->7092|15796->7093|15859->7127|15889->7128|16179->7389|16209->7390|16247->7400|16277->7401|16326->7421|16356->7422|16420->7458|16450->7459|16502->7482|16532->7483|16596->7519|16626->7520|16677->7542|16707->7543|16798->7605|16828->7606|17019->7768|17049->7769|17101->7792|17131->7793|17263->7896|17293->7897|17336->7911|17366->7912|17430->7947|17460->7948|17501->7961|17531->7962|17570->7973|17599->7974|17635->7982|17664->7983|17699->7990|17728->7991|17777->8011|17807->8012|17861->8037|17891->8038|17935->8053|17965->8054|18023->8084|18052->8085|18116->8120|18146->8121|18289->8235|18319->8236|18522->8411|18551->8412|18584->8417|18613->8418|18660->8436|18690->8437|18743->8462|18772->8463|18839->8501|18869->8502|19131->8735|19161->8736|19209->8756|19238->8757|19283->8773|19313->8774|19360->8793|19389->8794|19422->8799|19451->8800|19502->8822|19532->8823|19580->8842|19610->8843|19659->8863|19689->8864|19784->8931|19813->8932|19859->8949|19889->8950|19934->8966|19964->8967|20023->8998|20052->8999|20087->9006|20116->9007|20152->9015|20181->9016|20216->9023|20245->9024|20277->9028|20306->9029|20475->9169|20505->9170|20555->9191|20585->9192|20682->9260|20712->9261|20784->9304|20814->9305|20856->9318|20886->9319|20941->9345|20971->9346|21042->9388|21072->9389|21128->9416|21158->9417|21270->9500|21300->9501|21530->9702|21560->9703|21590->9704|21620->9705|21764->9820|21794->9821|21848->9846|21878->9847|21985->9925|22015->9926|22057->9939|22087->9940|22132->9956|22162->9957|22295->10061|22325->10062|22437->10145|22467->10146|22673->10323|22703->10324|22774->10367|22803->10368|22905->10442|22934->10443|22968->10449|22997->10450|23038->10463|23067->10464|23250->10610|23266->10616|23321->10648|24189->11479|24225->11492
                    LINES: 26->1|30->1|30->2|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|43->15|43->15|43->15|47->19|47->19|51->23|51->23|55->27|55->27|57->29|57->29|59->31|59->31|60->32|60->32|63->35|63->35|64->36|64->36|72->44|72->44|78->50|78->50|80->52|80->52|84->56|84->56|86->58|86->58|88->60|88->60|91->63|91->63|95->67|95->67|95->67|95->67|99->71|99->71|99->71|99->71|102->74|102->74|103->75|103->75|107->79|107->79|109->81|109->81|111->83|111->83|113->85|113->85|115->87|115->87|116->88|116->88|118->90|118->90|118->90|118->90|120->92|120->92|121->93|121->93|124->96|124->96|126->98|126->98|128->100|128->100|130->102|130->102|131->103|131->103|133->105|133->105|136->108|136->108|137->109|137->109|138->110|138->110|140->112|140->112|141->113|141->113|145->117|145->117|146->118|146->118|150->122|150->122|151->123|151->123|157->129|157->129|160->132|160->132|162->134|162->134|166->138|166->138|167->139|167->139|168->140|168->140|169->141|169->141|170->142|170->142|172->144|172->144|173->145|173->145|174->146|174->146|176->148|176->148|179->151|179->151|181->153|181->153|182->154|182->154|184->156|184->156|187->159|187->159|188->160|188->160|189->161|189->161|191->163|191->163|193->165|193->165|195->167|195->167|197->169|197->169|199->171|199->171|200->172|200->172|201->173|201->173|202->174|202->174|203->175|203->175|204->176|204->176|212->184|212->184|213->185|213->185|214->186|214->186|216->188|216->188|217->189|217->189|219->191|219->191|220->192|220->192|222->194|222->194|227->199|227->199|228->200|228->200|231->203|231->203|232->204|232->204|234->206|234->206|235->207|235->207|236->208|236->208|237->209|237->209|239->211|239->211|241->213|241->213|243->215|243->215|244->216|244->216|245->217|245->217|247->219|247->219|248->220|248->220|252->224|252->224|253->225|253->225|257->229|257->229|258->230|258->230|265->237|265->237|270->242|270->242|272->244|272->244|276->248|276->248|277->249|277->249|278->250|278->250|279->251|279->251|280->252|280->252|282->254|282->254|283->255|283->255|284->256|284->256|286->258|286->258|289->261|289->261|291->263|291->263|292->264|292->264|294->266|294->266|297->269|297->269|298->270|298->270|299->271|299->271|301->273|301->273|303->275|303->275|305->277|305->277|307->279|307->279|309->281|309->281|310->282|310->282|311->283|311->283|312->284|312->284|313->285|313->285|314->286|314->286|322->294|322->294|323->295|323->295|324->296|324->296|326->298|326->298|327->299|327->299|329->301|329->301|330->302|330->302|332->304|332->304|337->309|337->309|338->310|338->310|342->314|342->314|343->315|343->315|345->317|345->317|346->318|346->318|347->319|347->319|348->320|348->320|350->322|350->322|352->324|352->324|354->326|354->326|356->328|356->328|358->330|358->330|362->334|362->334|367->339|367->339|373->345|373->345|374->346|374->346|376->348|376->348|378->350|378->350|381->353|381->353|390->362|390->362|392->364|392->364|393->365|393->365|395->367|395->367|396->368|396->368|398->370|398->370|399->371|399->371|400->372|400->372|404->376|404->376|405->377|405->377|406->378|406->378|408->380|408->380|409->381|409->381|411->383|411->383|413->385|413->385|414->386|414->386|422->394|422->394|423->395|423->395|426->398|426->398|428->400|428->400|429->401|429->401|431->403|431->403|433->405|433->405|435->407|435->407|438->410|438->410|441->413|441->413|441->413|441->413|443->415|443->415|444->416|444->416|446->418|446->418|447->419|447->419|449->421|449->421|455->427|455->427|459->431|459->431|464->436|464->436|466->438|466->438|469->441|469->441|471->443|471->443|473->445|473->445|480->452|480->452|480->452|496->468|496->468
                    -- GENERATED --
                */
            