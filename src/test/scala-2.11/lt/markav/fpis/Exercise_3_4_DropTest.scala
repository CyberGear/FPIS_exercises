package lt.markav.fpis

import org.scalatest.{FlatSpec, Matchers}

class Exercise_3_4_DropTest extends FlatSpec with Matchers {

  it should "drop" in {
    LinkedList.drop(2, LinkedList(1, 2, 3, 4)) shouldBe LinkedList(3, 4)
    LinkedList.drop(6, LinkedList(1, 2, 3, 4)) shouldBe Nil
  }

}
