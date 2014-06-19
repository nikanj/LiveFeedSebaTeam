
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

$(document).ready(function() """),format.raw/*21.30*/("""{"""),format.raw/*21.31*/("""

var connection = new WebSocket('ws://localhost:9000');

connection.onopen = function() """),format.raw/*25.32*/("""{"""),format.raw/*25.33*/("""
//
"""),format.raw/*27.1*/("""}"""),format.raw/*27.2*/("""

connection.onmessage = function(e) """),format.raw/*29.36*/("""{"""),format.raw/*29.37*/("""
server_message = e.data;

if (server_message.indexOf("speed_") > -1) """),format.raw/*32.44*/("""{"""),format.raw/*32.45*/("""
server_message = server_message.replace("speed_", "");
speed_y = Number(server_message);
console.log('speed y: ' + y);
"""),format.raw/*36.1*/("""}"""),format.raw/*36.2*/(""" else if (server_message.indexOf("loudness_") > -1) """),format.raw/*36.54*/("""{"""),format.raw/*36.55*/("""
server_message = server_message.replace("loudness_", "");
voice_y = Number(server_message);
console.log('Loud y: ' + voice_y);
"""),format.raw/*40.1*/("""}"""),format.raw/*40.2*/(""" else if (server_message.indexOf("pause_") > -1) """),format.raw/*40.51*/("""{"""),format.raw/*40.52*/("""
server_message = server_message.replace("pause_", "");
newVal = parseInt(server_message);
"""),format.raw/*43.1*/("""}"""),format.raw/*43.2*/("""

"""),format.raw/*45.1*/("""}"""),format.raw/*45.2*/(""";

connection.onclose = function(e) """),format.raw/*47.34*/("""{"""),format.raw/*47.35*/("""
alert("CONNECTION IS CLOSED~");
"""),format.raw/*49.1*/("""}"""),format.raw/*49.2*/("""

$("#submit").click(function() """),format.raw/*51.31*/("""{"""),format.raw/*51.32*/("""
$.post("/postQuestion", """),format.raw/*52.25*/("""{"""),format.raw/*52.26*/("""
question : $("#question").val()
"""),format.raw/*54.1*/("""}"""),format.raw/*54.2*/(""").done(function() """),format.raw/*54.20*/("""{"""),format.raw/*54.21*/("""
alert("Success");
"""),format.raw/*56.1*/("""}"""),format.raw/*56.2*/(""")
"""),format.raw/*57.1*/("""}"""),format.raw/*57.2*/(""");

$("#cancel").click(function() """),format.raw/*59.31*/("""{"""),format.raw/*59.32*/("""
$("#q_area").hide();
"""),format.raw/*61.1*/("""}"""),format.raw/*61.2*/(""");

$("#add").click(function() """),format.raw/*63.28*/("""{"""),format.raw/*63.29*/("""
$("#q_area").show();
"""),format.raw/*65.1*/("""}"""),format.raw/*65.2*/(""");
"""),format.raw/*66.1*/("""}"""),format.raw/*66.2*/(""");

