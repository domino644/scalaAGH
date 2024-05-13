def sumArrayRec3(elems: Array[Int]): Int =
  def goFrom(i: Int, size: Int, elms: Array[Int]): Int =
    if (i < size) elms(i) + goFrom(i + 1, size, elms)
    else 0
  goFrom(0, elems.length, elems)

@main def ex43_01(): Unit =
  println("sumArrayRec3 = " + sumArrayRec3((0 until 50000).toArray))

def testFn(elems: Array[Int]): Int =
  def goFrom(i: Int, size: Int, elms: Array[Int]): Int =
    elms(0) += 1
    if (i < size) elms(0) + goFrom(i + 1, size, elms)
    else 0
  goFrom(0, Int.MaxValue, elems)

@main def ex43_02(): Unit =
  val testArr = Array(0)
  try testFn(testArr)
  catch
    case e: StackOverflowError =>
      println("rec-depth = " + testArr(0))

  val arr2Sum = Array.fill((0.8 * testArr(0)).toInt)(1)
  println("sumArrayRec3 = " + sumArrayRec3(arr2Sum))
