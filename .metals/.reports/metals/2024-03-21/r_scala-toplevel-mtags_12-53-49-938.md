error id: file://<WORKSPACE>/lab2/lab2.scala:[1320..1323) in Input.VirtualFile("file://<WORKSPACE>/lab2/lab2.scala", "import scala.beans.BeanProperty
import scala.compiletime.ops.boolean
import scala.util.hashing.Hashing.Default

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
  def |-?(other: Int2DVec): Boolean = this.x * other.x + this.y * other.y == 0
  override def toString(): String = s"($x,$y)"

object Appl:
  def main(agrs: Array[String]): Unit =
    val jk = new Person("1234567890", "Jan", "Kowalski")
    println(jk.name())

object Int2DVec:
  def apply(x: Int, y: Int) = new Int2DVec(x, y)
  def apply() = new Int2DVec(0, 0)
  def apply(prototype: Int2DVec) = new Int2DVec(prototype.x, prototype.y)
  def unitVectorOf(vector: Int2DVec): Int2DVec = new Int2DVec(
    if vector.x >= 0 then vector.x / vector.x else -1,
    if vector.y >= 0 then vector.y / vector.y else -1
  )

trait Fraction:
  val num: Int
  val denom: Int
  def 
  def *(other: Fraction): Fraction

trait Loggable:
  def log(timeStamp: Long, msg: String) =
    println(s"[${timeStamp.toString()}]: ${msg}")

object Fraction:
  def apply(num: Int, denom: Int, loggable: Boolean = false): Fraction =
    if loggable then LoggableImpl(num, denom)
    else DefaultImpl(num, denom)

  private class DefaultImpl(val num: Int, val denom: Int) extends Fraction:
    override def *(other: Fraction): Fraction =
      Fraction(this.num * other.num, this.denom * other.denom)

    override def toString() = num.toString + "/" + denom.toString

  private class LoggableImpl(num: Int, denom: Int)
      extends DefaultImpl(num, denom)
      with Loggable:
    def timeStamp = System.nanoTime

    override def *(other: Fraction): Fraction =
      log(timeStamp, s"multiplying ${this.toString} by ${other.toString}")
      Fraction(this.num * other.num, this.denom * other.denom, true)

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

@main def ex09(): Unit =
  val v1 = Int2DVec(10, 0)
  val v2 = Int2DVec(0, -10)

  if v1 |-? v2 then println("v1 is orthogonal to v2")
  else println("v1 is not orthogonal to v2")
")
file://<WORKSPACE>/lab2/lab2.scala
file://<WORKSPACE>/lab2/lab2.scala:42: error: expected identifier; obtained def
  def *(other: Fraction): Fraction
  ^
#### Short summary: 

expected identifier; obtained def