package lt.markav.fpis

import scala.annotation.tailrec

class Exercise_2_2_IsSorted {

  def isSorted[A](arr: Array[A], f: (A, A) => Boolean): Boolean= {
    @tailrec
    def go(i :Int) : Boolean =
      if (i <= 1) true
      else if (!f(arr(i - 2), arr(i - 1))) false
      else go(i - 1)

    go(arr.length)
  }

}
