package exercism

object HammingTest extends App{


  class Hamming{

  var distance = 0
      def calculate (a: String, b: String) : Int = {

        def compare(x: Char, y: Char): Int = if(x == y) 0 else 1

      if(a.length == 0) distance
      else {
        distance+=compare(a.head, b.head)
        calculate(a.tail, b.tail)
      }
        distance
      }

  }
val compareDNA = new Hamming
 println(compareDNA.calculate("GGACGGATTCTG", "AGGACGGATTCT"))

}
