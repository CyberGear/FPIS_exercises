package lt.markav.fpis

import org.scalatest.{FlatSpec, Matchers}

class Exercise_3_3_SetHeadTest extends FlatSpec with Matchers {

  it should "Set Head" in {
    LinkedList.setHead(5, LinkedList(1, 2, 3, 4)) shouldBe LinkedList(5, 2, 3, 4)
    an[RuntimeException] should be thrownBy LinkedList.setHead(5, Nil)
  }

}
