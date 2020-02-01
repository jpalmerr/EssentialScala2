Seq(1, 2, 3).map(_ * 2)

for {
  x <- Seq(1, 2, 3)
} yield x * 2

/*
 Say we want to double all the numbers in
 Seq(Seq(1), Seq(2, 3), Seq(4, 5, 6))
and return a flattened sequence of the results.
 */

val data = Seq(Seq(1), Seq(2, 3), Seq(4, 5, 6))

data.flatMap(_.map(_ * 2)) // List(2, 4, 6, 8, 10, 12)

for {
  subSeq <- data
  element <- subSeq
} yield element * 2
// List(2, 4, 6, 8, 10, 12)