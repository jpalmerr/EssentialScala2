/*
IntList is either the
empty list End,
or a Pair containing an Int and an IntList
 */

sealed trait IntList
case object End extends IntList
final case class Pair(head: Int, tail: IntList) extends IntList

def sum(list: IntList): Int =
  list match {
    case End => 0
    case Pair(hd, tl) => hd + sum(tl)
  }

val list123 = Pair(1, Pair(2, Pair(3, End)))
sum(list123) // Int = 6

/*
For the base case we should generally return the identity for the function we’re trying to compute. The idenঞty is an element that doesn’t
change the result
 */