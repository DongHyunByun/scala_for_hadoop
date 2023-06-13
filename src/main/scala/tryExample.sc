import scala.io.StdIn
import scala.util.{Try, Success, Failure}

def divide: Try[Int] = {
  val dividend = Try(StdIn.readLine("Enter an Int that you'd like to divide:\n").toInt)
  val divisor = Try(StdIn.readLine("Enter an Int that you'd like to divide by:\n").toInt)
  val problem = dividend.flatMap(x => divisor.map(y => x/y))
  problem match {
    case Success(v) => //성공시(problem의 값이 v에 들어간다.)
      println("Result of " + dividend.get + "/"+ divisor.get +" is: " + v)
      Success(v)
    case Failure(e) => //실패시
      println("You must've divided by zero or entered something that's not an Int. Try again!")
        println("Info from the exception: " + e.getMessage)
        divide
  }
}