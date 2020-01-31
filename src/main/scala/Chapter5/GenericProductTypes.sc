case class Pairs[A, B](one: A, two: B)

val stringAndInt = Pairs[String, Int]("hi", 2)
stringAndInt.one // String = hi
stringAndInt.two // Int = 2