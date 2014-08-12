class Date {
  val months_to_days = Map(1 -> 31, 2 -> 28, 3 -> 31, 4 -> 30, 5 -> 31, 6 -> 30, 7 -> 31, 8 -> 31, 9 -> 30, 10 -> 31, 11 -> 30, 12 -> 31)
  val months_to_numb = Map("January" -> 1, "February" -> 2, "March" -> 3, "April" -> 4,"May" -> 5,"June" -> 6,"July" -> 7,"August" -> 8,"September" -> 9,"October" -> 10,"November" -> 11,"December" -> 12)
  def Date(day: Int, month: Int, year: Int) {
    
  }
  
  def isLeapYear(year: Int): Boolean {
    return if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {true} else {false}
  }
  
  def daysInMonth(month: Int, year: Int): Int {
    return if (isLeapYear(year)) {29} else {months_to_days(month)}
  }
  
  def isValidDate(day: Int, month: Int, year: Int) Boolean {
    return if (day < daysInMonth(month, year) && year > 1) {true} else {false}
  }
}
