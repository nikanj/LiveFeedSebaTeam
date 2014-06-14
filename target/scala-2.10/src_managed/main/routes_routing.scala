// @SOURCE:D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/conf/routes
// @HASH:0d2745ac0c3027f8a288337160bb56c5c2542d11
// @DATE:Sat Jun 14 09:35:12 CEST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Application_homePage1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home"))))
        

// @LINE:9
private[this] lazy val controllers_Application_profSignIn2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profSignIn"))))
        

// @LINE:10
private[this] lazy val controllers_Application_profMainPage3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profMainPage"))))
        

// @LINE:11
private[this] lazy val controllers_Application_postQuestion4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("postQuestion"))))
        

// @LINE:12
private[this] lazy val controllers_Application_indexStudent5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("indexStudent"))))
        

// @LINE:13
private[this] lazy val controllers_Application_vote6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("vote"))))
        

// @LINE:14
private[this] lazy val controllers_Application_indexStudent7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("indexStudent"))))
        

// @LINE:15
private[this] lazy val controllers_Application_profPageDisplay8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profPage"))))
        

// @LINE:19
private[this] lazy val controllers_Assets_at9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home""","""controllers.Application.homePage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profSignIn""","""controllers.Application.profSignIn()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profMainPage""","""controllers.Application.profMainPage()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """postQuestion""","""controllers.Application.postQuestion()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """indexStudent""","""controllers.Application.indexStudent()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """vote""","""controllers.Application.vote()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """indexStudent""","""controllers.Application.indexStudent()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profPage""","""controllers.Application.profPageDisplay()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Application_homePage1(params) => {
   call { 
        invokeHandler(controllers.Application.homePage(), HandlerDef(this, "controllers.Application", "homePage", Nil,"GET", """ Main pages""", Routes.prefix + """home"""))
   }
}
        

// @LINE:9
case controllers_Application_profSignIn2(params) => {
   call { 
        invokeHandler(controllers.Application.profSignIn(), HandlerDef(this, "controllers.Application", "profSignIn", Nil,"GET", """""", Routes.prefix + """profSignIn"""))
   }
}
        

// @LINE:10
case controllers_Application_profMainPage3(params) => {
   call { 
        invokeHandler(controllers.Application.profMainPage(), HandlerDef(this, "controllers.Application", "profMainPage", Nil,"GET", """""", Routes.prefix + """profMainPage"""))
   }
}
        

// @LINE:11
case controllers_Application_postQuestion4(params) => {
   call { 
        invokeHandler(controllers.Application.postQuestion(), HandlerDef(this, "controllers.Application", "postQuestion", Nil,"POST", """""", Routes.prefix + """postQuestion"""))
   }
}
        

// @LINE:12
case controllers_Application_indexStudent5(params) => {
   call { 
        invokeHandler(controllers.Application.indexStudent(), HandlerDef(this, "controllers.Application", "indexStudent", Nil,"GET", """""", Routes.prefix + """indexStudent"""))
   }
}
        

// @LINE:13
case controllers_Application_vote6(params) => {
   call { 
        invokeHandler(controllers.Application.vote(), HandlerDef(this, "controllers.Application", "vote", Nil,"GET", """""", Routes.prefix + """vote"""))
   }
}
        

// @LINE:14
case controllers_Application_indexStudent7(params) => {
   call { 
        invokeHandler(controllers.Application.indexStudent(), HandlerDef(this, "controllers.Application", "indexStudent", Nil,"GET", """""", Routes.prefix + """indexStudent"""))
   }
}
        

// @LINE:15
case controllers_Application_profPageDisplay8(params) => {
   call { 
        invokeHandler(controllers.Application.profPageDisplay(), HandlerDef(this, "controllers.Application", "profPageDisplay", Nil,"GET", """""", Routes.prefix + """profPage"""))
   }
}
        

// @LINE:19
case controllers_Assets_at9(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     