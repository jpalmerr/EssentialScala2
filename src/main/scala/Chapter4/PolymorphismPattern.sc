sealed trait A {
  def foo: String =
    "It's A!"
}
final case class B() extends A {
  override def foo: String =
    "It's B!"
}
final case class C() extends A {
  override def foo: String =
    "It's C!"
}

val anA = B()
anA.foo //  String = It's B!

val alsoAnA = C()
alsoAnA.foo // String = It's C!

/*
Remember that if you provide a default implementation in a trait,
you should ensure that implementation is valid for all subtypes.
 */
