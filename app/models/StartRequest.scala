package models

import play.api.libs.json.Json


case class StartRequest(opponentName: String,
                       pointsToWin: Int,
                       maxRounds: Int,
                       dynamiteCount: Int)

object StartRequest {
  implicit val formats = Json.format[StartRequest]
}

case class OpponentMove(opponentLastMove: String)


object OpponentMove {
  implicit val formats = Json.format[OpponentMove]
}