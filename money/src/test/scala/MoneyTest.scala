import org.scalatest._

class MoneyTest extends FlatSpec with DiagrammedAssertions {

  "Multiplication" should "$5 * 2" in {
    val five: Dollar = Dollar(5)
    five.times(2)
    assert(five.amount == 10)
  }

}