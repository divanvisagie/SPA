package com.example

import scala.annotation.tailrec
import org.json4s._
import org.json4s.native.Serialization
import org.json4s.native.Serialization.{read, write}

case class InMessage(val number: Int)
case class OutMessage(val answer: Int)

class Handler extends IRPCHandler {
  implicit val formats = Serialization.formats(NoTypeHints)
  def fibonacci(n :Int) : Int = {
    @tailrec
    def fib(n : Int, next :Int, acc :Int) :Int = {
      if(n == 0) acc
      else fib(n-1, acc + next,next)
    }
    fib(n,1,0)
  }

  def handleMessage(message: String): String = {
    val inMessage = read[InMessage](message)
    val answer = fibonacci(inMessage.number)
    write(OutMessage(answer))
  }
}

object Hello {
  def main(args: Array[String]): Unit = {
    val rpcServer = new RPCServer("fibonacci",new Handler())
    println("Start listening")
    rpcServer.listen()
  }
}
