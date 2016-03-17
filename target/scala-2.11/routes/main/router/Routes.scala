
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/trial/TraineeAppRepo/TraineeAppRepo/myFirstApp/conf/routes
// @DATE:Tue Mar 15 17:49:31 IST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_2: controllers.Application,
  // @LINE:8
  WebJarAssets_0: controllers.WebJarAssets,
  // @LINE:13
  Assets_1: controllers.Assets,
  // @LINE:23
  UsersController_3: controllers.UsersController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_2: controllers.Application,
    // @LINE:8
    WebJarAssets_0: controllers.WebJarAssets,
    // @LINE:13
    Assets_1: controllers.Assets,
    // @LINE:23
    UsersController_3: controllers.UsersController
  ) = this(errorHandler, Application_2, WebJarAssets_0, Assets_1, UsersController_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_2, WebJarAssets_0, Assets_1, UsersController_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""", """controllers.WebJarAssets.at(file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""", """controllers.WebJarAssets.at(file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.UsersController.renderSignUp()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/login""", """controllers.UsersController.renderLogin()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/authenticate""", """controllers.UsersController.authenticate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """homepage""", """controllers.UsersController.renderHomepage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/homepage""", """controllers.UsersController.renderuserHomepage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/login""", """controllers.UsersController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/getawards""", """controllers.UsersController.getAwards"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/getlanguage""", """controllers.UsersController.getLanguages"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/getassignment""", """controllers.UsersController.getAssignment"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/getprogramming""", """controllers.UsersController.getProgramming"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/getuserawards""", """controllers.UsersController.getUserAwards"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/getuserassignment""", """controllers.UsersController.getUserAssignment"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/getuserlanguage""", """controllers.UsersController.getUserLanguage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/getuserprogramming""", """controllers.UsersController.getUserProgramming"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/getintern""", """controllers.UsersController.getInterns"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addintern""", """controllers.UsersController.addInterns"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getNames""", """controllers.Application.getNames"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_WebJarAssets_at1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at1_invoker = createInvoker(
    WebJarAssets_0.at(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebJarAssets",
      "at",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """webjars/$file<.+>"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned2_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_WebJarAssets_at3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at3_invoker = createInvoker(
    WebJarAssets_0.at(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebJarAssets",
      "at",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """webjars/$file<.+>"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_UsersController_renderSignUp4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_UsersController_renderSignUp4_invoker = createInvoker(
    UsersController_3.renderSignUp(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "renderSignUp",
      Nil,
      "GET",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_UsersController_renderLogin5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/login")))
  )
  private[this] lazy val controllers_UsersController_renderLogin5_invoker = createInvoker(
    UsersController_3.renderLogin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "renderLogin",
      Nil,
      "GET",
      """""",
      this.prefix + """users/login"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_UsersController_authenticate6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/authenticate")))
  )
  private[this] lazy val controllers_UsersController_authenticate6_invoker = createInvoker(
    UsersController_3.authenticate,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """users/authenticate"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_UsersController_renderHomepage7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("homepage")))
  )
  private[this] lazy val controllers_UsersController_renderHomepage7_invoker = createInvoker(
    UsersController_3.renderHomepage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "renderHomepage",
      Nil,
      "GET",
      """""",
      this.prefix + """homepage"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_UsersController_renderuserHomepage8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/homepage")))
  )
  private[this] lazy val controllers_UsersController_renderuserHomepage8_invoker = createInvoker(
    UsersController_3.renderuserHomepage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "renderuserHomepage",
      Nil,
      "POST",
      """""",
      this.prefix + """user/homepage"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_UsersController_logout9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/login")))
  )
  private[this] lazy val controllers_UsersController_logout9_invoker = createInvoker(
    UsersController_3.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """user/login"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_UsersController_getAwards10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/getawards")))
  )
  private[this] lazy val controllers_UsersController_getAwards10_invoker = createInvoker(
    UsersController_3.getAwards,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "getAwards",
      Nil,
      "GET",
      """""",
      this.prefix + """users/getawards"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_UsersController_getLanguages11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/getlanguage")))
  )
  private[this] lazy val controllers_UsersController_getLanguages11_invoker = createInvoker(
    UsersController_3.getLanguages,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "getLanguages",
      Nil,
      "GET",
      """""",
      this.prefix + """users/getlanguage"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_UsersController_getAssignment12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/getassignment")))
  )
  private[this] lazy val controllers_UsersController_getAssignment12_invoker = createInvoker(
    UsersController_3.getAssignment,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "getAssignment",
      Nil,
      "GET",
      """""",
      this.prefix + """users/getassignment"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_UsersController_getProgramming13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/getprogramming")))
  )
  private[this] lazy val controllers_UsersController_getProgramming13_invoker = createInvoker(
    UsersController_3.getProgramming,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "getProgramming",
      Nil,
      "GET",
      """""",
      this.prefix + """users/getprogramming"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_UsersController_getUserAwards14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/getuserawards")))
  )
  private[this] lazy val controllers_UsersController_getUserAwards14_invoker = createInvoker(
    UsersController_3.getUserAwards,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "getUserAwards",
      Nil,
      "GET",
      """""",
      this.prefix + """users/getuserawards"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_UsersController_getUserAssignment15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/getuserassignment")))
  )
  private[this] lazy val controllers_UsersController_getUserAssignment15_invoker = createInvoker(
    UsersController_3.getUserAssignment,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "getUserAssignment",
      Nil,
      "GET",
      """""",
      this.prefix + """users/getuserassignment"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_UsersController_getUserLanguage16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/getuserlanguage")))
  )
  private[this] lazy val controllers_UsersController_getUserLanguage16_invoker = createInvoker(
    UsersController_3.getUserLanguage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "getUserLanguage",
      Nil,
      "GET",
      """""",
      this.prefix + """users/getuserlanguage"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_UsersController_getUserProgramming17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/getuserprogramming")))
  )
  private[this] lazy val controllers_UsersController_getUserProgramming17_invoker = createInvoker(
    UsersController_3.getUserProgramming,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "getUserProgramming",
      Nil,
      "GET",
      """""",
      this.prefix + """users/getuserprogramming"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_UsersController_getInterns18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/getintern")))
  )
  private[this] lazy val controllers_UsersController_getInterns18_invoker = createInvoker(
    UsersController_3.getInterns,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "getInterns",
      Nil,
      "GET",
      """""",
      this.prefix + """users/getintern"""
    )
  )

  // @LINE:53
  private[this] lazy val controllers_UsersController_addInterns19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addintern")))
  )
  private[this] lazy val controllers_UsersController_addInterns19_invoker = createInvoker(
    UsersController_3.addInterns,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "addInterns",
      Nil,
      "POST",
      """""",
      this.prefix + """admin/addintern"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_Application_getNames20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getNames")))
  )
  private[this] lazy val controllers_Application_getNames20_invoker = createInvoker(
    Application_2.getNames,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getNames",
      Nil,
      "GET",
      """""",
      this.prefix + """getNames"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_2.index)
      }
  
    // @LINE:8
    case controllers_WebJarAssets_at1_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at1_invoker.call(WebJarAssets_0.at(file))
      }
  
    // @LINE:13
    case controllers_Assets_versioned2_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned2_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:20
    case controllers_WebJarAssets_at3_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at3_invoker.call(WebJarAssets_0.at(file))
      }
  
    // @LINE:23
    case controllers_UsersController_renderSignUp4_route(params) =>
      call { 
        controllers_UsersController_renderSignUp4_invoker.call(UsersController_3.renderSignUp())
      }
  
    // @LINE:25
    case controllers_UsersController_renderLogin5_route(params) =>
      call { 
        controllers_UsersController_renderLogin5_invoker.call(UsersController_3.renderLogin())
      }
  
    // @LINE:27
    case controllers_UsersController_authenticate6_route(params) =>
      call { 
        controllers_UsersController_authenticate6_invoker.call(UsersController_3.authenticate)
      }
  
    // @LINE:29
    case controllers_UsersController_renderHomepage7_route(params) =>
      call { 
        controllers_UsersController_renderHomepage7_invoker.call(UsersController_3.renderHomepage)
      }
  
    // @LINE:31
    case controllers_UsersController_renderuserHomepage8_route(params) =>
      call { 
        controllers_UsersController_renderuserHomepage8_invoker.call(UsersController_3.renderuserHomepage)
      }
  
    // @LINE:33
    case controllers_UsersController_logout9_route(params) =>
      call { 
        controllers_UsersController_logout9_invoker.call(UsersController_3.logout)
      }
  
    // @LINE:35
    case controllers_UsersController_getAwards10_route(params) =>
      call { 
        controllers_UsersController_getAwards10_invoker.call(UsersController_3.getAwards)
      }
  
    // @LINE:37
    case controllers_UsersController_getLanguages11_route(params) =>
      call { 
        controllers_UsersController_getLanguages11_invoker.call(UsersController_3.getLanguages)
      }
  
    // @LINE:39
    case controllers_UsersController_getAssignment12_route(params) =>
      call { 
        controllers_UsersController_getAssignment12_invoker.call(UsersController_3.getAssignment)
      }
  
    // @LINE:41
    case controllers_UsersController_getProgramming13_route(params) =>
      call { 
        controllers_UsersController_getProgramming13_invoker.call(UsersController_3.getProgramming)
      }
  
    // @LINE:43
    case controllers_UsersController_getUserAwards14_route(params) =>
      call { 
        controllers_UsersController_getUserAwards14_invoker.call(UsersController_3.getUserAwards)
      }
  
    // @LINE:45
    case controllers_UsersController_getUserAssignment15_route(params) =>
      call { 
        controllers_UsersController_getUserAssignment15_invoker.call(UsersController_3.getUserAssignment)
      }
  
    // @LINE:47
    case controllers_UsersController_getUserLanguage16_route(params) =>
      call { 
        controllers_UsersController_getUserLanguage16_invoker.call(UsersController_3.getUserLanguage)
      }
  
    // @LINE:49
    case controllers_UsersController_getUserProgramming17_route(params) =>
      call { 
        controllers_UsersController_getUserProgramming17_invoker.call(UsersController_3.getUserProgramming)
      }
  
    // @LINE:51
    case controllers_UsersController_getInterns18_route(params) =>
      call { 
        controllers_UsersController_getInterns18_invoker.call(UsersController_3.getInterns)
      }
  
    // @LINE:53
    case controllers_UsersController_addInterns19_route(params) =>
      call { 
        controllers_UsersController_addInterns19_invoker.call(UsersController_3.addInterns)
      }
  
    // @LINE:56
    case controllers_Application_getNames20_route(params) =>
      call { 
        controllers_Application_getNames20_invoker.call(Application_2.getNames)
      }
  }
}