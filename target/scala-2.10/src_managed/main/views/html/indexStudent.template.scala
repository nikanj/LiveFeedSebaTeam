
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
object indexStudent extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>

<title>Test</title>
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*6.46*/routes/*6.52*/.Assets.at("stylesheets/main.css"))),format.raw/*6.86*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*7.47*/routes/*7.53*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*7.106*/("""">
<script src=""""),_display_(Seq[Any](/*8.15*/routes/*8.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*8.66*/("""" type="text/javascript"></script>


</head>
<body>

	<div class="container">
		<form id="speed_vote" name="input">
			<div class="col-md-6 col-md-offset-2" style="border: 1px solid black">
				<h3>Speed</h3>

					<div class="row">
						<label class="radio-inline"> <input name="radioGroup"
							id="radio1" value="option1" type="radio">
							LOW
						</label>
					</div>
					<div class="row">
						<label class="radio-inline"> <input name="radioGroup"
							id="radio2" value="option2" checked="checked" type="radio"> OK
						</label>
					</div>
					<div class="row">
						<label class="radio-inline"> <input name="radioGroup"
							id="radio3" value="option3" type="radio"> FAST
						</label>
					</div>
					<button type="submit" class="btn btn-default">Vote</button>
			</div>
		</form>

		<form id="voice_vote">
			<div class="col-md-6 col-md-offset-2" style="border: 1px solid black">
				<h3>Voice</h3>
				<div class="row">
					<label class="radio-inline"> <input name="radioGroup"
						id="radio4" value="option4"  type="radio">
						LOW
					</label>
				</div>
				<div class="row">
					<label class="radio-inline"> <input name="radioGroup"
						id="radio5" value="option5" checked="checked" type="radio"> OK
					</label>
				</div>
				<div class="row">
					<label class="radio-inline"> <input name="radioGroup"
						id="radio6" value="option6" type="radio"> LOAD
					</label>
				</div>
				<button type="submit" class="btn btn-default">Vote</button>
			</div>
		</form>

	</div>


</body>
</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 09 12:41:43 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Play app's/LiveFeed/app/views/indexStudent.scala.html
                    HASH: 16a4baba02171ae897043356e973573b147b3b41
                    MATRIX: 862->0|998->101|1012->107|1067->141|1152->191|1166->197|1241->250|1294->268|1308->274|1374->319
                    LINES: 29->1|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8
                    -- GENERATED --
                */
            