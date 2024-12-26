```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
}

val instance = new MyClass()
println(instance.x) // Prints 0

// Problem:  The below attempt to create a copy of the object and set the value of x to 10 does not work.
val anotherInstance = instance.copy(x = 10)
println(anotherInstance.x) // Still prints 0 because copy is not defined.
```