$(function() """),format.raw/*68.14*/("""{"""),format.raw/*68.15*/("""

$(document).ready(
function() """),format.raw/*71.12*/("""{"""),format.raw/*71.13*/("""
Highcharts.setOptions("""),format.raw/*72.23*/("""{"""),format.raw/*72.24*/("""
global : """),format.raw/*73.10*/("""{"""),format.raw/*73.11*/("""
useUTC : false
"""),format.raw/*75.1*/("""}"""),format.raw/*75.2*/("""
"""),format.raw/*76.1*/("""}"""),format.raw/*76.2*/(""");

var chart;
$('#container-speed-chart').highcharts(
"""),format.raw/*80.1*/("""{"""),format.raw/*80.2*/("""
chart : """),format.raw/*81.9*/("""{"""),format.raw/*81.10*/("""
type : 'spline',
animation : Highcharts.svg, // don't animate in old IE
marginRight : 5,
events : """),format.raw/*85.10*/("""{"""),format.raw/*85.11*/("""
load : function() """),format.raw/*86.19*/("""{"""),format.raw/*86.20*/("""

// set up the updating of the chart each second
var series = this.series[0];
//var y = 0;

setInterval(function() """),format.raw/*92.24*/("""{"""),format.raw/*92.25*/("""

var x = (new Date()).getTime(); // current time
if (speed_y == null) """),format.raw/*95.22*/("""{"""),format.raw/*95.23*/("""
speed_y = 50; //used for initialization
"""),format.raw/*97.1*/("""}"""),format.raw/*97.2*/("""
series.addPoint([ x, speed_y ],
true, true);

"""),format.raw/*101.1*/("""}"""),format.raw/*101.2*/(""", 1000);
"""),format.raw/*102.1*/("""}"""),format.raw/*102.2*/("""
"""),format.raw/*103.1*/("""}"""),format.raw/*103.2*/("""
"""),format.raw/*104.1*/("""}"""),format.raw/*104.2*/(""",
title : """),format.raw/*105.9*/("""{"""),format.raw/*105.10*/("""
text : 'Speed'
"""),format.raw/*107.1*/("""}"""),format.raw/*107.2*/(""",
xAxis : """),format.raw/*108.9*/("""{"""),format.raw/*108.10*/("""
title : """),format.raw/*109.9*/("""{"""),format.raw/*109.10*/("""
text : 'Time'
"""),format.raw/*111.1*/("""}"""),format.raw/*111.2*/(""",
type : 'datetime',
tickPixelInterval : 150
"""),format.raw/*114.1*/("""}"""),format.raw/*114.2*/(""",

yAxis : """),format.raw/*116.9*/("""{"""),format.raw/*116.10*/("""
title : """),format.raw/*117.9*/("""{"""),format.raw/*117.10*/("""
text : 'Percentage'
"""),format.raw/*119.1*/("""}"""),format.raw/*119.2*/(""",
min : 0,
max : 100,
labels : """),format.raw/*122.10*/("""{"""),format.raw/*122.11*/("""
formatter : function() """),format.raw/*123.24*/("""{"""),format.raw/*123.25*/("""
if (this.value == 100) """),format.raw/*124.24*/("""{"""),format.raw/*124.25*/("""
return 'Too Fast';
"""),format.raw/*126.1*/("""}"""),format.raw/*126.2*/("""

if (this.value == 50) """),format.raw/*128.23*/("""{"""),format.raw/*128.24*/("""
return 'OK';
"""),format.raw/*130.1*/("""}"""),format.raw/*130.2*/("""

if (this.value == 0) """),format.raw/*132.22*/("""{"""),format.raw/*132.23*/("""
return 'Too Slow';
"""),format.raw/*134.1*/("""}"""),format.raw/*134.2*/("""
"""),format.raw/*135.1*/("""}"""),format.raw/*135.2*/("""
"""),format.raw/*136.1*/("""}"""),format.raw/*136.2*/(""",
"""),format.raw/*137.1*/("""}"""),format.raw/*137.2*/(""",
tooltip : """),format.raw/*138.11*/("""{"""),format.raw/*138.12*/("""
formatter : function() """),format.raw/*139.24*/("""{"""),format.raw/*139.25*/("""
return 'At time: '
+ Highcharts.dateFormat(
'%H:%M:%S', this.x)
+ '<br/>'
+ 'Average speed requested '
+ Highcharts.numberFormat(
this.speed_y, 2) + '%';
"""),format.raw/*147.1*/("""}"""),format.raw/*147.2*/("""
"""),format.raw/*148.1*/("""}"""),format.raw/*148.2*/(""",
legend : """),format.raw/*149.10*/("""{"""),format.raw/*149.11*/("""
enabled : false
"""),format.raw/*151.1*/("""}"""),format.raw/*151.2*/(""",
exporting : """),format.raw/*152.13*/("""{"""),format.raw/*152.14*/("""
enabled : false
"""),format.raw/*154.1*/("""}"""),format.raw/*154.2*/(""",
series : [ """),format.raw/*155.12*/("""{"""),format.raw/*155.13*/("""
name : 'Random data',
data : (function() """),format.raw/*157.20*/("""{"""),format.raw/*157.21*/("""
// generate an array of random data
var data = [], time = (new Date())
.getTime(), i;

for (i = -5; i <= 0; i++) """),format.raw/*162.27*/("""{"""),format.raw/*162.28*/("""
data.push("""),format.raw/*163.11*/("""{"""),format.raw/*163.12*/("""
x : time + i * 1000,
speed_y : 50
"""),format.raw/*166.1*/("""}"""),format.raw/*166.2*/(""");
"""),format.raw/*167.1*/("""}"""),format.raw/*167.2*/("""
return data;
"""),format.raw/*169.1*/("""}"""),format.raw/*169.2*/(""")()
"""),format.raw/*170.1*/("""}"""),format.raw/*170.2*/(""" ]
"""),format.raw/*171.1*/("""}"""),format.raw/*171.2*/(""");
"""),format.raw/*172.1*/("""}"""),format.raw/*172.2*/(""");

"""),format.raw/*174.1*/("""}"""),format.raw/*174.2*/(""");

