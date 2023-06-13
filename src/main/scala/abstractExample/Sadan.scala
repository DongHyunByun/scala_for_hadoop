package abstractExample

class Sadan extends Car{
  override def engineStart(): Unit = println("Engine Start in Sadan")
  override def engineStop(): Unit = println("Engine Stop in Sadan")
}
