object Main {
  val f1: Option[Int => Int] = Some((x) => x * 2)
  val f2: Option[Int => Int] = Some((x) => x + 10)
  val f3: Option[Int => Int] = Some((x) => x / 3)

  val f4 = for {
    i1 <- f1
    i2 <- f2
    i3 <- f3
  } yield i3.compose(i2).compose(i1)

  def main(args: Array[String]): Unit = {
    println(f4.map(_(15))) // Some(13)
  }
}
