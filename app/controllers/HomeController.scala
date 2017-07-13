package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class HomeController @Inject()(service: RpsService) extends Controller {


  def index = Action {
    Ok(views.html.index("", "", Some("")))
  }

  def apple(in: String) = Action {
    val status = service.kiwi(in.toUpperCase())
    val winner = if(status._1 == "C") "Computer Won!"
    else if(status._1 == "H") "Human Won!"
    else "It's a tie!"
    Ok(views.html.index(winner, status._2, status._3))
  }


}
