package com.fibonacci

import com.eepa.DomainMessage

case class InDomainMessage(val number: Int) extends DomainMessage
case class OutDomainMessage(val answer: Int) extends DomainMessage

