
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
    </head>
    <body>
        <div class="page-header" style="padding-bottom: 0px; margin-top:5px;">
    	<img src=""""),_display_(Seq[Any](/*12.17*/routes/*12.23*/.Assets.at("images/logo.png"))),format.raw/*12.52*/("""" height="100px" width="300px"alt="Live Feed"> 
    </div> 
       <header class="navbar navbar-static-top bs-docs-nav"  id="top" role="banner">
  		<div class="well btn-group" style="margin-left:400px;margin-top:100px">
  		<p><a type="button" class="btn btn-primary btn-lg btn-block" href="/profSignIn" style="width:200px;">Tutors</a></p>
  		<p><a type="button" class="btn btn-primary btn-lg btn-block" href="/indexStudent" style="width:200px;">Students</a></p>
  		</div>
	</header>
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
                    DATE: Sat Jun 14 09:35:14 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/mainPage.scala.html
                    HASH: 027b7f1359cf856795477f6e261ad7afa390dfd6
                    MATRIX: 858->0|985->92|999->98|1054->132|1151->194|1165->200|1218->232|1311->290|1325->296|1400->349|1461->375|1475->381|1541->426|1734->583|1749->589|1800->618
                    LINES: 29->1|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|40->12|40->12|40->12
                    -- GENERATED --
                */
            