
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
            text: 'Total Vote Counts'
        """),format.raw/*29.9*/("""}"""),format.raw/*29.10*/(""",
        subtitle: """),format.raw/*30.19*/("""{"""),format.raw/*30.20*/("""
            text: ''
        """),format.raw/*32.9*/("""}"""),format.raw/*32.10*/(""",
        xAxis: """),format.raw/*33.16*/("""{"""),format.raw/*33.17*/("""
            categories: [
                'Statistics'
            ]
        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/(""",
        yAxis: """),format.raw/*38.16*/("""{"""),format.raw/*38.17*/("""
            min: 0,
            title: """),format.raw/*40.20*/("""{"""),format.raw/*40.21*/("""
                text: 'Number of Votes'
            """),format.raw/*42.13*/("""}"""),format.raw/*42.14*/("""
        """),format.raw/*43.9*/("""}"""),format.raw/*43.10*/(""",
        tooltip: """),format.raw/*44.18*/("""{"""),format.raw/*44.19*/("""
            headerFormat: '<span style="font-size:10px">"""),format.raw/*45.57*/("""{"""),format.raw/*45.58*/("""point.key"""),format.raw/*45.67*/("""}"""),format.raw/*45.68*/("""</span><table>',
            pointFormat: '<tr><td style="color:"""),format.raw/*46.48*/("""{"""),format.raw/*46.49*/("""series.color"""),format.raw/*46.61*/("""}"""),format.raw/*46.62*/(""";padding:0">"""),format.raw/*46.74*/("""{"""),format.raw/*46.75*/("""series.name"""),format.raw/*46.86*/("""}"""),format.raw/*46.87*/(""": </td>' +
                '<td style="padding:0"><b>"""),format.raw/*47.43*/("""{"""),format.raw/*47.44*/("""point.y"""),format.raw/*47.51*/("""}"""),format.raw/*47.52*/(""" votes</b></td></tr>',
            footerFormat: '</table>',
            shared: true,
            useHTML: true
        """),format.raw/*51.9*/("""}"""),format.raw/*51.10*/(""",
        plotOptions: """),format.raw/*52.22*/("""{"""),format.raw/*52.23*/("""
            column: """),format.raw/*53.21*/("""{"""),format.raw/*53.22*/("""
                pointPadding: 0.2,
                borderWidth: 0 
            """),format.raw/*56.13*/("""}"""),format.raw/*56.14*/("""
        """),format.raw/*57.9*/("""}"""),format.raw/*57.10*/(""",
        series: ["""),format.raw/*58.18*/("""{"""),format.raw/*58.19*/("""
            name: 'Speed Low',
            data: ["""),_display_(Seq[Any](/*60.21*/speed_low)),format.raw/*60.30*/("""]

        """),format.raw/*62.9*/("""}"""),format.raw/*62.10*/(""", """),format.raw/*62.12*/("""{"""),format.raw/*62.13*/("""
            name: 'Speed OK',
            data: ["""),_display_(Seq[Any](/*64.21*/speed_ok)),format.raw/*64.29*/("""]

        """),format.raw/*66.9*/("""}"""),format.raw/*66.10*/(""","""),format.raw/*66.11*/("""{"""),format.raw/*66.12*/("""
            name: 'Speed High',
            data: ["""),_display_(Seq[Any](/*68.21*/speed_high)),format.raw/*68.31*/("""]

        """),format.raw/*70.9*/("""}"""),format.raw/*70.10*/(""","""),format.raw/*70.11*/("""{"""),format.raw/*70.12*/("""
            name: 'Volume Low',
            data: ["""),_display_(Seq[Any](/*72.21*/speed_low)),format.raw/*72.30*/("""] 

        """),format.raw/*74.9*/("""}"""),format.raw/*74.10*/(""","""),format.raw/*74.11*/("""{"""),format.raw/*74.12*/("""
            name: 'Volume OK',
            data: ["""),_display_(Seq[Any](/*76.21*/speed_ok)),format.raw/*76.29*/("""]

        """),format.raw/*78.9*/("""}"""),format.raw/*78.10*/(""","""),format.raw/*78.11*/("""{"""),format.raw/*78.12*/("""
            name: 'Volume High',
            data: ["""),_display_(Seq[Any](/*80.21*/speed_high)),format.raw/*80.31*/("""]

        """),format.raw/*82.9*/("""}"""),format.raw/*82.10*/(""","""),format.raw/*82.11*/("""{"""),format.raw/*82.12*/("""
            name: 'Pause',
            data: ["""),_display_(Seq[Any](/*84.21*/pause_count)),format.raw/*84.32*/("""]

        """),format.raw/*86.9*/("""}"""),format.raw/*86.10*/("""]
    """),format.raw/*87.5*/("""}"""),format.raw/*87.6*/(""");
"""),format.raw/*88.1*/("""}"""),format.raw/*88.2*/(""");

</script>

</head>
<body>
	<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
		<img src=""""),_display_(Seq[Any](/*95.14*/routes/*95.20*/.Assets.at(" images/logo.png"))),format.raw/*95.50*/("""" height="50px"
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
<div id="questions_vote"><h3>Number of Questions Posted:  <span class="label label-default"></span>"""),_display_(Seq[Any](/*112.101*/questionCount)),format.raw/*112.114*/("""</h3>
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
                    DATE: Sun Jun 22 17:34:14 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/report.scala.html
                    HASH: 027d25863b0ce44bce6da674b28123165abab0f4
                    MATRIX: 800->1|1032->138|1203->274|1217->280|1272->314|1362->368|1377->374|1431->406|1517->456|1532->462|1608->515|1694->565|1709->571|1781->620|1837->640|1852->646|1919->691|2011->755|2040->756|2167->855|2196->856|2241->873|2270->874|2335->912|2364->913|2410->931|2439->932|2515->981|2544->982|2593->1003|2622->1004|2681->1036|2710->1037|2756->1055|2785->1056|2894->1138|2923->1139|2969->1157|2998->1158|3068->1200|3097->1201|3180->1256|3209->1257|3246->1267|3275->1268|3323->1288|3352->1289|3438->1347|3467->1348|3504->1357|3533->1358|3626->1423|3655->1424|3695->1436|3724->1437|3764->1449|3793->1450|3832->1461|3861->1462|3943->1516|3972->1517|4007->1524|4036->1525|4188->1650|4217->1651|4269->1675|4298->1676|4348->1698|4377->1699|4488->1782|4517->1783|4554->1793|4583->1794|4631->1814|4660->1815|4750->1869|4781->1878|4821->1891|4850->1892|4880->1894|4909->1895|4998->1948|5028->1956|5068->1969|5097->1970|5126->1971|5155->1972|5246->2027|5278->2037|5318->2050|5347->2051|5376->2052|5405->2053|5496->2108|5527->2117|5568->2131|5597->2132|5626->2133|5655->2134|5745->2188|5775->2196|5815->2209|5844->2210|5873->2211|5902->2212|5994->2268|6026->2278|6066->2291|6095->2292|6124->2293|6153->2294|6239->2344|6272->2355|6312->2368|6341->2369|6375->2376|6403->2377|6434->2381|6462->2382|6621->2505|6636->2511|6688->2541|7561->3376|7598->3389
                    LINES: 26->1|29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|42->14|42->14|42->14|46->18|46->18|51->23|51->23|52->24|52->24|54->26|54->26|55->27|55->27|57->29|57->29|58->30|58->30|60->32|60->32|61->33|61->33|65->37|65->37|66->38|66->38|68->40|68->40|70->42|70->42|71->43|71->43|72->44|72->44|73->45|73->45|73->45|73->45|74->46|74->46|74->46|74->46|74->46|74->46|74->46|74->46|75->47|75->47|75->47|75->47|79->51|79->51|80->52|80->52|81->53|81->53|84->56|84->56|85->57|85->57|86->58|86->58|88->60|88->60|90->62|90->62|90->62|90->62|92->64|92->64|94->66|94->66|94->66|94->66|96->68|96->68|98->70|98->70|98->70|98->70|100->72|100->72|102->74|102->74|102->74|102->74|104->76|104->76|106->78|106->78|106->78|106->78|108->80|108->80|110->82|110->82|110->82|110->82|112->84|112->84|114->86|114->86|115->87|115->87|116->88|116->88|123->95|123->95|123->95|140->112|140->112
                    -- GENERATED --
                */
            