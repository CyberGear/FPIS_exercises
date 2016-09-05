package lt.markav.fpis

import org.scalatest.{FlatSpec, Matchers}

class Exercise_3_1_MatchTest extends FlatSpec with Matchers {

  it should "Match" in {

    val x = LinkedList(1,2,3,4,5) match {
      case Cons(x, Cons(2, Cons(4, _))) => x
      case Nil => 42
      case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
      case Cons(h, t) => h + LinkedList.sum(t)
      case _ => 101
    }

    x shouldBe 3

  }

}
