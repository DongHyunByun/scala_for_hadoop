package abstractExample

abstract class AbstractCar(name : String) {
  def engineStart():Unit = println(s"Engine Start in $name")
  def engineStop():Unit = println(s"Engine Stop in $name")
  def acclerate():Unit
  def break():Unit = print(s"$name breaking")
}
