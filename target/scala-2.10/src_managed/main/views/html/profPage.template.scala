
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
object profPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(stats : Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.16*/(""" """),format.raw/*2.1*/("""

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
    
    def render(stats:Long): play.api.templates.HtmlFormat.Appendable = apply(stats)
    
    def f:((Long) => play.api.templates.HtmlFormat.Appendable) = (stats) => apply(stats)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 24 10:47:22 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/profPage.scala.html
                    HASH: 83e2eb853fd7d98c66eb96829ceffc96d5f04e60
                    MATRIX: 775->1|900->15|927->34|1077->149|1091->155|1146->189|1236->243|1251->249|1305->281|1391->331|1406->337|1482->390|1568->440|1583->446|1655->495|1711->515|1726->521|1793->566|1897->643|1925->644|2133->825|2161->826|2307->945|2335->946|2386->970|2414->971|2477->1006|2506->1007|2560->1033|2589->1034|2666->1084|2694->1085|2726->1090|2754->1091|2897->1206|2926->1207|3154->1408|3182->1409|3245->1444|3274->1445|3399->1542|3428->1543|3466->1554|3494->1555|3563->1596|3592->1597|3699->1676|3728->1677|3894->1816|3922->1817|4002->1869|4031->1870|4205->2017|4233->2018|4310->2067|4339->2068|4471->2173|4499->2174|4583->2230|4612->2231|4753->2345|4781->2346|4814->2352|4842->2353|4910->2393|4939->2394|5006->2434|5034->2435|5127->2500|5156->2501|5380->2697|5409->2698|5486->2747|5515->2748|5579->2785|5607->2786|5675->2825|5705->2826|5770->2863|5799->2864|5832->2869|5861->2870|5910->2890|5940->2891|6010->2932|6040->2933|6098->2962|6128->2963|6174->2980|6204->2981|6263->3012|6292->3013|6327->3020|6356->3021|6460->3097|6489->3098|6536->3116|6566->3117|6734->3256|6764->3257|6823->3287|6853->3288|7048->3454|7078->3455|7205->3553|7235->3554|7332->3622|7362->3623|7479->3711|7509->3712|7558->3732|7588->3733|7628->3744|7658->3745|7696->3755|7726->3756|7774->3775|7804->3776|7867->3811|7897->3812|7945->3831|7975->3832|8023->3851|8053->3852|8118->3888|8148->3889|8250->3963|8280->3964|8330->3985|8360->3986|8408->4005|8438->4006|8509->4048|8539->4049|8629->4110|8659->4111|8723->4146|8753->4147|8818->4183|8848->4184|8922->4229|8952->4230|9018->4267|9048->4268|9116->4307|9146->4308|9211->4344|9241->4345|9315->4390|9345->4391|9386->4403|9416->4404|9456->4415|9486->4416|9525->4427|9555->4428|9605->4449|9635->4450|9698->4484|9728->4485|10015->4743|10045->4744|10083->4754|10113->4755|10162->4775|10192->4776|10256->4812|10286->4813|10338->4836|10368->4837|10432->4873|10462->4874|10513->4896|10543->4897|10634->4959|10664->4960|10855->5122|10885->5123|10937->5146|10967->5147|11069->5220|11099->5221|11142->5235|11172->5236|11236->5271|11266->5272|11307->5285|11337->5286|11376->5297|11405->5298|11441->5306|11470->5307|11505->5314|11534->5315|11583->5335|11613->5336|11681->5375|11711->5376|11769->5405|11799->5406|11845->5423|11875->5424|11934->5455|11963->5456|11998->5463|12027->5464|12134->5543|12163->5544|12210->5562|12240->5563|12408->5702|12438->5703|12497->5733|12527->5734|12756->5934|12786->5935|13040->6160|13070->6161|13167->6229|13197->6230|13314->6318|13344->6319|13393->6339|13423->6340|13463->6351|13493->6352|13531->6362|13561->6363|13609->6382|13639->6383|13705->6421|13735->6422|13783->6441|13813->6442|13861->6461|13891->6462|13956->6498|13986->6499|14088->6573|14118->6574|14168->6595|14198->6596|14246->6615|14276->6616|14347->6658|14377->6659|14467->6720|14497->6721|14561->6756|14591->6757|14656->6793|14686->6794|14760->6839|14790->6840|14856->6877|14886->6878|14954->6917|14984->6918|15049->6954|15079->6955|15152->6999|15182->7000|15223->7012|15253->7013|15293->7024|15323->7025|15362->7036|15392->7037|15442->7058|15472->7059|15535->7093|15565->7094|15855->7355|15885->7356|15923->7366|15953->7367|16002->7387|16032->7388|16096->7424|16126->7425|16178->7448|16208->7449|16272->7485|16302->7486|16353->7508|16383->7509|16474->7571|16504->7572|16695->7734|16725->7735|16777->7758|16807->7759|16939->7862|16969->7863|17012->7877|17042->7878|17106->7913|17136->7914|17177->7927|17207->7928|17246->7939|17275->7940|17311->7948|17340->7949|17375->7956|17404->7957|17453->7977|17483->7978|17537->8003|17567->8004|17611->8019|17641->8020|17699->8050|17728->8051|17792->8086|17822->8087|17965->8201|17995->8202|18198->8377|18227->8378|18260->8383|18289->8384|18336->8402|18366->8403|18419->8428|18448->8429|18515->8467|18545->8468|18807->8701|18837->8702|18885->8722|18914->8723|18959->8739|18989->8740|19036->8759|19065->8760|19098->8765|19127->8766|19178->8788|19208->8789|19256->8808|19286->8809|19335->8829|19365->8830|19460->8897|19489->8898|19535->8915|19565->8916|19610->8932|19640->8933|19699->8964|19728->8965|19763->8972|19792->8973|19828->8981|19857->8982|19892->8989|19921->8990|19953->8994|19982->8995|20151->9135|20181->9136|20231->9157|20261->9158|20358->9226|20388->9227|20460->9270|20490->9271|20532->9284|20562->9285|20617->9311|20647->9312|20718->9354|20748->9355|20804->9382|20834->9383|20946->9466|20976->9467|21206->9668|21236->9669|21266->9670|21296->9671|21440->9786|21470->9787|21524->9812|21554->9813|21661->9891|21691->9892|21733->9905|21763->9906|21808->9922|21838->9923|21971->10027|22001->10028|22113->10111|22143->10112|22349->10289|22379->10290|22450->10333|22479->10334|22581->10408|22610->10409|22644->10415|22673->10416|22714->10429|22743->10430|22901->10551|22917->10557|22970->10587
                    LINES: 26->1|30->1|30->2|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|42->14|42->14|42->14|46->18|46->18|50->22|50->22|54->26|54->26|56->28|56->28|58->30|58->30|59->31|59->31|62->34|62->34|63->35|63->35|71->43|71->43|77->49|77->49|79->51|79->51|83->55|83->55|85->57|85->57|87->59|87->59|90->62|90->62|94->66|94->66|94->66|94->66|98->70|98->70|98->70|98->70|101->73|101->73|102->74|102->74|106->78|106->78|108->80|108->80|110->82|110->82|112->84|112->84|116->88|116->88|123->95|123->95|125->97|125->97|127->99|127->99|129->101|129->101|131->103|131->103|132->104|132->104|134->106|134->106|137->109|137->109|138->110|138->110|139->111|139->111|141->113|141->113|142->114|142->114|146->118|146->118|147->119|147->119|151->123|151->123|152->124|152->124|158->130|158->130|161->133|161->133|163->135|163->135|167->139|167->139|168->140|168->140|169->141|169->141|170->142|170->142|171->143|171->143|173->145|173->145|174->146|174->146|175->147|175->147|177->149|177->149|180->152|180->152|182->154|182->154|183->155|183->155|185->157|185->157|188->160|188->160|189->161|189->161|190->162|190->162|192->164|192->164|194->166|194->166|196->168|196->168|198->170|198->170|200->172|200->172|201->173|201->173|202->174|202->174|203->175|203->175|204->176|204->176|205->177|205->177|213->185|213->185|214->186|214->186|215->187|215->187|217->189|217->189|218->190|218->190|220->192|220->192|221->193|221->193|223->195|223->195|228->200|228->200|229->201|229->201|232->204|232->204|233->205|233->205|235->207|235->207|236->208|236->208|237->209|237->209|238->210|238->210|240->212|240->212|242->214|242->214|244->216|244->216|245->217|245->217|246->218|246->218|248->220|248->220|249->221|249->221|253->225|253->225|254->226|254->226|258->230|258->230|259->231|259->231|266->238|266->238|271->243|271->243|273->245|273->245|277->249|277->249|278->250|278->250|279->251|279->251|280->252|280->252|281->253|281->253|283->255|283->255|284->256|284->256|285->257|285->257|287->259|287->259|290->262|290->262|292->264|292->264|293->265|293->265|295->267|295->267|298->270|298->270|299->271|299->271|300->272|300->272|302->274|302->274|304->276|304->276|306->278|306->278|308->280|308->280|310->282|310->282|311->283|311->283|312->284|312->284|313->285|313->285|314->286|314->286|315->287|315->287|323->295|323->295|324->296|324->296|325->297|325->297|327->299|327->299|328->300|328->300|330->302|330->302|331->303|331->303|333->305|333->305|338->310|338->310|339->311|339->311|343->315|343->315|344->316|344->316|346->318|346->318|347->319|347->319|348->320|348->320|349->321|349->321|351->323|351->323|353->325|353->325|355->327|355->327|357->329|357->329|359->331|359->331|363->335|363->335|368->340|368->340|374->346|374->346|375->347|375->347|377->349|377->349|379->351|379->351|382->354|382->354|391->363|391->363|393->365|393->365|394->366|394->366|396->368|396->368|397->369|397->369|399->371|399->371|400->372|400->372|401->373|401->373|405->377|405->377|406->378|406->378|407->379|407->379|409->381|409->381|410->382|410->382|412->384|412->384|414->386|414->386|415->387|415->387|423->395|423->395|424->396|424->396|427->399|427->399|429->401|429->401|430->402|430->402|432->404|432->404|434->406|434->406|436->408|436->408|439->411|439->411|442->414|442->414|442->414|442->414|444->416|444->416|445->417|445->417|447->419|447->419|448->420|448->420|450->422|450->422|456->428|456->428|460->432|460->432|465->437|465->437|467->439|467->439|470->442|470->442|472->444|472->444|474->446|474->446|480->452|480->452|480->452
                    -- GENERATED --
                */
            