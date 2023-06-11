// 조건문
val condition:Boolean =true

if (condition) {
  "condition is true"
}

// 조건문 한줄
val a = 4
val b = 2
val smallerNum = if (a<b) a else b
println(smallerNum)

if (a<b) println("a is smaller")

// 조건문 여러줄
if (a != b) {
  println("a is not equals as b")
  if (a>b) {
    println("a is larger than b")
  }
  else if (b>a) {
    print("b is larger than a")
  }
} else {
  println("a is equal as b")
}