/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.Core

import scala.annotation.switch

case class CloseSession(var reason: Option[String]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(None)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        reason match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.reason = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = CloseSession.SCHEMA$
}

object CloseSession {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CloseSession\",\"namespace\":\"Energistics.Protocol.Core\",\"fields\":[{\"name\":\"reason\",\"type\":[\"null\",\"string\"]}],\"messageType\":\"5\",\"protocol\":\"0\",\"senderRole\":\"client,server\",\"protocolRoles\":\"client,server\"}")
}