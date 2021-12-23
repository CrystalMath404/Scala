
/** Напишите вашу реализацию в тестовые функции.
 *
 * https://docs.scala-lang.org/overviews/collections/maps.html
 */
object Maps {

  case class User(name: String, age: Int)

  /* a) В данной Seq[User] сгруппируйте пользователей по имени (`groupBy`) и вычислите средний возраст: `name -> averageAge`
   *    Вы можете реализовать ваше решение в теле тестовой функции. Не изменяйте сигнатуру.
   */
  def testGroupUsers(users: Seq[User]): Map[String, Int] = {
    val averageAge = users.map(_.age).sum / users.length
    users.groupBy(_.name).map(input_elem => (input_elem._1, averageAge))
  }

  /* b) Дана `Map[String, User]` состоящая из имен пользователей `User`, сколько имен пользователей, содержащихся в Map, содержат подстроку "Adam"?
   *    Вы можете реализовать ваше решение в теле тестовой функции. Не изменяйте сигнатуру.
   */
  def testNumberFrodos(map: Map[String, User]): Int = map.map(input_elem => input_elem._2.name).count(input_elem => input_elem.contains("Adam"))

  /* c) Удалите всех пользователей возраст которых менее 35 лет.
   *    Вы можете реализовать ваше решение в теле тестовой функции. Не изменяйте сигнатуру.
   */
  def testUnderaged(map: Map[String, User]): Map[String, User] = map.filter(input_elem => input_elem._2.age > 35)

  def main(args: Array[String]): Unit = {
    val user1 = User("Mark", 20)
    val user2 = User("Peter", 16)
    val user3 = User("Donny", 18)
    val users: Seq[User] = Seq(user1, user2, user3)
    println(testGroupUsers(users))
    println()

    var map = Map("Peter" -> User("Adamson", 20), "Adam" -> User("Adam", 40))
    println(testNumberFrodos(map))
    println()
    println(testUnderaged(map))
  }
}
