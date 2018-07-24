package exercism

object WordCount {

  def count(str: String): Map[String, Int] = {
    str.toLowerCase.split(" ").groupBy(identity).mapValues(_.length)
  }
}
