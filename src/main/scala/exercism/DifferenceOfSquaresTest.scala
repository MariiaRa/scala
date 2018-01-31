package exercism

object DifferenceOfSquaresTest extends App {

  class  DifferenceOfSquares {

    def squareOfSum(limit : Int) : Int = {
      val sum = (1 to limit).foldLeft(0)(_ + _)
      sum*sum
    }

    def sumOfSquares(limit : Int) : Int = (1 to limit).map(a => a*a).sum

    def differenceOfSquares (limit : Int) = squareOfSum(limit) - sumOfSquares(limit)
  }

 /* val difference = new DifferenceOfSquares
  println(difference.squareOfSum(5))
  println(difference.sumOfSquares(5))
  println(difference.differenceOfSquares(100))*/
}
