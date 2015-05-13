
object Answer7 {
  def main(args: Array[String]): Unit = {
    val b = ArrayBuffer(1, -2, 0, -3, 0, 4, 5);
    val c = ArrayBuffer[Int]()
    c ++= b.distinct
    c.foreach(println)
  }
}
