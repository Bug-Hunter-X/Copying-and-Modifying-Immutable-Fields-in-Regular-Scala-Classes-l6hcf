```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
  def copy(x: Int = this.x): MyClass = new MyClass(x)
}

val instance = new MyClass()
println(instance.x) // Prints 0

// Solution: Add a copy method explicitly to enable copying and field modification.
val anotherInstance = instance.copy(x = 10)
println(anotherInstance.x) // Prints 10
```