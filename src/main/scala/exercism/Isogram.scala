package exercism

object Isogram {

  def isIsogram(word: String): Boolean = {
    val filtered = word.filter(x => x.isLetter).map(_.toLower)
    filtered.length == filtered.toSet.size
  }
}
