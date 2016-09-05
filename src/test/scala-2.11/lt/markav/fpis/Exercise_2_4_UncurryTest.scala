package lt.markav.fpis

import org.scalatest.{FlatSpec, Matchers}

class Exercise_2_4_UncurryTest extends FlatSpec with Matchers {

  it should "uncurry" in {
    val exercise = new Exercise_2_4_Uncurry()

    exercise.uncurry[Char, Int, String]({a => b => s"$a$b"})('a', 1)
  }

}
