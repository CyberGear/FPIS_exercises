package lt.markav.fpis

import scala.annotation.tailrec

class Exercise_2_1_Fibonacci {

  def fbn(n: Int): Int = {
    @tailrec
    def go(i: Int, prew: Int, curr: Int): Int =
      if (i == 0) prew
      else go(i - 1, curr, prew + curr)

    go(n, 0, 1)
  }

}
