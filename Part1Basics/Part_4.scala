package Lectures.Part1Basics

object Part_4 extends App {
  val str: String = "Hello let's get started with Scala."

  println(str.toLowerCase()) // => converts the string to lowercase.
  println(str.toUpperCase()) // => converts the string to uppercase.
  println(str.length) // => Prints the total length of the string.
  println(str.charAt(13)) // => Prints the character at the pointed index.
  println(str.replace(" ","--")) //=>Returns a new string resulting from replacing all occurrences of oldChar.
  println(str.substring(9,18)) // => Returns a new string that is a substring of this string.
  println(str.startsWith("Scala")) // => Tests if this string starts with the specified prefix beginning a specified index.
  println(str.split("  ").toList) //=> Splits this string around matches of the given regular expression.
  println(str.reverse) //=> Reverse the whole string.
  println(str.take(5)) // => Returns the number of characters as mentioned.

  val aNumberstring = "0918"
  val aNumber = aNumberstring.toInt // => converting it to Integer.

  println('A' +: aNumberstring :+ 'Z') // => concatenating


  // Scala Specific : String Interpolators

  /* s - Interpolator : The literal ‘s’ allows the usage of variable directly in processing a string, when you prepend
  ‘s’ to it. Any String variable with in a scope that can be used with in a String. The following are the different
   usages of ‘s’ String interpolator.
   String interpolater can also process arbitrary expressions. The following code snippet for Processing a String
   (1 + 1) with arbitrary expression (${1 + 1}) using ‘s’ String interpolator. Any arbitrary expression can be embedded
   in ‘${}’.
   */

  val name = "David"
  val age = 25
  val Greetings = s"Hello my name is $name and i'm $age years old."
  val anotherGreeting = s"Hello my name is $name and i will be turning ${age + 1} years old."

  println(Greetings)
  println(anotherGreeting)

  /* F- Interpolator : The literal ‘f’ interpolator allows to create a formatted String, similar to printf in C
  language. While using ‘f’ interpolator, all variable references should be followed by the printf style format
  specifiers such as %d, %i, %f, etc.
   */

  val speed = 1.2f
  val anothername = "John"

  println(f"$anothername can eat $speed%2.2f burgers per minute. ")
  // 2.2f ==> 2 characters total and minimum 2 decimals precision.

  //  can check for type correctness

  val x = 1.1f
  // val anotherstr = f"$x%3d"   // %3d ==> Format requires Int and x = float

  /* raw - Interpolator : The ‘raw’ interpolator is similar to ‘s’ interpolator except that it performs no escaping of
  literals within a string.
  */
  println(raw"This is a \n new line.")    // This line prints the whole string including \n
  val escaped = "This is a \n new line."
  println(raw"$escaped")  // This prints the value in two lines as we have mentioned \n

  // Regular expression

    val regexstring : String = "Hi my age is 25"
    val pattern = """.* ([\d]+).*""".r
    val pattern(answerstring) = regexstring
    val answer = answerstring.toInt
    println(answer)

    // Basic Exercise
    val pivalue : Double = 3.147587658484
    val astring : String = "Hi printing the pi value inside a string: " + pivalue.formatted("%2.2f")
    println(astring)

  // Flow Control
    if (1 > 3) println("It is impossible.") else println("The world makes sense.") // In one single line.

    if (1 > 3) {  // In multiple Lines.
      println("Impossible leave it.")
    } else {
      println("It makes sense.")
    }

  // Matching

    val number = 2
     /* A pattern match includes a sequence of alternatives, each starting with the keyword case. Each
     alternative includes a pattern and one or more expressions, which will be evaluated if the pattern matches. An
     arrow symbol => separates the pattern from the expressions.
     */
     number match {
       case 1 => println("one")
       case 2 => println("Two")
       case 3 => println("Nine")
       case 4 => println("eighteen")
       case _ => println("Something else")
     }

  // For loops

