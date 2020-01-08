trait Shape {
  def sides: Int
  def perimeter: Double
  def area: Double
}

case class Circle(radius: Double) extends Shape {
  val sides = 1
  val perimeter = 2 * math.Pi * radius
  val area = math.Pi * radius * radius
}

case class Rectangle(width: Double, height: Double) extends Shape {
  val sides = 2
  val perimeter = 2*(width + height)
  val area = width * height
}

case class Square(size: Double) extends Shape {
  val sides = 4
  val perimeter = 4 * size
  val area = size * size
}

val twoCircle = Circle(2)
twoCircle.sides // Int = 1

val twoByFourRectangle = Rectangle(2, 4)
twoByFourRectangle.perimeter // Double = 12.0

val threeSquare = Square(3)
threeSquare.size // Double = 3.0
threeSquare.area // Double = 9.0

// sealed traits...

sealed trait Rectangular extends Shape {
  def width: Double
  def height: Double
  val sides = 4
  override val perimeter = 2*width + 2*height
  override val area = width*height
}

case class Rectangles(width: Double, height: Double) extends Rectangular
case class Squares(size: Double) extends Rectangular {
  val width = size
  val height = size
}

val rectangle1 = Rectangles(4, 2)
rectangle1.area // Double = 8.0
val square1 = Squares(4)
square1.width // Double = 4.0
square1.perimeter // Double = 0.0