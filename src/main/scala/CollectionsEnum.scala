import CollectionsEnum.*
import TrafficLight.*
import Triathlon.*

@main def Enum: Unit =
  println(TrafficSignal(Green))
  println(howManyMeters(Cycle))

object CollectionsEnum {
  enum TrafficLight:
    case Red, Green, Amber

  import TrafficLight.*
  def TrafficSignal(light: TrafficLight): String = light match {
    case Red => "STOP"
    case Green => "GO"
    case Amber => "SLOWDOWN"
  }

  enum Triathlon(val meters: Int):
    case Swim extends Triathlon(meters = 400)
    case Cycle extends Triathlon(meters = 5000)
    case Run extends Triathlon(meters = 2000)

  import Triathlon.*
  def howManyMeters(tri: Triathlon): Int = tri match {
    case swim @ Swim => swim.meters
    case cycle @ Cycle => cycle.meters
    case run @ Run => run.meters
  }
}
