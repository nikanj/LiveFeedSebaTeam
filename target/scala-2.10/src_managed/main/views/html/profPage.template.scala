
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

	$(document).ready(function() """),format.raw/*21.31*/("""{"""),format.raw/*21.32*/("""

		var connection = new WebSocket('ws://localhost:9000');

		connection.onopen = function() """),format.raw/*25.34*/("""{"""),format.raw/*25.35*/("""
			//
		"""),format.raw/*27.3*/("""}"""),format.raw/*27.4*/("""

		connection.onmessage = function(e) """),format.raw/*29.38*/("""{"""),format.raw/*29.39*/("""
			server_message = e.data;

			if (server_message.indexOf("speed_") > -1) """),format.raw/*32.47*/("""{"""),format.raw/*32.48*/("""
				server_message = server_message.replace("speed_", "");
				speed_y = parseInt(server_message);
				console.log('speed y: ' + y);
			"""),format.raw/*36.4*/("""}"""),format.raw/*36.5*/(""" else if (server_message.indexOf("loudness_") > -1) """),format.raw/*36.57*/("""{"""),format.raw/*36.58*/("""
				server_message = server_message.replace("loudness_", "");
				voice_y = parseInt(server_message);
				console.log('Loud y: ' + voice_y);
			"""),format.raw/*40.4*/("""}"""),format.raw/*40.5*/(""" else if (server_message.indexOf("pause_") > -1) """),format.raw/*40.54*/("""{"""),format.raw/*40.55*/("""
				server_message = server_message.replace("pause_", "");
				newVal = parseInt(server_message);
			"""),format.raw/*43.4*/("""}"""),format.raw/*43.5*/("""

		"""),format.raw/*45.3*/("""}"""),format.raw/*45.4*/(""";

		connection.onclose = function(e) """),format.raw/*47.36*/("""{"""),format.raw/*47.37*/("""
			alert("CONNECTION IS CLOSED~");
		"""),format.raw/*49.3*/("""}"""),format.raw/*49.4*/("""

		$("#submit").click(function() """),format.raw/*51.33*/("""{"""),format.raw/*51.34*/("""
			$.post("/postQuestion", """),format.raw/*52.28*/("""{"""),format.raw/*52.29*/("""
				question : $("#question").val()
			"""),format.raw/*54.4*/("""}"""),format.raw/*54.5*/(""").done(function() """),format.raw/*54.23*/("""{"""),format.raw/*54.24*/("""
				alert("Success");
			"""),format.raw/*56.4*/("""}"""),format.raw/*56.5*/(""")
		"""),format.raw/*57.3*/("""}"""),format.raw/*57.4*/(""");

		$("#cancel").click(function() """),format.raw/*59.33*/("""{"""),format.raw/*59.34*/("""
			$("#q_area").hide();
		"""),format.raw/*61.3*/("""}"""),format.raw/*61.4*/(""");

		$("#add").click(function() """),format.raw/*63.30*/("""{"""),format.raw/*63.31*/("""
			$("#q_area").show();
		"""),format.raw/*65.3*/("""}"""),format.raw/*65.4*/(""");
	"""),format.raw/*66.2*/("""}"""),format.raw/*66.3*/(""");

	$(function() """),format.raw/*68.15*/("""{"""),format.raw/*68.16*/("""

		$(document).ready(
				function() """),format.raw/*71.16*/("""{"""),format.raw/*71.17*/("""
					Highcharts.setOptions("""),format.raw/*72.28*/("""{"""),format.raw/*72.29*/("""
						global : """),format.raw/*73.16*/("""{"""),format.raw/*73.17*/("""
							useUTC : false
						"""),format.raw/*75.7*/("""}"""),format.raw/*75.8*/("""
					"""),format.raw/*76.6*/("""}"""),format.raw/*76.7*/(""");

					var chart;
					$('#container-speed-chart').highcharts(
							"""),format.raw/*80.8*/("""{"""),format.raw/*80.9*/("""
								chart : """),format.raw/*81.17*/("""{"""),format.raw/*81.18*/("""
									type : 'spline',
									animation : Highcharts.svg, // don't animate in old IE
									marginRight : 5,
									events : """),format.raw/*85.19*/("""{"""),format.raw/*85.20*/("""
										load : function() """),format.raw/*86.29*/("""{"""),format.raw/*86.30*/("""

											// set up the updating of the chart each second
											var series = this.series[0];
											//var y = 0;

											setInterval(function() """),format.raw/*92.35*/("""{"""),format.raw/*92.36*/("""

												var x = (new Date()).getTime(); // current time
												if (!speed_y) """),format.raw/*95.27*/("""{"""),format.raw/*95.28*/("""
													speed_y = 50; //used for initialization
												"""),format.raw/*97.13*/("""}"""),format.raw/*97.14*/("""
												series.addPoint([ x, speed_y ],
														true, true);

											"""),format.raw/*101.12*/("""}"""),format.raw/*101.13*/(""", 2000);
										"""),format.raw/*102.11*/("""}"""),format.raw/*102.12*/("""
									"""),format.raw/*103.10*/("""}"""),format.raw/*103.11*/("""
								"""),format.raw/*104.9*/("""}"""),format.raw/*104.10*/(""",
								title : """),format.raw/*105.17*/("""{"""),format.raw/*105.18*/("""
									text : 'Speed'
								"""),format.raw/*107.9*/("""}"""),format.raw/*107.10*/(""",
								xAxis : """),format.raw/*108.17*/("""{"""),format.raw/*108.18*/("""
									title : """),format.raw/*109.18*/("""{"""),format.raw/*109.19*/("""
										text : 'Time'
									"""),format.raw/*111.10*/("""}"""),format.raw/*111.11*/(""",
									type : 'datetime',
									tickPixelInterval : 150
								"""),format.raw/*114.9*/("""}"""),format.raw/*114.10*/(""",

								yAxis : """),format.raw/*116.17*/("""{"""),format.raw/*116.18*/("""
									title : """),format.raw/*117.18*/("""{"""),format.raw/*117.19*/("""
										text : 'Percentage'
									"""),format.raw/*119.10*/("""}"""),format.raw/*119.11*/(""",
									min : 0,
									max : 100,
									labels : """),format.raw/*122.19*/("""{"""),format.raw/*122.20*/("""
										formatter : function() """),format.raw/*123.34*/("""{"""),format.raw/*123.35*/("""
											if (this.value == 100) """),format.raw/*124.35*/("""{"""),format.raw/*124.36*/("""
												return 'Too Fast';
											"""),format.raw/*126.12*/("""}"""),format.raw/*126.13*/("""

											if (this.value == 50) """),format.raw/*128.34*/("""{"""),format.raw/*128.35*/("""
												return 'OK';
											"""),format.raw/*130.12*/("""}"""),format.raw/*130.13*/("""

											if (this.value == 0) """),format.raw/*132.33*/("""{"""),format.raw/*132.34*/("""
												return 'Too Slow';
											"""),format.raw/*134.12*/("""}"""),format.raw/*134.13*/("""
										"""),format.raw/*135.11*/("""}"""),format.raw/*135.12*/("""
									"""),format.raw/*136.10*/("""}"""),format.raw/*136.11*/(""",
								"""),format.raw/*137.9*/("""}"""),format.raw/*137.10*/(""",
								tooltip : """),format.raw/*138.19*/("""{"""),format.raw/*138.20*/("""
									formatter : function() """),format.raw/*139.33*/("""{"""),format.raw/*139.34*/("""
										return 'At time: '
												+ Highcharts.dateFormat(
														'%H:%M:%S', this.x)
												+ '<br/>'
												+ 'Average speed requested '
												+ Highcharts.numberFormat(
														this.speed_y, 2) + '%';
									"""),format.raw/*147.10*/("""}"""),format.raw/*147.11*/("""
								"""),format.raw/*148.9*/("""}"""),format.raw/*148.10*/(""",
								legend : """),format.raw/*149.18*/("""{"""),format.raw/*149.19*/("""
									enabled : false
								"""),format.raw/*151.9*/("""}"""),format.raw/*151.10*/(""",
								exporting : """),format.raw/*152.21*/("""{"""),format.raw/*152.22*/("""
									enabled : false
								"""),format.raw/*154.9*/("""}"""),format.raw/*154.10*/(""",
								series : [ """),format.raw/*155.20*/("""{"""),format.raw/*155.21*/("""
									name : 'Random data',
									data : (function() """),format.raw/*157.29*/("""{"""),format.raw/*157.30*/("""
										// generate an array of random data
										var data = [], time = (new Date())
												.getTime(), i;

										for (i = -5; i <= 0; i++) """),format.raw/*162.37*/("""{"""),format.raw/*162.38*/("""
											data.push("""),format.raw/*163.22*/("""{"""),format.raw/*163.23*/("""
												x : time + i * 1000,
												speed_y : 50
											"""),format.raw/*166.12*/("""}"""),format.raw/*166.13*/(""");
										"""),format.raw/*167.11*/("""}"""),format.raw/*167.12*/("""
										return data;
									"""),format.raw/*169.10*/("""}"""),format.raw/*169.11*/(""")()
								"""),format.raw/*170.9*/("""}"""),format.raw/*170.10*/(""" ]
							"""),format.raw/*171.8*/("""}"""),format.raw/*171.9*/(""");
				"""),format.raw/*172.5*/("""}"""),format.raw/*172.6*/(""");

	"""),format.raw/*174.2*/("""}"""),format.raw/*174.3*/(""");

	$(function() """),format.raw/*176.15*/("""{"""),format.raw/*176.16*/("""
		$(document).ready(
				function() """),format.raw/*178.16*/("""{"""),format.raw/*178.17*/("""
					Highcharts.setOptions("""),format.raw/*179.28*/("""{"""),format.raw/*179.29*/("""
						global : """),format.raw/*180.16*/("""{"""),format.raw/*180.17*/("""
							useUTC : false
						"""),format.raw/*182.7*/("""}"""),format.raw/*182.8*/("""
					"""),format.raw/*183.6*/("""}"""),format.raw/*183.7*/(""");

					var chart;
					$('#container-loudness-chart').highcharts(
							"""),format.raw/*187.8*/("""{"""),format.raw/*187.9*/("""
								chart : """),format.raw/*188.17*/("""{"""),format.raw/*188.18*/("""
									type : 'spline',
									animation : Highcharts.svg, // don't animate in old IE
									marginRight : 5,
									events : """),format.raw/*192.19*/("""{"""),format.raw/*192.20*/("""
										load : function() """),format.raw/*193.29*/("""{"""),format.raw/*193.30*/("""

											// set up the updating of the chart each second
											var series = this.series[0];
											//var y = 0;
											//var server_message;

											setInterval(function() """),format.raw/*200.35*/("""{"""),format.raw/*200.36*/("""

												//var connection = new WebSocket('ws://localhost:9000');  //initialize the websocket inside the "interval loop"

												var x = (new Date()).getTime(); // current time
												if (!voice_y) """),format.raw/*205.27*/("""{"""),format.raw/*205.28*/("""
													voice_y = 50; //used for initialization
												"""),format.raw/*207.13*/("""}"""),format.raw/*207.14*/("""
												series.addPoint([ x, voice_y ],
														true, true);

											"""),format.raw/*211.12*/("""}"""),format.raw/*211.13*/(""", 2000);
										"""),format.raw/*212.11*/("""}"""),format.raw/*212.12*/("""
									"""),format.raw/*213.10*/("""}"""),format.raw/*213.11*/("""
								"""),format.raw/*214.9*/("""}"""),format.raw/*214.10*/(""",
								title : """),format.raw/*215.17*/("""{"""),format.raw/*215.18*/("""
									text : 'Loudness'
								"""),format.raw/*217.9*/("""}"""),format.raw/*217.10*/(""",
								xAxis : """),format.raw/*218.17*/("""{"""),format.raw/*218.18*/("""
									title : """),format.raw/*219.18*/("""{"""),format.raw/*219.19*/("""
										text : 'Time'
									"""),format.raw/*221.10*/("""}"""),format.raw/*221.11*/(""",
									type : 'datetime',
									tickPixelInterval : 150
								"""),format.raw/*224.9*/("""}"""),format.raw/*224.10*/(""",

								yAxis : """),format.raw/*226.17*/("""{"""),format.raw/*226.18*/("""
									title : """),format.raw/*227.18*/("""{"""),format.raw/*227.19*/("""
										text : 'Percentage'
									"""),format.raw/*229.10*/("""}"""),format.raw/*229.11*/(""",
									min : 0,
									max : 100,
									labels : """),format.raw/*232.19*/("""{"""),format.raw/*232.20*/("""
										formatter : function() """),format.raw/*233.34*/("""{"""),format.raw/*233.35*/("""
											if (this.value == 100) """),format.raw/*234.35*/("""{"""),format.raw/*234.36*/("""
												return 'Too Loud';
											"""),format.raw/*236.12*/("""}"""),format.raw/*236.13*/("""

											if (this.value == 50) """),format.raw/*238.34*/("""{"""),format.raw/*238.35*/("""
												return 'OK';
											"""),format.raw/*240.12*/("""}"""),format.raw/*240.13*/("""

											if (this.value == 0) """),format.raw/*242.33*/("""{"""),format.raw/*242.34*/("""
												return 'Too Low';
											"""),format.raw/*244.12*/("""}"""),format.raw/*244.13*/("""
										"""),format.raw/*245.11*/("""}"""),format.raw/*245.12*/("""
									"""),format.raw/*246.10*/("""}"""),format.raw/*246.11*/(""",
								"""),format.raw/*247.9*/("""}"""),format.raw/*247.10*/(""",
								tooltip : """),format.raw/*248.19*/("""{"""),format.raw/*248.20*/("""
									formatter : function() """),format.raw/*249.33*/("""{"""),format.raw/*249.34*/("""
										return 'At time: '
												+ Highcharts.dateFormat(
														'%H:%M:%S', this.x)
												+ '<br/>'
												+ 'Average loudness requested '
												+ Highcharts.numberFormat(
														this.voice_y, 2) + '%';
									"""),format.raw/*257.10*/("""}"""),format.raw/*257.11*/("""
								"""),format.raw/*258.9*/("""}"""),format.raw/*258.10*/(""",
								legend : """),format.raw/*259.18*/("""{"""),format.raw/*259.19*/("""
									enabled : false
								"""),format.raw/*261.9*/("""}"""),format.raw/*261.10*/(""",
								exporting : """),format.raw/*262.21*/("""{"""),format.raw/*262.22*/("""
									enabled : false
								"""),format.raw/*264.9*/("""}"""),format.raw/*264.10*/(""",
								series : [ """),format.raw/*265.20*/("""{"""),format.raw/*265.21*/("""
									name : 'Random data',
									data : (function() """),format.raw/*267.29*/("""{"""),format.raw/*267.30*/("""
										// generate an array of random data
										var data = [], time = (new Date())
												.getTime(), i;

										for (i = -5; i <= 0; i++) """),format.raw/*272.37*/("""{"""),format.raw/*272.38*/("""
											data.push("""),format.raw/*273.22*/("""{"""),format.raw/*273.23*/("""
												x : time + i * 1000,
												voice_y : 50
											//initialization 
											"""),format.raw/*277.12*/("""}"""),format.raw/*277.13*/(""");
										"""),format.raw/*278.11*/("""}"""),format.raw/*278.12*/("""
										return data;
									"""),format.raw/*280.10*/("""}"""),format.raw/*280.11*/(""")()
								"""),format.raw/*281.9*/("""}"""),format.raw/*281.10*/(""" ]
							"""),format.raw/*282.8*/("""}"""),format.raw/*282.9*/(""");
				"""),format.raw/*283.5*/("""}"""),format.raw/*283.6*/(""");

	"""),format.raw/*285.2*/("""}"""),format.raw/*285.3*/(""");

	$(function() """),format.raw/*287.15*/("""{"""),format.raw/*287.16*/("""

		var gaugeOptions = """),format.raw/*289.22*/("""{"""),format.raw/*289.23*/("""

			chart : """),format.raw/*291.12*/("""{"""),format.raw/*291.13*/("""
				type : 'solidgauge'
			"""),format.raw/*293.4*/("""}"""),format.raw/*293.5*/(""",

			title : null,

			pane : """),format.raw/*297.11*/("""{"""),format.raw/*297.12*/("""
				center : [ '50%', '85%' ],
				size : '140%',
				startAngle : -90,
				endAngle : 90,
				background : """),format.raw/*302.18*/("""{"""),format.raw/*302.19*/("""
					backgroundColor : (Highcharts.theme && Highcharts.theme.background2)
							|| '#EEE',
					innerRadius : '60%',
					outerRadius : '100%',
					shape : 'arc'
				"""),format.raw/*308.5*/("""}"""),format.raw/*308.6*/("""
			"""),format.raw/*309.4*/("""}"""),format.raw/*309.5*/(""",

			tooltip : """),format.raw/*311.14*/("""{"""),format.raw/*311.15*/("""
				enabled : true
			"""),format.raw/*313.4*/("""}"""),format.raw/*313.5*/(""",

			// the value axis
			yAxis : """),format.raw/*316.12*/("""{"""),format.raw/*316.13*/("""
				stops : [ [ 0.1, '#55BF3B' ], // green
				[ 0.5, '#DDDF0D' ], // yellow
				[ 0.9, '#DF5353' ] // red
				],
				lineWidth : 0,
				minorTickInterval : null,
				tickPixelInterval : 400,
				tickWidth : 0,
				title : """),format.raw/*325.13*/("""{"""),format.raw/*325.14*/("""
					y : -70
				"""),format.raw/*327.5*/("""}"""),format.raw/*327.6*/(""",
				labels : """),format.raw/*328.14*/("""{"""),format.raw/*328.15*/("""
					y : 16
				"""),format.raw/*330.5*/("""}"""),format.raw/*330.6*/("""
			"""),format.raw/*331.4*/("""}"""),format.raw/*331.5*/(""",

			plotOptions : """),format.raw/*333.18*/("""{"""),format.raw/*333.19*/("""
				solidgauge : """),format.raw/*334.18*/("""{"""),format.raw/*334.19*/("""
					dataLabels : """),format.raw/*335.19*/("""{"""),format.raw/*335.20*/("""
						y : 5,
						borderWidth : 0,
						useHTML : true
					"""),format.raw/*339.6*/("""}"""),format.raw/*339.7*/(""",
					states : """),format.raw/*340.15*/("""{"""),format.raw/*340.16*/("""
						hover : """),format.raw/*341.15*/("""{"""),format.raw/*341.16*/("""
							enabled : true
						"""),format.raw/*343.7*/("""}"""),format.raw/*343.8*/("""
					"""),format.raw/*344.6*/("""}"""),format.raw/*344.7*/("""

				"""),format.raw/*346.5*/("""}"""),format.raw/*346.6*/("""

			"""),format.raw/*348.4*/("""}"""),format.raw/*348.5*/("""
		"""),format.raw/*349.3*/("""}"""),format.raw/*349.4*/(""";

		// The speed gauge
		$('#container-speed')
				.highcharts(
						Highcharts
								.merge(
										gaugeOptions,
										"""),format.raw/*357.11*/("""{"""),format.raw/*357.12*/("""
											yAxis : """),format.raw/*358.20*/("""{"""),format.raw/*358.21*/("""
												min : 0,
												max : 100,
												title : """),format.raw/*361.21*/("""{"""),format.raw/*361.22*/("""
													text : 'Pause'
												"""),format.raw/*363.13*/("""}"""),format.raw/*363.14*/("""
											"""),format.raw/*364.12*/("""}"""),format.raw/*364.13*/(""",

											credits : """),format.raw/*366.22*/("""{"""),format.raw/*366.23*/("""
												enabled : false
											"""),format.raw/*368.12*/("""}"""),format.raw/*368.13*/(""",

											series : [ """),format.raw/*370.23*/("""{"""),format.raw/*370.24*/("""
												name : 'Pause',
												data : [ 0 ],
												dataLabels : """),format.raw/*373.26*/("""{"""),format.raw/*373.27*/("""
													format : '<div style="text-align:center"><span style="font-size:25px;color:'
															+ ((Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black')
															+ '">"""),format.raw/*376.21*/("""{"""),format.raw/*376.22*/("""y"""),format.raw/*376.23*/("""}"""),format.raw/*376.24*/("""</span><br/>'
															+ '<span style="font-size:12px;color:silver">Pause counts</span></div>'
												"""),format.raw/*378.13*/("""}"""),format.raw/*378.14*/(""",
												tooltip : """),format.raw/*379.23*/("""{"""),format.raw/*379.24*/("""
													valueSuffix : 'Number of persons voted for pause'
												"""),format.raw/*381.13*/("""}"""),format.raw/*381.14*/("""
											"""),format.raw/*382.12*/("""}"""),format.raw/*382.13*/(""" ]

										"""),format.raw/*384.11*/("""}"""),format.raw/*384.12*/("""));

		// The RPM gauge
		;
		//var newVal;
		// Bring life to the dials
		setInterval(function() """),format.raw/*390.26*/("""{"""),format.raw/*390.27*/("""

			// Speed
			var chart = $('#container-speed').highcharts();
			if (chart) """),format.raw/*394.15*/("""{"""),format.raw/*394.16*/("""
				var point = chart.series[0].points[0];
				//   inc = Math.round((Math.random() - 0.5) * 100);

				// newVal = point.y + inc;
				/*  if (newVal < 0 || newVal > 100) """),format.raw/*399.41*/("""{"""),format.raw/*399.42*/("""
				      newVal = point.y - inc;
				  """),format.raw/*401.7*/("""}"""),format.raw/*401.8*/("""*/
				console.log('pause 2: ' + newVal);
				point.update(newVal);
			"""),format.raw/*404.4*/("""}"""),format.raw/*404.5*/("""

		"""),format.raw/*406.3*/("""}"""),format.raw/*406.4*/(""", 2000);

	"""),format.raw/*408.2*/("""}"""),format.raw/*408.3*/(""");
</script>

<script>
	//	$(function () """),format.raw/*412.19*/("""{"""),format.raw/*412.20*/("""
	//	$('#container-questions').
	//"""),format.raw/*414.4*/("""}"""),format.raw/*414.5*/(""");
</script>

</head>
<body>
	<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
		<img src=""""),_display_(Seq[Any](/*420.14*/routes/*420.20*/.Assets.at(" images/logo.png"))),format.raw/*420.50*/("""" height="50px"
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
					</div> <!-- Add the questions at this part -->


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
	</table>



</body>
</html>"""))}
    }
    
    def render(stats:Long): play.api.templates.HtmlFormat.Appendable = apply(stats)
    
    def f:((Long) => play.api.templates.HtmlFormat.Appendable) = (stats) => apply(stats)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jun 14 09:35:14 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/profPage.scala.html
                    HASH: 60f1f2ad3be436726eab82f5cdcb8b0dda476b12
                    MATRIX: 775->1|900->15|927->34|1077->149|1091->155|1146->189|1236->243|1251->249|1305->281|1391->331|1406->337|1482->390|1568->440|1583->446|1655->495|1711->515|1726->521|1793->566|1965->710|1994->711|2119->808|2148->809|2186->820|2214->821|2283->862|2312->863|2419->942|2448->943|2616->1084|2644->1085|2724->1137|2753->1138|2929->1287|2957->1288|3034->1337|3063->1338|3195->1443|3223->1444|3256->1450|3284->1451|3352->1491|3381->1492|3448->1532|3476->1533|3540->1569|3569->1570|3626->1599|3655->1600|3724->1642|3752->1643|3798->1661|3827->1662|3882->1690|3910->1691|3942->1696|3970->1697|4036->1735|4065->1736|4121->1765|4149->1766|4212->1801|4241->1802|4297->1831|4325->1832|4357->1837|4385->1838|4433->1858|4462->1859|4531->1900|4560->1901|4617->1930|4646->1931|4691->1948|4720->1949|4778->1980|4806->1981|4840->1988|4868->1989|4971->2065|4999->2066|5045->2084|5074->2085|5241->2224|5270->2225|5328->2255|5357->2256|5551->2422|5580->2423|5699->2514|5728->2515|5824->2583|5853->2584|5970->2672|6000->2673|6049->2693|6079->2694|6119->2705|6149->2706|6187->2716|6217->2717|6265->2736|6295->2737|6358->2772|6388->2773|6436->2792|6466->2793|6514->2812|6544->2813|6609->2849|6639->2850|6741->2924|6771->2925|6821->2946|6851->2947|6899->2966|6929->2967|7000->3009|7030->3010|7120->3071|7150->3072|7214->3107|7244->3108|7309->3144|7339->3145|7413->3190|7443->3191|7509->3228|7539->3229|7607->3268|7637->3269|7702->3305|7732->3306|7806->3351|7836->3352|7877->3364|7907->3365|7947->3376|7977->3377|8016->3388|8046->3389|8096->3410|8126->3411|8189->3445|8219->3446|8506->3704|8536->3705|8574->3715|8604->3716|8653->3736|8683->3737|8747->3773|8777->3774|8829->3797|8859->3798|8923->3834|8953->3835|9004->3857|9034->3858|9125->3920|9155->3921|9345->4082|9375->4083|9427->4106|9457->4107|9559->4180|9589->4181|9632->4195|9662->4196|9726->4231|9756->4232|9797->4245|9827->4246|9866->4257|9895->4258|9931->4266|9960->4267|9995->4274|10024->4275|10073->4295|10103->4296|10171->4335|10201->4336|10259->4365|10289->4366|10335->4383|10365->4384|10424->4415|10453->4416|10488->4423|10517->4424|10624->4503|10653->4504|10700->4522|10730->4523|10898->4662|10928->4663|10987->4693|11017->4694|11246->4894|11276->4895|11523->5113|11553->5114|11650->5182|11680->5183|11797->5271|11827->5272|11876->5292|11906->5293|11946->5304|11976->5305|12014->5315|12044->5316|12092->5335|12122->5336|12188->5374|12218->5375|12266->5394|12296->5395|12344->5414|12374->5415|12439->5451|12469->5452|12571->5526|12601->5527|12651->5548|12681->5549|12729->5568|12759->5569|12830->5611|12860->5612|12950->5673|12980->5674|13044->5709|13074->5710|13139->5746|13169->5747|13243->5792|13273->5793|13339->5830|13369->5831|13437->5870|13467->5871|13532->5907|13562->5908|13635->5952|13665->5953|13706->5965|13736->5966|13776->5977|13806->5978|13845->5989|13875->5990|13925->6011|13955->6012|14018->6046|14048->6047|14338->6308|14368->6309|14406->6319|14436->6320|14485->6340|14515->6341|14579->6377|14609->6378|14661->6401|14691->6402|14755->6438|14785->6439|14836->6461|14866->6462|14957->6524|14987->6525|15177->6686|15207->6687|15259->6710|15289->6711|15421->6814|15451->6815|15494->6829|15524->6830|15588->6865|15618->6866|15659->6879|15689->6880|15728->6891|15757->6892|15793->6900|15822->6901|15857->6908|15886->6909|15935->6929|15965->6930|16019->6955|16049->6956|16093->6971|16123->6972|16181->7002|16210->7003|16274->7038|16304->7039|16447->7153|16477->7154|16680->7329|16709->7330|16742->7335|16771->7336|16818->7354|16848->7355|16901->7380|16930->7381|16997->7419|17027->7420|17289->7653|17319->7654|17367->7674|17396->7675|17441->7691|17471->7692|17518->7711|17547->7712|17580->7717|17609->7718|17660->7740|17690->7741|17738->7760|17768->7761|17817->7781|17847->7782|17942->7849|17971->7850|18017->7867|18047->7868|18092->7884|18122->7885|18181->7916|18210->7917|18245->7924|18274->7925|18310->7933|18339->7934|18374->7941|18403->7942|18435->7946|18464->7947|18633->8087|18663->8088|18713->8109|18743->8110|18840->8178|18870->8179|18942->8222|18972->8223|19014->8236|19044->8237|19099->8263|19129->8264|19200->8306|19230->8307|19286->8334|19316->8335|19428->8418|19458->8419|19688->8620|19718->8621|19748->8622|19778->8623|19922->8738|19952->8739|20006->8764|20036->8765|20143->8843|20173->8844|20215->8857|20245->8858|20290->8874|20320->8875|20453->8979|20483->8980|20595->9063|20625->9064|20831->9241|20861->9242|20932->9285|20961->9286|21063->9360|21092->9361|21126->9367|21155->9368|21196->9381|21225->9382|21299->9427|21329->9428|21394->9465|21423->9466|21581->9587|21597->9593|21650->9623
                    LINES: 26->1|30->1|30->2|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|42->14|42->14|42->14|49->21|49->21|53->25|53->25|55->27|55->27|57->29|57->29|60->32|60->32|64->36|64->36|64->36|64->36|68->40|68->40|68->40|68->40|71->43|71->43|73->45|73->45|75->47|75->47|77->49|77->49|79->51|79->51|80->52|80->52|82->54|82->54|82->54|82->54|84->56|84->56|85->57|85->57|87->59|87->59|89->61|89->61|91->63|91->63|93->65|93->65|94->66|94->66|96->68|96->68|99->71|99->71|100->72|100->72|101->73|101->73|103->75|103->75|104->76|104->76|108->80|108->80|109->81|109->81|113->85|113->85|114->86|114->86|120->92|120->92|123->95|123->95|125->97|125->97|129->101|129->101|130->102|130->102|131->103|131->103|132->104|132->104|133->105|133->105|135->107|135->107|136->108|136->108|137->109|137->109|139->111|139->111|142->114|142->114|144->116|144->116|145->117|145->117|147->119|147->119|150->122|150->122|151->123|151->123|152->124|152->124|154->126|154->126|156->128|156->128|158->130|158->130|160->132|160->132|162->134|162->134|163->135|163->135|164->136|164->136|165->137|165->137|166->138|166->138|167->139|167->139|175->147|175->147|176->148|176->148|177->149|177->149|179->151|179->151|180->152|180->152|182->154|182->154|183->155|183->155|185->157|185->157|190->162|190->162|191->163|191->163|194->166|194->166|195->167|195->167|197->169|197->169|198->170|198->170|199->171|199->171|200->172|200->172|202->174|202->174|204->176|204->176|206->178|206->178|207->179|207->179|208->180|208->180|210->182|210->182|211->183|211->183|215->187|215->187|216->188|216->188|220->192|220->192|221->193|221->193|228->200|228->200|233->205|233->205|235->207|235->207|239->211|239->211|240->212|240->212|241->213|241->213|242->214|242->214|243->215|243->215|245->217|245->217|246->218|246->218|247->219|247->219|249->221|249->221|252->224|252->224|254->226|254->226|255->227|255->227|257->229|257->229|260->232|260->232|261->233|261->233|262->234|262->234|264->236|264->236|266->238|266->238|268->240|268->240|270->242|270->242|272->244|272->244|273->245|273->245|274->246|274->246|275->247|275->247|276->248|276->248|277->249|277->249|285->257|285->257|286->258|286->258|287->259|287->259|289->261|289->261|290->262|290->262|292->264|292->264|293->265|293->265|295->267|295->267|300->272|300->272|301->273|301->273|305->277|305->277|306->278|306->278|308->280|308->280|309->281|309->281|310->282|310->282|311->283|311->283|313->285|313->285|315->287|315->287|317->289|317->289|319->291|319->291|321->293|321->293|325->297|325->297|330->302|330->302|336->308|336->308|337->309|337->309|339->311|339->311|341->313|341->313|344->316|344->316|353->325|353->325|355->327|355->327|356->328|356->328|358->330|358->330|359->331|359->331|361->333|361->333|362->334|362->334|363->335|363->335|367->339|367->339|368->340|368->340|369->341|369->341|371->343|371->343|372->344|372->344|374->346|374->346|376->348|376->348|377->349|377->349|385->357|385->357|386->358|386->358|389->361|389->361|391->363|391->363|392->364|392->364|394->366|394->366|396->368|396->368|398->370|398->370|401->373|401->373|404->376|404->376|404->376|404->376|406->378|406->378|407->379|407->379|409->381|409->381|410->382|410->382|412->384|412->384|418->390|418->390|422->394|422->394|427->399|427->399|429->401|429->401|432->404|432->404|434->406|434->406|436->408|436->408|440->412|440->412|442->414|442->414|448->420|448->420|448->420
                    -- GENERATED --
                */
            