    for (x <- 1 to 9 ) {
      val squared = x * x
      println(squared)
    }

  // While loop
     var x1 = 10
     while (x1 >= 0) {
       println(x1)
       x1 -= 1
     }

    // Data Structure

    /* Tuples : A tuple is a collection of objects which are ordered and immutable. Tuples are sequences, just like
    lists.The differences between tuples and lists are, the tuples cannot be changed unlike lists and tuples use
    parentheses.
    */

     val programlang = ("Python","Scala","Java")
     println(programlang)

     // Refer to the individual fields with ONE-BASED-INDEX.
        println(programlang._1)
        println(programlang._2)
        println(programlang._3)

        println(programlang.copy(_2 = "Big Data"))

     val football = ("Ronaldo","Rooney",2020 , true, "Kick-off")
     println(football)

     val football1 = "Messi" -> "Barcelona" -> "Striker" // we can represent the values separated by ->
     println(football1._2)
     println(football1._1)

  /*
  Lists : Scala Lists are quite similar to arrays which means, all the elements of a list have the same type but there
  are two important differences. First, lists are immutable, which means elements of a list cannot be changed by
  assignment. Second, lists represent a linked list whereas arrays are flat. All lists can be defined using two
  fundamental building blocks, a tail Nil and ::, which is pronounced cons. Nil also represents the empty list.
   */

  // List of Strings
  val fruit: List[String] = List("apples", "oranges", "pears")

  // List of Integers
  val nums: List[Int] = List(1, 2, 3, 4)

  // Empty List.
  val empty: List[Nothing] = List()

    println(fruit)
    println(nums)
    println(empty)

    println(fruit(1))
    println(nums(3))
    println(fruit(2))

    println(fruit.head) // head = This method returns the first element of a list.
    println(fruit.tail) // Tail = This method returns a list consisting of all elements except the first.

    for (fruits <- fruit ) {println(fruits)}

    /*
    Maps = Scala map is a collection of key/value pairs. Any value can be retrieved based on its key. Keys are unique
    in the Map, but values need not to be unique. Maps are also called Hash tables. There are two kinds of Maps, the
    immutable and the mutable. The difference between mutable and immutable objects is that when an object is immutable,
     the object itself can't be changed. By default, Scala uses the immutable Map.
     */

      val aMap: Map[String,Int] = Map()

      val Phonebook = Map("Jim" -> 111,"carey" -> 333,"Amanda" -> 789).withDefaultValue("NA")
      println(Phonebook)

      /* withDefaultValue() is used if we opt for a value which is not present in the data it pops out error. so we
         we use this function to prevent crashing the terminal.
      */
      // Operations in Map
        println(Phonebook.contains("Amanda")) // Returns true if there is a binding for key in this map,false otherwise.
        println(Phonebook("Sam"))
        println(Phonebook.apply("carey"))
      //apply->Returns the value associated with the given key, or the result of the map's default method,if none exists

       var listt = List(1,2,3,4)
       var temp = listt.map(x=>x*x)
       println(temp)

      // Add a pairing
      val newPairing = "Nancy" -> 918
      val newPhonebook = Phonebook + newPairing // Concatenating
      println(newPhonebook)

      // Functions on Maps
      println(Phonebook.map(pair => pair._1.toLowerCase -> pair._2))

      // Filter => Returns all elements of this shrinkable collection which satisfy a predicate.
      println(Phonebook.filter(x => x._1 == "Jim"))

      // Map values => This method returns an iterable containing each value in the map.
      println(Phonebook.view.mapValues(number => "+91-" + number).toMap)

      // Conversions to other collections
      println(Phonebook.toList)
      println(List("jim" -> 333).toMap)


      /* GroupBy => The groupBy method takes a predicate function as its parameter and uses it to group elements by key
       and values into a Map collection. */
      val names = List("Bob","James","steve","Nancy","John","Gelic")
      println(names.groupBy(name => name.charAt(0)))







}
