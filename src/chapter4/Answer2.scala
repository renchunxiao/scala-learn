class Answer2 {
  private var balance = 0
  def deposit(value: Int) {balance = balance + value}
  def withdraw = balance
}

object Answer2 {
  def main(args: Array[String]): Unit = {
    val an = new Answer2
    an.deposit(100)
    an.deposit(2)
    print(an.withdraw)
  }
}
