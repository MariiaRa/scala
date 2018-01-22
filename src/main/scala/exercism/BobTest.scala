package exercism

object BobTest extends App {

  class Bob {

    def response(question:String) : String = {
val filteredStr = question.filterNot((q: Char) => q.isWhitespace)
      if(filteredStr.isEmpty())
      "Fine. Be that way!"
      else  if (filteredStr(filteredStr.length-1) == '?')
        "Sure."
      else if(filteredStr.substring(1, filteredStr.length - 1).exists(_.isUpper))
        "Whoa, chill out!"
       else
        "Whatever."
    }


  }

  println(new Bob().response("Tom-ay-to, tom-aaaah-to."))

}
