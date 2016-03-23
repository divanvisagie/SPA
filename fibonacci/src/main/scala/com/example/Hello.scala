package com.example

import scala.annotation.tailrec
import org.json4s._
import org.json4s.native.Serialization
import org.json4s.native.Serialization.{read, write}

case class InMessage(val number: Int)
case class OutMessage(val answer: Int)

class Handler extends IRPCHandler {
  implicit val formats = Serialization.formats(NoTypeHints)
  def tailRecursiveBig(n :Int) : Int = {
    @tailrec
    def aux(n : Int, next :Int, acc :Int) :Int ={
      if(n == 0) acc
      else aux(n-1, acc + next,next)
    }
    aux(n,1,0)
  }

  def handleMessage(message: String): String = {
    val inMessage = read[InMessage](message)
    val answer = tailRecursiveBig(inMessage.number)
    write(OutMessage(answer))
  }
}

object Hello {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    var rpcServer = new RPCServer("fibonacci",new Handler())
    rpcServer.listen()
  }
}
