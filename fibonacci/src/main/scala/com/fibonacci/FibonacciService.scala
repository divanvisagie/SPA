package com.fibonacci

object FibonacciService {
  def main(args: Array[String]): Unit = {
    val rpcServer = new RPCServer("fibonacci",new Handler())
    println("Start listening")
    rpcServer.listen()
  }
}
