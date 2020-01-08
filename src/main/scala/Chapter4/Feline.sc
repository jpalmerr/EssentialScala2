trait Feline {
  def colour: String
  def sound: String
}
case class Lion(colour: String, maneSize: Int) extends Feline {
  val sound = "roar"
}
case class Tiger(colour: String) extends Feline {
  val sound = "roar"
}
case class Panther(colour: String) extends Feline {
  val sound = "roar"
}

val blackPanther = Panther("black")
blackPanther.colour // String = black
blackPanther.sound // String = roar

