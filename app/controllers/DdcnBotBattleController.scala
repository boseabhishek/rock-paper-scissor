package controllers

import javax.inject._

import play.api.libs.json.Json
import play.api.mvc._
import services.RpsService

@Singleton
class DdcnBotBattleController @Inject()(service: RpsService) extends Controller {

  def start = Action {
    Ok
  }

  def move = Action {
    Ok
  }

  def opponentMove = Action {
   Ok
  }

}
