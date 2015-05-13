object Answer2 {
  def main(args: Array[String]): Unit = {
    val a = Array(1, 2, 3, 4, 5);
    revert(a);
    a.foreach(println);
  }

  def revert(arr: Array[Int]) {
    for (i <- 0 until (arr.length - 1, 2)) {
      val t = arr(i);
      arr(i) = arr(i + 1);
      arr(i + 1) = t;
    }
  }
}
