package pokemonGo

import akka.actor.ActorSystem
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._
import akka.http.scaladsl.server.Directives._
import akka.stream.ActorMaterializer
import pokemonGo.Model.{Pokemon, ServiceJsonProtocol}
import spray.json.DefaultJsonProtocol._

trait PokemonService {

  implicit val actorSystem = ActorSystem("pokemonGo")
  implicit val actorMaterializer = ActorMaterializer()

  var list = List[Pokemon]()

  import ServiceJsonProtocol.pokemonJsonProtocol

  val route =
    path("pokemons") {
      post {
        entity(as[Pokemon]) {
          pokemon =>
            complete {
              list = pokemon :: list
              s"Caught pokemon ${pokemon.name}!!!"
            }
        }
      } ~ get {
        complete {
          list
        }
      }
    }
}