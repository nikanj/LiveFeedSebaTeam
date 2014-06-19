// @SOURCE:D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/conf/routes
// @HASH:30dc0f596f5f3f57712aef6861df9aedc9757237
// @DATE:Thu Jun 19 19:01:55 CEST 2014

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
// @LINE:18
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
                          

// @LINE:16
// @LINE:13
// @LINE:10
// @LINE:9
class ReverseProfsignin {
    

// @LINE:9
def profSignIn(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profSignIn")
}
                                                

// @LINE:16
// @LINE:13
def postLogin(): Call = {
   () match {
// @LINE:13
case () if true => Call("POST", _prefix + { _defaultPrefix } + "postLogin")
                                                        
// @LINE:16
case () if true => Call("GET", _prefix + { _defaultPrefix } + "validate")
                                                        
   }
}
                                                

// @LINE:10
def profHome(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profHome")
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
                          

// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def homePage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "home")
}
                                                

// @LINE:18
def profPageDisplay(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profPage")
}
                                                

// @LINE:17
// @LINE:14
def indexStudent(): Call = {
   () match {
// @LINE:14
case () if true => Call("GET", _prefix + { _defaultPrefix } + "indexStudent")
                                                        
// @LINE:17
case () if true => Call("GET", _prefix + { _defaultPrefix } + "indexStudent")
                                                        
   }
}
                                                

// @LINE:15
def vote(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "vote")
}
                                                

// @LINE:11
def postQuestion(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "postQuestion")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:19
class ReverseReport {
    

// @LINE:19
def report(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "report")
}
                                                
    
}
                          

// @LINE:12
class ReverseNewCourse {
    

// @LINE:12
def addCourse(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "addCourse")
}
                                                
    
}
                          
}
                  


// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
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
              

// @LINE:16
// @LINE:13
// @LINE:10
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
                        

// @LINE:16
// @LINE:13
def postLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Profsignin.postLogin",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "postLogin"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "validate"})
      }
      }
   """
)
                        

// @LINE:10
def profHome : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Profsignin.profHome",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profHome"})
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
              

// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:11
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
                        

// @LINE:18
def profPageDisplay : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.profPageDisplay",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profPage"})
      }
   """
)
                        

// @LINE:17
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
                        

// @LINE:11
def postQuestion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.postQuestion",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "postQuestion"})
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
              

// @LINE:19
class ReverseReport {
    

// @LINE:19
def report : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Report.report",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "report"})
      }
   """
)
                        
    
}
              

// @LINE:12
class ReverseNewCourse {
    

// @LINE:12
def addCourse : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NewCourse.addCourse",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addCourse"})
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
// @LINE:18
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
                          

// @LINE:16
// @LINE:13
// @LINE:10
// @LINE:9
class ReverseProfsignin {
    

// @LINE:9
def profSignIn(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Profsignin.profSignIn(), HandlerDef(this, "controllers.Profsignin", "profSignIn", Seq(), "GET", """""", _prefix + """profSignIn""")
)
                      

// @LINE:13
def postLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Profsignin.postLogin(), HandlerDef(this, "controllers.Profsignin", "postLogin", Seq(), "POST", """""", _prefix + """postLogin""")
)
                      

// @LINE:10
def profHome(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Profsignin.profHome(), HandlerDef(this, "controllers.Profsignin", "profHome", Seq(), "GET", """""", _prefix + """profHome""")
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
                          

// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def homePage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.homePage(), HandlerDef(this, "controllers.Application", "homePage", Seq(), "GET", """ Main pages""", _prefix + """home""")
)
                      

// @LINE:18
def profPageDisplay(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.profPageDisplay(), HandlerDef(this, "controllers.Application", "profPageDisplay", Seq(), "GET", """""", _prefix + """profPage""")
)
                      

// @LINE:14
def indexStudent(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.indexStudent(), HandlerDef(this, "controllers.Application", "indexStudent", Seq(), "GET", """""", _prefix + """indexStudent""")
)
                      

// @LINE:15
def vote(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.vote(), HandlerDef(this, "controllers.Application", "vote", Seq(), "GET", """""", _prefix + """vote""")
)
                      

// @LINE:11
def postQuestion(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.postQuestion(), HandlerDef(this, "controllers.Application", "postQuestion", Seq(), "POST", """""", _prefix + """postQuestion""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:19
class ReverseReport {
    

// @LINE:19
def report(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Report.report(), HandlerDef(this, "controllers.Report", "report", Seq(), "GET", """""", _prefix + """report""")
)
                      
    
}
                          

// @LINE:12
class ReverseNewCourse {
    

// @LINE:12
def addCourse(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NewCourse.addCourse(), HandlerDef(this, "controllers.NewCourse", "addCourse", Seq(), "POST", """""", _prefix + """addCourse""")
)
                      
    
}
                          
}
        
    