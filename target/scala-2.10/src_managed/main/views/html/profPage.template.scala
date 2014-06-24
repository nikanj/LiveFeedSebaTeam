
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
		
		$("#submit_button").click(function() """),format.raw/*86.40*/("""{"""),format.raw/*86.41*/("""
			$.post("/postTheQuestion", """),format.raw/*87.31*/("""{"""),format.raw/*87.32*/("""
				p_question: $("#question").val()
			"""),format.raw/*89.4*/("""}"""),format.raw/*89.5*/(""")
		"""),format.raw/*90.3*/("""}"""),format.raw/*90.4*/(""");

		$("#submit_button")
        .click(
          function() """),format.raw/*94.22*/("""{"""),format.raw/*94.23*/("""
           var question_text = $('#question')
             .val();
           displayQuestion(question_text);
           $('#question').val('');
           $("#q_area").hide();

          """),format.raw/*101.11*/("""}"""),format.raw/*101.12*/(""");

      $("#cancel_button").click(function() """),format.raw/*103.44*/("""{"""),format.raw/*103.45*/("""
       $("#q_area").hide();
      """),format.raw/*105.7*/("""}"""),format.raw/*105.8*/(""");

      $("#add").click(function() """),format.raw/*107.34*/("""{"""),format.raw/*107.35*/("""
       $("#q_area").show();
      """),format.raw/*109.7*/("""}"""),format.raw/*109.8*/(""");
	"""),format.raw/*110.2*/("""}"""),format.raw/*110.3*/(""");

	$(function() """),format.raw/*112.15*/("""{"""),format.raw/*112.16*/("""

		$(document).ready(
				function() """),format.raw/*115.16*/("""{"""),format.raw/*115.17*/("""
					Highcharts.setOptions("""),format.raw/*116.28*/("""{"""),format.raw/*116.29*/("""
						global : """),format.raw/*117.16*/("""{"""),format.raw/*117.17*/("""
							useUTC : false
						"""),format.raw/*119.7*/("""}"""),format.raw/*119.8*/("""
					"""),format.raw/*120.6*/("""}"""),format.raw/*120.7*/(""");

					var chart;
					$('#container-speed-chart').highcharts(
							"""),format.raw/*124.8*/("""{"""),format.raw/*124.9*/("""
								chart : """),format.raw/*125.17*/("""{"""),format.raw/*125.18*/("""
									type : 'spline',
									animation : Highcharts.svg, // don't animate in old IE
									marginRight : 5,
									events : """),format.raw/*129.19*/("""{"""),format.raw/*129.20*/("""
										load : function() """),format.raw/*130.29*/("""{"""),format.raw/*130.30*/("""

											// set up the updating of the chart each second
											var series = this.series[0];
											//var y = 0;

											setInterval(function() """),format.raw/*136.35*/("""{"""),format.raw/*136.36*/("""

												var x = (new Date()).getTime(); // current time
												if (speed_y == null) """),format.raw/*139.34*/("""{"""),format.raw/*139.35*/("""
													speed_y = 50; //used for initialization
												"""),format.raw/*141.13*/("""}"""),format.raw/*141.14*/("""
												series.addPoint([ x, speed_y ],
														true, true);

											"""),format.raw/*145.12*/("""}"""),format.raw/*145.13*/(""", 1000);
										"""),format.raw/*146.11*/("""}"""),format.raw/*146.12*/("""
									"""),format.raw/*147.10*/("""}"""),format.raw/*147.11*/("""
								"""),format.raw/*148.9*/("""}"""),format.raw/*148.10*/(""",
								title : """),format.raw/*149.17*/("""{"""),format.raw/*149.18*/("""
									text : 'Speed'
								"""),format.raw/*151.9*/("""}"""),format.raw/*151.10*/(""",
								xAxis : """),format.raw/*152.17*/("""{"""),format.raw/*152.18*/("""
									title : """),format.raw/*153.18*/("""{"""),format.raw/*153.19*/("""
										text : 'Time'
									"""),format.raw/*155.10*/("""}"""),format.raw/*155.11*/(""",
									type : 'datetime',
									tickPixelInterval : 150
								"""),format.raw/*158.9*/("""}"""),format.raw/*158.10*/(""",

								yAxis : """),format.raw/*160.17*/("""{"""),format.raw/*160.18*/("""
									title : """),format.raw/*161.18*/("""{"""),format.raw/*161.19*/("""
										text : 'Percentage'
									"""),format.raw/*163.10*/("""}"""),format.raw/*163.11*/(""",
									min : 0,
									max : 100,
									labels : """),format.raw/*166.19*/("""{"""),format.raw/*166.20*/("""
										formatter : function() """),format.raw/*167.34*/("""{"""),format.raw/*167.35*/("""
											if (this.value == 100) """),format.raw/*168.35*/("""{"""),format.raw/*168.36*/("""
												return 'Too Fast';
											"""),format.raw/*170.12*/("""}"""),format.raw/*170.13*/("""

											if (this.value == 50) """),format.raw/*172.34*/("""{"""),format.raw/*172.35*/("""
												return 'OK';
											"""),format.raw/*174.12*/("""}"""),format.raw/*174.13*/("""

											if (this.value == 0) """),format.raw/*176.33*/("""{"""),format.raw/*176.34*/("""
												return 'Too Slow';
											"""),format.raw/*178.12*/("""}"""),format.raw/*178.13*/("""
										"""),format.raw/*179.11*/("""}"""),format.raw/*179.12*/("""
									"""),format.raw/*180.10*/("""}"""),format.raw/*180.11*/(""",
								"""),format.raw/*181.9*/("""}"""),format.raw/*181.10*/(""",
								tooltip : """),format.raw/*182.19*/("""{"""),format.raw/*182.20*/("""
									formatter : function() """),format.raw/*183.33*/("""{"""),format.raw/*183.34*/("""
										return 'At time: '
												+ Highcharts.dateFormat(
														'%H:%M:%S', this.x)
												+ '<br/>'
												+ 'Average speed requested '
												+ Highcharts.numberFormat(
														this.speed_y, 2) + '%';
									"""),format.raw/*191.10*/("""}"""),format.raw/*191.11*/("""
								"""),format.raw/*192.9*/("""}"""),format.raw/*192.10*/(""",
								legend : """),format.raw/*193.18*/("""{"""),format.raw/*193.19*/("""
									enabled : false
								"""),format.raw/*195.9*/("""}"""),format.raw/*195.10*/(""",
								exporting : """),format.raw/*196.21*/("""{"""),format.raw/*196.22*/("""
									enabled : false
								"""),format.raw/*198.9*/("""}"""),format.raw/*198.10*/(""",
								series : [ """),format.raw/*199.20*/("""{"""),format.raw/*199.21*/("""
									name : 'Random data',
									data : (function() """),format.raw/*201.29*/("""{"""),format.raw/*201.30*/("""
										// generate an array of random data
										var data = [], time = (new Date())
												.getTime(), i;

										for (i = -19; i <= 0; i++) """),format.raw/*206.38*/("""{"""),format.raw/*206.39*/("""
											data.push("""),format.raw/*207.22*/("""{"""),format.raw/*207.23*/("""
												x : time + i * 1000,
												speed_y : 50
											"""),format.raw/*210.12*/("""}"""),format.raw/*210.13*/(""");
										"""),format.raw/*211.11*/("""}"""),format.raw/*211.12*/("""
										return data;
									"""),format.raw/*213.10*/("""}"""),format.raw/*213.11*/(""")()
								"""),format.raw/*214.9*/("""}"""),format.raw/*214.10*/(""" ]
							"""),format.raw/*215.8*/("""}"""),format.raw/*215.9*/(""");
				"""),format.raw/*216.5*/("""}"""),format.raw/*216.6*/(""");

	"""),format.raw/*218.2*/("""}"""),format.raw/*218.3*/(""");

	$(function() """),format.raw/*220.15*/("""{"""),format.raw/*220.16*/("""
		$(document).ready(
				function() """),format.raw/*222.16*/("""{"""),format.raw/*222.17*/("""
					Highcharts.setOptions("""),format.raw/*223.28*/("""{"""),format.raw/*223.29*/("""
						global : """),format.raw/*224.16*/("""{"""),format.raw/*224.17*/("""
							useUTC : false
						"""),format.raw/*226.7*/("""}"""),format.raw/*226.8*/("""
					"""),format.raw/*227.6*/("""}"""),format.raw/*227.7*/(""");

					var chart;
					$('#container-loudness-chart').highcharts(
							"""),format.raw/*231.8*/("""{"""),format.raw/*231.9*/("""
								chart : """),format.raw/*232.17*/("""{"""),format.raw/*232.18*/("""
									type : 'spline',
									animation : Highcharts.svg, // don't animate in old IE
									marginRight : 5,
									events : """),format.raw/*236.19*/("""{"""),format.raw/*236.20*/("""
										load : function() """),format.raw/*237.29*/("""{"""),format.raw/*237.30*/("""

											// set up the updating of the chart each second
											var series = this.series[0];
											//var y = 0;
											//var server_message;

											setInterval(function() """),format.raw/*244.35*/("""{"""),format.raw/*244.36*/("""

												//var connection = new WebSocket('ws://localhost:9000');  //initialize the websocket inside the "interval loop"

												var x = (new Date()).getTime(); // current time
												if (voice_y == null) """),format.raw/*249.34*/("""{"""),format.raw/*249.35*/("""
													voice_y = 50; //used for initialization
												"""),format.raw/*251.13*/("""}"""),format.raw/*251.14*/("""
												series.addPoint([ x, voice_y ],
														true, true);

											"""),format.raw/*255.12*/("""}"""),format.raw/*255.13*/(""", 1000);
										"""),format.raw/*256.11*/("""}"""),format.raw/*256.12*/("""
									"""),format.raw/*257.10*/("""}"""),format.raw/*257.11*/("""
								"""),format.raw/*258.9*/("""}"""),format.raw/*258.10*/(""",
								title : """),format.raw/*259.17*/("""{"""),format.raw/*259.18*/("""
									text : 'Loudness'
								"""),format.raw/*261.9*/("""}"""),format.raw/*261.10*/(""",
								xAxis : """),format.raw/*262.17*/("""{"""),format.raw/*262.18*/("""
									title : """),format.raw/*263.18*/("""{"""),format.raw/*263.19*/("""
										text : 'Time'
									"""),format.raw/*265.10*/("""}"""),format.raw/*265.11*/(""",
									type : 'datetime',
									tickPixelInterval : 150
								"""),format.raw/*268.9*/("""}"""),format.raw/*268.10*/(""",

								yAxis : """),format.raw/*270.17*/("""{"""),format.raw/*270.18*/("""
									title : """),format.raw/*271.18*/("""{"""),format.raw/*271.19*/("""
										text : 'Percentage'
									"""),format.raw/*273.10*/("""}"""),format.raw/*273.11*/(""",
									min : 0,
									max : 100,
									labels : """),format.raw/*276.19*/("""{"""),format.raw/*276.20*/("""
										formatter : function() """),format.raw/*277.34*/("""{"""),format.raw/*277.35*/("""
											if (this.value == 100) """),format.raw/*278.35*/("""{"""),format.raw/*278.36*/("""
												return 'Too Loud';
											"""),format.raw/*280.12*/("""}"""),format.raw/*280.13*/("""

											if (this.value == 50) """),format.raw/*282.34*/("""{"""),format.raw/*282.35*/("""
												return 'OK';
											"""),format.raw/*284.12*/("""}"""),format.raw/*284.13*/("""

											if (this.value == 0) """),format.raw/*286.33*/("""{"""),format.raw/*286.34*/("""
												return 'Too Low';
											"""),format.raw/*288.12*/("""}"""),format.raw/*288.13*/("""
										"""),format.raw/*289.11*/("""}"""),format.raw/*289.12*/("""
									"""),format.raw/*290.10*/("""}"""),format.raw/*290.11*/(""",
								"""),format.raw/*291.9*/("""}"""),format.raw/*291.10*/(""",
								tooltip : """),format.raw/*292.19*/("""{"""),format.raw/*292.20*/("""
									formatter : function() """),format.raw/*293.33*/("""{"""),format.raw/*293.34*/("""
										return 'At time: '
												+ Highcharts.dateFormat(
														'%H:%M:%S', this.x)
												+ '<br/>'
												+ 'Average loudness requested '
												+ Highcharts.numberFormat(
														this.voice_y, 2) + '%';
									"""),format.raw/*301.10*/("""}"""),format.raw/*301.11*/("""
								"""),format.raw/*302.9*/("""}"""),format.raw/*302.10*/(""",
								legend : """),format.raw/*303.18*/("""{"""),format.raw/*303.19*/("""
									enabled : false
								"""),format.raw/*305.9*/("""}"""),format.raw/*305.10*/(""",
								exporting : """),format.raw/*306.21*/("""{"""),format.raw/*306.22*/("""
									enabled : false
								"""),format.raw/*308.9*/("""}"""),format.raw/*308.10*/(""",
								series : [ """),format.raw/*309.20*/("""{"""),format.raw/*309.21*/("""
									name : 'Random data',
									data : (function() """),format.raw/*311.29*/("""{"""),format.raw/*311.30*/("""
										// generate an array of random data
										var data = [], time = (new Date())
												.getTime(), i;

										for (i = -19; i <= 0; i++) """),format.raw/*316.38*/("""{"""),format.raw/*316.39*/("""
											data.push("""),format.raw/*317.22*/("""{"""),format.raw/*317.23*/("""
												x : time + i * 1000,
												voice_y : 50
											//initialization 
											"""),format.raw/*321.12*/("""}"""),format.raw/*321.13*/(""");
										"""),format.raw/*322.11*/("""}"""),format.raw/*322.12*/("""
										return data;
									"""),format.raw/*324.10*/("""}"""),format.raw/*324.11*/(""")()
								"""),format.raw/*325.9*/("""}"""),format.raw/*325.10*/(""" ]
							"""),format.raw/*326.8*/("""}"""),format.raw/*326.9*/(""");
				"""),format.raw/*327.5*/("""}"""),format.raw/*327.6*/(""");

	"""),format.raw/*329.2*/("""}"""),format.raw/*329.3*/(""");

	$(function() """),format.raw/*331.15*/("""{"""),format.raw/*331.16*/("""

		var gaugeOptions = """),format.raw/*333.22*/("""{"""),format.raw/*333.23*/("""

			chart : """),format.raw/*335.12*/("""{"""),format.raw/*335.13*/("""
				type : 'solidgauge'
			"""),format.raw/*337.4*/("""}"""),format.raw/*337.5*/(""",

			title : null,

			pane : """),format.raw/*341.11*/("""{"""),format.raw/*341.12*/("""
				center : [ '50%', '85%' ],
				size : '140%',
				startAngle : -90,
				endAngle : 90,
				background : """),format.raw/*346.18*/("""{"""),format.raw/*346.19*/("""
					backgroundColor : (Highcharts.theme && Highcharts.theme.background2)
							|| '#EEE',
					innerRadius : '60%',
					outerRadius : '100%',
					shape : 'arc'
				"""),format.raw/*352.5*/("""}"""),format.raw/*352.6*/("""
			"""),format.raw/*353.4*/("""}"""),format.raw/*353.5*/(""",

			tooltip : """),format.raw/*355.14*/("""{"""),format.raw/*355.15*/("""
				enabled : true
			"""),format.raw/*357.4*/("""}"""),format.raw/*357.5*/(""",

			// the value axis
			yAxis : """),format.raw/*360.12*/("""{"""),format.raw/*360.13*/("""
				stops : [ [ 0.1, '#55BF3B' ], // green
				[ 0.5, '#DDDF0D' ], // yellow
				[ 0.9, '#DF5353' ] // red
				],
				lineWidth : 0,
				minorTickInterval : null,
				tickPixelInterval : 400,
				tickWidth : 0,
				title : """),format.raw/*369.13*/("""{"""),format.raw/*369.14*/("""
					y : -70
				"""),format.raw/*371.5*/("""}"""),format.raw/*371.6*/(""",
				labels : """),format.raw/*372.14*/("""{"""),format.raw/*372.15*/("""
					y : 16
				"""),format.raw/*374.5*/("""}"""),format.raw/*374.6*/("""
			"""),format.raw/*375.4*/("""}"""),format.raw/*375.5*/(""",

			plotOptions : """),format.raw/*377.18*/("""{"""),format.raw/*377.19*/("""
				solidgauge : """),format.raw/*378.18*/("""{"""),format.raw/*378.19*/("""
					dataLabels : """),format.raw/*379.19*/("""{"""),format.raw/*379.20*/("""
						y : 5,
						borderWidth : 0,
						useHTML : true
					"""),format.raw/*383.6*/("""}"""),format.raw/*383.7*/(""",
					states : """),format.raw/*384.15*/("""{"""),format.raw/*384.16*/("""
						hover : """),format.raw/*385.15*/("""{"""),format.raw/*385.16*/("""
							enabled : true
						"""),format.raw/*387.7*/("""}"""),format.raw/*387.8*/("""
					"""),format.raw/*388.6*/("""}"""),format.raw/*388.7*/("""

				"""),format.raw/*390.5*/("""}"""),format.raw/*390.6*/("""

			"""),format.raw/*392.4*/("""}"""),format.raw/*392.5*/("""
		"""),format.raw/*393.3*/("""}"""),format.raw/*393.4*/(""";

		// The speed gauge
		$('#container-speed')
				.highcharts(
						Highcharts
								.merge(
										gaugeOptions,
										"""),format.raw/*401.11*/("""{"""),format.raw/*401.12*/("""
											yAxis : """),format.raw/*402.20*/("""{"""),format.raw/*402.21*/("""
												min : 0,
												max : 100,
												title : """),format.raw/*405.21*/("""{"""),format.raw/*405.22*/("""
													text : 'Pause'
												"""),format.raw/*407.13*/("""}"""),format.raw/*407.14*/("""
											"""),format.raw/*408.12*/("""}"""),format.raw/*408.13*/(""",

											credits : """),format.raw/*410.22*/("""{"""),format.raw/*410.23*/("""
												enabled : false
											"""),format.raw/*412.12*/("""}"""),format.raw/*412.13*/(""",

											series : [ """),format.raw/*414.23*/("""{"""),format.raw/*414.24*/("""
												name : 'Pause',
												data : [ 0 ],
												dataLabels : """),format.raw/*417.26*/("""{"""),format.raw/*417.27*/("""
													format : '<div style="text-align:center"><span style="font-size:25px;color:'
															+ ((Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black')
															+ '">"""),format.raw/*420.21*/("""{"""),format.raw/*420.22*/("""y"""),format.raw/*420.23*/("""}"""),format.raw/*420.24*/("""</span><br/>'
															+ '<span style="font-size:12px;color:silver">Pause counts</span></div>'
												"""),format.raw/*422.13*/("""}"""),format.raw/*422.14*/(""",
												tooltip : """),format.raw/*423.23*/("""{"""),format.raw/*423.24*/("""
													valueSuffix : 'Number of persons voted for pause'
												"""),format.raw/*425.13*/("""}"""),format.raw/*425.14*/("""
											"""),format.raw/*426.12*/("""}"""),format.raw/*426.13*/(""" ]

										"""),format.raw/*428.11*/("""}"""),format.raw/*428.12*/("""));

		// The RPM gauge
		;
		//var newVal;
		// Bring life to the dials
		setInterval(function() """),format.raw/*434.26*/("""{"""),format.raw/*434.27*/("""

			// Speed
			var chart = $('#container-speed').highcharts();
			if (chart) """),format.raw/*438.15*/("""{"""),format.raw/*438.16*/("""
				var point = chart.series[0].points[0];
				//   inc = Math.round((Math.random() - 0.5) * 100);

				// newVal = point.y + inc;
				/*  if (newVal < 0 || newVal > 100) """),format.raw/*443.41*/("""{"""),format.raw/*443.42*/("""
				      newVal = point.y - inc;
				  """),format.raw/*445.7*/("""}"""),format.raw/*445.8*/("""*/
				console.log('pause 2: ' + newVal);
				point.update(newVal);
			"""),format.raw/*448.4*/("""}"""),format.raw/*448.5*/("""

		"""),format.raw/*450.3*/("""}"""),format.raw/*450.4*/(""", 2000);

	"""),format.raw/*452.2*/("""}"""),format.raw/*452.3*/(""");
</script>

</head>
<body>
	<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
		<img src=""""),_display_(Seq[Any](/*458.14*/routes/*458.20*/.Assets.at(" images/logo.png"))),format.raw/*458.50*/("""" height="50px"
			width="150px" alt="Live Feed">
	</div>
	<header class="navbar navbar-static-top bs-docs-nav" id="top"
		role="banner">
		<div class="btn-group" style="margin-left: 75%;">
			<a type="button" class="btn btn-default" href="/home">Home</a> 
			<a type="button" class="btn btn-default" href="/aboutus">About Us</a> 
			<a type="button" class="btn btn-default" href="/contact">Contact</a> 
			<a type="button" class="btn btn-default" href="/feedback">Feedback</a>
			<div class="well" style="margin-left: 100px; width: 200px; float: left;">"""),_display_(Seq[Any](/*468.78*/lectureNumber)),format.raw/*468.91*/("""</div>
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
                    DATE: Tue Jun 24 18:54:19 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/profPage.scala.html
                    HASH: b9b424eff461418ee65091f53f6d947dd0101824
                    MATRIX: 780->1|927->37|954->56|1104->171|1118->177|1173->211|1263->265|1278->271|1332->303|1418->353|1433->359|1509->412|1595->462|1610->468|1682->517|1738->537|1753->543|1820->588|1924->665|1952->666|2160->847|2188->848|2334->967|2362->968|2413->992|2441->993|2504->1028|2533->1029|2587->1055|2616->1056|2693->1106|2721->1107|2753->1112|2781->1113|2924->1228|2953->1229|3181->1430|3209->1431|3272->1466|3301->1467|3426->1564|3455->1565|3493->1576|3521->1577|3590->1618|3619->1619|3726->1698|3755->1699|3921->1838|3949->1839|4029->1891|4058->1892|4232->2039|4260->2040|4337->2089|4366->2090|4498->2195|4526->2196|4610->2252|4639->2253|4780->2367|4808->2368|4841->2374|4869->2375|4937->2415|4966->2416|5033->2456|5061->2457|5134->2502|5163->2503|5223->2535|5252->2536|5322->2579|5350->2580|5382->2585|5410->2586|5505->2653|5534->2654|5759->2850|5789->2851|5867->2900|5897->2901|5962->2938|5991->2939|6059->2978|6089->2979|6154->3016|6183->3017|6216->3022|6245->3023|6294->3043|6324->3044|6394->3085|6424->3086|6482->3115|6512->3116|6558->3133|6588->3134|6647->3165|6676->3166|6711->3173|6740->3174|6844->3250|6873->3251|6920->3269|6950->3270|7118->3409|7148->3410|7207->3440|7237->3441|7432->3607|7462->3608|7589->3706|7619->3707|7716->3775|7746->3776|7863->3864|7893->3865|7942->3885|7972->3886|8012->3897|8042->3898|8080->3908|8110->3909|8158->3928|8188->3929|8251->3964|8281->3965|8329->3984|8359->3985|8407->4004|8437->4005|8502->4041|8532->4042|8634->4116|8664->4117|8714->4138|8744->4139|8792->4158|8822->4159|8893->4201|8923->4202|9013->4263|9043->4264|9107->4299|9137->4300|9202->4336|9232->4337|9306->4382|9336->4383|9402->4420|9432->4421|9500->4460|9530->4461|9595->4497|9625->4498|9699->4543|9729->4544|9770->4556|9800->4557|9840->4568|9870->4569|9909->4580|9939->4581|9989->4602|10019->4603|10082->4637|10112->4638|10399->4896|10429->4897|10467->4907|10497->4908|10546->4928|10576->4929|10640->4965|10670->4966|10722->4989|10752->4990|10816->5026|10846->5027|10897->5049|10927->5050|11018->5112|11048->5113|11239->5275|11269->5276|11321->5299|11351->5300|11453->5373|11483->5374|11526->5388|11556->5389|11620->5424|11650->5425|11691->5438|11721->5439|11760->5450|11789->5451|11825->5459|11854->5460|11889->5467|11918->5468|11967->5488|11997->5489|12065->5528|12095->5529|12153->5558|12183->5559|12229->5576|12259->5577|12318->5608|12347->5609|12382->5616|12411->5617|12518->5696|12547->5697|12594->5715|12624->5716|12792->5855|12822->5856|12881->5886|12911->5887|13140->6087|13170->6088|13424->6313|13454->6314|13551->6382|13581->6383|13698->6471|13728->6472|13777->6492|13807->6493|13847->6504|13877->6505|13915->6515|13945->6516|13993->6535|14023->6536|14089->6574|14119->6575|14167->6594|14197->6595|14245->6614|14275->6615|14340->6651|14370->6652|14472->6726|14502->6727|14552->6748|14582->6749|14630->6768|14660->6769|14731->6811|14761->6812|14851->6873|14881->6874|14945->6909|14975->6910|15040->6946|15070->6947|15144->6992|15174->6993|15240->7030|15270->7031|15338->7070|15368->7071|15433->7107|15463->7108|15536->7152|15566->7153|15607->7165|15637->7166|15677->7177|15707->7178|15746->7189|15776->7190|15826->7211|15856->7212|15919->7246|15949->7247|16239->7508|16269->7509|16307->7519|16337->7520|16386->7540|16416->7541|16480->7577|16510->7578|16562->7601|16592->7602|16656->7638|16686->7639|16737->7661|16767->7662|16858->7724|16888->7725|17079->7887|17109->7888|17161->7911|17191->7912|17323->8015|17353->8016|17396->8030|17426->8031|17490->8066|17520->8067|17561->8080|17591->8081|17630->8092|17659->8093|17695->8101|17724->8102|17759->8109|17788->8110|17837->8130|17867->8131|17921->8156|17951->8157|17995->8172|18025->8173|18083->8203|18112->8204|18176->8239|18206->8240|18349->8354|18379->8355|18582->8530|18611->8531|18644->8536|18673->8537|18720->8555|18750->8556|18803->8581|18832->8582|18899->8620|18929->8621|19191->8854|19221->8855|19269->8875|19298->8876|19343->8892|19373->8893|19420->8912|19449->8913|19482->8918|19511->8919|19562->8941|19592->8942|19640->8961|19670->8962|19719->8982|19749->8983|19844->9050|19873->9051|19919->9068|19949->9069|19994->9085|20024->9086|20083->9117|20112->9118|20147->9125|20176->9126|20212->9134|20241->9135|20276->9142|20305->9143|20337->9147|20366->9148|20535->9288|20565->9289|20615->9310|20645->9311|20742->9379|20772->9380|20844->9423|20874->9424|20916->9437|20946->9438|21001->9464|21031->9465|21102->9507|21132->9508|21188->9535|21218->9536|21330->9619|21360->9620|21590->9821|21620->9822|21650->9823|21680->9824|21824->9939|21854->9940|21908->9965|21938->9966|22045->10044|22075->10045|22117->10058|22147->10059|22192->10075|22222->10076|22355->10180|22385->10181|22497->10264|22527->10265|22733->10442|22763->10443|22834->10486|22863->10487|22965->10561|22994->10562|23028->10568|23057->10569|23098->10582|23127->10583|23285->10704|23301->10710|23354->10740|23956->11305|23992->11318
                    LINES: 26->1|30->1|30->2|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|42->14|42->14|42->14|46->18|46->18|50->22|50->22|54->26|54->26|56->28|56->28|58->30|58->30|59->31|59->31|62->34|62->34|63->35|63->35|71->43|71->43|77->49|77->49|79->51|79->51|83->55|83->55|85->57|85->57|87->59|87->59|90->62|90->62|94->66|94->66|94->66|94->66|98->70|98->70|98->70|98->70|101->73|101->73|102->74|102->74|106->78|106->78|108->80|108->80|110->82|110->82|112->84|112->84|114->86|114->86|115->87|115->87|117->89|117->89|118->90|118->90|122->94|122->94|129->101|129->101|131->103|131->103|133->105|133->105|135->107|135->107|137->109|137->109|138->110|138->110|140->112|140->112|143->115|143->115|144->116|144->116|145->117|145->117|147->119|147->119|148->120|148->120|152->124|152->124|153->125|153->125|157->129|157->129|158->130|158->130|164->136|164->136|167->139|167->139|169->141|169->141|173->145|173->145|174->146|174->146|175->147|175->147|176->148|176->148|177->149|177->149|179->151|179->151|180->152|180->152|181->153|181->153|183->155|183->155|186->158|186->158|188->160|188->160|189->161|189->161|191->163|191->163|194->166|194->166|195->167|195->167|196->168|196->168|198->170|198->170|200->172|200->172|202->174|202->174|204->176|204->176|206->178|206->178|207->179|207->179|208->180|208->180|209->181|209->181|210->182|210->182|211->183|211->183|219->191|219->191|220->192|220->192|221->193|221->193|223->195|223->195|224->196|224->196|226->198|226->198|227->199|227->199|229->201|229->201|234->206|234->206|235->207|235->207|238->210|238->210|239->211|239->211|241->213|241->213|242->214|242->214|243->215|243->215|244->216|244->216|246->218|246->218|248->220|248->220|250->222|250->222|251->223|251->223|252->224|252->224|254->226|254->226|255->227|255->227|259->231|259->231|260->232|260->232|264->236|264->236|265->237|265->237|272->244|272->244|277->249|277->249|279->251|279->251|283->255|283->255|284->256|284->256|285->257|285->257|286->258|286->258|287->259|287->259|289->261|289->261|290->262|290->262|291->263|291->263|293->265|293->265|296->268|296->268|298->270|298->270|299->271|299->271|301->273|301->273|304->276|304->276|305->277|305->277|306->278|306->278|308->280|308->280|310->282|310->282|312->284|312->284|314->286|314->286|316->288|316->288|317->289|317->289|318->290|318->290|319->291|319->291|320->292|320->292|321->293|321->293|329->301|329->301|330->302|330->302|331->303|331->303|333->305|333->305|334->306|334->306|336->308|336->308|337->309|337->309|339->311|339->311|344->316|344->316|345->317|345->317|349->321|349->321|350->322|350->322|352->324|352->324|353->325|353->325|354->326|354->326|355->327|355->327|357->329|357->329|359->331|359->331|361->333|361->333|363->335|363->335|365->337|365->337|369->341|369->341|374->346|374->346|380->352|380->352|381->353|381->353|383->355|383->355|385->357|385->357|388->360|388->360|397->369|397->369|399->371|399->371|400->372|400->372|402->374|402->374|403->375|403->375|405->377|405->377|406->378|406->378|407->379|407->379|411->383|411->383|412->384|412->384|413->385|413->385|415->387|415->387|416->388|416->388|418->390|418->390|420->392|420->392|421->393|421->393|429->401|429->401|430->402|430->402|433->405|433->405|435->407|435->407|436->408|436->408|438->410|438->410|440->412|440->412|442->414|442->414|445->417|445->417|448->420|448->420|448->420|448->420|450->422|450->422|451->423|451->423|453->425|453->425|454->426|454->426|456->428|456->428|462->434|462->434|466->438|466->438|471->443|471->443|473->445|473->445|476->448|476->448|478->450|478->450|480->452|480->452|486->458|486->458|486->458|496->468|496->468
                    -- GENERATED --
                */
            