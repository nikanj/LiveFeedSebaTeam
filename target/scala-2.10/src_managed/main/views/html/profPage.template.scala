
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
		    $(document).ready(function() """),format.raw/*140.36*/("""{"""),format.raw/*140.37*/("""
		        Highcharts.setOptions("""),format.raw/*141.33*/("""{"""),format.raw/*141.34*/("""
		            global: """),format.raw/*142.23*/("""{"""),format.raw/*142.24*/("""
		                useUTC: false
		            """),format.raw/*144.15*/("""}"""),format.raw/*144.16*/("""
		        """),format.raw/*145.11*/("""}"""),format.raw/*145.12*/(""");
		    
		        var chart;
		        $('#container-speed-chart').highcharts("""),format.raw/*148.50*/("""{"""),format.raw/*148.51*/("""
		            chart: """),format.raw/*149.22*/("""{"""),format.raw/*149.23*/("""
		                type: 'spline',
		                animation: Highcharts.svg, // don't animate in old IE
		                marginRight: 5,
		                events: """),format.raw/*153.27*/("""{"""),format.raw/*153.28*/("""
		                    load: function() """),format.raw/*154.40*/("""{"""),format.raw/*154.41*/("""
		    
		                        // set up the updating of the chart each second
		                        var series = this.series[0];
		                        setInterval(function() """),format.raw/*158.50*/("""{"""),format.raw/*158.51*/("""
		                            var x = (new Date()).getTime(), // current time
		                                y = Math.random()*100;
		                            series.addPoint([x, y], true, true);
		                        """),format.raw/*162.27*/("""}"""),format.raw/*162.28*/(""", 2000);
		                    """),format.raw/*163.23*/("""}"""),format.raw/*163.24*/("""
		                """),format.raw/*164.19*/("""}"""),format.raw/*164.20*/("""
		            """),format.raw/*165.15*/("""}"""),format.raw/*165.16*/(""",
		            title: """),format.raw/*166.22*/("""{"""),format.raw/*166.23*/("""
		                text: 'Speed'
		            """),format.raw/*168.15*/("""}"""),format.raw/*168.16*/(""",
		            xAxis: """),format.raw/*169.22*/("""{"""),format.raw/*169.23*/("""
		                title: """),format.raw/*170.26*/("""{"""),format.raw/*170.27*/("""
		                    text: 'Time'
		                """),format.raw/*172.19*/("""}"""),format.raw/*172.20*/(""",
		                type: 'datetime',
		                tickPixelInterval: 150
		            """),format.raw/*175.15*/("""}"""),format.raw/*175.16*/(""",
		            
		            yAxis: """),format.raw/*177.22*/("""{"""),format.raw/*177.23*/("""
		                title: """),format.raw/*178.26*/("""{"""),format.raw/*178.27*/("""
		                    text: 'Percentage'
		                """),format.raw/*180.19*/("""}"""),format.raw/*180.20*/(""",
		                min: 0,
		                max: 100,
		                 labels: """),format.raw/*183.28*/("""{"""),format.raw/*183.29*/("""
		                    formatter: function() """),format.raw/*184.45*/("""{"""),format.raw/*184.46*/("""
		                        if (this.value == 100) """),format.raw/*185.50*/("""{"""),format.raw/*185.51*/("""
		                            return 'Too Fast';
		                        """),format.raw/*187.27*/("""}"""),format.raw/*187.28*/("""
		                        
		                        if (this.value == 50) """),format.raw/*189.49*/("""{"""),format.raw/*189.50*/("""
		                            return 'OK';
		                        """),format.raw/*191.27*/("""}"""),format.raw/*191.28*/("""
		                        
		                        
		                        if (this.value == 0) """),format.raw/*194.48*/("""{"""),format.raw/*194.49*/("""
		                            return 'Too Slow';
		                        """),format.raw/*196.27*/("""}"""),format.raw/*196.28*/("""
		                    """),format.raw/*197.23*/("""}"""),format.raw/*197.24*/("""
		                """),format.raw/*198.19*/("""}"""),format.raw/*198.20*/(""",
		            """),format.raw/*199.15*/("""}"""),format.raw/*199.16*/(""",
		            tooltip: """),format.raw/*200.24*/("""{"""),format.raw/*200.25*/("""
		                formatter: function() """),format.raw/*201.41*/("""{"""),format.raw/*201.42*/("""
		                        return 'At time: ' + Highcharts.dateFormat('%H:%M:%S', this.x) +'<br/>' + 'Average speed requested ' + Highcharts.numberFormat(this.y, 2) + '%';
		                """),format.raw/*203.19*/("""}"""),format.raw/*203.20*/("""
		            """),format.raw/*204.15*/("""}"""),format.raw/*204.16*/(""",
		            legend: """),format.raw/*205.23*/("""{"""),format.raw/*205.24*/("""
		                enabled: false
		            """),format.raw/*207.15*/("""}"""),format.raw/*207.16*/(""",
		            exporting: """),format.raw/*208.26*/("""{"""),format.raw/*208.27*/("""
		                enabled: false
		            """),format.raw/*210.15*/("""}"""),format.raw/*210.16*/(""",
		            series: ["""),format.raw/*211.24*/("""{"""),format.raw/*211.25*/("""
		                name: 'Random data',
		                data: (function() """),format.raw/*213.37*/("""{"""),format.raw/*213.38*/("""
		                    // generate an array of random data
		                    var data = [],
		                        time = (new Date()).getTime(),
		                        i;
		    
		                    for (i = -5; i <= 0; i++) """),format.raw/*219.49*/("""{"""),format.raw/*219.50*/("""
		                        data.push("""),format.raw/*220.37*/("""{"""),format.raw/*220.38*/("""
		                            x: time + i * 1000,
		                            y: 50
		                        """),format.raw/*223.27*/("""}"""),format.raw/*223.28*/(""");
		                    """),format.raw/*224.23*/("""}"""),format.raw/*224.24*/("""
		                    return data;
		                """),format.raw/*226.19*/("""}"""),format.raw/*226.20*/(""")()
		            """),format.raw/*227.15*/("""}"""),format.raw/*227.16*/("""]
		        """),format.raw/*228.11*/("""}"""),format.raw/*228.12*/(""");
		    """),format.raw/*229.7*/("""}"""),format.raw/*229.8*/(""");
		    
		"""),format.raw/*231.3*/("""}"""),format.raw/*231.4*/(""");
    	</script>
    
    
		<script>
		$(function () """),format.raw/*236.17*/("""{"""),format.raw/*236.18*/("""
		    $(document).ready(function() """),format.raw/*237.36*/("""{"""),format.raw/*237.37*/("""
		        Highcharts.setOptions("""),format.raw/*238.33*/("""{"""),format.raw/*238.34*/("""
		            global: """),format.raw/*239.23*/("""{"""),format.raw/*239.24*/("""
		                useUTC: false
		            """),format.raw/*241.15*/("""}"""),format.raw/*241.16*/("""
		        """),format.raw/*242.11*/("""}"""),format.raw/*242.12*/(""");
		    
		        var chart;
		        $('#container-loudness-chart').highcharts("""),format.raw/*245.53*/("""{"""),format.raw/*245.54*/("""
		            chart: """),format.raw/*246.22*/("""{"""),format.raw/*246.23*/("""
		                type: 'spline',
		                animation: Highcharts.svg, // don't animate in old IE
		                marginRight: 5,
		                events: """),format.raw/*250.27*/("""{"""),format.raw/*250.28*/("""
		                    load: function() """),format.raw/*251.40*/("""{"""),format.raw/*251.41*/("""
		    
		                        // set up the updating of the chart each second
		                        var series = this.series[0];
		                        setInterval(function() """),format.raw/*255.50*/("""{"""),format.raw/*255.51*/("""
		                            var x = (new Date()).getTime(), // current time
		                                y = Math.random()*100;
		                            series.addPoint([x, y], true, true);
		                        """),format.raw/*259.27*/("""}"""),format.raw/*259.28*/(""", 2000);
		                    """),format.raw/*260.23*/("""}"""),format.raw/*260.24*/("""
		                """),format.raw/*261.19*/("""}"""),format.raw/*261.20*/("""
		            """),format.raw/*262.15*/("""}"""),format.raw/*262.16*/(""",
		            title: """),format.raw/*263.22*/("""{"""),format.raw/*263.23*/("""
		                text: 'Loudness'
		            """),format.raw/*265.15*/("""}"""),format.raw/*265.16*/(""",
		            xAxis: """),format.raw/*266.22*/("""{"""),format.raw/*266.23*/("""
		                title: """),format.raw/*267.26*/("""{"""),format.raw/*267.27*/("""
		                    text: 'Time'
		                """),format.raw/*269.19*/("""}"""),format.raw/*269.20*/(""",
		                type: 'datetime',
		                tickPixelInterval: 150
		            """),format.raw/*272.15*/("""}"""),format.raw/*272.16*/(""",
		            
		            yAxis: """),format.raw/*274.22*/("""{"""),format.raw/*274.23*/("""
		                title: """),format.raw/*275.26*/("""{"""),format.raw/*275.27*/("""
		                    text: 'Percentage'
		                """),format.raw/*277.19*/("""}"""),format.raw/*277.20*/(""",
		                min: 0,
		                max: 100,
		                 labels: """),format.raw/*280.28*/("""{"""),format.raw/*280.29*/("""
		                    formatter: function() """),format.raw/*281.45*/("""{"""),format.raw/*281.46*/("""
		                        if (this.value == 100) """),format.raw/*282.50*/("""{"""),format.raw/*282.51*/("""
		                            return 'Too Loud';
		                        """),format.raw/*284.27*/("""}"""),format.raw/*284.28*/("""
		                        
		                        if (this.value == 50) """),format.raw/*286.49*/("""{"""),format.raw/*286.50*/("""
		                            return 'OK';
		                        """),format.raw/*288.27*/("""}"""),format.raw/*288.28*/("""
		                        
		                        
		                        if (this.value == 0) """),format.raw/*291.48*/("""{"""),format.raw/*291.49*/("""
		                            return 'Too Quiet';
		                        """),format.raw/*293.27*/("""}"""),format.raw/*293.28*/("""
		                    """),format.raw/*294.23*/("""}"""),format.raw/*294.24*/("""
		                """),format.raw/*295.19*/("""}"""),format.raw/*295.20*/(""",
		            """),format.raw/*296.15*/("""}"""),format.raw/*296.16*/(""",
		            tooltip: """),format.raw/*297.24*/("""{"""),format.raw/*297.25*/("""
		                formatter: function() """),format.raw/*298.41*/("""{"""),format.raw/*298.42*/("""
		                        return 'At time: ' + Highcharts.dateFormat('%H:%M:%S', this.x) +'<br/>' + 'Average loudness requested ' + Highcharts.numberFormat(this.y, 2) + '%';
		                """),format.raw/*300.19*/("""}"""),format.raw/*300.20*/("""
		            """),format.raw/*301.15*/("""}"""),format.raw/*301.16*/(""",
		            legend: """),format.raw/*302.23*/("""{"""),format.raw/*302.24*/("""
		                enabled: false
		            """),format.raw/*304.15*/("""}"""),format.raw/*304.16*/(""",
		            exporting: """),format.raw/*305.26*/("""{"""),format.raw/*305.27*/("""
		                enabled: false
		            """),format.raw/*307.15*/("""}"""),format.raw/*307.16*/(""",
		            series: ["""),format.raw/*308.24*/("""{"""),format.raw/*308.25*/("""
		                name: 'Random data',
		                data: (function() """),format.raw/*310.37*/("""{"""),format.raw/*310.38*/("""
		                    // generate an array of random data
		                    var data = [],
		                        time = (new Date()).getTime(),
		                        i;
		    
		                    for (i = -5; i <= 0; i++) """),format.raw/*316.49*/("""{"""),format.raw/*316.50*/("""
		                        data.push("""),format.raw/*317.37*/("""{"""),format.raw/*317.38*/("""
		                            x: time + i * 1000,
		                            y: 50
		                        """),format.raw/*320.27*/("""}"""),format.raw/*320.28*/(""");
		                    """),format.raw/*321.23*/("""}"""),format.raw/*321.24*/("""
		                    return data;
		                """),format.raw/*323.19*/("""}"""),format.raw/*323.20*/(""")()
		            """),format.raw/*324.15*/("""}"""),format.raw/*324.16*/("""]
		        """),format.raw/*325.11*/("""}"""),format.raw/*325.12*/(""");
		    """),format.raw/*326.7*/("""}"""),format.raw/*326.8*/(""");
		    
		"""),format.raw/*328.3*/("""}"""),format.raw/*328.4*/(""");
    	</script>
    
    	<script>
    	$(function () """),format.raw/*332.20*/("""{"""),format.raw/*332.21*/("""
    		
    	    var gaugeOptions = """),format.raw/*334.29*/("""{"""),format.raw/*334.30*/("""
    		
    		    chart: """),format.raw/*336.18*/("""{"""),format.raw/*336.19*/("""
    		        type: 'solidgauge'
    		    """),format.raw/*338.11*/("""}"""),format.raw/*338.12*/(""",
    		    
    		    title: null,
    		    
    		    pane: """),format.raw/*342.17*/("""{"""),format.raw/*342.18*/("""
    		    	center: ['50%', '85%'],
    		    	size: '140%',
    		        startAngle: -90,
    		        endAngle: 90,
    	            background: """),format.raw/*347.30*/("""{"""),format.raw/*347.31*/("""
    	                backgroundColor: (Highcharts.theme && Highcharts.theme.background2) || '#EEE',
    	                innerRadius: '60%',
    	                outerRadius: '100%',
    	                shape: 'arc'
    	            """),format.raw/*352.18*/("""}"""),format.raw/*352.19*/("""
    		    """),format.raw/*353.11*/("""}"""),format.raw/*353.12*/(""",

    		    tooltip: """),format.raw/*355.20*/("""{"""),format.raw/*355.21*/("""
    		    	enabled: false
    		    """),format.raw/*357.11*/("""}"""),format.raw/*357.12*/(""",
    		       
    		    // the value axis
    		    yAxis: """),format.raw/*360.18*/("""{"""),format.raw/*360.19*/("""
    				stops: [
    					[0.1, '#55BF3B'], // green
    		        	[0.5, '#DDDF0D'], // yellow
    		        	[0.9, '#DF5353'] // red
    				],
    				lineWidth: 0,
    	            minorTickInterval: null,
    	            tickPixelInterval: 400,
    	            tickWidth: 0,
    		        title: """),format.raw/*370.22*/("""{"""),format.raw/*370.23*/("""
    	                y: -70
    		        """),format.raw/*372.15*/("""}"""),format.raw/*372.16*/(""",
    	            labels: """),format.raw/*373.26*/("""{"""),format.raw/*373.27*/("""
    	                y: 16
    	            """),format.raw/*375.18*/("""}"""),format.raw/*375.19*/("""        
    		    """),format.raw/*376.11*/("""}"""),format.raw/*376.12*/(""",
    	        
    	        plotOptions: """),format.raw/*378.27*/("""{"""),format.raw/*378.28*/("""
    	            solidgauge: """),format.raw/*379.30*/("""{"""),format.raw/*379.31*/("""
    	                dataLabels: """),format.raw/*380.34*/("""{"""),format.raw/*380.35*/("""
    	                    y: 5,
    	                    borderWidth: 0,
    	                    useHTML: true
    	                """),format.raw/*384.22*/("""}"""),format.raw/*384.23*/(""",
    	                states: """),format.raw/*385.30*/("""{"""),format.raw/*385.31*/("""
                            hover: """),format.raw/*386.36*/("""{"""),format.raw/*386.37*/("""
                                enabled: true
                            """),format.raw/*388.29*/("""}"""),format.raw/*388.30*/("""
                        """),format.raw/*389.25*/("""}"""),format.raw/*389.26*/("""
    	                
    	            """),format.raw/*391.18*/("""}"""),format.raw/*391.19*/("""
    		    
    		    
    	        """),format.raw/*394.14*/("""}"""),format.raw/*394.15*/("""
    	    """),format.raw/*395.10*/("""}"""),format.raw/*395.11*/(""";
    	    
    	    // The speed gauge
    	    $('#container-speed').highcharts(Highcharts.merge(gaugeOptions, """),format.raw/*398.74*/("""{"""),format.raw/*398.75*/("""
    	        yAxis: """),format.raw/*399.21*/("""{"""),format.raw/*399.22*/("""
    		        min: 0,
    		        max: 100,
    		        title: """),format.raw/*402.22*/("""{"""),format.raw/*402.23*/("""
    		            text: 'Pause'
    		        """),format.raw/*404.15*/("""}"""),format.raw/*404.16*/("""       
    		    """),format.raw/*405.11*/("""}"""),format.raw/*405.12*/(""",

    		    credits: """),format.raw/*407.20*/("""{"""),format.raw/*407.21*/("""
    		    	enabled: false
    		    """),format.raw/*409.11*/("""}"""),format.raw/*409.12*/(""",
    		
    		    series: ["""),format.raw/*411.20*/("""{"""),format.raw/*411.21*/("""
    		        name: 'Pause',
    		        data: [80],
    		        dataLabels: """),format.raw/*414.27*/("""{"""),format.raw/*414.28*/("""
    		        	format: '<div style="text-align:center"><span style="font-size:25px;color:' + 
    	                    ((Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black') + '">"""),format.raw/*416.101*/("""{"""),format.raw/*416.102*/("""y"""),format.raw/*416.103*/("""}"""),format.raw/*416.104*/("""</span><br/>' + 
    	                   	'<span style="font-size:12px;color:silver">Pause counts</span></div>'
    		        """),format.raw/*418.15*/("""}"""),format.raw/*418.16*/(""",
    		        tooltip: """),format.raw/*419.24*/("""{"""),format.raw/*419.25*/("""
    		            valueSuffix: 'Number of persons voted for pause'
    		        """),format.raw/*421.15*/("""}"""),format.raw/*421.16*/("""
    		    """),format.raw/*422.11*/("""}"""),format.raw/*422.12*/("""]
    		
    		"""),format.raw/*424.7*/("""}"""),format.raw/*424.8*/("""));
    	    
    	    // The RPM gauge
    	    ;
    	                               
    	    // Bring life to the dials
    	    setInterval(function () """),format.raw/*430.34*/("""{"""),format.raw/*430.35*/("""
    	    	// Speed
    	        var chart = $('#container-speed').highcharts();
    	        if (chart) """),format.raw/*433.25*/("""{"""),format.raw/*433.26*/("""
    	            var point = chart.series[0].points[0],
    	                newVal,
    	                inc = Math.round((Math.random() - 0.5) * 100);
    	            
    	            newVal = point.y + inc;
    	            if (newVal < 0 || newVal > 100) """),format.raw/*439.50*/("""{"""),format.raw/*439.51*/("""
    	                newVal = point.y - inc;
    	            """),format.raw/*441.18*/("""}"""),format.raw/*441.19*/("""
    	            
    	            point.update(newVal);
    	        """),format.raw/*444.14*/("""}"""),format.raw/*444.15*/("""

    	    """),format.raw/*446.10*/("""}"""),format.raw/*446.11*/(""", 2000);  
    	    
    		
    	"""),format.raw/*449.6*/("""}"""),format.raw/*449.7*/(""");
    	</script>
		
    </head>
    <body>
	<p>HIGHCHARTS GOES HERE</p>

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
                    DATE: Mon Jun 09 15:52:14 CEST 2014
                    SOURCE: /home/aalfath/git/LiveFeedSebaTeam/app/views/profPage.scala.html
                    HASH: c945ea159b9698fb22494f153111823074bbf298
                    MATRIX: 775->1|899->15|926->33|1090->161|1105->167|1161->201|1258->262|1273->268|1327->300|1420->357|1435->363|1511->416|1604->473|1619->479|1691->528|1753->554|1768->560|1835->605|2015->757|2044->758|2114->800|2143->801|2210->840|2239->841|2296->870|2325->871|2412->930|2441->931|2486->948|2515->949|2651->1057|2680->1058|2736->1086|2765->1087|2985->1279|3014->1280|3088->1326|3117->1327|3595->1777|3624->1778|3740->1866|3769->1867|3866->1936|3895->1937|4033->2047|4062->2048|4240->2198|4269->2199|4405->2307|4434->2308|4597->2443|4626->2444|4876->2666|4905->2667|5100->2834|5129->2835|5379->3057|5408->3058|5545->3167|5574->3168|5890->3456|5919->3457|5984->3494|6013->3495|6066->3520|6095->3521|6144->3542|6173->3543|6251->3593|6280->3594|6378->3664|6407->3665|6464->3694|6493->3695|6631->3805|6660->3806|6717->3835|6746->3836|6806->3868|6835->3869|6930->3936|6959->3937|7025->3975|7054->3976|7229->4122|7259->4123|7310->4145|7340->4146|7400->4177|7430->4178|7506->4225|7536->4226|7828->4489|7858->4490|7908->4511|7938->4512|7997->4542|8027->4543|8116->4603|8146->4604|8208->4637|8238->4638|8327->4698|8357->4699|8417->4730|8447->4731|8564->4819|8594->4820|8897->5094|8927->5095|8999->5138|9029->5139|9200->5281|9230->5282|9290->5313|9320->5314|9415->5380|9445->5381|9498->5405|9528->5406|9575->5424|9605->5425|9649->5440|9679->5441|9731->5465|9761->5466|9839->5515|9869->5516|9934->5552|9964->5553|10026->5586|10056->5587|10108->5610|10138->5611|10214->5658|10244->5659|10284->5670|10314->5671|10423->5751|10453->5752|10504->5774|10534->5775|10730->5942|10760->5943|10829->5983|10859->5984|11074->6170|11104->6171|11362->6400|11392->6401|11452->6432|11482->6433|11530->6452|11560->6453|11604->6468|11634->6469|11686->6492|11716->6493|11792->6540|11822->6541|11874->6564|11904->6565|11959->6591|11989->6592|12072->6646|12102->6647|12224->6740|12254->6741|12321->6779|12351->6780|12406->6806|12436->6807|12525->6867|12555->6868|12667->6951|12697->6952|12771->6997|12801->6998|12880->7048|12910->7049|13015->7125|13045->7126|13150->7202|13180->7203|13279->7273|13309->7274|13440->7376|13470->7377|13575->7453|13605->7454|13657->7477|13687->7478|13735->7497|13765->7498|13810->7514|13840->7515|13894->7540|13924->7541|13994->7582|14024->7583|14243->7773|14273->7774|14317->7789|14347->7790|14400->7814|14430->7815|14507->7863|14537->7864|14593->7891|14623->7892|14700->7940|14730->7941|14784->7966|14814->7967|14919->8043|14949->8044|15215->8281|15245->8282|15311->8319|15341->8320|15483->8433|15513->8434|15567->8459|15597->8460|15680->8514|15710->8515|15757->8533|15787->8534|15828->8546|15858->8547|15895->8556|15924->8557|15964->8569|15993->8570|16077->8625|16107->8626|16172->8662|16202->8663|16264->8696|16294->8697|16346->8720|16376->8721|16452->8768|16482->8769|16522->8780|16552->8781|16664->8864|16694->8865|16745->8887|16775->8888|16971->9055|17001->9056|17070->9096|17100->9097|17315->9283|17345->9284|17603->9513|17633->9514|17693->9545|17723->9546|17771->9565|17801->9566|17845->9581|17875->9582|17927->9605|17957->9606|18036->9656|18066->9657|18118->9680|18148->9681|18203->9707|18233->9708|18316->9762|18346->9763|18468->9856|18498->9857|18565->9895|18595->9896|18650->9922|18680->9923|18769->9983|18799->9984|18911->10067|18941->10068|19015->10113|19045->10114|19124->10164|19154->10165|19259->10241|19289->10242|19394->10318|19424->10319|19523->10389|19553->10390|19684->10492|19714->10493|19820->10570|19850->10571|19902->10594|19932->10595|19980->10614|20010->10615|20055->10631|20085->10632|20139->10657|20169->10658|20239->10699|20269->10700|20491->10893|20521->10894|20565->10909|20595->10910|20648->10934|20678->10935|20755->10983|20785->10984|20841->11011|20871->11012|20948->11060|20978->11061|21032->11086|21062->11087|21167->11163|21197->11164|21463->11401|21493->11402|21559->11439|21589->11440|21731->11553|21761->11554|21815->11579|21845->11580|21928->11634|21958->11635|22005->11653|22035->11654|22076->11666|22106->11667|22143->11676|22172->11677|22212->11689|22241->11690|22326->11746|22356->11747|22421->11783|22451->11784|22505->11809|22535->11810|22608->11854|22638->11855|22730->11918|22760->11919|22938->12068|22968->12069|23232->12304|23262->12305|23302->12316|23332->12317|23383->12339|23413->12340|23479->12377|23509->12378|23599->12439|23629->12440|23962->12744|23992->12745|24064->12788|24094->12789|24150->12816|24180->12817|24254->12862|24284->12863|24332->12882|24362->12883|24433->12925|24463->12926|24522->12956|24552->12957|24615->12991|24645->12992|24807->13125|24837->13126|24897->13157|24927->13158|24992->13194|25022->13195|25126->13270|25156->13271|25210->13296|25240->13297|25309->13337|25339->13338|25404->13374|25434->13375|25473->13385|25503->13386|25645->13499|25675->13500|25725->13521|25755->13522|25852->13590|25882->13591|25958->13638|25988->13639|26035->13657|26065->13658|26116->13680|26146->13681|26212->13718|26242->13719|26299->13747|26329->13748|26440->13830|26470->13831|26695->14026|26726->14027|26757->14028|26788->14029|26943->14155|26973->14156|27027->14181|27057->14182|27168->14264|27198->14265|27238->14276|27268->14277|27311->14292|27340->14293|27526->14450|27556->14451|27690->14556|27720->14557|28011->14819|28041->14820|28133->14883|28163->14884|28263->14955|28293->14956|28333->14967|28363->14968|28424->15001|28453->15002
                    LINES: 26->1|30->1|31->3|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|43->15|43->15|43->15|50->22|50->22|51->23|51->23|52->24|52->24|53->25|53->25|55->27|55->27|56->28|56->28|61->33|61->33|62->34|62->34|66->38|66->38|67->39|67->39|75->47|75->47|77->49|77->49|79->51|79->51|81->53|81->53|84->56|84->56|86->58|86->58|89->61|89->61|93->65|93->65|96->68|96->68|100->72|100->72|103->75|103->75|108->80|108->80|109->81|109->81|110->82|110->82|111->83|111->83|113->85|113->85|115->87|115->87|116->88|116->88|119->91|119->91|120->92|120->92|121->93|121->93|123->95|123->95|124->96|124->96|128->100|128->100|129->101|129->101|130->102|130->102|131->103|131->103|135->107|135->107|136->108|136->108|137->109|137->109|139->111|139->111|140->112|140->112|142->114|142->114|143->115|143->115|145->117|145->117|151->123|151->123|152->124|152->124|155->127|155->127|156->128|156->128|158->130|158->130|159->131|159->131|160->132|160->132|161->133|161->133|163->135|163->135|167->139|167->139|168->140|168->140|169->141|169->141|170->142|170->142|172->144|172->144|173->145|173->145|176->148|176->148|177->149|177->149|181->153|181->153|182->154|182->154|186->158|186->158|190->162|190->162|191->163|191->163|192->164|192->164|193->165|193->165|194->166|194->166|196->168|196->168|197->169|197->169|198->170|198->170|200->172|200->172|203->175|203->175|205->177|205->177|206->178|206->178|208->180|208->180|211->183|211->183|212->184|212->184|213->185|213->185|215->187|215->187|217->189|217->189|219->191|219->191|222->194|222->194|224->196|224->196|225->197|225->197|226->198|226->198|227->199|227->199|228->200|228->200|229->201|229->201|231->203|231->203|232->204|232->204|233->205|233->205|235->207|235->207|236->208|236->208|238->210|238->210|239->211|239->211|241->213|241->213|247->219|247->219|248->220|248->220|251->223|251->223|252->224|252->224|254->226|254->226|255->227|255->227|256->228|256->228|257->229|257->229|259->231|259->231|264->236|264->236|265->237|265->237|266->238|266->238|267->239|267->239|269->241|269->241|270->242|270->242|273->245|273->245|274->246|274->246|278->250|278->250|279->251|279->251|283->255|283->255|287->259|287->259|288->260|288->260|289->261|289->261|290->262|290->262|291->263|291->263|293->265|293->265|294->266|294->266|295->267|295->267|297->269|297->269|300->272|300->272|302->274|302->274|303->275|303->275|305->277|305->277|308->280|308->280|309->281|309->281|310->282|310->282|312->284|312->284|314->286|314->286|316->288|316->288|319->291|319->291|321->293|321->293|322->294|322->294|323->295|323->295|324->296|324->296|325->297|325->297|326->298|326->298|328->300|328->300|329->301|329->301|330->302|330->302|332->304|332->304|333->305|333->305|335->307|335->307|336->308|336->308|338->310|338->310|344->316|344->316|345->317|345->317|348->320|348->320|349->321|349->321|351->323|351->323|352->324|352->324|353->325|353->325|354->326|354->326|356->328|356->328|360->332|360->332|362->334|362->334|364->336|364->336|366->338|366->338|370->342|370->342|375->347|375->347|380->352|380->352|381->353|381->353|383->355|383->355|385->357|385->357|388->360|388->360|398->370|398->370|400->372|400->372|401->373|401->373|403->375|403->375|404->376|404->376|406->378|406->378|407->379|407->379|408->380|408->380|412->384|412->384|413->385|413->385|414->386|414->386|416->388|416->388|417->389|417->389|419->391|419->391|422->394|422->394|423->395|423->395|426->398|426->398|427->399|427->399|430->402|430->402|432->404|432->404|433->405|433->405|435->407|435->407|437->409|437->409|439->411|439->411|442->414|442->414|444->416|444->416|444->416|444->416|446->418|446->418|447->419|447->419|449->421|449->421|450->422|450->422|452->424|452->424|458->430|458->430|461->433|461->433|467->439|467->439|469->441|469->441|472->444|472->444|474->446|474->446|477->449|477->449
                    -- GENERATED --
                */
            