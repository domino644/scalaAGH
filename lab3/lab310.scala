class Int2DVec2(val x: Int, val y: Int):
  override def equals(other: Any): Boolean =
    other match {
      case that: Int2DVec2 =>
        (this.x == that.x) && (this.y == that.y)
      case _ => false
    }
  override def hashCode(): Int = 41 * (41 + x) + y

def checkPredicate(pred: Boolean, predAsString: String): Unit =
  if (pred) println(predAsString + ": OK")
  else println(predAsString + ": Failed")

@main def ex06_1(): Unit =
  val v1 = new Int2DVec2(4, 5)
  val v2 = new Int2DVec2(4, 5)
  checkPredicate(v1.equals(v2), "v1.equals(v2)")
  checkPredicate(!(v1 eq v2), "!(v1 eq v2)")
  checkPredicate(v1 == v2, "v1 == v2")
