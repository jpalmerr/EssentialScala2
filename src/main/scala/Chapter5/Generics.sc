/*
Generic types allow us to abstract over types. There are useful for all sorts
of data structures, but commonly encountered in collections
 */

final case class Box[A](value: A)

val a = Box(2) // Box[Int] = Box(2)
a.value // Int = 2
val b = Box("string") // Box[String] = Box(string)
b.value // String = string

// type parameters

def generic[A](in: A): A = in
generic(2)
generic("string")