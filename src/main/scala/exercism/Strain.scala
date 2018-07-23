package exercism

import scala.collection.mutable

object Strain {

  def keep[A](input: Seq[A], func: A => Boolean): List[A] = {
    val output = new mutable.MutableList[A]
    input.foreach { x =>
      if (func(x)) {
        output += x
      }
    }
    output.toList
  }

  def discard[A](input: Seq[A], func: A => Boolean): List[A] = Strain.keep(input, (x: A) => !func(x))
}

