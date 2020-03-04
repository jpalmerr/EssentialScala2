# Variance

Variance annotations allow us to control subclass relationships between types with type parameters.

```$xslt
sealed trait Maybe[A]
final case class Full[A](value: A) extends Maybe[A]
final case class Empty[A]() extends Maybe[A]
```

Ideally we would like to drop the unused type parameter on Empty and write
something like:

```$xslt
sealed trait Maybe[A]
final case class Full[A](value: A) extends Maybe[A]
case object Empty extends Maybe[???]
```

 Objects can’t have type parameters...
 
## Covariant Sum Types

If A of type T is a B or C, and C is not generic, write

```$xslt
sealed trait A[+T]
final case class B[T](t: T) extends A[T]
case object C extends A[Nothing]
```

as Nothing is a subtype of anything
 
 ## Exercise
 
 Using the notation A <: B to indicate A is a subtype of B and assuming:
 
 • Siamese <: Cat <: Animal
 and
 • Purr <: CatSound <: Sound
 
 if I have a method
 
 ```$xslt
def groom(groomer: Cat => CatSound): CatSound = {
 val oswald = Cat("Black", "Cat food")
 groomer(oswald)
 }
```
 which of the following can I pass to groom?
 
 a) A function of type Animal => Purr
 
 b) A function of type Siamese => Purr
 
 c) A function of type Animal => Sound
 
 
 a) Yes
 
 b) No, Oswald is not Siamese cat
 
 c) No as require a CatSound
 