try {
  1/0
} catch {
  case e : ArithmeticException => println("Are you idiot?")
  case _ : Throwable => println("Unknown Exception ")
} finally {
  println("print anyway")
}

// null인지 판단할때는 보통 option을 씀
def upperString(value:String) :Option[String] = {
  if (value.isEmpty) None
  else Some(value.toUpperCase) //some으로 감싸야 option타입으로 받을 수 있다
}

val result1 = upperString("lowercase")
val result2 = upperString("")

if (result1.isDefined) { //some이면 true를 리턴
  print(result1.get) //값을 확인
}
if (result2.isEmpty) {
  println("empty")
}

// 두개의 값중 하나를 판단할때. 보통 왼쪽이 error
def upperStringLR(value:String) : Either[String, String] = {
  if (value.isEmpty) Left("value cannot be empty")
  else Right(value.toUpperCase())
}

val result3 = upperStringLR(value = "lowercase")
val result4 = upperStringLR(value = "")

if (result3.isLeft) {
  println(result3.left.get)
} else {
  println(result3.right.get)
}

