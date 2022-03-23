case class Person(name: String, dept: Int)

val kishore: Person = Person(name = "Kishore", dept = 1)

@main def Collections: Unit =
  println(kishore)
  println(greeting(kishore))
  // kishore.dept = 10 ERROR: Immutable
  println(greeting(kishore.copy(dept = 10)))

def greeting(person: Person): String = s"Hi ${person.name} in Dept:${person.dept}"

