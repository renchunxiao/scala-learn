class Answer5 (val fullName: String) {
    val firstName  = fullName.split(" ")(0) 
    val lastName = fullName.split(" ")(1)
}

object Answer5 {
  def main(args: Array[String]): Unit = {
    val a = new Answer5("ren chunxiao")
    println(a.firstName)
    println(a.lastName)
  }
}
