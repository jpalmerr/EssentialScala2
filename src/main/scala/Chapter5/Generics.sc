/*
Generic types allow us to abstract over types. There are useful for all sorts
of data structures, but commonly encountered in collections
 */

final case class Box[A](value: A)

val a = Box(2)
a.value
val b = Box("string")
b.value
