

/** Напишите ваши решения в тестовых функциях.
  * 
  * https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/StringOps.html
  */
object Strings extends App{

  /* a) Преобразуйте все символы типа Char в верхний регистр (не используйте заглавные буквы).
   *    
   */
  def testUppercase(str: String): String = str.toUpperCase()
  println("testUppercase " + testUppercase("abcdefg"))
  println()
  /* b) Вставьте следующие значения в строку:
   *       Hi my name is <name> and I am <age> years old.
   *    
   */
  def testInterpolations(name: String, age: Int): String = s"Hi my name is $name and I am $age years old"
  println(testInterpolations("Ilya", 20))
  println()

  /* c) Добавьте два числа в следующую строку:
   *       Hi,
   *       now follows a quite hard calculation. We try to add:
   *         a := <value of a>
   *         b := <value of b>
   * 
   *         result is <a + b>
   * 
   *   
   */
  def testComputation(a: Int, b: Int): String = "Hi,\n   *       " +
    "now follows a quite hard calculation. We try to add:\n   *         " +
    s"a := $a\n   *         b := $b\n   * \n   *         " +
    s"result is ${a + b}"

  println(testComputation(1,2))
  println()
  /* d) Если длина строки равна 2, верните всю строку, иначе верните первые два символа строки.
   */
  def testTakeTwo(str: String): String = str.take(2)
  println(testTakeTwo("123456789"))

}
