package exercism

object RNATranscription {

  val complement: Map[Char, Char] = Map('G' -> 'C', 'C' -> 'G', 'A' -> 'U', 'T' -> 'A')

  def transcriptDNA(dna: String): String = {
    dna map (nuc => complement(nuc))
  }

}
