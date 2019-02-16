package code

trait Ord[T] {
  def lt(a: T, b: T): Boolean
}

object Ord {
  implicit val intOrd: Ord[Int] = (a: Int, b: Int) => a < b
  implicit val strOrd: Ord[String] = (a: String, b: String) => a < b

  implicit def optOrd[T](implicit ord: Ord[T]): Ord[Option[T]] =
    (a: Option[T], b: Option[T]) =>
      (a, b) match {
        case (Some(x), Some(y)) => ord.lt(x, y)
        case (None, _)          => true
        case _                  => false
    }
}
