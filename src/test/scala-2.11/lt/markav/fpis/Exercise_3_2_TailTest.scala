package lt.markav.fpis

import org.scalatest.{FlatSpec, Matchers}

class Exercise_3_2_TailTest extends FlatSpec with Matchers{

  it should "Tail" in {
    LinkedList.tail(LinkedList(1, 2, 3, 4)) shouldBe LinkedList(2, 3, 4)
    an[RuntimeException] should be thrownBy LinkedList.tail(Nil)
  }

}
