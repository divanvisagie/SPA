package com.eepa.consumer

import com.eepa.DomainMessage
import com.eepa.consumer.java.IRPCHandler
import org.json4s._
import org.json4s.native.Serialization
import org.json4s.native.Serialization.{read, write}

class RawHandler[T](handler: (T) => DomainMessage)(implicit m: Manifest[T]) extends IRPCHandler {
  implicit val formats = Serialization.formats(NoTypeHints)

  def handleMessage(message: String): String = {

    val inMessage = read[T](message)
    val msg = handler(inMessage)
    write(msg)
  }

}
