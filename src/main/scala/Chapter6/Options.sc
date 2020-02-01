/*
There are several ways to safely extract the value in an option
without the risk of throwing any exceptions.
 */

def readInt(str: String): Option[Int] =
  if(str matches "-?\\d+") Some(str.toInt) else None


readInt("abc").getOrElse(0)

readInt("123") match {
  case Some(number) => number + 1
  case None => 0
}

def divide(numerator: Int, denominator: Int): Option[Int] =
  if(denominator == 0) None else Some(numerator / denominator)

divide(3, 2)
// obviously this is not a practical divide function, more for example purposes

/*
Using your divide method and a for comprehension, write a method called
divideOptions that accepts two parameters of type Option[Int]
and divides one by the other:
 */

def divideOptions(numerator: Option[Int], denominator: Option[Int]): Option[Int] = {
  for {
    a <- numerator
    b <- denominator
    divided <- divide(a, b)
  } yield divided
}

divideOptions(Some(4), Some(2))