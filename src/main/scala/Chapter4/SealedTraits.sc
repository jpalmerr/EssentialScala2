/*
In many cases we can enumerate (establish no. of)
all the possible classes that can extend a trait

e.g. Anonymous, User

We can model this case with a sealed trait, which allows
the compiler to provide extra checks for us.
 */

import java.util.Date
sealed trait Visitor {
  def id: String
  def createdAt: Date
  def age: Long = new Date().getTime() - createdAt.getTime()
}

case class Anonymous( id: String, createdAt: Date = new Date() ) extends Visitor
case class User(id: String, email: String, createdAt: Date = new Date())

/*
When we mark a trait as sealed we must define all of its subtypes in the same file.
Once the trait is sealed, the compiler knows the complete set of subtypes
and will warn us if a pattern matching expression is missing a case:
 */

/* Consider making subtypes final if there is no case for extending them
i.e. final case class(..) extends *sealed trait*
 */

/*
The majority of cases should use the sealed trait / final case class pattern.
 */

/*
we can control extension points of sealed traits and thus make stronger
guarantees about the behaviour of subtypes
 */