
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

	var speed_y;
	var voice_y;
	var newVal;
	var server_message;

	function displayQuestion(question) """),format.raw/*24.37*/("""{"""),format.raw/*24.38*/("""
		$('#posted_question')
				.append(
						'<div style="background-color: white; margin: 0 10px 10px 0; padding: 7px; border-radius:5px;">'
								+ question + '</div>');
		$(".test").show();
	"""),format.raw/*30.2*/("""}"""),format.raw/*30.3*/("""
	
	$(document).ready(function() """),format.raw/*32.31*/("""{"""),format.raw/*32.32*/("""

		var connection = new WebSocket('ws://localhost:9000');

		connection.onopen = function() """),format.raw/*36.34*/("""{"""),format.raw/*36.35*/("""
			//
		"""),format.raw/*38.3*/("""}"""),format.raw/*38.4*/("""

		connection.onmessage = function(e) """),format.raw/*40.38*/("""{"""),format.raw/*40.39*/("""
			server_message = e.data;

			if (server_message.indexOf("speed_") > -1) """),format.raw/*43.47*/("""{"""),format.raw/*43.48*/("""
				server_message = server_message.replace("speed_", "");
				speed_y = Number(server_message);
				console.log('speed y: ' + y);
			"""),format.raw/*47.4*/("""}"""),format.raw/*47.5*/(""" else if (server_message.indexOf("loudness_") > -1) """),format.raw/*47.57*/("""{"""),format.raw/*47.58*/("""
				server_message = server_message.replace("loudness_", "");
				voice_y = Number(server_message);
				console.log('Loud y: ' + voice_y);
			"""),format.raw/*51.4*/("""}"""),format.raw/*51.5*/(""" else if (server_message.indexOf("pause_") > -1) """),format.raw/*51.54*/("""{"""),format.raw/*51.55*/("""
				server_message = server_message.replace("pause_", "");
				newVal = parseInt(server_message);
			"""),format.raw/*54.4*/("""}"""),format.raw/*54.5*/("""
			else if (server_message.indexOf("question_") > -1) """),format.raw/*55.55*/("""{"""),format.raw/*55.56*/("""
				server_message = server_message.replace(
						"question_", "");
				displayQuestion(server_message);
			"""),format.raw/*59.4*/("""}"""),format.raw/*59.5*/("""

		"""),format.raw/*61.3*/("""}"""),format.raw/*61.4*/(""";

		connection.onclose = function(e) """),format.raw/*63.36*/("""{"""),format.raw/*63.37*/("""
			//
		"""),format.raw/*65.3*/("""}"""),format.raw/*65.4*/("""
		
		$("#submit_button").click(function() """),format.raw/*67.40*/("""{"""),format.raw/*67.41*/("""
			$.post("/postTheQuestion", """),format.raw/*68.31*/("""{"""),format.raw/*68.32*/("""
				p_question: $("#question").val()
			"""),format.raw/*70.4*/("""}"""),format.raw/*70.5*/(""").done(function()"""),format.raw/*70.22*/("""{"""),format.raw/*70.23*/("""
				$("#q_area").hide();
			"""),format.raw/*72.4*/("""}"""),format.raw/*72.5*/(""")
		"""),format.raw/*73.3*/("""}"""),format.raw/*73.4*/(""");

		
      $("#cancel_button").click(function() """),format.raw/*76.44*/("""{"""),format.raw/*76.45*/("""
       $("#q_area").hide();
      """),format.raw/*78.7*/("""}"""),format.raw/*78.8*/(""");

      $("#add").click(function() """),format.raw/*80.34*/("""{"""),format.raw/*80.35*/("""
       $("#q_area").show();
      """),format.raw/*82.7*/("""}"""),format.raw/*82.8*/(""");
	"""),format.raw/*83.2*/("""}"""),format.raw/*83.3*/(""");

	$(function() """),format.raw/*85.15*/("""{"""),format.raw/*85.16*/("""

		$(document).ready(
				function() """),format.raw/*88.16*/("""{"""),format.raw/*88.17*/("""
					Highcharts.setOptions("""),format.raw/*89.28*/("""{"""),format.raw/*89.29*/("""
						global : """),format.raw/*90.16*/("""{"""),format.raw/*90.17*/("""
							useUTC : false
						"""),format.raw/*92.7*/("""}"""),format.raw/*92.8*/("""
					"""),format.raw/*93.6*/("""}"""),format.raw/*93.7*/(""");

					var chart;
					$('#container-speed-chart').highcharts(
							"""),format.raw/*97.8*/("""{"""),format.raw/*97.9*/("""
								chart : """),format.raw/*98.17*/("""{"""),format.raw/*98.18*/("""
									type : 'spline',
									animation : Highcharts.svg, // don't animate in old IE
									marginRight : 5,
									events : """),format.raw/*102.19*/("""{"""),format.raw/*102.20*/("""
										load : function() """),format.raw/*103.29*/("""{"""),format.raw/*103.30*/("""

											// set up the updating of the chart each second
											var series = this.series[0];
											//var y = 0;

											setInterval(function() """),format.raw/*109.35*/("""{"""),format.raw/*109.36*/("""

												var x = (new Date()).getTime(); // current time
												if (speed_y == null) """),format.raw/*112.34*/("""{"""),format.raw/*112.35*/("""
													speed_y = 50; //used for initialization
												"""),format.raw/*114.13*/("""}"""),format.raw/*114.14*/("""
												series.addPoint([ x, speed_y ],
														true, true);

											"""),format.raw/*118.12*/("""}"""),format.raw/*118.13*/(""", 1000);
										"""),format.raw/*119.11*/("""}"""),format.raw/*119.12*/("""
									"""),format.raw/*120.10*/("""}"""),format.raw/*120.11*/("""
								"""),format.raw/*121.9*/("""}"""),format.raw/*121.10*/(""",
								title : """),format.raw/*122.17*/("""{"""),format.raw/*122.18*/("""
									text : 'Speed'
								"""),format.raw/*124.9*/("""}"""),format.raw/*124.10*/(""",
								xAxis : """),format.raw/*125.17*/("""{"""),format.raw/*125.18*/("""
									title : """),format.raw/*126.18*/("""{"""),format.raw/*126.19*/("""
										text : 'Time'
									"""),format.raw/*128.10*/("""}"""),format.raw/*128.11*/(""",
									type : 'datetime',
									tickPixelInterval : 150
								"""),format.raw/*131.9*/("""}"""),format.raw/*131.10*/(""",

								yAxis : """),format.raw/*133.17*/("""{"""),format.raw/*133.18*/("""
									title : """),format.raw/*134.18*/("""{"""),format.raw/*134.19*/("""
										text : 'Percentage'
									"""),format.raw/*136.10*/("""}"""),format.raw/*136.11*/(""",
									min : 0,
									max : 100,
									labels : """),format.raw/*139.19*/("""{"""),format.raw/*139.20*/("""
										formatter : function() """),format.raw/*140.34*/("""{"""),format.raw/*140.35*/("""
											if (this.value == 100) """),format.raw/*141.35*/("""{"""),format.raw/*141.36*/("""
												return 'Too Fast';
											"""),format.raw/*143.12*/("""}"""),format.raw/*143.13*/("""

											if (this.value == 50) """),format.raw/*145.34*/("""{"""),format.raw/*145.35*/("""
												return 'OK';
											"""),format.raw/*147.12*/("""}"""),format.raw/*147.13*/("""

											if (this.value == 0) """),format.raw/*149.33*/("""{"""),format.raw/*149.34*/("""
												return 'Too Slow';
											"""),format.raw/*151.12*/("""}"""),format.raw/*151.13*/("""
										"""),format.raw/*152.11*/("""}"""),format.raw/*152.12*/("""
									"""),format.raw/*153.10*/("""}"""),format.raw/*153.11*/(""",
								"""),format.raw/*154.9*/("""}"""),format.raw/*154.10*/(""",
								tooltip : """),format.raw/*155.19*/("""{"""),format.raw/*155.20*/("""
									formatter : function() """),format.raw/*156.33*/("""{"""),format.raw/*156.34*/("""
										return 'At time: '
												+ Highcharts.dateFormat(
														'%H:%M:%S', this.x)
												+ '<br/>'
												+ 'Average speed requested '
												+ Highcharts.numberFormat(
														this.speed_y, 2) + '%';
									"""),format.raw/*164.10*/("""}"""),format.raw/*164.11*/("""
								"""),format.raw/*165.9*/("""}"""),format.raw/*165.10*/(""",
								legend : """),format.raw/*166.18*/("""{"""),format.raw/*166.19*/("""
									enabled : false
								"""),format.raw/*168.9*/("""}"""),format.raw/*168.10*/(""",
								exporting : """),format.raw/*169.21*/("""{"""),format.raw/*169.22*/("""
									enabled : false
								"""),format.raw/*171.9*/("""}"""),format.raw/*171.10*/(""",
								series : [ """),format.raw/*172.20*/("""{"""),format.raw/*172.21*/("""
									name : 'Random data',
									data : (function() """),format.raw/*174.29*/("""{"""),format.raw/*174.30*/("""
										// generate an array of random data
										var data = [], time = (new Date())
												.getTime(), i;

										for (i = -9; i <= 0; i++) """),format.raw/*179.37*/("""{"""),format.raw/*179.38*/("""
											data.push("""),format.raw/*180.22*/("""{"""),format.raw/*180.23*/("""
												x : time + i * 1000,
												speed_y : 50
											"""),format.raw/*183.12*/("""}"""),format.raw/*183.13*/(""");
										"""),format.raw/*184.11*/("""}"""),format.raw/*184.12*/("""
										return data;
									"""),format.raw/*186.10*/("""}"""),format.raw/*186.11*/(""")()
								"""),format.raw/*187.9*/("""}"""),format.raw/*187.10*/(""" ]
							"""),format.raw/*188.8*/("""}"""),format.raw/*188.9*/(""");
				"""),format.raw/*189.5*/("""}"""),format.raw/*189.6*/(""");

	"""),format.raw/*191.2*/("""}"""),format.raw/*191.3*/(""");

	$(function() """),format.raw/*193.15*/("""{"""),format.raw/*193.16*/("""
		$(document).ready(
				function() """),format.raw/*195.16*/("""{"""),format.raw/*195.17*/("""
					Highcharts.setOptions("""),format.raw/*196.28*/("""{"""),format.raw/*196.29*/("""
						global : """),format.raw/*197.16*/("""{"""),format.raw/*197.17*/("""
							useUTC : false
						"""),format.raw/*199.7*/("""}"""),format.raw/*199.8*/("""
					"""),format.raw/*200.6*/("""}"""),format.raw/*200.7*/(""");

					var chart;
					$('#container-loudness-chart').highcharts(
							"""),format.raw/*204.8*/("""{"""),format.raw/*204.9*/("""
								chart : """),format.raw/*205.17*/("""{"""),format.raw/*205.18*/("""
									type : 'spline',
									animation : Highcharts.svg, // don't animate in old IE
									marginRight : 5,
									events : """),format.raw/*209.19*/("""{"""),format.raw/*209.20*/("""
										load : function() """),format.raw/*210.29*/("""{"""),format.raw/*210.30*/("""

											// set up the updating of the chart each second
											var series = this.series[0];
											//var y = 0;
											//var server_message;

											setInterval(function() """),format.raw/*217.35*/("""{"""),format.raw/*217.36*/("""

												//var connection = new WebSocket('ws://localhost:9000');  //initialize the websocket inside the "interval loop"

												var x = (new Date()).getTime(); // current time
												if (voice_y == null) """),format.raw/*222.34*/("""{"""),format.raw/*222.35*/("""
													voice_y = 50; //used for initialization
												"""),format.raw/*224.13*/("""}"""),format.raw/*224.14*/("""
												series.addPoint([ x, voice_y ],
														true, true);

											"""),format.raw/*228.12*/("""}"""),format.raw/*228.13*/(""", 1000);
										"""),format.raw/*229.11*/("""}"""),format.raw/*229.12*/("""
									"""),format.raw/*230.10*/("""}"""),format.raw/*230.11*/("""
								"""),format.raw/*231.9*/("""}"""),format.raw/*231.10*/(""",
								title : """),format.raw/*232.17*/("""{"""),format.raw/*232.18*/("""
									text : 'Loudness'
								"""),format.raw/*234.9*/("""}"""),format.raw/*234.10*/(""",
								xAxis : """),format.raw/*235.17*/("""{"""),format.raw/*235.18*/("""
									title : """),format.raw/*236.18*/("""{"""),format.raw/*236.19*/("""
										text : 'Time'
									"""),format.raw/*238.10*/("""}"""),format.raw/*238.11*/(""",
									type : 'datetime',
									tickPixelInterval : 150
								"""),format.raw/*241.9*/("""}"""),format.raw/*241.10*/(""",

								yAxis : """),format.raw/*243.17*/("""{"""),format.raw/*243.18*/("""
									title : """),format.raw/*244.18*/("""{"""),format.raw/*244.19*/("""
										text : 'Percentage'
									"""),format.raw/*246.10*/("""}"""),format.raw/*246.11*/(""",
									min : 0,
									max : 100,
									labels : """),format.raw/*249.19*/("""{"""),format.raw/*249.20*/("""
										formatter : function() """),format.raw/*250.34*/("""{"""),format.raw/*250.35*/("""
											if (this.value == 100) """),format.raw/*251.35*/("""{"""),format.raw/*251.36*/("""
												return 'Too Loud';
											"""),format.raw/*253.12*/("""}"""),format.raw/*253.13*/("""

											if (this.value == 50) """),format.raw/*255.34*/("""{"""),format.raw/*255.35*/("""
												return 'OK';
											"""),format.raw/*257.12*/("""}"""),format.raw/*257.13*/("""

											if (this.value == 0) """),format.raw/*259.33*/("""{"""),format.raw/*259.34*/("""
												return 'Too Low';
											"""),format.raw/*261.12*/("""}"""),format.raw/*261.13*/("""
										"""),format.raw/*262.11*/("""}"""),format.raw/*262.12*/("""
									"""),format.raw/*263.10*/("""}"""),format.raw/*263.11*/(""",
								"""),format.raw/*264.9*/("""}"""),format.raw/*264.10*/(""",
								tooltip : """),format.raw/*265.19*/("""{"""),format.raw/*265.20*/("""
									formatter : function() """),format.raw/*266.33*/("""{"""),format.raw/*266.34*/("""
										return 'At time: '
												+ Highcharts.dateFormat(
														'%H:%M:%S', this.x)
												+ '<br/>'
												+ 'Average loudness requested '
												+ Highcharts.numberFormat(
														this.voice_y, 2) + '%';
									"""),format.raw/*274.10*/("""}"""),format.raw/*274.11*/("""
								"""),format.raw/*275.9*/("""}"""),format.raw/*275.10*/(""",
								legend : """),format.raw/*276.18*/("""{"""),format.raw/*276.19*/("""
									enabled : false
								"""),format.raw/*278.9*/("""}"""),format.raw/*278.10*/(""",
								exporting : """),format.raw/*279.21*/("""{"""),format.raw/*279.22*/("""
									enabled : false
								"""),format.raw/*281.9*/("""}"""),format.raw/*281.10*/(""",
								series : [ """),format.raw/*282.20*/("""{"""),format.raw/*282.21*/("""
									name : 'Random data',
									data : (function() """),format.raw/*284.29*/("""{"""),format.raw/*284.30*/("""
										// generate an array of random data
										var data = [], time = (new Date())
												.getTime(), i;

										for (i = -9; i <= 0; i++) """),format.raw/*289.37*/("""{"""),format.raw/*289.38*/("""
											data.push("""),format.raw/*290.22*/("""{"""),format.raw/*290.23*/("""
												x : time + i * 1000,
												voice_y : 50
											//initialization 
											"""),format.raw/*294.12*/("""}"""),format.raw/*294.13*/(""");
										"""),format.raw/*295.11*/("""}"""),format.raw/*295.12*/("""
										return data;
									"""),format.raw/*297.10*/("""}"""),format.raw/*297.11*/(""")()
								"""),format.raw/*298.9*/("""}"""),format.raw/*298.10*/(""" ]
							"""),format.raw/*299.8*/("""}"""),format.raw/*299.9*/(""");
				"""),format.raw/*300.5*/("""}"""),format.raw/*300.6*/(""");

	"""),format.raw/*302.2*/("""}"""),format.raw/*302.3*/(""");

	$(function() """),format.raw/*304.15*/("""{"""),format.raw/*304.16*/("""

		var gaugeOptions = """),format.raw/*306.22*/("""{"""),format.raw/*306.23*/("""

			chart : """),format.raw/*308.12*/("""{"""),format.raw/*308.13*/("""
				type : 'solidgauge'
			"""),format.raw/*310.4*/("""}"""),format.raw/*310.5*/(""",

			title : null,

			pane : """),format.raw/*314.11*/("""{"""),format.raw/*314.12*/("""
				center : [ '50%', '85%' ],
				size : '140%',
				startAngle : -90,
				endAngle : 90,
				background : """),format.raw/*319.18*/("""{"""),format.raw/*319.19*/("""
					backgroundColor : (Highcharts.theme && Highcharts.theme.background2)
							|| '#EEE',
					innerRadius : '60%',
					outerRadius : '100%',
					shape : 'arc'
				"""),format.raw/*325.5*/("""}"""),format.raw/*325.6*/("""
			"""),format.raw/*326.4*/("""}"""),format.raw/*326.5*/(""",

			tooltip : """),format.raw/*328.14*/("""{"""),format.raw/*328.15*/("""
				enabled : true
			"""),format.raw/*330.4*/("""}"""),format.raw/*330.5*/(""",

			// the value axis
			yAxis : """),format.raw/*333.12*/("""{"""),format.raw/*333.13*/("""
				stops : [ [ 0.1, '#55BF3B' ], // green
				[ 0.5, '#DDDF0D' ], // yellow
				[ 0.9, '#DF5353' ] // red
				],
				lineWidth : 0,
				minorTickInterval : null,
				tickPixelInterval : 400,
				tickWidth : 0,
				title : """),format.raw/*342.13*/("""{"""),format.raw/*342.14*/("""
					y : -70
				"""),format.raw/*344.5*/("""}"""),format.raw/*344.6*/(""",
				labels : """),format.raw/*345.14*/("""{"""),format.raw/*345.15*/("""
					y : 16
				"""),format.raw/*347.5*/("""}"""),format.raw/*347.6*/("""
			"""),format.raw/*348.4*/("""}"""),format.raw/*348.5*/(""",

			plotOptions : """),format.raw/*350.18*/("""{"""),format.raw/*350.19*/("""
				solidgauge : """),format.raw/*351.18*/("""{"""),format.raw/*351.19*/("""
					dataLabels : """),format.raw/*352.19*/("""{"""),format.raw/*352.20*/("""
						y : 5,
						borderWidth : 0,
						useHTML : true
					"""),format.raw/*356.6*/("""}"""),format.raw/*356.7*/(""",
					states : """),format.raw/*357.15*/("""{"""),format.raw/*357.16*/("""
						hover : """),format.raw/*358.15*/("""{"""),format.raw/*358.16*/("""
							enabled : true
						"""),format.raw/*360.7*/("""}"""),format.raw/*360.8*/("""
					"""),format.raw/*361.6*/("""}"""),format.raw/*361.7*/("""

				"""),format.raw/*363.5*/("""}"""),format.raw/*363.6*/("""

			"""),format.raw/*365.4*/("""}"""),format.raw/*365.5*/("""
		"""),format.raw/*366.3*/("""}"""),format.raw/*366.4*/(""";

		// The speed gauge
		$('#container-speed')
				.highcharts(
						Highcharts
								.merge(
										gaugeOptions,
										"""),format.raw/*374.11*/("""{"""),format.raw/*374.12*/("""
											yAxis : """),format.raw/*375.20*/("""{"""),format.raw/*375.21*/("""
												min : 0,
												max : 100,
												title : """),format.raw/*378.21*/("""{"""),format.raw/*378.22*/("""
													text : 'Pause'
												"""),format.raw/*380.13*/("""}"""),format.raw/*380.14*/("""
											"""),format.raw/*381.12*/("""}"""),format.raw/*381.13*/(""",

											credits : """),format.raw/*383.22*/("""{"""),format.raw/*383.23*/("""
												enabled : false
											"""),format.raw/*385.12*/("""}"""),format.raw/*385.13*/(""",

											series : [ """),format.raw/*387.23*/("""{"""),format.raw/*387.24*/("""
												name : 'Pause',
												data : [ 0 ],
												dataLabels : """),format.raw/*390.26*/("""{"""),format.raw/*390.27*/("""
													format : '<div style="text-align:center"><span style="font-size:25px;color:'
															+ ((Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black')
															+ '">"""),format.raw/*393.21*/("""{"""),format.raw/*393.22*/("""y"""),format.raw/*393.23*/("""}"""),format.raw/*393.24*/("""</span><br/>'
															+ '<span style="font-size:12px;color:silver">Pause Percentage</span></div>'
												"""),format.raw/*395.13*/("""}"""),format.raw/*395.14*/(""",
												tooltip : """),format.raw/*396.23*/("""{"""),format.raw/*396.24*/("""
													valueSuffix : 'Number of persons voted for pause'
												"""),format.raw/*398.13*/("""}"""),format.raw/*398.14*/("""
											"""),format.raw/*399.12*/("""}"""),format.raw/*399.13*/(""" ]

										"""),format.raw/*401.11*/("""}"""),format.raw/*401.12*/("""));

		
		;
		
		setInterval(function() """),format.raw/*406.26*/("""{"""),format.raw/*406.27*/("""

			// Speed
			var chart = $('#container-speed').highcharts();
			if (chart) """),format.raw/*410.15*/("""{"""),format.raw/*410.16*/("""
				var point = chart.series[0].points[0];
				
				console.log('pause 2: ' + newVal);
				point.update(newVal);
			"""),format.raw/*415.4*/("""}"""),format.raw/*415.5*/("""

		"""),format.raw/*417.3*/("""}"""),format.raw/*417.4*/(""", 2000);

	"""),format.raw/*419.2*/("""}"""),format.raw/*419.3*/(""");
</script>

</head>
<body>
	<div id="container">
		<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
			<a href="/home"><img src=""""),_display_(Seq[Any](/*426.31*/routes/*426.37*/.Assets.at("images/logonew.png"))),format.raw/*426.69*/("""" height="70px"
				width="150px" alt="Live Feed"></a>
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
		
		<div id="lecture-number">LectureID: """),_display_(Seq[Any](/*441.40*/lectureNumber)),format.raw/*441.53*/("""</div>
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
                    DATE: Sun Jun 29 23:37:54 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Final/livefeed/app/views/profPage.scala.html
                    HASH: adde8f0b9b6f80bdfac6bf640c1ca7a70a9877ad
                    MATRIX: 793->1|967->64|994->83|1144->198|1158->204|1213->238|1303->292|1318->298|1372->330|1462->384|1477->390|1531->422|1617->472|1632->478|1692->516|1778->566|1793->572|1869->625|1955->675|1970->681|2042->730|2098->750|2113->756|2180->801|2360->953|2389->954|2617->1155|2645->1156|2708->1191|2737->1192|2862->1289|2891->1290|2929->1301|2957->1302|3026->1343|3055->1344|3162->1423|3191->1424|3357->1563|3385->1564|3465->1616|3494->1617|3668->1764|3696->1765|3773->1814|3802->1815|3934->1920|3962->1921|4046->1977|4075->1978|4216->2092|4244->2093|4277->2099|4305->2100|4373->2140|4402->2141|4440->2152|4468->2153|4541->2198|4570->2199|4630->2231|4659->2232|4729->2275|4757->2276|4802->2293|4831->2294|4889->2325|4917->2326|4949->2331|4977->2332|5058->2385|5087->2386|5151->2423|5179->2424|5246->2463|5275->2464|5339->2501|5367->2502|5399->2507|5427->2508|5475->2528|5504->2529|5573->2570|5602->2571|5659->2600|5688->2601|5733->2618|5762->2619|5820->2650|5848->2651|5882->2658|5910->2659|6013->2735|6041->2736|6087->2754|6116->2755|6284->2894|6314->2895|6373->2925|6403->2926|6598->3092|6628->3093|6755->3191|6785->3192|6882->3260|6912->3261|7029->3349|7059->3350|7108->3370|7138->3371|7178->3382|7208->3383|7246->3393|7276->3394|7324->3413|7354->3414|7417->3449|7447->3450|7495->3469|7525->3470|7573->3489|7603->3490|7668->3526|7698->3527|7800->3601|7830->3602|7880->3623|7910->3624|7958->3643|7988->3644|8059->3686|8089->3687|8179->3748|8209->3749|8273->3784|8303->3785|8368->3821|8398->3822|8472->3867|8502->3868|8568->3905|8598->3906|8666->3945|8696->3946|8761->3982|8791->3983|8865->4028|8895->4029|8936->4041|8966->4042|9006->4053|9036->4054|9075->4065|9105->4066|9155->4087|9185->4088|9248->4122|9278->4123|9565->4381|9595->4382|9633->4392|9663->4393|9712->4413|9742->4414|9806->4450|9836->4451|9888->4474|9918->4475|9982->4511|10012->4512|10063->4534|10093->4535|10184->4597|10214->4598|10404->4759|10434->4760|10486->4783|10516->4784|10618->4857|10648->4858|10691->4872|10721->4873|10785->4908|10815->4909|10856->4922|10886->4923|10925->4934|10954->4935|10990->4943|11019->4944|11054->4951|11083->4952|11132->4972|11162->4973|11230->5012|11260->5013|11318->5042|11348->5043|11394->5060|11424->5061|11483->5092|11512->5093|11547->5100|11576->5101|11683->5180|11712->5181|11759->5199|11789->5200|11957->5339|11987->5340|12046->5370|12076->5371|12305->5571|12335->5572|12589->5797|12619->5798|12716->5866|12746->5867|12863->5955|12893->5956|12942->5976|12972->5977|13012->5988|13042->5989|13080->5999|13110->6000|13158->6019|13188->6020|13254->6058|13284->6059|13332->6078|13362->6079|13410->6098|13440->6099|13505->6135|13535->6136|13637->6210|13667->6211|13717->6232|13747->6233|13795->6252|13825->6253|13896->6295|13926->6296|14016->6357|14046->6358|14110->6393|14140->6394|14205->6430|14235->6431|14309->6476|14339->6477|14405->6514|14435->6515|14503->6554|14533->6555|14598->6591|14628->6592|14701->6636|14731->6637|14772->6649|14802->6650|14842->6661|14872->6662|14911->6673|14941->6674|14991->6695|15021->6696|15084->6730|15114->6731|15404->6992|15434->6993|15472->7003|15502->7004|15551->7024|15581->7025|15645->7061|15675->7062|15727->7085|15757->7086|15821->7122|15851->7123|15902->7145|15932->7146|16023->7208|16053->7209|16243->7370|16273->7371|16325->7394|16355->7395|16487->7498|16517->7499|16560->7513|16590->7514|16654->7549|16684->7550|16725->7563|16755->7564|16794->7575|16823->7576|16859->7584|16888->7585|16923->7592|16952->7593|17001->7613|17031->7614|17085->7639|17115->7640|17159->7655|17189->7656|17247->7686|17276->7687|17340->7722|17370->7723|17513->7837|17543->7838|17746->8013|17775->8014|17808->8019|17837->8020|17884->8038|17914->8039|17967->8064|17996->8065|18063->8103|18093->8104|18355->8337|18385->8338|18433->8358|18462->8359|18507->8375|18537->8376|18584->8395|18613->8396|18646->8401|18675->8402|18726->8424|18756->8425|18804->8444|18834->8445|18883->8465|18913->8466|19008->8533|19037->8534|19083->8551|19113->8552|19158->8568|19188->8569|19247->8600|19276->8601|19311->8608|19340->8609|19376->8617|19405->8618|19440->8625|19469->8626|19501->8630|19530->8631|19699->8771|19729->8772|19779->8793|19809->8794|19906->8862|19936->8863|20008->8906|20038->8907|20080->8920|20110->8921|20165->8947|20195->8948|20266->8990|20296->8991|20352->9018|20382->9019|20494->9102|20524->9103|20754->9304|20784->9305|20814->9306|20844->9307|20992->9426|21022->9427|21076->9452|21106->9453|21213->9531|21243->9532|21285->9545|21315->9546|21360->9562|21390->9563|21464->9608|21494->9609|21606->9692|21636->9693|21786->9815|21815->9816|21849->9822|21878->9823|21919->9836|21948->9837|22147->9999|22163->10005|22218->10037|22932->10714|22968->10727
                    LINES: 26->1|30->1|30->2|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|44->16|44->16|44->16|52->24|52->24|58->30|58->30|60->32|60->32|64->36|64->36|66->38|66->38|68->40|68->40|71->43|71->43|75->47|75->47|75->47|75->47|79->51|79->51|79->51|79->51|82->54|82->54|83->55|83->55|87->59|87->59|89->61|89->61|91->63|91->63|93->65|93->65|95->67|95->67|96->68|96->68|98->70|98->70|98->70|98->70|100->72|100->72|101->73|101->73|104->76|104->76|106->78|106->78|108->80|108->80|110->82|110->82|111->83|111->83|113->85|113->85|116->88|116->88|117->89|117->89|118->90|118->90|120->92|120->92|121->93|121->93|125->97|125->97|126->98|126->98|130->102|130->102|131->103|131->103|137->109|137->109|140->112|140->112|142->114|142->114|146->118|146->118|147->119|147->119|148->120|148->120|149->121|149->121|150->122|150->122|152->124|152->124|153->125|153->125|154->126|154->126|156->128|156->128|159->131|159->131|161->133|161->133|162->134|162->134|164->136|164->136|167->139|167->139|168->140|168->140|169->141|169->141|171->143|171->143|173->145|173->145|175->147|175->147|177->149|177->149|179->151|179->151|180->152|180->152|181->153|181->153|182->154|182->154|183->155|183->155|184->156|184->156|192->164|192->164|193->165|193->165|194->166|194->166|196->168|196->168|197->169|197->169|199->171|199->171|200->172|200->172|202->174|202->174|207->179|207->179|208->180|208->180|211->183|211->183|212->184|212->184|214->186|214->186|215->187|215->187|216->188|216->188|217->189|217->189|219->191|219->191|221->193|221->193|223->195|223->195|224->196|224->196|225->197|225->197|227->199|227->199|228->200|228->200|232->204|232->204|233->205|233->205|237->209|237->209|238->210|238->210|245->217|245->217|250->222|250->222|252->224|252->224|256->228|256->228|257->229|257->229|258->230|258->230|259->231|259->231|260->232|260->232|262->234|262->234|263->235|263->235|264->236|264->236|266->238|266->238|269->241|269->241|271->243|271->243|272->244|272->244|274->246|274->246|277->249|277->249|278->250|278->250|279->251|279->251|281->253|281->253|283->255|283->255|285->257|285->257|287->259|287->259|289->261|289->261|290->262|290->262|291->263|291->263|292->264|292->264|293->265|293->265|294->266|294->266|302->274|302->274|303->275|303->275|304->276|304->276|306->278|306->278|307->279|307->279|309->281|309->281|310->282|310->282|312->284|312->284|317->289|317->289|318->290|318->290|322->294|322->294|323->295|323->295|325->297|325->297|326->298|326->298|327->299|327->299|328->300|328->300|330->302|330->302|332->304|332->304|334->306|334->306|336->308|336->308|338->310|338->310|342->314|342->314|347->319|347->319|353->325|353->325|354->326|354->326|356->328|356->328|358->330|358->330|361->333|361->333|370->342|370->342|372->344|372->344|373->345|373->345|375->347|375->347|376->348|376->348|378->350|378->350|379->351|379->351|380->352|380->352|384->356|384->356|385->357|385->357|386->358|386->358|388->360|388->360|389->361|389->361|391->363|391->363|393->365|393->365|394->366|394->366|402->374|402->374|403->375|403->375|406->378|406->378|408->380|408->380|409->381|409->381|411->383|411->383|413->385|413->385|415->387|415->387|418->390|418->390|421->393|421->393|421->393|421->393|423->395|423->395|424->396|424->396|426->398|426->398|427->399|427->399|429->401|429->401|434->406|434->406|438->410|438->410|443->415|443->415|445->417|445->417|447->419|447->419|454->426|454->426|454->426|469->441|469->441
                    -- GENERATED --
                */
            