
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
object report extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Int,Int,Int,Int,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(speed_count : Int, pause_count : Int, volume_count : Int, questionCount : Int):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.81*/("""

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Report Page</title>

<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.46*/routes/*9.52*/.Assets.at("stylesheets/main.css"))),format.raw/*9.86*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.51*/routes/*10.57*/.Assets.at("images/favicon.png"))),format.raw/*10.89*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*11.47*/routes/*11.53*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*11.106*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*12.47*/routes/*12.53*/.Assets.at("stylesheets/bootstrap/css/table.css"))),format.raw/*12.102*/("""">

<script src=""""),_display_(Seq[Any](/*14.15*/routes/*14.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*14.66*/("""" type="text/javascript"></script>


<script>
$(function () """),format.raw/*18.15*/("""{"""),format.raw/*18.16*/("""
	var speed_count;
	var loudness_count;
	var pause_count;
    
    $('#container').highcharts("""),format.raw/*23.32*/("""{"""),format.raw/*23.33*/("""
        chart: """),format.raw/*24.16*/("""{"""),format.raw/*24.17*/("""
            type: 'column'
        """),format.raw/*26.9*/("""}"""),format.raw/*26.10*/(""",
        title: """),format.raw/*27.16*/("""{"""),format.raw/*27.17*/("""
            text: 'Average Vote Counts'
        """),format.raw/*29.9*/("""}"""),format.raw/*29.10*/(""",
        subtitle: """),format.raw/*30.19*/("""{"""),format.raw/*30.20*/("""
            text: ''
        """),format.raw/*32.9*/("""}"""),format.raw/*32.10*/(""",
        xAxis: """),format.raw/*33.16*/("""{"""),format.raw/*33.17*/("""
            categories: [
                'Jan',
                'Feb',
                'Mar',
                'Apr',
                'May',
                'Jun',
                'Jul',
                'Aug',
                'Sep',
                'Oct',
                'Nov',
                'Dec'
            ]
        """),format.raw/*48.9*/("""}"""),format.raw/*48.10*/(""",
        yAxis: """),format.raw/*49.16*/("""{"""),format.raw/*49.17*/("""
            min: 0,
            title: """),format.raw/*51.20*/("""{"""),format.raw/*51.21*/("""
                text: 'Number of Votes'
            """),format.raw/*53.13*/("""}"""),format.raw/*53.14*/("""
        """),format.raw/*54.9*/("""}"""),format.raw/*54.10*/(""",
        tooltip: """),format.raw/*55.18*/("""{"""),format.raw/*55.19*/("""
            headerFormat: '<span style="font-size:10px">"""),format.raw/*56.57*/("""{"""),format.raw/*56.58*/("""point.key"""),format.raw/*56.67*/("""}"""),format.raw/*56.68*/("""</span><table>',
            pointFormat: '<tr><td style="color:"""),format.raw/*57.48*/("""{"""),format.raw/*57.49*/("""series.color"""),format.raw/*57.61*/("""}"""),format.raw/*57.62*/(""";padding:0">"""),format.raw/*57.74*/("""{"""),format.raw/*57.75*/("""series.name"""),format.raw/*57.86*/("""}"""),format.raw/*57.87*/(""": </td>' +
                '<td style="padding:0"><b>"""),format.raw/*58.43*/("""{"""),format.raw/*58.44*/("""point.y"""),format.raw/*58.51*/("""}"""),format.raw/*58.52*/(""" votes</b></td></tr>',
            footerFormat: '</table>',
            shared: true,
            useHTML: true
        """),format.raw/*62.9*/("""}"""),format.raw/*62.10*/(""",
        plotOptions: """),format.raw/*63.22*/("""{"""),format.raw/*63.23*/("""
            column: """),format.raw/*64.21*/("""{"""),format.raw/*64.22*/("""
                pointPadding: 0.2,
                borderWidth: 0
            """),format.raw/*67.13*/("""}"""),format.raw/*67.14*/("""
        """),format.raw/*68.9*/("""}"""),format.raw/*68.10*/(""",
        series: ["""),format.raw/*69.18*/("""{"""),format.raw/*69.19*/("""
            name: 'Speed',
            data: ["""),_display_(Seq[Any](/*71.21*/speed_count)),format.raw/*71.32*/("""]

        """),format.raw/*73.9*/("""}"""),format.raw/*73.10*/(""", """),format.raw/*73.12*/("""{"""),format.raw/*73.13*/("""
            name: 'Loudness',
            data: ["""),_display_(Seq[Any](/*75.21*/volume_count)),format.raw/*75.33*/("""]

        """),format.raw/*77.9*/("""}"""),format.raw/*77.10*/(""", """),format.raw/*77.12*/("""{"""),format.raw/*77.13*/("""
            name: 'Pause',
            data: ["""),_display_(Seq[Any](/*79.21*/pause_count)),format.raw/*79.32*/("""]

        """),format.raw/*81.9*/("""}"""),format.raw/*81.10*/("""]
    """),format.raw/*82.5*/("""}"""),format.raw/*82.6*/(""");
"""),format.raw/*83.1*/("""}"""),format.raw/*83.2*/(""");

</script>

</head>
<body>
	<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
		<img src=""""),_display_(Seq[Any](/*90.14*/routes/*90.20*/.Assets.at(" images/logo.png"))),format.raw/*90.50*/("""" height="50px"
			width="150px" alt="Live Feed">
	</div>
	<header class="navbar navbar-static-top bs-docs-nav" id="top"
		role="banner">
		<div class="btn-group" style="float: right;">
			<a type="button" class="btn btn-default" href="/home">Home</a> <a
				type="button" class="btn btn-default" href="/aboutus">About Us</a> <a
				type="button" class="btn btn-default" href="/contact">Contact</a> <a
				type="button" class="btn btn-default" href="/feedback">Feedback</a>
		</div>
	</header>
	
	<script src="http://code.highcharts.com/highcharts.js"></script>
<script src="http://code.highcharts.com/modules/exporting.js"></script>

<div id="container" style="min-width: 310px; height: 400px; margin: 0 auto"></div>
<div id="questions_vote"><h3>Number of Questions Voted:  <span class="label label-default"></span>"""),_display_(Seq[Any](/*107.100*/questionCount)),format.raw/*107.113*/("""</h3>
</div>
	
</body>
</html>"""))}
    }
    
    def render(speed_count:Int,pause_count:Int,volume_count:Int,questionCount:Int): play.api.templates.HtmlFormat.Appendable = apply(speed_count,pause_count,volume_count,questionCount)
    
    def f:((Int,Int,Int,Int) => play.api.templates.HtmlFormat.Appendable) = (speed_count,pause_count,volume_count,questionCount) => apply(speed_count,pause_count,volume_count,questionCount)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jun 19 19:01:57 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/report.scala.html
                    HASH: 06af0bd75a70a9dbbcb9932a0df044a25822723e
                    MATRIX: 784->1|957->80|1128->216|1142->222|1197->256|1287->310|1302->316|1356->348|1442->398|1457->404|1533->457|1619->507|1634->513|1706->562|1762->582|1777->588|1844->633|1936->697|1965->698|2092->797|2121->798|2166->815|2195->816|2260->854|2289->855|2335->873|2364->874|2442->925|2471->926|2520->947|2549->948|2608->980|2637->981|2683->999|2712->1000|3078->1339|3107->1340|3153->1358|3182->1359|3252->1401|3281->1402|3364->1457|3393->1458|3430->1468|3459->1469|3507->1489|3536->1490|3622->1548|3651->1549|3688->1558|3717->1559|3810->1624|3839->1625|3879->1637|3908->1638|3948->1650|3977->1651|4016->1662|4045->1663|4127->1717|4156->1718|4191->1725|4220->1726|4372->1851|4401->1852|4453->1876|4482->1877|4532->1899|4561->1900|4671->1982|4700->1983|4737->1993|4766->1994|4814->2014|4843->2015|4929->2065|4962->2076|5002->2089|5031->2090|5061->2092|5090->2093|5179->2146|5213->2158|5253->2171|5282->2172|5312->2174|5341->2175|5427->2225|5460->2236|5500->2249|5529->2250|5563->2257|5591->2258|5622->2262|5650->2263|5809->2386|5824->2392|5876->2422|6748->3256|6785->3269
                    LINES: 26->1|29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|42->14|42->14|42->14|46->18|46->18|51->23|51->23|52->24|52->24|54->26|54->26|55->27|55->27|57->29|57->29|58->30|58->30|60->32|60->32|61->33|61->33|76->48|76->48|77->49|77->49|79->51|79->51|81->53|81->53|82->54|82->54|83->55|83->55|84->56|84->56|84->56|84->56|85->57|85->57|85->57|85->57|85->57|85->57|85->57|85->57|86->58|86->58|86->58|86->58|90->62|90->62|91->63|91->63|92->64|92->64|95->67|95->67|96->68|96->68|97->69|97->69|99->71|99->71|101->73|101->73|101->73|101->73|103->75|103->75|105->77|105->77|105->77|105->77|107->79|107->79|109->81|109->81|110->82|110->82|111->83|111->83|118->90|118->90|118->90|135->107|135->107
                    -- GENERATED --
                */
            