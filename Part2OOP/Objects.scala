  package Lectures.Part2OOP
  /* Scala is more object-oriented than Java because in Scala, we cannot have static members. Instead, Scala has
  singleton objects. A singleton is a class that can have only one instance, i.e., Object. You create singleton using
  the keyword object instead of class keyword. Since you can't instantiate a singleton object, you can't pass parameters
  to the primary constructor.
  class --> A class is a blueprint for objects. Once you define a class, you can create objects from the class blueprint
  with the keyword new. Through the object you can use all functionalities of the defined class.
  */
  object Objects extends App {
  object Person { // type + it's only instance
    val N_eyes = 2
    def can_fly : Boolean = false

    // Factory method
    def apply(mother: Person , father: Person): Person = new Person("Judy")
  }
  println(Person.N_eyes)    // --> 2
  println(Person.can_fly)   // --> false

  class Person (val name: String) {

  }
    /* COMPANIONS -> A companion object in Scala is an object that’s declared in the same file as a class, and has the
   same name as the class.
    */

  /* SCALA object = SINGLETON INSTANCE
  A Singleton object is an object which defines a single object of a class. A singleton object provides an entry point
  to your program execution. If you do not create a singleton object in your program, then your code compile
  successfully but does not give output.
  */
    //  def main(args: Array[String]): Unit = {


    val harry = Person
    val amanda = Person
    println(harry == amanda) // --> true ; both are pointing to a single instance.

    val jessy = new Person("jessy")
    val joey = new Person("joey")
    println(jessy == joey) // --> False ; as both belongs to different instances.

    val person1 = Person
    val person2 = Person
    println(person1 == person2) // --> true ; as it belongs to single instance.

    val judy = Person.apply(jessy, joey)
  // }
  // Scala applications = is a Scala object with: def main(args: Array[string]): Unit
  }
