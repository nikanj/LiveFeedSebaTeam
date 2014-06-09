
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


Seq[Any](format.raw/*1.16*/("""
"""),format.raw/*3.1*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>Professor Page</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/main.css"))),format.raw/*10.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png"))),format.raw/*11.97*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*12.55*/routes/*12.61*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*12.114*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*13.55*/routes/*13.61*/.Assets.at("stylesheets/bootstrap/css/table.css"))),format.raw/*13.110*/("""">

        <script src=""""),_display_(Seq[Any](/*15.23*/routes/*15.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*15.74*/("""" type="text/javascript"></script>
        
        
        
       <!-- OLD CHART <script>
                
        var j = 10;
        $(function () """),format.raw/*22.23*/("""{"""),format.raw/*22.24*/("""
            $(document).ready(function() """),format.raw/*23.42*/("""{"""),format.raw/*23.43*/("""
                Highcharts.setOptions("""),format.raw/*24.39*/("""{"""),format.raw/*24.40*/("""
                    global: """),format.raw/*25.29*/("""{"""),format.raw/*25.30*/("""
                        useUTC: false
                    """),format.raw/*27.21*/("""}"""),format.raw/*27.22*/("""
                """),format.raw/*28.17*/("""}"""),format.raw/*28.18*/(""");
            
                
                var chart;
    
                $('#container').highcharts("""),format.raw/*33.44*/("""{"""),format.raw/*33.45*/("""
                    chart: """),format.raw/*34.28*/("""{"""),format.raw/*34.29*/("""
                        type: 'spline',
                        animation: Highcharts.svg, // don't animate in old IE
                        marginRight: 10,
                        events: """),format.raw/*38.33*/("""{"""),format.raw/*38.34*/("""
                            load: function() """),format.raw/*39.46*/("""{"""),format.raw/*39.47*/("""
       
                            	var vote;
                                // set up the updating of the chart each second
                                var series = this.series[0];

                                var connection = new WebSocket('ws://localhost:9000', ['soap', 'xmpp']);
                             // When the connection is open, send some data to the server
                                connection.onopen = function (e) """),format.raw/*47.66*/("""{"""),format.raw/*47.67*/("""
  									console.log('DEBUG: CONNECTION IS OPENED');
                                """),format.raw/*49.33*/("""}"""),format.raw/*49.34*/(""";

                                connection.onclose = function (e) """),format.raw/*51.67*/("""{"""),format.raw/*51.68*/("""
                                	console.log('DEBUG: CONNECTION IS CLOSED');
                                """),format.raw/*53.33*/("""}"""),format.raw/*53.34*/("""
                                
                                // Log errors
                                connection.onerror = function (error) """),format.raw/*56.71*/("""{"""),format.raw/*56.72*/("""
                                  console.log('WebSocket Error ' + error);
                                """),format.raw/*58.33*/("""}"""),format.raw/*58.34*/(""";

                                // Log messages from the server
                                connection.onreceive = function (e) """),format.raw/*61.69*/("""{"""),format.raw/*61.70*/("""
                                  console.log('Server: ' + e.data);
                                  connection.send(e.data); 
                                  vote = parseFloat(e.data);
                                """),format.raw/*65.33*/("""}"""),format.raw/*65.34*/(""";
                                
                                // Log messages from the server
                                connection.onmessage = function (e) """),format.raw/*68.69*/("""{"""),format.raw/*68.70*/("""
                                  console.log('Server: ' + e.data);
                                  connection.send(e.data); 
                                  vote = parseFloat(e.data);
                                """),format.raw/*72.33*/("""}"""),format.raw/*72.34*/(""";
                                
								var y = 0;
                                setInterval(function() """),format.raw/*75.56*/("""{"""),format.raw/*75.57*/("""
                                    var x = (new Date()).getTime(); // current time
                                    //var y =	vote;
                                    y = vote;
                                    series.addPoint([x, y], true, true);
                                """),format.raw/*80.33*/("""}"""),format.raw/*80.34*/(""", 1000);
                            """),format.raw/*81.29*/("""}"""),format.raw/*81.30*/("""
                        """),format.raw/*82.25*/("""}"""),format.raw/*82.26*/("""
                    """),format.raw/*83.21*/("""}"""),format.raw/*83.22*/(""",
                    
                    title: """),format.raw/*85.28*/("""{"""),format.raw/*85.29*/("""
                        text: 'Live random data'
                    """),format.raw/*87.21*/("""}"""),format.raw/*87.22*/(""",
                    xAxis: """),format.raw/*88.28*/("""{"""),format.raw/*88.29*/("""
                        type: 'datetime',
                        tickPixelInterval: 150
                    """),format.raw/*91.21*/("""}"""),format.raw/*91.22*/(""",
                    yAxis: """),format.raw/*92.28*/("""{"""),format.raw/*92.29*/("""
                        title: """),format.raw/*93.32*/("""{"""),format.raw/*93.33*/("""
                            text: 'Value'
                        """),format.raw/*95.25*/("""}"""),format.raw/*95.26*/(""",
                        plotLines: ["""),format.raw/*96.37*/("""{"""),format.raw/*96.38*/("""
                            value: 0,
                            width: 1,
                            color: '#808080'
                        """),format.raw/*100.25*/("""}"""),format.raw/*100.26*/("""]
                    """),format.raw/*101.21*/("""}"""),format.raw/*101.22*/(""",
                    tooltip: """),format.raw/*102.30*/("""{"""),format.raw/*102.31*/("""
                        formatter: function() """),format.raw/*103.47*/("""{"""),format.raw/*103.48*/("""
                                return '<b>'+ this.series.name +'</b><br/>'+
                                Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x) +'<br/>'+
                                Highcharts.numberFormat(this.y, 2);
                        """),format.raw/*107.25*/("""}"""),format.raw/*107.26*/("""
                    """),format.raw/*108.21*/("""}"""),format.raw/*108.22*/(""",
                    legend: """),format.raw/*109.29*/("""{"""),format.raw/*109.30*/("""
                        enabled: false
                    """),format.raw/*111.21*/("""}"""),format.raw/*111.22*/(""",
                    exporting: """),format.raw/*112.32*/("""{"""),format.raw/*112.33*/("""
                        enabled: false
                    """),format.raw/*114.21*/("""}"""),format.raw/*114.22*/(""",
                    series: ["""),format.raw/*115.30*/("""{"""),format.raw/*115.31*/("""
                        name: 'Random data',
                        data: (function() """),format.raw/*117.43*/("""{"""),format.raw/*117.44*/("""
                            // generate an array of random data
                            var data = [],
                                time = (new Date()).getTime(),
                                i;
            
                            for (i = -19; i <= 0; i++) """),format.raw/*123.56*/("""{"""),format.raw/*123.57*/("""
                                data.push("""),format.raw/*124.43*/("""{"""),format.raw/*124.44*/("""
                                    x: time + i * 1000,
                                    y: Math.random()
                                """),format.raw/*127.33*/("""}"""),format.raw/*127.34*/(""");
                            """),format.raw/*128.29*/("""}"""),format.raw/*128.30*/("""
                            return data;
                        """),format.raw/*130.25*/("""}"""),format.raw/*130.26*/(""")()
                    """),format.raw/*131.21*/("""}"""),format.raw/*131.22*/("""]
                """),format.raw/*132.17*/("""}"""),format.raw/*132.18*/(""");
            """),format.raw/*133.13*/("""}"""),format.raw/*133.14*/(""");
            
        """),format.raw/*135.9*/("""}"""),format.raw/*135.10*/(""");
		</script> -->
		
		<script>
		$(function () """),format.raw/*139.17*/("""{"""),format.raw/*139.18*/("""
			
		    $(document).ready(function() """),format.raw/*141.36*/("""{"""),format.raw/*141.37*/("""
		        Highcharts.setOptions("""),format.raw/*142.33*/("""{"""),format.raw/*142.34*/("""
		            global: """),format.raw/*143.23*/("""{"""),format.raw/*143.24*/("""
		                useUTC: false
		            """),format.raw/*145.15*/("""}"""),format.raw/*145.16*/("""
		        """),format.raw/*146.11*/("""}"""),format.raw/*146.12*/(""");
		    
		        var chart;
		        $('#container-speed-chart').highcharts("""),format.raw/*149.50*/("""{"""),format.raw/*149.51*/("""
		            chart: """),format.raw/*150.22*/("""{"""),format.raw/*150.23*/("""
		                type: 'spline',
		                animation: Highcharts.svg, // don't animate in old IE
		                marginRight: 5,
		                events: """),format.raw/*154.27*/("""{"""),format.raw/*154.28*/("""
		                    load: function() """),format.raw/*155.40*/("""{"""),format.raw/*155.41*/("""
		    
		                        // set up the updating of the chart each second
		                        var series = this.series[0];
		            			var y = 0;
		            			var server_message;
		                        		            			
		                        setInterval(function() """),format.raw/*162.50*/("""{"""),format.raw/*162.51*/("""

			            			var connection = new WebSocket('ws://localhost:9000');  //initialize the websocket inside the "interval loop"
			            					                        
			            			connection.onopen = function()"""),format.raw/*166.49*/("""{"""),format.raw/*166.50*/("""
			            				   /*Send a small message to the console once the connection is established */
			            				   //alert('Connection open!');
			            				"""),format.raw/*169.20*/("""}"""),format.raw/*169.21*/("""

			            			
			            			var receiveEvent = function(e) """),format.raw/*172.50*/("""{"""),format.raw/*172.51*/("""
			            				   server_message = e.data;
			            				   server_message = server_message.replace("speed_","");
			            				  // alert(server_message);
			            				   y = parseInt(server_message);
			            			"""),format.raw/*177.19*/("""}"""),format.raw/*177.20*/("""

			            			connection.onmessage = receiveEvent;		            			
			            			
			            			connection.onclose = function(e) """),format.raw/*181.52*/("""{"""),format.raw/*181.53*/("""
			            				alert("CONNECTION IS CLOSED~");
			            			"""),format.raw/*183.19*/("""}"""),format.raw/*183.20*/("""

		                        	var x = (new Date()).getTime(); // current time
		                        	if(!y) """),format.raw/*186.35*/("""{"""),format.raw/*186.36*/("""
		                        		y = 50;		//used for initialization
		                        	"""),format.raw/*188.28*/("""}"""),format.raw/*188.29*/("""
		                            series.addPoint([x, y], true, true);
//									alert('DEBUG GET MESSAGE --> ' + y);
		                        """),format.raw/*191.27*/("""}"""),format.raw/*191.28*/(""", 2000);
		                    """),format.raw/*192.23*/("""}"""),format.raw/*192.24*/("""
		                """),format.raw/*193.19*/("""}"""),format.raw/*193.20*/("""
		            """),format.raw/*194.15*/("""}"""),format.raw/*194.16*/(""",
		            title: """),format.raw/*195.22*/("""{"""),format.raw/*195.23*/("""
		                text: 'Speed'
		            """),format.raw/*197.15*/("""}"""),format.raw/*197.16*/(""",
		            xAxis: """),format.raw/*198.22*/("""{"""),format.raw/*198.23*/("""
		                title: """),format.raw/*199.26*/("""{"""),format.raw/*199.27*/("""
		                    text: 'Time'
		                """),format.raw/*201.19*/("""}"""),format.raw/*201.20*/(""",
		                type: 'datetime',
		                tickPixelInterval: 150
		            """),format.raw/*204.15*/("""}"""),format.raw/*204.16*/(""",
		            
		            yAxis: """),format.raw/*206.22*/("""{"""),format.raw/*206.23*/("""
		                title: """),format.raw/*207.26*/("""{"""),format.raw/*207.27*/("""
		                    text: 'Percentage'
		                """),format.raw/*209.19*/("""}"""),format.raw/*209.20*/(""",
		                min: 0,
		                max: 100,
		                 labels: """),format.raw/*212.28*/("""{"""),format.raw/*212.29*/("""
		                    formatter: function() """),format.raw/*213.45*/("""{"""),format.raw/*213.46*/("""
		                        if (this.value == 100) """),format.raw/*214.50*/("""{"""),format.raw/*214.51*/("""
		                            return 'Too Fast';
		                        """),format.raw/*216.27*/("""}"""),format.raw/*216.28*/("""
		                        
		                        if (this.value == 50) """),format.raw/*218.49*/("""{"""),format.raw/*218.50*/("""
		                            return 'OK';
		                        """),format.raw/*220.27*/("""}"""),format.raw/*220.28*/("""
		                        
		                        
		                        if (this.value == 0) """),format.raw/*223.48*/("""{"""),format.raw/*223.49*/("""
		                            return 'Too Slow';
		                        """),format.raw/*225.27*/("""}"""),format.raw/*225.28*/("""
		                    """),format.raw/*226.23*/("""}"""),format.raw/*226.24*/("""
		                """),format.raw/*227.19*/("""}"""),format.raw/*227.20*/(""",
		            """),format.raw/*228.15*/("""}"""),format.raw/*228.16*/(""",
		            tooltip: """),format.raw/*229.24*/("""{"""),format.raw/*229.25*/("""
		                formatter: function() """),format.raw/*230.41*/("""{"""),format.raw/*230.42*/("""
		                        return 'At time: ' + Highcharts.dateFormat('%H:%M:%S', this.x) +'<br/>' + 'Average speed requested ' + Highcharts.numberFormat(this.y, 2) + '%';
		                """),format.raw/*232.19*/("""}"""),format.raw/*232.20*/("""
		            """),format.raw/*233.15*/("""}"""),format.raw/*233.16*/(""",
		            legend: """),format.raw/*234.23*/("""{"""),format.raw/*234.24*/("""
		                enabled: false
		            """),format.raw/*236.15*/("""}"""),format.raw/*236.16*/(""",
		            exporting: """),format.raw/*237.26*/("""{"""),format.raw/*237.27*/("""
		                enabled: false
		            """),format.raw/*239.15*/("""}"""),format.raw/*239.16*/(""",
		            series: ["""),format.raw/*240.24*/("""{"""),format.raw/*240.25*/("""
		                name: 'Random data',
		                data: (function() """),format.raw/*242.37*/("""{"""),format.raw/*242.38*/("""
		                    // generate an array of random data
		                    var data = [],
		                        time = (new Date()).getTime(),
		                        i;
		    
		                    for (i = -5; i <= 0; i++) """),format.raw/*248.49*/("""{"""),format.raw/*248.50*/("""
		                        data.push("""),format.raw/*249.37*/("""{"""),format.raw/*249.38*/("""
		                            x: time + i * 1000,
		                            y: 50
		                        """),format.raw/*252.27*/("""}"""),format.raw/*252.28*/(""");
		                    """),format.raw/*253.23*/("""}"""),format.raw/*253.24*/("""
		                    return data;
		                """),format.raw/*255.19*/("""}"""),format.raw/*255.20*/(""")()
		            """),format.raw/*256.15*/("""}"""),format.raw/*256.16*/("""]
		        """),format.raw/*257.11*/("""}"""),format.raw/*257.12*/(""");
		    """),format.raw/*258.7*/("""}"""),format.raw/*258.8*/(""");
		    
		"""),format.raw/*260.3*/("""}"""),format.raw/*260.4*/(""");
    	</script>
    
    
		<script>
		$(function () """),format.raw/*265.17*/("""{"""),format.raw/*265.18*/("""
		    $(document).ready(function() """),format.raw/*266.36*/("""{"""),format.raw/*266.37*/("""
		        Highcharts.setOptions("""),format.raw/*267.33*/("""{"""),format.raw/*267.34*/("""
		            global: """),format.raw/*268.23*/("""{"""),format.raw/*268.24*/("""
		                useUTC: false
		            """),format.raw/*270.15*/("""}"""),format.raw/*270.16*/("""
		        """),format.raw/*271.11*/("""}"""),format.raw/*271.12*/(""");
		    
		        var chart;
		        $('#container-loudness-chart').highcharts("""),format.raw/*274.53*/("""{"""),format.raw/*274.54*/("""
		            chart: """),format.raw/*275.22*/("""{"""),format.raw/*275.23*/("""
		                type: 'spline',
		                animation: Highcharts.svg, // don't animate in old IE
		                marginRight: 5,
		                events: """),format.raw/*279.27*/("""{"""),format.raw/*279.28*/("""
		                    load: function() """),format.raw/*280.40*/("""{"""),format.raw/*280.41*/("""
		            		    
		                        // set up the updating of the chart each second
		                        var series = this.series[0];
		            			var y = 0;
		            			var server_message;
		                        		            			
		                        setInterval(function() """),format.raw/*287.50*/("""{"""),format.raw/*287.51*/("""

			            			var connection = new WebSocket('ws://localhost:9000');  //initialize the websocket inside the "interval loop"
			            					                        
			            			connection.onopen = function()"""),format.raw/*291.49*/("""{"""),format.raw/*291.50*/("""
			            				   /*Send a small message to the console once the connection is established */
			            				   //alert('Connection open!');
			            				"""),format.raw/*294.20*/("""}"""),format.raw/*294.21*/("""

			            			
			            			var receiveEvent = function(e) """),format.raw/*297.50*/("""{"""),format.raw/*297.51*/("""
			            				   server_message = e.data;
			            				   server_message = server_message.replace("loudness_","");
			            				//   alert(server_message);
			            				   y = parseInt(server_message);
			            			"""),format.raw/*302.19*/("""}"""),format.raw/*302.20*/("""

			            			connection.onmessage = receiveEvent;		            			
			            			
			            			connection.onclose = function(e) """),format.raw/*306.52*/("""{"""),format.raw/*306.53*/("""
			            				alert("CONNECTION IS CLOSED~");
			            			"""),format.raw/*308.19*/("""}"""),format.raw/*308.20*/("""

		                        	var x = (new Date()).getTime(); // current time
		                        	if(!y) """),format.raw/*311.35*/("""{"""),format.raw/*311.36*/("""
		                        		y = 50;		//used for initialization
		                        	"""),format.raw/*313.28*/("""}"""),format.raw/*313.29*/("""
		                            series.addPoint([x, y], true, true);
//									alert('DEBUG GET MESSAGE --> ' + y);
		                        """),format.raw/*316.27*/("""}"""),format.raw/*316.28*/(""", 2000);
		                    """),format.raw/*317.23*/("""}"""),format.raw/*317.24*/("""
		                """),format.raw/*318.19*/("""}"""),format.raw/*318.20*/("""
		            """),format.raw/*319.15*/("""}"""),format.raw/*319.16*/(""",
		            title: """),format.raw/*320.22*/("""{"""),format.raw/*320.23*/("""
		                text: 'Loudness'
		            """),format.raw/*322.15*/("""}"""),format.raw/*322.16*/(""",
		            xAxis: """),format.raw/*323.22*/("""{"""),format.raw/*323.23*/("""
		                title: """),format.raw/*324.26*/("""{"""),format.raw/*324.27*/("""
		                    text: 'Time'
		                """),format.raw/*326.19*/("""}"""),format.raw/*326.20*/(""",
		                type: 'datetime',
		                tickPixelInterval: 150
		            """),format.raw/*329.15*/("""}"""),format.raw/*329.16*/(""",
		            
		            yAxis: """),format.raw/*331.22*/("""{"""),format.raw/*331.23*/("""
		                title: """),format.raw/*332.26*/("""{"""),format.raw/*332.27*/("""
		                    text: 'Percentage'
		                """),format.raw/*334.19*/("""}"""),format.raw/*334.20*/(""",
		                min: 0,
		                max: 100,
		                 labels: """),format.raw/*337.28*/("""{"""),format.raw/*337.29*/("""
		                    formatter: function() """),format.raw/*338.45*/("""{"""),format.raw/*338.46*/("""
		                        if (this.value == 100) """),format.raw/*339.50*/("""{"""),format.raw/*339.51*/("""
		                            return 'Too Loud';
		                        """),format.raw/*341.27*/("""}"""),format.raw/*341.28*/("""
		                        
		                        if (this.value == 50) """),format.raw/*343.49*/("""{"""),format.raw/*343.50*/("""
		                            return 'OK';
		                        """),format.raw/*345.27*/("""}"""),format.raw/*345.28*/("""
		                        
		                        
		                        if (this.value == 0) """),format.raw/*348.48*/("""{"""),format.raw/*348.49*/("""
		                            return 'Too Quiet';
		                        """),format.raw/*350.27*/("""}"""),format.raw/*350.28*/("""
		                    """),format.raw/*351.23*/("""}"""),format.raw/*351.24*/("""
		                """),format.raw/*352.19*/("""}"""),format.raw/*352.20*/(""",
		            """),format.raw/*353.15*/("""}"""),format.raw/*353.16*/(""",
		            tooltip: """),format.raw/*354.24*/("""{"""),format.raw/*354.25*/("""
		                formatter: function() """),format.raw/*355.41*/("""{"""),format.raw/*355.42*/("""
		                        return 'At time: ' + Highcharts.dateFormat('%H:%M:%S', this.x) +'<br/>' + 'Average loudness requested ' + Highcharts.numberFormat(this.y, 2) + '%';
		                """),format.raw/*357.19*/("""}"""),format.raw/*357.20*/("""
		            """),format.raw/*358.15*/("""}"""),format.raw/*358.16*/(""",
		            legend: """),format.raw/*359.23*/("""{"""),format.raw/*359.24*/("""
		                enabled: false
		            """),format.raw/*361.15*/("""}"""),format.raw/*361.16*/(""",
		            exporting: """),format.raw/*362.26*/("""{"""),format.raw/*362.27*/("""
		                enabled: false
		            """),format.raw/*364.15*/("""}"""),format.raw/*364.16*/(""",
		            series: ["""),format.raw/*365.24*/("""{"""),format.raw/*365.25*/("""
		                name: 'Random data',
		                data: (function() """),format.raw/*367.37*/("""{"""),format.raw/*367.38*/("""
		                    // generate an array of random data
		                    var data = [],
		                        time = (new Date()).getTime(),
		                        i;
		    
		                    for (i = -5; i <= 0; i++) """),format.raw/*373.49*/("""{"""),format.raw/*373.50*/("""
		                        data.push("""),format.raw/*374.37*/("""{"""),format.raw/*374.38*/("""
		                            x: time + i * 1000,
		                            y: 50 //initialization 
		                        """),format.raw/*377.27*/("""}"""),format.raw/*377.28*/(""");
		                    """),format.raw/*378.23*/("""}"""),format.raw/*378.24*/("""
		                    return data;
		                """),format.raw/*380.19*/("""}"""),format.raw/*380.20*/(""")()
		            """),format.raw/*381.15*/("""}"""),format.raw/*381.16*/("""]
		        """),format.raw/*382.11*/("""}"""),format.raw/*382.12*/(""");
		    """),format.raw/*383.7*/("""}"""),format.raw/*383.8*/(""");
		    
		"""),format.raw/*385.3*/("""}"""),format.raw/*385.4*/(""");
    	</script>
    
    	<script>
    	$(function () """),format.raw/*389.20*/("""{"""),format.raw/*389.21*/("""
    		
    	    var gaugeOptions = """),format.raw/*391.29*/("""{"""),format.raw/*391.30*/("""
    		
    		    chart: """),format.raw/*393.18*/("""{"""),format.raw/*393.19*/("""
    		        type: 'solidgauge'
    		    """),format.raw/*395.11*/("""}"""),format.raw/*395.12*/(""",
    		    
    		    title: null,
    		    
    		    pane: """),format.raw/*399.17*/("""{"""),format.raw/*399.18*/("""
    		    	center: ['50%', '85%'],
    		    	size: '140%',
    		        startAngle: -90,
    		        endAngle: 90,
    	            background: """),format.raw/*404.30*/("""{"""),format.raw/*404.31*/("""
    	                backgroundColor: (Highcharts.theme && Highcharts.theme.background2) || '#EEE',
    	                innerRadius: '60%',
    	                outerRadius: '100%',
    	                shape: 'arc'
    	            """),format.raw/*409.18*/("""}"""),format.raw/*409.19*/("""
    		    """),format.raw/*410.11*/("""}"""),format.raw/*410.12*/(""",

    		    tooltip: """),format.raw/*412.20*/("""{"""),format.raw/*412.21*/("""
    		    	enabled: false
    		    """),format.raw/*414.11*/("""}"""),format.raw/*414.12*/(""",
    		       
    		    // the value axis
    		    yAxis: """),format.raw/*417.18*/("""{"""),format.raw/*417.19*/("""
    				stops: [
    					[0.1, '#55BF3B'], // green
    		        	[0.5, '#DDDF0D'], // yellow
    		        	[0.9, '#DF5353'] // red
    				],
    				lineWidth: 0,
    	            minorTickInterval: null,
    	            tickPixelInterval: 400,
    	            tickWidth: 0,
    		        title: """),format.raw/*427.22*/("""{"""),format.raw/*427.23*/("""
    	                y: -70
    		        """),format.raw/*429.15*/("""}"""),format.raw/*429.16*/(""",
    	            labels: """),format.raw/*430.26*/("""{"""),format.raw/*430.27*/("""
    	                y: 16
    	            """),format.raw/*432.18*/("""}"""),format.raw/*432.19*/("""        
    		    """),format.raw/*433.11*/("""}"""),format.raw/*433.12*/(""",
    	        
    	        plotOptions: """),format.raw/*435.27*/("""{"""),format.raw/*435.28*/("""
    	            solidgauge: """),format.raw/*436.30*/("""{"""),format.raw/*436.31*/("""
    	                dataLabels: """),format.raw/*437.34*/("""{"""),format.raw/*437.35*/("""
    	                    y: 5,
    	                    borderWidth: 0,
    	                    useHTML: true
    	                """),format.raw/*441.22*/("""}"""),format.raw/*441.23*/(""",
    	                states: """),format.raw/*442.30*/("""{"""),format.raw/*442.31*/("""
                            hover: """),format.raw/*443.36*/("""{"""),format.raw/*443.37*/("""
                                enabled: true
                            """),format.raw/*445.29*/("""}"""),format.raw/*445.30*/("""
                        """),format.raw/*446.25*/("""}"""),format.raw/*446.26*/("""
    	                
    	            """),format.raw/*448.18*/("""}"""),format.raw/*448.19*/("""
    		    
    		    
    	        """),format.raw/*451.14*/("""}"""),format.raw/*451.15*/("""
    	    """),format.raw/*452.10*/("""}"""),format.raw/*452.11*/(""";
    	    
    	    // The speed gauge
    	    $('#container-speed').highcharts(Highcharts.merge(gaugeOptions, """),format.raw/*455.74*/("""{"""),format.raw/*455.75*/("""
    	        yAxis: """),format.raw/*456.21*/("""{"""),format.raw/*456.22*/("""
    		        min: 0,
    		        max: 100,
    		        title: """),format.raw/*459.22*/("""{"""),format.raw/*459.23*/("""
    		            text: 'Pause'
    		        """),format.raw/*461.15*/("""}"""),format.raw/*461.16*/("""       
    		    """),format.raw/*462.11*/("""}"""),format.raw/*462.12*/(""",

    		    credits: """),format.raw/*464.20*/("""{"""),format.raw/*464.21*/("""
    		    	enabled: false
    		    """),format.raw/*466.11*/("""}"""),format.raw/*466.12*/(""",
    		
    		    series: ["""),format.raw/*468.20*/("""{"""),format.raw/*468.21*/("""
    		        name: 'Pause',
    		        data: [80],
    		        dataLabels: """),format.raw/*471.27*/("""{"""),format.raw/*471.28*/("""
    		        	format: '<div style="text-align:center"><span style="font-size:25px;color:' + 
    	                    ((Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black') + '">"""),format.raw/*473.101*/("""{"""),format.raw/*473.102*/("""y"""),format.raw/*473.103*/("""}"""),format.raw/*473.104*/("""</span><br/>' + 
    	                   	'<span style="font-size:12px;color:silver">Pause counts</span></div>'
    		        """),format.raw/*475.15*/("""}"""),format.raw/*475.16*/(""",
    		        tooltip: """),format.raw/*476.24*/("""{"""),format.raw/*476.25*/("""
    		            valueSuffix: 'Number of persons voted for pause'
    		        """),format.raw/*478.15*/("""}"""),format.raw/*478.16*/("""
    		    """),format.raw/*479.11*/("""}"""),format.raw/*479.12*/("""]
    		
    		"""),format.raw/*481.7*/("""}"""),format.raw/*481.8*/("""));
    	    
    	    // The RPM gauge
    	    ;
    	                               
    	    // Bring life to the dials
    	    setInterval(function () """),format.raw/*487.34*/("""{"""),format.raw/*487.35*/("""
    	    	// Speed
    	        var chart = $('#container-speed').highcharts();
    	        if (chart) """),format.raw/*490.25*/("""{"""),format.raw/*490.26*/("""
    	            var point = chart.series[0].points[0],
    	                newVal,
    	                inc = Math.round((Math.random() - 0.5) * 100);
    	            
    	            newVal = point.y + inc;
    	            if (newVal < 0 || newVal > 100) """),format.raw/*496.50*/("""{"""),format.raw/*496.51*/("""
    	                newVal = point.y - inc;
    	            """),format.raw/*498.18*/("""}"""),format.raw/*498.19*/("""
    	            
    	            point.update(newVal);
    	        """),format.raw/*501.14*/("""}"""),format.raw/*501.15*/("""

    	    """),format.raw/*503.10*/("""}"""),format.raw/*503.11*/(""", 2000);  
    	    
    		
    	"""),format.raw/*506.6*/("""}"""),format.raw/*506.7*/(""");
    	</script>
		
    </head>
    <body>

<table>
	<thead>
	<tr>
		<th width=50% height=50%>
			<script src="http://code.highcharts.com/highcharts.js"></script>
			<script src="http://code.highcharts.com/modules/exporting.js"></script>
			<div id="container-speed-chart"></div>
		</th>
		<th width=50%>
			<script src="http://code.highcharts.com/highcharts.js"></script>
			<script src="http://code.highcharts.com/modules/exporting.js"></script>
			<div id="container-loudness-chart"></div>			
		</th>
	</tr>
	</thead>
	<tbody height=20%>
	<tr>
		<td width=50% height="50%">
<!--  			<div id="votes" align="center">
				<p>VOTE SPEED</p>
					<form action="">
						<input type="radio" name="vote" value="toofast">Too fast<br>
						<input type="radio" name="vote" value="normal">Normal<br>
						<input type="radio" name="vote" value="tooslow">Too slow<br>
						<input type="submit" value="Submit">
					</form>
			</div> -->
		</td>
		<td width="50%">
			<div id="pause_gauge" align="center">
				<script src="http://code.highcharts.com/highcharts.js"></script>
				<script src="http://code.highcharts.com/highcharts-more.js"></script>
				
				<script src="http://code.highcharts.com/modules/solid-gauge.src.js"></script>
				
				<div style="width: 600px; height: 400px; margin: 0 auto">
					<div id="container-speed" style="width: 300px; height: 200px; float: left"></div>
					<div id="container-rpm" style="width: 300px; height: 200px; float: left"></div>
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
                    DATE: Mon Jun 09 23:21:09 CEST 2014
                    SOURCE: /home/aalfath/git/LiveFeedSebaTeam/app/views/profPage.scala.html
                    HASH: a857fdba81b489fdfdf10707cbd74b543a1b90d5
                    MATRIX: 775->1|899->15|926->33|1090->161|1105->167|1161->201|1258->262|1273->268|1327->300|1420->357|1435->363|1511->416|1604->473|1619->479|1691->528|1753->554|1768->560|1835->605|2015->757|2044->758|2114->800|2143->801|2210->840|2239->841|2296->870|2325->871|2412->930|2441->931|2486->948|2515->949|2651->1057|2680->1058|2736->1086|2765->1087|2985->1279|3014->1280|3088->1326|3117->1327|3595->1777|3624->1778|3740->1866|3769->1867|3866->1936|3895->1937|4033->2047|4062->2048|4240->2198|4269->2199|4405->2307|4434->2308|4597->2443|4626->2444|4876->2666|4905->2667|5100->2834|5129->2835|5379->3057|5408->3058|5545->3167|5574->3168|5890->3456|5919->3457|5984->3494|6013->3495|6066->3520|6095->3521|6144->3542|6173->3543|6251->3593|6280->3594|6378->3664|6407->3665|6464->3694|6493->3695|6631->3805|6660->3806|6717->3835|6746->3836|6806->3868|6835->3869|6930->3936|6959->3937|7025->3975|7054->3976|7229->4122|7259->4123|7310->4145|7340->4146|7400->4177|7430->4178|7506->4225|7536->4226|7828->4489|7858->4490|7908->4511|7938->4512|7997->4542|8027->4543|8116->4603|8146->4604|8208->4637|8238->4638|8327->4698|8357->4699|8417->4730|8447->4731|8564->4819|8594->4820|8897->5094|8927->5095|8999->5138|9029->5139|9200->5281|9230->5282|9290->5313|9320->5314|9415->5380|9445->5381|9498->5405|9528->5406|9575->5424|9605->5425|9649->5440|9679->5441|9731->5465|9761->5466|9839->5515|9869->5516|9938->5556|9968->5557|10030->5590|10060->5591|10112->5614|10142->5615|10218->5662|10248->5663|10288->5674|10318->5675|10427->5755|10457->5756|10508->5778|10538->5779|10734->5946|10764->5947|10833->5987|10863->5988|11187->6283|11217->6284|11469->6507|11499->6508|11697->6677|11727->6678|11826->6748|11856->6749|12126->6990|12156->6991|12329->7135|12359->7136|12458->7206|12488->7207|12628->7318|12658->7319|12778->7410|12808->7411|12979->7553|13009->7554|13069->7585|13099->7586|13147->7605|13177->7606|13221->7621|13251->7622|13303->7645|13333->7646|13409->7693|13439->7694|13491->7717|13521->7718|13576->7744|13606->7745|13689->7799|13719->7800|13841->7893|13871->7894|13938->7932|13968->7933|14023->7959|14053->7960|14142->8020|14172->8021|14284->8104|14314->8105|14388->8150|14418->8151|14497->8201|14527->8202|14632->8278|14662->8279|14767->8355|14797->8356|14896->8426|14926->8427|15057->8529|15087->8530|15192->8606|15222->8607|15274->8630|15304->8631|15352->8650|15382->8651|15427->8667|15457->8668|15511->8693|15541->8694|15611->8735|15641->8736|15860->8926|15890->8927|15934->8942|15964->8943|16017->8967|16047->8968|16124->9016|16154->9017|16210->9044|16240->9045|16317->9093|16347->9094|16401->9119|16431->9120|16536->9196|16566->9197|16832->9434|16862->9435|16928->9472|16958->9473|17100->9586|17130->9587|17184->9612|17214->9613|17297->9667|17327->9668|17374->9686|17404->9687|17445->9699|17475->9700|17512->9709|17541->9710|17581->9722|17610->9723|17694->9778|17724->9779|17789->9815|17819->9816|17881->9849|17911->9850|17963->9873|17993->9874|18069->9921|18099->9922|18139->9933|18169->9934|18281->10017|18311->10018|18362->10040|18392->10041|18588->10208|18618->10209|18687->10249|18717->10250|19055->10559|19085->10560|19337->10783|19367->10784|19565->10953|19595->10954|19694->11024|19724->11025|19997->11269|20027->11270|20200->11414|20230->11415|20329->11485|20359->11486|20499->11597|20529->11598|20649->11689|20679->11690|20850->11832|20880->11833|20940->11864|20970->11865|21018->11884|21048->11885|21092->11900|21122->11901|21174->11924|21204->11925|21283->11975|21313->11976|21365->11999|21395->12000|21450->12026|21480->12027|21563->12081|21593->12082|21715->12175|21745->12176|21812->12214|21842->12215|21897->12241|21927->12242|22016->12302|22046->12303|22158->12386|22188->12387|22262->12432|22292->12433|22371->12483|22401->12484|22506->12560|22536->12561|22641->12637|22671->12638|22770->12708|22800->12709|22931->12811|22961->12812|23067->12889|23097->12890|23149->12913|23179->12914|23227->12933|23257->12934|23302->12950|23332->12951|23386->12976|23416->12977|23486->13018|23516->13019|23738->13212|23768->13213|23812->13228|23842->13229|23895->13253|23925->13254|24002->13302|24032->13303|24088->13330|24118->13331|24195->13379|24225->13380|24279->13405|24309->13406|24414->13482|24444->13483|24710->13720|24740->13721|24806->13758|24836->13759|24996->13890|25026->13891|25080->13916|25110->13917|25193->13971|25223->13972|25270->13990|25300->13991|25341->14003|25371->14004|25408->14013|25437->14014|25477->14026|25506->14027|25591->14083|25621->14084|25686->14120|25716->14121|25770->14146|25800->14147|25873->14191|25903->14192|25995->14255|26025->14256|26203->14405|26233->14406|26497->14641|26527->14642|26567->14653|26597->14654|26648->14676|26678->14677|26744->14714|26774->14715|26864->14776|26894->14777|27227->15081|27257->15082|27329->15125|27359->15126|27415->15153|27445->15154|27519->15199|27549->15200|27597->15219|27627->15220|27698->15262|27728->15263|27787->15293|27817->15294|27880->15328|27910->15329|28072->15462|28102->15463|28162->15494|28192->15495|28257->15531|28287->15532|28391->15607|28421->15608|28475->15633|28505->15634|28574->15674|28604->15675|28669->15711|28699->15712|28738->15722|28768->15723|28910->15836|28940->15837|28990->15858|29020->15859|29117->15927|29147->15928|29223->15975|29253->15976|29300->15994|29330->15995|29381->16017|29411->16018|29477->16055|29507->16056|29564->16084|29594->16085|29705->16167|29735->16168|29960->16363|29991->16364|30022->16365|30053->16366|30208->16492|30238->16493|30292->16518|30322->16519|30433->16601|30463->16602|30503->16613|30533->16614|30576->16629|30605->16630|30791->16787|30821->16788|30955->16893|30985->16894|31276->17156|31306->17157|31398->17220|31428->17221|31528->17292|31558->17293|31598->17304|31628->17305|31689->17338|31718->17339
                    LINES: 26->1|30->1|31->3|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|43->15|43->15|43->15|50->22|50->22|51->23|51->23|52->24|52->24|53->25|53->25|55->27|55->27|56->28|56->28|61->33|61->33|62->34|62->34|66->38|66->38|67->39|67->39|75->47|75->47|77->49|77->49|79->51|79->51|81->53|81->53|84->56|84->56|86->58|86->58|89->61|89->61|93->65|93->65|96->68|96->68|100->72|100->72|103->75|103->75|108->80|108->80|109->81|109->81|110->82|110->82|111->83|111->83|113->85|113->85|115->87|115->87|116->88|116->88|119->91|119->91|120->92|120->92|121->93|121->93|123->95|123->95|124->96|124->96|128->100|128->100|129->101|129->101|130->102|130->102|131->103|131->103|135->107|135->107|136->108|136->108|137->109|137->109|139->111|139->111|140->112|140->112|142->114|142->114|143->115|143->115|145->117|145->117|151->123|151->123|152->124|152->124|155->127|155->127|156->128|156->128|158->130|158->130|159->131|159->131|160->132|160->132|161->133|161->133|163->135|163->135|167->139|167->139|169->141|169->141|170->142|170->142|171->143|171->143|173->145|173->145|174->146|174->146|177->149|177->149|178->150|178->150|182->154|182->154|183->155|183->155|190->162|190->162|194->166|194->166|197->169|197->169|200->172|200->172|205->177|205->177|209->181|209->181|211->183|211->183|214->186|214->186|216->188|216->188|219->191|219->191|220->192|220->192|221->193|221->193|222->194|222->194|223->195|223->195|225->197|225->197|226->198|226->198|227->199|227->199|229->201|229->201|232->204|232->204|234->206|234->206|235->207|235->207|237->209|237->209|240->212|240->212|241->213|241->213|242->214|242->214|244->216|244->216|246->218|246->218|248->220|248->220|251->223|251->223|253->225|253->225|254->226|254->226|255->227|255->227|256->228|256->228|257->229|257->229|258->230|258->230|260->232|260->232|261->233|261->233|262->234|262->234|264->236|264->236|265->237|265->237|267->239|267->239|268->240|268->240|270->242|270->242|276->248|276->248|277->249|277->249|280->252|280->252|281->253|281->253|283->255|283->255|284->256|284->256|285->257|285->257|286->258|286->258|288->260|288->260|293->265|293->265|294->266|294->266|295->267|295->267|296->268|296->268|298->270|298->270|299->271|299->271|302->274|302->274|303->275|303->275|307->279|307->279|308->280|308->280|315->287|315->287|319->291|319->291|322->294|322->294|325->297|325->297|330->302|330->302|334->306|334->306|336->308|336->308|339->311|339->311|341->313|341->313|344->316|344->316|345->317|345->317|346->318|346->318|347->319|347->319|348->320|348->320|350->322|350->322|351->323|351->323|352->324|352->324|354->326|354->326|357->329|357->329|359->331|359->331|360->332|360->332|362->334|362->334|365->337|365->337|366->338|366->338|367->339|367->339|369->341|369->341|371->343|371->343|373->345|373->345|376->348|376->348|378->350|378->350|379->351|379->351|380->352|380->352|381->353|381->353|382->354|382->354|383->355|383->355|385->357|385->357|386->358|386->358|387->359|387->359|389->361|389->361|390->362|390->362|392->364|392->364|393->365|393->365|395->367|395->367|401->373|401->373|402->374|402->374|405->377|405->377|406->378|406->378|408->380|408->380|409->381|409->381|410->382|410->382|411->383|411->383|413->385|413->385|417->389|417->389|419->391|419->391|421->393|421->393|423->395|423->395|427->399|427->399|432->404|432->404|437->409|437->409|438->410|438->410|440->412|440->412|442->414|442->414|445->417|445->417|455->427|455->427|457->429|457->429|458->430|458->430|460->432|460->432|461->433|461->433|463->435|463->435|464->436|464->436|465->437|465->437|469->441|469->441|470->442|470->442|471->443|471->443|473->445|473->445|474->446|474->446|476->448|476->448|479->451|479->451|480->452|480->452|483->455|483->455|484->456|484->456|487->459|487->459|489->461|489->461|490->462|490->462|492->464|492->464|494->466|494->466|496->468|496->468|499->471|499->471|501->473|501->473|501->473|501->473|503->475|503->475|504->476|504->476|506->478|506->478|507->479|507->479|509->481|509->481|515->487|515->487|518->490|518->490|524->496|524->496|526->498|526->498|529->501|529->501|531->503|531->503|534->506|534->506
                    -- GENERATED --
                */
            