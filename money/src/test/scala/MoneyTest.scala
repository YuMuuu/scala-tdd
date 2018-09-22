import org.scalatest._

class MoneyTest extends FlatSpec with DiagrammedAssertions {

  "Multiplication1" should "$5 * 2" in {
    val five: Dollar = Dollar(5)
    five.times(2)
    assert(five.amount == 10)
  }

  "Multiplication2" should "$5 * 3" in {
    val five: Dollar = Dollar(5)
    five.times(3)
    assert(five.amount == 15)
  }

}