package lt.markav.fpis

import org.scalatest.{FlatSpec, Matchers}

class Exercise_3_6_InitTest extends FlatSpec with Matchers {

  it should "Init" in {

    LinkedList.init(LinkedList(1)) shouldBe Nil
    LinkedList.init(LinkedList(1, 2)) shouldBe LinkedList(1)
    LinkedList.init(Nil) shouldBe Nil

  }

}
