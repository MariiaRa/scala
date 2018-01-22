package exercism

object HammingTest2 extends App{

  class Hamming {

    def distance (a: String, b:String) = {
     if (a.length == 0) 0
     else a.zip(b).filter(pairs => pairs._1 != pairs._2).length
    }


  }

  val compareDNA = new Hamming
  println(compareDNA.distance("GGACGGATTCTG", "AGGACGGATTCT"))


}
