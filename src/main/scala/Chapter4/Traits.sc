// those who have registered, those who are anonymous

import java.util.Date
case class Anonymous2(id: String, createdAt: Date = new Date())
case class User2(id: String, email: String, createdAt: Date = new Date())

/*
With these class definitions we’re saying that both anonymous and registered
visitors have an id and a creation date. But we only know the email address
of registered visitors.
There is obvious duplication here, and it would be nice to not have to write
the same definitions twice.
More important though, is to create some common type for the two kinds of visitors.
 */

import java.util.Date
trait Visitor1 {
  def id: String // Unique id assigned to each user
  def createdAt: Date // Date this user first visited the site
  // How long has this visitor been around?
  def age: Long = new Date().getTime - createdAt.getTime
}
case class Anonymous1( id: String, createdAt: Date = new Date() ) extends Visitor1
case class User1(id: String, email: String, createdAt: Date = new Date()) extends Visitor1

