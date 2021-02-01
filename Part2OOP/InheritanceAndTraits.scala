  package Lectures.Part2OOP

  import Lectures.Part2OOP.InheritanceAndTraits.Football1

    object InheritanceAndTraits extends App{

    // Single class inheritance --> one class at a time.
    class Football1 {
    def position = println("Striker")
  }
  class player extends Football1
  /* extends--> When a class inherits from another, it means it extends another. We use the 'extends' keyword for this.
   This lets a class inherit members from the one it extends and lets us reuse code. The class that extends is the
   subclass, the child class, or the derived class.
   */
  val messi = new player
  (messi.position)

    /* Access modifiers:
       1. Private : A private member is visible only inside the class or object that contains the member definition.
     */
    class Outer {
      class Inner {
        private def f() { println("f") }

        class InnerMost {
          f() // OK
        }
      }
      // (new Inner).f() // Error: f is not accessible
    }

    // 2. Protected : A protected member is only accessible from subclasses of the class in which the member is defined.

      class Super {
        protected def f() { println("f") }
      }

      class Sub extends Super {
        f() // OK
      }

      class Other {
       // (new Super).f() // Error: f is not accessible
      }

    /* 3. Public : Unlike private and protected members, it is not required to specify Public keyword for Public
    members. There is no explicit modifier for public members. Such members can be accessed from anywhere.
     */
    class Outer1 {
      class Inner {
        def f() { println("f") }

        class InnerMost {
          f() // OK
        }
      }
      (new Inner).f() // OK because now f() is public.
    }

    // Constructors --> Primary and auxiliary constructors
    class Person(name: String,age: String)
    class Adult(name: String,age: String,idcard: String) extends Person(name,age)

    class Football(name:String,team:Int) {
      def this(name:String) = this(name,0)
    }
    class clubs(name:String,team:Int,manager:String) extends Football(name)

    /* override--> Method Overriding in Scala is identical to the method overriding in Java but in Scala, the overriding
     features are further elaborated as here, both methods as well as var or val can be overridden. If a subclass has
     the method name identical to the method name defined in the parent class then it is known to be Method Overriding
     i.e, the sub-classes which are inherited by the declared super class, overrides the method defined in the super
     class utilizing the override keyword.
     */
    class Football12 {
      def position:Unit = println("Striker")
    }
    class member extends Football12 {
      override def position:Unit = println("Center Forward")
    }
    val ronaldo = new member
    }