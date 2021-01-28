package Lectures.Part1Basics

object Part_2 extends App {
  def afunction(a: String , b: Int ): String = {    // a: string is a parameter , each parameter has a name and a type.
    // : String ---> return type of the function, we can use codeblocks to define a function.
    a + " " + b
  }
  println(afunction("Hello Scala",2021))

  def aparameterLessFunction(): Int = 18    // we can define a function without giving parameters.
  println(aparameterLessFunction())
  println(aparameterLessFunction)

  def aRepeatedFunction(aString: String , n: Int): String =
    if (n == 1) aString
    else aString + " " + aRepeatedFunction(aString,n-1)

  println(aRepeatedFunction("Hello",3))
  // When you want to use LOOPS , Use Recursion in Scala.

  def aFunctionwithSideffects(astring : String): Unit = println(astring)
  println(aFunctionwithSideffects("Hello"))

  def aBigFunction(n: Int): Int = {
    def aSmallFunction(a: Int, b: Int): Int = a + b
    aSmallFunction(n , n-1)

  }
   println(aBigFunction(18))

  // 1. A greeting function (Name,age) ===> Hi My name is $name and I'm $age years old.
  def aeasyFunction(name: String,age:Int) = "Hi My name is " + name + " and I'm " + age + " years old."
  println(aeasyFunction("David",20))

  // 2. A Factorial Function 1 * 2 * 3 * .. * n .
  def factorial(n: Int): Int =
    if (n <= 0) 1
    else n * factorial(n-1)

    println(factorial(5))

  /* 3. A fibonacci Function
        f(1) = 1
        f(2) = 1
        f(n) = f(n-1) + f(n-2)

   */
       def Fibonacci(n: Int): Int =
         if (n<=2) 1
         else Fibonacci(n-1)+ Fibonacci(n-2)
       println(Fibonacci(8))

  // 4. Tests if a number is prime or not.
       def Primenumber(n:Int): Boolean = {
         def Primeuntil(t: Int): Boolean =
           if (t<=1) true
           else n % t != 0 && Primeuntil(t-1)

         Primeuntil((n/2))
       }
       println(Primenumber(2003))
       println(Primenumber(37))
       println(Primenumber(37 * 13)
}
