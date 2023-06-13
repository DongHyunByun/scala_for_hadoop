package abstractExample

object AbstractTest {
  def main(args: Array[String]): Unit = {
    val sedan: Car = new Sadan()
    val suv: Car = new Suv()
    val bus: AbstractCar = new Bus()

    val cars = List(sedan, suv)
    cars.foreach(it => {
      it.engineStart()
      it.engineStop()
    })

    bus.engineStart()
    bus.acclerate()
    bus.asInstanceOf[PaymentModule].collectPayment(1600)
    bus.engineStop()
  }
}
