package com.eepa.consumer

import com.eepa.DomainMessage
import com.eepa.consumer.java.RPCServer



class Listener{

  def listen[T](queue: String, handler: (T) => DomainMessage)(implicit m: Manifest[T])  : RPCServer = {
    val rawHandler =  new RawHandler[T](handler)
    val rpcServer  = new RPCServer(queue, rawHandler)
    rpcServer.listen()
    rpcServer
  }
}

object Listener  {
  def apply() = new Listener()
}



