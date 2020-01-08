// Sum Pattern

sealed trait TrafficLight
case object Red extends TrafficLight
case object Green extends TrafficLight
case object Yellow extends TrafficLight

sealed trait Calculation
final case class Success(result: Int) extends Calculation
final case class Failure(reason: String) extends Calculation

/*
Bottled water has a size (an Int), a source (which is a well, spring, or tap),
and a Boolean carbonated. Implement this in Scala.
*/

sealed trait Source
case object Well extends Source
case object Spring extends Source
case object Tap extends Source

case class BottledWater(size: Int, carbonated: Boolean, source: Source)

val evian = BottledWater(100, false, Spring)
evian.source // Source = Spring