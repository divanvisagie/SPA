package com.eepa.client

import com.eepa.DomainMessage
import com.eepa.client.java.RPCClient
import org.json4s.NoTypeHints
import org.json4s.native.Serialization
import org.json4s.native.Serialization._

class Client(queue: String) {
  implicit val formats = Serialization.formats(NoTypeHints)

  val rpcClient = new RPCClient(queue)

  def call[T](x: DomainMessage)(implicit m: Manifest[T]): T = {
    val queueName = x.getClass.getSimpleName.toLowerCase
    val rpcClient = new RPCClient(queueName)
    val ans = rpcClient.call(write(x))
    read[T](ans)
  }

}
object Client  {
  def apply(queue: String) = new Client(queue)
}