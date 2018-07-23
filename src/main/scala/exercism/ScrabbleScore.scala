package exercism

object ScrabbleScore {

  val LetterValues: Map[List[Char], Int] = Map(
    List('A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T') -> 1,
    List('D', 'G') -> 2,
    List('B', 'C', 'M', 'P') -> 3,
    List('F', 'H', 'V', 'W', 'Y') -> 4,
    List('K') -> 5,
    List('J', 'X') -> 8,
    List('Q', 'Z') -> 10
  )

  val LetterValuesFlat: Map[Char, Int] = LetterValues.flatMap(elem => elem._1.flatMap(ch => Map(ch -> elem._2)))

  def scoreLetters(ch: Char) = LetterValuesFlat(ch)

  def calculate(word: String): Int = {
    word.toUpperCase.map(char => scoreLetters(char)).sum
  }
}
