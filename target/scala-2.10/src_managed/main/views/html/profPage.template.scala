
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
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*12.47*/routes/*12.53*/.Assets.at("stylesheets/profPage.css"))),format.raw/*12.91*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*13.47*/routes/*13.53*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*13.106*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*14.47*/routes/*14.53*/.Assets.at("stylesheets/bootstrap/css/table.css"))),format.raw/*14.102*/("""">

<script src=""""),_display_(Seq[Any](/*16.15*/routes/*16.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*16.66*/("""" type="text/javascript"></script>
<script>
/*
	function getUrlVars()	
		"""),format.raw/*20.3*/("""{"""),format.raw/*20.4*/("""
    		var vars = [], hash;
    		var hashes = window.location.href.slice(window.location.href.indexOf('?') + 1).split('&');
    		for(var i = 0; i < hashes.length; i++)
    			"""),format.raw/*24.8*/("""{"""),format.raw/*24.9*/("""
        			hash = hashes[i].split('=');
        			vars.push(hash[0]);
        			vars[hash[0]] = hash[1];
    			"""),format.raw/*28.8*/("""}"""),format.raw/*28.9*/("""
    		return vars;
		"""),format.raw/*30.3*/("""}"""),format.raw/*30.4*/("""

	$("#logout").click(function() """),format.raw/*32.32*/("""{"""),format.raw/*32.33*/("""
		$.post("/postReport", """),format.raw/*33.25*/("""{"""),format.raw/*33.26*/("""
				
				courseName: getUrlVars()["course"]
		"""),format.raw/*36.3*/("""}"""),format.raw/*36.4*/(""" )
	"""),format.raw/*37.2*/("""}"""),format.raw/*37.3*/(""");
	
*/
	var speed_y;
	var voice_y;
	var newVal;
	var server_message;

	function displayQuestion(question) """),format.raw/*45.37*/("""{"""),format.raw/*45.38*/("""
		$('#posted_question')
				.append(
						'<div style="background-color: white; margin: 0 10px 10px 0; padding: 7px; border-radius:5px;">'
								+ question + '</div>');
		$(".test").show();
	"""),format.raw/*51.2*/("""}"""),format.raw/*51.3*/("""
	
	$(document).ready(function() """),format.raw/*53.31*/("""{"""),format.raw/*53.32*/("""

		var connection = new WebSocket('ws://localhost:9000');

		connection.onopen = function() """),format.raw/*57.34*/("""{"""),format.raw/*57.35*/("""
			//
		"""),format.raw/*59.3*/("""}"""),format.raw/*59.4*/("""

		connection.onmessage = function(e) """),format.raw/*61.38*/("""{"""),format.raw/*61.39*/("""
			server_message = e.data;

			if (server_message.indexOf("speed_") > -1) """),format.raw/*64.47*/("""{"""),format.raw/*64.48*/("""
				server_message = server_message.replace("speed_", "");
				speed_y = Number(server_message);
				console.log('speed y: ' + y);
			"""),format.raw/*68.4*/("""}"""),format.raw/*68.5*/(""" else if (server_message.indexOf("loudness_") > -1) """),format.raw/*68.57*/("""{"""),format.raw/*68.58*/("""
				server_message = server_message.replace("loudness_", "");
				voice_y = Number(server_message);
				console.log('Loud y: ' + voice_y);
			"""),format.raw/*72.4*/("""}"""),format.raw/*72.5*/(""" else if (server_message.indexOf("pause_") > -1) """),format.raw/*72.54*/("""{"""),format.raw/*72.55*/("""
				server_message = server_message.replace("pause_", "");
				newVal = parseInt(server_message);
			"""),format.raw/*75.4*/("""}"""),format.raw/*75.5*/("""
			else if (server_message.indexOf("question_") > -1) """),format.raw/*76.55*/("""{"""),format.raw/*76.56*/("""
				server_message = server_message.replace(
						"question_", "");
				displayQuestion(server_message);
			"""),format.raw/*80.4*/("""}"""),format.raw/*80.5*/("""

		"""),format.raw/*82.3*/("""}"""),format.raw/*82.4*/(""";

		connection.onclose = function(e) """),format.raw/*84.36*/("""{"""),format.raw/*84.37*/("""
			//
		"""),format.raw/*86.3*/("""}"""),format.raw/*86.4*/("""
		
		$("#submit_button").click(function() """),format.raw/*88.40*/("""{"""),format.raw/*88.41*/("""
			$.post("/postTheQuestion", """),format.raw/*89.31*/("""{"""),format.raw/*89.32*/("""
				p_question: $("#question").val()
			"""),format.raw/*91.4*/("""}"""),format.raw/*91.5*/(""").done(function()"""),format.raw/*91.22*/("""{"""),format.raw/*91.23*/("""
				$("#q_area").hide();
			"""),format.raw/*93.4*/("""}"""),format.raw/*93.5*/(""")
		"""),format.raw/*94.3*/("""}"""),format.raw/*94.4*/(""");

		
      $("#cancel_button").click(function() """),format.raw/*97.44*/("""{"""),format.raw/*97.45*/("""
       $("#q_area").hide();
      """),format.raw/*99.7*/("""}"""),format.raw/*99.8*/(""");

      $("#add").click(function() """),format.raw/*101.34*/("""{"""),format.raw/*101.35*/("""
       $("#q_area").show();
      """),format.raw/*103.7*/("""}"""),format.raw/*103.8*/(""");
	"""),format.raw/*104.2*/("""}"""),format.raw/*104.3*/(""");

	$(function() """),format.raw/*106.15*/("""{"""),format.raw/*106.16*/("""

		$(document).ready(
				function() """),format.raw/*109.16*/("""{"""),format.raw/*109.17*/("""
					Highcharts.setOptions("""),format.raw/*110.28*/("""{"""),format.raw/*110.29*/("""
						global : """),format.raw/*111.16*/("""{"""),format.raw/*111.17*/("""
							useUTC : false
						"""),format.raw/*113.7*/("""}"""),format.raw/*113.8*/("""
					"""),format.raw/*114.6*/("""}"""),format.raw/*114.7*/(""");

					var chart;
					$('#container-speed-chart').highcharts(
							"""),format.raw/*118.8*/("""{"""),format.raw/*118.9*/("""
								chart : """),format.raw/*119.17*/("""{"""),format.raw/*119.18*/("""
									type : 'spline',
									animation : Highcharts.svg, // don't animate in old IE
									marginRight : 5,
									events : """),format.raw/*123.19*/("""{"""),format.raw/*123.20*/("""
										load : function() """),format.raw/*124.29*/("""{"""),format.raw/*124.30*/("""

											// set up the updating of the chart each second
											var series = this.series[0];
											//var y = 0;

											setInterval(function() """),format.raw/*130.35*/("""{"""),format.raw/*130.36*/("""

												var x = (new Date()).getTime(); // current time
												if (speed_y == null) """),format.raw/*133.34*/("""{"""),format.raw/*133.35*/("""
													speed_y = 50; //used for initialization
												"""),format.raw/*135.13*/("""}"""),format.raw/*135.14*/("""
												series.addPoint([ x, speed_y ],
														true, true);

											"""),format.raw/*139.12*/("""}"""),format.raw/*139.13*/(""", 1000);
										"""),format.raw/*140.11*/("""}"""),format.raw/*140.12*/("""
									"""),format.raw/*141.10*/("""}"""),format.raw/*141.11*/("""
								"""),format.raw/*142.9*/("""}"""),format.raw/*142.10*/(""",
								title : """),format.raw/*143.17*/("""{"""),format.raw/*143.18*/("""
									text : 'Speed'
								"""),format.raw/*145.9*/("""}"""),format.raw/*145.10*/(""",
								xAxis : """),format.raw/*146.17*/("""{"""),format.raw/*146.18*/("""
									title : """),format.raw/*147.18*/("""{"""),format.raw/*147.19*/("""
										text : 'Time'
									"""),format.raw/*149.10*/("""}"""),format.raw/*149.11*/(""",
									type : 'datetime',
									tickPixelInterval : 150
								"""),format.raw/*152.9*/("""}"""),format.raw/*152.10*/(""",

								yAxis : """),format.raw/*154.17*/("""{"""),format.raw/*154.18*/("""
									title : """),format.raw/*155.18*/("""{"""),format.raw/*155.19*/("""
										text : 'Percentage'
									"""),format.raw/*157.10*/("""}"""),format.raw/*157.11*/(""",
									min : 0,
									max : 100,
									labels : """),format.raw/*160.19*/("""{"""),format.raw/*160.20*/("""
										formatter : function() """),format.raw/*161.34*/("""{"""),format.raw/*161.35*/("""
											if (this.value == 100) """),format.raw/*162.35*/("""{"""),format.raw/*162.36*/("""
												return 'Too Fast';
											"""),format.raw/*164.12*/("""}"""),format.raw/*164.13*/("""

											if (this.value == 50) """),format.raw/*166.34*/("""{"""),format.raw/*166.35*/("""
												return 'OK';
											"""),format.raw/*168.12*/("""}"""),format.raw/*168.13*/("""

											if (this.value == 0) """),format.raw/*170.33*/("""{"""),format.raw/*170.34*/("""
												return 'Too Slow';
											"""),format.raw/*172.12*/("""}"""),format.raw/*172.13*/("""
										"""),format.raw/*173.11*/("""}"""),format.raw/*173.12*/("""
									"""),format.raw/*174.10*/("""}"""),format.raw/*174.11*/(""",
								"""),format.raw/*175.9*/("""}"""),format.raw/*175.10*/(""",
								tooltip : """),format.raw/*176.19*/("""{"""),format.raw/*176.20*/("""
									formatter : function() """),format.raw/*177.33*/("""{"""),format.raw/*177.34*/("""
										return 'At time: '
												+ Highcharts.dateFormat(
														'%H:%M:%S', this.x)
												+ '<br/>'
												+ 'Average speed requested '
												+ Highcharts.numberFormat(
														this.speed_y, 2) + '%';
									"""),format.raw/*185.10*/("""}"""),format.raw/*185.11*/("""
								"""),format.raw/*186.9*/("""}"""),format.raw/*186.10*/(""",
								legend : """),format.raw/*187.18*/("""{"""),format.raw/*187.19*/("""
									enabled : false
								"""),format.raw/*189.9*/("""}"""),format.raw/*189.10*/(""",
								exporting : """),format.raw/*190.21*/("""{"""),format.raw/*190.22*/("""
									enabled : false
								"""),format.raw/*192.9*/("""}"""),format.raw/*192.10*/(""",
								series : [ """),format.raw/*193.20*/("""{"""),format.raw/*193.21*/("""
									name : 'Random data',
									data : (function() """),format.raw/*195.29*/("""{"""),format.raw/*195.30*/("""
										// generate an array of random data
										var data = [], time = (new Date())
												.getTime(), i;

										for (i = -19; i <= 0; i++) """),format.raw/*200.38*/("""{"""),format.raw/*200.39*/("""
											data.push("""),format.raw/*201.22*/("""{"""),format.raw/*201.23*/("""
												x : time + i * 1000,
												speed_y : 50
											"""),format.raw/*204.12*/("""}"""),format.raw/*204.13*/(""");
										"""),format.raw/*205.11*/("""}"""),format.raw/*205.12*/("""
										return data;
									"""),format.raw/*207.10*/("""}"""),format.raw/*207.11*/(""")()
								"""),format.raw/*208.9*/("""}"""),format.raw/*208.10*/(""" ]
							"""),format.raw/*209.8*/("""}"""),format.raw/*209.9*/(""");
				"""),format.raw/*210.5*/("""}"""),format.raw/*210.6*/(""");

	"""),format.raw/*212.2*/("""}"""),format.raw/*212.3*/(""");

	$(function() """),format.raw/*214.15*/("""{"""),format.raw/*214.16*/("""
		$(document).ready(
				function() """),format.raw/*216.16*/("""{"""),format.raw/*216.17*/("""
					Highcharts.setOptions("""),format.raw/*217.28*/("""{"""),format.raw/*217.29*/("""
						global : """),format.raw/*218.16*/("""{"""),format.raw/*218.17*/("""
							useUTC : false
						"""),format.raw/*220.7*/("""}"""),format.raw/*220.8*/("""
					"""),format.raw/*221.6*/("""}"""),format.raw/*221.7*/(""");

					var chart;
					$('#container-loudness-chart').highcharts(
							"""),format.raw/*225.8*/("""{"""),format.raw/*225.9*/("""
								chart : """),format.raw/*226.17*/("""{"""),format.raw/*226.18*/("""
									type : 'spline',
									animation : Highcharts.svg, // don't animate in old IE
									marginRight : 5,
									events : """),format.raw/*230.19*/("""{"""),format.raw/*230.20*/("""
										load : function() """),format.raw/*231.29*/("""{"""),format.raw/*231.30*/("""

											// set up the updating of the chart each second
											var series = this.series[0];
											//var y = 0;
											//var server_message;

											setInterval(function() """),format.raw/*238.35*/("""{"""),format.raw/*238.36*/("""

												//var connection = new WebSocket('ws://localhost:9000');  //initialize the websocket inside the "interval loop"

												var x = (new Date()).getTime(); // current time
												if (voice_y == null) """),format.raw/*243.34*/("""{"""),format.raw/*243.35*/("""
													voice_y = 50; //used for initialization
												"""),format.raw/*245.13*/("""}"""),format.raw/*245.14*/("""
												series.addPoint([ x, voice_y ],
														true, true);

											"""),format.raw/*249.12*/("""}"""),format.raw/*249.13*/(""", 1000);
										"""),format.raw/*250.11*/("""}"""),format.raw/*250.12*/("""
									"""),format.raw/*251.10*/("""}"""),format.raw/*251.11*/("""
								"""),format.raw/*252.9*/("""}"""),format.raw/*252.10*/(""",
								title : """),format.raw/*253.17*/("""{"""),format.raw/*253.18*/("""
									text : 'Loudness'
								"""),format.raw/*255.9*/("""}"""),format.raw/*255.10*/(""",
								xAxis : """),format.raw/*256.17*/("""{"""),format.raw/*256.18*/("""
									title : """),format.raw/*257.18*/("""{"""),format.raw/*257.19*/("""
										text : 'Time'
									"""),format.raw/*259.10*/("""}"""),format.raw/*259.11*/(""",
									type : 'datetime',
									tickPixelInterval : 150
								"""),format.raw/*262.9*/("""}"""),format.raw/*262.10*/(""",

								yAxis : """),format.raw/*264.17*/("""{"""),format.raw/*264.18*/("""
									title : """),format.raw/*265.18*/("""{"""),format.raw/*265.19*/("""
										text : 'Percentage'
									"""),format.raw/*267.10*/("""}"""),format.raw/*267.11*/(""",
									min : 0,
									max : 100,
									labels : """),format.raw/*270.19*/("""{"""),format.raw/*270.20*/("""
										formatter : function() """),format.raw/*271.34*/("""{"""),format.raw/*271.35*/("""
											if (this.value == 100) """),format.raw/*272.35*/("""{"""),format.raw/*272.36*/("""
												return 'Too Loud';
											"""),format.raw/*274.12*/("""}"""),format.raw/*274.13*/("""

											if (this.value == 50) """),format.raw/*276.34*/("""{"""),format.raw/*276.35*/("""
												return 'OK';
											"""),format.raw/*278.12*/("""}"""),format.raw/*278.13*/("""

											if (this.value == 0) """),format.raw/*280.33*/("""{"""),format.raw/*280.34*/("""
												return 'Too Low';
											"""),format.raw/*282.12*/("""}"""),format.raw/*282.13*/("""
										"""),format.raw/*283.11*/("""}"""),format.raw/*283.12*/("""
									"""),format.raw/*284.10*/("""}"""),format.raw/*284.11*/(""",
								"""),format.raw/*285.9*/("""}"""),format.raw/*285.10*/(""",
								tooltip : """),format.raw/*286.19*/("""{"""),format.raw/*286.20*/("""
									formatter : function() """),format.raw/*287.33*/("""{"""),format.raw/*287.34*/("""
										return 'At time: '
												+ Highcharts.dateFormat(
														'%H:%M:%S', this.x)
												+ '<br/>'
												+ 'Average loudness requested '
												+ Highcharts.numberFormat(
														this.voice_y, 2) + '%';
									"""),format.raw/*295.10*/("""}"""),format.raw/*295.11*/("""
								"""),format.raw/*296.9*/("""}"""),format.raw/*296.10*/(""",
								legend : """),format.raw/*297.18*/("""{"""),format.raw/*297.19*/("""
									enabled : false
								"""),format.raw/*299.9*/("""}"""),format.raw/*299.10*/(""",
								exporting : """),format.raw/*300.21*/("""{"""),format.raw/*300.22*/("""
									enabled : false
								"""),format.raw/*302.9*/("""}"""),format.raw/*302.10*/(""",
								series : [ """),format.raw/*303.20*/("""{"""),format.raw/*303.21*/("""
									name : 'Random data',
									data : (function() """),format.raw/*305.29*/("""{"""),format.raw/*305.30*/("""
										// generate an array of random data
										var data = [], time = (new Date())
												.getTime(), i;

										for (i = -19; i <= 0; i++) """),format.raw/*310.38*/("""{"""),format.raw/*310.39*/("""
											data.push("""),format.raw/*311.22*/("""{"""),format.raw/*311.23*/("""
												x : time + i * 1000,
												voice_y : 50
											//initialization 
											"""),format.raw/*315.12*/("""}"""),format.raw/*315.13*/(""");
										"""),format.raw/*316.11*/("""}"""),format.raw/*316.12*/("""
										return data;
									"""),format.raw/*318.10*/("""}"""),format.raw/*318.11*/(""")()
								"""),format.raw/*319.9*/("""}"""),format.raw/*319.10*/(""" ]
							"""),format.raw/*320.8*/("""}"""),format.raw/*320.9*/(""");
				"""),format.raw/*321.5*/("""}"""),format.raw/*321.6*/(""");

	"""),format.raw/*323.2*/("""}"""),format.raw/*323.3*/(""");

	$(function() """),format.raw/*325.15*/("""{"""),format.raw/*325.16*/("""

		var gaugeOptions = """),format.raw/*327.22*/("""{"""),format.raw/*327.23*/("""

			chart : """),format.raw/*329.12*/("""{"""),format.raw/*329.13*/("""
				type : 'solidgauge'
			"""),format.raw/*331.4*/("""}"""),format.raw/*331.5*/(""",

			title : null,

			pane : """),format.raw/*335.11*/("""{"""),format.raw/*335.12*/("""
				center : [ '50%', '85%' ],
				size : '140%',
				startAngle : -90,
				endAngle : 90,
				background : """),format.raw/*340.18*/("""{"""),format.raw/*340.19*/("""
					backgroundColor : (Highcharts.theme && Highcharts.theme.background2)
							|| '#EEE',
					innerRadius : '60%',
					outerRadius : '100%',
					shape : 'arc'
				"""),format.raw/*346.5*/("""}"""),format.raw/*346.6*/("""
			"""),format.raw/*347.4*/("""}"""),format.raw/*347.5*/(""",

			tooltip : """),format.raw/*349.14*/("""{"""),format.raw/*349.15*/("""
				enabled : true
			"""),format.raw/*351.4*/("""}"""),format.raw/*351.5*/(""",

			// the value axis
			yAxis : """),format.raw/*354.12*/("""{"""),format.raw/*354.13*/("""
				stops : [ [ 0.1, '#55BF3B' ], // green
				[ 0.5, '#DDDF0D' ], // yellow
				[ 0.9, '#DF5353' ] // red
				],
				lineWidth : 0,
				minorTickInterval : null,
				tickPixelInterval : 400,
				tickWidth : 0,
				title : """),format.raw/*363.13*/("""{"""),format.raw/*363.14*/("""
					y : -70
				"""),format.raw/*365.5*/("""}"""),format.raw/*365.6*/(""",
				labels : """),format.raw/*366.14*/("""{"""),format.raw/*366.15*/("""
					y : 16
				"""),format.raw/*368.5*/("""}"""),format.raw/*368.6*/("""
			"""),format.raw/*369.4*/("""}"""),format.raw/*369.5*/(""",

			plotOptions : """),format.raw/*371.18*/("""{"""),format.raw/*371.19*/("""
				solidgauge : """),format.raw/*372.18*/("""{"""),format.raw/*372.19*/("""
					dataLabels : """),format.raw/*373.19*/("""{"""),format.raw/*373.20*/("""
						y : 5,
						borderWidth : 0,
						useHTML : true
					"""),format.raw/*377.6*/("""}"""),format.raw/*377.7*/(""",
					states : """),format.raw/*378.15*/("""{"""),format.raw/*378.16*/("""
						hover : """),format.raw/*379.15*/("""{"""),format.raw/*379.16*/("""
							enabled : true
						"""),format.raw/*381.7*/("""}"""),format.raw/*381.8*/("""
					"""),format.raw/*382.6*/("""}"""),format.raw/*382.7*/("""

				"""),format.raw/*384.5*/("""}"""),format.raw/*384.6*/("""

			"""),format.raw/*386.4*/("""}"""),format.raw/*386.5*/("""
		"""),format.raw/*387.3*/("""}"""),format.raw/*387.4*/(""";

		// The speed gauge
		$('#container-speed')
				.highcharts(
						Highcharts
								.merge(
										gaugeOptions,
										"""),format.raw/*395.11*/("""{"""),format.raw/*395.12*/("""
											yAxis : """),format.raw/*396.20*/("""{"""),format.raw/*396.21*/("""
												min : 0,
												max : 100,
												title : """),format.raw/*399.21*/("""{"""),format.raw/*399.22*/("""
													text : 'Pause'
												"""),format.raw/*401.13*/("""}"""),format.raw/*401.14*/("""
											"""),format.raw/*402.12*/("""}"""),format.raw/*402.13*/(""",

											credits : """),format.raw/*404.22*/("""{"""),format.raw/*404.23*/("""
												enabled : false
											"""),format.raw/*406.12*/("""}"""),format.raw/*406.13*/(""",

											series : [ """),format.raw/*408.23*/("""{"""),format.raw/*408.24*/("""
												name : 'Pause',
												data : [ 0 ],
												dataLabels : """),format.raw/*411.26*/("""{"""),format.raw/*411.27*/("""
													format : '<div style="text-align:center"><span style="font-size:25px;color:'
															+ ((Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black')
															+ '">"""),format.raw/*414.21*/("""{"""),format.raw/*414.22*/("""y"""),format.raw/*414.23*/("""}"""),format.raw/*414.24*/("""</span><br/>'
															+ '<span style="font-size:12px;color:silver">Pause counts</span></div>'
												"""),format.raw/*416.13*/("""}"""),format.raw/*416.14*/(""",
												tooltip : """),format.raw/*417.23*/("""{"""),format.raw/*417.24*/("""
													valueSuffix : 'Number of persons voted for pause'
												"""),format.raw/*419.13*/("""}"""),format.raw/*419.14*/("""
											"""),format.raw/*420.12*/("""}"""),format.raw/*420.13*/(""" ]

										"""),format.raw/*422.11*/("""}"""),format.raw/*422.12*/("""));

		// The RPM gauge
		;
		//var newVal;
		// Bring life to the dials
		setInterval(function() """),format.raw/*428.26*/("""{"""),format.raw/*428.27*/("""

			// Speed
			var chart = $('#container-speed').highcharts();
			if (chart) """),format.raw/*432.15*/("""{"""),format.raw/*432.16*/("""
				var point = chart.series[0].points[0];
				//   inc = Math.round((Math.random() - 0.5) * 100);

				// newVal = point.y + inc;
				/*  if (newVal < 0 || newVal > 100) """),format.raw/*437.41*/("""{"""),format.raw/*437.42*/("""
				      newVal = point.y - inc;
				  """),format.raw/*439.7*/("""}"""),format.raw/*439.8*/("""*/
				console.log('pause 2: ' + newVal);
				point.update(newVal);
			"""),format.raw/*442.4*/("""}"""),format.raw/*442.5*/("""

		"""),format.raw/*444.3*/("""}"""),format.raw/*444.4*/(""", 2000);

	"""),format.raw/*446.2*/("""}"""),format.raw/*446.3*/(""");
</script>

</head>
<body>
<!-- 
	<div id="container">
		<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
			<img src=""""),_display_(Seq[Any](/*454.15*/routes/*454.21*/.Assets.at("images/logonew.png"))),format.raw/*454.53*/("""" height="70px"
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
		
		
		<div class="well" style="width: 200px; float: left;">"""),_display_(Seq[Any](/*470.57*/lectureNumber)),format.raw/*470.70*/("""</div>
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
							"""),_display_(Seq[Any](/*492.9*/for(questions <- questionList) yield /*492.39*/{_display_(Seq[Any](format.raw/*492.40*/("""
								<div style="background-color: white; margin: 0 10px 10px 0; padding: 7px; border-radius:5px;">
								 """),_display_(Seq[Any](/*494.11*/questions)),format.raw/*494.20*/("""	 </div>
							""")))})),format.raw/*495.9*/("""
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
	-->
	
	<div id="container">
		<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
			<img src=""""),_display_(Seq[Any](/*537.15*/routes/*537.21*/.Assets.at("images/logonew.png"))),format.raw/*537.53*/("""" height="70px"
				width="150px" alt="Live Feed">
			<form method="get" action="/signout">
				<button type="submit" class="btn btn-default" id="logout" name="logoutButton">Logout</button>
			</form>
		</div>
		<header class="navbar navbar-static-top bs-docs-nav" id="top">
			<div class="btn-group">
				<a type="button" class="btn btn-default" href="/home">Home</a> 
				<a type="button" class="btn btn-default" href="/aboutus">About Us</a> 
				<a type="button" class="btn btn-default" href="/contact">Contact</a> 
				<a type="button" class="btn btn-default" href="/feedback">Feedback</a>
			</div>
		</header>
		
		<div id="lecture-number">LectureID: """),_display_(Seq[Any](/*552.40*/lectureNumber)),format.raw/*552.53*/("""</div>
		<table>
			<thead>
				<tr>
					<th width=50% height=50% style="border: none !important;"><script
							src="http://code.highcharts.com/highcharts.js"></script> <script
							src="http://code.highcharts.com/modules/exporting.js"></script>
						<div id="container-speed-chart"></div></th>
					<th width=50% style="border: none !important;"><script
							src="http://code.highcharts.com/highcharts.js"></script> <script
							src="http://code.highcharts.com/modules/exporting.js"></script>
						<div id="container-loudness-chart"></div></th>
				</tr>
			</thead>

			<tr>
				<td id="questions-sections" width="50%">
					<div id="questions-sections-container">
						<h3><b><i>Q&A Section</i></b></h3>
						
						<div id="posted_question"></div>
						
						<div id="add-question-button-container">
							<a type="button" class="btn btn-primary" id="add">Add Question</a>
						</div>
						<div id="q_area" class="well">
							<textarea class="form-control" rows="3" columns="50"
								id="question" placeholder="Enter Question Here" name="p_question"></textarea>
							<div class="btn-group-justified">
								<a id="submit_button" class="btn btn-success" type="button">Submit</a>
								<a id="cancel_button" class="btn btn-danger" type="button">Cancel</a>
							</div>
						</div>
						<div class="clear" style="clear: both;"></div>
					</div>
				</td>
				<td id="pause-graphics" width="50%">
					<div id="pause_gauge">
						<script src="http://code.highcharts.com/highcharts.js"></script>
						<script src="http://code.highcharts.com/highcharts-more.js"></script>
						
						<script
							src="http://code.highcharts.com/modules/solid-gauge.src.js"></script>

						<div style="margin: 0 auto;">
							<div id="container-speed"></div>
						</div>
						<div class="clear" style="clear: both;"></div>
					</div>
					
				</td>
			</tr>
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
                    DATE: Sat Jun 28 11:38:26 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Final/livefeed/app/views/profPage.scala.html
                    HASH: cfed54adb9377fa06ea47b7bdfc1b61d710aa0a5
                    MATRIX: 793->1|967->64|994->83|1144->198|1158->204|1213->238|1303->292|1318->298|1372->330|1462->384|1477->390|1531->422|1617->472|1632->478|1692->516|1778->566|1793->572|1869->625|1955->675|1970->681|2042->730|2098->750|2113->756|2180->801|2284->878|2312->879|2520->1060|2548->1061|2694->1180|2722->1181|2773->1205|2801->1206|2864->1241|2893->1242|2947->1268|2976->1269|3053->1319|3081->1320|3113->1325|3141->1326|3284->1441|3313->1442|3541->1643|3569->1644|3632->1679|3661->1680|3786->1777|3815->1778|3853->1789|3881->1790|3950->1831|3979->1832|4086->1911|4115->1912|4281->2051|4309->2052|4389->2104|4418->2105|4592->2252|4620->2253|4697->2302|4726->2303|4858->2408|4886->2409|4970->2465|4999->2466|5140->2580|5168->2581|5201->2587|5229->2588|5297->2628|5326->2629|5364->2640|5392->2641|5465->2686|5494->2687|5554->2719|5583->2720|5653->2763|5681->2764|5726->2781|5755->2782|5813->2813|5841->2814|5873->2819|5901->2820|5982->2873|6011->2874|6075->2911|6103->2912|6171->2951|6201->2952|6266->2989|6295->2990|6328->2995|6357->2996|6406->3016|6436->3017|6506->3058|6536->3059|6594->3088|6624->3089|6670->3106|6700->3107|6759->3138|6788->3139|6823->3146|6852->3147|6956->3223|6985->3224|7032->3242|7062->3243|7230->3382|7260->3383|7319->3413|7349->3414|7544->3580|7574->3581|7701->3679|7731->3680|7828->3748|7858->3749|7975->3837|8005->3838|8054->3858|8084->3859|8124->3870|8154->3871|8192->3881|8222->3882|8270->3901|8300->3902|8363->3937|8393->3938|8441->3957|8471->3958|8519->3977|8549->3978|8614->4014|8644->4015|8746->4089|8776->4090|8826->4111|8856->4112|8904->4131|8934->4132|9005->4174|9035->4175|9125->4236|9155->4237|9219->4272|9249->4273|9314->4309|9344->4310|9418->4355|9448->4356|9514->4393|9544->4394|9612->4433|9642->4434|9707->4470|9737->4471|9811->4516|9841->4517|9882->4529|9912->4530|9952->4541|9982->4542|10021->4553|10051->4554|10101->4575|10131->4576|10194->4610|10224->4611|10511->4869|10541->4870|10579->4880|10609->4881|10658->4901|10688->4902|10752->4938|10782->4939|10834->4962|10864->4963|10928->4999|10958->5000|11009->5022|11039->5023|11130->5085|11160->5086|11351->5248|11381->5249|11433->5272|11463->5273|11565->5346|11595->5347|11638->5361|11668->5362|11732->5397|11762->5398|11803->5411|11833->5412|11872->5423|11901->5424|11937->5432|11966->5433|12001->5440|12030->5441|12079->5461|12109->5462|12177->5501|12207->5502|12265->5531|12295->5532|12341->5549|12371->5550|12430->5581|12459->5582|12494->5589|12523->5590|12630->5669|12659->5670|12706->5688|12736->5689|12904->5828|12934->5829|12993->5859|13023->5860|13252->6060|13282->6061|13536->6286|13566->6287|13663->6355|13693->6356|13810->6444|13840->6445|13889->6465|13919->6466|13959->6477|13989->6478|14027->6488|14057->6489|14105->6508|14135->6509|14201->6547|14231->6548|14279->6567|14309->6568|14357->6587|14387->6588|14452->6624|14482->6625|14584->6699|14614->6700|14664->6721|14694->6722|14742->6741|14772->6742|14843->6784|14873->6785|14963->6846|14993->6847|15057->6882|15087->6883|15152->6919|15182->6920|15256->6965|15286->6966|15352->7003|15382->7004|15450->7043|15480->7044|15545->7080|15575->7081|15648->7125|15678->7126|15719->7138|15749->7139|15789->7150|15819->7151|15858->7162|15888->7163|15938->7184|15968->7185|16031->7219|16061->7220|16351->7481|16381->7482|16419->7492|16449->7493|16498->7513|16528->7514|16592->7550|16622->7551|16674->7574|16704->7575|16768->7611|16798->7612|16849->7634|16879->7635|16970->7697|17000->7698|17191->7860|17221->7861|17273->7884|17303->7885|17435->7988|17465->7989|17508->8003|17538->8004|17602->8039|17632->8040|17673->8053|17703->8054|17742->8065|17771->8066|17807->8074|17836->8075|17871->8082|17900->8083|17949->8103|17979->8104|18033->8129|18063->8130|18107->8145|18137->8146|18195->8176|18224->8177|18288->8212|18318->8213|18461->8327|18491->8328|18694->8503|18723->8504|18756->8509|18785->8510|18832->8528|18862->8529|18915->8554|18944->8555|19011->8593|19041->8594|19303->8827|19333->8828|19381->8848|19410->8849|19455->8865|19485->8866|19532->8885|19561->8886|19594->8891|19623->8892|19674->8914|19704->8915|19752->8934|19782->8935|19831->8955|19861->8956|19956->9023|19985->9024|20031->9041|20061->9042|20106->9058|20136->9059|20195->9090|20224->9091|20259->9098|20288->9099|20324->9107|20353->9108|20388->9115|20417->9116|20449->9120|20478->9121|20647->9261|20677->9262|20727->9283|20757->9284|20854->9352|20884->9353|20956->9396|20986->9397|21028->9410|21058->9411|21113->9437|21143->9438|21214->9480|21244->9481|21300->9508|21330->9509|21442->9592|21472->9593|21702->9794|21732->9795|21762->9796|21792->9797|21936->9912|21966->9913|22020->9938|22050->9939|22157->10017|22187->10018|22229->10031|22259->10032|22304->10048|22334->10049|22467->10153|22497->10154|22609->10237|22639->10238|22845->10415|22875->10416|22946->10459|22975->10460|23077->10534|23106->10535|23140->10541|23169->10542|23210->10555|23239->10556|23429->10709|23445->10715|23500->10747|24368->11578|24404->11591|25192->12343|25239->12373|25279->12374|25432->12490|25464->12499|25514->12517|27024->13990|27040->13996|27095->14028|27805->14701|27841->14714
                    LINES: 26->1|30->1|30->2|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|44->16|44->16|44->16|48->20|48->20|52->24|52->24|56->28|56->28|58->30|58->30|60->32|60->32|61->33|61->33|64->36|64->36|65->37|65->37|73->45|73->45|79->51|79->51|81->53|81->53|85->57|85->57|87->59|87->59|89->61|89->61|92->64|92->64|96->68|96->68|96->68|96->68|100->72|100->72|100->72|100->72|103->75|103->75|104->76|104->76|108->80|108->80|110->82|110->82|112->84|112->84|114->86|114->86|116->88|116->88|117->89|117->89|119->91|119->91|119->91|119->91|121->93|121->93|122->94|122->94|125->97|125->97|127->99|127->99|129->101|129->101|131->103|131->103|132->104|132->104|134->106|134->106|137->109|137->109|138->110|138->110|139->111|139->111|141->113|141->113|142->114|142->114|146->118|146->118|147->119|147->119|151->123|151->123|152->124|152->124|158->130|158->130|161->133|161->133|163->135|163->135|167->139|167->139|168->140|168->140|169->141|169->141|170->142|170->142|171->143|171->143|173->145|173->145|174->146|174->146|175->147|175->147|177->149|177->149|180->152|180->152|182->154|182->154|183->155|183->155|185->157|185->157|188->160|188->160|189->161|189->161|190->162|190->162|192->164|192->164|194->166|194->166|196->168|196->168|198->170|198->170|200->172|200->172|201->173|201->173|202->174|202->174|203->175|203->175|204->176|204->176|205->177|205->177|213->185|213->185|214->186|214->186|215->187|215->187|217->189|217->189|218->190|218->190|220->192|220->192|221->193|221->193|223->195|223->195|228->200|228->200|229->201|229->201|232->204|232->204|233->205|233->205|235->207|235->207|236->208|236->208|237->209|237->209|238->210|238->210|240->212|240->212|242->214|242->214|244->216|244->216|245->217|245->217|246->218|246->218|248->220|248->220|249->221|249->221|253->225|253->225|254->226|254->226|258->230|258->230|259->231|259->231|266->238|266->238|271->243|271->243|273->245|273->245|277->249|277->249|278->250|278->250|279->251|279->251|280->252|280->252|281->253|281->253|283->255|283->255|284->256|284->256|285->257|285->257|287->259|287->259|290->262|290->262|292->264|292->264|293->265|293->265|295->267|295->267|298->270|298->270|299->271|299->271|300->272|300->272|302->274|302->274|304->276|304->276|306->278|306->278|308->280|308->280|310->282|310->282|311->283|311->283|312->284|312->284|313->285|313->285|314->286|314->286|315->287|315->287|323->295|323->295|324->296|324->296|325->297|325->297|327->299|327->299|328->300|328->300|330->302|330->302|331->303|331->303|333->305|333->305|338->310|338->310|339->311|339->311|343->315|343->315|344->316|344->316|346->318|346->318|347->319|347->319|348->320|348->320|349->321|349->321|351->323|351->323|353->325|353->325|355->327|355->327|357->329|357->329|359->331|359->331|363->335|363->335|368->340|368->340|374->346|374->346|375->347|375->347|377->349|377->349|379->351|379->351|382->354|382->354|391->363|391->363|393->365|393->365|394->366|394->366|396->368|396->368|397->369|397->369|399->371|399->371|400->372|400->372|401->373|401->373|405->377|405->377|406->378|406->378|407->379|407->379|409->381|409->381|410->382|410->382|412->384|412->384|414->386|414->386|415->387|415->387|423->395|423->395|424->396|424->396|427->399|427->399|429->401|429->401|430->402|430->402|432->404|432->404|434->406|434->406|436->408|436->408|439->411|439->411|442->414|442->414|442->414|442->414|444->416|444->416|445->417|445->417|447->419|447->419|448->420|448->420|450->422|450->422|456->428|456->428|460->432|460->432|465->437|465->437|467->439|467->439|470->442|470->442|472->444|472->444|474->446|474->446|482->454|482->454|482->454|498->470|498->470|520->492|520->492|520->492|522->494|522->494|523->495|565->537|565->537|565->537|580->552|580->552
                    -- GENERATED --
                */
            