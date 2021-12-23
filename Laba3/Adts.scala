
import scala.util.{Failure, Try}

/** Реализуйте следующие функции.
  * 
  * List(1, 2) match {
  *   case head :: tail => ???
  *   case Nil          => ???
  *   case l            => ???
  * }
  * 
  * Option(1) match {
  *   case Some(a) => ???
  *   case None    => ???
  * }
  * 
  * Either.cond(true, 1, "right") match {
  *   case Left(i)  => ???
  *   case Right(s) => ???
  * }
  * 
  * Try(impureExpression()) match {
  *   case Success(a)     => ???
  *   case Failure(error) => ???
  * }
  * 
  * Try(impureExpression()).toEither
  * 
  */
object Adts extends App {

  // a) Дан List[Int], верните элемент с индексом n


  // примените функцию из пункта (a) здесь, не изменяйте сигнатуру 
  def testGetNth(list: List[Int], n: Int): Option[Int] = Some(list(n))
  val list = List(1, 2, 3, 4)
  println("a) testGetNth " + testGetNth(list, 2))

  // b) Напишите функцию, увеличивающую число в два раза.
  


  // примените функцию из пункта (b) здесь, не изменяйте сигнатуру
  def testDouble(n: Option[Int]): Option[Int] = Some(n.get + n.get)
  println("b) testDouble " + testDouble(Some(2)))

  // c) Напишите функцию, проверяющую является ли число типа Int четным. Если так, верните Right. В противном случае, верните Left("Нечетное число.").



  // примените функцию из пункта (c) здесь, не изменяйте сигнатуру
  def testIsEven(n: Int): Either[String, Int] = if (n % 2 == 0) Right(n) else Left("Нечетное число.")
  println("c) testIsEven " + testIsEven(6))

  // d) Напишите функцию, реализующую безопасное деление целых чисел. Верните Right с результатом или Left("Вы не можете делить на ноль.").



  // примените функцию из пункта (d) здесь, не изменяйте сигнатуру
  def testSafeDivide(a: Int, b: Int): Either[String, Int] = if (b != 0) Right(a/b) else Left("Вы не можете делить на 0.")
  println("d) testSafeDivide " + testSafeDivide(7,0))
  // e) Обработайте исключения функции с побочным эффектом вернув 0.



  // примените функцию из пункта (e) здесь, не изменяйте сигнатуру
  def testGoodOldJava(impure: String => Int, str: String): Try[Int] = Try(impure(str))
  def f(line:String): Int = line.toInt / 0
  println("e) testGoodOldJava " + testGoodOldJava(f, "777"))

}
