Ultimately the decision is up to us. Different teams will adopt different programming styles. However, we look at the properties of each approach to
inform our choices:

*Inheritance-based approaches*
    
    Traits, Classes
    
allow us to create permanent data structures with specific types and names. 



We can name every field and method and implement use-case-specific code in each class. Inheritance
is therefore better suited to modelling significant aspects of our programs that
are re-used in many areas of our codebase.

Generic data structures, 

    Tuples, Options, Eithers 

are extremely broad and general purpose. 

There are a wide range of predefined classes in the Scala standard library that we can use to quickly model
relationships between data in our code. 

These classes are therefore better suited
to quick, one-off pieces of data manipulation where defining our own types
would introduce unnecessary verbosity to our codebase.