$(function() """),format.raw/*176.14*/("""{"""),format.raw/*176.15*/("""
$(document).ready(
function() """),format.raw/*178.12*/("""{"""),format.raw/*178.13*/("""
Highcharts.setOptions("""),format.raw/*179.23*/("""{"""),format.raw/*179.24*/("""
global : """),format.raw/*180.10*/("""{"""),format.raw/*180.11*/("""
useUTC : false
"""),format.raw/*182.1*/("""}"""),format.raw/*182.2*/("""
"""),format.raw/*183.1*/("""}"""),format.raw/*183.2*/(""");

var chart;
$('#container-loudness-chart').highcharts(
"""),format.raw/*187.1*/("""{"""),format.raw/*187.2*/("""
chart : """),format.raw/*188.9*/("""{"""),format.raw/*188.10*/("""
type : 'spline',
animation : Highcharts.svg, // don't animate in old IE
marginRight : 5,
events : """),format.raw/*192.10*/("""{"""),format.raw/*192.11*/("""
load : function() """),format.raw/*193.19*/("""{"""),format.raw/*193.20*/("""

// set up the updating of the chart each second
var series = this.series[0];
//var y = 0;
//var server_message;

setInterval(function() """),format.raw/*200.24*/("""{"""),format.raw/*200.25*/("""

//var connection = new WebSocket('ws://localhost:9000');  //initialize the websocket inside the "interval loop"

var x = (new Date()).getTime(); // current time
if (voice_y == null) """),format.raw/*205.22*/("""{"""),format.raw/*205.23*/("""
voice_y = 50; //used for initialization
"""),format.raw/*207.1*/("""}"""),format.raw/*207.2*/("""
series.addPoint([ x, voice_y ],
true, true);

"""),format.raw/*211.1*/("""}"""),format.raw/*211.2*/(""", 1000);
"""),format.raw/*212.1*/("""}"""),format.raw/*212.2*/("""
"""),format.raw/*213.1*/("""}"""),format.raw/*213.2*/("""
"""),format.raw/*214.1*/("""}"""),format.raw/*214.2*/(""",
title : """),format.raw/*215.9*/("""{"""),format.raw/*215.10*/("""
text : 'Loudness'
"""),format.raw/*217.1*/("""}"""),format.raw/*217.2*/(""",
xAxis : """),format.raw/*218.9*/("""{"""),format.raw/*218.10*/("""
title : """),format.raw/*219.9*/("""{"""),format.raw/*219.10*/("""
text : 'Time'
"""),format.raw/*221.1*/("""}"""),format.raw/*221.2*/(""",
type : 'datetime',
tickPixelInterval : 150
"""),format.raw/*224.1*/("""}"""),format.raw/*224.2*/(""",

yAxis : """),format.raw/*226.9*/("""{"""),format.raw/*226.10*/("""
title : """),format.raw/*227.9*/("""{"""),format.raw/*227.10*/("""
text : 'Percentage'
"""),format.raw/*229.1*/("""}"""),format.raw/*229.2*/(""",
min : 0,
max : 100,
labels : """),format.raw/*232.10*/("""{"""),format.raw/*232.11*/("""
formatter : function() """),format.raw/*233.24*/("""{"""),format.raw/*233.25*/("""
if (this.value == 100) """),format.raw/*234.24*/("""{"""),format.raw/*234.25*/("""
return 'Too Loud';
"""),format.raw/*236.1*/("""}"""),format.raw/*236.2*/("""

if (this.value == 50) """),format.raw/*238.23*/("""{"""),format.raw/*238.24*/("""
return 'OK';
"""),format.raw/*240.1*/("""}"""),format.raw/*240.2*/("""

if (this.value == 0) """),format.raw/*242.22*/("""{"""),format.raw/*242.23*/("""
return 'Too Low';
"""),format.raw/*244.1*/("""}"""),format.raw/*244.2*/("""
"""),format.raw/*245.1*/("""}"""),format.raw/*245.2*/("""
"""),format.raw/*246.1*/("""}"""),format.raw/*246.2*/(""",
"""),format.raw/*247.1*/("""}"""),format.raw/*247.2*/(""",
tooltip : """),format.raw/*248.11*/("""{"""),format.raw/*248.12*/("""
formatter : function() """),format.raw/*249.24*/("""{"""),format.raw/*249.25*/("""
return 'At time: '
+ Highcharts.dateFormat(
'%H:%M:%S', this.x)
+ '<br/>'
+ 'Average loudness requested '
+ Highcharts.numberFormat(
this.voice_y, 2) + '%';
"""),format.raw/*257.1*/("""}"""),format.raw/*257.2*/("""
"""),format.raw/*258.1*/("""}"""),format.raw/*258.2*/(""",
legend : """),format.raw/*259.10*/("""{"""),format.raw/*259.11*/("""
enabled : false
"""),format.raw/*261.1*/("""}"""),format.raw/*261.2*/(""",
exporting : """),format.raw/*262.13*/("""{"""),format.raw/*262.14*/("""
enabled : false
"""),format.raw/*264.1*/("""}"""),format.raw/*264.2*/(""",
series : [ """),format.raw/*265.12*/("""{"""),format.raw/*265.13*/("""
name : 'Random data',
data : (function() """),format.raw/*267.20*/("""{"""),format.raw/*267.21*/("""
// generate an array of random data
var data = [], time = (new Date())
.getTime(), i;

for (i = -5; i <= 0; i++) """),format.raw/*272.27*/("""{"""),format.raw/*272.28*/("""
data.push("""),format.raw/*273.11*/("""{"""),format.raw/*273.12*/("""
x : time + i * 1000,
voice_y : 50
//initialization 
"""),format.raw/*277.1*/("""}"""),format.raw/*277.2*/(""");
"""),format.raw/*278.1*/("""}"""),format.raw/*278.2*/("""
return data;
"""),format.raw/*280.1*/("""}"""),format.raw/*280.2*/(""")()
"""),format.raw/*281.1*/("""}"""),format.raw/*281.2*/(""" ]
"""),format.raw/*282.1*/("""}"""),format.raw/*282.2*/(""");
"""),format.raw/*283.1*/("""}"""),format.raw/*283.2*/(""");

"""),format.raw/*285.1*/("""}"""),format.raw/*285.2*/(""");

