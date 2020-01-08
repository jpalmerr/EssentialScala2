# The Product Type Pattern

"A has a B and a C"

A cat HAS a favourite food and HAS a colour
 
```$xslt
case classA(b: B, c: C)
```
or 

```$xslt
trait  {
 def b: B
 def c: C 
}
```

# The Sum Type Pattern

"A is a B or a C"

A cat IS A feline
A lion IS A feline

```$xslt
sealed trait A
final case class B() extends A
final case class C() extends A
```

## Algebraic Data Types

An algebraic data type is any data that uses the above two patterns.

### The Missing Patterns

1) a IS A b AND c

```$xslt
trait B
trait C
trait A extends B with C
```

If we want to represent data that conforms to this pattern,
we will likely want to use a: **Type Class**

However there are some legitimate use cases...
e.g.:
 - sharing implementation across several classes where it doesn’t make
      sense to make default implementations in the main trait.
      
2) a HAS A b or C

```$xslt
sealed trait A
final case class D(b: B) extends A
final case class E(c: C) extends A
```      


  
