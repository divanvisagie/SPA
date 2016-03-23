package messages

import services.DomainMessage

/**
  * Created by divanvisagie on 2016/03/23.
  */
case class Fibonacci(val number: Int) extends DomainMessage
case class MathAnswer(val answer: Int) extends DomainMessage