package controllers

/**
  * Created by divanvisagie on 2016/03/23.
  */

import javax.inject._

import messages.{Fibonacci, MathAnswer}
import play.api.mvc._
import services.ServiceClient


@Singleton
class FibController @Inject() (serviceClient: ServiceClient) extends Controller {

  def fib(number: Int) = Action {
    val ans = serviceClient.call[MathAnswer](Fibonacci(number))
    Ok(ans.answer.toString)
  }

}