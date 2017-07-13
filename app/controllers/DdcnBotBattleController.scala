package controllers

import javax.inject._

import models.{OpponentMove, StartRequest}
import play.api.libs.json.Json
import play.api.mvc._

@Singleton
class DdcnBotBattleController @Inject()(service: RpsService) extends Controller {

  def start = Action.async(parse.json) { implicit request =>
    request.body.asOpt[StartRequest] match {
      case Some(startReq) => ???
      case None => ???
    }
  }

  def move = Action {
    //random generator of r,ps,d,w
    Ok(Json.toJson(service.generateRandomChoice))
  }

  def opponentMove = Action.async(parse.json) { implicit request =>
    request.body.asOpt[OpponentMove] match {
      case Some(oppMove) => ??? //capture opponents move here and try to find a pattern
      case None => ???
    }
  }

}
