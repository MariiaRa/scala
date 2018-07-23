package exercism

import java.util.regex.Pattern

object PhoneNumber {

  val phonePattern = "([2-9]{1}[0-9]{2})*[0-9]{4}"

  def checkPattern(str: String): Option[String] = {
    Pattern.matches(phonePattern, str) match {
      case true => Some(str)
      case false => println(s"This number $str does not conform with North American Numbering Plan"); None
    }
  }

  def clean(phone: String): Option[String] = {
    val filtered = phone.filter(c => c.isDigit)
    if (filtered.head == '1') checkPattern(filtered.tail)
    else checkPattern(filtered)
  }
}
