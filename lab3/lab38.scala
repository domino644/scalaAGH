package p1:
  class C1:
    println("C1")

    def m1C1(): Unit =
      println("m1C1()")
  package p2:
    class C21:
      println("C21")

    class C22:
      println("C22")

    class C23:
      println("C23")

    object C2:
      def m10C2(): Unit =
        println("m10C2")
      def m20C2(c1: C1): Unit =
        import c1.*
        println("m20C2")
        m1C1()
import p1.p2.C2.*

@main def ex03_01(): Unit =
  import p1.*
  new C1
  import p2.{C21, C22 => MyC22, C23 => _}
  new C21
  new MyC22
  m10C2()
  m20C2(new C1)
