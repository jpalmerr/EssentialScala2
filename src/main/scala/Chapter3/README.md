# Objects and Classes

## Scala's Type Hierarchy


Unlike Java, which separates primitive and object types, everything in Scala is
an object. 

As a result, **primitive** value types like Int and Boolean form part
of the same type hierarchy as classes and traits.

Scala has a grand supertype called Any, under which there are two types,
AnyVal and AnyRef. 

AnyVal is the supertype of all value types, which AnyRef
is the supertype of all “reference types” or classes.

----------

There are two special types at the bottom of the hierarchy. 

Nothing is the type of throw expressions, 
and Null is the type of the value null. 

These special types are subtypes of everything else, 
which helps us assign types to throw and null while keeping other types in our code sane.

-------------

How close does function application syntax get us to creating truly reusable
objects to do computations for us? What are we missing? 

The main thing we’re missing is types, which are the way we properly abstract
across values.

Later on we will see how Scala copes with this problem by defining a generic
set of function types that we can use in a wide variety of situations.


----------


In this section we’ve explored classes. 

We have seen that classes allow us to abstract over objects. 
That is, to define objects that share properties in common and have a common type.


We also looked at companion objects, which are used in Scala to define auxiliary
constructors and other utility methods that don’t belong on a class.

Finally, we introduced case classes, which greatly reduce boilerplate code and
allow pattern-matching, a new way of interacting with objects, in addition to
method calls.