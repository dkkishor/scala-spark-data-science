import ListForComprehension.*

@main def ListForMain: Unit =
  println(combinations(List(1,2), List(3,4)))
  println(takeNames(List("1a1", "22a", "b33")))

object ListForComprehension {
  def combinations(xs: List[Int], ys: List[Int]): List[(Int, Int)] =
    for
      x <- xs
      y <- ys
    yield (x, y)
  end combinations

  def takeNames(names: List[String]): List[String] =
    for
      name <- names
      if name.contains("a")
    yield (name)

}
