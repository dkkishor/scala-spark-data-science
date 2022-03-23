import LinkedList.*

@main def ListMain: Unit =
  println(6 +: ns)
  println(ns :+ 6)
  println(List(6,5,4) ++ ns)
  println(ns.distinct)
  println(ns.length)
  println(ns.take(3))
  println(ns.map(_ * 2))
  println(strList.map(_.toUpperCase()))
  println(numList.map(n => List(n, n)))
  println(numList.flatMap(n => List(n, n)))
  println(strList.flatMap(s => List(s, s.toUpperCase())))

object LinkedList {
  val numList: List[Int] = List(1,2,3,4)
  val numListEmpty = List()
  val numListEmpty2: List[Int] = Nil

  val ns = List(1,2,2,3,3,3,4,4,4,4)

  val strList = List("krishna", "kishore")
}
