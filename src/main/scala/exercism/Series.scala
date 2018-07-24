package exercism

object Series {

  def slises(number: Int, str: String): List[String] = {
    str.sliding(number).toList
  }
}
