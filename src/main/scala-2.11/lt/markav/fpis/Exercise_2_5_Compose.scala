package lt.markav.fpis

class Exercise_2_5_Compose {

  def compose[A,B,C](f: B => C, g: A => B): A => C = a => f(g(a))

}
