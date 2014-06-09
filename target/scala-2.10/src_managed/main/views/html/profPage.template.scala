
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
object profPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Stats],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(stats : List[Stats]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.23*/("""
"""),format.raw/*3.1*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>Professor Page</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/main.css"))),format.raw/*10.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png"))),format.raw/*11.97*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*12.55*/routes/*12.61*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*12.114*/("""">

        <script src=""""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*14.74*/("""" type="text/javascript"></script>
        
        
        
        <script>
                
        var j = 10;
        $(function () """),format.raw/*21.23*/("""{"""),format.raw/*21.24*/("""
            $(document).ready(function() """),format.raw/*22.42*/("""{"""),format.raw/*22.43*/("""
                Highcharts.setOptions("""),format.raw/*23.39*/("""{"""),format.raw/*23.40*/("""
                    global: """),format.raw/*24.29*/("""{"""),format.raw/*24.30*/("""
                        useUTC: false
                    """),format.raw/*26.21*/("""}"""),format.raw/*26.22*/("""
                """),format.raw/*27.17*/("""}"""),format.raw/*27.18*/(""");
            
                
                var chart;
    
                $('#container').highcharts("""),format.raw/*32.44*/("""{"""),format.raw/*32.45*/("""
                    chart: """),format.raw/*33.28*/("""{"""),format.raw/*33.29*/("""
                        type: 'spline',
                        animation: Highcharts.svg, // don't animate in old IE
                        marginRight: 10,
                        events: """),format.raw/*37.33*/("""{"""),format.raw/*37.34*/("""
                            load: function() """),format.raw/*38.46*/("""{"""),format.raw/*38.47*/("""
       
                            	var vote;
                                // set up the updating of the chart each second
                                var series = this.series[0];

                                var connection = new WebSocket('ws://localhost:9000', ['soap', 'xmpp']);
                             // When the connection is open, send some data to the server
                                connection.onopen = function () """),format.raw/*46.65*/("""{"""),format.raw/*46.66*/("""
  
                                """),format.raw/*48.33*/("""}"""),format.raw/*48.34*/(""";

                                // Log errors
                                connection.onerror = function (error) """),format.raw/*51.71*/("""{"""),format.raw/*51.72*/("""
                                  console.log('WebSocket Error ' + error);
                                """),format.raw/*53.33*/("""}"""),format.raw/*53.34*/(""";

                                // Log messages from the server
                                connection.onmessage = function (e) """),format.raw/*56.69*/("""{"""),format.raw/*56.70*/("""
                                  console.log('Server: ' + e.data);
                                  connection.send(e.data); 
                                  vote = parseInt(e.data);
                                """),format.raw/*60.33*/("""}"""),format.raw/*60.34*/(""";

                                setInterval(function() """),format.raw/*62.56*/("""{"""),format.raw/*62.57*/("""
                                    var x = (new Date()).getTime(); // current time
                                    //var y =	vote;
                                    var y = """),_display_(Seq[Any](/*65.46*/stats(0)/*65.54*/.Pause)),format.raw/*65.60*/(""";
                                    series.addPoint([x, y], true, true);
                                """),format.raw/*67.33*/("""}"""),format.raw/*67.34*/(""", 1000);
                            """),format.raw/*68.29*/("""}"""),format.raw/*68.30*/("""
                        """),format.raw/*69.25*/("""}"""),format.raw/*69.26*/("""
                    """),format.raw/*70.21*/("""}"""),format.raw/*70.22*/(""",
                    
                    title: """),format.raw/*72.28*/("""{"""),format.raw/*72.29*/("""
                        text: 'Live random data'
                    """),format.raw/*74.21*/("""}"""),format.raw/*74.22*/(""",
                    xAxis: """),format.raw/*75.28*/("""{"""),format.raw/*75.29*/("""
                        type: 'datetime',
                        tickPixelInterval: 150
                    """),format.raw/*78.21*/("""}"""),format.raw/*78.22*/(""",
                    yAxis: """),format.raw/*79.28*/("""{"""),format.raw/*79.29*/("""
                        title: """),format.raw/*80.32*/("""{"""),format.raw/*80.33*/("""
                            text: 'Value'
                        """),format.raw/*82.25*/("""}"""),format.raw/*82.26*/(""",
                        plotLines: ["""),format.raw/*83.37*/("""{"""),format.raw/*83.38*/("""
                            value: 0,
                            width: 1,
                            color: '#808080'
                        """),format.raw/*87.25*/("""}"""),format.raw/*87.26*/("""]
                    """),format.raw/*88.21*/("""}"""),format.raw/*88.22*/(""",
                    tooltip: """),format.raw/*89.30*/("""{"""),format.raw/*89.31*/("""
                        formatter: function() """),format.raw/*90.47*/("""{"""),format.raw/*90.48*/("""
                                return '<b>'+ this.series.name +'</b><br/>'+
                                Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x) +'<br/>'+
                                Highcharts.numberFormat(this.y, 2);
                        """),format.raw/*94.25*/("""}"""),format.raw/*94.26*/("""
                    """),format.raw/*95.21*/("""}"""),format.raw/*95.22*/(""",
                    legend: """),format.raw/*96.29*/("""{"""),format.raw/*96.30*/("""
                        enabled: false
                    """),format.raw/*98.21*/("""}"""),format.raw/*98.22*/(""",
                    exporting: """),format.raw/*99.32*/("""{"""),format.raw/*99.33*/("""
                        enabled: false
                    """),format.raw/*101.21*/("""}"""),format.raw/*101.22*/(""",
                    series: ["""),format.raw/*102.30*/("""{"""),format.raw/*102.31*/("""
                        name: 'Random data',
                        data: (function() """),format.raw/*104.43*/("""{"""),format.raw/*104.44*/("""
                            // generate an array of random data
                            var data = [],
                                time = (new Date()).getTime(),
                                i;
            
                            for (i = -19; i <= 0; i++) """),format.raw/*110.56*/("""{"""),format.raw/*110.57*/("""
                                data.push("""),format.raw/*111.43*/("""{"""),format.raw/*111.44*/("""
                                    x: time + i * 1000,
                                    y: Math.random()
                                """),format.raw/*114.33*/("""}"""),format.raw/*114.34*/(""");
                            """),format.raw/*115.29*/("""}"""),format.raw/*115.30*/("""
                            return data;
                        """),format.raw/*117.25*/("""}"""),format.raw/*117.26*/(""")()
                    """),format.raw/*118.21*/("""}"""),format.raw/*118.22*/("""]
                """),format.raw/*119.17*/("""}"""),format.raw/*119.18*/(""");
            """),format.raw/*120.13*/("""}"""),format.raw/*120.14*/(""");
            
        """),format.raw/*122.9*/("""}"""),format.raw/*122.10*/(""");
		</script>
    </head>
    <body>
	<p>HIGHCHARTS GOES HERE</p>

	<script src="http://code.highcharts.com/highcharts.js"></script>
	<script src="http://code.highcharts.com/modules/exporting.js"></script>

	<div id="container" style="min-width: 310px; height: 400px; margin: 0 auto"></div>

	<div id="votes">
		<p>VOTE</p>
			<form action="">
				<input type="radio" name="vote" value="toofast">Too fast<br>
				<input type="radio" name="vote" value="normal">Normal<br>
				<input type="radio" name="vote" value="tooslow">Too slow<br>
				<input type="submit" value="Submit">
			</form>
	</div>
    </body>
</html>"""))}
    }
    
    def render(stats:List[Stats]): play.api.templates.HtmlFormat.Appendable = apply(stats)
    
    def f:((List[Stats]) => play.api.templates.HtmlFormat.Appendable) = (stats) => apply(stats)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 09 17:37:11 CEST 2014
                    SOURCE: F:/Play_Framework/LiveFeedSebaTeam/app/views/profPage.scala.html
                    HASH: 98225939015f748c3dc842b240855c8654f451e8
                    MATRIX: 782->1|913->22|940->40|1104->168|1119->174|1175->208|1272->269|1287->275|1341->307|1434->364|1449->370|1525->423|1587->449|1602->455|1669->500|1835->638|1864->639|1934->681|1963->682|2030->721|2059->722|2116->751|2145->752|2232->811|2261->812|2306->829|2335->830|2471->938|2500->939|2556->967|2585->968|2805->1160|2834->1161|2908->1207|2937->1208|3414->1657|3443->1658|3507->1694|3536->1695|3683->1814|3712->1815|3848->1923|3877->1924|4040->2059|4069->2060|4317->2280|4346->2281|4432->2339|4461->2340|4679->2522|4696->2530|4724->2536|4859->2643|4888->2644|4953->2681|4982->2682|5035->2707|5064->2708|5113->2729|5142->2730|5220->2780|5249->2781|5347->2851|5376->2852|5433->2881|5462->2882|5600->2992|5629->2993|5686->3022|5715->3023|5775->3055|5804->3056|5899->3123|5928->3124|5994->3162|6023->3163|6197->3309|6226->3310|6276->3332|6305->3333|6364->3364|6393->3365|6468->3412|6497->3413|6788->3676|6817->3677|6866->3698|6895->3699|6953->3729|6982->3730|7070->3790|7099->3791|7160->3824|7189->3825|7278->3885|7308->3886|7368->3917|7398->3918|7515->4006|7545->4007|7848->4281|7878->4282|7950->4325|7980->4326|8151->4468|8181->4469|8241->4500|8271->4501|8366->4567|8396->4568|8449->4592|8479->4593|8526->4611|8556->4612|8600->4627|8630->4628|8682->4652|8712->4653
                    LINES: 26->1|30->1|31->3|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|42->14|42->14|42->14|49->21|49->21|50->22|50->22|51->23|51->23|52->24|52->24|54->26|54->26|55->27|55->27|60->32|60->32|61->33|61->33|65->37|65->37|66->38|66->38|74->46|74->46|76->48|76->48|79->51|79->51|81->53|81->53|84->56|84->56|88->60|88->60|90->62|90->62|93->65|93->65|93->65|95->67|95->67|96->68|96->68|97->69|97->69|98->70|98->70|100->72|100->72|102->74|102->74|103->75|103->75|106->78|106->78|107->79|107->79|108->80|108->80|110->82|110->82|111->83|111->83|115->87|115->87|116->88|116->88|117->89|117->89|118->90|118->90|122->94|122->94|123->95|123->95|124->96|124->96|126->98|126->98|127->99|127->99|129->101|129->101|130->102|130->102|132->104|132->104|138->110|138->110|139->111|139->111|142->114|142->114|143->115|143->115|145->117|145->117|146->118|146->118|147->119|147->119|148->120|148->120|150->122|150->122
                    -- GENERATED --
                */
            