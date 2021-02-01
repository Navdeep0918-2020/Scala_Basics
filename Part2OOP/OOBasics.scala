  package Lectures.Part2OOP

  object OOBasics extends App{
  val person = new Person("Ronaldo", 45)
  println(person.x)   // We can't pop out age value unless we specify val or var in the parameters.
  person.greet("Messi")
  person.greet()

  val author = new Writer("Steve","Jobs",1940)
  val novel = new Novel("Apple generation",2003,author)

  println(novel.authorAge)
  println(novel.IsWrittenBy(author))

  val counter = new counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(5).print
  }
  // Constructor , Class parameters are NOT Fields
  class Person(name: String , val age: Int = 56) {
  val x = 2
  var y = "Football"
  println(1+2+5+8+9)
  // we can write expression,initiate val or val, define function inside code block and all are considered as Fields.
  // Method
  def greet(name: String): Unit = println(s"${this.name} says: Hi $name.")

  // Overloading ==> means defining methods with same name but different signatures.
  def greet():Unit   = s"Hi my name is $name"

  // Multiple Constructors
  def this(name:String) = this(name,56)
  def this()= this("John Doe")
  }

  /*
  class Writer : firstname , surname , year
  Method : fullname
  */
  class Writer(firstname: String, surname: String, val year: Int) {
  def fullname: String = firstname + " " + surname
  }

  /*
  Class Novel : name, year of release, author
  Method: author age , IsWrittenBy (author) , copy(new year of release) = new instance of novel
  */
  class Novel(name: String, yearofrelease: Int, author: Writer) {
  def authorAge = yearofrelease - author.year

  def IsWrittenBy(author: Writer) = author == this.author

  def copy(newyear: Int): Novel = new Novel(name, newyear, author)
  }
  /*
  Counter Class
  - receives an int value
  - method : current count
  - To increment/decrement = New counter
  - overload inc/dec to receive an amount
  */
  class counter(val count : Int = 0) {
    def inc = {
      println("Incrementing")
      new counter(count + 1)
    }
    def dec = {
      println("decrementing")
      new counter(count -1)
    }

    def inc(n: Int): counter =
      if (n<=0) this
      else inc.inc(n-1)

    def dec(n: Int): counter =
      if (n<=0) this
      else dec.dec(n-1)

    def print = println(count)
  }










