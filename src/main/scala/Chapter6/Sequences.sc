val sequence = Seq(1, 2, 3) // List(1, 2, 3)

sequence(1) // Int = 2
// out of bounds gives exception

sequence.head
// Int = 1
sequence.tail
// Seq[Int] = List(2, 3)
sequence.tail.head
// Int = 2

/*
If we want to safely get the head without risking an exception
we can use headOption
 */

sequence.headOption // Some(1)
Seq.empty.headOption // None

sequence.length // Int = 3

sequence.contains(2) // Boolean = true

sequence.find(_ == 3) // Some(3)
sequence.find(_ > 4) // None

sequence.filter(_ > 1) // List(2, 3)

sequence.sortWith(_ > _) // List(3, 2, 1)

sequence :+ (4) // List(1, 2, 3, 4)

0 +: sequence // List(0, 1, 2, 3)

