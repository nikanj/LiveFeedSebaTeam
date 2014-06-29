// @SOURCE:D:/Master's Germany/Sem 4 subs/SEBA/Final/livefeed/conf/routes
// @HASH:86ce48cf7fd60a82bf42a12b2712e3eb1bb6c272
// @DATE:Sun Jun 29 23:37:52 CEST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:25
class ReverseAssets {
    

// @LINE:25
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:12
// @LINE:9
class ReverseProfsignin {
    

// @LINE:9
def profSignIn(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profSignIn")
}
                                                

// @LINE:12
def validate(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "validate")
}
                                                
    
}
                          

// @LINE:22
// @LINE:21
// @LINE:20
class ReverseAboutAndContact {
    

// @LINE:22
def feedbackPage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "feedback")
}
                                                

// @LINE:20
def aboutUsPage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "aboutus")
}
                                                

// @LINE:21
def contactUsPage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "contact")
}
                                                
    
}
                          

// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def homePage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "home")
}
                                                

// @LINE:19
def profPageDisplay(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profPage")
}
                                                

// @LINE:16
def vote(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "postVotes")
}
                                                

// @LINE:15
// @LINE:14
def postQuestion(): Call = {
   () match {
// @LINE:14
case () if true => Call("POST", _prefix + { _defaultPrefix } + "postStudentQuestion")
                                                        
// @LINE:15
case () if true => Call("POST", _prefix + { _defaultPrefix } + "postTheQuestion")
                                                        
   }
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:11
// @LINE:10
class ReverseStudentLectureVisit {
    

// @LINE:11
def lectureEnter(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "studentLectureVisit")
}
                                                

// @LINE:10
def enterLectureValidate(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "studentValidate")
}
                                                
    
}
                          

// @LINE:13
class ReverseReport {
    

// @LINE:13
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signout")
}
                                                
    
}
                          

// @LINE:17
class ReverseNewCourse {
    

// @LINE:17
def addCourse(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "addCourse")
}
                                                
    
}
                          
}
                  


// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:25
class ReverseAssets {
    

// @LINE:25
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:12
// @LINE:9
class ReverseProfsignin {
    

// @LINE:9
def profSignIn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Profsignin.profSignIn",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profSignIn"})
      }
   """
)
                        

// @LINE:12
def validate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Profsignin.validate",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "validate"})
      }
   """
)
                        
    
}
              

// @LINE:22
// @LINE:21
// @LINE:20
class ReverseAboutAndContact {
    

// @LINE:22
def feedbackPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutAndContact.feedbackPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "feedback"})
      }
   """
)
                        

// @LINE:20
def aboutUsPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutAndContact.aboutUsPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutus"})
      }
   """
)
                        

// @LINE:21
def contactUsPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutAndContact.contactUsPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
      }
   """
)
                        
    
}
              

// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def homePage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.homePage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
      }
   """
)
                        

// @LINE:19
def profPageDisplay : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.profPageDisplay",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profPage"})
      }
   """
)
                        

// @LINE:16
def vote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.vote",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "postVotes"})
      }
   """
)
                        

// @LINE:15
// @LINE:14
def postQuestion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.postQuestion",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "postStudentQuestion"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "postTheQuestion"})
      }
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:11
// @LINE:10
class ReverseStudentLectureVisit {
    

// @LINE:11
def lectureEnter : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentLectureVisit.lectureEnter",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studentLectureVisit"})
      }
   """
)
                        

// @LINE:10
def enterLectureValidate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentLectureVisit.enterLectureValidate",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studentValidate"})
      }
   """
)
                        
    
}
              

// @LINE:13
class ReverseReport {
    

// @LINE:13
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Report.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signout"})
      }
   """
)
                        
    
}
              

// @LINE:17
class ReverseNewCourse {
    

// @LINE:17
def addCourse : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NewCourse.addCourse",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addCourse"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:25
class ReverseAssets {
    

// @LINE:25
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:12
// @LINE:9
class ReverseProfsignin {
    

// @LINE:9
def profSignIn(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Profsignin.profSignIn(), HandlerDef(this, "controllers.Profsignin", "profSignIn", Seq(), "GET", """""", _prefix + """profSignIn""")
)
                      

// @LINE:12
def validate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Profsignin.validate(), HandlerDef(this, "controllers.Profsignin", "validate", Seq(), "GET", """""", _prefix + """validate""")
)
                      
    
}
                          

// @LINE:22
// @LINE:21
// @LINE:20
class ReverseAboutAndContact {
    

// @LINE:22
def feedbackPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutAndContact.feedbackPage(), HandlerDef(this, "controllers.AboutAndContact", "feedbackPage", Seq(), "GET", """""", _prefix + """feedback""")
)
                      

// @LINE:20
def aboutUsPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutAndContact.aboutUsPage(), HandlerDef(this, "controllers.AboutAndContact", "aboutUsPage", Seq(), "GET", """""", _prefix + """aboutus""")
)
                      

// @LINE:21
def contactUsPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutAndContact.contactUsPage(), HandlerDef(this, "controllers.AboutAndContact", "contactUsPage", Seq(), "GET", """""", _prefix + """contact""")
)
                      
    
}
                          

// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def homePage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.homePage(), HandlerDef(this, "controllers.Application", "homePage", Seq(), "GET", """ Main pages""", _prefix + """home""")
)
                      

// @LINE:19
def profPageDisplay(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.profPageDisplay(), HandlerDef(this, "controllers.Application", "profPageDisplay", Seq(), "GET", """GET  	/vote    						controllers.Application.vote()""", _prefix + """profPage""")
)
                      

// @LINE:16
def vote(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.vote(), HandlerDef(this, "controllers.Application", "vote", Seq(), "POST", """""", _prefix + """postVotes""")
)
                      

// @LINE:14
def postQuestion(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.postQuestion(), HandlerDef(this, "controllers.Application", "postQuestion", Seq(), "POST", """""", _prefix + """postStudentQuestion""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:11
// @LINE:10
class ReverseStudentLectureVisit {
    

// @LINE:11
def lectureEnter(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentLectureVisit.lectureEnter(), HandlerDef(this, "controllers.StudentLectureVisit", "lectureEnter", Seq(), "GET", """""", _prefix + """studentLectureVisit""")
)
                      

// @LINE:10
def enterLectureValidate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentLectureVisit.enterLectureValidate(), HandlerDef(this, "controllers.StudentLectureVisit", "enterLectureValidate", Seq(), "GET", """""", _prefix + """studentValidate""")
)
                      
    
}
                          

// @LINE:13
class ReverseReport {
    

// @LINE:13
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Report.logout(), HandlerDef(this, "controllers.Report", "logout", Seq(), "GET", """""", _prefix + """signout""")
)
                      
    
}
                          

// @LINE:17
class ReverseNewCourse {
    

// @LINE:17
def addCourse(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NewCourse.addCourse(), HandlerDef(this, "controllers.NewCourse", "addCourse", Seq(), "GET", """""", _prefix + """addCourse""")
)
                      
    
}
                          
}
        
    