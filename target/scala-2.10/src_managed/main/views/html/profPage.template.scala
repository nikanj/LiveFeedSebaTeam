
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
			            				   //alert(server_message);
			            				   y = parseInt(server_message);
			            			"""),format.raw/*176.19*/("""}"""),format.raw/*176.20*/("""

			            			connection.onmessage = receiveEvent;		            			
			            			
			            			connection.onclose = function(e) """),format.raw/*180.52*/("""{"""),format.raw/*180.53*/("""
			            				alert("CONNECTION IS CLOSED~");
			            			"""),format.raw/*182.19*/("""}"""),format.raw/*182.20*/("""

		                        	var x = (new Date()).getTime(); // current time
		                            series.addPoint([x, y], true, true);
//									alert('DEBUG GET MESSAGE --> ' + y);
		                        """),format.raw/*187.27*/("""}"""),format.raw/*187.28*/(""", 2000);
		                    """),format.raw/*188.23*/("""}"""),format.raw/*188.24*/("""
		                """),format.raw/*189.19*/("""}"""),format.raw/*189.20*/("""
		            """),format.raw/*190.15*/("""}"""),format.raw/*190.16*/(""",
		            title: """),format.raw/*191.22*/("""{"""),format.raw/*191.23*/("""
		                text: 'Speed'
		            """),format.raw/*193.15*/("""}"""),format.raw/*193.16*/(""",
		            xAxis: """),format.raw/*194.22*/("""{"""),format.raw/*194.23*/("""
		                title: """),format.raw/*195.26*/("""{"""),format.raw/*195.27*/("""
		                    text: 'Time'
		                """),format.raw/*197.19*/("""}"""),format.raw/*197.20*/(""",
		                type: 'datetime',
		                tickPixelInterval: 150
		            """),format.raw/*200.15*/("""}"""),format.raw/*200.16*/(""",
		            
		            yAxis: """),format.raw/*202.22*/("""{"""),format.raw/*202.23*/("""
		                title: """),format.raw/*203.26*/("""{"""),format.raw/*203.27*/("""
		                    text: 'Percentage'
		                """),format.raw/*205.19*/("""}"""),format.raw/*205.20*/(""",
		                min: 0,
		                max: 100,
		                 labels: """),format.raw/*208.28*/("""{"""),format.raw/*208.29*/("""
		                    formatter: function() """),format.raw/*209.45*/("""{"""),format.raw/*209.46*/("""
		                        if (this.value == 100) """),format.raw/*210.50*/("""{"""),format.raw/*210.51*/("""
		                            return 'Too Fast';
		                        """),format.raw/*212.27*/("""}"""),format.raw/*212.28*/("""
		                        
		                        if (this.value == 50) """),format.raw/*214.49*/("""{"""),format.raw/*214.50*/("""
		                            return 'OK';
		                        """),format.raw/*216.27*/("""}"""),format.raw/*216.28*/("""
		                        
		                        
		                        if (this.value == 0) """),format.raw/*219.48*/("""{"""),format.raw/*219.49*/("""
		                            return 'Too Slow';
		                        """),format.raw/*221.27*/("""}"""),format.raw/*221.28*/("""
		                    """),format.raw/*222.23*/("""}"""),format.raw/*222.24*/("""
		                """),format.raw/*223.19*/("""}"""),format.raw/*223.20*/(""",
		            """),format.raw/*224.15*/("""}"""),format.raw/*224.16*/(""",
		            tooltip: """),format.raw/*225.24*/("""{"""),format.raw/*225.25*/("""
		                formatter: function() """),format.raw/*226.41*/("""{"""),format.raw/*226.42*/("""
		                        return 'At time: ' + Highcharts.dateFormat('%H:%M:%S', this.x) +'<br/>' + 'Average speed requested ' + Highcharts.numberFormat(this.y, 2) + '%';
		                """),format.raw/*228.19*/("""}"""),format.raw/*228.20*/("""
		            """),format.raw/*229.15*/("""}"""),format.raw/*229.16*/(""",
		            legend: """),format.raw/*230.23*/("""{"""),format.raw/*230.24*/("""
		                enabled: false
		            """),format.raw/*232.15*/("""}"""),format.raw/*232.16*/(""",
		            exporting: """),format.raw/*233.26*/("""{"""),format.raw/*233.27*/("""
		                enabled: false
		            """),format.raw/*235.15*/("""}"""),format.raw/*235.16*/(""",
		            series: ["""),format.raw/*236.24*/("""{"""),format.raw/*236.25*/("""
		                name: 'Random data',
		                data: (function() """),format.raw/*238.37*/("""{"""),format.raw/*238.38*/("""
		                    // generate an array of random data
		                    var data = [],
		                        time = (new Date()).getTime(),
		                        i;
		    
		                    for (i = -5; i <= 0; i++) """),format.raw/*244.49*/("""{"""),format.raw/*244.50*/("""
		                        data.push("""),format.raw/*245.37*/("""{"""),format.raw/*245.38*/("""
		                            x: time + i * 1000,
		                            y: 50
		                        """),format.raw/*248.27*/("""}"""),format.raw/*248.28*/(""");
		                    """),format.raw/*249.23*/("""}"""),format.raw/*249.24*/("""
		                    return data;
		                """),format.raw/*251.19*/("""}"""),format.raw/*251.20*/(""")()
		            """),format.raw/*252.15*/("""}"""),format.raw/*252.16*/("""]
		        """),format.raw/*253.11*/("""}"""),format.raw/*253.12*/(""");
		    """),format.raw/*254.7*/("""}"""),format.raw/*254.8*/(""");
		    
		"""),format.raw/*256.3*/("""}"""),format.raw/*256.4*/(""");
    	</script>
    
    
		<script>
		$(function () """),format.raw/*261.17*/("""{"""),format.raw/*261.18*/("""
		    $(document).ready(function() """),format.raw/*262.36*/("""{"""),format.raw/*262.37*/("""
		        Highcharts.setOptions("""),format.raw/*263.33*/("""{"""),format.raw/*263.34*/("""
		            global: """),format.raw/*264.23*/("""{"""),format.raw/*264.24*/("""
		                useUTC: false
		            """),format.raw/*266.15*/("""}"""),format.raw/*266.16*/("""
		        """),format.raw/*267.11*/("""}"""),format.raw/*267.12*/(""");
		    
		        var chart;
		        $('#container-loudness-chart').highcharts("""),format.raw/*270.53*/("""{"""),format.raw/*270.54*/("""
		            chart: """),format.raw/*271.22*/("""{"""),format.raw/*271.23*/("""
		                type: 'spline',
		                animation: Highcharts.svg, // don't animate in old IE
		                marginRight: 5,
		                events: """),format.raw/*275.27*/("""{"""),format.raw/*275.28*/("""
		                    load: function() """),format.raw/*276.40*/("""{"""),format.raw/*276.41*/("""
		    
		                        // set up the updating of the chart each second
		                        var series = this.series[0];
		                        setInterval(function() """),format.raw/*280.50*/("""{"""),format.raw/*280.51*/("""
		                            var x = (new Date()).getTime(), // current time
		                                y = Math.random()*100;
		                            series.addPoint([x, y], true, true);
		                        """),format.raw/*284.27*/("""}"""),format.raw/*284.28*/(""", 2000);
		                    """),format.raw/*285.23*/("""}"""),format.raw/*285.24*/("""
		                """),format.raw/*286.19*/("""}"""),format.raw/*286.20*/("""
		            """),format.raw/*287.15*/("""}"""),format.raw/*287.16*/(""",
		            title: """),format.raw/*288.22*/("""{"""),format.raw/*288.23*/("""
		                text: 'Loudness'
		            """),format.raw/*290.15*/("""}"""),format.raw/*290.16*/(""",
		            xAxis: """),format.raw/*291.22*/("""{"""),format.raw/*291.23*/("""
		                title: """),format.raw/*292.26*/("""{"""),format.raw/*292.27*/("""
		                    text: 'Time'
		                """),format.raw/*294.19*/("""}"""),format.raw/*294.20*/(""",
		                type: 'datetime',
		                tickPixelInterval: 150
		            """),format.raw/*297.15*/("""}"""),format.raw/*297.16*/(""",
		            
		            yAxis: """),format.raw/*299.22*/("""{"""),format.raw/*299.23*/("""
		                title: """),format.raw/*300.26*/("""{"""),format.raw/*300.27*/("""
		                    text: 'Percentage'
		                """),format.raw/*302.19*/("""}"""),format.raw/*302.20*/(""",
		                min: 0,
		                max: 100,
		                 labels: """),format.raw/*305.28*/("""{"""),format.raw/*305.29*/("""
		                    formatter: function() """),format.raw/*306.45*/("""{"""),format.raw/*306.46*/("""
		                        if (this.value == 100) """),format.raw/*307.50*/("""{"""),format.raw/*307.51*/("""
		                            return 'Too Loud';
		                        """),format.raw/*309.27*/("""}"""),format.raw/*309.28*/("""
		                        
		                        if (this.value == 50) """),format.raw/*311.49*/("""{"""),format.raw/*311.50*/("""
		                            return 'OK';
		                        """),format.raw/*313.27*/("""}"""),format.raw/*313.28*/("""
		                        
		                        
		                        if (this.value == 0) """),format.raw/*316.48*/("""{"""),format.raw/*316.49*/("""
		                            return 'Too Quiet';
		                        """),format.raw/*318.27*/("""}"""),format.raw/*318.28*/("""
		                    """),format.raw/*319.23*/("""}"""),format.raw/*319.24*/("""
		                """),format.raw/*320.19*/("""}"""),format.raw/*320.20*/(""",
		            """),format.raw/*321.15*/("""}"""),format.raw/*321.16*/(""",
		            tooltip: """),format.raw/*322.24*/("""{"""),format.raw/*322.25*/("""
		                formatter: function() """),format.raw/*323.41*/("""{"""),format.raw/*323.42*/("""
		                        return 'At time: ' + Highcharts.dateFormat('%H:%M:%S', this.x) +'<br/>' + 'Average loudness requested ' + Highcharts.numberFormat(this.y, 2) + '%';
		                """),format.raw/*325.19*/("""}"""),format.raw/*325.20*/("""
		            """),format.raw/*326.15*/("""}"""),format.raw/*326.16*/(""",
		            legend: """),format.raw/*327.23*/("""{"""),format.raw/*327.24*/("""
		                enabled: false
		            """),format.raw/*329.15*/("""}"""),format.raw/*329.16*/(""",
		            exporting: """),format.raw/*330.26*/("""{"""),format.raw/*330.27*/("""
		                enabled: false
		            """),format.raw/*332.15*/("""}"""),format.raw/*332.16*/(""",
		            series: ["""),format.raw/*333.24*/("""{"""),format.raw/*333.25*/("""
		                name: 'Random data',
		                data: (function() """),format.raw/*335.37*/("""{"""),format.raw/*335.38*/("""
		                    // generate an array of random data
		                    var data = [],
		                        time = (new Date()).getTime(),
		                        i;
		    
		                    for (i = -5; i <= 0; i++) """),format.raw/*341.49*/("""{"""),format.raw/*341.50*/("""
		                        data.push("""),format.raw/*342.37*/("""{"""),format.raw/*342.38*/("""
		                            x: time + i * 1000,
		                            y: 50 //initialization 
		                        """),format.raw/*345.27*/("""}"""),format.raw/*345.28*/(""");
		                    """),format.raw/*346.23*/("""}"""),format.raw/*346.24*/("""
		                    return data;
		                """),format.raw/*348.19*/("""}"""),format.raw/*348.20*/(""")()
		            """),format.raw/*349.15*/("""}"""),format.raw/*349.16*/("""]
		        """),format.raw/*350.11*/("""}"""),format.raw/*350.12*/(""");
		    """),format.raw/*351.7*/("""}"""),format.raw/*351.8*/(""");
		    
		"""),format.raw/*353.3*/("""}"""),format.raw/*353.4*/(""");
    	</script>
    
    	<script>
    	$(function () """),format.raw/*357.20*/("""{"""),format.raw/*357.21*/("""
    		
    	    var gaugeOptions = """),format.raw/*359.29*/("""{"""),format.raw/*359.30*/("""
    		
    		    chart: """),format.raw/*361.18*/("""{"""),format.raw/*361.19*/("""
    		        type: 'solidgauge'
    		    """),format.raw/*363.11*/("""}"""),format.raw/*363.12*/(""",
    		    
    		    title: null,
    		    
    		    pane: """),format.raw/*367.17*/("""{"""),format.raw/*367.18*/("""
    		    	center: ['50%', '85%'],
    		    	size: '140%',
    		        startAngle: -90,
    		        endAngle: 90,
    	            background: """),format.raw/*372.30*/("""{"""),format.raw/*372.31*/("""
    	                backgroundColor: (Highcharts.theme && Highcharts.theme.background2) || '#EEE',
    	                innerRadius: '60%',
    	                outerRadius: '100%',
    	                shape: 'arc'
    	            """),format.raw/*377.18*/("""}"""),format.raw/*377.19*/("""
    		    """),format.raw/*378.11*/("""}"""),format.raw/*378.12*/(""",

    		    tooltip: """),format.raw/*380.20*/("""{"""),format.raw/*380.21*/("""
    		    	enabled: false
    		    """),format.raw/*382.11*/("""}"""),format.raw/*382.12*/(""",
    		       
    		    // the value axis
    		    yAxis: """),format.raw/*385.18*/("""{"""),format.raw/*385.19*/("""
    				stops: [
    					[0.1, '#55BF3B'], // green
    		        	[0.5, '#DDDF0D'], // yellow
    		        	[0.9, '#DF5353'] // red
    				],
    				lineWidth: 0,
    	            minorTickInterval: null,
    	            tickPixelInterval: 400,
    	            tickWidth: 0,
    		        title: """),format.raw/*395.22*/("""{"""),format.raw/*395.23*/("""
    	                y: -70
    		        """),format.raw/*397.15*/("""}"""),format.raw/*397.16*/(""",
    	            labels: """),format.raw/*398.26*/("""{"""),format.raw/*398.27*/("""
    	                y: 16
    	            """),format.raw/*400.18*/("""}"""),format.raw/*400.19*/("""        
    		    """),format.raw/*401.11*/("""}"""),format.raw/*401.12*/(""",
    	        
    	        plotOptions: """),format.raw/*403.27*/("""{"""),format.raw/*403.28*/("""
    	            solidgauge: """),format.raw/*404.30*/("""{"""),format.raw/*404.31*/("""
    	                dataLabels: """),format.raw/*405.34*/("""{"""),format.raw/*405.35*/("""
    	                    y: 5,
    	                    borderWidth: 0,
    	                    useHTML: true
    	                """),format.raw/*409.22*/("""}"""),format.raw/*409.23*/(""",
    	                states: """),format.raw/*410.30*/("""{"""),format.raw/*410.31*/("""
                            hover: """),format.raw/*411.36*/("""{"""),format.raw/*411.37*/("""
                                enabled: true
                            """),format.raw/*413.29*/("""}"""),format.raw/*413.30*/("""
                        """),format.raw/*414.25*/("""}"""),format.raw/*414.26*/("""
    	                
    	            """),format.raw/*416.18*/("""}"""),format.raw/*416.19*/("""
    		    
    		    
    	        """),format.raw/*419.14*/("""}"""),format.raw/*419.15*/("""
    	    """),format.raw/*420.10*/("""}"""),format.raw/*420.11*/(""";
    	    
    	    // The speed gauge
    	    $('#container-speed').highcharts(Highcharts.merge(gaugeOptions, """),format.raw/*423.74*/("""{"""),format.raw/*423.75*/("""
    	        yAxis: """),format.raw/*424.21*/("""{"""),format.raw/*424.22*/("""
    		        min: 0,
    		        max: 100,
    		        title: """),format.raw/*427.22*/("""{"""),format.raw/*427.23*/("""
    		            text: 'Pause'
    		        """),format.raw/*429.15*/("""}"""),format.raw/*429.16*/("""       
    		    """),format.raw/*430.11*/("""}"""),format.raw/*430.12*/(""",

    		    credits: """),format.raw/*432.20*/("""{"""),format.raw/*432.21*/("""
    		    	enabled: false
    		    """),format.raw/*434.11*/("""}"""),format.raw/*434.12*/(""",
    		
    		    series: ["""),format.raw/*436.20*/("""{"""),format.raw/*436.21*/("""
    		        name: 'Pause',
    		        data: [80],
    		        dataLabels: """),format.raw/*439.27*/("""{"""),format.raw/*439.28*/("""
    		        	format: '<div style="text-align:center"><span style="font-size:25px;color:' + 
    	                    ((Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black') + '">"""),format.raw/*441.101*/("""{"""),format.raw/*441.102*/("""y"""),format.raw/*441.103*/("""}"""),format.raw/*441.104*/("""</span><br/>' + 
    	                   	'<span style="font-size:12px;color:silver">Pause counts</span></div>'
    		        """),format.raw/*443.15*/("""}"""),format.raw/*443.16*/(""",
    		        tooltip: """),format.raw/*444.24*/("""{"""),format.raw/*444.25*/("""
    		            valueSuffix: 'Number of persons voted for pause'
    		        """),format.raw/*446.15*/("""}"""),format.raw/*446.16*/("""
    		    """),format.raw/*447.11*/("""}"""),format.raw/*447.12*/("""]
    		
    		"""),format.raw/*449.7*/("""}"""),format.raw/*449.8*/("""));
    	    
    	    // The RPM gauge
    	    ;
    	                               
    	    // Bring life to the dials
    	    setInterval(function () """),format.raw/*455.34*/("""{"""),format.raw/*455.35*/("""
    	    	// Speed
    	        var chart = $('#container-speed').highcharts();
    	        if (chart) """),format.raw/*458.25*/("""{"""),format.raw/*458.26*/("""
    	            var point = chart.series[0].points[0],
    	                newVal,
    	                inc = Math.round((Math.random() - 0.5) * 100);
    	            
    	            newVal = point.y + inc;
    	            if (newVal < 0 || newVal > 100) """),format.raw/*464.50*/("""{"""),format.raw/*464.51*/("""
    	                newVal = point.y - inc;
    	            """),format.raw/*466.18*/("""}"""),format.raw/*466.19*/("""
    	            
    	            point.update(newVal);
    	        """),format.raw/*469.14*/("""}"""),format.raw/*469.15*/("""

    	    """),format.raw/*471.10*/("""}"""),format.raw/*471.11*/(""", 2000);  
    	    
    		
    	"""),format.raw/*474.6*/("""}"""),format.raw/*474.7*/(""");
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
                    DATE: Mon Jun 09 21:59:49 CEST 2014
                    SOURCE: /home/aalfath/git/LiveFeedSebaTeam/app/views/profPage.scala.html
                    HASH: ad5eda72464730d89c53e30e61e48af958cbcc07
                    MATRIX: 775->1|899->15|926->33|1090->161|1105->167|1161->201|1258->262|1273->268|1327->300|1420->357|1435->363|1511->416|1604->473|1619->479|1691->528|1753->554|1768->560|1835->605|2015->757|2044->758|2114->800|2143->801|2210->840|2239->841|2296->870|2325->871|2412->930|2441->931|2486->948|2515->949|2651->1057|2680->1058|2736->1086|2765->1087|2985->1279|3014->1280|3088->1326|3117->1327|3595->1777|3624->1778|3740->1866|3769->1867|3866->1936|3895->1937|4033->2047|4062->2048|4240->2198|4269->2199|4405->2307|4434->2308|4597->2443|4626->2444|4876->2666|4905->2667|5100->2834|5129->2835|5379->3057|5408->3058|5545->3167|5574->3168|5890->3456|5919->3457|5984->3494|6013->3495|6066->3520|6095->3521|6144->3542|6173->3543|6251->3593|6280->3594|6378->3664|6407->3665|6464->3694|6493->3695|6631->3805|6660->3806|6717->3835|6746->3836|6806->3868|6835->3869|6930->3936|6959->3937|7025->3975|7054->3976|7229->4122|7259->4123|7310->4145|7340->4146|7400->4177|7430->4178|7506->4225|7536->4226|7828->4489|7858->4490|7908->4511|7938->4512|7997->4542|8027->4543|8116->4603|8146->4604|8208->4637|8238->4638|8327->4698|8357->4699|8417->4730|8447->4731|8564->4819|8594->4820|8897->5094|8927->5095|8999->5138|9029->5139|9200->5281|9230->5282|9290->5313|9320->5314|9415->5380|9445->5381|9498->5405|9528->5406|9575->5424|9605->5425|9649->5440|9679->5441|9731->5465|9761->5466|9839->5515|9869->5516|9938->5556|9968->5557|10030->5590|10060->5591|10112->5614|10142->5615|10218->5662|10248->5663|10288->5674|10318->5675|10427->5755|10457->5756|10508->5778|10538->5779|10734->5946|10764->5947|10833->5987|10863->5988|11187->6283|11217->6284|11469->6507|11499->6508|11697->6677|11727->6678|11826->6748|11856->6749|12050->6914|12080->6915|12253->7059|12283->7060|12382->7130|12412->7131|12659->7349|12689->7350|12749->7381|12779->7382|12827->7401|12857->7402|12901->7417|12931->7418|12983->7441|13013->7442|13089->7489|13119->7490|13171->7513|13201->7514|13256->7540|13286->7541|13369->7595|13399->7596|13521->7689|13551->7690|13618->7728|13648->7729|13703->7755|13733->7756|13822->7816|13852->7817|13964->7900|13994->7901|14068->7946|14098->7947|14177->7997|14207->7998|14312->8074|14342->8075|14447->8151|14477->8152|14576->8222|14606->8223|14737->8325|14767->8326|14872->8402|14902->8403|14954->8426|14984->8427|15032->8446|15062->8447|15107->8463|15137->8464|15191->8489|15221->8490|15291->8531|15321->8532|15540->8722|15570->8723|15614->8738|15644->8739|15697->8763|15727->8764|15804->8812|15834->8813|15890->8840|15920->8841|15997->8889|16027->8890|16081->8915|16111->8916|16216->8992|16246->8993|16512->9230|16542->9231|16608->9268|16638->9269|16780->9382|16810->9383|16864->9408|16894->9409|16977->9463|17007->9464|17054->9482|17084->9483|17125->9495|17155->9496|17192->9505|17221->9506|17261->9518|17290->9519|17374->9574|17404->9575|17469->9611|17499->9612|17561->9645|17591->9646|17643->9669|17673->9670|17749->9717|17779->9718|17819->9729|17849->9730|17961->9813|17991->9814|18042->9836|18072->9837|18268->10004|18298->10005|18367->10045|18397->10046|18612->10232|18642->10233|18900->10462|18930->10463|18990->10494|19020->10495|19068->10514|19098->10515|19142->10530|19172->10531|19224->10554|19254->10555|19333->10605|19363->10606|19415->10629|19445->10630|19500->10656|19530->10657|19613->10711|19643->10712|19765->10805|19795->10806|19862->10844|19892->10845|19947->10871|19977->10872|20066->10932|20096->10933|20208->11016|20238->11017|20312->11062|20342->11063|20421->11113|20451->11114|20556->11190|20586->11191|20691->11267|20721->11268|20820->11338|20850->11339|20981->11441|21011->11442|21117->11519|21147->11520|21199->11543|21229->11544|21277->11563|21307->11564|21352->11580|21382->11581|21436->11606|21466->11607|21536->11648|21566->11649|21788->11842|21818->11843|21862->11858|21892->11859|21945->11883|21975->11884|22052->11932|22082->11933|22138->11960|22168->11961|22245->12009|22275->12010|22329->12035|22359->12036|22464->12112|22494->12113|22760->12350|22790->12351|22856->12388|22886->12389|23046->12520|23076->12521|23130->12546|23160->12547|23243->12601|23273->12602|23320->12620|23350->12621|23391->12633|23421->12634|23458->12643|23487->12644|23527->12656|23556->12657|23641->12713|23671->12714|23736->12750|23766->12751|23820->12776|23850->12777|23923->12821|23953->12822|24045->12885|24075->12886|24253->13035|24283->13036|24547->13271|24577->13272|24617->13283|24647->13284|24698->13306|24728->13307|24794->13344|24824->13345|24914->13406|24944->13407|25277->13711|25307->13712|25379->13755|25409->13756|25465->13783|25495->13784|25569->13829|25599->13830|25647->13849|25677->13850|25748->13892|25778->13893|25837->13923|25867->13924|25930->13958|25960->13959|26122->14092|26152->14093|26212->14124|26242->14125|26307->14161|26337->14162|26441->14237|26471->14238|26525->14263|26555->14264|26624->14304|26654->14305|26719->14341|26749->14342|26788->14352|26818->14353|26960->14466|26990->14467|27040->14488|27070->14489|27167->14557|27197->14558|27273->14605|27303->14606|27350->14624|27380->14625|27431->14647|27461->14648|27527->14685|27557->14686|27614->14714|27644->14715|27755->14797|27785->14798|28010->14993|28041->14994|28072->14995|28103->14996|28258->15122|28288->15123|28342->15148|28372->15149|28483->15231|28513->15232|28553->15243|28583->15244|28626->15259|28655->15260|28841->15417|28871->15418|29005->15523|29035->15524|29326->15786|29356->15787|29448->15850|29478->15851|29578->15922|29608->15923|29648->15934|29678->15935|29739->15968|29768->15969
                    LINES: 26->1|30->1|31->3|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|43->15|43->15|43->15|50->22|50->22|51->23|51->23|52->24|52->24|53->25|53->25|55->27|55->27|56->28|56->28|61->33|61->33|62->34|62->34|66->38|66->38|67->39|67->39|75->47|75->47|77->49|77->49|79->51|79->51|81->53|81->53|84->56|84->56|86->58|86->58|89->61|89->61|93->65|93->65|96->68|96->68|100->72|100->72|103->75|103->75|108->80|108->80|109->81|109->81|110->82|110->82|111->83|111->83|113->85|113->85|115->87|115->87|116->88|116->88|119->91|119->91|120->92|120->92|121->93|121->93|123->95|123->95|124->96|124->96|128->100|128->100|129->101|129->101|130->102|130->102|131->103|131->103|135->107|135->107|136->108|136->108|137->109|137->109|139->111|139->111|140->112|140->112|142->114|142->114|143->115|143->115|145->117|145->117|151->123|151->123|152->124|152->124|155->127|155->127|156->128|156->128|158->130|158->130|159->131|159->131|160->132|160->132|161->133|161->133|163->135|163->135|167->139|167->139|169->141|169->141|170->142|170->142|171->143|171->143|173->145|173->145|174->146|174->146|177->149|177->149|178->150|178->150|182->154|182->154|183->155|183->155|190->162|190->162|194->166|194->166|197->169|197->169|200->172|200->172|204->176|204->176|208->180|208->180|210->182|210->182|215->187|215->187|216->188|216->188|217->189|217->189|218->190|218->190|219->191|219->191|221->193|221->193|222->194|222->194|223->195|223->195|225->197|225->197|228->200|228->200|230->202|230->202|231->203|231->203|233->205|233->205|236->208|236->208|237->209|237->209|238->210|238->210|240->212|240->212|242->214|242->214|244->216|244->216|247->219|247->219|249->221|249->221|250->222|250->222|251->223|251->223|252->224|252->224|253->225|253->225|254->226|254->226|256->228|256->228|257->229|257->229|258->230|258->230|260->232|260->232|261->233|261->233|263->235|263->235|264->236|264->236|266->238|266->238|272->244|272->244|273->245|273->245|276->248|276->248|277->249|277->249|279->251|279->251|280->252|280->252|281->253|281->253|282->254|282->254|284->256|284->256|289->261|289->261|290->262|290->262|291->263|291->263|292->264|292->264|294->266|294->266|295->267|295->267|298->270|298->270|299->271|299->271|303->275|303->275|304->276|304->276|308->280|308->280|312->284|312->284|313->285|313->285|314->286|314->286|315->287|315->287|316->288|316->288|318->290|318->290|319->291|319->291|320->292|320->292|322->294|322->294|325->297|325->297|327->299|327->299|328->300|328->300|330->302|330->302|333->305|333->305|334->306|334->306|335->307|335->307|337->309|337->309|339->311|339->311|341->313|341->313|344->316|344->316|346->318|346->318|347->319|347->319|348->320|348->320|349->321|349->321|350->322|350->322|351->323|351->323|353->325|353->325|354->326|354->326|355->327|355->327|357->329|357->329|358->330|358->330|360->332|360->332|361->333|361->333|363->335|363->335|369->341|369->341|370->342|370->342|373->345|373->345|374->346|374->346|376->348|376->348|377->349|377->349|378->350|378->350|379->351|379->351|381->353|381->353|385->357|385->357|387->359|387->359|389->361|389->361|391->363|391->363|395->367|395->367|400->372|400->372|405->377|405->377|406->378|406->378|408->380|408->380|410->382|410->382|413->385|413->385|423->395|423->395|425->397|425->397|426->398|426->398|428->400|428->400|429->401|429->401|431->403|431->403|432->404|432->404|433->405|433->405|437->409|437->409|438->410|438->410|439->411|439->411|441->413|441->413|442->414|442->414|444->416|444->416|447->419|447->419|448->420|448->420|451->423|451->423|452->424|452->424|455->427|455->427|457->429|457->429|458->430|458->430|460->432|460->432|462->434|462->434|464->436|464->436|467->439|467->439|469->441|469->441|469->441|469->441|471->443|471->443|472->444|472->444|474->446|474->446|475->447|475->447|477->449|477->449|483->455|483->455|486->458|486->458|492->464|492->464|494->466|494->466|497->469|497->469|499->471|499->471|502->474|502->474
                    -- GENERATED --
                */
            