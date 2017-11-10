object Main {
  val f1: Option[Int => Int] = Some((x) => x * 2)
  val f2: Option[Int => Int] = Some((x) => x + 10)
  val f3: Option[Int => Int] = Some((x) => x / 3)

  val compositeFunction: Option[Int => Int] = for {
    v1 <- f1
    v2 <- f2
    v3 <- f3
  } yield v1 andThen v2 andThen v3
  compositeFunction.map(_.apply(15))

}
