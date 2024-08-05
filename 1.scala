object Main extends App {
  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(n => n % 2 == 0)
  }

  // Function to get user input and convert it to a List[Int]
  def getUserInput(): List[Int] = {
    println("Enter numbers separated by spaces:")
    val input = scala.io.StdIn.readLine()
    input.split(" ").map(_.toInt).toList
  }

  // Main program
  val nums = getUserInput()
  val evenNums = filterEvenNumbers(nums)
  println(s"Even numbers: $evenNums")
}
