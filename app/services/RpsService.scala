package services

import javax.inject.Singleton


@Singleton
class RpsService {

  val rpsmap = Map(1-> "ROCK", 2 -> "PAPER", 3 -> "SCISSORS", 4 -> "DYNAMITE", 5 -> "WATERBOMB")

  def kiwi(i: String) = {
    val random = generateRandomChoice
    (i, random) match {
        //match cases
      case ("ROCK", Some("ROCK")) => ("Tie", i, random)
      case ("PAPER", Some("PAPER")) => ("Tie", i, random)
      case ("SCISSORS", Some("SCISSORS")) => ("Tie", i, random)
      case ("WATERBOMB", Some("WATERBOMB")) => ("Tie", i, random)
      case ("DYNAMITE", Some("DYNAMITE")) => ("Tie", i, random)

        //player = rock
      case ("ROCK", Some("PAPER")) => ("C", i, random)
      case ("ROCK", Some("SCISSORS")) => ("H", i, random)
      case ("ROCK", Some("DYNAMITE")) => ("C", i, random)
      case ("ROCK", Some("WATERBOMB")) => ("H", i, random)

      //player = paper
      case ("PAPER", Some("SCISSORS")) => ("C", i, random)
      case ("PAPER", Some("ROCK")) => ("H", i, random)
      case ("PAPER", Some("DYNAMITE")) => ("C", i, random)
      case ("PAPER", Some("WATERBOMB")) => ("H", i, random)

      //player = scissors
      case ("SCISSORS", Some("ROCK")) => ("C", i, random)
      case ("SCISSORS", Some("PAPER")) => ("H", i, random)
      case ("SCISSORS", Some("DYNAMITE")) => ("C", i, random)
      case ("SCISSORS", Some("WATERBOMB")) => ("H", i, random)

      //player = dynamite
      case ("DYNAMITE", Some("PAPER")) => ("H", i, random)
      case ("DYNAMITE", Some("SCISSORS")) => ("H", i, random)
      case ("DYNAMITE", Some("ROCK")) => ("H", i, random)
      case ("DYNAMITE", Some("WATERBOMB")) => ("C", i, random)

      //player = waterbomb
      case ("WATERBOMB", Some("PAPER")) => ("C", i, random)
      case ("WATERBOMB", Some("SCISSORS")) => ("C", i, random)
      case ("WATERBOMB", Some("ROCK")) => ("C", i, random)
      case ("WATERBOMB", Some("DYNAMITE")) => ("H", i, random)
    }
  }

  def generateRandomChoice = {
    val r = new scala.util.Random
    rpsmap.get(1 + r.nextInt(( 5 - 1) + 1))
  }


}
