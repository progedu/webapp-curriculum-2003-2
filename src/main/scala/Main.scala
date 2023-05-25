object Main {
  val f1: Option[Int => Int] = Some((x) => x * 2)
  val f2: Option[Int => Int] = Some((x) => x + 10)
  val f3: Option[Int => Int] = Some((x) => x / 3)
  def calc(x: Int): Option[Int] = {
    for { fn1 <- f1
          fn2 <- f2
          fn3 <- f3 } yield fn3(fn2(fn1(x)))
  }
}
