package exercism

object MatrixTest extends App{

  case class Matrix (s: String) {

    def rows(n: Int) : Vector[String] = {
      val splitted = s.split("\n")
      val row = splitted(n).split(" ").toVector
      row
    }

    def cols(n: Int) : Vector[String] = {
      val splitted = s.split("\n")
      val col = for (e <- splitted) yield e.split(" ")(n)
      col.toVector
    }
  }

 /* println(Matrix("1 2\n10 20").rows(0))
  println(Matrix("1 2\n10 20\n100 200").rows(2))
  println(Matrix("1 2\n10 20").cols(0))
  println(Matrix("1 2\n10 20\n100 200").cols(1))
  println (  Matrix("1 2\n10 20") == (Matrix("1 2\n10 20")))
  println(Matrix("1 2\n10 20") == Matrix("20 10\n100 200"))*/
}
