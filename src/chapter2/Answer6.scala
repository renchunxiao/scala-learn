import scala.collection.mutable.ArrayBuffer

object Answer6 {
  def main(args: Array[String]): Unit = {
    reverse(Array(1,2,3,4,5)).foreach(print)
    println()
    reverse(ArrayBuffer(1,2,3,4,5)).foreach(print)
  }
  
  def reverse(arr: Array[Int]) = {
    for(i <- 0 until arr.length) yield arr(arr.length - i - 1)
  }
  
  def reverse(arrb: ArrayBuffer[Int]) = {
    arrb.reverse
  }
}
