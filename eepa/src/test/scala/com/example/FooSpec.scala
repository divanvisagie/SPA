package com.example

import com.eepa.DomainMessage
import com.eepa.consumer.Listener
import org.scalatest.{MustMatchers, WordSpec}

import scala.annotation.tailrec


case class InMessage(val number: Int)
case class OutMessage(val answer: Int) extends DomainMessage
class FooSpec extends WordSpec with MustMatchers {

  def fibonacci(n :Int) : Int = {
    @tailrec
    def fib(n : Int, next :Int, acc :Int) :Int = {
      if(n == 0) acc
      else fib(n-1, acc + next,next)
    }
    fib(n,1,0)
  }

  "Listener" must {
    "process messages" in {

      Listener().listen[InMessage]("fibonacci", inMessage => {

        val fibAnswer = fibonacci(inMessage.number)
        OutMessage(fibAnswer)
      })
    }
  }

}