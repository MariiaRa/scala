package exercism

object Grains {

  def calculateGrains(n: Int): Option[BigInt] = {
    if (n > 0 && n <= 64) {
      val number = List.range(1, n).foldLeft(BigInt(0)) { (acc, i) => acc + BigInt(2).pow(i - 1) }
      Some(number)
    }
    else None
  }

  def calculateGrainsTwo(n: Int): Option[BigInt] = {
    if (n > 0 && n <= 64) {
      val x = Range(1, n).map(a => BigInt(2).pow(a - 1)).sum
      Some(x)
    } else None
  }

}
