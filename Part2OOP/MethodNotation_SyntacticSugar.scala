  package Lectures.Part2OOP

  object MethodNotation_SyntacticSugar extends App{
  class Person(val name: String , favouriteMovie: String, val age:Int= 25) { // Define a class Person with two parameters.
    def likes(movie: String): Boolean = movie == favouriteMovie // Define a method likes which returns Boolean
    //def hangoutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}" // Define a method hangoutWith
    def unary_! : String = s"$name , How are you?" // Define a unary_! function and always include a space between the :
    def unary_+ : Person = new Person(name,favouriteMovie,age + 1)
    def isAlive : Boolean = true
    def apply() : String = s"Hi my name is $name and my favourite movie is $favouriteMovie."
    // def apply(n: Int) : String = s"$name has watched movies $n times." // overloaded apply method.
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)",favouriteMovie) // overloaded infix notation

    def learns(thing: String): String = s"$name is learning $thing."
    def learnsScala = this learns "Scala"
  }

  val mary = new Person("Mary","Inception")
  val jack = new Person("Jack","Terminator")
  val tom = new Person("Tom","Fight club")

  println(mary.likes("Inception"))
  println(jack.likes("Terminator"))

  // Different way of calling a likes method
  println(mary likes "Inception") // Infix Notation => which is applicable when we have only one parameter
  println(jack likes "Terminator")

  //println(mary hangoutWith tom) // Syntactic sugar
  //println(jack hangoutWith mary)

  println(1 + 2)  // All operators are methods in scala.
  println(1.+(2))

  // Prefix notation
  val x = -18
  val y = 18.unary_- // Both are equivalent x and y value. (unary_prefix)
  // Unary operators works with only few operators ( + , - , ~ , !)

  println(mary.unary_!) // we can write in both ways it will gives the same output.
  println(!tom)

  // Postfix notation : Functions that do not receive any parameters can be used in a postfix notation.
  println(mary.isAlive)

  // apply() method => apply serves the purpose of closing the gap between Object-Oriented and Functional paradigms.
  println(mary.apply())
  println(tom())

  // println(tom(10))

  /*
  Exercises:
  1. Overload the + operator
     example: mary + "the rockstar" => new Person "Mary ("the rockstar")
   */
   println((mary + "the rockstar")())
   println((tom + "crusher").apply())

  /*
  2. Add an age to the Person class
     Add a unary + operator => new person with the age + 1.
     +mary => mary with the age incrementer.
   */
   println(tom.unary_+.age)
   println(+mary.age)
   println(+jack.age)

  /*
  3. Add a "learns" method in the person class => "Mary learns scala"
     Add a learnsScala method, calls learns method with "scala"
     Use it in post fix notation.
   */
  println(mary.learns("Scala"))
  println(tom.learns("Java"))
  println(jack.learns("Python"))
  println(mary.learnsScala)
  }
