#Modelling Data with Traits

Traits are templates for creating classes, in the same way that classes are templates for creating objects. 
Traits allow us to express that two or more classes can be considered the same,
and thus both implement the same operations.

---------

Like a class, a trait is a named set of field and method definitions.
However, it differs from a class in a few important ways:

- a trait cannot have a constructor
    - we can't create objects directly from a trait.  Instead we can use a trait to create a class, and then create objects
      from that class. We can base as many classes as we like on a trait.
      
- Traits can define abstract methods that have names and type signatures but no implementation.
    - We saw this in the Visitor trait.
      We must specify the implementation when we create a class that extends the
      trait, but until that point we’re free to leave definitions abstract.   
      
      
 Traits are a way of abstracting over classes,
 just like classes are a way of abstracting over objects.
      
------------------

Abstract methods: Methods which do not have an implementation but must be implemented by extending classes.         