$(function() """),format.raw/*287.14*/("""{"""),format.raw/*287.15*/("""

var gaugeOptions = """),format.raw/*289.20*/("""{"""),format.raw/*289.21*/("""

chart : """),format.raw/*291.9*/("""{"""),format.raw/*291.10*/("""
type : 'solidgauge'
"""),format.raw/*293.1*/("""}"""),format.raw/*293.2*/(""",

title : null,

pane : """),format.raw/*297.8*/("""{"""),format.raw/*297.9*/("""
center : [ '50%', '85%' ],
size : '140%',
startAngle : -90,
endAngle : 90,
background : """),format.raw/*302.14*/("""{"""),format.raw/*302.15*/("""
backgroundColor : (Highcharts.theme && Highcharts.theme.background2)
|| '#EEE',
innerRadius : '60%',
outerRadius : '100%',
shape : 'arc'
"""),format.raw/*308.1*/("""}"""),format.raw/*308.2*/("""
"""),format.raw/*309.1*/("""}"""),format.raw/*309.2*/(""",

tooltip : """),format.raw/*311.11*/("""{"""),format.raw/*311.12*/("""
enabled : true
"""),format.raw/*313.1*/("""}"""),format.raw/*313.2*/(""",

// the value axis
yAxis : """),format.raw/*316.9*/("""{"""),format.raw/*316.10*/("""
stops : [ [ 0.1, '#55BF3B' ], // green
[ 0.5, '#DDDF0D' ], // yellow
[ 0.9, '#DF5353' ] // red
],
lineWidth : 0,
minorTickInterval : null,
tickPixelInterval : 400,
tickWidth : 0,
title : """),format.raw/*325.9*/("""{"""),format.raw/*325.10*/("""
y : -70
"""),format.raw/*327.1*/("""}"""),format.raw/*327.2*/(""",
labels : """),format.raw/*328.10*/("""{"""),format.raw/*328.11*/("""
y : 16
"""),format.raw/*330.1*/("""}"""),format.raw/*330.2*/("""
"""),format.raw/*331.1*/("""}"""),format.raw/*331.2*/(""",

plotOptions : """),format.raw/*333.15*/("""{"""),format.raw/*333.16*/("""
solidgauge : """),format.raw/*334.14*/("""{"""),format.raw/*334.15*/("""
dataLabels : """),format.raw/*335.14*/("""{"""),format.raw/*335.15*/("""
y : 5,
borderWidth : 0,
useHTML : true
"""),format.raw/*339.1*/("""}"""),format.raw/*339.2*/(""",
states : """),format.raw/*340.10*/("""{"""),format.raw/*340.11*/("""
hover : """),format.raw/*341.9*/("""{"""),format.raw/*341.10*/("""
enabled : true
"""),format.raw/*343.1*/("""}"""),format.raw/*343.2*/("""
"""),format.raw/*344.1*/("""}"""),format.raw/*344.2*/("""

"""),format.raw/*346.1*/("""}"""),format.raw/*346.2*/("""

"""),format.raw/*348.1*/("""}"""),format.raw/*348.2*/("""
"""),format.raw/*349.1*/("""}"""),format.raw/*349.2*/(""";

// The speed gauge
$('#container-speed')
.highcharts(
Highcharts
.merge(
gaugeOptions,
"""),format.raw/*357.1*/("""{"""),format.raw/*357.2*/("""
yAxis : """),format.raw/*358.9*/("""{"""),format.raw/*358.10*/("""
min : 0,
max : 100,
title : """),format.raw/*361.9*/("""{"""),format.raw/*361.10*/("""
text : 'Pause'
"""),format.raw/*363.1*/("""}"""),format.raw/*363.2*/("""
"""),format.raw/*364.1*/("""}"""),format.raw/*364.2*/(""",

credits : """),format.raw/*366.11*/("""{"""),format.raw/*366.12*/("""
enabled : false
"""),format.raw/*368.1*/("""}"""),format.raw/*368.2*/(""",

series : [ """),format.raw/*370.12*/("""{"""),format.raw/*370.13*/("""
name : 'Pause',
data : [ 0 ],
dataLabels : """),format.raw/*373.14*/("""{"""),format.raw/*373.15*/("""
format : '<div style="text-align:center"><span style="font-size:25px;color:'
+ ((Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black')
+ '">"""),format.raw/*376.6*/("""{"""),format.raw/*376.7*/("""y"""),format.raw/*376.8*/("""}"""),format.raw/*376.9*/("""</span><br/>'
+ '<span style="font-size:12px;color:silver">Pause counts</span></div>'
"""),format.raw/*378.1*/("""}"""),format.raw/*378.2*/(""",
tooltip : """),format.raw/*379.11*/("""{"""),format.raw/*379.12*/("""
valueSuffix : 'Number of persons voted for pause'
"""),format.raw/*381.1*/("""}"""),format.raw/*381.2*/("""
"""),format.raw/*382.1*/("""}"""),format.raw/*382.2*/(""" ]

"""),format.raw/*384.1*/("""}"""),format.raw/*384.2*/("""));

// The RPM gauge
;
//var newVal;
// Bring life to the dials
setInterval(function() """),format.raw/*390.24*/("""{"""),format.raw/*390.25*/("""

// Speed
var chart = $('#container-speed').highcharts();
if (chart) """),format.raw/*394.12*/("""{"""),format.raw/*394.13*/("""
var point = chart.series[0].points[0];
//   inc = Math.round((Math.random() - 0.5) * 100);

// newVal = point.y + inc;
/*  if (newVal < 0 || newVal > 100) """),format.raw/*399.37*/("""{"""),format.raw/*399.38*/("""
     newVal = point.y - inc;
 """),format.raw/*401.2*/("""}"""),format.raw/*401.3*/("""*/
console.log('pause 2: ' + newVal);
point.update(newVal);
"""),format.raw/*404.1*/("""}"""),format.raw/*404.2*/("""

"""),format.raw/*406.1*/("""}"""),format.raw/*406.2*/(""", 2000);

"""),format.raw/*408.1*/("""}"""),format.raw/*408.2*/(""");
</script>

<script>
//	$(function () """),format.raw/*412.18*/("""{"""),format.raw/*412.19*/("""
//	$('#container-questions').
//"""),format.raw/*414.3*/("""}"""),format.raw/*414.4*/(""");
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
                    DATE: Thu Jun 19 13:13:54 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/profPage.scala.html
                    HASH: 7f6e6b42421f5981ebe3ad3f88887b363cfde836
                    MATRIX: 775->1|900->15|927->34|1077->149|1091->155|1146->189|1236->243|1251->249|1305->281|1391->331|1406->337|1482->390|1568->440|1583->446|1655->495|1711->515|1726->521|1793->566|1960->705|1989->706|2110->799|2139->800|2172->806|2200->807|2267->846|2296->847|2397->920|2426->921|2577->1045|2605->1046|2685->1098|2714->1099|2873->1231|2901->1232|2978->1281|3007->1282|3128->1376|3156->1377|3187->1381|3215->1382|3281->1420|3310->1421|3372->1456|3400->1457|3462->1491|3491->1492|3545->1518|3574->1519|3636->1554|3664->1555|3710->1573|3739->1574|3787->1595|3815->1596|3845->1599|3873->1600|3937->1636|3966->1637|4017->1661|4045->1662|4106->1695|4135->1696|4186->1720|4214->1721|4245->1725|4273->1726|4320->1745|4349->1746|4412->1781|4441->1782|4493->1806|4522->1807|4561->1818|4590->1819|4635->1837|4663->1838|4692->1840|4720->1841|4806->1900|4834->1901|4871->1911|4900->1912|5031->2015|5060->2016|5108->2036|5137->2037|5287->2159|5316->2160|5418->2234|5447->2235|5517->2278|5545->2279|5624->2330|5653->2331|5691->2341|5720->2342|5750->2344|5779->2345|5809->2347|5838->2348|5877->2359|5907->2360|5953->2378|5982->2379|6021->2390|6051->2391|6089->2401|6119->2402|6164->2419|6193->2420|6269->2468|6298->2469|6339->2482|6369->2483|6407->2493|6437->2494|6488->2517|6517->2518|6580->2552|6610->2553|6664->2578|6694->2579|6748->2604|6778->2605|6828->2627|6857->2628|6912->2654|6942->2655|6986->2671|7015->2672|7069->2697|7099->2698|7149->2720|7178->2721|7208->2723|7237->2724|7267->2726|7296->2727|7327->2730|7356->2731|7398->2744|7428->2745|7482->2770|7512->2771|7703->2934|7732->2935|7762->2937|7791->2938|7832->2950|7862->2951|7909->2970|7938->2971|7982->2986|8012->2987|8059->3006|8088->3007|8131->3021|8161->3022|8234->3066|8264->3067|8412->3186|8442->3187|8483->3199|8513->3200|8579->3238|8608->3239|8640->3243|8669->3244|8713->3260|8742->3261|8775->3266|8804->3267|8836->3271|8865->3272|8897->3276|8926->3277|8960->3283|8989->3284|9037->3303|9067->3304|9129->3337|9159->3338|9212->3362|9242->3363|9282->3374|9312->3375|9358->3393|9387->3394|9417->3396|9446->3397|9536->3459|9565->3460|9603->3470|9633->3471|9765->3574|9795->3575|9844->3595|9874->3596|10048->3741|10078->3742|10296->3931|10326->3932|10397->3975|10426->3976|10505->4027|10534->4028|10572->4038|10601->4039|10631->4041|10660->4042|10690->4044|10719->4045|10758->4056|10788->4057|10837->4078|10866->4079|10905->4090|10935->4091|10973->4101|11003->4102|11048->4119|11077->4120|11153->4168|11182->4169|11223->4182|11253->4183|11291->4193|11321->4194|11372->4217|11401->4218|11464->4252|11494->4253|11548->4278|11578->4279|11632->4304|11662->4305|11712->4327|11741->4328|11796->4354|11826->4355|11870->4371|11899->4372|11953->4397|11983->4398|12032->4419|12061->4420|12091->4422|12120->4423|12150->4425|12179->4426|12210->4429|12239->4430|12281->4443|12311->4444|12365->4469|12395->4470|12589->4636|12618->4637|12648->4639|12677->4640|12718->4652|12748->4653|12795->4672|12824->4673|12868->4688|12898->4689|12945->4708|12974->4709|13017->4723|13047->4724|13120->4768|13150->4769|13298->4888|13328->4889|13369->4901|13399->4902|13484->4959|13513->4960|13545->4964|13574->4965|13618->4981|13647->4982|13680->4987|13709->4988|13741->4992|13770->4993|13802->4997|13831->4998|13865->5004|13894->5005|13942->5024|13972->5025|14024->5048|14054->5049|14094->5061|14124->5062|14175->5085|14204->5086|14261->5115|14290->5116|14413->5210|14443->5211|14615->5355|14644->5356|14674->5358|14703->5359|14747->5374|14777->5375|14823->5393|14852->5394|14912->5426|14942->5427|15167->5624|15197->5625|15236->5636|15265->5637|15306->5649|15336->5650|15374->5660|15403->5661|15433->5663|15462->5664|15510->5683|15540->5684|15584->5699|15614->5700|15658->5715|15688->5716|15760->5760|15789->5761|15830->5773|15860->5774|15898->5784|15928->5785|15974->5803|16003->5804|16033->5806|16062->5807|16094->5811|16123->5812|16155->5816|16184->5817|16214->5819|16243->5820|16369->5918|16398->5919|16436->5929|16466->5930|16526->5962|16556->5963|16602->5981|16631->5982|16661->5984|16690->5985|16734->6000|16764->6001|16811->6020|16840->6021|16885->6037|16915->6038|16991->6085|17021->6086|17207->6244|17236->6245|17265->6246|17294->6247|17410->6335|17439->6336|17481->6349|17511->6350|17592->6403|17621->6404|17651->6406|17680->6407|17714->6413|17743->6414|17866->6508|17896->6509|17999->6583|18029->6584|18219->6745|18249->6746|18310->6779|18339->6780|18430->6843|18459->6844|18491->6848|18520->6849|18560->6861|18589->6862|18662->6906|18692->6907|18755->6942|18784->6943|18944->7066|18960->7072|19012->7101
                    LINES: 26->1|30->1|30->2|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|42->14|42->14|42->14|49->21|49->21|53->25|53->25|55->27|55->27|57->29|57->29|60->32|60->32|64->36|64->36|64->36|64->36|68->40|68->40|68->40|68->40|71->43|71->43|73->45|73->45|75->47|75->47|77->49|77->49|79->51|79->51|80->52|80->52|82->54|82->54|82->54|82->54|84->56|84->56|85->57|85->57|87->59|87->59|89->61|89->61|91->63|91->63|93->65|93->65|94->66|94->66|96->68|96->68|99->71|99->71|100->72|100->72|101->73|101->73|103->75|103->75|104->76|104->76|108->80|108->80|109->81|109->81|113->85|113->85|114->86|114->86|120->92|120->92|123->95|123->95|125->97|125->97|129->101|129->101|130->102|130->102|131->103|131->103|132->104|132->104|133->105|133->105|135->107|135->107|136->108|136->108|137->109|137->109|139->111|139->111|142->114|142->114|144->116|144->116|145->117|145->117|147->119|147->119|150->122|150->122|151->123|151->123|152->124|152->124|154->126|154->126|156->128|156->128|158->130|158->130|160->132|160->132|162->134|162->134|163->135|163->135|164->136|164->136|165->137|165->137|166->138|166->138|167->139|167->139|175->147|175->147|176->148|176->148|177->149|177->149|179->151|179->151|180->152|180->152|182->154|182->154|183->155|183->155|185->157|185->157|190->162|190->162|191->163|191->163|194->166|194->166|195->167|195->167|197->169|197->169|198->170|198->170|199->171|199->171|200->172|200->172|202->174|202->174|204->176|204->176|206->178|206->178|207->179|207->179|208->180|208->180|210->182|210->182|211->183|211->183|215->187|215->187|216->188|216->188|220->192|220->192|221->193|221->193|228->200|228->200|233->205|233->205|235->207|235->207|239->211|239->211|240->212|240->212|241->213|241->213|242->214|242->214|243->215|243->215|245->217|245->217|246->218|246->218|247->219|247->219|249->221|249->221|252->224|252->224|254->226|254->226|255->227|255->227|257->229|257->229|260->232|260->232|261->233|261->233|262->234|262->234|264->236|264->236|266->238|266->238|268->240|268->240|270->242|270->242|272->244|272->244|273->245|273->245|274->246|274->246|275->247|275->247|276->248|276->248|277->249|277->249|285->257|285->257|286->258|286->258|287->259|287->259|289->261|289->261|290->262|290->262|292->264|292->264|293->265|293->265|295->267|295->267|300->272|300->272|301->273|301->273|305->277|305->277|306->278|306->278|308->280|308->280|309->281|309->281|310->282|310->282|311->283|311->283|313->285|313->285|315->287|315->287|317->289|317->289|319->291|319->291|321->293|321->293|325->297|325->297|330->302|330->302|336->308|336->308|337->309|337->309|339->311|339->311|341->313|341->313|344->316|344->316|353->325|353->325|355->327|355->327|356->328|356->328|358->330|358->330|359->331|359->331|361->333|361->333|362->334|362->334|363->335|363->335|367->339|367->339|368->340|368->340|369->341|369->341|371->343|371->343|372->344|372->344|374->346|374->346|376->348|376->348|377->349|377->349|385->357|385->357|386->358|386->358|389->361|389->361|391->363|391->363|392->364|392->364|394->366|394->366|396->368|396->368|398->370|398->370|401->373|401->373|404->376|404->376|404->376|404->376|406->378|406->378|407->379|407->379|409->381|409->381|410->382|410->382|412->384|412->384|418->390|418->390|422->394|422->394|427->399|427->399|429->401|429->401|432->404|432->404|434->406|434->406|436->408|436->408|440->412|440->412|442->414|442->414|448->420|448->420|448->420
                    -- GENERATED --
                */
            