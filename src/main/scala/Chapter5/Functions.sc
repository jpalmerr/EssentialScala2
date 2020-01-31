sealed trait IntList {
  def fold(end: Int, f: (Int, Int) => Int): Int =
    this match {
      case End => end
      case Pair(hd, tl) => f(hd, tl.fold(end, f))
    }
  // other methods...
}
case object End extends IntList
final case class Pair(head: Int, tail: IntList) extends IntList
