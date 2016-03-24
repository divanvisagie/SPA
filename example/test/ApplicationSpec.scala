import org.scalatestplus.play._
import play.api.test._
import play.api.test.Helpers._

class ApplicationSpec extends PlaySpec with OneAppPerTest {

  "FibController" should {
    "return 832040" in {
      contentAsString(route(app, FakeRequest(GET, "/fib/30")).get) mustBe "832040"
    }
  }

}
