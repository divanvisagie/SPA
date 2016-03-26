package controllers

import javax.inject._

import com.eepa.client.Client
import messages.{Fibonacci, MathAnswer}
import play.api.mvc._
import services.FibonacciService




@Singleton
class FibController @Inject() (fibonacciService: FibonacciService) extends Controller {

  def fib(number: Int) = Action {

    val answer = fibonacciService.fib(number)
    Ok(answer.toString)
  }

}