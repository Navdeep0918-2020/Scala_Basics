package Lectures.Part1Basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

/* Recursion is a method which breaks the problem into smaller sub problems and calls itself for each of the problems.
   That is, it simply means function calling itself. The tail recursive functions better than non tail recursive
   functions because tail-recursion can be optimized by compiler. A recursive function is said to be tail recursive if
   the recursive call is the last thing done by the function. There is no need to keep record of the previous state.
*/
object Part_3 extends App {
  def Factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("Computing Factorial of" + n + " - I first need factorial of " + (n - 1))
      val result = n * Factorial(n - 1)
      println(" Computed Factorial of " + n)

      result
    }
  }
    println(Factorial(10))

  def anotherFactorial(n:Int): BigInt = {
    @tailrec
    def factHelper(x: Int , accumulator: BigInt): BigInt =
      if (x<=1) accumulator
      else factHelper(x-1, x * accumulator) // TAIL Recursion => Use recursive call as the last Expression.

    factHelper(n,1)
  }
  println(anotherFactorial(600))
  // When you use LOOPS , Use Tail Recursion.

  /*
  Exercises:
  1. Concatenate a string n times.
  2. IsPrime Function as a Tail recursive.
  3. Fibonacci Function as a Tail recursive.
   */
  // Solutions :
  @tailrec
  def concatenate(astring: String, n: Int , accumulator: String): String = {
    if (n <= 0) accumulator
    else concatenate(astring,n-1,astring + accumulator)
  }

  println(concatenate("Scala",6,""))



  def Isprime(n: Int): Boolean = {
    @tailrec
    def Isprimetailrec(t: Int, accumulator: Boolean): Boolean =
      if (!accumulator) false
      else if (t <= 1) true
      else Isprimetailrec(t - 1, n % t != 0 && accumulator)

    Isprimetailrec(n/2,true)
  }
     println(Isprime(2003))
     println(Isprime(579))



  def Fibonacci(n: Int): Int = {
     def FiboTailrec(i: Int, last: Int, nextTolast: Int): Int =
       if (i>=n) last
       else FiboTailrec(i+1,last + nextTolast,last)

     if (n<=2) 1
     else FiboTailrec(2,1,1)
   }
      println(Fibonacci(8))


  // CallByName and CallByValue

  /*
  In Scala when arguments pass through call-by-value function it compute the passed-in expression’s or arguments value
  once before calling the function . But a call-by-Name function in Scala calls the expression and recompute the
  passed-in expression’s value every time it get accessed inside the function.

  callByValue
  This method uses in-mode semantics. Changes made to formal parameter do not get transmitted back to the caller.
  Any modifications to the formal parameter variable inside the called function or method affect only the separate
  storage location and will not be reflected in the actual parameter in the calling environment. This method is also
  called as call by value.
  Syntax: def callByValue(x: Int)

  callByName
  A call-by-name mechanism passes a code block to the function call and the code block is complied, executed and
  calculate the value. Message will be printed first than returns the value.
  syntax: def callByName(x: => Int)
   */

  def callByName(x: => Long): Unit = {
    println("By Name :" + x)
    println("By Name :" + x)
  }

  def callByvalue(x: Long): Unit = {
    println("By value :" + x)
    println("By value :" + x)
  }

    callByName(System.nanoTime())
    callByvalue(System.nanoTime())
   // System.nanoTime() ==> Returns the current value of the most precise available system timer, in nanoseconds

  def infinite(): Int = 1 + infinite()
  def PrintFirst(x: Int , y: => Int) = println(x)

  PrintFirst(18,infinite())
  // PrintFirst(infinite(),18) ==> We can't do this as it will give us an error.


  // Default and Named Arguments

  def Factorial(n:Int, acc: Int = 1): Int =
    if (n<=1) acc
    else Factorial(n-1 , n * acc)

  val Factorial10 = Factorial(10,1)

  def savePicture(format: String, width: Int= 1920, Height: Int= 1080): Unit = println("Saving Picture")
  savePicture("jpeg",1920,1080)

  savePicture("jpeg")
  savePicture(Height = 1080,width = 1920,format = "bmp")
  // 1. Pass in every leading argument.
  // 2. Name the arguments.
}
