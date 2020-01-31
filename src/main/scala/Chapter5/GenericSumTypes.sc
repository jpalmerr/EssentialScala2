sealed trait Sum[A, B]
final case class Left[A, B](value: A) extends Sum[A, B]
final case class Right[A, B](value: B) extends Sum[A, B]

// note we have either for when there is two cases


def intOrString(input: Boolean): Sum[Int, String] =
  if(input == true) {
    Left[Int, String](123)
  } else {
    Right[Int, String]("abc")
  }

intOrString(true) // Left(123)

Left[Int, String](1).value
// Int = 1
Right[Int, String]("foo").value
// String = foo
val sum: Sum[Int, String] = Right("foo")

sum match {
  case Left(x) => x.toString
  case Right(x) => x
}