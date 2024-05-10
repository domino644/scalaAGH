package p1

package p11 {
  private[p1] class C1:
    protected[p1] def protP1MC1(): Unit =
      print("[protP1MC1]: ")
      privP11MC1()

    private[p1] def privP1MC1(): Unit =
      print("[privP1MC1]: ")
      privP11MC1()

    private[p11] def privP11MC1(): Unit =
      print("[privP11MC1]: ")
      println((new C11).a13)

    protected[p11] def protP11MC1(): Unit =
      print("[protP11MC1]: ")
      privP11MC1()

    private[C1] var a11 = 11
    private val a12 = 12 // private[this] will be deprecated in the future

    private class C11:
      private[C1] val a13 = 13

    override def equals(other: Any): Boolean = other match
      case that: C1 => (this.a11 == that.a11) && (this.a12 == that.a12)
      case _        => false
}

package p12 {
  import p11.*

  object O1:
    private[p12] val ao1 = new C1

  class C12 extends C1:
    def mC121(): Unit =
      print("[mC121]: ");
      super.protP11MC1()

    def mC122(): Unit =
      print("[mC122]: ")
    //   super.privP11MC1() // (1)
}

@main def ex07(): Unit =
  val c1 = new p11.C1
  c1.protP1MC1()
  c1.privP1MC1()
  val c12 = new p12.C12
  c12.mC121()
