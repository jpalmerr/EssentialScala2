2.min(3)  // 2
"3".toInt // Int = 3
// "foo".toInt // exception

// INTERACTING WITH OBJECTS

// We interact with objects by calling methods

"hello".toUpperCase // String = HELLO

"abcdef".take(3) // String = abc

"hello".toUpperCase.toLowerCase // String = hello

"Hello world!".take(2 + 3) // String = Hello

// OPERATORS
/* Because every value in Scala is an object we can also call methods on primitive
types such as Int and Boolean. This is in contrast to Java where int and
boolean are not objects
 */

123.toShort
123.toByte
43 - 3 + 2
"the quick brown fox" split " " // Array[String] = Array(the, quick, brown, fox)

// take home points

// All Scala values are objects. We interact with objects by calling methods on them

/* an aside on side effects

The literal expression "Hello world!" evaluates to a String value. The expression println("Hello world!") evaluates to Unit and, as a side-effect,
prints "Hello world!" on the console.
This an important distinction between a program that evaluates to a value
and a program that prints a value as a side-effect. The former can be used in
a larger expression but the latter cannot.
 */

// OBJECT DECLARATION

object Test {
  def name: String = "Probably the best object ever"
}

Test.name // String = Probably the best object ever

object Test2 {
  def hello(name: String): String =
    "Hello " + name
}

Test2.hello("James") // String = Hello James

// fields

object Test3 {
  val name = "Adam"
  def hello(other: String): String =
    name + " says hi to " + other
}

Test3.hello("James")

/*
The body expression of a field is run only once after which the final value is stored
in the object.

The body of a method, on the other hand, is evaluated every time we call the
method
 */

// COMPOUND EXPRESSIONS

if(1 < 2) "Yes" else "No" // String = yes

// blocks

def name: String = {
  val title = "Professor"
  val name = "Funkenstein"
  title + " " + name
}
name // String = Professor Funkenstein

if(1 > 2) "alien" else 2001 // Any = 2001