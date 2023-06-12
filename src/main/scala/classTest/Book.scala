package classTest

class Book (var title:String, var author:String) {
  // 생성자
  def this(title:String) = {
    this(title, "anonymous")
  }
}
