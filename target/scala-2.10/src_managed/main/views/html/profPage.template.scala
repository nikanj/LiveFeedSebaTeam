
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

		$("#submit_button")
        .click(
          function() """),format.raw/*66.22*/("""{"""),format.raw/*66.23*/("""
           var question_text = $('#question')
             .val();
           displayQuestion(question_text);
           $('#question').val('');
           $("#q_area").hide();

          """),format.raw/*73.11*/("""}"""),format.raw/*73.12*/(""");

      $("#cancel_button").click(function() """),format.raw/*75.44*/("""{"""),format.raw/*75.45*/("""
       $("#q_area").hide();
      """),format.raw/*77.7*/("""}"""),format.raw/*77.8*/(""");

      $("#add").click(function() """),format.raw/*79.34*/("""{"""),format.raw/*79.35*/("""
       $("#q_area").show();
      """),format.raw/*81.7*/("""}"""),format.raw/*81.8*/(""");
	"""),format.raw/*82.2*/("""}"""),format.raw/*82.3*/(""");

	$(function() """),format.raw/*84.15*/("""{"""),format.raw/*84.16*/("""

		$(document).ready(
				function() """),format.raw/*87.16*/("""{"""),format.raw/*87.17*/("""
					Highcharts.setOptions("""),format.raw/*88.28*/("""{"""),format.raw/*88.29*/("""
						global : """),format.raw/*89.16*/("""{"""),format.raw/*89.17*/("""
							useUTC : false
						"""),format.raw/*91.7*/("""}"""),format.raw/*91.8*/("""
					"""),format.raw/*92.6*/("""}"""),format.raw/*92.7*/(""");

					var chart;
					$('#container-speed-chart').highcharts(
							"""),format.raw/*96.8*/("""{"""),format.raw/*96.9*/("""
								chart : """),format.raw/*97.17*/("""{"""),format.raw/*97.18*/("""
									type : 'spline',
									animation : Highcharts.svg, // don't animate in old IE
									marginRight : 5,
									events : """),format.raw/*101.19*/("""{"""),format.raw/*101.20*/("""
										load : function() """),format.raw/*102.29*/("""{"""),format.raw/*102.30*/("""

											// set up the updating of the chart each second
											var series = this.series[0];
											//var y = 0;

											setInterval(function() """),format.raw/*108.35*/("""{"""),format.raw/*108.36*/("""

												var x = (new Date()).getTime(); // current time
												if (speed_y == null) """),format.raw/*111.34*/("""{"""),format.raw/*111.35*/("""
													speed_y = 50; //used for initialization
												"""),format.raw/*113.13*/("""}"""),format.raw/*113.14*/("""
												series.addPoint([ x, speed_y ],
														true, true);

											"""),format.raw/*117.12*/("""}"""),format.raw/*117.13*/(""", 1000);
										"""),format.raw/*118.11*/("""}"""),format.raw/*118.12*/("""
									"""),format.raw/*119.10*/("""}"""),format.raw/*119.11*/("""
								"""),format.raw/*120.9*/("""}"""),format.raw/*120.10*/(""",
								title : """),format.raw/*121.17*/("""{"""),format.raw/*121.18*/("""
									text : 'Speed'
								"""),format.raw/*123.9*/("""}"""),format.raw/*123.10*/(""",
								xAxis : """),format.raw/*124.17*/("""{"""),format.raw/*124.18*/("""
									title : """),format.raw/*125.18*/("""{"""),format.raw/*125.19*/("""
										text : 'Time'
									"""),format.raw/*127.10*/("""}"""),format.raw/*127.11*/(""",
									type : 'datetime',
									tickPixelInterval : 150
								"""),format.raw/*130.9*/("""}"""),format.raw/*130.10*/(""",

								yAxis : """),format.raw/*132.17*/("""{"""),format.raw/*132.18*/("""
									title : """),format.raw/*133.18*/("""{"""),format.raw/*133.19*/("""
										text : 'Percentage'
									"""),format.raw/*135.10*/("""}"""),format.raw/*135.11*/(""",
									min : 0,
									max : 100,
									labels : """),format.raw/*138.19*/("""{"""),format.raw/*138.20*/("""
										formatter : function() """),format.raw/*139.34*/("""{"""),format.raw/*139.35*/("""
											if (this.value == 100) """),format.raw/*140.35*/("""{"""),format.raw/*140.36*/("""
												return 'Too Fast';
											"""),format.raw/*142.12*/("""}"""),format.raw/*142.13*/("""

											if (this.value == 50) """),format.raw/*144.34*/("""{"""),format.raw/*144.35*/("""
												return 'OK';
											"""),format.raw/*146.12*/("""}"""),format.raw/*146.13*/("""

											if (this.value == 0) """),format.raw/*148.33*/("""{"""),format.raw/*148.34*/("""
												return 'Too Slow';
											"""),format.raw/*150.12*/("""}"""),format.raw/*150.13*/("""
										"""),format.raw/*151.11*/("""}"""),format.raw/*151.12*/("""
									"""),format.raw/*152.10*/("""}"""),format.raw/*152.11*/(""",
								"""),format.raw/*153.9*/("""}"""),format.raw/*153.10*/(""",
								tooltip : """),format.raw/*154.19*/("""{"""),format.raw/*154.20*/("""
									formatter : function() """),format.raw/*155.33*/("""{"""),format.raw/*155.34*/("""
										return 'At time: '
												+ Highcharts.dateFormat(
														'%H:%M:%S', this.x)
												+ '<br/>'
												+ 'Average speed requested '
												+ Highcharts.numberFormat(
														this.speed_y, 2) + '%';
									"""),format.raw/*163.10*/("""}"""),format.raw/*163.11*/("""
								"""),format.raw/*164.9*/("""}"""),format.raw/*164.10*/(""",
								legend : """),format.raw/*165.18*/("""{"""),format.raw/*165.19*/("""
									enabled : false
								"""),format.raw/*167.9*/("""}"""),format.raw/*167.10*/(""",
								exporting : """),format.raw/*168.21*/("""{"""),format.raw/*168.22*/("""
									enabled : false
								"""),format.raw/*170.9*/("""}"""),format.raw/*170.10*/(""",
								series : [ """),format.raw/*171.20*/("""{"""),format.raw/*171.21*/("""
									name : 'Random data',
									data : (function() """),format.raw/*173.29*/("""{"""),format.raw/*173.30*/("""
										// generate an array of random data
										var data = [], time = (new Date())
												.getTime(), i;

										for (i = -19; i <= 0; i++) """),format.raw/*178.38*/("""{"""),format.raw/*178.39*/("""
											data.push("""),format.raw/*179.22*/("""{"""),format.raw/*179.23*/("""
												x : time + i * 1000,
												speed_y : 50
											"""),format.raw/*182.12*/("""}"""),format.raw/*182.13*/(""");
										"""),format.raw/*183.11*/("""}"""),format.raw/*183.12*/("""
										return data;
									"""),format.raw/*185.10*/("""}"""),format.raw/*185.11*/(""")()
								"""),format.raw/*186.9*/("""}"""),format.raw/*186.10*/(""" ]
							"""),format.raw/*187.8*/("""}"""),format.raw/*187.9*/(""");
				"""),format.raw/*188.5*/("""}"""),format.raw/*188.6*/(""");

	"""),format.raw/*190.2*/("""}"""),format.raw/*190.3*/(""");

	$(function() """),format.raw/*192.15*/("""{"""),format.raw/*192.16*/("""
		$(document).ready(
				function() """),format.raw/*194.16*/("""{"""),format.raw/*194.17*/("""
					Highcharts.setOptions("""),format.raw/*195.28*/("""{"""),format.raw/*195.29*/("""
						global : """),format.raw/*196.16*/("""{"""),format.raw/*196.17*/("""
							useUTC : false
						"""),format.raw/*198.7*/("""}"""),format.raw/*198.8*/("""
					"""),format.raw/*199.6*/("""}"""),format.raw/*199.7*/(""");

					var chart;
					$('#container-loudness-chart').highcharts(
							"""),format.raw/*203.8*/("""{"""),format.raw/*203.9*/("""
								chart : """),format.raw/*204.17*/("""{"""),format.raw/*204.18*/("""
									type : 'spline',
									animation : Highcharts.svg, // don't animate in old IE
									marginRight : 5,
									events : """),format.raw/*208.19*/("""{"""),format.raw/*208.20*/("""
										load : function() """),format.raw/*209.29*/("""{"""),format.raw/*209.30*/("""

											// set up the updating of the chart each second
											var series = this.series[0];
											//var y = 0;
											//var server_message;

											setInterval(function() """),format.raw/*216.35*/("""{"""),format.raw/*216.36*/("""

												//var connection = new WebSocket('ws://localhost:9000');  //initialize the websocket inside the "interval loop"

												var x = (new Date()).getTime(); // current time
												if (voice_y == null) """),format.raw/*221.34*/("""{"""),format.raw/*221.35*/("""
													voice_y = 50; //used for initialization
												"""),format.raw/*223.13*/("""}"""),format.raw/*223.14*/("""
												series.addPoint([ x, voice_y ],
														true, true);

											"""),format.raw/*227.12*/("""}"""),format.raw/*227.13*/(""", 1000);
										"""),format.raw/*228.11*/("""}"""),format.raw/*228.12*/("""
									"""),format.raw/*229.10*/("""}"""),format.raw/*229.11*/("""
								"""),format.raw/*230.9*/("""}"""),format.raw/*230.10*/(""",
								title : """),format.raw/*231.17*/("""{"""),format.raw/*231.18*/("""
									text : 'Loudness'
								"""),format.raw/*233.9*/("""}"""),format.raw/*233.10*/(""",
								xAxis : """),format.raw/*234.17*/("""{"""),format.raw/*234.18*/("""
									title : """),format.raw/*235.18*/("""{"""),format.raw/*235.19*/("""
										text : 'Time'
									"""),format.raw/*237.10*/("""}"""),format.raw/*237.11*/(""",
									type : 'datetime',
									tickPixelInterval : 150
								"""),format.raw/*240.9*/("""}"""),format.raw/*240.10*/(""",

								yAxis : """),format.raw/*242.17*/("""{"""),format.raw/*242.18*/("""
									title : """),format.raw/*243.18*/("""{"""),format.raw/*243.19*/("""
										text : 'Percentage'
									"""),format.raw/*245.10*/("""}"""),format.raw/*245.11*/(""",
									min : 0,
									max : 100,
									labels : """),format.raw/*248.19*/("""{"""),format.raw/*248.20*/("""
										formatter : function() """),format.raw/*249.34*/("""{"""),format.raw/*249.35*/("""
											if (this.value == 100) """),format.raw/*250.35*/("""{"""),format.raw/*250.36*/("""
												return 'Too Loud';
											"""),format.raw/*252.12*/("""}"""),format.raw/*252.13*/("""

											if (this.value == 50) """),format.raw/*254.34*/("""{"""),format.raw/*254.35*/("""
												return 'OK';
											"""),format.raw/*256.12*/("""}"""),format.raw/*256.13*/("""

											if (this.value == 0) """),format.raw/*258.33*/("""{"""),format.raw/*258.34*/("""
												return 'Too Low';
											"""),format.raw/*260.12*/("""}"""),format.raw/*260.13*/("""
										"""),format.raw/*261.11*/("""}"""),format.raw/*261.12*/("""
									"""),format.raw/*262.10*/("""}"""),format.raw/*262.11*/(""",
								"""),format.raw/*263.9*/("""}"""),format.raw/*263.10*/(""",
								tooltip : """),format.raw/*264.19*/("""{"""),format.raw/*264.20*/("""
									formatter : function() """),format.raw/*265.33*/("""{"""),format.raw/*265.34*/("""
										return 'At time: '
												+ Highcharts.dateFormat(
														'%H:%M:%S', this.x)
												+ '<br/>'
												+ 'Average loudness requested '
												+ Highcharts.numberFormat(
														this.voice_y, 2) + '%';
									"""),format.raw/*273.10*/("""}"""),format.raw/*273.11*/("""
								"""),format.raw/*274.9*/("""}"""),format.raw/*274.10*/(""",
								legend : """),format.raw/*275.18*/("""{"""),format.raw/*275.19*/("""
									enabled : false
								"""),format.raw/*277.9*/("""}"""),format.raw/*277.10*/(""",
								exporting : """),format.raw/*278.21*/("""{"""),format.raw/*278.22*/("""
									enabled : false
								"""),format.raw/*280.9*/("""}"""),format.raw/*280.10*/(""",
								series : [ """),format.raw/*281.20*/("""{"""),format.raw/*281.21*/("""
									name : 'Random data',
									data : (function() """),format.raw/*283.29*/("""{"""),format.raw/*283.30*/("""
										// generate an array of random data
										var data = [], time = (new Date())
												.getTime(), i;

										for (i = -19; i <= 0; i++) """),format.raw/*288.38*/("""{"""),format.raw/*288.39*/("""
											data.push("""),format.raw/*289.22*/("""{"""),format.raw/*289.23*/("""
												x : time + i * 1000,
												voice_y : 50
											//initialization 
											"""),format.raw/*293.12*/("""}"""),format.raw/*293.13*/(""");
										"""),format.raw/*294.11*/("""}"""),format.raw/*294.12*/("""
										return data;
									"""),format.raw/*296.10*/("""}"""),format.raw/*296.11*/(""")()
								"""),format.raw/*297.9*/("""}"""),format.raw/*297.10*/(""" ]
							"""),format.raw/*298.8*/("""}"""),format.raw/*298.9*/(""");
				"""),format.raw/*299.5*/("""}"""),format.raw/*299.6*/(""");

	"""),format.raw/*301.2*/("""}"""),format.raw/*301.3*/(""");

	$(function() """),format.raw/*303.15*/("""{"""),format.raw/*303.16*/("""

		var gaugeOptions = """),format.raw/*305.22*/("""{"""),format.raw/*305.23*/("""

			chart : """),format.raw/*307.12*/("""{"""),format.raw/*307.13*/("""
				type : 'solidgauge'
			"""),format.raw/*309.4*/("""}"""),format.raw/*309.5*/(""",

			title : null,

			pane : """),format.raw/*313.11*/("""{"""),format.raw/*313.12*/("""
				center : [ '50%', '85%' ],
				size : '140%',
				startAngle : -90,
				endAngle : 90,
				background : """),format.raw/*318.18*/("""{"""),format.raw/*318.19*/("""
					backgroundColor : (Highcharts.theme && Highcharts.theme.background2)
							|| '#EEE',
					innerRadius : '60%',
					outerRadius : '100%',
					shape : 'arc'
				"""),format.raw/*324.5*/("""}"""),format.raw/*324.6*/("""
			"""),format.raw/*325.4*/("""}"""),format.raw/*325.5*/(""",

			tooltip : """),format.raw/*327.14*/("""{"""),format.raw/*327.15*/("""
				enabled : true
			"""),format.raw/*329.4*/("""}"""),format.raw/*329.5*/(""",

			// the value axis
			yAxis : """),format.raw/*332.12*/("""{"""),format.raw/*332.13*/("""
				stops : [ [ 0.1, '#55BF3B' ], // green
				[ 0.5, '#DDDF0D' ], // yellow
				[ 0.9, '#DF5353' ] // red
				],
				lineWidth : 0,
				minorTickInterval : null,
				tickPixelInterval : 400,
				tickWidth : 0,
				title : """),format.raw/*341.13*/("""{"""),format.raw/*341.14*/("""
					y : -70
				"""),format.raw/*343.5*/("""}"""),format.raw/*343.6*/(""",
				labels : """),format.raw/*344.14*/("""{"""),format.raw/*344.15*/("""
					y : 16
				"""),format.raw/*346.5*/("""}"""),format.raw/*346.6*/("""
			"""),format.raw/*347.4*/("""}"""),format.raw/*347.5*/(""",

			plotOptions : """),format.raw/*349.18*/("""{"""),format.raw/*349.19*/("""
				solidgauge : """),format.raw/*350.18*/("""{"""),format.raw/*350.19*/("""
					dataLabels : """),format.raw/*351.19*/("""{"""),format.raw/*351.20*/("""
						y : 5,
						borderWidth : 0,
						useHTML : true
					"""),format.raw/*355.6*/("""}"""),format.raw/*355.7*/(""",
					states : """),format.raw/*356.15*/("""{"""),format.raw/*356.16*/("""
						hover : """),format.raw/*357.15*/("""{"""),format.raw/*357.16*/("""
							enabled : true
						"""),format.raw/*359.7*/("""}"""),format.raw/*359.8*/("""
					"""),format.raw/*360.6*/("""}"""),format.raw/*360.7*/("""

				"""),format.raw/*362.5*/("""}"""),format.raw/*362.6*/("""

			"""),format.raw/*364.4*/("""}"""),format.raw/*364.5*/("""
		"""),format.raw/*365.3*/("""}"""),format.raw/*365.4*/(""";

		// The speed gauge
		$('#container-speed')
				.highcharts(
						Highcharts
								.merge(
										gaugeOptions,
										"""),format.raw/*373.11*/("""{"""),format.raw/*373.12*/("""
											yAxis : """),format.raw/*374.20*/("""{"""),format.raw/*374.21*/("""
												min : 0,
												max : 100,
												title : """),format.raw/*377.21*/("""{"""),format.raw/*377.22*/("""
													text : 'Pause'
												"""),format.raw/*379.13*/("""}"""),format.raw/*379.14*/("""
											"""),format.raw/*380.12*/("""}"""),format.raw/*380.13*/(""",

											credits : """),format.raw/*382.22*/("""{"""),format.raw/*382.23*/("""
												enabled : false
											"""),format.raw/*384.12*/("""}"""),format.raw/*384.13*/(""",

											series : [ """),format.raw/*386.23*/("""{"""),format.raw/*386.24*/("""
												name : 'Pause',
												data : [ 0 ],
												dataLabels : """),format.raw/*389.26*/("""{"""),format.raw/*389.27*/("""
													format : '<div style="text-align:center"><span style="font-size:25px;color:'
															+ ((Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black')
															+ '">"""),format.raw/*392.21*/("""{"""),format.raw/*392.22*/("""y"""),format.raw/*392.23*/("""}"""),format.raw/*392.24*/("""</span><br/>'
															+ '<span style="font-size:12px;color:silver">Pause counts</span></div>'
												"""),format.raw/*394.13*/("""}"""),format.raw/*394.14*/(""",
												tooltip : """),format.raw/*395.23*/("""{"""),format.raw/*395.24*/("""
													valueSuffix : 'Number of persons voted for pause'
												"""),format.raw/*397.13*/("""}"""),format.raw/*397.14*/("""
											"""),format.raw/*398.12*/("""}"""),format.raw/*398.13*/(""" ]

										"""),format.raw/*400.11*/("""}"""),format.raw/*400.12*/("""));

		// The RPM gauge
		;
		//var newVal;
		// Bring life to the dials
		setInterval(function() """),format.raw/*406.26*/("""{"""),format.raw/*406.27*/("""

			// Speed
			var chart = $('#container-speed').highcharts();
			if (chart) """),format.raw/*410.15*/("""{"""),format.raw/*410.16*/("""
				var point = chart.series[0].points[0];
				//   inc = Math.round((Math.random() - 0.5) * 100);

				// newVal = point.y + inc;
				/*  if (newVal < 0 || newVal > 100) """),format.raw/*415.41*/("""{"""),format.raw/*415.42*/("""
				      newVal = point.y - inc;
				  """),format.raw/*417.7*/("""}"""),format.raw/*417.8*/("""*/
				console.log('pause 2: ' + newVal);
				point.update(newVal);
			"""),format.raw/*420.4*/("""}"""),format.raw/*420.5*/("""

		"""),format.raw/*422.3*/("""}"""),format.raw/*422.4*/(""", 2000);

	"""),format.raw/*424.2*/("""}"""),format.raw/*424.3*/(""");
</script>

<script>
	//	$(function () """),format.raw/*428.19*/("""{"""),format.raw/*428.20*/("""
	//	$('#container-questions').
	//"""),format.raw/*430.4*/("""}"""),format.raw/*430.5*/(""");
</script>

</head>
<body>
	<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
		<img src=""""),_display_(Seq[Any](/*436.14*/routes/*436.20*/.Assets.at(" images/logo.png"))),format.raw/*436.50*/("""" height="50px"
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
                    DATE: Thu Jun 19 19:01:57 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/profPage.scala.html
                    HASH: fa3d71a9666805c2044f882b6f22c9c9cc7c3b6d
                    MATRIX: 775->1|900->15|927->34|1077->149|1091->155|1146->189|1236->243|1251->249|1305->281|1391->331|1406->337|1482->390|1568->440|1583->446|1655->495|1711->515|1726->521|1793->566|1971->716|2000->717|2228->918|2256->919|2319->954|2348->955|2473->1052|2502->1053|2540->1064|2568->1065|2637->1106|2666->1107|2773->1186|2802->1187|2968->1326|2996->1327|3076->1379|3105->1380|3279->1527|3307->1528|3384->1577|3413->1578|3545->1683|3573->1684|3657->1740|3686->1741|3827->1855|3855->1856|3888->1862|3916->1863|3984->1903|4013->1904|4080->1944|4108->1945|4201->2010|4230->2011|4454->2207|4483->2208|4560->2257|4589->2258|4653->2295|4681->2296|4748->2335|4777->2336|4841->2373|4869->2374|4901->2379|4929->2380|4977->2400|5006->2401|5075->2442|5104->2443|5161->2472|5190->2473|5235->2490|5264->2491|5322->2522|5350->2523|5384->2530|5412->2531|5515->2607|5543->2608|5589->2626|5618->2627|5786->2766|5816->2767|5875->2797|5905->2798|6100->2964|6130->2965|6257->3063|6287->3064|6384->3132|6414->3133|6531->3221|6561->3222|6610->3242|6640->3243|6680->3254|6710->3255|6748->3265|6778->3266|6826->3285|6856->3286|6919->3321|6949->3322|6997->3341|7027->3342|7075->3361|7105->3362|7170->3398|7200->3399|7302->3473|7332->3474|7382->3495|7412->3496|7460->3515|7490->3516|7561->3558|7591->3559|7681->3620|7711->3621|7775->3656|7805->3657|7870->3693|7900->3694|7974->3739|8004->3740|8070->3777|8100->3778|8168->3817|8198->3818|8263->3854|8293->3855|8367->3900|8397->3901|8438->3913|8468->3914|8508->3925|8538->3926|8577->3937|8607->3938|8657->3959|8687->3960|8750->3994|8780->3995|9067->4253|9097->4254|9135->4264|9165->4265|9214->4285|9244->4286|9308->4322|9338->4323|9390->4346|9420->4347|9484->4383|9514->4384|9565->4406|9595->4407|9686->4469|9716->4470|9907->4632|9937->4633|9989->4656|10019->4657|10121->4730|10151->4731|10194->4745|10224->4746|10288->4781|10318->4782|10359->4795|10389->4796|10428->4807|10457->4808|10493->4816|10522->4817|10557->4824|10586->4825|10635->4845|10665->4846|10733->4885|10763->4886|10821->4915|10851->4916|10897->4933|10927->4934|10986->4965|11015->4966|11050->4973|11079->4974|11186->5053|11215->5054|11262->5072|11292->5073|11460->5212|11490->5213|11549->5243|11579->5244|11808->5444|11838->5445|12092->5670|12122->5671|12219->5739|12249->5740|12366->5828|12396->5829|12445->5849|12475->5850|12515->5861|12545->5862|12583->5872|12613->5873|12661->5892|12691->5893|12757->5931|12787->5932|12835->5951|12865->5952|12913->5971|12943->5972|13008->6008|13038->6009|13140->6083|13170->6084|13220->6105|13250->6106|13298->6125|13328->6126|13399->6168|13429->6169|13519->6230|13549->6231|13613->6266|13643->6267|13708->6303|13738->6304|13812->6349|13842->6350|13908->6387|13938->6388|14006->6427|14036->6428|14101->6464|14131->6465|14204->6509|14234->6510|14275->6522|14305->6523|14345->6534|14375->6535|14414->6546|14444->6547|14494->6568|14524->6569|14587->6603|14617->6604|14907->6865|14937->6866|14975->6876|15005->6877|15054->6897|15084->6898|15148->6934|15178->6935|15230->6958|15260->6959|15324->6995|15354->6996|15405->7018|15435->7019|15526->7081|15556->7082|15747->7244|15777->7245|15829->7268|15859->7269|15991->7372|16021->7373|16064->7387|16094->7388|16158->7423|16188->7424|16229->7437|16259->7438|16298->7449|16327->7450|16363->7458|16392->7459|16427->7466|16456->7467|16505->7487|16535->7488|16589->7513|16619->7514|16663->7529|16693->7530|16751->7560|16780->7561|16844->7596|16874->7597|17017->7711|17047->7712|17250->7887|17279->7888|17312->7893|17341->7894|17388->7912|17418->7913|17471->7938|17500->7939|17567->7977|17597->7978|17859->8211|17889->8212|17937->8232|17966->8233|18011->8249|18041->8250|18088->8269|18117->8270|18150->8275|18179->8276|18230->8298|18260->8299|18308->8318|18338->8319|18387->8339|18417->8340|18512->8407|18541->8408|18587->8425|18617->8426|18662->8442|18692->8443|18751->8474|18780->8475|18815->8482|18844->8483|18880->8491|18909->8492|18944->8499|18973->8500|19005->8504|19034->8505|19203->8645|19233->8646|19283->8667|19313->8668|19410->8736|19440->8737|19512->8780|19542->8781|19584->8794|19614->8795|19669->8821|19699->8822|19770->8864|19800->8865|19856->8892|19886->8893|19998->8976|20028->8977|20258->9178|20288->9179|20318->9180|20348->9181|20492->9296|20522->9297|20576->9322|20606->9323|20713->9401|20743->9402|20785->9415|20815->9416|20860->9432|20890->9433|21023->9537|21053->9538|21165->9621|21195->9622|21401->9799|21431->9800|21502->9843|21531->9844|21633->9918|21662->9919|21696->9925|21725->9926|21766->9939|21795->9940|21869->9985|21899->9986|21964->10023|21993->10024|22151->10145|22167->10151|22220->10181
                    LINES: 26->1|30->1|30->2|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|42->14|42->14|42->14|49->21|49->21|55->27|55->27|57->29|57->29|61->33|61->33|63->35|63->35|65->37|65->37|68->40|68->40|72->44|72->44|72->44|72->44|76->48|76->48|76->48|76->48|79->51|79->51|80->52|80->52|84->56|84->56|86->58|86->58|88->60|88->60|90->62|90->62|94->66|94->66|101->73|101->73|103->75|103->75|105->77|105->77|107->79|107->79|109->81|109->81|110->82|110->82|112->84|112->84|115->87|115->87|116->88|116->88|117->89|117->89|119->91|119->91|120->92|120->92|124->96|124->96|125->97|125->97|129->101|129->101|130->102|130->102|136->108|136->108|139->111|139->111|141->113|141->113|145->117|145->117|146->118|146->118|147->119|147->119|148->120|148->120|149->121|149->121|151->123|151->123|152->124|152->124|153->125|153->125|155->127|155->127|158->130|158->130|160->132|160->132|161->133|161->133|163->135|163->135|166->138|166->138|167->139|167->139|168->140|168->140|170->142|170->142|172->144|172->144|174->146|174->146|176->148|176->148|178->150|178->150|179->151|179->151|180->152|180->152|181->153|181->153|182->154|182->154|183->155|183->155|191->163|191->163|192->164|192->164|193->165|193->165|195->167|195->167|196->168|196->168|198->170|198->170|199->171|199->171|201->173|201->173|206->178|206->178|207->179|207->179|210->182|210->182|211->183|211->183|213->185|213->185|214->186|214->186|215->187|215->187|216->188|216->188|218->190|218->190|220->192|220->192|222->194|222->194|223->195|223->195|224->196|224->196|226->198|226->198|227->199|227->199|231->203|231->203|232->204|232->204|236->208|236->208|237->209|237->209|244->216|244->216|249->221|249->221|251->223|251->223|255->227|255->227|256->228|256->228|257->229|257->229|258->230|258->230|259->231|259->231|261->233|261->233|262->234|262->234|263->235|263->235|265->237|265->237|268->240|268->240|270->242|270->242|271->243|271->243|273->245|273->245|276->248|276->248|277->249|277->249|278->250|278->250|280->252|280->252|282->254|282->254|284->256|284->256|286->258|286->258|288->260|288->260|289->261|289->261|290->262|290->262|291->263|291->263|292->264|292->264|293->265|293->265|301->273|301->273|302->274|302->274|303->275|303->275|305->277|305->277|306->278|306->278|308->280|308->280|309->281|309->281|311->283|311->283|316->288|316->288|317->289|317->289|321->293|321->293|322->294|322->294|324->296|324->296|325->297|325->297|326->298|326->298|327->299|327->299|329->301|329->301|331->303|331->303|333->305|333->305|335->307|335->307|337->309|337->309|341->313|341->313|346->318|346->318|352->324|352->324|353->325|353->325|355->327|355->327|357->329|357->329|360->332|360->332|369->341|369->341|371->343|371->343|372->344|372->344|374->346|374->346|375->347|375->347|377->349|377->349|378->350|378->350|379->351|379->351|383->355|383->355|384->356|384->356|385->357|385->357|387->359|387->359|388->360|388->360|390->362|390->362|392->364|392->364|393->365|393->365|401->373|401->373|402->374|402->374|405->377|405->377|407->379|407->379|408->380|408->380|410->382|410->382|412->384|412->384|414->386|414->386|417->389|417->389|420->392|420->392|420->392|420->392|422->394|422->394|423->395|423->395|425->397|425->397|426->398|426->398|428->400|428->400|434->406|434->406|438->410|438->410|443->415|443->415|445->417|445->417|448->420|448->420|450->422|450->422|452->424|452->424|456->428|456->428|458->430|458->430|464->436|464->436|464->436
                    -- GENERATED --
                */
            