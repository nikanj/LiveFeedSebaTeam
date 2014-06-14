// @SOURCE:D:/Master's Germany/Sem 4 subs/SEBA/Exercise 3/LiveFeedSebaTeam_Voting/LiveFeedSebaTeam/conf/routes
// @HASH:0d2745ac0c3027f8a288337160bb56c5c2542d11
// @DATE:Sat Jun 14 09:35:12 CEST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:19
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

// @LINE:19
class ReverseAssets {
    

// @LINE:19
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def homePage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "home")
}
                                                

// @LINE:15
def profPageDisplay(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profPage")
}
                                                

// @LINE:14
// @LINE:12
def indexStudent(): Call = {
   () match {
// @LINE:12
case () if true => Call("GET", _prefix + { _defaultPrefix } + "indexStudent")
                                                        
// @LINE:14
case () if true => Call("GET", _prefix + { _defaultPrefix } + "indexStudent")
                                                        
   }
}
                                                

// @LINE:13
def vote(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "vote")
}
                                                

// @LINE:9
def profSignIn(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profSignIn")
}
                                                

// @LINE:11
def postQuestion(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "postQuestion")
}
                                                

// @LINE:10
def profMainPage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profMainPage")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:19
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

// @LINE:19
class ReverseAssets {
    

// @LINE:19
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
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
                        

// @LINE:15
def profPageDisplay : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.profPageDisplay",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profPage"})
      }
   """
)
                        

// @LINE:14
// @LINE:12
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
                        

// @LINE:13
def vote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.vote",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vote"})
      }
   """
)
                        

// @LINE:9
def profSignIn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.profSignIn",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profSignIn"})
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
                        

// @LINE:10
def profMainPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.profMainPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profMainPage"})
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
              
}
        


// @LINE:19
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


// @LINE:19
class ReverseAssets {
    

// @LINE:19
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def homePage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.homePage(), HandlerDef(this, "controllers.Application", "homePage", Seq(), "GET", """ Main pages""", _prefix + """home""")
)
                      

// @LINE:15
def profPageDisplay(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.profPageDisplay(), HandlerDef(this, "controllers.Application", "profPageDisplay", Seq(), "GET", """""", _prefix + """profPage""")
)
                      

// @LINE:12
def indexStudent(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.indexStudent(), HandlerDef(this, "controllers.Application", "indexStudent", Seq(), "GET", """""", _prefix + """indexStudent""")
)
                      

// @LINE:13
def vote(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.vote(), HandlerDef(this, "controllers.Application", "vote", Seq(), "GET", """""", _prefix + """vote""")
)
                      

// @LINE:9
def profSignIn(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.profSignIn(), HandlerDef(this, "controllers.Application", "profSignIn", Seq(), "GET", """""", _prefix + """profSignIn""")
)
                      

// @LINE:11
def postQuestion(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.postQuestion(), HandlerDef(this, "controllers.Application", "postQuestion", Seq(), "POST", """""", _prefix + """postQuestion""")
)
                      

// @LINE:10
def profMainPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.profMainPage(), HandlerDef(this, "controllers.Application", "profMainPage", Seq(), "GET", """""", _prefix + """profMainPage""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    