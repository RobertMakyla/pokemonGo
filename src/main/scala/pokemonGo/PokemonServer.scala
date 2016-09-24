package pokemonGo

import akka.http.scaladsl.Http

class PokemonServer extends PokemonService {

  def startServer(address: String, port: Int) = {
    Http().bindAndHandle(route, address, port)
  }

}

object PokemonServer extends App {

  val server = new PokemonServer()

  server.startServer("localhost", 8080)

}