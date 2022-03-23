@main def Challenge2: Unit =
  println(competition(result = 1))
  println(competition(result = 2))
  println(competition(result = 3))
  println(competition(result = 15))

def competition(result: Int): String = result match
  case 1 => "Gold"
  case 2 => "Silver"
  case 3 => "Bronze"
  case _ => "Well Done!"