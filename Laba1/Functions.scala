/** Напишите отдельные функции, решающие поставленную задачу.
  * 
  * Синтаксис:
  *   // метод
  *   def myFunction(param0: Int, param1: String): Double = // тело
  * 
  *   // значение
  *   val myFunction: (Int, String) => Double (param0, param1) => // тело
  */
object Functions extends App{

  def SquareOfCircle(r: Double): Double = r * r * Math.PI

  /* a) Напишите функцию, которая рассчитывает площадь окружности
   *    r^2 * Math.PI
   */



  // примените вашу функцию из пункта (a) здесь, не изменяя сигнатуру
  def testCircle(r: Double): Double = SquareOfCircle(r)
  println("a) Square of circle is " + testCircle(3))
  


  /* b) Напишите карированную функцию которая рассчитывает площадь прямоугольника a * b.
   */
  def SquareOfRectangleCurr(a: Double)(b: Double): Double = a * b


  // примените вашу функцию из пукта (b) здесь, не изменяя сигнатуру
  def testRectangleCurried(a: Double, b: Double): Double = SquareOfRectangleCurr(a)(b)
  val currFunk = testRectangleCurried(2,_)
  println("b) Square of rectangle curr is " + currFunk(9))


  // c) Напишите не карированную функцию для расчета площади прямоугольника.

  def SquareOfRectangle(a: Double, b: Double): Double = a * b



  // примените вашу функцию из пункта (c) здесь, не изменяя сигнатуру
  def testRectangleUc(a: Double, b: Double): Double = SquareOfRectangle(a,b)
  print("c) Square of rectangle is " + testRectangleUc(2,9))
}
