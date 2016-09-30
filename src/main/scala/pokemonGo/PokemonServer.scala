package pokemonGo

import akka.http.scaladsl.Http
import com.typesafe.config.ConfigFactory

class PokemonServer extends PokemonService {

  def startServer(address: String, port: Int) = {
    Http().bindAndHandle(route, address, port)
  }

}

object PokemonServer extends App {

  val server = new PokemonServer()
  val config = ConfigFactory.load()
  server.startServer(config.getString("http.interface"), config.getInt("http.port"))

}