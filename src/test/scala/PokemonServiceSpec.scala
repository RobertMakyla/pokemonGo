
import akka.http.scaladsl.model.ContentTypes._
import akka.http.scaladsl.model.StatusCodes._
import akka.http.scaladsl.testkit.ScalatestRouteTest
import org.scalatest.{FlatSpec, Matchers}
import pokemonGo.PokemonService

class PokemonServiceSpec extends FlatSpec with Matchers with ScalatestRouteTest {

  private val service = new PokemonService {}

  "service" should "show empty list" in {
    Get(s"/pokemons") ~> service.route ~> check {
      status shouldBe OK
      contentType shouldBe `text/plain(UTF-8)`
      responseAs[String] shouldBe ""
    }
  }
}
