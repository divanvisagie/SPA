import com.fibonacci.RecursiveMath
import org.scalatest._

class RecursiveMathSpec extends FlatSpec with Matchers {
  "RecursiveMath fibonacci 30" should "return 832040" in {
    RecursiveMath() fibonacci 30 should be (832040)
  }
}
