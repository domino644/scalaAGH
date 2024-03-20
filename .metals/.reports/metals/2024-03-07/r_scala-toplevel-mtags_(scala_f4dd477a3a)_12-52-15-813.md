error id: file://<WORKSPACE>/lab0/test.scala:[8..11) in Input.VirtualFile("file://<WORKSPACE>/lab0/test.scala", "object 
def main(args: Array[String]) = {
  val tab = for i <- 1 to 10 yield i
  val tab2 = for x <- tab; if x % 2 == 0 yield (Math.pow(x, 2).toInt)
  // println(tab2)
  val matrix = for i <- 0 to 4; j <- 0 to 4; if i > j do println(s"i: $i j:$j ")
}

def
")
file://<WORKSPACE>/lab0/test.scala
file://<WORKSPACE>/lab0/test.scala:2: error: expected identifier; obtained def
def main(args: Array[String]) = {
^
#### Short summary: 

expected identifier; obtained def