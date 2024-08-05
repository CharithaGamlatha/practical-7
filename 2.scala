object Main extends App {
  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(n => n * n)
  }

  // Function to get user input and convert it to a List[Int]
  def getUserInput(): List[Int] = {
    println("Enter numbers separated by spaces:")
    val input = scala.io.StdIn.readLine()
    input.split(" ").map(_.toInt).toList
  }

  // Main program
  val nums = getUserInput()
  val squares = calculateSquare(nums)
  println(s"Squares of the input numbers: $squares")
}
