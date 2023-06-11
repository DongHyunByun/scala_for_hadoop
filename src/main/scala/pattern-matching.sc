val anything:Int = 0

anything match {
  case 0 => println("matched 0")
  case 1 => println("matched 1")
  case _ => println("No match!")
}

// 타입을 지정해주는 용도로 사용한다.
val anything : Int = 1

def checkValue(anything : Int) : String =
  anything match {
    case 0 => "Matched 0"
    case 1 => "Matched 1"
    case _ => "No match!"
  }


val case0 : String = checkValue(anything = 0)
println(case0)

val case1 = checkValue(anything = 1)
print(case1)

val case2 = checkValue(anything = 2)
print(case2)

//val caseString:Int = checkValue(anything=0) //타입이 다르므로 에러가 난다