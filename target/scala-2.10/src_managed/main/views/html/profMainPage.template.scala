
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
object profMainPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Hello],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(helloForm: Form[Application.Hello]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main(title = "The 'helloworld' application")/*5.46*/ {_display_(Seq[Any](format.raw/*5.48*/("""
    
    <h1>Configure your 'Hello world':</h1>
    
    """),_display_(Seq[Any](/*9.6*/form(action = routes.Application.sayHello, args = 'id -> "helloform")/*9.75*/ {_display_(Seq[Any](format.raw/*9.77*/("""
        
        """),_display_(Seq[Any](/*11.10*/inputText(
            field = helloForm("name"),
            args = '_label -> "What's your name?", 'placeholder -> "World"
        ))),format.raw/*14.10*/("""
        
               
        <p class="buttons">
            <input type="submit">
        <p>
        
    """)))})),format.raw/*21.6*/("""
    
""")))})))}
    }
    
    def render(helloForm:Form[Application.Hello]): play.api.templates.HtmlFormat.Appendable = apply(helloForm)
    
    def f:((Form[Application.Hello]) => play.api.templates.HtmlFormat.Appendable) = (helloForm) => apply(helloForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 09 12:41:43 CEST 2014
                    SOURCE: D:/Master's Germany/Sem 4 subs/SEBA/Play app's/LiveFeed/app/views/profMainPage.scala.html
                    HASH: 33a9ed7c6065eae4ae2eeb70a1ea5f6775de7952
                    MATRIX: 798->1|945->37|975->59|1012->62|1064->106|1103->108|1200->171|1277->240|1316->242|1373->263|1532->400|1684->521
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|37->9|37->9|37->9|39->11|42->14|49->21
                    -- GENERATED --
                */
            