val example = Map("a" -> 1, "b" -> 2, "c" -> 3)

example.getOrElse("a", -1)

example.contains("a")  // Boolean = true

example.size // Int = 3
// for mutable Maps I often prefer to use other libraries...

example.map(pair => pair._1 -> pair._2 * 2)
// Map(a -> 2, b -> 4, c -> 6)

example.flatMap {
  case (str, num) =>
    (1 to 3).map(x => (str + x) -> (num * x))
}

// HashMap(c3 -> 9, b2 -> 4, b3 -> 6, c1 -> 3, a3 -> 3, a1 -> 1, a2 -> 2, c2 -> 6, b1 -> 2)

