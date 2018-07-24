package exercism

object TriangleType extends Enumeration {
  val Equilateral, Isosceles, Scalene, Illogical = Value
}

case class Triangle(a: Int, b: Int, c: Int) {

  lazy val triangleType = {
    if (!checkShape) TriangleType.Illogical
    else numberOfEqualSides match {
      case 3 => TriangleType.Equilateral
      case 2 => TriangleType.Isosceles
      case _ => TriangleType.Scalene
    }
  }

  private def checkShape: Boolean = {
    if (a <= 0 || b <= 0 || c <= 0) false
    else if (a + b >= c || a + c >= b || b + c >= a) true
    else false
  }

  private def numberOfEqualSides = Set(a, b, c).size
}

object Triangle {

  def main(args: Array[String]): Unit = {
    val shape = Triangle(10, 4, 6)
    println(shape.triangleType)
  }
}