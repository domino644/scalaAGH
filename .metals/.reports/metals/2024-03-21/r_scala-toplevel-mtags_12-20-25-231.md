error id: file://<WORKSPACE>/lab2/lab2.scala:[934..935) in Input.VirtualFile("file://<WORKSPACE>/lab2/lab2.scala", "import scala.beans.BeanProperty

class Person(val id: String, val givenName: String, var surname: String):
  def name() = givenName + " " + surname

class Person2(
    val id: String,
    val givenName: String,
    @BeanProperty var surname: String
):
  def name() = givenName + " " + surname

class Int2DVec private (val x: Int, val y: Int):

  def this() =
    this(0, 0)
    println("Default")

  def this(prototype: Int2DVec) =
    this(prototype.x, prototype.y)
    println("Prototype")

  def +(other: Int2DVec) = new Int2DVec(x + other.x, y + other.y)
  def unary_- = new Int2DVec(-x, -y)
  def *(other: Int2DVec) = Int2DVec(x * other.x, y * other.y)
  def -(other: Int2DVec) = Int2DVec(x - other.x, y - other.y)
  override def toString(): String = s"($x,$y)"

object Appl:
  def main(agrs: Array[String]): Unit =
    val jk = new Person("1234567890", "Jan", "Kowalski")
    println(jk.name())

object 

//Examples executions

@main def ex03(): Unit =
  val jk = new Person("1234567890", "Jan", "Kowalski")
  println(jk.givenName)
  val p2 = new Person2("1", "bbb", "ccc")
  p2.surname = "abc"
  println(p2.surname)

@main def ex05(): Unit =
  val v1 = new Int2DVec(1, 2)
  val v2 = Int2DVec(10, 20)
  val v3 = v1 + v2
  val v4 = -v2
  val v5 = v1 * v2
  val v6 = v1 - v2
  println(v3)
  println(v4)
  println(v5)
  println(v6)

@main def ex06(): Unit =
  val v1 = Int2DVec(1, 2)
  val v2 = Int2DVec(10, 20)
  println(Int2DVec())
  println(Int2DVec(v1 + v2 + v2))
")
file://<WORKSPACE>/lab2/lab2.scala
file://<WORKSPACE>/lab2/lab2.scala:38: error: expected identifier; obtained at
@main def ex03(): Unit =
^
#### Short summary: 

expected identifier; obtained at