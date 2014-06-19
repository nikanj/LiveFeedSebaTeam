
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



<script src=""""),_display_(Seq[Any](/*16.15*/routes/*16.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*16.66*/("""" type="text/javascript"></script>
<script>
	var speed_y;
	var voice_y;
	var newVal;
	var server_message;

	$(document).ready(function() """),format.raw/*23.31*/("""{"""),format.raw/*23.32*/("""

		var connection = new WebSocket('ws://localhost:9000');

		connection.onopen = function() """),format.raw/*27.34*/("""{"""),format.raw/*27.35*/("""
			//
		"""),format.raw/*29.3*/("""}"""),format.raw/*29.4*/("""

		connection.onmessage = function(e) """),format.raw/*31.38*/("""{"""),format.raw/*31.39*/("""
			server_message = e.data;

			if (server_message.indexOf("speed_") > -1) """),format.raw/*34.47*/("""{"""),format.raw/*34.48*/("""
				server_message = server_message.replace("speed_", "");
				speed_y = parseInt(server_message);
				console.log('speed y: ' + y);
			"""),format.raw/*38.4*/("""}"""),format.raw/*38.5*/(""" else if (server_message.indexOf("loudness_") > -1) """),format.raw/*38.57*/("""{"""),format.raw/*38.58*/("""
				server_message = server_message.replace("loudness_", "");
				voice_y = parseInt(server_message);
				console.log('Loud y: ' + voice_y);
			"""),format.raw/*42.4*/("""}"""),format.raw/*42.5*/(""" else if (server_message.indexOf("pause_") > -1) """),format.raw/*42.54*/("""{"""),format.raw/*42.55*/("""
				server_message = server_message.replace("pause_", "");
				newVal = parseInt(server_message);
			"""),format.raw/*45.4*/("""}"""),format.raw/*45.5*/("""

		"""),format.raw/*47.3*/("""}"""),format.raw/*47.4*/(""";

		connection.onclose = function(e) """),format.raw/*49.36*/("""{"""),format.raw/*49.37*/("""
			alert("CONNECTION IS CLOSED~");
		"""),format.raw/*51.3*/("""}"""),format.raw/*51.4*/("""

		$("#submit").click(function() """),format.raw/*53.33*/("""{"""),format.raw/*53.34*/("""
			$.post("/postQuestion", """),format.raw/*54.28*/("""{"""),format.raw/*54.29*/("""
				question : $("#question").val()
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
	<div class="page-header" style="padding-bottom: 0px; margin-top:5px;">
    		<img src=""""),_display_(Seq[Any](/*420.18*/routes/*420.24*/.Assets.at("images/logo.png"))),format.raw/*420.53*/("""" height="50px" width="150px" alt="Live Feed"> 
    	</div> 
    	<header class="navbar navbar-static-top bs-docs-nav"  id="top" role="banner">
  			<div class="btn-group" style="float:right;">
  				<a type="button" class="btn btn-default" href="/home">Home</a>
  				<a type="button" class="btn btn-default" href="/aboutus">About Us</a>
  				<a type="button" class="btn btn-default" href="/contact">Contact</a>
  				<a type="button" class="btn btn-default" href="/feedback">Feedback</a>
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
							<a type="button" class="btn btn-success" id="submit">Submit</a> 
							<a type="button" class="btn btn-danger" id="cancel">Cancel</a>
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
                    DATE: Thu Jun 19 11:30:28 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/profPage.scala.html
                    HASH: bc5047c7ed8ce7b2bd06b5e24c53b9eaaad0d836
                    MATRIX: 775->1|900->15|927->34|1077->149|1091->155|1146->189|1236->243|1251->249|1305->281|1391->331|1406->337|1482->390|1568->440|1583->446|1655->495|1715->519|1730->525|1797->570|1969->714|1998->715|2123->812|2152->813|2190->824|2218->825|2287->866|2316->867|2423->946|2452->947|2620->1088|2648->1089|2728->1141|2757->1142|2933->1291|2961->1292|3038->1341|3067->1342|3199->1447|3227->1448|3260->1454|3288->1455|3356->1495|3385->1496|3452->1536|3480->1537|3544->1573|3573->1574|3630->1603|3659->1604|3728->1646|3756->1647|3788->1652|3816->1653|3882->1691|3911->1692|3967->1721|3995->1722|4058->1757|4087->1758|4143->1787|4171->1788|4203->1793|4231->1794|4279->1814|4308->1815|4377->1856|4406->1857|4463->1886|4492->1887|4537->1904|4566->1905|4624->1936|4652->1937|4686->1944|4714->1945|4817->2021|4845->2022|4891->2040|4920->2041|5087->2180|5116->2181|5174->2211|5203->2212|5397->2378|5426->2379|5545->2470|5574->2471|5670->2539|5699->2540|5816->2628|5846->2629|5895->2649|5925->2650|5965->2661|5995->2662|6033->2672|6063->2673|6111->2692|6141->2693|6204->2728|6234->2729|6282->2748|6312->2749|6360->2768|6390->2769|6455->2805|6485->2806|6587->2880|6617->2881|6667->2902|6697->2903|6745->2922|6775->2923|6846->2965|6876->2966|6966->3027|6996->3028|7060->3063|7090->3064|7155->3100|7185->3101|7259->3146|7289->3147|7355->3184|7385->3185|7453->3224|7483->3225|7548->3261|7578->3262|7652->3307|7682->3308|7723->3320|7753->3321|7793->3332|7823->3333|7862->3344|7892->3345|7942->3366|7972->3367|8035->3401|8065->3402|8352->3660|8382->3661|8420->3671|8450->3672|8499->3692|8529->3693|8593->3729|8623->3730|8675->3753|8705->3754|8769->3790|8799->3791|8850->3813|8880->3814|8971->3876|9001->3877|9191->4038|9221->4039|9273->4062|9303->4063|9405->4136|9435->4137|9478->4151|9508->4152|9572->4187|9602->4188|9643->4201|9673->4202|9712->4213|9741->4214|9777->4222|9806->4223|9841->4230|9870->4231|9919->4251|9949->4252|10017->4291|10047->4292|10105->4321|10135->4322|10181->4339|10211->4340|10270->4371|10299->4372|10334->4379|10363->4380|10470->4459|10499->4460|10546->4478|10576->4479|10744->4618|10774->4619|10833->4649|10863->4650|11092->4850|11122->4851|11369->5069|11399->5070|11496->5138|11526->5139|11643->5227|11673->5228|11722->5248|11752->5249|11792->5260|11822->5261|11860->5271|11890->5272|11938->5291|11968->5292|12034->5330|12064->5331|12112->5350|12142->5351|12190->5370|12220->5371|12285->5407|12315->5408|12417->5482|12447->5483|12497->5504|12527->5505|12575->5524|12605->5525|12676->5567|12706->5568|12796->5629|12826->5630|12890->5665|12920->5666|12985->5702|13015->5703|13089->5748|13119->5749|13185->5786|13215->5787|13283->5826|13313->5827|13378->5863|13408->5864|13481->5908|13511->5909|13552->5921|13582->5922|13622->5933|13652->5934|13691->5945|13721->5946|13771->5967|13801->5968|13864->6002|13894->6003|14184->6264|14214->6265|14252->6275|14282->6276|14331->6296|14361->6297|14425->6333|14455->6334|14507->6357|14537->6358|14601->6394|14631->6395|14682->6417|14712->6418|14803->6480|14833->6481|15023->6642|15053->6643|15105->6666|15135->6667|15267->6770|15297->6771|15340->6785|15370->6786|15434->6821|15464->6822|15505->6835|15535->6836|15574->6847|15603->6848|15639->6856|15668->6857|15703->6864|15732->6865|15781->6885|15811->6886|15865->6911|15895->6912|15939->6927|15969->6928|16027->6958|16056->6959|16120->6994|16150->6995|16293->7109|16323->7110|16526->7285|16555->7286|16588->7291|16617->7292|16664->7310|16694->7311|16747->7336|16776->7337|16843->7375|16873->7376|17135->7609|17165->7610|17213->7630|17242->7631|17287->7647|17317->7648|17364->7667|17393->7668|17426->7673|17455->7674|17506->7696|17536->7697|17584->7716|17614->7717|17663->7737|17693->7738|17788->7805|17817->7806|17863->7823|17893->7824|17938->7840|17968->7841|18027->7872|18056->7873|18091->7880|18120->7881|18156->7889|18185->7890|18220->7897|18249->7898|18281->7902|18310->7903|18479->8043|18509->8044|18559->8065|18589->8066|18686->8134|18716->8135|18788->8178|18818->8179|18860->8192|18890->8193|18945->8219|18975->8220|19046->8262|19076->8263|19132->8290|19162->8291|19274->8374|19304->8375|19534->8576|19564->8577|19594->8578|19624->8579|19768->8694|19798->8695|19852->8720|19882->8721|19989->8799|20019->8800|20061->8813|20091->8814|20136->8830|20166->8831|20299->8935|20329->8936|20441->9019|20471->9020|20677->9197|20707->9198|20778->9241|20807->9242|20909->9316|20938->9317|20972->9323|21001->9324|21042->9337|21071->9338|21145->9383|21175->9384|21240->9421|21269->9422|21430->9546|21446->9552|21498->9581
                    LINES: 26->1|30->1|30->2|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|44->16|44->16|44->16|51->23|51->23|55->27|55->27|57->29|57->29|59->31|59->31|62->34|62->34|66->38|66->38|66->38|66->38|70->42|70->42|70->42|70->42|73->45|73->45|75->47|75->47|77->49|77->49|79->51|79->51|81->53|81->53|82->54|82->54|84->56|84->56|85->57|85->57|87->59|87->59|89->61|89->61|91->63|91->63|93->65|93->65|94->66|94->66|96->68|96->68|99->71|99->71|100->72|100->72|101->73|101->73|103->75|103->75|104->76|104->76|108->80|108->80|109->81|109->81|113->85|113->85|114->86|114->86|120->92|120->92|123->95|123->95|125->97|125->97|129->101|129->101|130->102|130->102|131->103|131->103|132->104|132->104|133->105|133->105|135->107|135->107|136->108|136->108|137->109|137->109|139->111|139->111|142->114|142->114|144->116|144->116|145->117|145->117|147->119|147->119|150->122|150->122|151->123|151->123|152->124|152->124|154->126|154->126|156->128|156->128|158->130|158->130|160->132|160->132|162->134|162->134|163->135|163->135|164->136|164->136|165->137|165->137|166->138|166->138|167->139|167->139|175->147|175->147|176->148|176->148|177->149|177->149|179->151|179->151|180->152|180->152|182->154|182->154|183->155|183->155|185->157|185->157|190->162|190->162|191->163|191->163|194->166|194->166|195->167|195->167|197->169|197->169|198->170|198->170|199->171|199->171|200->172|200->172|202->174|202->174|204->176|204->176|206->178|206->178|207->179|207->179|208->180|208->180|210->182|210->182|211->183|211->183|215->187|215->187|216->188|216->188|220->192|220->192|221->193|221->193|228->200|228->200|233->205|233->205|235->207|235->207|239->211|239->211|240->212|240->212|241->213|241->213|242->214|242->214|243->215|243->215|245->217|245->217|246->218|246->218|247->219|247->219|249->221|249->221|252->224|252->224|254->226|254->226|255->227|255->227|257->229|257->229|260->232|260->232|261->233|261->233|262->234|262->234|264->236|264->236|266->238|266->238|268->240|268->240|270->242|270->242|272->244|272->244|273->245|273->245|274->246|274->246|275->247|275->247|276->248|276->248|277->249|277->249|285->257|285->257|286->258|286->258|287->259|287->259|289->261|289->261|290->262|290->262|292->264|292->264|293->265|293->265|295->267|295->267|300->272|300->272|301->273|301->273|305->277|305->277|306->278|306->278|308->280|308->280|309->281|309->281|310->282|310->282|311->283|311->283|313->285|313->285|315->287|315->287|317->289|317->289|319->291|319->291|321->293|321->293|325->297|325->297|330->302|330->302|336->308|336->308|337->309|337->309|339->311|339->311|341->313|341->313|344->316|344->316|353->325|353->325|355->327|355->327|356->328|356->328|358->330|358->330|359->331|359->331|361->333|361->333|362->334|362->334|363->335|363->335|367->339|367->339|368->340|368->340|369->341|369->341|371->343|371->343|372->344|372->344|374->346|374->346|376->348|376->348|377->349|377->349|385->357|385->357|386->358|386->358|389->361|389->361|391->363|391->363|392->364|392->364|394->366|394->366|396->368|396->368|398->370|398->370|401->373|401->373|404->376|404->376|404->376|404->376|406->378|406->378|407->379|407->379|409->381|409->381|410->382|410->382|412->384|412->384|418->390|418->390|422->394|422->394|427->399|427->399|429->401|429->401|432->404|432->404|434->406|434->406|436->408|436->408|440->412|440->412|442->414|442->414|448->420|448->420|448->420
                    -- GENERATED --
                */
            