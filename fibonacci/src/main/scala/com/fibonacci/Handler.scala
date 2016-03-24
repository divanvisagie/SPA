package com.fibonacci

import org.json4s._
import org.json4s.native.Serialization
import org.json4s.native.Serialization.{read, write}

case class InMessage(val number: Int)
case class OutMessage(val answer: Int)

class Handler extends IRPCHandler {
  implicit val formats = Serialization.formats(NoTypeHints)

  val recursiveMath = RecursiveMath()
  def handleMessage(message: String): String = {

    val inMessage = read[InMessage](message)
    val answer = recursiveMath.fibonacci(inMessage.number)
    write(OutMessage(answer))
  }
}
