import scala.math.Ordering

val minOrdering = Ordering.fromLessThan[Int](_ < _)
val maxOrdering = Ordering.fromLessThan[Int](_ > _)

List(3, 4, 2).sorted(minOrdering) // List(2, 3, 4)
List(3, 4, 2).sorted(maxOrdering) // List(4, 3, 2)

/*
It can be inconvenient to continually pass the type class instance to a method
when we want to repeatedly use the same instance. Scala provides a convenience,
called an implicit value, that allows us to get the compiler to pass the type class instance for us.
 */


implicit val ordering = Ordering.fromLessThan[Int](_ < _)

List(2, 4, 3).sorted // List(2, 3, 4)
List(1, 7 ,5).sorted // List(1, 5, 7)

/*

In Scala, a type class is just a trait. To use a type class we:

- create implementations of that trait, called type class instances
- typically we mark the type class instances as implicit values.


Marking values as implicit tells the compiler it can supply them as a parameter
to a method call if none is explicitly given. For the compiler to supply a value:


1. the parameter must be marked implicit in the method declaration
2. there must be an implicit value available of the same type as the parameter
3. there must be only one such implicit value available

 */