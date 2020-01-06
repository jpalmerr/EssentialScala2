/*
Implement a companion object for Person containing an apply method that
accepts a whole name as a single string rather than individual first and last
names.
 */

class Person(val firstName: String, val lastName: String) {
  def name: String =
    s"$firstName $lastName"
}

object Person{
  def apply(name: String): Person = {
    val parts = name.split(" ")
    new Person(parts(0), parts(1))
  }
}

Person.apply("John Doe").firstName // String = John
// ... and using syntactic sugar...
Person("John Doe").lastName // String = Doe