package exercism

object HammingTest2 extends App{

  class Hamming {

    def distance  (a: String, b:String) =
      if (a.length == b.length) {
        val dist = a.zip(b).count(pairs => pairs._1 != pairs._2)
        Some(dist)
      } else None
  }

  val compareDNA = new Hamming
  println(compareDNA.distance("GGACGGATTCTG", "AGGACGGATTCT"))
}
