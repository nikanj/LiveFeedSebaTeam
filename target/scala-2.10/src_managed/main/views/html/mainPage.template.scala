
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
    		var i = 1;
    		var images = [""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("images/munich1.jpg"))),format.raw/*12.61*/("""",
                          """"),_display_(Seq[Any](/*13.29*/routes/*13.35*/.Assets.at("images/munich2.jpg"))),format.raw/*13.67*/("""",
            	          """"),_display_(Seq[Any](/*14.26*/routes/*14.32*/.Assets.at("images/munich3.jpg"))),format.raw/*14.64*/("""",
            	          """"),_display_(Seq[Any](/*15.26*/routes/*15.32*/.Assets.at("images/munich4.jpg"))),format.raw/*15.64*/(""""];
            	  
    		var image = $('.homepage .background');
           	//Initial Background image setup
           	image.attr('src', '"""),_display_(Seq[Any](/*19.33*/routes/*19.39*/.Assets.at("images/munich1.jpg"))),format.raw/*19.71*/("""');
            //Change image at regular intervals
               	                
            setInterval(function()"""),format.raw/*22.35*/("""{"""),format.raw/*22.36*/("""  
            	image.fadeOut(500, function () """),format.raw/*23.45*/("""{"""),format.raw/*23.46*/("""
            	image.attr('src', images [i++]);
            	image.fadeIn(500);
            """),format.raw/*26.13*/("""}"""),format.raw/*26.14*/(""");
            	
            if(i == images.length - 1)
            	i = 0;
            """),format.raw/*30.13*/("""}"""),format.raw/*30.14*/(""", 5000);           
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/(""");
        </script>
    </head>
    <body>
    <div class="homepage">
		<img class="background" />
		<div class="page-top">
			<a href="/home"><img src=""""),_display_(Seq[Any](/*38.31*/routes/*38.37*/.Assets.at("images/logonew.png"))),format.raw/*38.69*/("""" height="70px"
				width="150px" alt="Live Feed"></a>
		</div>
		<div id="menu">
			<header class="navbar navbar-static-top bs-docs-nav" id="top">
				<div class="btn-group" style="float: right;">
					<a type="button" class="btn btn-default" href="/home">Home</a> <a
						type="button" class="btn btn-default" href="/aboutus">About Us</a>
					<a type="button" class="btn btn-default" href="/contact">Contact</a>
					<a type="button" class="btn btn-default" href="/feedback">Feedback</a>
				</div>
			</header>
			<header class="navbar navbar-static-top bs-docs-nav" id="top">
				<div class="well btn-group" id="login">
					<p>
						<a type="button" class="btn btn-primary btn-lg btn-block"
							href="/profSignIn" style="width: 200px;">Professor</a>
					</p>
					<p>
						<a type="button" class="btn btn-primary btn-lg btn-block"
							href="/studentLectureVisit" style="width: 200px;">Students</a>
					</p>
				</div>
			</header>
		</div> 
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
                    DATE: Sun Jun 29 23:37:54 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Final/livefeed/app/views/mainPage.scala.html
                    HASH: 2173d1de6cd11b3b56df34acff8937273e5abd13
                    MATRIX: 858->0|985->92|999->98|1054->132|1151->194|1165->200|1218->232|1311->290|1325->296|1400->349|1461->375|1475->381|1541->426|1683->540|1712->541|1800->593|1815->599|1869->631|1937->663|1952->669|2006->701|2071->730|2086->736|2140->768|2205->797|2220->803|2274->835|2457->982|2472->988|2526->1020|2676->1142|2705->1143|2781->1191|2810->1192|2932->1286|2961->1287|3081->1379|3110->1380|3166->1409|3195->1410|3393->1572|3408->1578|3462->1610
                    LINES: 29->1|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|38->10|38->10|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|47->19|47->19|47->19|50->22|50->22|51->23|51->23|54->26|54->26|58->30|58->30|59->31|59->31|66->38|66->38|66->38
                    -- GENERATED --
                */
            