package Chapter5

sealed trait LinkedList[A] {
  def contains(item: A): Boolean =
    this match {
      case Pair(hd, tl) =>
        if(hd == item)
          true
        else
          tl.contains(item)
      case End() => false
    }

  def fold[B](end: B)(pair: (A, B) => B): B =
    this match {
      case End() => end
      case Pair(hd, tl) => pair(hd, tl.fold(end, pair))
    }
}
final case class Pair[A](head: A, tail: LinkedList[A]) extends
  LinkedList[A]
final case class End[A]() extends LinkedList[A]
