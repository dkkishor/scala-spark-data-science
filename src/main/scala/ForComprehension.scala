import ForComprehension.*

@main def ForCom: Unit =
  println(averageRating)

object ForComprehension {
  case class Rating(googleRating: Option[Int], netflixRating: Option[Int])

  case class Film(name: String, rating: Option[Rating])

  val pushpa: Film = Film("Pushpa", Some(Rating(Some(5), Some(4))))

  val averageRating = for {
    rating <- pushpa.rating
    googleRating <- rating.googleRating
    netflixRating <- rating.netflixRating
    if googleRating <= 5
    averageRating = (googleRating + netflixRating) / 2
  } yield averageRating
}
