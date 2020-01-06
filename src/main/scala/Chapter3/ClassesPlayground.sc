// A class is a template for creating objects that have similar methods and fields

class Person1 {
  val firstName = "James"
  val lastName = "Palmer"

  def name = firstName + "" + lastName
}

val james = new Person1
james.firstName // String = James
val james2 = new Person1

// we can write a method that takes a Person as a parameter

object Alien {
  def greet(p: Person1): String = {
    "Hello " + p.firstName + p.lastName // or p.name
  }
}

Alien.greet(james) // String = Hello James

// Constructors
 /*
allows us to pass parameters
to new objects as we create them
 */

class Person(val firstName: String, val lastName: String) {
  def name = firstName + " " + lastName
}

val john = new Person("John", "Smith")
john.name // String = John Smith
val joe = new Person("Joe", "Bloggs")
joe.name // String = Joe Bloggs

/*
val fields are immutable—they are initialized once a[er which we cannot
change their values. Scala also provides the var keyword for defining mutable
fields.

as a scala programmer we look to work with immutable
 */

// DEFAULT AND KEYWORD PARAMETERS

def greet(firstName: String = "Some", lastName: String = "Body") : String =
  "Greetings, " + firstName + " " + lastName + "!"

// If a parameter has a default value we can omit it in the method call
greet() // String = Greetings, Some Body!
greet("Busy") // String = Greetings, Busy Body!

// Combining keywords with default parameter values let us skip earlier parameters and just provide values for later ones
greet(lastName = "Palmer") // Greetings, Some Palmer!


