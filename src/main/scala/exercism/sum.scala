package exercism

object sum extends App {
  def sum(factors: Set[Int], limit: Int): Int = {


    def isDivisibleBy(x: Int)(y: Int): Boolean = {
println(y)
      x % y == 0

    }


    def isMultiple(x: Int): Boolean = factors.exists(isDivisibleBy(x))

    val multiples = (1 until limit).filter(isMultiple)
    multiples.sum
  }

  println(sum(Set(7, 13, 17), 20))

}
