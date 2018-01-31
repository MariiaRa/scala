package exercism

import scala.collection.SortedMap

object EtlTest extends App {

  class Etl {

    def transform(legacy:Map[Int, Seq[String]]) : SortedMap[String, Int] = {
      var newMap = SortedMap[String, Int]()

      def add(a: Int, b: Seq[String]) =  {
        b.foreach(x => newMap = newMap + (x.toLowerCase -> a))
      }


      legacy.foreach {
        case(point, letter) => add(point, letter)
      }
newMap
    }
    }

/*val test = new Etl
  println(test.transform2(Map(1 -> Seq("A", "E", "I", "O", "U", "L", "N", "R", "S", "T"),
    2 -> Seq("D", "G"), 3 -> Seq("B", "C", "M", "P"), 4 -> Seq("F", "H", "V", "W", "Y"),
    5 -> Seq("K"), 8 -> Seq("J", "X"), 10 -> Seq("Q", "Z"))))*/

}
