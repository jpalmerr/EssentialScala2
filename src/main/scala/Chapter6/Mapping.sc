// MAP

/*
In Scala we can use the map method defined on any sequence.
Map takes a function and applies it to every element, creating a sequence of the results.
 */

val sequence = Seq(1, 2, 3)

sequence.map( el => el * 2) // List(2, 4, 6)

sequence.map(_ * 2) // List(2, 4, 6)

// FLATMAP

/*
flatMap is similar to map except that it expects our function to return a sequence.
The sequences for each input element are appended together.
 */

Seq(1, 2, 3).flatMap(num => Seq(num, num * 10)) // List(1, 10, 2, 20, 3, 30)

// FOLDS

/*
Say we have a Seq[Int] and we want to add all the numbers together.
map and flatMap don’t apply here for two reasons:

1: they expect a unary function, whereas + is a binary operation
2: they both return sequences of items, whereas we want to return a single Int
 */

Seq(1, 2, 3).foldLeft(0)(_ + _ + 3) // Int = 15

Seq(1, 2, 3).foldLeft(1)(_ + _ + 3) // Int = 16