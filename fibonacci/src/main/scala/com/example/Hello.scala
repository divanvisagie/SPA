package com.example

object Hello {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    var rpcServer = new RPCServer()
    rpcServer.listen()
  }
}
