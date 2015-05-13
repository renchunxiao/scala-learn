import scala.collection.mutable.ArrayBuffer

object Answer4 {
  def main(args: Array[String]): Unit = {
    getNewArray(Array(-1,2,4,-7,0,-2,3,0)).foreach(print)
  }

  def getNewArray(arr: Array[Int]) = {
    val buffer = ArrayBuffer[Int]()
    buffer ++= (for(a <- arr; if a > 0) yield a)
    buffer ++= (for(a <- arr; if a == 0) yield a)
    buffer ++= (for(a <- arr; if a < 0) yield a)
    buffer.toArray
  }
}
