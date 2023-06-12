//trait은 자바의 인터페이스 같은 역할을 한다. 각각의 함수는 따로 구현을 해주어야 한다.

trait Car {
  def engineStart(): Unit
  def engineStop(): Unit
}
