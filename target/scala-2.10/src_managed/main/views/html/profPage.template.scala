
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
	var speed_y;
	var voice_y;
	var newVal;
	var server_message;

	function displayQuestion(question) """),format.raw/*21.37*/("""{"""),format.raw/*21.38*/("""
		$('#posted_question')
				.append(
						'<div style="background-color: white; margin: 0 10px 10px 0; padding: 7px; border-radius:5px;">'
								+ question + '</div>');
		$(".test").show();
	"""),format.raw/*27.2*/("""}"""),format.raw/*27.3*/("""
	
	$(document).ready(function() """),format.raw/*29.31*/("""{"""),format.raw/*29.32*/("""

		var connection = new WebSocket('ws://localhost:9000');

		connection.onopen = function() """),format.raw/*33.34*/("""{"""),format.raw/*33.35*/("""
			//
		"""),format.raw/*35.3*/("""}"""),format.raw/*35.4*/("""

		connection.onmessage = function(e) """),format.raw/*37.38*/("""{"""),format.raw/*37.39*/("""
			server_message = e.data;

			if (server_message.indexOf("speed_") > -1) """),format.raw/*40.47*/("""{"""),format.raw/*40.48*/("""
				server_message = server_message.replace("speed_", "");
				speed_y = Number(server_message);
				console.log('speed y: ' + y);
			"""),format.raw/*44.4*/("""}"""),format.raw/*44.5*/(""" else if (server_message.indexOf("loudness_") > -1) """),format.raw/*44.57*/("""{"""),format.raw/*44.58*/("""
				server_message = server_message.replace("loudness_", "");
				voice_y = Number(server_message);
				console.log('Loud y: ' + voice_y);
			"""),format.raw/*48.4*/("""}"""),format.raw/*48.5*/(""" else if (server_message.indexOf("pause_") > -1) """),format.raw/*48.54*/("""{"""),format.raw/*48.55*/("""
				server_message = server_message.replace("pause_", "");
				newVal = parseInt(server_message);
			"""),format.raw/*51.4*/("""}"""),format.raw/*51.5*/("""
			else if (server_message.indexOf("question_") > -1) """),format.raw/*52.55*/("""{"""),format.raw/*52.56*/("""
				server_message = server_message.replace(
						"question_", "");
				displayQuestion(server_message);
			"""),format.raw/*56.4*/("""}"""),format.raw/*56.5*/("""

		"""),format.raw/*58.3*/("""}"""),format.raw/*58.4*/(""";

		connection.onclose = function(e) """),format.raw/*60.36*/("""{"""),format.raw/*60.37*/("""
			alert("CONNECTION IS CLOSED~");
		"""),format.raw/*62.3*/("""}"""),format.raw/*62.4*/("""

		$("#submit").click(function() """),format.raw/*64.33*/("""{"""),format.raw/*64.34*/("""
			$.post("/postQuestion", """),format.raw/*65.28*/("""{"""),format.raw/*65.29*/("""
				question : $("#question").val()
			"""),format.raw/*67.4*/("""}"""),format.raw/*67.5*/(""").done(function() """),format.raw/*67.23*/("""{"""),format.raw/*67.24*/("""
				alert("Success");
			"""),format.raw/*69.4*/("""}"""),format.raw/*69.5*/(""")
		"""),format.raw/*70.3*/("""}"""),format.raw/*70.4*/(""");

		$("#cancel").click(function() """),format.raw/*72.33*/("""{"""),format.raw/*72.34*/("""
			$("#q_area").hide();
		"""),format.raw/*74.3*/("""}"""),format.raw/*74.4*/(""");

		$("#add").click(function() """),format.raw/*76.30*/("""{"""),format.raw/*76.31*/("""
			$("#q_area").show();
		"""),format.raw/*78.3*/("""}"""),format.raw/*78.4*/(""");
	"""),format.raw/*79.2*/("""}"""),format.raw/*79.3*/(""");

	$(function() """),format.raw/*81.15*/("""{"""),format.raw/*81.16*/("""

		$(document).ready(
				function() """),format.raw/*84.16*/("""{"""),format.raw/*84.17*/("""
					Highcharts.setOptions("""),format.raw/*85.28*/("""{"""),format.raw/*85.29*/("""
						global : """),format.raw/*86.16*/("""{"""),format.raw/*86.17*/("""
							useUTC : false
						"""),format.raw/*88.7*/("""}"""),format.raw/*88.8*/("""
					"""),format.raw/*89.6*/("""}"""),format.raw/*89.7*/(""");

					var chart;
					$('#container-speed-chart').highcharts(
							"""),format.raw/*93.8*/("""{"""),format.raw/*93.9*/("""
								chart : """),format.raw/*94.17*/("""{"""),format.raw/*94.18*/("""
									type : 'spline',
									animation : Highcharts.svg, // don't animate in old IE
									marginRight : 5,
									events : """),format.raw/*98.19*/("""{"""),format.raw/*98.20*/("""
										load : function() """),format.raw/*99.29*/("""{"""),format.raw/*99.30*/("""

											// set up the updating of the chart each second
											var series = this.series[0];
											//var y = 0;

											setInterval(function() """),format.raw/*105.35*/("""{"""),format.raw/*105.36*/("""

												var x = (new Date()).getTime(); // current time
												if (speed_y == null) """),format.raw/*108.34*/("""{"""),format.raw/*108.35*/("""
													speed_y = 50; //used for initialization
												"""),format.raw/*110.13*/("""}"""),format.raw/*110.14*/("""
												series.addPoint([ x, speed_y ],
														true, true);

											"""),format.raw/*114.12*/("""}"""),format.raw/*114.13*/(""", 1000);
										"""),format.raw/*115.11*/("""}"""),format.raw/*115.12*/("""
									"""),format.raw/*116.10*/("""}"""),format.raw/*116.11*/("""
								"""),format.raw/*117.9*/("""}"""),format.raw/*117.10*/(""",
								title : """),format.raw/*118.17*/("""{"""),format.raw/*118.18*/("""
									text : 'Speed'
								"""),format.raw/*120.9*/("""}"""),format.raw/*120.10*/(""",
								xAxis : """),format.raw/*121.17*/("""{"""),format.raw/*121.18*/("""
									title : """),format.raw/*122.18*/("""{"""),format.raw/*122.19*/("""
										text : 'Time'
									"""),format.raw/*124.10*/("""}"""),format.raw/*124.11*/(""",
									type : 'datetime',
									tickPixelInterval : 150
								"""),format.raw/*127.9*/("""}"""),format.raw/*127.10*/(""",

								yAxis : """),format.raw/*129.17*/("""{"""),format.raw/*129.18*/("""
									title : """),format.raw/*130.18*/("""{"""),format.raw/*130.19*/("""
										text : 'Percentage'
									"""),format.raw/*132.10*/("""}"""),format.raw/*132.11*/(""",
									min : 0,
									max : 100,
									labels : """),format.raw/*135.19*/("""{"""),format.raw/*135.20*/("""
										formatter : function() """),format.raw/*136.34*/("""{"""),format.raw/*136.35*/("""
											if (this.value == 100) """),format.raw/*137.35*/("""{"""),format.raw/*137.36*/("""
												return 'Too Fast';
											"""),format.raw/*139.12*/("""}"""),format.raw/*139.13*/("""

											if (this.value == 50) """),format.raw/*141.34*/("""{"""),format.raw/*141.35*/("""
												return 'OK';
											"""),format.raw/*143.12*/("""}"""),format.raw/*143.13*/("""

											if (this.value == 0) """),format.raw/*145.33*/("""{"""),format.raw/*145.34*/("""
												return 'Too Slow';
											"""),format.raw/*147.12*/("""}"""),format.raw/*147.13*/("""
										"""),format.raw/*148.11*/("""}"""),format.raw/*148.12*/("""
									"""),format.raw/*149.10*/("""}"""),format.raw/*149.11*/(""",
								"""),format.raw/*150.9*/("""}"""),format.raw/*150.10*/(""",
								tooltip : """),format.raw/*151.19*/("""{"""),format.raw/*151.20*/("""
									formatter : function() """),format.raw/*152.33*/("""{"""),format.raw/*152.34*/("""
										return 'At time: '
												+ Highcharts.dateFormat(
														'%H:%M:%S', this.x)
												+ '<br/>'
												+ 'Average speed requested '
												+ Highcharts.numberFormat(
														this.speed_y, 2) + '%';
									"""),format.raw/*160.10*/("""}"""),format.raw/*160.11*/("""
								"""),format.raw/*161.9*/("""}"""),format.raw/*161.10*/(""",
								legend : """),format.raw/*162.18*/("""{"""),format.raw/*162.19*/("""
									enabled : false
								"""),format.raw/*164.9*/("""}"""),format.raw/*164.10*/(""",
								exporting : """),format.raw/*165.21*/("""{"""),format.raw/*165.22*/("""
									enabled : false
								"""),format.raw/*167.9*/("""}"""),format.raw/*167.10*/(""",
								series : [ """),format.raw/*168.20*/("""{"""),format.raw/*168.21*/("""
									name : 'Random data',
									data : (function() """),format.raw/*170.29*/("""{"""),format.raw/*170.30*/("""
										// generate an array of random data
										var data = [], time = (new Date())
												.getTime(), i;

										for (i = -19; i <= 0; i++) """),format.raw/*175.38*/("""{"""),format.raw/*175.39*/("""
											data.push("""),format.raw/*176.22*/("""{"""),format.raw/*176.23*/("""
												x : time + i * 1000,
												speed_y : 50
											"""),format.raw/*179.12*/("""}"""),format.raw/*179.13*/(""");
										"""),format.raw/*180.11*/("""}"""),format.raw/*180.12*/("""
										return data;
									"""),format.raw/*182.10*/("""}"""),format.raw/*182.11*/(""")()
								"""),format.raw/*183.9*/("""}"""),format.raw/*183.10*/(""" ]
							"""),format.raw/*184.8*/("""}"""),format.raw/*184.9*/(""");
				"""),format.raw/*185.5*/("""}"""),format.raw/*185.6*/(""");

	"""),format.raw/*187.2*/("""}"""),format.raw/*187.3*/(""");

	$(function() """),format.raw/*189.15*/("""{"""),format.raw/*189.16*/("""
		$(document).ready(
				function() """),format.raw/*191.16*/("""{"""),format.raw/*191.17*/("""
					Highcharts.setOptions("""),format.raw/*192.28*/("""{"""),format.raw/*192.29*/("""
						global : """),format.raw/*193.16*/("""{"""),format.raw/*193.17*/("""
							useUTC : false
						"""),format.raw/*195.7*/("""}"""),format.raw/*195.8*/("""
					"""),format.raw/*196.6*/("""}"""),format.raw/*196.7*/(""");

					var chart;
					$('#container-loudness-chart').highcharts(
							"""),format.raw/*200.8*/("""{"""),format.raw/*200.9*/("""
								chart : """),format.raw/*201.17*/("""{"""),format.raw/*201.18*/("""
									type : 'spline',
									animation : Highcharts.svg, // don't animate in old IE
									marginRight : 5,
									events : """),format.raw/*205.19*/("""{"""),format.raw/*205.20*/("""
										load : function() """),format.raw/*206.29*/("""{"""),format.raw/*206.30*/("""

											// set up the updating of the chart each second
											var series = this.series[0];
											//var y = 0;
											//var server_message;

											setInterval(function() """),format.raw/*213.35*/("""{"""),format.raw/*213.36*/("""

												//var connection = new WebSocket('ws://localhost:9000');  //initialize the websocket inside the "interval loop"

												var x = (new Date()).getTime(); // current time
												if (voice_y == null) """),format.raw/*218.34*/("""{"""),format.raw/*218.35*/("""
													voice_y = 50; //used for initialization
												"""),format.raw/*220.13*/("""}"""),format.raw/*220.14*/("""
												series.addPoint([ x, voice_y ],
														true, true);

											"""),format.raw/*224.12*/("""}"""),format.raw/*224.13*/(""", 1000);
										"""),format.raw/*225.11*/("""}"""),format.raw/*225.12*/("""
									"""),format.raw/*226.10*/("""}"""),format.raw/*226.11*/("""
								"""),format.raw/*227.9*/("""}"""),format.raw/*227.10*/(""",
								title : """),format.raw/*228.17*/("""{"""),format.raw/*228.18*/("""
									text : 'Loudness'
								"""),format.raw/*230.9*/("""}"""),format.raw/*230.10*/(""",
								xAxis : """),format.raw/*231.17*/("""{"""),format.raw/*231.18*/("""
									title : """),format.raw/*232.18*/("""{"""),format.raw/*232.19*/("""
										text : 'Time'
									"""),format.raw/*234.10*/("""}"""),format.raw/*234.11*/(""",
									type : 'datetime',
									tickPixelInterval : 150
								"""),format.raw/*237.9*/("""}"""),format.raw/*237.10*/(""",

								yAxis : """),format.raw/*239.17*/("""{"""),format.raw/*239.18*/("""
									title : """),format.raw/*240.18*/("""{"""),format.raw/*240.19*/("""
										text : 'Percentage'
									"""),format.raw/*242.10*/("""}"""),format.raw/*242.11*/(""",
									min : 0,
									max : 100,
									labels : """),format.raw/*245.19*/("""{"""),format.raw/*245.20*/("""
										formatter : function() """),format.raw/*246.34*/("""{"""),format.raw/*246.35*/("""
											if (this.value == 100) """),format.raw/*247.35*/("""{"""),format.raw/*247.36*/("""
												return 'Too Loud';
											"""),format.raw/*249.12*/("""}"""),format.raw/*249.13*/("""

											if (this.value == 50) """),format.raw/*251.34*/("""{"""),format.raw/*251.35*/("""
												return 'OK';
											"""),format.raw/*253.12*/("""}"""),format.raw/*253.13*/("""

											if (this.value == 0) """),format.raw/*255.33*/("""{"""),format.raw/*255.34*/("""
												return 'Too Low';
											"""),format.raw/*257.12*/("""}"""),format.raw/*257.13*/("""
										"""),format.raw/*258.11*/("""}"""),format.raw/*258.12*/("""
									"""),format.raw/*259.10*/("""}"""),format.raw/*259.11*/(""",
								"""),format.raw/*260.9*/("""}"""),format.raw/*260.10*/(""",
								tooltip : """),format.raw/*261.19*/("""{"""),format.raw/*261.20*/("""
									formatter : function() """),format.raw/*262.33*/("""{"""),format.raw/*262.34*/("""
										return 'At time: '
												+ Highcharts.dateFormat(
														'%H:%M:%S', this.x)
												+ '<br/>'
												+ 'Average loudness requested '
												+ Highcharts.numberFormat(
														this.voice_y, 2) + '%';
									"""),format.raw/*270.10*/("""}"""),format.raw/*270.11*/("""
								"""),format.raw/*271.9*/("""}"""),format.raw/*271.10*/(""",
								legend : """),format.raw/*272.18*/("""{"""),format.raw/*272.19*/("""
									enabled : false
								"""),format.raw/*274.9*/("""}"""),format.raw/*274.10*/(""",
								exporting : """),format.raw/*275.21*/("""{"""),format.raw/*275.22*/("""
									enabled : false
								"""),format.raw/*277.9*/("""}"""),format.raw/*277.10*/(""",
								series : [ """),format.raw/*278.20*/("""{"""),format.raw/*278.21*/("""
									name : 'Random data',
									data : (function() """),format.raw/*280.29*/("""{"""),format.raw/*280.30*/("""
										// generate an array of random data
										var data = [], time = (new Date())
												.getTime(), i;

										for (i = -19; i <= 0; i++) """),format.raw/*285.38*/("""{"""),format.raw/*285.39*/("""
											data.push("""),format.raw/*286.22*/("""{"""),format.raw/*286.23*/("""
												x : time + i * 1000,
												voice_y : 50
											//initialization 
											"""),format.raw/*290.12*/("""}"""),format.raw/*290.13*/(""");
										"""),format.raw/*291.11*/("""}"""),format.raw/*291.12*/("""
										return data;
									"""),format.raw/*293.10*/("""}"""),format.raw/*293.11*/(""")()
								"""),format.raw/*294.9*/("""}"""),format.raw/*294.10*/(""" ]
							"""),format.raw/*295.8*/("""}"""),format.raw/*295.9*/(""");
				"""),format.raw/*296.5*/("""}"""),format.raw/*296.6*/(""");

	"""),format.raw/*298.2*/("""}"""),format.raw/*298.3*/(""");

	$(function() """),format.raw/*300.15*/("""{"""),format.raw/*300.16*/("""

		var gaugeOptions = """),format.raw/*302.22*/("""{"""),format.raw/*302.23*/("""

			chart : """),format.raw/*304.12*/("""{"""),format.raw/*304.13*/("""
				type : 'solidgauge'
			"""),format.raw/*306.4*/("""}"""),format.raw/*306.5*/(""",

			title : null,

			pane : """),format.raw/*310.11*/("""{"""),format.raw/*310.12*/("""
				center : [ '50%', '85%' ],
				size : '140%',
				startAngle : -90,
				endAngle : 90,
				background : """),format.raw/*315.18*/("""{"""),format.raw/*315.19*/("""
					backgroundColor : (Highcharts.theme && Highcharts.theme.background2)
							|| '#EEE',
					innerRadius : '60%',
					outerRadius : '100%',
					shape : 'arc'
				"""),format.raw/*321.5*/("""}"""),format.raw/*321.6*/("""
			"""),format.raw/*322.4*/("""}"""),format.raw/*322.5*/(""",

			tooltip : """),format.raw/*324.14*/("""{"""),format.raw/*324.15*/("""
				enabled : true
			"""),format.raw/*326.4*/("""}"""),format.raw/*326.5*/(""",

			// the value axis
			yAxis : """),format.raw/*329.12*/("""{"""),format.raw/*329.13*/("""
				stops : [ [ 0.1, '#55BF3B' ], // green
				[ 0.5, '#DDDF0D' ], // yellow
				[ 0.9, '#DF5353' ] // red
				],
				lineWidth : 0,
				minorTickInterval : null,
				tickPixelInterval : 400,
				tickWidth : 0,
				title : """),format.raw/*338.13*/("""{"""),format.raw/*338.14*/("""
					y : -70
				"""),format.raw/*340.5*/("""}"""),format.raw/*340.6*/(""",
				labels : """),format.raw/*341.14*/("""{"""),format.raw/*341.15*/("""
					y : 16
				"""),format.raw/*343.5*/("""}"""),format.raw/*343.6*/("""
			"""),format.raw/*344.4*/("""}"""),format.raw/*344.5*/(""",

			plotOptions : """),format.raw/*346.18*/("""{"""),format.raw/*346.19*/("""
				solidgauge : """),format.raw/*347.18*/("""{"""),format.raw/*347.19*/("""
					dataLabels : """),format.raw/*348.19*/("""{"""),format.raw/*348.20*/("""
						y : 5,
						borderWidth : 0,
						useHTML : true
					"""),format.raw/*352.6*/("""}"""),format.raw/*352.7*/(""",
					states : """),format.raw/*353.15*/("""{"""),format.raw/*353.16*/("""
						hover : """),format.raw/*354.15*/("""{"""),format.raw/*354.16*/("""
							enabled : true
						"""),format.raw/*356.7*/("""}"""),format.raw/*356.8*/("""
					"""),format.raw/*357.6*/("""}"""),format.raw/*357.7*/("""

				"""),format.raw/*359.5*/("""}"""),format.raw/*359.6*/("""

			"""),format.raw/*361.4*/("""}"""),format.raw/*361.5*/("""
		"""),format.raw/*362.3*/("""}"""),format.raw/*362.4*/(""";

		// The speed gauge
		$('#container-speed')
				.highcharts(
						Highcharts
								.merge(
										gaugeOptions,
										"""),format.raw/*370.11*/("""{"""),format.raw/*370.12*/("""
											yAxis : """),format.raw/*371.20*/("""{"""),format.raw/*371.21*/("""
												min : 0,
												max : 100,
												title : """),format.raw/*374.21*/("""{"""),format.raw/*374.22*/("""
													text : 'Pause'
												"""),format.raw/*376.13*/("""}"""),format.raw/*376.14*/("""
											"""),format.raw/*377.12*/("""}"""),format.raw/*377.13*/(""",

											credits : """),format.raw/*379.22*/("""{"""),format.raw/*379.23*/("""
												enabled : false
											"""),format.raw/*381.12*/("""}"""),format.raw/*381.13*/(""",

											series : [ """),format.raw/*383.23*/("""{"""),format.raw/*383.24*/("""
												name : 'Pause',
												data : [ 0 ],
												dataLabels : """),format.raw/*386.26*/("""{"""),format.raw/*386.27*/("""
													format : '<div style="text-align:center"><span style="font-size:25px;color:'
															+ ((Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black')
															+ '">"""),format.raw/*389.21*/("""{"""),format.raw/*389.22*/("""y"""),format.raw/*389.23*/("""}"""),format.raw/*389.24*/("""</span><br/>'
															+ '<span style="font-size:12px;color:silver">Pause counts</span></div>'
												"""),format.raw/*391.13*/("""}"""),format.raw/*391.14*/(""",
												tooltip : """),format.raw/*392.23*/("""{"""),format.raw/*392.24*/("""
													valueSuffix : 'Number of persons voted for pause'
												"""),format.raw/*394.13*/("""}"""),format.raw/*394.14*/("""
											"""),format.raw/*395.12*/("""}"""),format.raw/*395.13*/(""" ]

										"""),format.raw/*397.11*/("""}"""),format.raw/*397.12*/("""));

		// The RPM gauge
		;
		//var newVal;
		// Bring life to the dials
		setInterval(function() """),format.raw/*403.26*/("""{"""),format.raw/*403.27*/("""

			// Speed
			var chart = $('#container-speed').highcharts();
			if (chart) """),format.raw/*407.15*/("""{"""),format.raw/*407.16*/("""
				var point = chart.series[0].points[0];
				//   inc = Math.round((Math.random() - 0.5) * 100);

				// newVal = point.y + inc;
				/*  if (newVal < 0 || newVal > 100) """),format.raw/*412.41*/("""{"""),format.raw/*412.42*/("""
				      newVal = point.y - inc;
				  """),format.raw/*414.7*/("""}"""),format.raw/*414.8*/("""*/
				console.log('pause 2: ' + newVal);
				point.update(newVal);
			"""),format.raw/*417.4*/("""}"""),format.raw/*417.5*/("""

		"""),format.raw/*419.3*/("""}"""),format.raw/*419.4*/(""", 2000);

	"""),format.raw/*421.2*/("""}"""),format.raw/*421.3*/(""");
</script>

<script>
	//	$(function () """),format.raw/*425.19*/("""{"""),format.raw/*425.20*/("""
	//	$('#container-questions').
	//"""),format.raw/*427.4*/("""}"""),format.raw/*427.5*/(""");
</script>

</head>
<body>
	<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
		<img src=""""),_display_(Seq[Any](/*433.14*/routes/*433.20*/.Assets.at(" images/logo.png"))),format.raw/*433.50*/("""" height="50px"
			width="150px" alt="Live Feed">
	</div>
	<header class="navbar navbar-static-top bs-docs-nav" id="top"
		role="banner">
		<div class="btn-group" style="float: right;">
			<a type="button" class="btn btn-default" href="/home">Home</a> <a
				type="button" class="btn btn-default" href="/aboutus">About Us</a> <a
				type="button" class="btn btn-default" href="/contact">Contact</a> <a
				type="button" class="btn btn-default" href="/feedback">Feedback</a>
		</div>
	</header>

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
		<!-- 
		<tbody height=20%>
			<tr>
				<td width=50% height="50%">
					<h2 style="margin-left: 100px;">Question Section</h2>
					<div class="well col-lg-4"
						style="margin-left: 100px; width: 200px;">
						<a type="button" class="btn btn-primary btn-group-justified"
							id="add">Add Question</a>
					</div>
					<div id="q_area" class="well col-sm-10"
						style="margin-left: 100px; display: none;">
						<textarea class="form-control" rows="3" columns="50" id="question"
							placeholder="Enter Question Here"></textarea>
						<div class="btn-group-justified" style="margin-top: 20px;">
							<a type="button" class="btn btn-success" id="submit">Submit</a> <a
								type="button" class="btn btn-danger" id="cancel">Cancel</a>
						</div>
					</div> 


				</td>
				<td width="50%">
					<div id="pause_gauge" align="center">
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
		-->
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
                    DATE: Thu Jun 19 18:39:10 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/profPage.scala.html
                    HASH: d360733b5192a3543d54d9cb510160433e8da642
                    MATRIX: 775->1|900->15|927->34|1077->149|1091->155|1146->189|1236->243|1251->249|1305->281|1391->331|1406->337|1482->390|1568->440|1583->446|1655->495|1711->515|1726->521|1793->566|1971->716|2000->717|2228->918|2256->919|2319->954|2348->955|2473->1052|2502->1053|2540->1064|2568->1065|2637->1106|2666->1107|2773->1186|2802->1187|2968->1326|2996->1327|3076->1379|3105->1380|3279->1527|3307->1528|3384->1577|3413->1578|3545->1683|3573->1684|3657->1740|3686->1741|3827->1855|3855->1856|3888->1862|3916->1863|3984->1903|4013->1904|4080->1944|4108->1945|4172->1981|4201->1982|4258->2011|4287->2012|4356->2054|4384->2055|4430->2073|4459->2074|4514->2102|4542->2103|4574->2108|4602->2109|4668->2147|4697->2148|4753->2177|4781->2178|4844->2213|4873->2214|4929->2243|4957->2244|4989->2249|5017->2250|5065->2270|5094->2271|5163->2312|5192->2313|5249->2342|5278->2343|5323->2360|5352->2361|5410->2392|5438->2393|5472->2400|5500->2401|5603->2477|5631->2478|5677->2496|5706->2497|5873->2636|5902->2637|5960->2667|5989->2668|6184->2834|6214->2835|6341->2933|6371->2934|6468->3002|6498->3003|6615->3091|6645->3092|6694->3112|6724->3113|6764->3124|6794->3125|6832->3135|6862->3136|6910->3155|6940->3156|7003->3191|7033->3192|7081->3211|7111->3212|7159->3231|7189->3232|7254->3268|7284->3269|7386->3343|7416->3344|7466->3365|7496->3366|7544->3385|7574->3386|7645->3428|7675->3429|7765->3490|7795->3491|7859->3526|7889->3527|7954->3563|7984->3564|8058->3609|8088->3610|8154->3647|8184->3648|8252->3687|8282->3688|8347->3724|8377->3725|8451->3770|8481->3771|8522->3783|8552->3784|8592->3795|8622->3796|8661->3807|8691->3808|8741->3829|8771->3830|8834->3864|8864->3865|9151->4123|9181->4124|9219->4134|9249->4135|9298->4155|9328->4156|9392->4192|9422->4193|9474->4216|9504->4217|9568->4253|9598->4254|9649->4276|9679->4277|9770->4339|9800->4340|9991->4502|10021->4503|10073->4526|10103->4527|10205->4600|10235->4601|10278->4615|10308->4616|10372->4651|10402->4652|10443->4665|10473->4666|10512->4677|10541->4678|10577->4686|10606->4687|10641->4694|10670->4695|10719->4715|10749->4716|10817->4755|10847->4756|10905->4785|10935->4786|10981->4803|11011->4804|11070->4835|11099->4836|11134->4843|11163->4844|11270->4923|11299->4924|11346->4942|11376->4943|11544->5082|11574->5083|11633->5113|11663->5114|11892->5314|11922->5315|12176->5540|12206->5541|12303->5609|12333->5610|12450->5698|12480->5699|12529->5719|12559->5720|12599->5731|12629->5732|12667->5742|12697->5743|12745->5762|12775->5763|12841->5801|12871->5802|12919->5821|12949->5822|12997->5841|13027->5842|13092->5878|13122->5879|13224->5953|13254->5954|13304->5975|13334->5976|13382->5995|13412->5996|13483->6038|13513->6039|13603->6100|13633->6101|13697->6136|13727->6137|13792->6173|13822->6174|13896->6219|13926->6220|13992->6257|14022->6258|14090->6297|14120->6298|14185->6334|14215->6335|14288->6379|14318->6380|14359->6392|14389->6393|14429->6404|14459->6405|14498->6416|14528->6417|14578->6438|14608->6439|14671->6473|14701->6474|14991->6735|15021->6736|15059->6746|15089->6747|15138->6767|15168->6768|15232->6804|15262->6805|15314->6828|15344->6829|15408->6865|15438->6866|15489->6888|15519->6889|15610->6951|15640->6952|15831->7114|15861->7115|15913->7138|15943->7139|16075->7242|16105->7243|16148->7257|16178->7258|16242->7293|16272->7294|16313->7307|16343->7308|16382->7319|16411->7320|16447->7328|16476->7329|16511->7336|16540->7337|16589->7357|16619->7358|16673->7383|16703->7384|16747->7399|16777->7400|16835->7430|16864->7431|16928->7466|16958->7467|17101->7581|17131->7582|17334->7757|17363->7758|17396->7763|17425->7764|17472->7782|17502->7783|17555->7808|17584->7809|17651->7847|17681->7848|17943->8081|17973->8082|18021->8102|18050->8103|18095->8119|18125->8120|18172->8139|18201->8140|18234->8145|18263->8146|18314->8168|18344->8169|18392->8188|18422->8189|18471->8209|18501->8210|18596->8277|18625->8278|18671->8295|18701->8296|18746->8312|18776->8313|18835->8344|18864->8345|18899->8352|18928->8353|18964->8361|18993->8362|19028->8369|19057->8370|19089->8374|19118->8375|19287->8515|19317->8516|19367->8537|19397->8538|19494->8606|19524->8607|19596->8650|19626->8651|19668->8664|19698->8665|19753->8691|19783->8692|19854->8734|19884->8735|19940->8762|19970->8763|20082->8846|20112->8847|20342->9048|20372->9049|20402->9050|20432->9051|20576->9166|20606->9167|20660->9192|20690->9193|20797->9271|20827->9272|20869->9285|20899->9286|20944->9302|20974->9303|21107->9407|21137->9408|21249->9491|21279->9492|21485->9669|21515->9670|21586->9713|21615->9714|21717->9788|21746->9789|21780->9795|21809->9796|21850->9809|21879->9810|21953->9855|21983->9856|22048->9893|22077->9894|22235->10015|22251->10021|22304->10051
                    LINES: 26->1|30->1|30->2|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|42->14|42->14|42->14|49->21|49->21|55->27|55->27|57->29|57->29|61->33|61->33|63->35|63->35|65->37|65->37|68->40|68->40|72->44|72->44|72->44|72->44|76->48|76->48|76->48|76->48|79->51|79->51|80->52|80->52|84->56|84->56|86->58|86->58|88->60|88->60|90->62|90->62|92->64|92->64|93->65|93->65|95->67|95->67|95->67|95->67|97->69|97->69|98->70|98->70|100->72|100->72|102->74|102->74|104->76|104->76|106->78|106->78|107->79|107->79|109->81|109->81|112->84|112->84|113->85|113->85|114->86|114->86|116->88|116->88|117->89|117->89|121->93|121->93|122->94|122->94|126->98|126->98|127->99|127->99|133->105|133->105|136->108|136->108|138->110|138->110|142->114|142->114|143->115|143->115|144->116|144->116|145->117|145->117|146->118|146->118|148->120|148->120|149->121|149->121|150->122|150->122|152->124|152->124|155->127|155->127|157->129|157->129|158->130|158->130|160->132|160->132|163->135|163->135|164->136|164->136|165->137|165->137|167->139|167->139|169->141|169->141|171->143|171->143|173->145|173->145|175->147|175->147|176->148|176->148|177->149|177->149|178->150|178->150|179->151|179->151|180->152|180->152|188->160|188->160|189->161|189->161|190->162|190->162|192->164|192->164|193->165|193->165|195->167|195->167|196->168|196->168|198->170|198->170|203->175|203->175|204->176|204->176|207->179|207->179|208->180|208->180|210->182|210->182|211->183|211->183|212->184|212->184|213->185|213->185|215->187|215->187|217->189|217->189|219->191|219->191|220->192|220->192|221->193|221->193|223->195|223->195|224->196|224->196|228->200|228->200|229->201|229->201|233->205|233->205|234->206|234->206|241->213|241->213|246->218|246->218|248->220|248->220|252->224|252->224|253->225|253->225|254->226|254->226|255->227|255->227|256->228|256->228|258->230|258->230|259->231|259->231|260->232|260->232|262->234|262->234|265->237|265->237|267->239|267->239|268->240|268->240|270->242|270->242|273->245|273->245|274->246|274->246|275->247|275->247|277->249|277->249|279->251|279->251|281->253|281->253|283->255|283->255|285->257|285->257|286->258|286->258|287->259|287->259|288->260|288->260|289->261|289->261|290->262|290->262|298->270|298->270|299->271|299->271|300->272|300->272|302->274|302->274|303->275|303->275|305->277|305->277|306->278|306->278|308->280|308->280|313->285|313->285|314->286|314->286|318->290|318->290|319->291|319->291|321->293|321->293|322->294|322->294|323->295|323->295|324->296|324->296|326->298|326->298|328->300|328->300|330->302|330->302|332->304|332->304|334->306|334->306|338->310|338->310|343->315|343->315|349->321|349->321|350->322|350->322|352->324|352->324|354->326|354->326|357->329|357->329|366->338|366->338|368->340|368->340|369->341|369->341|371->343|371->343|372->344|372->344|374->346|374->346|375->347|375->347|376->348|376->348|380->352|380->352|381->353|381->353|382->354|382->354|384->356|384->356|385->357|385->357|387->359|387->359|389->361|389->361|390->362|390->362|398->370|398->370|399->371|399->371|402->374|402->374|404->376|404->376|405->377|405->377|407->379|407->379|409->381|409->381|411->383|411->383|414->386|414->386|417->389|417->389|417->389|417->389|419->391|419->391|420->392|420->392|422->394|422->394|423->395|423->395|425->397|425->397|431->403|431->403|435->407|435->407|440->412|440->412|442->414|442->414|445->417|445->417|447->419|447->419|449->421|449->421|453->425|453->425|455->427|455->427|461->433|461->433|461->433
                    -- GENERATED --
                */
            