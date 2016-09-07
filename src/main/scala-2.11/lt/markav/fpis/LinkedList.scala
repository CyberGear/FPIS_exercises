package lt.markav.fpis

import scala.annotation.tailrec

sealed trait LinkedList[+A]

case object Nil extends LinkedList[Nothing]

case class Cons[+A](head: A, tail: LinkedList[A]) extends LinkedList[A]

object LinkedList {

  def lenght[A](list: LinkedList[A]): Int = foldRight(list, 0)((_, b) => b + 1)

  def sum(ints: LinkedList[Int]): Int = ints match {
    case Nil => 0
    case Cons(x, xs) => x + sum(xs)
  }

  def product(ds: LinkedList[Double]): Double = ds match {
    case Nil => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x, xs) => x * product(xs)
  }

  def product2(list: LinkedList[Double]): Double = foldRight(list, 1.0)( { _ * _ } )

  def foldRight[A, B](list: LinkedList[A], b: B)(f: (A, B) => B): B = list match {
    case Nil => b
    case Cons(x, xs) => f(x, foldRight(xs, b)(f))
  }

  def foldLeft[A, B](list: LinkedList[A], b: B)(f: (B, A) => B): B = {
    @tailrec
    def loop(list: LinkedList[A], b: B): B = list match {
      case Nil => b
      case Cons(x, xs) => loop(xs, f(b, x))
    }

    loop(list, b)
  }

  def apply[A](as: A*): LinkedList[A] =
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))

  def tail[A](list: LinkedList[A]): LinkedList[A] = list match {
    case Nil => sys.error("tail of empty list")
    case Cons(_, tail) => tail
  }

  def setHead[A](head: A, list: LinkedList[A]): LinkedList[A] = list match {
    case Nil => sys.error("set head on empty List")
    case Cons(_, tail) => Cons(head, tail)
  }

  def drop[A](n: Int, list: LinkedList[A]): LinkedList[A] = {
    @tailrec
    def loop(n: Int, list: LinkedList[A]): LinkedList[A] = list match {
      case Nil => Nil
      case Cons(_, tail) =>
        if (n <= 0) list
        else loop(n - 1, tail)
    }
    loop(n, list)
  }

  def dropWhile[A](data: LinkedList[A], f: A => Boolean): LinkedList[A] = {
    @tailrec
    def loop[A](list: LinkedList[A], f: A => Boolean): LinkedList[A] = list match {
      case Cons(head: A, tail) if f(head) => loop(tail, f)
      case _ => list
    }
    loop(data, f)
  }

  def init[A](list: LinkedList[A]): LinkedList[A] = {
    def loop(res: LinkedList[A]): LinkedList[A] = res match {
      case Nil => Nil
      case Cons(_, Nil) => Nil
      case Cons(head, tail) => Cons(head, loop(tail))
    }
    loop(list)
  }

}