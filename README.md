# Copying and Modifying Immutable Fields in Regular Scala Classes

This example demonstrates a common issue when working with immutable fields in regular Scala classes.  Case classes handle copying seamlessly, but regular classes require explicit handling.

The `bug.scala` file shows an attempt to copy a class instance and modify one of its immutable fields.  The `bugSolution.scala` file provides a corrected approach.

## How to Reproduce

1.  Compile and run `bug.scala`.
2.  Observe that modifying the immutable field in the copied instance doesn't work.
3.  Compile and run `bugSolution.scala` to see the corrected solution.
