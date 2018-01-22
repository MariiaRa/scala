package exercism

object SumOfMultiplesTest extends App{

  class SumOfMultiples {




    def sum (factors : Set[Int], b:Int): Int = {


      def mod (x: Int, y: Int) : Boolean = {x%y == 0}

      def check (x: Int): Boolean = {
        factors exists { i=> mod (x, i)}
      }

      val calculate = (1 until b).filter(check)
      calculate.sum
    }



  }


  val calculate = new SumOfMultiples()



  println(calculate.sum(Set(5, 25), 51))
  println(calculate.sum(Set(7, 13, 17), 20))
  println(calculate.sum(Set(1), 100))
  println(calculate.sum(Set(5, 6, 8), 150))
}
