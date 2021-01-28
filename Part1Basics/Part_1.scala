package Lectures.Part1Basics

object Part_1 extends App {

  val x: Int = (9 + 18) // (09 + 18) is an arithmatic expression.
  println(x)

  println(9 + 18 * 2020 / 6)
 // +,-,*,/,,<<,>>,>>>(Right shift with zero extension)
 // && , || , ! are Logical operators.
 // &, |, ^, <<,>>,>>>(Right shift with zero extension) are Bitwise operators.
  println(918 == x)
  // == (equal), != (Not equal), < , <= , > , >= -----> Relational Operators

  println(!(1 == x))
  // == , && , || are assignment operators.

  var aVariable = 9
  aVariable += 18
  println(aVariable)
  // += , -= , *= , /= ------> side effects

  var anothervariable = 63

  anothervariable += 34
  println(anothervariable)

  // Instructions(Do) vs Expression(Value)

  // IF expression
  val acondition = true
  val aconditionedvalue = if(acondition) 9 else 18
  println(aconditionedvalue)
  println(if(acondition) 9 else 18)
  println(9 + 18)
  // Everything in scala is an expression.
  var i = 1
  while(i < 10) {
    println(i)
    i += 1
  }

  val aweirdvalue = (aVariable = 3) // Unit == void that means don't return anything meaningful
  println(aweirdvalue)

  // Side effects : println() , Whiles , Reassigning

  // code blocks ---> Is surrounded by curly braces and inside it we write codes, define values, write expressions.

  val acodeblock = {
    val y = 2
    val z = (y + 1)
    if (z > 2) "Hello" else "Goodbye"
  }
  println(acodeblock)














}
