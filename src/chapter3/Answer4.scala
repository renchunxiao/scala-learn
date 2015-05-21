import scala.io.Source
import scala.collection.mutable.Map

object Answer4 {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("myfile").mkString
    val words = source.split("\\s+")
    
    val map = Map[String,Int]()
    for(word <- words) {
      map(word) = map.getOrElse(word, 0) + 1
    }
    
    println(map)
  }
}
