package exercism

object PangramTest extends App{

  class Pangrams{

def isPangram(str: String) : Boolean =  {
  val filteredStr = str.replaceAll("[^a-zA-Z]","").toLowerCase

  val sorted = filteredStr.toList.sortWith(_ < _)
  sorted.distinct.equals(('a' to 'z').toList)
}

  }

  val sort = new Pangrams
  println(sort.isPangram(""""Five quacking Zephyrs jolt my wax bed.""""))


}
