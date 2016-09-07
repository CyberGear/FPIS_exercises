package lt.markav.fpis

import org.scalatest.{FlatSpec, Matchers}

class Exercise_3_10_FoldLeft extends FlatSpec with Matchers {

  it should "Fold Right When Passed Nill" in {
    println(LinkedList.foldLeft(LinkedList(1, 2, 3), Nil:LinkedList[Int])(Cons(_, _)))
  }

}
