
object trait_test {
  def main(args: Array[String]): Unit = {
    val sedan: Car = new Sadan()
    val suv: Car = new Suv()
    val bus: Car = new Bus()

    val cars = List(sedan, suv, bus)
    cars.foreach(it => {
      it.engineStart()
      it.engineStop()
    })

    bus.asInstanceOf[PaymentModule].collectPayment(1600)
  }
}
