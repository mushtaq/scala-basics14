package code
import data.Data

object Main extends App {

  println(Sorter.sort(List(9, 4, 1, 8, 5, 6)))
  println(Sorter.sort(List("z", "m", "a")))

  {
    implicit val intOrd2: Ord[Int] = (a: Int, b: Int) => a < b
    implicit val intOrd3: Ord[Int] = (a: Int, b: Int) => a > b
    println(Sorter.sort(List(Some(10), None, Some(5))))
  }

  println(Sorter.sort(List(Some("z"), None, Some("a"))))
  Sorter.sort(Data.books).foreach(println)

  def max[T](xs: List[T])(implicit ord: Ord[T]): T = ???
}
