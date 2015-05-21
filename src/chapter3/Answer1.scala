
object Answer1 {
  def main(args: Array[String]): Unit = {
    val map = Map("a" -> 25.0, "b" -> 30.0)
    val newmap = for((k,v) <- map) yield k -> v * 0.9
    println(newmap)
  }
}
