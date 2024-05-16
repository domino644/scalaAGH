class NumOps:
  def succ(a: Int) = a + 1
  def pred(a: Int) = a - 1
  def maxFrom3(d1: Double, d2: Double, d3: Double): Double = {
    if (d1 >= d2) {
      if (d1 >= d3) return d1
      return d3
    }
    if (d2 >= d3) {
      return d2
    }
    return d3
  }

class Succ extends Function1[Int, Int]:
  override def apply(a: Int) = a + 1

class Pred extends Function1[Int, Int]:
  override def apply(v1: Int): Int = v1 - 1

class MaxFrom3 extends Function3[Double, Double, Double, Double]:
  override def apply(d1: Double, d2: Double, d3: Double): Double = {
    if (d1 >= d2) {
      if (d1 >= d3) return d1
      return d3
    }
    if (d2 >= d3) {
      return d2
    }
    return d3
  }

@main def zad1(): Unit =
  val m = new MaxFrom3
  println(m(5, 5, 1))
