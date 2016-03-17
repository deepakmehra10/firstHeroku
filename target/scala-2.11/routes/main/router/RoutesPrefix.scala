
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/trial/TraineeAppRepo/TraineeAppRepo/myFirstApp/conf/routes
// @DATE:Tue Mar 15 17:49:31 IST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
