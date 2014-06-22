// @SOURCE:D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/conf/routes
// @HASH:269c8da57525c61b7e2a0c78db6c5e0d8b7476a6
// @DATE:Sun Jun 22 12:33:38 CEST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:24
class ReverseAssets {
    

// @LINE:24
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:10
class ReverseStudentLogin {
    

// @LINE:10
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "studentLogin")
}
                                                
    
}
                          

// @LINE:11
// @LINE:9
class ReverseProfsignin {
    

// @LINE:9
def profSignIn(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profSignIn")
}
                                                

// @LINE:11
def validate(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "validate")
}
                                                
    
}
                          

// @LINE:21
// @LINE:20
// @LINE:19
class ReverseAboutAndContact {
    

// @LINE:21
def feedbackPage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "feedback")
}
                                                

// @LINE:19
def aboutUsPage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "aboutus")
}
                                                

// @LINE:20
def contactUsPage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "contact")
}
                                                
    
}
                          

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def homePage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "home")
}
                                                

// @LINE:17
def profPageDisplay(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profPage")
}
                                                

// @LINE:16
// @LINE:14
def indexStudent(): Call = {
   () match {
// @LINE:14
case () if true => Call("GET", _prefix + { _defaultPrefix } + "indexStudent")
                                                        
// @LINE:16
case () if true => Call("GET", _prefix + { _defaultPrefix } + "indexStudent")
                                                        
   }
}
                                                

// @LINE:15
def vote(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "vote")
}
                                                

// @LINE:12
def postQuestion(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "postQuestion")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:18
class ReverseReport {
    

// @LINE:18
def report(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "report")
}
                                                
    
}
                          
}
                  


// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:24
class ReverseAssets {
    

// @LINE:24
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:10
class ReverseStudentLogin {
    

// @LINE:10
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentLogin.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studentLogin"})
      }
   """
)
                        
    
}
              

// @LINE:11
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
                        

// @LINE:11
def validate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Profsignin.validate",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "validate"})
      }
   """
)
                        
    
}
              

// @LINE:21
// @LINE:20
// @LINE:19
class ReverseAboutAndContact {
    

// @LINE:21
def feedbackPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutAndContact.feedbackPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "feedback"})
      }
   """
)
                        

// @LINE:19
def aboutUsPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutAndContact.aboutUsPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutus"})
      }
   """
)
                        

// @LINE:20
def contactUsPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutAndContact.contactUsPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
      }
   """
)
                        
    
}
              

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:12
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
                        

// @LINE:17
def profPageDisplay : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.profPageDisplay",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profPage"})
      }
   """
)
                        

// @LINE:16
// @LINE:14
def indexStudent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.indexStudent",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "indexStudent"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "indexStudent"})
      }
      }
   """
)
                        

// @LINE:15
def vote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.vote",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vote"})
      }
   """
)
                        

// @LINE:12
def postQuestion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.postQuestion",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "postQuestion"})
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
              

// @LINE:18
class ReverseReport {
    

// @LINE:18
def report : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Report.report",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "report"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:24
class ReverseAssets {
    

// @LINE:24
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:10
class ReverseStudentLogin {
    

// @LINE:10
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentLogin.login(), HandlerDef(this, "controllers.StudentLogin", "login", Seq(), "GET", """""", _prefix + """studentLogin""")
)
                      
    
}
                          

// @LINE:11
// @LINE:9
class ReverseProfsignin {
    

// @LINE:9
def profSignIn(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Profsignin.profSignIn(), HandlerDef(this, "controllers.Profsignin", "profSignIn", Seq(), "GET", """""", _prefix + """profSignIn""")
)
                      

// @LINE:11
def validate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Profsignin.validate(), HandlerDef(this, "controllers.Profsignin", "validate", Seq(), "GET", """""", _prefix + """validate""")
)
                      
    
}
                          

// @LINE:21
// @LINE:20
// @LINE:19
class ReverseAboutAndContact {
    

// @LINE:21
def feedbackPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutAndContact.feedbackPage(), HandlerDef(this, "controllers.AboutAndContact", "feedbackPage", Seq(), "GET", """""", _prefix + """feedback""")
)
                      

// @LINE:19
def aboutUsPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutAndContact.aboutUsPage(), HandlerDef(this, "controllers.AboutAndContact", "aboutUsPage", Seq(), "GET", """""", _prefix + """aboutus""")
)
                      

// @LINE:20
def contactUsPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutAndContact.contactUsPage(), HandlerDef(this, "controllers.AboutAndContact", "contactUsPage", Seq(), "GET", """""", _prefix + """contact""")
)
                      
    
}
                          

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def homePage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.homePage(), HandlerDef(this, "controllers.Application", "homePage", Seq(), "GET", """ Main pages""", _prefix + """home""")
)
                      

// @LINE:17
def profPageDisplay(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.profPageDisplay(), HandlerDef(this, "controllers.Application", "profPageDisplay", Seq(), "GET", """""", _prefix + """profPage""")
)
                      

// @LINE:14
def indexStudent(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.indexStudent(), HandlerDef(this, "controllers.Application", "indexStudent", Seq(), "GET", """POST	/addCourse						controllers.NewCourse.addCourse()""", _prefix + """indexStudent""")
)
                      

// @LINE:15
def vote(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.vote(), HandlerDef(this, "controllers.Application", "vote", Seq(), "GET", """""", _prefix + """vote""")
)
                      

// @LINE:12
def postQuestion(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.postQuestion(), HandlerDef(this, "controllers.Application", "postQuestion", Seq(), "GET", """""", _prefix + """postQuestion""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:18
class ReverseReport {
    

// @LINE:18
def report(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Report.report(), HandlerDef(this, "controllers.Report", "report", Seq(), "GET", """""", _prefix + """report""")
)
                      
    
}
                          
}
        
    