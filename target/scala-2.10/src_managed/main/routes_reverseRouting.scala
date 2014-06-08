// @SOURCE:D:/Master's Germany/Sem 4 subs/SEBA/Play app's/LiveFeed/conf/routes
// @HASH:7dcd8f26a9d06d260019c4f053a6b69113770103
// @DATE:Sun Jun 08 15:40:28 CEST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:16
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:16
class ReverseAssets {
    

// @LINE:16
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def profPageDisplay(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profPage")
}
                                                

// @LINE:11
def indexStudent(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "indexStudent")
}
                                                

// @LINE:9
def profSignIn(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profSignIn")
}
                                                

// @LINE:10
def profMainPage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profMainPage")
}
                                                

// @LINE:8
// @LINE:6
def index(): Call = {
   () match {
// @LINE:6
case () if true => Call("GET", _prefix)
                                                        
// @LINE:8
case () if true => Call("GET", _prefix + { _defaultPrefix } + "home")
                                                        
   }
}
                                                
    
}
                          
}
                  


// @LINE:16
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:16
class ReverseAssets {
    

// @LINE:16
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
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def profPageDisplay : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.profPageDisplay",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profPage"})
      }
   """
)
                        

// @LINE:11
def indexStudent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.indexStudent",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "indexStudent"})
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
                        

// @LINE:10
def profMainPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.profMainPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profMainPage"})
      }
   """
)
                        

// @LINE:8
// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
      }
      }
   """
)
                        
    
}
              
}
        


// @LINE:16
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:16
class ReverseAssets {
    

// @LINE:16
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def profPageDisplay(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.profPageDisplay(), HandlerDef(this, "controllers.Application", "profPageDisplay", Seq(), "GET", """""", _prefix + """profPage""")
)
                      

// @LINE:11
def indexStudent(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.indexStudent(), HandlerDef(this, "controllers.Application", "indexStudent", Seq(), "GET", """""", _prefix + """indexStudent""")
)
                      

// @LINE:9
def profSignIn(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.profSignIn(), HandlerDef(this, "controllers.Application", "profSignIn", Seq(), "GET", """""", _prefix + """profSignIn""")
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
        
    