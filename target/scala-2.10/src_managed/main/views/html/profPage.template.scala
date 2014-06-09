
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
		                        

		            			var connection = new WebSocket('ws://localhost:9000');
		            			
		                        var y;
		                        
		            			connection.onopen = function()"""),format.raw/*165.48*/("""{"""),format.raw/*165.49*/("""
		            				   /*Send a small message to the console once the connection is established */
		            				   alert('Connection open!');
		            				"""),format.raw/*168.19*/("""}"""),format.raw/*168.20*/("""
		            			
		            			var server_message;
		            			
		            			connection.onmessage = function(e)"""),format.raw/*172.52*/("""{"""),format.raw/*172.53*/("""
		            				   server_message = e.data;
		            				   alert("INITIALIZATION " + server_message);
		            				"""),format.raw/*175.19*/("""}"""),format.raw/*175.20*/("""
		            			
		            			connection.onclose = function(e) """),format.raw/*177.51*/("""{"""),format.raw/*177.52*/("""
		            				alert("CONNECTION IS CLOSED~");
		            			"""),format.raw/*179.18*/("""}"""),format.raw/*179.19*/("""
		            			
		                        setInterval(function() """),format.raw/*181.50*/("""{"""),format.raw/*181.51*/("""
		                            var x = (new Date()).getTime(); // current time
		                                //y = Math.random()*100;
		                            y = parseInt(server_message);
		                            series.addPoint([x, y], true, true);
									alert(y);
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
                    DATE: Mon Jun 09 18:21:36 CEST 2014
                    SOURCE: /home/aalfath/git/LiveFeedSebaTeam/app/views/profPage.scala.html
                    HASH: 65db57b9948c743258bc8f78d01b090dc77405c8
                    MATRIX: 775->1|899->15|926->33|1090->161|1105->167|1161->201|1258->262|1273->268|1327->300|1420->357|1435->363|1511->416|1604->473|1619->479|1691->528|1753->554|1768->560|1835->605|2015->757|2044->758|2114->800|2143->801|2210->840|2239->841|2296->870|2325->871|2412->930|2441->931|2486->948|2515->949|2651->1057|2680->1058|2736->1086|2765->1087|2985->1279|3014->1280|3088->1326|3117->1327|3595->1777|3624->1778|3740->1866|3769->1867|3866->1936|3895->1937|4033->2047|4062->2048|4240->2198|4269->2199|4405->2307|4434->2308|4597->2443|4626->2444|4876->2666|4905->2667|5100->2834|5129->2835|5379->3057|5408->3058|5545->3167|5574->3168|5890->3456|5919->3457|5984->3494|6013->3495|6066->3520|6095->3521|6144->3542|6173->3543|6251->3593|6280->3594|6378->3664|6407->3665|6464->3694|6493->3695|6631->3805|6660->3806|6717->3835|6746->3836|6806->3868|6835->3869|6930->3936|6959->3937|7025->3975|7054->3976|7229->4122|7259->4123|7310->4145|7340->4146|7400->4177|7430->4178|7506->4225|7536->4226|7828->4489|7858->4490|7908->4511|7938->4512|7997->4542|8027->4543|8116->4603|8146->4604|8208->4637|8238->4638|8327->4698|8357->4699|8417->4730|8447->4731|8564->4819|8594->4820|8897->5094|8927->5095|8999->5138|9029->5139|9200->5281|9230->5282|9290->5313|9320->5314|9415->5380|9445->5381|9498->5405|9528->5406|9575->5424|9605->5425|9649->5440|9679->5441|9731->5465|9761->5466|9839->5515|9869->5516|9938->5556|9968->5557|10030->5590|10060->5591|10112->5614|10142->5615|10218->5662|10248->5663|10288->5674|10318->5675|10427->5755|10457->5756|10508->5778|10538->5779|10734->5946|10764->5947|10833->5987|10863->5988|11254->6350|11284->6351|11477->6515|11507->6516|11661->6641|11691->6642|11849->6771|11879->6772|11977->6841|12007->6842|12104->6910|12134->6911|12231->6979|12261->6980|12600->7290|12630->7291|12690->7322|12720->7323|12768->7342|12798->7343|12842->7358|12872->7359|12924->7382|12954->7383|13030->7430|13060->7431|13112->7454|13142->7455|13197->7481|13227->7482|13310->7536|13340->7537|13462->7630|13492->7631|13559->7669|13589->7670|13644->7696|13674->7697|13763->7757|13793->7758|13905->7841|13935->7842|14009->7887|14039->7888|14118->7938|14148->7939|14253->8015|14283->8016|14388->8092|14418->8093|14517->8163|14547->8164|14678->8266|14708->8267|14813->8343|14843->8344|14895->8367|14925->8368|14973->8387|15003->8388|15048->8404|15078->8405|15132->8430|15162->8431|15232->8472|15262->8473|15481->8663|15511->8664|15555->8679|15585->8680|15638->8704|15668->8705|15745->8753|15775->8754|15831->8781|15861->8782|15938->8830|15968->8831|16022->8856|16052->8857|16157->8933|16187->8934|16453->9171|16483->9172|16549->9209|16579->9210|16721->9323|16751->9324|16805->9349|16835->9350|16918->9404|16948->9405|16995->9423|17025->9424|17066->9436|17096->9437|17133->9446|17162->9447|17202->9459|17231->9460|17315->9515|17345->9516|17410->9552|17440->9553|17502->9586|17532->9587|17584->9610|17614->9611|17690->9658|17720->9659|17760->9670|17790->9671|17902->9754|17932->9755|17983->9777|18013->9778|18209->9945|18239->9946|18308->9986|18338->9987|18553->10173|18583->10174|18841->10403|18871->10404|18931->10435|18961->10436|19009->10455|19039->10456|19083->10471|19113->10472|19165->10495|19195->10496|19274->10546|19304->10547|19356->10570|19386->10571|19441->10597|19471->10598|19554->10652|19584->10653|19706->10746|19736->10747|19803->10785|19833->10786|19888->10812|19918->10813|20007->10873|20037->10874|20149->10957|20179->10958|20253->11003|20283->11004|20362->11054|20392->11055|20497->11131|20527->11132|20632->11208|20662->11209|20761->11279|20791->11280|20922->11382|20952->11383|21058->11460|21088->11461|21140->11484|21170->11485|21218->11504|21248->11505|21293->11521|21323->11522|21377->11547|21407->11548|21477->11589|21507->11590|21729->11783|21759->11784|21803->11799|21833->11800|21886->11824|21916->11825|21993->11873|22023->11874|22079->11901|22109->11902|22186->11950|22216->11951|22270->11976|22300->11977|22405->12053|22435->12054|22701->12291|22731->12292|22797->12329|22827->12330|22987->12461|23017->12462|23071->12487|23101->12488|23184->12542|23214->12543|23261->12561|23291->12562|23332->12574|23362->12575|23399->12584|23428->12585|23468->12597|23497->12598|23582->12654|23612->12655|23677->12691|23707->12692|23761->12717|23791->12718|23864->12762|23894->12763|23986->12826|24016->12827|24194->12976|24224->12977|24488->13212|24518->13213|24558->13224|24588->13225|24639->13247|24669->13248|24735->13285|24765->13286|24855->13347|24885->13348|25218->13652|25248->13653|25320->13696|25350->13697|25406->13724|25436->13725|25510->13770|25540->13771|25588->13790|25618->13791|25689->13833|25719->13834|25778->13864|25808->13865|25871->13899|25901->13900|26063->14033|26093->14034|26153->14065|26183->14066|26248->14102|26278->14103|26382->14178|26412->14179|26466->14204|26496->14205|26565->14245|26595->14246|26660->14282|26690->14283|26729->14293|26759->14294|26901->14407|26931->14408|26981->14429|27011->14430|27108->14498|27138->14499|27214->14546|27244->14547|27291->14565|27321->14566|27372->14588|27402->14589|27468->14626|27498->14627|27555->14655|27585->14656|27696->14738|27726->14739|27951->14934|27982->14935|28013->14936|28044->14937|28199->15063|28229->15064|28283->15089|28313->15090|28424->15172|28454->15173|28494->15184|28524->15185|28567->15200|28596->15201|28782->15358|28812->15359|28946->15464|28976->15465|29267->15727|29297->15728|29389->15791|29419->15792|29519->15863|29549->15864|29589->15875|29619->15876|29680->15909|29709->15910
                    LINES: 26->1|30->1|31->3|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|43->15|43->15|43->15|50->22|50->22|51->23|51->23|52->24|52->24|53->25|53->25|55->27|55->27|56->28|56->28|61->33|61->33|62->34|62->34|66->38|66->38|67->39|67->39|75->47|75->47|77->49|77->49|79->51|79->51|81->53|81->53|84->56|84->56|86->58|86->58|89->61|89->61|93->65|93->65|96->68|96->68|100->72|100->72|103->75|103->75|108->80|108->80|109->81|109->81|110->82|110->82|111->83|111->83|113->85|113->85|115->87|115->87|116->88|116->88|119->91|119->91|120->92|120->92|121->93|121->93|123->95|123->95|124->96|124->96|128->100|128->100|129->101|129->101|130->102|130->102|131->103|131->103|135->107|135->107|136->108|136->108|137->109|137->109|139->111|139->111|140->112|140->112|142->114|142->114|143->115|143->115|145->117|145->117|151->123|151->123|152->124|152->124|155->127|155->127|156->128|156->128|158->130|158->130|159->131|159->131|160->132|160->132|161->133|161->133|163->135|163->135|167->139|167->139|169->141|169->141|170->142|170->142|171->143|171->143|173->145|173->145|174->146|174->146|177->149|177->149|178->150|178->150|182->154|182->154|183->155|183->155|193->165|193->165|196->168|196->168|200->172|200->172|203->175|203->175|205->177|205->177|207->179|207->179|209->181|209->181|215->187|215->187|216->188|216->188|217->189|217->189|218->190|218->190|219->191|219->191|221->193|221->193|222->194|222->194|223->195|223->195|225->197|225->197|228->200|228->200|230->202|230->202|231->203|231->203|233->205|233->205|236->208|236->208|237->209|237->209|238->210|238->210|240->212|240->212|242->214|242->214|244->216|244->216|247->219|247->219|249->221|249->221|250->222|250->222|251->223|251->223|252->224|252->224|253->225|253->225|254->226|254->226|256->228|256->228|257->229|257->229|258->230|258->230|260->232|260->232|261->233|261->233|263->235|263->235|264->236|264->236|266->238|266->238|272->244|272->244|273->245|273->245|276->248|276->248|277->249|277->249|279->251|279->251|280->252|280->252|281->253|281->253|282->254|282->254|284->256|284->256|289->261|289->261|290->262|290->262|291->263|291->263|292->264|292->264|294->266|294->266|295->267|295->267|298->270|298->270|299->271|299->271|303->275|303->275|304->276|304->276|308->280|308->280|312->284|312->284|313->285|313->285|314->286|314->286|315->287|315->287|316->288|316->288|318->290|318->290|319->291|319->291|320->292|320->292|322->294|322->294|325->297|325->297|327->299|327->299|328->300|328->300|330->302|330->302|333->305|333->305|334->306|334->306|335->307|335->307|337->309|337->309|339->311|339->311|341->313|341->313|344->316|344->316|346->318|346->318|347->319|347->319|348->320|348->320|349->321|349->321|350->322|350->322|351->323|351->323|353->325|353->325|354->326|354->326|355->327|355->327|357->329|357->329|358->330|358->330|360->332|360->332|361->333|361->333|363->335|363->335|369->341|369->341|370->342|370->342|373->345|373->345|374->346|374->346|376->348|376->348|377->349|377->349|378->350|378->350|379->351|379->351|381->353|381->353|385->357|385->357|387->359|387->359|389->361|389->361|391->363|391->363|395->367|395->367|400->372|400->372|405->377|405->377|406->378|406->378|408->380|408->380|410->382|410->382|413->385|413->385|423->395|423->395|425->397|425->397|426->398|426->398|428->400|428->400|429->401|429->401|431->403|431->403|432->404|432->404|433->405|433->405|437->409|437->409|438->410|438->410|439->411|439->411|441->413|441->413|442->414|442->414|444->416|444->416|447->419|447->419|448->420|448->420|451->423|451->423|452->424|452->424|455->427|455->427|457->429|457->429|458->430|458->430|460->432|460->432|462->434|462->434|464->436|464->436|467->439|467->439|469->441|469->441|469->441|469->441|471->443|471->443|472->444|472->444|474->446|474->446|475->447|475->447|477->449|477->449|483->455|483->455|486->458|486->458|492->464|492->464|494->466|494->466|497->469|497->469|499->471|499->471|502->474|502->474
                    -- GENERATED --
                */
            