import Challenge4.*

@main def Challenge: Unit =
  println(doubleIt(temp))
  println(doubleIt(tempNone))
  println(getFirstClassTicketPrice(Film("pushpa", Some(TicketPrice(15, Some(25))))))
  println(firstClassTicketPrice)

object Challenge4 {
  val temp: Option[Int] = Some(6)
  val tempNone: Option[Int] = None

  def doubleIt(num: Option[Int]): Option[Int] = num.map(_ * 2)

  case class TicketPrice(standardTicketPrice: Int, firstClassTicketPrice: Option[Int])

  case class Film(name: String, ticketPrice: Option[TicketPrice])

  def getFirstClassTicketPrice(film: Film): Option[Int] =
    film.ticketPrice.flatMap(_.firstClassTicketPrice)

  var pushpa = Film("pushpa", Some(TicketPrice(15, Some(25))))

  var firstClassTicketPrice = for {
    price <- pushpa.ticketPrice
    first <- price.firstClassTicketPrice
  } yield(first)

  def getFirstClassTicketPrice2(film: Film): Option[Int] =
    for
      price <- pushpa.ticketPrice
      first <- price.firstClassTicketPrice
    yield first
  end getFirstClassTicketPrice2


}
