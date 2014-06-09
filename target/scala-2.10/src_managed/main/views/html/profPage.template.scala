
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
                    DATE: Mon Jun 09 12:41:43 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Play app's/LiveFeed/app/views/profPage.scala.html
                    HASH: 032730e6823a82ae7045ff443faf3700a8e2c507
                    MATRIX: 782->1|914->22|942->42|1113->177|1128->183|1184->217|1282->279|1297->285|1351->317|1445->375|1460->381|1536->434|1600->462|1615->468|1682->513|1855->658|1884->659|1955->702|1984->703|2052->743|2081->744|2139->774|2168->775|2257->836|2286->837|2332->855|2361->856|2502->969|2531->970|2588->999|2617->1000|2841->1196|2870->1197|2945->1244|2974->1245|3459->1702|3488->1703|3554->1741|3583->1742|3733->1864|3762->1865|3900->1975|3929->1976|4095->2114|4124->2115|4376->2339|4405->2340|4493->2400|4522->2401|4743->2586|4760->2594|4788->2600|4925->2709|4954->2710|5020->2748|5049->2749|5103->2775|5132->2776|5182->2798|5211->2799|5291->2851|5320->2852|5420->2924|5449->2925|5507->2955|5536->2956|5677->3069|5706->3070|5764->3100|5793->3101|5854->3134|5883->3135|5980->3204|6009->3205|6076->3244|6105->3245|6283->3395|6312->3396|6363->3419|6392->3420|6452->3452|6481->3453|6557->3501|6586->3502|6881->3769|6910->3770|6960->3792|6989->3793|7048->3824|7077->3825|7167->3887|7196->3888|7258->3922|7287->3923|7378->3985|7408->3986|7469->4018|7499->4019|7618->4109|7648->4110|7957->4390|7987->4391|8060->4435|8090->4436|8264->4581|8294->4582|8355->4614|8385->4615|8482->4683|8512->4684|8566->4709|8596->4710|8644->4729|8674->4730|8719->4746|8749->4747|8803->4773|8833->4774
                    LINES: 26->1|30->1|31->3|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|42->14|42->14|42->14|49->21|49->21|50->22|50->22|51->23|51->23|52->24|52->24|54->26|54->26|55->27|55->27|60->32|60->32|61->33|61->33|65->37|65->37|66->38|66->38|74->46|74->46|76->48|76->48|79->51|79->51|81->53|81->53|84->56|84->56|88->60|88->60|90->62|90->62|93->65|93->65|93->65|95->67|95->67|96->68|96->68|97->69|97->69|98->70|98->70|100->72|100->72|102->74|102->74|103->75|103->75|106->78|106->78|107->79|107->79|108->80|108->80|110->82|110->82|111->83|111->83|115->87|115->87|116->88|116->88|117->89|117->89|118->90|118->90|122->94|122->94|123->95|123->95|124->96|124->96|126->98|126->98|127->99|127->99|129->101|129->101|130->102|130->102|132->104|132->104|138->110|138->110|139->111|139->111|142->114|142->114|143->115|143->115|145->117|145->117|146->118|146->118|147->119|147->119|148->120|148->120|150->122|150->122
                    -- GENERATED --
                */
            