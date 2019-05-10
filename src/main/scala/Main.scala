object Main {
  val f1: Option[Int => Int] = Some((x) => x * 2)
  val f2: Option[Int => Int] = Some((x) => x + 10)
  val f3: Option[Int => Int] = Some((x) => x / 3)

  val f = for {
    func1 <- f1
    func2 <- f2
    func3 <- f3
  } yield func1.andThen(func2).andThen(func3)
  val result = f.map(func => func(15))
}
