import scala.util.Random

object Answer1 {
  def main(args: Array[String]): Unit = {
    getArray(5).foreach(print)
  }
  def getArray(n: Int): Array[Int] = {
    val arr: Array[Int] = new Array[Int](n)
    val r = new Random()
    for (i <- arr) yield r.nextInt(n) 
  }
}
