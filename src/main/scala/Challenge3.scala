import OC.*
import UnitedKingdom.*

@main def CountryMain: Unit =
  println(Population(Country("USA", 5000000)))
  println(Population(Country("INDIA", 200000000)))
  println(isScotland(England))
  println(isScotland(Scotland))
  println(whereAmI(NorthernIreland))
  println(whereAmI(Wales))

object OC {
  case class Country(name: String, population: Int)
  def Population(country: Country): Int = country.population

  enum UnitedKingdom:
    case England, NorthernIreland, Scotland, Wales

  import UnitedKingdom.*
  def isScotland(country: UnitedKingdom): Boolean = if country == Scotland then true else false

  def whereAmI(country: UnitedKingdom): String = country match {
    case England => "I am British"
    case NorthernIreland => "I am Irish"
    case Scotland => "I am Scotish"
    case Wales => "Mixed!"
  }
}