package lt.markav.fpis

import org.scalatest.{FlatSpec, Matchers}

class Exercise_3_5_DropWhile extends FlatSpec with Matchers {

  it should "Drop While" in {
    LinkedList.dropWhile[Int](LinkedList(1, 2, 3, 4), a => a < 3) shouldBe LinkedList(3, 4)
    LinkedList.dropWhile[Int](LinkedList(1, 2, 3, 4), _ => true) shouldBe Nil
    LinkedList.dropWhile[String](LinkedList("1", "2", "3", "10", "11", "12"), a => a.length < 2) shouldBe LinkedList("10", "11", "12")
    LinkedList.dropWhile[String](Nil, a => true) shouldBe Nil
  }

}
