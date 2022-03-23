import OptionsMap.*

@main def OptionMain: Unit =
  println(numNone)
  println(num)
  println(strEmpty)
  println(str)
  println(getLength(strEmpty))
  println(getLength(str))
  println(toUpper(strEmpty))
  println(toUpper(str))
  println(multiVar.multival.flatMap(single => single.singleval))
  println(multiVar.multival.map(single => single.singleval))
  println(multiVar.multival.map(single => single.singleval).flatten)

object OptionsMap {
  val numNone: Option[Int] = None
  val num: Option[Int] = Some(10)

  val strEmpty: Option[String] = None
  val str: Option[String] = Some("Kishore")

  def getLength(str: Option[String]): Int = str.getOrElse("").length

  def toUpper(str: Option[String]): Option[String] = str.map(word => word.toUpperCase())

  case class Single(singleval: Option[Int])
  case class Multi(multival: Option[Single])

  val multiVar: Multi = Multi(Some(Single(Some(5))))

}
