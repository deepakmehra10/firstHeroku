package controllers

import play.api._
import play.api.libs.json.Json
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Redirect(routes.UsersController.renderLogin())
  }

  def getNames = Action {

    val names = List("Bob","Mike","John")
    Ok(Json.toJson(names)).as(JSON)

  }

}
