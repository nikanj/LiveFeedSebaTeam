// @SOURCE:D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/conf/routes
// @HASH:8887106b1bf5a29b17528dd10126399d20430188
// @DATE:Sat Jun 21 23:33:09 CEST 2014


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
private[this] lazy val controllers_Profsignin_profSignIn2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profSignIn"))))
        

// @LINE:10
private[this] lazy val controllers_Profsignin_profHome3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profHome"))))
        

// @LINE:11
private[this] lazy val controllers_StudentLogin_login4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("studentLogin"))))
        

// @LINE:12
private[this] lazy val controllers_Profsignin_validate5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("validate"))))
        

// @LINE:13
private[this] lazy val controllers_Application_postQuestion6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("postQuestion"))))
        

// @LINE:14
private[this] lazy val controllers_NewCourse_addCourse7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addCourse"))))
        

// @LINE:15
private[this] lazy val controllers_Application_indexStudent8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("indexStudent"))))
        

// @LINE:16
private[this] lazy val controllers_Application_vote9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("vote"))))
        

// @LINE:17
private[this] lazy val controllers_Application_indexStudent10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("indexStudent"))))
        

// @LINE:18
private[this] lazy val controllers_Application_profPageDisplay11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profPage"))))
        

// @LINE:19
private[this] lazy val controllers_Report_report12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("report"))))
        

// @LINE:20
private[this] lazy val controllers_AboutAndContact_aboutUsPage13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutus"))))
        

// @LINE:21
private[this] lazy val controllers_AboutAndContact_contactUsPage14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("contact"))))
        

// @LINE:22
private[this] lazy val controllers_AboutAndContact_feedbackPage15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("feedback"))))
        

// @LINE:25
private[this] lazy val controllers_Assets_at16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home""","""controllers.Application.homePage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profSignIn""","""controllers.Profsignin.profSignIn()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profHome""","""controllers.Profsignin.profHome()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """studentLogin""","""controllers.StudentLogin.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """validate""","""controllers.Profsignin.validate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """postQuestion""","""controllers.Application.postQuestion()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addCourse""","""controllers.NewCourse.addCourse()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """indexStudent""","""controllers.Application.indexStudent()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """vote""","""controllers.Application.vote()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """indexStudent""","""controllers.Application.indexStudent()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profPage""","""controllers.Application.profPageDisplay()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """report""","""controllers.Report.report()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutus""","""controllers.AboutAndContact.aboutUsPage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contact""","""controllers.AboutAndContact.contactUsPage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """feedback""","""controllers.AboutAndContact.feedbackPage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
case controllers_Profsignin_profSignIn2(params) => {
   call { 
        invokeHandler(controllers.Profsignin.profSignIn(), HandlerDef(this, "controllers.Profsignin", "profSignIn", Nil,"GET", """""", Routes.prefix + """profSignIn"""))
   }
}
        

// @LINE:10
case controllers_Profsignin_profHome3(params) => {
   call { 
        invokeHandler(controllers.Profsignin.profHome(), HandlerDef(this, "controllers.Profsignin", "profHome", Nil,"GET", """""", Routes.prefix + """profHome"""))
   }
}
        

// @LINE:11
case controllers_StudentLogin_login4(params) => {
   call { 
        invokeHandler(controllers.StudentLogin.login(), HandlerDef(this, "controllers.StudentLogin", "login", Nil,"GET", """""", Routes.prefix + """studentLogin"""))
   }
}
        

// @LINE:12
case controllers_Profsignin_validate5(params) => {
   call { 
        invokeHandler(controllers.Profsignin.validate(), HandlerDef(this, "controllers.Profsignin", "validate", Nil,"GET", """""", Routes.prefix + """validate"""))
   }
}
        

// @LINE:13
case controllers_Application_postQuestion6(params) => {
   call { 
        invokeHandler(controllers.Application.postQuestion(), HandlerDef(this, "controllers.Application", "postQuestion", Nil,"GET", """""", Routes.prefix + """postQuestion"""))
   }
}
        

// @LINE:14
case controllers_NewCourse_addCourse7(params) => {
   call { 
        invokeHandler(controllers.NewCourse.addCourse(), HandlerDef(this, "controllers.NewCourse", "addCourse", Nil,"POST", """""", Routes.prefix + """addCourse"""))
   }
}
        

// @LINE:15
case controllers_Application_indexStudent8(params) => {
   call { 
        invokeHandler(controllers.Application.indexStudent(), HandlerDef(this, "controllers.Application", "indexStudent", Nil,"GET", """""", Routes.prefix + """indexStudent"""))
   }
}
        

// @LINE:16
case controllers_Application_vote9(params) => {
   call { 
        invokeHandler(controllers.Application.vote(), HandlerDef(this, "controllers.Application", "vote", Nil,"GET", """""", Routes.prefix + """vote"""))
   }
}
        

// @LINE:17
case controllers_Application_indexStudent10(params) => {
   call { 
        invokeHandler(controllers.Application.indexStudent(), HandlerDef(this, "controllers.Application", "indexStudent", Nil,"GET", """""", Routes.prefix + """indexStudent"""))
   }
}
        

// @LINE:18
case controllers_Application_profPageDisplay11(params) => {
   call { 
        invokeHandler(controllers.Application.profPageDisplay(), HandlerDef(this, "controllers.Application", "profPageDisplay", Nil,"GET", """""", Routes.prefix + """profPage"""))
   }
}
        

// @LINE:19
case controllers_Report_report12(params) => {
   call { 
        invokeHandler(controllers.Report.report(), HandlerDef(this, "controllers.Report", "report", Nil,"GET", """""", Routes.prefix + """report"""))
   }
}
        

// @LINE:20
case controllers_AboutAndContact_aboutUsPage13(params) => {
   call { 
        invokeHandler(controllers.AboutAndContact.aboutUsPage(), HandlerDef(this, "controllers.AboutAndContact", "aboutUsPage", Nil,"GET", """""", Routes.prefix + """aboutus"""))
   }
}
        

// @LINE:21
case controllers_AboutAndContact_contactUsPage14(params) => {
   call { 
        invokeHandler(controllers.AboutAndContact.contactUsPage(), HandlerDef(this, "controllers.AboutAndContact", "contactUsPage", Nil,"GET", """""", Routes.prefix + """contact"""))
   }
}
        

// @LINE:22
case controllers_AboutAndContact_feedbackPage15(params) => {
   call { 
        invokeHandler(controllers.AboutAndContact.feedbackPage(), HandlerDef(this, "controllers.AboutAndContact", "feedbackPage", Nil,"GET", """""", Routes.prefix + """feedback"""))
   }
}
        

// @LINE:25
case controllers_Assets_at16(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     