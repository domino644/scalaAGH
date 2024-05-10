def checkPredicate(
    pred: Boolean,
    predAsString: String,
    prefix: String = "Checking if "
): Unit =
  if (pred) println(prefix + predAsString + ": OK")
  else println(prefix + predAsString + ": Fail")

def sumArrayIter(elems: Array[Int]): Int =
  var sum = 0
  for (i <- elems) sum += i
  sum

def sumArrayRec1(i: Int, elems: Array[Int]): Int =
  if (i < elems.length) elems(i) + sumArrayRec1(i + 1, elems)
  else 0

def sumArrayRec2(elems: Array[Int]): Int =
  val size = elems.size
  def goFrom(i: Int): Int =
    if (i < size) elems(i) + goFrom(i + 1)
    else 0
  goFrom(0)

def sumSqrArrayIter(elems: Array[Int]): Int =
  var sum = 0
  for (i <- elems) sum += i * i
  sum

def sumSqrArrayRec1(i: Int, elems: Array[Int]): Int =
  if (i < elems.length) elems(i) * elems(i) + sumSqrArrayRec1(i + 1, elems)
  else 0

def sumSqrArrayRec2(elems: Array[Int]): Int =
  val size = elems.size
  def goFrom(i: Int): Int =
    if (i < size) elems(i) * elems(i) + goFrom(i + 1)
    else 0
  goFrom(0)

def prodArrayIter(elems: Array[Int]): Int =
  var sum = 1
  for (i <- elems) sum *= i
  sum

def prodArrayRec1(i: Int, elems: Array[Int]): Int =
  if (i < elems.length) elems(i) * prodArrayRec1(i + 1, elems)
  else 1

def prodArrayRec2(elems: Array[Int]): Int =
  val size = elems.size
  def goFrom(i: Int): Int =
    if (i < size) elems(i) * goFrom(i + 1)
    else 1
  goFrom(0)

def sumAbsArrayIter(elems: Array[Int]): Int =
  var sum = 0
  for (i <- elems) sum += i.abs
  sum

def sumAbsArrayRec1(i: Int, elems: Array[Int]): Int =
  if (i < elems.length) elems(i).abs + sumAbsArrayRec1(i + 1, elems)
  else 0

def sumAbsArrayRec2(elems: Array[Int]): Int =
  val size = elems.size
  def goFrom(i: Int): Int =
    if (i < size) elems(i).abs + goFrom(i + 1)
    else 0
  goFrom(0)

def sumArrayWithIter(elems: Array[Int], fun: (Int) => Int): Int =
  var sum = 0
  for (i <- elems) sum += fun(i)
  sum

def sumTwoDimIter(elems: Array[Array[Int]]): Int =
  var sum = 0
  for (row <- elems) for (el <- row) sum += el
  sum

@main def ex42_01(): Unit =
  val a1To5 = (1 to 5).toArray
  val twoDim = Array.fill[Int](3, 3)(1)
  println("Testing with a1To5 = " + a1To5.mkString("Array(", ", ", ") ..."))
  val expectResult = 15
  val expectResultSqr = 55
  val expectResultProd = 120
  val expectResultAbs = 15
  val expectResultTwoDim = 9

  checkPredicate(
    sumArrayIter(a1To5) == expectResult,
    "sumArrayIter(0, a1To5) == " + expectResult
  )

  checkPredicate(
    sumArrayRec1(0, a1To5) == expectResult,
    "sumArrayRec1(0, a1To5) == " + expectResult
  )

  checkPredicate(
    sumArrayRec2(a1To5) == expectResult,
    "sumArrayRec2(a1To5) == " + expectResult
  )

  checkPredicate(
    sumSqrArrayIter(a1To5) == expectResultSqr,
    "sumSqrArrayIter(a1To5) == " + expectResultSqr
  )

  checkPredicate(
    sumSqrArrayRec1(0, a1To5) == expectResultSqr,
    "sumSqrArrayRec1(0, a1To5) == " + expectResultSqr
  )

  checkPredicate(
    sumSqrArrayRec2(a1To5) == expectResultSqr,
    "sumSqrArrayRec2(a1To5) == " + expectResultSqr
  )

  checkPredicate(
    prodArrayIter(a1To5) == expectResultProd,
    "prodArrayIter(a1To5) == " + expectResultProd
  )

  checkPredicate(
    prodArrayRec1(0, a1To5) == expectResultProd,
    "prodArrayRec1(0, a1To5) == " + expectResultProd
  )

  checkPredicate(
    prodArrayRec2(a1To5) == expectResultProd,
    "prodArrayRec2(a1To5) == " + expectResultProd
  )

  checkPredicate(
    sumAbsArrayIter(a1To5) == expectResultAbs,
    "sumAbsArrayIter(a1To5) == " + expectResultAbs
  )

  checkPredicate(
    sumAbsArrayRec1(0, a1To5) == expectResultAbs,
    "sumAbsArrayRec1(0, a1To5) == " + expectResultAbs
  )

  checkPredicate(
    sumAbsArrayRec2(a1To5) == expectResultAbs,
    "sumAbsArrayRec2(a1To5) == " + expectResultAbs
  )

  checkPredicate(
    sumArrayWithIter(a1To5, (x: Int) => x * x) == expectResultSqr,
    "sumArrayWithIter(a1To5, (x: Int) => x * x) == " + expectResultSqr
  )

  checkPredicate(
    sumTwoDimIter(twoDim) == expectResultTwoDim,
    "sumTwoDimIter(twoDim) == " + expectResultTwoDim
  )
