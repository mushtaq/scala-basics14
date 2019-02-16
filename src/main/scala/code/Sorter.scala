package code

object Sorter {

  def sort[T](xs: List[T])(implicit ord: Ord[T]): List[T] = xs match {
    case Nil          => Nil
    case head :: tail => insert(head, sort(tail))
  }

  def insert[T](x: T, xs: List[T])(implicit ord: Ord[T]): List[T] = xs match {
    case Nil                          => List(x)
    case head :: _ if ord.lt(x, head) => x :: xs
    case head :: tail                 => head :: insert(x, tail)
  }

}
