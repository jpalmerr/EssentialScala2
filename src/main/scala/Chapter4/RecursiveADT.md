Recursive ADT

```
sealed trait RecursiveExample

final case class RecursiveCase(recursion: RecursiveExample) extends RecursiveExample

case object BaseCase extends RecursiveExample
```