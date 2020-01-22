sealed trait Feline
final case class Lion() extends Feline
final case class Tiger() extends Feline
final case class Panther() extends Feline
final case class Cat(favouriteFood: String) extends Feline

// rather than just represent food as string...
sealed trait Food
case object Antelope extends Food
case object TigerFood extends Food
case object Licorice extends Food
final case class CatFood(food: String) extends Food

object Diner {
  def dinner(feline: Feline): Food =
    feline match {
      case Lion() => Antelope
      case Tiger() => TigerFood
      case Panther() => Licorice
      case Cat(food) => CatFood(food)
    }
}

val lion = Lion()
Diner.dinner(lion) // Food = Antelope

/*

when to use each approach:

The general rule is:

if a method only depends on other fields and methods in a class:
- it is a good candidate to be implemented inside the class.

If the method depends on other data (for example, if we needed a Cook to make dinner):
- consider implementing it using pattern matching outside of the classes in question.
  If we want to have more than one implementation we should use pattern matching and
  implement it outside the classes.
 */

/* Functional Programming:

Add new method: Existing code unchanged

Add new data: Change existing code
 */