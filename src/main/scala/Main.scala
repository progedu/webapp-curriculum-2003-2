object Main {
  val f1: Option[Int => Int] = Some((x) => x * 2)
  val f2: Option[Int => Int] = Some((x) => x + 10)
  val f3: Option[Int => Int] = Some((x) => x / 3)

}

// REPLにて
val threeFunc = (f1: Option[Int => Int], f2: Option[Int => Int], f3: Option[Int => Int]) => (n: Int) =>
  for {
    i1 <- f1
    i2 <- f2
    i3 <- f3
  } yield i1.andThen(i2).andThen(i3)(n)
Main.threeFunc(Main.f1, Main.f2, Main.f3)(15)


