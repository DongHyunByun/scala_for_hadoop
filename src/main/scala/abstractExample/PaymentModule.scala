package abstractExample

trait PaymentModule {
  def collectPayment(amount: Int) : Boolean
}
