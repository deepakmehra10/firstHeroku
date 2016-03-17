
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/trial/TraineeAppRepo/TraineeAppRepo/myFirstApp/conf/routes
// @DATE:Tue Mar 15 17:49:31 IST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:8
  class ReverseWebJarAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WebJarAssets.at",
      """
        function(file) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
          }
        
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseUsersController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:51
    def getInterns: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.getInterns",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getintern"})
        }
      """
    )
  
    // @LINE:43
    def getUserAwards: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.getUserAwards",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getuserawards"})
        }
      """
    )
  
    // @LINE:47
    def getUserLanguage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.getUserLanguage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getuserlanguage"})
        }
      """
    )
  
    // @LINE:53
    def addInterns: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.addInterns",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/addintern"})
        }
      """
    )
  
    // @LINE:33
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/login"})
        }
      """
    )
  
    // @LINE:25
    def renderLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.renderLogin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/login"})
        }
      """
    )
  
    // @LINE:49
    def getUserProgramming: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.getUserProgramming",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getuserprogramming"})
        }
      """
    )
  
    // @LINE:35
    def getAwards: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.getAwards",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getawards"})
        }
      """
    )
  
    // @LINE:23
    def renderSignUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.renderSignUp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:31
    def renderuserHomepage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.renderuserHomepage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/homepage"})
        }
      """
    )
  
    // @LINE:27
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/authenticate"})
        }
      """
    )
  
    // @LINE:39
    def getAssignment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.getAssignment",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getassignment"})
        }
      """
    )
  
    // @LINE:37
    def getLanguages: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.getLanguages",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getlanguage"})
        }
      """
    )
  
    // @LINE:45
    def getUserAssignment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.getUserAssignment",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getuserassignment"})
        }
      """
    )
  
    // @LINE:29
    def renderHomepage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.renderHomepage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "homepage"})
        }
      """
    )
  
    // @LINE:41
    def getProgramming: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.getProgramming",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getprogramming"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:56
    def getNames: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getNames",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getNames"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}