package messages

import com.eepa.DomainMessage


case class Fibonacci(val number: Int) extends DomainMessage
case class MathAnswer(val answer: Int) extends DomainMessage