
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*7.54*/routes/*7.60*/.Assets.at("stylesheets/main.css"))),format.raw/*7.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*8.59*/routes/*8.65*/.Assets.at("images/favicon.png"))),format.raw/*8.97*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*9.55*/routes/*9.61*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*9.114*/("""">
        <script src=""""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*10.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        <div class="page-header" style="padding-bottom: 0px; margin-top:5px;">
    	<img src=""""),_display_(Seq[Any](/*14.17*/routes/*14.23*/.Assets.at("images/logo.png"))),format.raw/*14.52*/("""" height="100px" width="300px"alt="Live Feed"> 
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
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 09 13:44:04 CEST 2014
                    SOURCE: /home/aalfath/git/LiveFeedSebaTeam/app/views/main.scala.html
                    HASH: 884945ea669ba338ed7bc1f0a62509c3d0eb15a3
                    MATRIX: 778->1|902->31|1027->121|1041->127|1096->161|1192->222|1206->228|1259->260|1351->317|1365->323|1440->376|1501->401|1516->407|1583->452|1772->605|1787->611|1838->640
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|42->14|42->14|42->14
                    -- GENERATED --
                */
            