package problems

object Problem01 extends App {
  def last(list: List[Int]): Option[String] = list match {
    case x :: Nil => Some(x.toString)
    case x :: xs => last(xs)
    case _ => None
  }

  println(last(List(1, 2, 3, 4, 5, 6, 7, 12)).getOrElse("None"))
  println(last(null).getOrElse("None"))
}