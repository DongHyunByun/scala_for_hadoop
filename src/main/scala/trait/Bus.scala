//다중특성(with)를 이용하여 여러 trait를 섞을 수 있다.

class Bus extends Car with PaymentModule{
  override def engineStart(): Unit = println("Engine Start in Bus")
  override def engineStop(): Unit = println("Engine Stop in Bus")

  override def collectPayment(amount: Int): Boolean = {
    println(s"paid $amount won")
    true
  }
}
