object Appl44 {

  import scala.annotation.tailrec

  def sumArrayRec2(elems: Array[Int]): Int = {
    def goFrom(i: Int, size: Int, elms: Array[Int]): Int = {
      if (i < size) elms(i) + goFrom(i + 1, size, elms)
      else 0
    }

    goFrom(0, elems.length, elems)
  }

  private def sumArrayRec3(elems: Array[Int]): Int = {
    @tailrec
    def goFrom(i: Int, size: Int, elms: Array[Int], acc: Int): Int = {
      if (i < size) goFrom(i + 1, size, elms, acc + elms(i))
      else acc
    }

    goFrom(0, elems.length, elems, 0)
  }

  def main(args: Array[String]): Unit = {
    println(
      "sumArrayRec3 = " +
        sumArrayRec3((0 until 30000).toArray)
    )
  }
}