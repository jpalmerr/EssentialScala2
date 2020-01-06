/*
Case classes are an exceptionally useful shorthand for defining a class,
a companion object, and a lot of sensible defaults in one go.
They are ideal for creating lightweight data-holding classes with the minimum of hassle.
 */

// Whenever we declare a case class, Scala automatically generates a class and companion object:

case class Person2(firstName: String, secondName: String) {
  def name:String = firstName + " " + secondName
}

val james = Person2("James", "Palmer") // we have a class
// james: Person2 = Person2(James,Palmer)
Person2 // and a companion object
// Person2.type = Person2

// FEATURES

james.firstName // String = James
// a default toString method...
james // Person2 = Person2(James,Palmer)

// Sensible equals, and hashCode methods that operate on the field values
/*
This makes it easy to use case classes with collections like Lists, Sets and
Maps. It also means we can compare objects on the basis of their contents
rather than their reference identity
 */

// A copy method
james.copy() // Person2 = Person2(James,Palmer)
james.copy("A") // Person2 = Person2(A,Palmer)
james.copy(secondName = "B") // Person2(James,B)

// CASE OBJECT

/*
If you find yourself defining a case class with no constructor
arguments you can instead a define a case object.
 */

case object Citizen {
  def firstName = "John"
  def lastName = "Doe"
  def name = firstName + " " + lastName
}

Citizen.toString