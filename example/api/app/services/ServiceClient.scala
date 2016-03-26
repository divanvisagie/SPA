package services

import org.json4s._
import org.json4s.native.Serialization
import org.json4s.native.Serialization.{read, write}


class ServiceClient {
  implicit val formats = Serialization.formats(NoTypeHints)

  val rpcClient = new RPCClient("fibonacci")

  def call[T](x: DomainMessage)(implicit m: Manifest[T]): T = {
    val queueName = x.getClass.getSimpleName.toLowerCase
    val rpcClient = new RPCClient(queueName)
    val ans = rpcClient.call(write(x))
    read[T](ans)
  }

}
