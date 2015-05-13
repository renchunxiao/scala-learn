object Answer5 {
  def main(args: Array[String]): Unit = {
    print(avg(Array(1.0,2.0,3.0,4.0)))
  }
  
  def avg(arr: Array[Double]) = {
    // arr.sum / arr.length 直接使用数组提供的方法更加简单
    var sum = 0.0
    for(a <- arr) sum += a
    sum / arr.length
  }
}
