sealed trait Tree {
  def sum: Int
  def double: Tree
}
final case class Node(l: Tree, r: Tree) extends Tree {
  def sum :Int = l.sum + r.sum
  def double = Node(l.double, r.double)
}
final case class Leaf(element: Int) extends Tree {
  def sum: Int = element
  def double: Tree = Leaf(element * 2)
}

val leaf1 = Leaf(1)
val leaf2 = leaf1.double
val tree = Node(leaf1, leaf2)
tree.sum
tree.double

