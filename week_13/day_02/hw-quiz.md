# Polymorphism

1. What does the ***word*** 'polymorphism' mean?
    * Polymorphism means “Many Forms”
2. What does it mean when we apply polymorphism to OO design? Give a simple Java example.
    * If I had an Animal superclass, and a Duck and Elephant class which both extend from the Animal class, I could treat the Duck or Elephant as a form of Animal, and therefore call any methods (such as eating) from the Animal superclass on the Duck or Elephant class.
3. What can we use to implement polymorphism in Java?
    * Method overloading or method overriding.
4. How many 'forms' can an object take when using polymorphism?
    * It can only exist in two forms.
5. Give an example of when you could use polymorphism.
    * The animal, duck and elephant example above?

# Composition and Aggregation

1. What do we mean by 'composition' in reference to object-oriented programming?
    * composition is a “has a” association between objects, where an object is composed of smaller objects.
2. When would you use composition? Provide a simple example in Java.
    * A Library class might be composed of an arraylist of Book classes.
3. Give a difference between composition and aggregation?
    * In composition, the child cannot exist without the parent, but in aggregation, the child can exist without the parent.
4. What is/are the advantage(s) of using composition/aggregation?
    * It is more flexible than inheritance, and can be changed easier.
5. When using composition, when an object is destroyed, what happens to all the objects it is composed of?
    * They no longer remain.
6. When using aggregation, when an object is destroyed, what happens to all the objects it is composed of?
    * They remain.