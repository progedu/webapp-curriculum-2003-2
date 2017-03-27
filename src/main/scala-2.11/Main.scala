object Main {
  val f1: Option[Int => Int] = Some((x) => x * 2)
  val f2: Option[Int => Int] = Some((x) => x + 10)
  val f3: Option[Int => Int] = Some((x) => x / 3)

  val calculate: Option[Int => Int] = for {
    i1 <- f1
    i2 <- f2
    i3 <- f3
  } yield (x) => i3(i2(i1(x)))

  calculate.map(_(15))
  //calculate.map(x => x(15))
}
