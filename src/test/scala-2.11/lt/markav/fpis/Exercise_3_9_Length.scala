package lt.markav.fpis

import org.scalatest.{FlatSpec, Matchers}

class Exercise_3_9_Length extends FlatSpec with Matchers {

  it should "Product When 0" in {
    LinkedList.lenght(LinkedList(1, 2, 3, 4, 5, 6)) shouldBe 6
    LinkedList.lenght(LinkedList("")) shouldBe 1
    LinkedList.lenght(LinkedList(false, true)) shouldBe 2
  }

}
