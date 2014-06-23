
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
object mainPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>

<html>
    <head>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*5.54*/routes/*5.60*/.Assets.at("stylesheets/main.css"))),format.raw/*5.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*7.55*/routes/*7.61*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*7.114*/("""">
        <script src=""""),_display_(Seq[Any](/*8.23*/routes/*8.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*8.74*/("""" type="text/javascript"></script>
        <script type="text/javascript">
        $(document).ready(function() """),format.raw/*10.38*/("""{"""),format.raw/*10.39*/("""          
        	  var i =0;
        	  var images = [""""),_display_(Seq[Any](/*12.28*/routes/*12.34*/.Assets.at("images/munich.jpg"))),format.raw/*12.65*/("""",
        	                """"),_display_(Seq[Any](/*13.28*/routes/*13.34*/.Assets.at("images/munich1.jpg"))),format.raw/*13.66*/("""",
        	                """"),_display_(Seq[Any](/*14.28*/routes/*14.34*/.Assets.at("images/munich2.jpg"))),format.raw/*14.66*/("""",
        	                """"),_display_(Seq[Any](/*15.28*/routes/*15.34*/.Assets.at("images/munich3.jpg"))),format.raw/*15.66*/(""""];
        	  var image = $('.background');
        	                //Initial Background image setup
        	  image.attr('src', '"""),_display_(Seq[Any](/*18.32*/routes/*18.38*/.Assets.at("images/munich1.jpg"))),format.raw/*18.70*/("""');
        	                //Change image at regular intervals
        	   setInterval(function()"""),format.raw/*20.35*/("""{"""),format.raw/*20.36*/("""  
        	   image.fadeOut(2000, function () """),format.raw/*21.45*/("""{"""),format.raw/*21.46*/("""
        	   image.attr('src', images [i++]);
        	   image.fadeIn(2000);
        	   """),format.raw/*24.13*/("""}"""),format.raw/*24.14*/(""");
        	   if(i == images.length)
        	    i = 0;
        	  """),format.raw/*27.12*/("""}"""),format.raw/*27.13*/(""", 5000);           
        	 """),format.raw/*28.11*/("""}"""),format.raw/*28.12*/(""");
        </script>
    </head>
    <body>
    <img class="background" src=""""),_display_(Seq[Any](/*32.35*/routes/*32.41*/.Assets.at("images/munich.jpg"))),format.raw/*32.72*/("""" />
    <div class="homepage" >
        <div class="page-header" style="padding-bottom: 0px; margin-top:5px;">
    		<img src=""""),_display_(Seq[Any](/*35.18*/routes/*35.24*/.Assets.at("images/logonew.png"))),format.raw/*35.56*/("""" height="70px" width="150px" alt="Live Feed"> 
    	</div> 
    	<header class="navbar navbar-static-top bs-docs-nav"  id="top" role="banner">
  			<div class="btn-group" style="float:right;">
  				<a type="button" class="btn btn-default" href="/home">Home</a>
  				<a type="button" class="btn btn-default" href="/aboutus">About Us</a>
  				<a type="button" class="btn btn-default" href="/contact">Contact</a>
  				<a type="button" class="btn btn-default" href="/feedback">Feedback</a>
  			</div>
		</header>
       <header class="navbar navbar-static-top bs-docs-nav"  id="top" role="banner">
  		<div class="well btn-group" style="margin-left:70%;margin-top:100px">
  		<p><a type="button" class="btn btn-primary btn-lg btn-block" href="/profSignIn" style="width:200px;">Tutors</a></p>
  		<p><a type="button" class="btn btn-primary btn-lg btn-block" href="/indexStudent" style="width:200px;">Students</a></p>
  		</div>
	</header>
	</div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    </body>
</html>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 23 17:27:53 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/mainPage.scala.html
                    HASH: b331d68befbbced0034cb4d85597097d4658ce8c
                    MATRIX: 858->0|985->92|999->98|1054->132|1151->194|1165->200|1218->232|1311->290|1325->296|1400->349|1461->375|1475->381|1541->426|1683->540|1712->541|1809->602|1824->608|1877->639|1944->670|1959->676|2013->708|2080->739|2095->745|2149->777|2216->808|2231->814|2285->846|2458->983|2473->989|2527->1021|2656->1122|2685->1123|2761->1171|2790->1172|2911->1265|2940->1266|3040->1338|3069->1339|3128->1370|3157->1371|3275->1453|3290->1459|3343->1490|3511->1622|3526->1628|3580->1660
                    LINES: 29->1|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|38->10|38->10|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|46->18|46->18|46->18|48->20|48->20|49->21|49->21|52->24|52->24|55->27|55->27|56->28|56->28|60->32|60->32|60->32|63->35|63->35|63->35
                    -- GENERATED --
                */
            