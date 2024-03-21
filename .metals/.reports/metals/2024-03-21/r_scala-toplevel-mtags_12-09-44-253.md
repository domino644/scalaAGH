error id: file://<WORKSPACE>/lab2/lab2.scala:[455..461) in Input.VirtualFile("file://<WORKSPACE>/lab2/lab2.scala", "import scala.beans.BeanProperty

class Person(val id: String, val givenName: String, var surname: String):
  def name() = givenName + " " + surname

class Person2(
    val id: String,
    val givenName: String,
    @BeanProperty var surname: String
):
  def name() = givenName + " " + surname

class Int2DVec(val x: Int, val y: Int):
  def +(other: Int2DVec) = new Int2DVec(x + other.x, y + other.y)
  def unary_- = new Int2DVec(-x, -y)
  override def 


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

@main def ex05(): Unit =
    val v1 = new Int2DVec(1,2)
    val v2 = Int2DVec(10,20)
    val v3 = v1 + v2
    val v4 = -v2
    println(v3)
    println(v4)
    ")
file://<WORKSPACE>/lab2/lab2.scala
file://<WORKSPACE>/lab2/lab2.scala:19: error: expected identifier; obtained object
object Appl:
^
#### Short summary: 

expected identifier; obtained object