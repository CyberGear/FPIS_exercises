package lt.markav.fpis

class Exercise_2_4_Uncurry {

  def uncurry[A,B,C](f: A => B => C): (A, B) => C =
    (a, b) => f(a)(b)

}
