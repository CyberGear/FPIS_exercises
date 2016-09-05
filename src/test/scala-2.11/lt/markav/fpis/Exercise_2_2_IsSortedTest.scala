package lt.markav.fpis

import org.scalatest.{FlatSpec, Matchers}

class Exercise_2_2_IsSortedTest extends FlatSpec with Matchers {

  it should "isSorted" in {
    val exercise = new Exercise_2_2_IsSorted()

    exercise.isSorted[Int](Array[Int](1, 2, 3, 4), {(one, two) => one < two}) shouldBe true
    exercise.isSorted[String](Array[String]("1", "2", "3"), {(one, two) => one.toInt < two.toInt}) shouldBe true
    exercise.isSorted[String](Array[String]("4", "1", "2", "3"), {(one, two) => one.toInt < two.toInt}) shouldBe false
    exercise.isSorted[Boolean](Array[Boolean](true, false), {(one, two) => one && !two}) shouldBe true
    exercise.isSorted[Boolean](Array[Boolean](true, false, true), {(one, two) => one && !two}) shouldBe false
    exercise.isSorted[Char](Array[Char]('2'), {(one, two) => false}) shouldBe true
    exercise.isSorted[Char](Array[Char]('2', '1'), {(one, two) => one < two}) shouldBe false
    exercise.isSorted[Char](Array[Char]('2', '1'), {(one, two) => true}) shouldBe true
  }

}
