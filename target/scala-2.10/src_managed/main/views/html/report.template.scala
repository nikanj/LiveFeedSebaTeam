
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
object report extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template8[Int,Int,Int,Int,Int,Int,Int,Int,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(speed_low: Int, speed_ok: Int, speed_high: Int, volume_low: Int, volume_ok: Int, volume_high: Int, pause_count: Int, questionCount: Int):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.139*/("""

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Report Page</title>

<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.46*/routes/*9.52*/.Assets.at("stylesheets/main.css"))),format.raw/*9.86*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.51*/routes/*10.57*/.Assets.at("images/favicon.png"))),format.raw/*10.89*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.51*/routes/*11.57*/.Assets.at("images/logonew.png"))),format.raw/*11.89*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*12.47*/routes/*12.53*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*12.106*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*13.47*/routes/*13.53*/.Assets.at("stylesheets/bootstrap/css/table.css"))),format.raw/*13.102*/("""">

<script src=""""),_display_(Seq[Any](/*15.15*/routes/*15.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*15.66*/("""" type="text/javascript"></script>


<script>
$(function () """),format.raw/*19.15*/("""{"""),format.raw/*19.16*/("""
	var speed_count;
	var loudness_count;
	var pause_count;
    
    $('#container').highcharts("""),format.raw/*24.32*/("""{"""),format.raw/*24.33*/("""
        chart: """),format.raw/*25.16*/("""{"""),format.raw/*25.17*/("""
            type: 'column'
        """),format.raw/*27.9*/("""}"""),format.raw/*27.10*/(""",
        title: """),format.raw/*28.16*/("""{"""),format.raw/*28.17*/("""
            text: 'Total Vote Counts'
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/(""",
        subtitle: """),format.raw/*31.19*/("""{"""),format.raw/*31.20*/("""
            text: ''
        """),format.raw/*33.9*/("""}"""),format.raw/*33.10*/(""",
        xAxis: """),format.raw/*34.16*/("""{"""),format.raw/*34.17*/("""
            categories: [
                'Statistics'
            ]
        """),format.raw/*38.9*/("""}"""),format.raw/*38.10*/(""",
        yAxis: """),format.raw/*39.16*/("""{"""),format.raw/*39.17*/("""
            min: 0,
            title: """),format.raw/*41.20*/("""{"""),format.raw/*41.21*/("""
                text: 'Number of Votes'
            """),format.raw/*43.13*/("""}"""),format.raw/*43.14*/("""
        """),format.raw/*44.9*/("""}"""),format.raw/*44.10*/(""",
        tooltip: """),format.raw/*45.18*/("""{"""),format.raw/*45.19*/("""
            headerFormat: '<span style="font-size:10px">"""),format.raw/*46.57*/("""{"""),format.raw/*46.58*/("""point.key"""),format.raw/*46.67*/("""}"""),format.raw/*46.68*/("""</span><table>',
            pointFormat: '<tr><td style="color:"""),format.raw/*47.48*/("""{"""),format.raw/*47.49*/("""series.color"""),format.raw/*47.61*/("""}"""),format.raw/*47.62*/(""";padding:0">"""),format.raw/*47.74*/("""{"""),format.raw/*47.75*/("""series.name"""),format.raw/*47.86*/("""}"""),format.raw/*47.87*/(""": </td>' +
                '<td style="padding:0"><b>"""),format.raw/*48.43*/("""{"""),format.raw/*48.44*/("""point.y"""),format.raw/*48.51*/("""}"""),format.raw/*48.52*/(""" votes</b></td></tr>',
            footerFormat: '</table>',
            shared: true,
            useHTML: true
        """),format.raw/*52.9*/("""}"""),format.raw/*52.10*/(""",
        plotOptions: """),format.raw/*53.22*/("""{"""),format.raw/*53.23*/("""
            column: """),format.raw/*54.21*/("""{"""),format.raw/*54.22*/("""
                pointPadding: 0.2,
                borderWidth: 0 
            """),format.raw/*57.13*/("""}"""),format.raw/*57.14*/("""
        """),format.raw/*58.9*/("""}"""),format.raw/*58.10*/(""",
        series: ["""),format.raw/*59.18*/("""{"""),format.raw/*59.19*/("""
            name: 'Speed Low',
            data: ["""),_display_(Seq[Any](/*61.21*/speed_low)),format.raw/*61.30*/("""]

        """),format.raw/*63.9*/("""}"""),format.raw/*63.10*/(""", """),format.raw/*63.12*/("""{"""),format.raw/*63.13*/("""
            name: 'Speed OK',
            data: ["""),_display_(Seq[Any](/*65.21*/speed_ok)),format.raw/*65.29*/("""]

        """),format.raw/*67.9*/("""}"""),format.raw/*67.10*/(""","""),format.raw/*67.11*/("""{"""),format.raw/*67.12*/("""
            name: 'Speed High',
            data: ["""),_display_(Seq[Any](/*69.21*/speed_high)),format.raw/*69.31*/("""]

        """),format.raw/*71.9*/("""}"""),format.raw/*71.10*/(""","""),format.raw/*71.11*/("""{"""),format.raw/*71.12*/("""
            name: 'Volume Low',
            data: ["""),_display_(Seq[Any](/*73.21*/volume_low)),format.raw/*73.31*/("""] 

        """),format.raw/*75.9*/("""}"""),format.raw/*75.10*/(""","""),format.raw/*75.11*/("""{"""),format.raw/*75.12*/("""
            name: 'Volume OK',
            data: ["""),_display_(Seq[Any](/*77.21*/volume_ok)),format.raw/*77.30*/("""]

        """),format.raw/*79.9*/("""}"""),format.raw/*79.10*/(""","""),format.raw/*79.11*/("""{"""),format.raw/*79.12*/("""
            name: 'Volume High',
            data: ["""),_display_(Seq[Any](/*81.21*/volume_high)),format.raw/*81.32*/("""]

        """),format.raw/*83.9*/("""}"""),format.raw/*83.10*/(""","""),format.raw/*83.11*/("""{"""),format.raw/*83.12*/("""
            name: 'Pause',
            data: ["""),_display_(Seq[Any](/*85.21*/pause_count)),format.raw/*85.32*/("""]

        """),format.raw/*87.9*/("""}"""),format.raw/*87.10*/("""]
    """),format.raw/*88.5*/("""}"""),format.raw/*88.6*/(""");
"""),format.raw/*89.1*/("""}"""),format.raw/*89.2*/(""");

</script>

</head>
<body>
	<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
		<img src=""""),_display_(Seq[Any](/*96.14*/routes/*96.20*/.Assets.at("images/logonew.png"))),format.raw/*96.52*/("""" height="60px"
			width="120px" alt="Live Feed">
	</div>
	<header class="navbar navbar-static-top bs-docs-nav" id="top"
		role="banner">
		<div class="btn-group" style="margin-left: 75%;">
			<a type="button" class="btn btn-default" href="/home">Home</a> <a
				type="button" class="btn btn-default" href="/aboutus">About Us</a> <a
				type="button" class="btn btn-default" href="/contact">Contact</a> <a
				type="button" class="btn btn-default" href="/feedback">Feedback</a>
		</div>
	</header>
	
	<script src="http://code.highcharts.com/highcharts.js"></script>
<script src="http://code.highcharts.com/modules/exporting.js"></script>

<div id="container" style="min-width: 310px; height: 400px; margin: 0 auto"></div>
<div id="questions_vote"><h3>Number of Questions Posted:  <span class="label label-default"></span>"""),_display_(Seq[Any](/*113.101*/questionCount)),format.raw/*113.114*/("""</h3>
</div>
	
</body>
</html>"""))}
    }
    
    def render(speed_low:Int,speed_ok:Int,speed_high:Int,volume_low:Int,volume_ok:Int,volume_high:Int,pause_count:Int,questionCount:Int): play.api.templates.HtmlFormat.Appendable = apply(speed_low,speed_ok,speed_high,volume_low,volume_ok,volume_high,pause_count,questionCount)
    
    def f:((Int,Int,Int,Int,Int,Int,Int,Int) => play.api.templates.HtmlFormat.Appendable) = (speed_low,speed_ok,speed_high,volume_low,volume_ok,volume_high,pause_count,questionCount) => apply(speed_low,speed_ok,speed_high,volume_low,volume_ok,volume_high,pause_count,questionCount)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 29 14:26:19 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Final/livefeed_Final/livefeed/app/views/report.scala.html
                    HASH: 2d70eb3057df7d77a3914e68442b86cec3e14a6e
                    MATRIX: 800->1|1032->138|1203->274|1217->280|1272->314|1362->368|1377->374|1431->406|1521->460|1536->466|1590->498|1676->548|1691->554|1767->607|1853->657|1868->663|1940->712|1996->732|2011->738|2078->783|2170->847|2199->848|2326->947|2355->948|2400->965|2429->966|2494->1004|2523->1005|2569->1023|2598->1024|2674->1073|2703->1074|2752->1095|2781->1096|2840->1128|2869->1129|2915->1147|2944->1148|3053->1230|3082->1231|3128->1249|3157->1250|3227->1292|3256->1293|3339->1348|3368->1349|3405->1359|3434->1360|3482->1380|3511->1381|3597->1439|3626->1440|3663->1449|3692->1450|3785->1515|3814->1516|3854->1528|3883->1529|3923->1541|3952->1542|3991->1553|4020->1554|4102->1608|4131->1609|4166->1616|4195->1617|4347->1742|4376->1743|4428->1767|4457->1768|4507->1790|4536->1791|4647->1874|4676->1875|4713->1885|4742->1886|4790->1906|4819->1907|4909->1961|4940->1970|4980->1983|5009->1984|5039->1986|5068->1987|5157->2040|5187->2048|5227->2061|5256->2062|5285->2063|5314->2064|5405->2119|5437->2129|5477->2142|5506->2143|5535->2144|5564->2145|5655->2200|5687->2210|5728->2224|5757->2225|5786->2226|5815->2227|5905->2281|5936->2290|5976->2303|6005->2304|6034->2305|6063->2306|6155->2362|6188->2373|6228->2386|6257->2387|6286->2388|6315->2389|6401->2439|6434->2450|6474->2463|6503->2464|6537->2471|6565->2472|6596->2476|6624->2477|6783->2600|6798->2606|6852->2638|7729->3477|7766->3490
                    LINES: 26->1|29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|43->15|43->15|43->15|47->19|47->19|52->24|52->24|53->25|53->25|55->27|55->27|56->28|56->28|58->30|58->30|59->31|59->31|61->33|61->33|62->34|62->34|66->38|66->38|67->39|67->39|69->41|69->41|71->43|71->43|72->44|72->44|73->45|73->45|74->46|74->46|74->46|74->46|75->47|75->47|75->47|75->47|75->47|75->47|75->47|75->47|76->48|76->48|76->48|76->48|80->52|80->52|81->53|81->53|82->54|82->54|85->57|85->57|86->58|86->58|87->59|87->59|89->61|89->61|91->63|91->63|91->63|91->63|93->65|93->65|95->67|95->67|95->67|95->67|97->69|97->69|99->71|99->71|99->71|99->71|101->73|101->73|103->75|103->75|103->75|103->75|105->77|105->77|107->79|107->79|107->79|107->79|109->81|109->81|111->83|111->83|111->83|111->83|113->85|113->85|115->87|115->87|116->88|116->88|117->89|117->89|124->96|124->96|124->96|141->113|141->113
                    -- GENERATED --
                */
            