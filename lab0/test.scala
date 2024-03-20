
  def main(args: Array[String]) = {
    val tab = for i <- 1 to 10 yield i
    val tab2 = for x <- tab; if x % 2 == 0 yield (Math.pow(x, 2).toInt)
    // println(tab2)
    val matrix = for i <- 0 to 4; j <- 0 to 4; if i > j do
      println(s"i: $i j:$j ")
    println(factorial(5))
  }

  def factorial(n: Int): Int = {
    if (n <= 1)
      1
    else
      factorial(n - 1) * n
  }
