package abstractExample

class Bus extends AbstractCar(name = "Bus")  with PaymentModule{
  //상속 후 오버라이딩
  override def engineStart(): Unit = println("Engine Start in Bus")
  override def engineStop(): Unit = println("Engine Stop in Bus")

  //with에 대한 정의
  override def collectPayment(amount: Int): Boolean = {
    println(s"paid $amount won")
    true
  }

  //
  override def acclerate(): Unit = println("Bus is acclerating")
}
