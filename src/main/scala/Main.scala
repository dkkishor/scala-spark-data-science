import Example.*;

@main def basics: Unit =
  println("Hello. This is Kishore.")
  println(msg)

  println(sum(9, 17))
  println(product(4,5))

  println(lightSwitch())
  println(lightSwitch(true))
  println(lightSwitch(switchOn = true))

  println(greeting())
  println(greeting(name = "Kishore"))

  println(partyAtHome(10))
  println(partyAtHome(guests = 15, tentAvailable = true))
  println(partyAtHome(guests = 45, tentAvailable = true))

  println(weather(sunny = true))
  println(weather(sunny = false))

  println(greetingMatch(friend = "kk"))
  println(greetingMatch(friend = "Krishna"))
  println(greetingMatch(friend = null))

def msg = "This message is through variable"

def sum(n1: Int, n2: Int): Int = n1 + n2
def product(n1: Int, n2: Int): Int = n1*n2

def lightSwitch(switchOn: Boolean = false): String = if switchOn then "Light On!" else "Light Off!"
def greeting(name: String = "Stranger"): String = s"I am $name"

var tempVal: Int = 40
var checkValue: Boolean = if tempVal > 15 then true else if tempVal == 15 then true else false

def partyAtHome(guests: Int, tentAvailable: Boolean = false): Boolean =
  if guests < 15 then true
  else if tentAvailable && guests < 40 then true
  else false

def weather(sunny: Boolean): String = sunny match
  case true => "Where are my sunglasses?"
  case false => "Where is my umbrella?"

def greetingMatch(friend: String): String = friend match {
  case "kk" | "dkk" => "Hi Kishore!"
  case newFriend => s"Hi $newFriend"
  case _ => "Unreachable code :)"
}

object Example {

}