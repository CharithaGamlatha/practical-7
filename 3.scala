object Main extends App {
  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else if (n % 2 == 0) false
    else {
      val sqrtN = math.sqrt(n).toInt
      !(3 to sqrtN by 2).exists(x => n % x == 0)
    }
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(isPrime)
  }

  def getUserInput(): List[Int] = {
    println("Enter numbers separated by spaces:")
    val input = scala.io.StdIn.readLine()
    input.split("\\s+").map(_.toInt).toList
  }

  val nums = getUserInput()
  val primes = filterPrime(nums)
  println(s"Prime numbers: $primes")
}
