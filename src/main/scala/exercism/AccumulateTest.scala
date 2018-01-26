package exercism

object AccumulateTest extends App {

  class Accumulate[T, A] {

    def accumulate[T, A](f: (A) => T, list: List[A]) : List[T] = {
    /*  var newList = List[T]()*/
     for (i <- list) yield f(i)

 /*newList*/
    }

  }
  val accumulate = new Accumulate
  println(accumulate.accumulate[String, String](_.reverse, List("eht", "kciuq", "nworb", "xof", "cte")))
  println()
}
