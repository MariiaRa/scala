package exercism

object AccumulateTest extends App {

  class Accumulate[T, A] {

    def accumulate[T, A](f: (A) => T, list: List[A]) : List[T] = {
      var newList = List[T]()
     for (i <- list){
       newList = newList :+ f(i)

     }
      newList
    }


  }
  val accumulate = new Accumulate
  println(accumulate.accumulate[String, Int](_.toString, List(1, 2, 3)))
  println()
}
