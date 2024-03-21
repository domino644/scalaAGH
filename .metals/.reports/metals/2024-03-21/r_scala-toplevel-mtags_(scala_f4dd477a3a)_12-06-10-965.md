error id: file://<WORKSPACE>/lab1/lab2.scala:[302..308) in Input.VirtualFile("file://<WORKSPACE>/lab1/lab2.scala", "import scala.beans.BeanProperty

class Person(val id: String, val givenName: String, var surname: String):
  def name() = givenName + " " + surname

class Person2(
    val id: String,
    val givenName: String,
    @BeanProperty var surname: String
):
  def name() = givenName + " " + surname

class 

object Appl:
  def main(agrs: Array[String]): Unit =
    val jk = new Person("1234567890", "Jan", "Kowalski")
    println(jk.name())

@main def ex03(): Unit =
  val jk = new Person("1234567890", "Jan", "Kowalski")
  println(jk.givenName)
  val p2 = new Person2("1", "bbb", "ccc")
  p2.surname = "abc"
  println(p2.surname)
")
file://<WORKSPACE>/lab1/lab2.scala
file://<WORKSPACE>/lab1/lab2.scala:15: error: expected identifier; obtained object
object Appl:
^
#### Short summary: 

expected identifier; obtained object