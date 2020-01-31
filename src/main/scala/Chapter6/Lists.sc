Nil // List()

val list = 1 :: 2 :: 3 :: Nil
// list: List[Int] = List(1, 2, 3)
4 :: 5 :: list
// List[Int] = List(4, 5, 1, 2, 3)

List(1, 2, 3) // List[Int] = List(1, 2, 3)

List(1, 2, 3) ::: List(4, 5, 6)
// List[Int] = List(1, 2, 3, 4, 5, 6)