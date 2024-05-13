object Appl460 {
  enum WeekDay:
    case Mon, Tue, Wed, Thu, Fri, Sat, Sun

  import WeekDay.*

  def printDayName(day: WeekDay): Unit = {
    day match {
      case Mon => println("Monday")
      case Tue => println("Tuesday")
      case Wed => println("Wednesday")
      case Thu => println("Thursday")
      case Fri => println("Friday")
      case Sat => println("Saturday")
      case Sun => println("Sunday")
      case _   => println("What the he..?!")
    }
  }

  def main(args: Array[String]): Unit = {
    for (day <- WeekDay.values) println(day)
  }
}
