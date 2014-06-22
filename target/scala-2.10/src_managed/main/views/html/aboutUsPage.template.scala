
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
object aboutUsPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>

<title>Test</title>
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*6.46*/routes/*6.52*/.Assets.at("stylesheets/main.css"))),format.raw/*6.86*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*7.51*/routes/*7.57*/.Assets.at("images/logonew.png"))),format.raw/*7.89*/("""">
<link rel="shortcut icon" type="image/jpg" href=""""),_display_(Seq[Any](/*8.51*/routes/*8.57*/.Assets.at("images/1.jpg"))),format.raw/*8.83*/("""">
<link rel="shortcut icon" type="image/jpg" href=""""),_display_(Seq[Any](/*9.51*/routes/*9.57*/.Assets.at("images/2.jpg"))),format.raw/*9.83*/("""">
<link rel="shortcut icon" type="image/jpg" href=""""),_display_(Seq[Any](/*10.51*/routes/*10.57*/.Assets.at("images/3.jpg"))),format.raw/*10.83*/("""">
<link rel="shortcut icon" type="image/jpg" href=""""),_display_(Seq[Any](/*11.51*/routes/*11.57*/.Assets.at("images/4.jpg"))),format.raw/*11.83*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*12.51*/routes/*12.57*/.Assets.at("images/tumlogo.png"))),format.raw/*12.89*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*13.51*/routes/*13.57*/.Assets.at("images/lmulogo.png"))),format.raw/*13.89*/("""">
<link rel="shortcut icon" type="image/jpg" href=""""),_display_(Seq[Any](/*14.51*/routes/*14.57*/.Assets.at("images/fb.jpg"))),format.raw/*14.84*/("""">
<link rel="shortcut icon" type="image/jpg" href=""""),_display_(Seq[Any](/*15.51*/routes/*15.57*/.Assets.at("images/twitter.jpg"))),format.raw/*15.89*/("""">
<link rel="shortcut icon" type="image/jpg" href=""""),_display_(Seq[Any](/*16.51*/routes/*16.57*/.Assets.at("images/linkedin.jpg"))),format.raw/*16.90*/("""">
<link rel="shortcut icon" type="image/jpg" href=""""),_display_(Seq[Any](/*17.51*/routes/*17.57*/.Assets.at("images/google.jpg"))),format.raw/*17.88*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*18.47*/routes/*18.53*/.Assets.at("stylesheets/bootstrap/css/bootstrap.css"))),format.raw/*18.106*/("""">
<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*19.47*/routes/*19.53*/.Assets.at("stylesheets/bootstrap/css/social-buttons.css"))),format.raw/*19.111*/("""">
<script src=""""),_display_(Seq[Any](/*20.15*/routes/*20.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*20.66*/("""" type="text/javascript"></script>


</head>
<body>
	<div class="page-header" style="padding-bottom: 0px; margin-top: 5px;">
		<img src=""""),_display_(Seq[Any](/*26.14*/routes/*26.20*/.Assets.at("images/logonew.png"))),format.raw/*26.52*/("""" height="60px"
			width="130px" alt="Live Feed">
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

	<div class="container">
		<div class="row">
			<div class="col-md-9">
				<p>
				<h4>
					<i>"LiveFeed is inspired to help Professors and students to
						have live feedback during lecture sessions!"</i>
				</h4>
				</p>
				<p>
				<h3>About the team</h3>
				</p>
				<p>
					We are young and enthusiastic Start-Up team. Our story began in
					TUM, where we met. Being students we have identified the common
					problems that nowadays exists in the communication between students
					and professors. That is why we decided to dedicate our time in a
					mission for improving that process. <b>LiveFeed</b> is a real-time
					feedback Web application, created from students to students and
					professors!
				</p>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-6">
				<h4>Nikanj Gupta</h4>
				<img src=""""),_display_(Seq[Any](/*65.16*/routes/*65.22*/.Assets.at("images/1.jpg"))),format.raw/*65.48*/("""" height="70px"
					width="70px" class="img-circle">
				<p>Student in MSc Informatics, TUM</p>
				<p>
					<i>"On my way to writing a master thesis"</i>
				</p>
			</div>
			<div class="col-xs-6">
				<h4>Ivan Petrov</h4>
				<img src=""""),_display_(Seq[Any](/*74.16*/routes/*74.22*/.Assets.at("images/2.jpg"))),format.raw/*74.48*/("""" height="70px"
					width="70px" class="img-circle">
				<p>Student in MSc Informatics, TUM</p>
				<p>
					<i>"TBD"</i>
				</p>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-6">
				<h4>Agastya Alfath</h4>
				<img src=""""),_display_(Seq[Any](/*85.16*/routes/*85.22*/.Assets.at("images/3.jpg"))),format.raw/*85.48*/("""" height="70px"
					width="70px" class="img-circle">
				<p>Student in MSc Informatics, TUM</p>
				<p>
					<i>"TBD"</i>
				</p>
			</div>
			<div class="col-xs-6">
				<h4>Antoniya Atanasova</h4>
				<img src=""""),_display_(Seq[Any](/*94.16*/routes/*94.22*/.Assets.at("images/4.jpg"))),format.raw/*94.48*/("""" height="70px"
					width="70px" class="img-circle">
				<p>Student in MSc Informatics, TUM</p>
				<p>
					<i>"TBD"</i>
				</p>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6">
				<h3>Clients&Partners</h3>
				<img src=""""),_display_(Seq[Any](/*105.16*/routes/*105.22*/.Assets.at("images/tumlogo.png"))),format.raw/*105.54*/("""" class="img-rounded" height="90px" width="90px">
				<img src=""""),_display_(Seq[Any](/*106.16*/routes/*106.22*/.Assets.at("images/lmulogo.png"))),format.raw/*106.54*/("""" class="img-rounded" height="60px" width="130px">
			</div>
			<div class="col-md-6">
			<h3></h3>
			<a href="https://www.facebook.com/"><img src=""""),_display_(Seq[Any](/*110.51*/routes/*110.57*/.Assets.at("images/fb.jpg"))),format.raw/*110.84*/("""" height="30px" width="30px" href="abv.bg" class="img-rounded"></a>
			<a href="https://www.twitter.com/"><img src=""""),_display_(Seq[Any](/*111.50*/routes/*111.56*/.Assets.at("images/twitter.jpg"))),format.raw/*111.88*/("""" height="30px" width="30px" class="img-rounded"></a>
			<a href="https://www.linkedin.com/"><img src=""""),_display_(Seq[Any](/*112.51*/routes/*112.57*/.Assets.at("images/linkedin.jpg"))),format.raw/*112.90*/("""" height="30px" width="30px" class="img-rounded"></a>
			<a href="https://www.plus.google.com/"><img src=""""),_display_(Seq[Any](/*113.54*/routes/*113.60*/.Assets.at("images/google.jpg"))),format.raw/*113.91*/("""" height="30px" width="30px" class="img-rounded"></a>
			</div>
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
                    DATE: Sun Jun 22 17:34:14 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/app/views/aboutUsPage.scala.html
                    HASH: 4895192038153ddd208e5cc35caaec4f544f3a1e
                    MATRIX: 861->0|997->101|1011->107|1066->141|1155->195|1169->201|1222->233|1311->287|1325->293|1372->319|1461->373|1475->379|1522->405|1612->459|1627->465|1675->491|1765->545|1780->551|1828->577|1918->631|1933->637|1987->669|2077->723|2092->729|2146->761|2236->815|2251->821|2300->848|2390->902|2405->908|2459->940|2549->994|2564->1000|2619->1033|2709->1087|2724->1093|2777->1124|2863->1174|2878->1180|2954->1233|3040->1283|3055->1289|3136->1347|3190->1365|3205->1371|3272->1416|3452->1560|3467->1566|3521->1598|4925->2966|4940->2972|4988->2998|5274->3248|5289->3254|5337->3280|5624->3531|5639->3537|5687->3563|5947->3787|5962->3793|6010->3819|6300->4072|6316->4078|6371->4110|6474->4176|6490->4182|6545->4214|6736->4368|6752->4374|6802->4401|6957->4519|6973->4525|7028->4557|7170->4662|7186->4668|7242->4701|7387->4809|7403->4815|7457->4846
                    LINES: 29->1|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|54->26|54->26|54->26|93->65|93->65|93->65|102->74|102->74|102->74|113->85|113->85|113->85|122->94|122->94|122->94|133->105|133->105|133->105|134->106|134->106|134->106|138->110|138->110|138->110|139->111|139->111|139->111|140->112|140->112|140->112|141->113|141->113|141->113
                    -- GENERATED --
                */
            