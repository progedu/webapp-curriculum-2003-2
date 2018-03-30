object Main {
  val f1: Option[Int => Int] = Some((x) => x * 2)
  val f2: Option[Int => Int] = Some((x) => x + 10)
  val f3: Option[Int => Int] = Some((x) => x / 3)

  val ret = f1.flatMap(i1 => f2.flatMap(i2 => f3.map(i3 => i3(i2(i1(15))))))
}
