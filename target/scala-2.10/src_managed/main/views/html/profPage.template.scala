
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
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*11.47*/routes/*11.53*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*11.106*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*12.47*/routes/*12.53*/.Assets.at("stylesheets/bootstrap/css/table.css"))),format.raw/*12.102*/("""">

<script src=""""),_display_(Seq[Any](/*14.15*/routes/*14.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*14.66*/("""" type="text/javascript"></script>
<script>
/*
	function getUrlVars()	
		"""),format.raw/*18.3*/("""{"""),format.raw/*18.4*/("""
    		var vars = [], hash;
    		var hashes = window.location.href.slice(window.location.href.indexOf('?') + 1).split('&');
    		for(var i = 0; i < hashes.length; i++)
    			"""),format.raw/*22.8*/("""{"""),format.raw/*22.9*/("""
        			hash = hashes[i].split('=');
        			vars.push(hash[0]);
        			vars[hash[0]] = hash[1];
    			"""),format.raw/*26.8*/("""}"""),format.raw/*26.9*/("""
    		return vars;
		"""),format.raw/*28.3*/("""}"""),format.raw/*28.4*/("""

	$("#logout").click(function() """),format.raw/*30.32*/("""{"""),format.raw/*30.33*/("""
		$.post("/postReport", """),format.raw/*31.25*/("""{"""),format.raw/*31.26*/("""
				
				courseName: getUrlVars()["course"]
		"""),format.raw/*34.3*/("""}"""),format.raw/*34.4*/(""" )
	"""),format.raw/*35.2*/("""}"""),format.raw/*35.3*/(""");
	
*/
	var speed_y;
	var voice_y;
	var newVal;
	var server_message;

	function displayQuestion(question) """),format.raw/*43.37*/("""{"""),format.raw/*43.38*/("""
		$('#posted_question')
				.append(
						'<div style="background-color: white; margin: 0 10px 10px 0; padding: 7px; border-radius:5px;">'
								+ question + '</div>');
		$(".test").show();
	"""),format.raw/*49.2*/("""}"""),format.raw/*49.3*/("""
	
	$(document).ready(function() """),format.raw/*51.31*/("""{"""),format.raw/*51.32*/("""

		var connection = new WebSocket('ws://localhost:9000');

		connection.onopen = function() """),format.raw/*55.34*/("""{"""),format.raw/*55.35*/("""
			//
		"""),format.raw/*57.3*/("""}"""),format.raw/*57.4*/("""

		connection.onmessage = function(e) """),format.raw/*59.38*/("""{"""),format.raw/*59.39*/("""
			server_message = e.data;

			if (server_message.indexOf("speed_") > -1) """),format.raw/*62.47*/("""{"""),format.raw/*62.48*/("""
				server_message = server_message.replace("speed_", "");
				speed_y = Number(server_message);
				console.log('speed y: ' + y);
			"""),format.raw/*66.4*/("""}"""),format.raw/*66.5*/(""" else if (server_message.indexOf("loudness_") > -1) """),format.raw/*66.57*/("""{"""),format.raw/*66.58*/("""
				server_message = server_message.replace("loudness_", "");
				voice_y = Number(server_message);
				console.log('Loud y: ' + voice_y);
			"""),format.raw/*70.4*/("""}"""),format.raw/*70.5*/(""" else if (server_message.indexOf("pause_") > -1) """),format.raw/*70.54*/("""{"""),format.raw/*70.55*/("""
				server_message = server_message.replace("pause_", "");
				newVal = parseInt(server_message);
			"""),format.raw/*73.4*/("""}"""),format.raw/*73.5*/("""
			else if (server_message.indexOf("question_") > -1) """),format.raw/*74.55*/("""{"""),format.raw/*74.56*/("""
				server_message = server_message.replace(
						"question_", "");
				displayQuestion(server_message);
			"""),format.raw/*78.4*/("""}"""),format.raw/*78.5*/("""

		"""),format.raw/*80.3*/("""}"""),format.raw/*80.4*/(""";

		connection.onclose = function(e) """),format.raw/*82.36*/("""{"""),format.raw/*82.37*/("""
			alert("CONNECTION IS CLOSED~");
		"""),format.raw/*84.3*/("""}"""),format.raw/*84.4*/("""

		$("#submit_button")
        .click(
          function() """),format.raw/*88.22*/("""{"""),format.raw/*88.23*/("""
           var question_text = $('#question')
             .val();
           displayQuestion(question_text);
           $('#question').val('');
           $("#q_area").hide();

          """),format.raw/*95.11*/("""}"""),format.raw/*95.12*/(""");

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
	<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
		<img src=""""),_display_(Seq[Any](/*452.14*/routes/*452.20*/.Assets.at(" images/logo.png"))),format.raw/*452.50*/("""" height="50px"
			width="150px" alt="Live Feed">
	</div>
	<header class="navbar navbar-static-top bs-docs-nav" id="top"
		role="banner">
		<div class="btn-group" style="margin-left: 75%;">
			<a type="button" class="btn btn-default" href="/home">Home</a> 
			<a type="button" class="btn btn-default" href="/aboutus">About Us</a> 
			<a type="button" class="btn btn-default" href="/contact">Contact</a> 
			<a type="button" class="btn btn-default" href="/feedback">Feedback</a>
			<div class="well" style="margin-left: 100px; width: 200px; float: left;">"""),_display_(Seq[Any](/*462.78*/lectureNumber)),format.raw/*462.91*/("""</div>
		</div>
	</header>
	
	<form method="get" action="/signout">
		<button type="submit" class="btn btn-default" id="logout" name="logoutButton" style="width:214px">Logout</button>
	</form>
		
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
								id="question" placeholder="Enter Question Here"></textarea>
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



</body>
</html>
"""))}
    }
    
    def render(stats:Long,lectureNumber:Long): play.api.templates.HtmlFormat.Appendable = apply(stats,lectureNumber)
    
    def f:((Long,Long) => play.api.templates.HtmlFormat.Appendable) = (stats,lectureNumber) => apply(stats,lectureNumber)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 24 15:11:42 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/profPage.scala.html
                    HASH: b8c2277bef6f2182dcfe95292e13b081e168d98c
                    MATRIX: 780->1|927->37|954->56|1104->171|1118->177|1173->211|1263->265|1278->271|1332->303|1418->353|1433->359|1509->412|1595->462|1610->468|1682->517|1738->537|1753->543|1820->588|1924->665|1952->666|2160->847|2188->848|2334->967|2362->968|2413->992|2441->993|2504->1028|2533->1029|2587->1055|2616->1056|2693->1106|2721->1107|2753->1112|2781->1113|2924->1228|2953->1229|3181->1430|3209->1431|3272->1466|3301->1467|3426->1564|3455->1565|3493->1576|3521->1577|3590->1618|3619->1619|3726->1698|3755->1699|3921->1838|3949->1839|4029->1891|4058->1892|4232->2039|4260->2040|4337->2089|4366->2090|4498->2195|4526->2196|4610->2252|4639->2253|4780->2367|4808->2368|4841->2374|4869->2375|4937->2415|4966->2416|5033->2456|5061->2457|5154->2522|5183->2523|5407->2719|5436->2720|5513->2769|5542->2770|5606->2807|5634->2808|5702->2847|5732->2848|5797->2885|5826->2886|5859->2891|5888->2892|5937->2912|5967->2913|6037->2954|6067->2955|6125->2984|6155->2985|6201->3002|6231->3003|6290->3034|6319->3035|6354->3042|6383->3043|6487->3119|6516->3120|6563->3138|6593->3139|6761->3278|6791->3279|6850->3309|6880->3310|7075->3476|7105->3477|7232->3575|7262->3576|7359->3644|7389->3645|7506->3733|7536->3734|7585->3754|7615->3755|7655->3766|7685->3767|7723->3777|7753->3778|7801->3797|7831->3798|7894->3833|7924->3834|7972->3853|8002->3854|8050->3873|8080->3874|8145->3910|8175->3911|8277->3985|8307->3986|8357->4007|8387->4008|8435->4027|8465->4028|8536->4070|8566->4071|8656->4132|8686->4133|8750->4168|8780->4169|8845->4205|8875->4206|8949->4251|8979->4252|9045->4289|9075->4290|9143->4329|9173->4330|9238->4366|9268->4367|9342->4412|9372->4413|9413->4425|9443->4426|9483->4437|9513->4438|9552->4449|9582->4450|9632->4471|9662->4472|9725->4506|9755->4507|10042->4765|10072->4766|10110->4776|10140->4777|10189->4797|10219->4798|10283->4834|10313->4835|10365->4858|10395->4859|10459->4895|10489->4896|10540->4918|10570->4919|10661->4981|10691->4982|10882->5144|10912->5145|10964->5168|10994->5169|11096->5242|11126->5243|11169->5257|11199->5258|11263->5293|11293->5294|11334->5307|11364->5308|11403->5319|11432->5320|11468->5328|11497->5329|11532->5336|11561->5337|11610->5357|11640->5358|11708->5397|11738->5398|11796->5427|11826->5428|11872->5445|11902->5446|11961->5477|11990->5478|12025->5485|12054->5486|12161->5565|12190->5566|12237->5584|12267->5585|12435->5724|12465->5725|12524->5755|12554->5756|12783->5956|12813->5957|13067->6182|13097->6183|13194->6251|13224->6252|13341->6340|13371->6341|13420->6361|13450->6362|13490->6373|13520->6374|13558->6384|13588->6385|13636->6404|13666->6405|13732->6443|13762->6444|13810->6463|13840->6464|13888->6483|13918->6484|13983->6520|14013->6521|14115->6595|14145->6596|14195->6617|14225->6618|14273->6637|14303->6638|14374->6680|14404->6681|14494->6742|14524->6743|14588->6778|14618->6779|14683->6815|14713->6816|14787->6861|14817->6862|14883->6899|14913->6900|14981->6939|15011->6940|15076->6976|15106->6977|15179->7021|15209->7022|15250->7034|15280->7035|15320->7046|15350->7047|15389->7058|15419->7059|15469->7080|15499->7081|15562->7115|15592->7116|15882->7377|15912->7378|15950->7388|15980->7389|16029->7409|16059->7410|16123->7446|16153->7447|16205->7470|16235->7471|16299->7507|16329->7508|16380->7530|16410->7531|16501->7593|16531->7594|16722->7756|16752->7757|16804->7780|16834->7781|16966->7884|16996->7885|17039->7899|17069->7900|17133->7935|17163->7936|17204->7949|17234->7950|17273->7961|17302->7962|17338->7970|17367->7971|17402->7978|17431->7979|17480->7999|17510->8000|17564->8025|17594->8026|17638->8041|17668->8042|17726->8072|17755->8073|17819->8108|17849->8109|17992->8223|18022->8224|18225->8399|18254->8400|18287->8405|18316->8406|18363->8424|18393->8425|18446->8450|18475->8451|18542->8489|18572->8490|18834->8723|18864->8724|18912->8744|18941->8745|18986->8761|19016->8762|19063->8781|19092->8782|19125->8787|19154->8788|19205->8810|19235->8811|19283->8830|19313->8831|19362->8851|19392->8852|19487->8919|19516->8920|19562->8937|19592->8938|19637->8954|19667->8955|19726->8986|19755->8987|19790->8994|19819->8995|19855->9003|19884->9004|19919->9011|19948->9012|19980->9016|20009->9017|20178->9157|20208->9158|20258->9179|20288->9180|20385->9248|20415->9249|20487->9292|20517->9293|20559->9306|20589->9307|20644->9333|20674->9334|20745->9376|20775->9377|20831->9404|20861->9405|20973->9488|21003->9489|21233->9690|21263->9691|21293->9692|21323->9693|21467->9808|21497->9809|21551->9834|21581->9835|21688->9913|21718->9914|21760->9927|21790->9928|21835->9944|21865->9945|21998->10049|22028->10050|22140->10133|22170->10134|22376->10311|22406->10312|22477->10355|22506->10356|22608->10430|22637->10431|22671->10437|22700->10438|22741->10451|22770->10452|22928->10573|22944->10579|22997->10609|23599->11174|23635->11187
                    LINES: 26->1|30->1|30->2|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|42->14|42->14|42->14|46->18|46->18|50->22|50->22|54->26|54->26|56->28|56->28|58->30|58->30|59->31|59->31|62->34|62->34|63->35|63->35|71->43|71->43|77->49|77->49|79->51|79->51|83->55|83->55|85->57|85->57|87->59|87->59|90->62|90->62|94->66|94->66|94->66|94->66|98->70|98->70|98->70|98->70|101->73|101->73|102->74|102->74|106->78|106->78|108->80|108->80|110->82|110->82|112->84|112->84|116->88|116->88|123->95|123->95|125->97|125->97|127->99|127->99|129->101|129->101|131->103|131->103|132->104|132->104|134->106|134->106|137->109|137->109|138->110|138->110|139->111|139->111|141->113|141->113|142->114|142->114|146->118|146->118|147->119|147->119|151->123|151->123|152->124|152->124|158->130|158->130|161->133|161->133|163->135|163->135|167->139|167->139|168->140|168->140|169->141|169->141|170->142|170->142|171->143|171->143|173->145|173->145|174->146|174->146|175->147|175->147|177->149|177->149|180->152|180->152|182->154|182->154|183->155|183->155|185->157|185->157|188->160|188->160|189->161|189->161|190->162|190->162|192->164|192->164|194->166|194->166|196->168|196->168|198->170|198->170|200->172|200->172|201->173|201->173|202->174|202->174|203->175|203->175|204->176|204->176|205->177|205->177|213->185|213->185|214->186|214->186|215->187|215->187|217->189|217->189|218->190|218->190|220->192|220->192|221->193|221->193|223->195|223->195|228->200|228->200|229->201|229->201|232->204|232->204|233->205|233->205|235->207|235->207|236->208|236->208|237->209|237->209|238->210|238->210|240->212|240->212|242->214|242->214|244->216|244->216|245->217|245->217|246->218|246->218|248->220|248->220|249->221|249->221|253->225|253->225|254->226|254->226|258->230|258->230|259->231|259->231|266->238|266->238|271->243|271->243|273->245|273->245|277->249|277->249|278->250|278->250|279->251|279->251|280->252|280->252|281->253|281->253|283->255|283->255|284->256|284->256|285->257|285->257|287->259|287->259|290->262|290->262|292->264|292->264|293->265|293->265|295->267|295->267|298->270|298->270|299->271|299->271|300->272|300->272|302->274|302->274|304->276|304->276|306->278|306->278|308->280|308->280|310->282|310->282|311->283|311->283|312->284|312->284|313->285|313->285|314->286|314->286|315->287|315->287|323->295|323->295|324->296|324->296|325->297|325->297|327->299|327->299|328->300|328->300|330->302|330->302|331->303|331->303|333->305|333->305|338->310|338->310|339->311|339->311|343->315|343->315|344->316|344->316|346->318|346->318|347->319|347->319|348->320|348->320|349->321|349->321|351->323|351->323|353->325|353->325|355->327|355->327|357->329|357->329|359->331|359->331|363->335|363->335|368->340|368->340|374->346|374->346|375->347|375->347|377->349|377->349|379->351|379->351|382->354|382->354|391->363|391->363|393->365|393->365|394->366|394->366|396->368|396->368|397->369|397->369|399->371|399->371|400->372|400->372|401->373|401->373|405->377|405->377|406->378|406->378|407->379|407->379|409->381|409->381|410->382|410->382|412->384|412->384|414->386|414->386|415->387|415->387|423->395|423->395|424->396|424->396|427->399|427->399|429->401|429->401|430->402|430->402|432->404|432->404|434->406|434->406|436->408|436->408|439->411|439->411|442->414|442->414|442->414|442->414|444->416|444->416|445->417|445->417|447->419|447->419|448->420|448->420|450->422|450->422|456->428|456->428|460->432|460->432|465->437|465->437|467->439|467->439|470->442|470->442|472->444|472->444|474->446|474->446|480->452|480->452|480->452|490->462|490->462
                    -- GENERATED --
                */
            