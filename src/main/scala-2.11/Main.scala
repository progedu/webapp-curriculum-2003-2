object Main {
  val f1: Option[Int => Int] = Some((x) => x * 2)
  val f2: Option[Int => Int] = Some((x) => x + 10)
  val f3: Option[Int => Int] = Some((x) => x / 3)

  val sf = for (i1 <- f1; i2 <- f2; i3 <- f3)
    yield i1.andThen(i2).andThen(i3)

  val func: Int=>Option[Int] = (x: Int) => {
    sf.map(f => f(x))
  }

  val res = func(15)

  val result = sf.map(_.apply(15))
}
