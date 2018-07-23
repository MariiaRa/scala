package exercism

case class Triangle(a: Int, b: Int, c: Int)

object Triangle {

  def checkTypeOfTriange(in: Triangle): String = {
    in.productIterator.toList.distinct.length match {
      case 1 => "Equilateral"
      case 2 => "Isosceles"
      case 3 => "Scalene"
    }
 }

  def main(args: Array[String]): Unit = {
    val shape = Triangle(6, 3, 6)

    println(checkTypeOfTriange(shape))

  }

}
