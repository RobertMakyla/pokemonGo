
import akka.http.scaladsl.model.ContentTypes._
import akka.http.scaladsl.model.StatusCodes._
import akka.http.scaladsl.model.{HttpEntity, HttpMethods, HttpRequest}
import akka.http.scaladsl.testkit.ScalatestRouteTest
import org.scalatest.{FreeSpec, MustMatchers}
import pokemonGo.Model.Pokemon
import pokemonGo.PokemonService

class PokemonServiceSpec extends FreeSpec with MustMatchers with ScalatestRouteTest {

  "shows empty list of pokemons at Http/GET" in new Fixture {
    Get(s"/pokemons") ~> service.route ~> check {
      status mustBe OK
      contentType mustBe `text/plain(UTF-8)`
      responseAs[String] mustBe ""
    }
  }

  "accepts a pokemon with Http/POST and show it at Http/GET" in new Fixture {
    val name = "monster"

    val jsonRequest = s"{\"name\": \"${name}\"}".getBytes

    val postRequest = HttpRequest(
      HttpMethods.POST,
      uri = "/pokemons",
      entity = HttpEntity(`application/json`, jsonRequest)
    )

    postRequest ~> service.route ~> check {
      status mustBe OK
      contentType mustBe `text/plain(UTF-8)`
      responseAs[String] mustBe s"Caught pokemon monster!!!"
    }

    service.list mustBe Pokemon(name) :: Nil

    Get(s"/pokemons") ~> service.route ~> check {
      status mustBe OK
      contentType mustBe `text/plain(UTF-8)`
      responseAs[String] mustBe name
    }
  }

  class Fixture {
    val service = new PokemonService {}
  }

}
