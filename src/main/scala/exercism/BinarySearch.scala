package exercism

import scala.annotation.tailrec

object BinarySearch {

  def binarySearch(values: Seq[Int], value: Int): Option[Int] = {

    def checkIfSorted: Boolean = values == values.sorted

    @tailrec
    def search(minIndex: Int, maxIndex: Int): Option[Int] = {
      val middleIndex = (minIndex + maxIndex) / 2
      println(s"Max is: $maxIndex")
      println(s"Min is: $minIndex")
      println(s"Minddle index is: $middleIndex")

      if (minIndex > maxIndex) {
        println("No such element!")
        None
      } else if (values(middleIndex) == value) {
        println("Found it!")
        Some(middleIndex)
      } else if (values(middleIndex) < value)
        search(middleIndex + 1, maxIndex)
      else
        search(minIndex, middleIndex - 1)
    }

    if (checkIfSorted) search(0, values.length - 1)
    else {
      println("This collection is not sorted")
      None
    }
  }
}
