package exercism

object BeerSong {

  def printSong(number: Int): Unit = {
    val numbers = (0 to number).toList.reverse
    val line1 = " bottles of beer on the wall,"
    val line2 = "bottles of beer.\nTake one down and pass it around, "
    val line3 = "bottles of beer on the wall\n"
    numbers foreach { i =>
      if (i > 1) println(s"$i$line1 $i $line2${i - 1} $line3")
      else if (i == 2) println(s"$i$line1 $i $line2 1 $line3")
      else if (i == 1) println(s"$i bottle of beer on the wall, $i bottle of beer.\nTake it down and pass it around, no more $line3")
      else println(s"No more $line1 no more bottles of beer.\nGo to the store and buy some more, $number $line3")
    }
  }
}
