class Date {
  val months_to_days = Map(1 -> 31, 2 -> 28, 3 -> 31, 4 -> 30, 5 -> 31, 6 -> 30, 7 -> 31, 8 -> 31, 9 -> 30, 10 -> 31, 11 -> 30, 12 -> 31)
  val months_to_numb = Map("January" -> 1, "February" -> 2, "March" -> 3, "April" -> 4,"May" -> 5,"June" -> 6,"July" -> 7,"August" -> 8,"September" -> 9,"October" -> 10,"November" -> 11,"December" -> 12)
  def Date(day: Int, month: Int, year: Int) {
    
  }
  
  def isLeapYear(year: Int): Boolean ={
    return if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {true} else {false}
  }
  
  def daysInMonth(month: Int, year: Int): Int ={
    return if (isLeapYear(year)) {29} else {months_to_days(month)}
  }
  
  def isValidDate(day: Int, month: Int, year: Int): Boolean ={
    return if (day < daysInMonth(month, year) && year > 1) {true} else {false}
  }
}


class DateTest {
  def main() {
    println(Date.isLeapYear(1600))
    //Should be true
    println(Date.isLeapYear(1100))
    //Should be false
    for (i <- 1 to 12) {
      println(Date.daysInMonth(i, 1100))
    }
    //Should be the days of each month, 28 for february.
    for (i <- 1 to 12) {
      println(Date.daysInMonth(i, 1600))
    }
    //Should be the days of each month, 29 for february
    println(Date.isValidDate(16, 8, 2014))
    //Should be true
    println(Date.isValidDate(16, 8, 0))
    //Should be false
    println(Date.isValidDate(29, 2, 1100))
    //Should be false
    println(Date.isValidDate(29, 2, 1600))
    //Should be true
  }
}
