package lt.markav.fpis

class Exercise_2_3_Curry {

  def curry[A,B,C] (f: (A, B) => C): A => B => C = {
    a => b => f(a, b)
  }

}
