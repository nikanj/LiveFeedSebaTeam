// @SOURCE:D:/Master's Germany/Sem 4 subs/SEBA/Final/livefeed/conf/routes
// @HASH:86ce48cf7fd60a82bf42a12b2712e3eb1bb6c272
// @DATE:Thu Jun 26 15:15:35 CEST 2014


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
private[this] lazy val controllers_StudentLectureVisit_enterLectureValidate3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("studentValidate"))))
        

// @LINE:11
private[this] lazy val controllers_StudentLectureVisit_lectureEnter4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("studentLectureVisit"))))
        

// @LINE:12
private[this] lazy val controllers_Profsignin_validate5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("validate"))))
        

// @LINE:13
private[this] lazy val controllers_Report_logout6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signout"))))
        

// @LINE:14
private[this] lazy val controllers_Application_postQuestion7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("postStudentQuestion"))))
        

// @LINE:15
private[this] lazy val controllers_Application_postQuestion8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("postTheQuestion"))))
        

// @LINE:16
private[this] lazy val controllers_Application_vote9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("postVotes"))))
        

// @LINE:17
private[this] lazy val controllers_NewCourse_addCourse10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addCourse"))))
        

// @LINE:19
private[this] lazy val controllers_Application_profPageDisplay11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profPage"))))
        

// @LINE:20
private[this] lazy val controllers_AboutAndContact_aboutUsPage12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutus"))))
        

// @LINE:21
private[this] lazy val controllers_AboutAndContact_contactUsPage13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("contact"))))
        

// @LINE:22
private[this] lazy val controllers_AboutAndContact_feedbackPage14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("feedback"))))
        

// @LINE:25
private[this] lazy val controllers_Assets_at15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home""","""controllers.Application.homePage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profSignIn""","""controllers.Profsignin.profSignIn()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """studentValidate""","""controllers.StudentLectureVisit.enterLectureValidate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """studentLectureVisit""","""controllers.StudentLectureVisit.lectureEnter()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """validate""","""controllers.Profsignin.validate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signout""","""controllers.Report.logout()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """postStudentQuestion""","""controllers.Application.postQuestion()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """postTheQuestion""","""controllers.Application.postQuestion()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """postVotes""","""controllers.Application.vote()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addCourse""","""controllers.NewCourse.addCourse()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profPage""","""controllers.Application.profPageDisplay()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutus""","""controllers.AboutAndContact.aboutUsPage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contact""","""controllers.AboutAndContact.contactUsPage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """feedback""","""controllers.AboutAndContact.feedbackPage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
case controllers_StudentLectureVisit_enterLectureValidate3(params) => {
   call { 
        invokeHandler(controllers.StudentLectureVisit.enterLectureValidate(), HandlerDef(this, "controllers.StudentLectureVisit", "enterLectureValidate", Nil,"GET", """""", Routes.prefix + """studentValidate"""))
   }
}
        

// @LINE:11
case controllers_StudentLectureVisit_lectureEnter4(params) => {
   call { 
        invokeHandler(controllers.StudentLectureVisit.lectureEnter(), HandlerDef(this, "controllers.StudentLectureVisit", "lectureEnter", Nil,"GET", """""", Routes.prefix + """studentLectureVisit"""))
   }
}
        

// @LINE:12
case controllers_Profsignin_validate5(params) => {
   call { 
        invokeHandler(controllers.Profsignin.validate(), HandlerDef(this, "controllers.Profsignin", "validate", Nil,"GET", """""", Routes.prefix + """validate"""))
   }
}
        

// @LINE:13
case controllers_Report_logout6(params) => {
   call { 
        invokeHandler(controllers.Report.logout(), HandlerDef(this, "controllers.Report", "logout", Nil,"GET", """""", Routes.prefix + """signout"""))
   }
}
        

// @LINE:14
case controllers_Application_postQuestion7(params) => {
   call { 
        invokeHandler(controllers.Application.postQuestion(), HandlerDef(this, "controllers.Application", "postQuestion", Nil,"POST", """""", Routes.prefix + """postStudentQuestion"""))
   }
}
        

// @LINE:15
case controllers_Application_postQuestion8(params) => {
   call { 
        invokeHandler(controllers.Application.postQuestion(), HandlerDef(this, "controllers.Application", "postQuestion", Nil,"POST", """""", Routes.prefix + """postTheQuestion"""))
   }
}
        

// @LINE:16
case controllers_Application_vote9(params) => {
   call { 
        invokeHandler(controllers.Application.vote(), HandlerDef(this, "controllers.Application", "vote", Nil,"POST", """""", Routes.prefix + """postVotes"""))
   }
}
        

// @LINE:17
case controllers_NewCourse_addCourse10(params) => {
   call { 
        invokeHandler(controllers.NewCourse.addCourse(), HandlerDef(this, "controllers.NewCourse", "addCourse", Nil,"GET", """""", Routes.prefix + """addCourse"""))
   }
}
        

// @LINE:19
case controllers_Application_profPageDisplay11(params) => {
   call { 
        invokeHandler(controllers.Application.profPageDisplay(), HandlerDef(this, "controllers.Application", "profPageDisplay", Nil,"GET", """GET  	/vote    						controllers.Application.vote()""", Routes.prefix + """profPage"""))
   }
}
        

// @LINE:20
case controllers_AboutAndContact_aboutUsPage12(params) => {
   call { 
        invokeHandler(controllers.AboutAndContact.aboutUsPage(), HandlerDef(this, "controllers.AboutAndContact", "aboutUsPage", Nil,"GET", """""", Routes.prefix + """aboutus"""))
   }
}
        

// @LINE:21
case controllers_AboutAndContact_contactUsPage13(params) => {
   call { 
        invokeHandler(controllers.AboutAndContact.contactUsPage(), HandlerDef(this, "controllers.AboutAndContact", "contactUsPage", Nil,"GET", """""", Routes.prefix + """contact"""))
   }
}
        

// @LINE:22
case controllers_AboutAndContact_feedbackPage14(params) => {
   call { 
        invokeHandler(controllers.AboutAndContact.feedbackPage(), HandlerDef(this, "controllers.AboutAndContact", "feedbackPage", Nil,"GET", """""", Routes.prefix + """feedback"""))
   }
}
        

// @LINE:25
case controllers_Assets_at15(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     