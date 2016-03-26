package com.fibonacci

import com.eepa.consumer.Listener

object FibonacciService {

  def main(args: Array[String]): Unit = {

    val recursiveMath = RecursiveMath()

    Listener().listen[InDomainMessage]("fibonacci", inMessage => {

      val fibAnswer = recursiveMath.fibonacci(inMessage.number)
      OutDomainMessage(fibAnswer)
    })
  }
}
