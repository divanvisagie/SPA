package services

import com.eepa.client.Client
import messages.{Fibonacci, MathAnswer}

/**
  * Created by divanvisagie on 2016/03/26.
  */

class FibonacciService  {
  val client = Client("fibonacci")

  def fib(n: Int): Int = {
    client.call[MathAnswer](Fibonacci(n)).answer
  }
}
