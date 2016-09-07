package lt.markav.fpis

import org.scalatest.{FlatSpec, Matchers}

class Exercise_3_8_PassedNill extends FlatSpec with Matchers {

  it should "Fold Right When Passed Nill" in {
    println(LinkedList.foldRight(LinkedList(1, 2, 3), Nil:LinkedList[Int])(Cons(_, _)))

    // it goes from back to front and creates the same list
  }

}
