package exercism

object HammingTest2 extends App{

  class Hamming {

<<<<<<< HEAD
  /*  def distance (a: String, b:String) = {
     if (a.length == 0) 0
     else if (a.length != b.length) throw new IllegalArgumentException("Strings of different length")
    /* else a.zip(b).filter(pairs => pairs._1 != pairs._2).length*/
      else a.zip(b).count(pairs => pairs._1 != pairs._2)

    }*/


    def distance  (a: String, b:String) =
      if (a.length == b.length) {
        val dist = a.zip(b).count(pairs => pairs._1 != pairs._2)

        Some(dist)
      } else None
  }



  val compareDNA = new Hamming
  println(compareDNA.distance("", ""))


=======
    def distance  (a: String, b:String) =
      if (a.length == b.length) {
        val count = a.zip(b).count(pairs => pairs._1 != pairs._2)
        Some(count)
      } else None
  }

  val compareDNA = new Hamming
  println(compareDNA.distance("GGACGGATTCTG", "AGGACGGATTCT"))
>>>>>>> 30206a8fc50479711b498209292bae6bf94dfa26
}
