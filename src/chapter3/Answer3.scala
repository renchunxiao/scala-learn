object Answer3 {
  def main(args: Array[String]): Unit = {
    val values = Array(4,2,1,6,8)
    val two = minmax(values)
    println(two)
  }

  def minmax(values: Array[Int]) = {
    (values.min,values.max)
  }
}
