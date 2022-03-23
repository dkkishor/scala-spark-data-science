import Challenge5.*

@main def challenge5Main: Unit =
  println(num.head)
  println(num.tail)
  println(num.distinct)
  println(num.take(3))
  println(num.length)
  println(num.map(n => n * n))
  println(num.flatMap(n => List(n,n,n)))
  println(destList(List(Destination("NY", 8), Destination("Chicago", 5), Destination("Detroit", 3))))

object Challenge5 {
  val num: List[Int] = List(1,1,2,2,3,3,4)

  case class Destination(city:String, journeyTime: Int)

  def destList(dest: List[Destination]): List[String] =
    for
      dt <- dest
      if dt.journeyTime < 5
    yield dt.city
  end destList

}
