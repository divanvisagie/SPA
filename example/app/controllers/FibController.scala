package controllers

/**
  * Created by divanvisagie on 2016/03/23.
  */

import javax.inject._
import play.api._
import play.api.mvc._
import services.ServiceClient

@Singleton
class FibController @Inject() (serviceClient: ServiceClient) extends Controller {

  def fib = Action {
    val ans = serviceClient.getFib(40)
    Ok(ans)
  }

}