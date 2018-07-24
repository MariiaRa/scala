package exercism

object Anagram {

  def findAnagrams(word: String, list: List[String]): List[String] = {

    def transform(str: String): Array[Char] = str.toLowerCase.toCharArray.sorted

    list.filter(x => transform(x) sameElements transform(word))
  }
}
