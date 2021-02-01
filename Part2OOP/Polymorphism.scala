  package Lectures.Part2OOP

  import scala.collection.IterableOnce.iterableOnceExtensionMethods


  /* Polymorphism :
  In the simplest of terms, polymorphism means one object having many forms or an object’s ability to exhibit multiple
  behaviors. In computer terms, this would show up as handling different data types using the same interface or method.
  Types of Polymorphism:
  1. Parametric polymorphism : The Naive solution and The Dry solution
  2. Subtype polymorphism
  3. Ad-Hoc polymorphism : Function overloading and Operator overloading

  */
  object Polymorphism extends App{

  // 1. Parametric Polymorphism:

  def pairWiseReverseInt(xs : List[Int]): List[Int] = xs.grouped(2).flatMap(_.reverse).toList
  val input = List(1,2,3,4,5,6)
  val expected = List(2,1,4,3,6,5)
  val actual = pairWiseReverseInt(input)
  assert(actual == expected)
  println(pairWiseReverseInt(input)) // --> List(2,1,4,3,,6,5)

  def pairWiseReverseString(xs: List[String]): List[String] = xs.grouped(2).flatMap(_.reverse).toList
  val original1 = List("a","b","c","d","e")
  val expected1 = List("b","a","d","c","e")
  val actual1 = pairWiseReverseString(original1)
  assert(actual1 == expected1)
  println(pairWiseReverseString(original1))


  /* Parametric polymorphism helps us eliminate this unnecessary duplication of code by introducing a second formal
  parameter list for type parameters. With parametric polymorphism, the logic remains the same for all the different
  types.We’ve represented the type parameter by letter A, as with all formal parameters, we expect to substitute A
  during a method call with a concrete type such as Int, String, or any other concrete type in our case:
  */

  def pairWiseReverse[A](xs: List[A]):List[A] = xs.grouped(2).flatMap(_.reverse).toList
  val int1 = List(6,7,8,9,10)
  val expected_int = List(7,6,9,8,10)
  val string1 = List("M","N","O","P","Q")
  val expected_string = List("N","M","P","O","Q")
  val double1 = List(1.2,2.7,3.4,4.3,5.0)
  val expected_double = List(2.7,1.2,4.3,3.4,5.0)
  assert(expected_int == pairWiseReverse[Int](int1))
  assert(expected_string == pairWiseReverse[String](string1))
  assert(expected_double == pairWiseReverse[Double](double1))
  println(pairWiseReverse[Int](int1))
  println(pairWiseReverse[String](string1))
  println(pairWiseReverse[Double](double1))
  }