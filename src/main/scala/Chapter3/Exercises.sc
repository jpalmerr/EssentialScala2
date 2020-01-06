class Cat(val colour: String, val food: String)

val oswald = new Cat("Black", "Milk")
val henderson = new Cat("Ginger", "Chips")
val quentin = new Cat("Tabby and white", "Curry")

/*
Define an object ChipShop with a method willServe. This method should
accept a Cat and return true if the cat’s favourite food is chips, and false
otherwise.
 */

object ChipShop {
  def willServe(cat: Cat): Boolean = {
    cat.food match {
      case "Chips" => true
      case _ => false
    }
  }
}

ChipShop.willServe(henderson)
ChipShop.willServe(oswald)

// DIRECTORIAL DEBUT

/*
Write two classes, Director and Film, with fields and methods as follows

Director should contain:
– a field firstName of type String
– a field lastName of type String
– a field yearOfBirth of type Int
– a method called name that accepts no parameters and returns the full name

Film should contain:
– a field name of type String
– a field yearOfRelease of type Int
– a field imdb Rating of type Double
– a field director of type Director
– a method directorsAge that returns the age of the director at
the time of release
– a method isDirectedBy that accepts a Director as a parameter and returns a Boolean
 */

class Director(val firstName: String, val lastName: String, val yearOfBirth: Int) {
  def name: String = firstName + " " + lastName
}

class Film(val name: String, val yearOfRelease: Int, val rating: Double, val director: Director) {
  def directorsAge: Int = yearOfRelease - director.yearOfBirth

  def isDirectedBy(isItThisDirector: Director): Boolean = isItThisDirector == director
}

// -------------- demo data ----------------
val eastwood = new Director("Clint", "Eastwood", 1930)
val mcTiernan = new Director("John", "McTiernan", 1951)
val nolan = new Director("Christopher", "Nolan", 1970)
val someBody = new Director("Just", "Some Body", 1990)

val memento = new Film("Memento", 2000, 8.5, nolan)
val darkKnight = new Film("Dark Knight", 2008, 9.0, nolan)
val inception = new Film("Inception", 2010, 8.8, nolan)
val highPlainsDrifter = new Film("High Plains Drifter", 1973, 7.7,  eastwood)
val outlawJoseyWales = new Film("The Outlaw Josey Wales", 1976, 7.9,  eastwood)
val unforgiven = new Film("Unforgiven", 1992, 8.3, eastwood)
val granTorino = new Film("Gran Torino", 2008, 8.2, eastwood)
val invictus = new Film("Invictus", 2009, 7.4, eastwood)
val predator = new Film("Predator", 1987, 7.9, mcTiernan)
val dieHard = new Film("Die Hard", 1988, 8.3, mcTiernan)
val huntForRedOctober = new Film("The Hunt for Red October", 1990,  7.6, mcTiernan)
val thomasCrownAffair = new Film("The Thomas Crown Affair", 1999, 6.8,  mcTiernan)

eastwood.yearOfBirth // Int = 1930
dieHard.director.name // John McTiernan
invictus.isDirectedBy(nolan) // false
darkKnight.isDirectedBy(nolan) // true


// A SIMPLE COUNTER


// order only matters as in worksheet repl
class Adder(amount: Int) {
  def add(in: Int) = in + amount
}

class Counter(val count: Int = 1) {
  def inc: Counter = new Counter(count + 1)
  def dec: Counter = new Counter(count - 1)

  def adjust(adder: Adder): Counter = {
    new Counter(adder.add(count))
  }
}

new Counter(10).inc.dec.inc.inc.count // Int = 12
new Counter().inc.dec.count // Int = 1


val example1 = new Adder(1).add(2) // Int = 3

val add1 = new Adder(1)
new Counter().adjust(add1).count