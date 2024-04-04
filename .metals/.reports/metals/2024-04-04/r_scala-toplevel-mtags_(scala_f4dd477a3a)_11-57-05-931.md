error id: file://<WORKSPACE>/lab3/lab31.scala:[844..845) in Input.VirtualFile("file://<WORKSPACE>/lab3/lab31.scala", "@main def ex01_1(): Unit =
  println("Opening the file...")
  val inFile = scala.io.Source.fromFile("logins.txt")
  for line <- inFile.getLines do println(line)
  println("Closing the file...")
  inFile.close()

@main def ex01_2(): Unit =
  try
    println("Opening the file...")
    val inFile = scala.io.Source.fromFile("logins.txt")
    for line <- inFile.getLines do println(line)
    println("Closing the file...")
    inFile.close()
  catch
    case ex: java.io.FileNotFoundException =>
      println(ex.getMessage())

@main def ex01_3(): Unit =
  try
    println("Opening the file...")
    val inFile = scala.io.Source.fromFile("logins.txt")
    for line <- inFile.getLines do println(line)
    println("Closing the file...")
    inFile.close()
  catch
    case ex: java.io.FileNotFoundException =>
      println(ex.getMessage())

def 

@main def ex01_4(): Unit =
  val inFile = scala.io.Source.fromFile("logins.txt")
")
file://<WORKSPACE>/lab3/lab31.scala
file://<WORKSPACE>/lab3/lab31.scala:32: error: expected identifier; obtained at
@main def ex01_4(): Unit =
^
#### Short summary: 

expected identifier; obtained at