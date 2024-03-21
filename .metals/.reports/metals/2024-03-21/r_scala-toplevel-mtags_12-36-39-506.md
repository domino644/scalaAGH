error id: file://<WORKSPACE>/lab2/lab2.scala:[580..588) in Input.VirtualFile("file://<WORKSPACE>/lab2/lab2.scala", "import scala.beans.BeanProperty

class Person(val id: String, val givenName: String, var surname: String):
  def name() = givenName + " " + surname

class Person2(
    val id: String,
    val givenName: String,
    @BeanProperty var surname: String
):
  def name() = givenName + " " + surname

class Int2DVec private (val x: Int, val y: Int):

  def +(other: Int2DVec) = new Int2DVec(x + other.x, y + other.y)
  def unary_- = new Int2DVec(-x, -y)
  def *(other: Int2DVec) = Int2DVec(x * other.x, y * other.y)
  def -(other: Int2DVec) = Int2DVec(x - other.x, y - other.y)
  def 
  override def toString(): String = s"($x,$y)"

object Appl:
  def main(agrs: Array[String]): Unit =
    val jk = new Person("1234567890", "Jan", "Kowalski")
    println(jk.name())

object Int2DVec:
  def apply(x: Int, y: Int) = new Int2DVec(x, y)
  def apply() = new Int2DVec(0, 0)
  def apply(prototype: Int2DVec) = new Int2DVec(prototype.x, prototype.y)
  def unitVectorOf(vector: Int2DVec): Int2DVec = new Int2DVec()

//Examples executions

@main def ex03(): Unit =
  val jk = new Person("1234567890", "Jan", "Kowalski")
  println(jk.givenName)
  val p2 = new Person2("1", "bbb", "ccc")
  p2.surname = "abc"
  println(p2.surname)

@main def ex05(): Unit =
  val v1 = Int2DVec(1, 2)
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

@main def ex08(): Unit =
  val v1 = Int2DVec(1, 2)
  val v2 = Int2DVec(10, 20)
  val v3 = v1 + v2
  val v4 = -v2
  println(v3)
  println(v4)
  println(Int2DVec())
  println(v1 + v1 + v2)
")
file://<WORKSPACE>/lab2/lab2.scala
file://<WORKSPACE>/lab2/lab2.scala:20: error: expected identifier; obtained override
  override def toString(): String = s"($x,$y)"
  ^
#### Short summary: 

expected identifier; obtained override