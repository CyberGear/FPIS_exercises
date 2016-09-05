package lt.markav.fpis

import org.scalatest.{FlatSpec, Matchers}

class Exercise_2_1_FibonacciTest extends FlatSpec with Matchers {

  it should "fbn" in {
    val exercise = new Exercise_2_1_Fibonacci()

    exercise.fbn(0) shouldBe 0
    exercise.fbn(1) shouldBe 1
    exercise.fbn(2) shouldBe 1
    exercise.fbn(4) shouldBe 3
    exercise.fbn(6) shouldBe 8
    exercise.fbn(8) shouldBe 21
    exercise.fbn(10) shouldBe 55
    exercise.fbn(12) shouldBe 144

  }

}
