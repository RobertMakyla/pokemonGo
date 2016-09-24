package pokemonGo


import spray.json.DefaultJsonProtocol

object Model {

  case class Pokemon(name: String)

  object ServiceJsonProtocol extends DefaultJsonProtocol {
    implicit val pokemonJsonProtocol = jsonFormat1(Pokemon)
  }
}