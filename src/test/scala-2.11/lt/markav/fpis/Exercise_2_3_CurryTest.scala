package lt.markav.fpis

import org.scalatest.{FlatSpec, Matchers}

class Exercise_2_3_CurryTest extends FlatSpec with Matchers{

  it should "curry" in {
    val exercise = new Exercise_2_3_Curry()

    exercise.curry[Char, Int, String]({(a, b) => s"$a$b"})('a')(1) shouldBe "a1"
  }

}
