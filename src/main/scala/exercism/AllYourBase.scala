package exercism

object AllYourBase {

  def convert(base: Int, number: Int): Int = {
    val transformed = number.toString.map(x => x.asDigit)
    transformed.reverse
      .zipWithIndex
      .map { case (num, i) => num * scala.math.pow(base, i) }.sum.toInt
  }

  def main(args: Array[String]): Unit = {
    val test = convert(3, 1120)
    println(test)
  }

}
