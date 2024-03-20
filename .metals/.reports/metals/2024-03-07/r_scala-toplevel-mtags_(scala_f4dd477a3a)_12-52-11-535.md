error id: file://<WORKSPACE>/lab0/test.scala:[249..249) in Input.VirtualFile("file://<WORKSPACE>/lab0/test.scala", "
def main(args: Array[String]) = {
  val tab = for i <- 1 to 10 yield i
  val tab2 = for x <- tab; if x % 2 == 0 yield (Math.pow(x, 2).toInt)
  // println(tab2)
  val matrix = for i <- 0 to 4; j <- 0 to 4; if i > j do println(s"i: $i j:$j ")
}

def
")
file://<WORKSPACE>/lab0/test.scala
file://<WORKSPACE>/lab0/test.scala:10: error: expected identifier; obtained eof

^
#### Short summary: 

expected identifier; obtained eof