case class Being(firstName: String, lastName: String)

object Stormtrooper {
  def inspect(being: Being): String =
    being match {
      case Being("Hans", "Solo") => "Stop, rebel scum"
      case Being("Han", "Solo") => "Stop, rebel scum!"
      case Being(first, last) => s"Move along, $first"
    }
}

Stormtrooper.inspect(Being("Hans", "Solo")) // String = Stop, rebel scum

/*
A pattern can be one of
1. a name, binding any value to that name
2. an underscore, matching any value and ignoring it
3. a literal, matching the value the literal denotes
4. a constructor-style pattern for a case class.
 */

case class Cats2(name: String, colour: String, food: String)

object Chippy {
  def willServe(cat: Cats2) =
    cat match {
      case Cats2(_, _, "chips") => true
      case _ => false
    }
}


