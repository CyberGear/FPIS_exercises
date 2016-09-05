package lt.markav.fpis

import org.scalatest.{FlatSpec, Matchers}

class Exercise_2_5_ComposeTest extends FlatSpec with Matchers {

  it should "compose" in {
    val exercise = new Exercise_2_5_Compose()

    exercise.compose[Int, Int, String](b => s"($b)", a => a*a)(2) shouldBe "(4)"
  }

}
