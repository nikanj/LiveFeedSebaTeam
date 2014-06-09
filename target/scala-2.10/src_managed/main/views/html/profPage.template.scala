
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
			$(function () """),format.raw/*139.18*/("""{"""),format.raw/*139.19*/("""
		        $('#container').highcharts("""),format.raw/*140.38*/("""{"""),format.raw/*140.39*/("""
		            chart: """),format.raw/*141.22*/("""{"""),format.raw/*141.23*/("""
		                type: 'area'
		            """),format.raw/*143.15*/("""}"""),format.raw/*143.16*/(""",
		            title: """),format.raw/*144.22*/("""{"""),format.raw/*144.23*/("""
		                text: 'Speed vote'
		            """),format.raw/*146.15*/("""}"""),format.raw/*146.16*/(""",
		            xAxis: """),format.raw/*147.22*/("""{"""),format.raw/*147.23*/("""
		                title: """),format.raw/*148.26*/("""{"""),format.raw/*148.27*/("""
		                    text: 'Time'  
		                """),format.raw/*150.19*/("""}"""),format.raw/*150.20*/(""",
		                allowDecimals: false,
		                labels: """),format.raw/*152.27*/("""{"""),format.raw/*152.28*/("""
		                    formatter: function() """),format.raw/*153.45*/("""{"""),format.raw/*153.46*/("""
		                        return this.value; // clean, unformatted number for year
		                    """),format.raw/*155.23*/("""}"""),format.raw/*155.24*/("""
		                """),format.raw/*156.19*/("""}"""),format.raw/*156.20*/("""
		            """),format.raw/*157.15*/("""}"""),format.raw/*157.16*/(""",
		            yAxis: """),format.raw/*158.22*/("""{"""),format.raw/*158.23*/("""
		                title: """),format.raw/*159.26*/("""{"""),format.raw/*159.27*/("""
		                    text: 'Percentage'
		                """),format.raw/*161.19*/("""}"""),format.raw/*161.20*/(""",
		                labels: """),format.raw/*162.27*/("""{"""),format.raw/*162.28*/("""
		                    formatter: function() """),format.raw/*163.45*/("""{"""),format.raw/*163.46*/("""
		                        return this.value;
		                    """),format.raw/*165.23*/("""}"""),format.raw/*165.24*/("""
		                """),format.raw/*166.19*/("""}"""),format.raw/*166.20*/("""
		            """),format.raw/*167.15*/("""}"""),format.raw/*167.16*/(""",
		            tooltip: """),format.raw/*168.24*/("""{"""),format.raw/*168.25*/("""
		                pointFormat: 'At time: """),format.raw/*169.42*/("""{"""),format.raw/*169.43*/("""point.x"""),format.raw/*169.50*/("""}"""),format.raw/*169.51*/(""". Average speed requested: """),format.raw/*169.78*/("""{"""),format.raw/*169.79*/("""point.y:,.0f"""),format.raw/*169.91*/("""}"""),format.raw/*169.92*/("""'
		            """),format.raw/*170.15*/("""}"""),format.raw/*170.16*/(""",
		            plotOptions: """),format.raw/*171.28*/("""{"""),format.raw/*171.29*/("""
		                area: """),format.raw/*172.25*/("""{"""),format.raw/*172.26*/("""
		                    pointStart: 0,
		                    marker: """),format.raw/*174.31*/("""{"""),format.raw/*174.32*/("""
		                        enabled: false,
		                        symbol: 'circle',
		                        radius: 1,
		                        states: """),format.raw/*178.35*/("""{"""),format.raw/*178.36*/("""
		                            hover: """),format.raw/*179.38*/("""{"""),format.raw/*179.39*/("""
		                                enabled: true
		                            """),format.raw/*181.31*/("""}"""),format.raw/*181.32*/("""
		                        """),format.raw/*182.27*/("""}"""),format.raw/*182.28*/("""
		                    """),format.raw/*183.23*/("""}"""),format.raw/*183.24*/("""
		                """),format.raw/*184.19*/("""}"""),format.raw/*184.20*/("""
		            """),format.raw/*185.15*/("""}"""),format.raw/*185.16*/(""",
		            series: ["""),format.raw/*186.24*/("""{"""),format.raw/*186.25*/("""
		                name: 'Speed',
		                data: [40, 50, 60, 80, 30, 40, 50, 60 ]
		            """),format.raw/*189.15*/("""}"""),format.raw/*189.16*/("""]
		        """),format.raw/*190.11*/("""}"""),format.raw/*190.12*/(""");
		    """),format.raw/*191.7*/("""}"""),format.raw/*191.8*/(""");
		    
    	</script>
    
    	<script>
    	$(function () """),format.raw/*196.20*/("""{"""),format.raw/*196.21*/("""
    		
    	    var gaugeOptions = """),format.raw/*198.29*/("""{"""),format.raw/*198.30*/("""
    		
    		    chart: """),format.raw/*200.18*/("""{"""),format.raw/*200.19*/("""
    		        type: 'solidgauge'
    		    """),format.raw/*202.11*/("""}"""),format.raw/*202.12*/(""",
    		    
    		    title: null,
    		    
    		    pane: """),format.raw/*206.17*/("""{"""),format.raw/*206.18*/("""
    		    	center: ['50%', '85%'],
    		    	size: '140%',
    		        startAngle: -90,
    		        endAngle: 90,
    	            background: """),format.raw/*211.30*/("""{"""),format.raw/*211.31*/("""
    	                backgroundColor: (Highcharts.theme && Highcharts.theme.background2) || '#EEE',
    	                innerRadius: '60%',
    	                outerRadius: '100%',
    	                shape: 'arc'
    	            """),format.raw/*216.18*/("""}"""),format.raw/*216.19*/("""
    		    """),format.raw/*217.11*/("""}"""),format.raw/*217.12*/(""",

    		    tooltip: """),format.raw/*219.20*/("""{"""),format.raw/*219.21*/("""
    		    	enabled: false
    		    """),format.raw/*221.11*/("""}"""),format.raw/*221.12*/(""",
    		       
    		    // the value axis
    		    yAxis: """),format.raw/*224.18*/("""{"""),format.raw/*224.19*/("""
    				stops: [
    					[0.1, '#55BF3B'], // green
    		        	[0.5, '#DDDF0D'], // yellow
    		        	[0.9, '#DF5353'] // red
    				],
    				lineWidth: 0,
    	            minorTickInterval: null,
    	            tickPixelInterval: 400,
    	            tickWidth: 0,
    		        title: """),format.raw/*234.22*/("""{"""),format.raw/*234.23*/("""
    	                y: -70
    		        """),format.raw/*236.15*/("""}"""),format.raw/*236.16*/(""",
    	            labels: """),format.raw/*237.26*/("""{"""),format.raw/*237.27*/("""
    	                y: 16
    	            """),format.raw/*239.18*/("""}"""),format.raw/*239.19*/("""        
    		    """),format.raw/*240.11*/("""}"""),format.raw/*240.12*/(""",
    	        
    	        plotOptions: """),format.raw/*242.27*/("""{"""),format.raw/*242.28*/("""
    	            solidgauge: """),format.raw/*243.30*/("""{"""),format.raw/*243.31*/("""
    	                dataLabels: """),format.raw/*244.34*/("""{"""),format.raw/*244.35*/("""
    	                    y: 5,
    	                    borderWidth: 0,
    	                    useHTML: true
    	                """),format.raw/*248.22*/("""}"""),format.raw/*248.23*/(""",
    	                states: """),format.raw/*249.30*/("""{"""),format.raw/*249.31*/("""
                            hover: """),format.raw/*250.36*/("""{"""),format.raw/*250.37*/("""
                                enabled: true
                            """),format.raw/*252.29*/("""}"""),format.raw/*252.30*/("""
                        """),format.raw/*253.25*/("""}"""),format.raw/*253.26*/("""
    	                
    	            """),format.raw/*255.18*/("""}"""),format.raw/*255.19*/("""
    		    
    		    
    	        """),format.raw/*258.14*/("""}"""),format.raw/*258.15*/("""
    	    """),format.raw/*259.10*/("""}"""),format.raw/*259.11*/(""";
    	    
    	    // The speed gauge
    	    $('#container-speed').highcharts(Highcharts.merge(gaugeOptions, """),format.raw/*262.74*/("""{"""),format.raw/*262.75*/("""
    	        yAxis: """),format.raw/*263.21*/("""{"""),format.raw/*263.22*/("""
    		        min: 0,
    		        max: 100,
    		        title: """),format.raw/*266.22*/("""{"""),format.raw/*266.23*/("""
    		            text: 'Pause'
    		        """),format.raw/*268.15*/("""}"""),format.raw/*268.16*/("""       
    		    """),format.raw/*269.11*/("""}"""),format.raw/*269.12*/(""",

    		    credits: """),format.raw/*271.20*/("""{"""),format.raw/*271.21*/("""
    		    	enabled: false
    		    """),format.raw/*273.11*/("""}"""),format.raw/*273.12*/(""",
    		
    		    series: ["""),format.raw/*275.20*/("""{"""),format.raw/*275.21*/("""
    		        name: 'Pause',
    		        data: [80],
    		        dataLabels: """),format.raw/*278.27*/("""{"""),format.raw/*278.28*/("""
    		        	format: '<div style="text-align:center"><span style="font-size:25px;color:' + 
    	                    ((Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black') + '">"""),format.raw/*280.101*/("""{"""),format.raw/*280.102*/("""y"""),format.raw/*280.103*/("""}"""),format.raw/*280.104*/("""</span><br/>' + 
    	                   	'<span style="font-size:12px;color:silver">Pause counts</span></div>'
    		        """),format.raw/*282.15*/("""}"""),format.raw/*282.16*/(""",
    		        tooltip: """),format.raw/*283.24*/("""{"""),format.raw/*283.25*/("""
    		            valueSuffix: 'Number of persons voted for pause'
    		        """),format.raw/*285.15*/("""}"""),format.raw/*285.16*/("""
    		    """),format.raw/*286.11*/("""}"""),format.raw/*286.12*/("""]
    		
    		"""),format.raw/*288.7*/("""}"""),format.raw/*288.8*/("""));
    	    
    	    // The RPM gauge
    	    ;
    	                               
    	    // Bring life to the dials
    	    setInterval(function () """),format.raw/*294.34*/("""{"""),format.raw/*294.35*/("""
    	    	// Speed
    	        var chart = $('#container-speed').highcharts();
    	        if (chart) """),format.raw/*297.25*/("""{"""),format.raw/*297.26*/("""
    	            var point = chart.series[0].points[0],
    	                newVal,
    	                inc = Math.round((Math.random() - 0.5) * 100);
    	            
    	            newVal = point.y + inc;
    	            if (newVal < 0 || newVal > 100) """),format.raw/*303.50*/("""{"""),format.raw/*303.51*/("""
    	                newVal = point.y - inc;
    	            """),format.raw/*305.18*/("""}"""),format.raw/*305.19*/("""
    	            
    	            point.update(newVal);
    	        """),format.raw/*308.14*/("""}"""),format.raw/*308.15*/("""

    	    """),format.raw/*310.10*/("""}"""),format.raw/*310.11*/(""", 2000);  
    	    
    		
    	"""),format.raw/*313.6*/("""}"""),format.raw/*313.7*/(""");
    	</script>
		
    </head>
    <body>
	<p>HIGHCHARTS GOES HERE</p>

<table>
	<thead>
	<tr>
		<th>
			<script src="http://code.highcharts.com/highcharts.js"></script>
			<script src="http://code.highcharts.com/modules/exporting.js"></script>
			<div id="container"></div>
		</th>
		<th>
			<script src="http://code.highcharts.com/highcharts.js"></script>
			<script src="http://code.highcharts.com/highcharts-more.js"></script>
			
			<script src="http://code.highcharts.com/modules/solid-gauge.src.js"></script>
			
			<div style="width: 600px; height: 400px; margin: 0 auto">
				<div id="container-speed" style="width: 300px; height: 200px; float: left"></div>
				<div id="container-rpm" style="width: 300px; height: 200px; float: left"></div>
			</div>
		</th>
	</tr>
	</thead>
	<tbody>
	<tr>
		<td>
			<div id="votes">
				<p>VOTE SPEED</p>
					<form action="">
						<input type="radio" name="vote" value="toofast">Too fast<br>
						<input type="radio" name="vote" value="normal">Normal<br>
						<input type="radio" name="vote" value="tooslow">Too slow<br>
						<input type="submit" value="Submit">
					</form>
			</div>
		</td>
		<td>VOTE FORM</td>
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
                    DATE: Mon Jun 09 14:57:43 CEST 2014
                    SOURCE: /home/aalfath/git/LiveFeedSebaTeam/app/views/profPage.scala.html
                    HASH: 859530b0ca8c310618654c8bace67f14751deb11
                    MATRIX: 775->1|899->15|926->33|1090->161|1105->167|1161->201|1258->262|1273->268|1327->300|1420->357|1435->363|1511->416|1604->473|1619->479|1691->528|1753->554|1768->560|1835->605|2015->757|2044->758|2114->800|2143->801|2210->840|2239->841|2296->870|2325->871|2412->930|2441->931|2486->948|2515->949|2651->1057|2680->1058|2736->1086|2765->1087|2985->1279|3014->1280|3088->1326|3117->1327|3595->1777|3624->1778|3740->1866|3769->1867|3866->1936|3895->1937|4033->2047|4062->2048|4240->2198|4269->2199|4405->2307|4434->2308|4597->2443|4626->2444|4876->2666|4905->2667|5100->2834|5129->2835|5379->3057|5408->3058|5545->3167|5574->3168|5890->3456|5919->3457|5984->3494|6013->3495|6066->3520|6095->3521|6144->3542|6173->3543|6251->3593|6280->3594|6378->3664|6407->3665|6464->3694|6493->3695|6631->3805|6660->3806|6717->3835|6746->3836|6806->3868|6835->3869|6930->3936|6959->3937|7025->3975|7054->3976|7229->4122|7259->4123|7310->4145|7340->4146|7400->4177|7430->4178|7506->4225|7536->4226|7828->4489|7858->4490|7908->4511|7938->4512|7997->4542|8027->4543|8116->4603|8146->4604|8208->4637|8238->4638|8327->4698|8357->4699|8417->4730|8447->4731|8564->4819|8594->4820|8897->5094|8927->5095|8999->5138|9029->5139|9200->5281|9230->5282|9290->5313|9320->5314|9415->5380|9445->5381|9498->5405|9528->5406|9575->5424|9605->5425|9649->5440|9679->5441|9731->5465|9761->5466|9840->5516|9870->5517|9937->5555|9967->5556|10018->5578|10048->5579|10123->5625|10153->5626|10205->5649|10235->5650|10316->5702|10346->5703|10398->5726|10428->5727|10483->5753|10513->5754|10598->5810|10628->5811|10725->5879|10755->5880|10829->5925|10859->5926|10994->6032|11024->6033|11072->6052|11102->6053|11146->6068|11176->6069|11228->6092|11258->6093|11313->6119|11343->6120|11432->6180|11462->6181|11519->6209|11549->6210|11623->6255|11653->6256|11750->6324|11780->6325|11828->6344|11858->6345|11902->6360|11932->6361|11986->6386|12016->6387|12087->6429|12117->6430|12153->6437|12183->6438|12239->6465|12269->6466|12310->6478|12340->6479|12385->6495|12415->6496|12473->6525|12503->6526|12557->6551|12587->6552|12684->6620|12714->6621|12901->6779|12931->6780|12998->6818|13028->6819|13136->6898|13166->6899|13222->6926|13252->6927|13304->6950|13334->6951|13382->6970|13412->6971|13456->6986|13486->6987|13540->7012|13570->7013|13705->7119|13735->7120|13776->7132|13806->7133|13843->7142|13872->7143|13964->7206|13994->7207|14059->7243|14089->7244|14143->7269|14173->7270|14246->7314|14276->7315|14368->7378|14398->7379|14576->7528|14606->7529|14870->7764|14900->7765|14940->7776|14970->7777|15021->7799|15051->7800|15117->7837|15147->7838|15237->7899|15267->7900|15600->8204|15630->8205|15702->8248|15732->8249|15788->8276|15818->8277|15892->8322|15922->8323|15970->8342|16000->8343|16071->8385|16101->8386|16160->8416|16190->8417|16253->8451|16283->8452|16445->8585|16475->8586|16535->8617|16565->8618|16630->8654|16660->8655|16764->8730|16794->8731|16848->8756|16878->8757|16947->8797|16977->8798|17042->8834|17072->8835|17111->8845|17141->8846|17283->8959|17313->8960|17363->8981|17393->8982|17490->9050|17520->9051|17596->9098|17626->9099|17673->9117|17703->9118|17754->9140|17784->9141|17850->9178|17880->9179|17937->9207|17967->9208|18078->9290|18108->9291|18333->9486|18364->9487|18395->9488|18426->9489|18581->9615|18611->9616|18665->9641|18695->9642|18806->9724|18836->9725|18876->9736|18906->9737|18949->9752|18978->9753|19164->9910|19194->9911|19328->10016|19358->10017|19649->10279|19679->10280|19771->10343|19801->10344|19901->10415|19931->10416|19971->10427|20001->10428|20062->10461|20091->10462
                    LINES: 26->1|30->1|31->3|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|43->15|43->15|43->15|50->22|50->22|51->23|51->23|52->24|52->24|53->25|53->25|55->27|55->27|56->28|56->28|61->33|61->33|62->34|62->34|66->38|66->38|67->39|67->39|75->47|75->47|77->49|77->49|79->51|79->51|81->53|81->53|84->56|84->56|86->58|86->58|89->61|89->61|93->65|93->65|96->68|96->68|100->72|100->72|103->75|103->75|108->80|108->80|109->81|109->81|110->82|110->82|111->83|111->83|113->85|113->85|115->87|115->87|116->88|116->88|119->91|119->91|120->92|120->92|121->93|121->93|123->95|123->95|124->96|124->96|128->100|128->100|129->101|129->101|130->102|130->102|131->103|131->103|135->107|135->107|136->108|136->108|137->109|137->109|139->111|139->111|140->112|140->112|142->114|142->114|143->115|143->115|145->117|145->117|151->123|151->123|152->124|152->124|155->127|155->127|156->128|156->128|158->130|158->130|159->131|159->131|160->132|160->132|161->133|161->133|163->135|163->135|167->139|167->139|168->140|168->140|169->141|169->141|171->143|171->143|172->144|172->144|174->146|174->146|175->147|175->147|176->148|176->148|178->150|178->150|180->152|180->152|181->153|181->153|183->155|183->155|184->156|184->156|185->157|185->157|186->158|186->158|187->159|187->159|189->161|189->161|190->162|190->162|191->163|191->163|193->165|193->165|194->166|194->166|195->167|195->167|196->168|196->168|197->169|197->169|197->169|197->169|197->169|197->169|197->169|197->169|198->170|198->170|199->171|199->171|200->172|200->172|202->174|202->174|206->178|206->178|207->179|207->179|209->181|209->181|210->182|210->182|211->183|211->183|212->184|212->184|213->185|213->185|214->186|214->186|217->189|217->189|218->190|218->190|219->191|219->191|224->196|224->196|226->198|226->198|228->200|228->200|230->202|230->202|234->206|234->206|239->211|239->211|244->216|244->216|245->217|245->217|247->219|247->219|249->221|249->221|252->224|252->224|262->234|262->234|264->236|264->236|265->237|265->237|267->239|267->239|268->240|268->240|270->242|270->242|271->243|271->243|272->244|272->244|276->248|276->248|277->249|277->249|278->250|278->250|280->252|280->252|281->253|281->253|283->255|283->255|286->258|286->258|287->259|287->259|290->262|290->262|291->263|291->263|294->266|294->266|296->268|296->268|297->269|297->269|299->271|299->271|301->273|301->273|303->275|303->275|306->278|306->278|308->280|308->280|308->280|308->280|310->282|310->282|311->283|311->283|313->285|313->285|314->286|314->286|316->288|316->288|322->294|322->294|325->297|325->297|331->303|331->303|333->305|333->305|336->308|336->308|338->310|338->310|341->313|341->313
                    -- GENERATED --
                */
            