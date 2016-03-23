package services

/**
  * Created by divanvisagie on 2016/03/23.
  */
class ServiceClient {

  val rpcClient = new RPCClient()

  def getFib(number: Int) : String = {
    rpcClient.call("30")
  }

}
