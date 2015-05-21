import java.lang.String
import scala.collection.JavaConversions.propertiesAsScalaMap

object Answer2 {
  def main(args: Array[String]): Unit = {
    val props: scala.collection.Map[String,String] = System.getProperties()
    for((k,v) <- props) {
      println(k + "|" + v)
    }
  }
}
