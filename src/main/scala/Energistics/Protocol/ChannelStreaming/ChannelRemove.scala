/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.ChannelStreaming

import scala.annotation.switch

case class ChannelRemove(var channelId: Long, var removeReason: Option[String]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(0L, None)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        channelId
      }.asInstanceOf[AnyRef]
      case 1 => {
        removeReason match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.channelId = {
        value
      }.asInstanceOf[Long]
      case 1 => this.removeReason = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = ChannelRemove.SCHEMA$
}

object ChannelRemove {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ChannelRemove\",\"namespace\":\"Energistics.Protocol.ChannelStreaming\",\"fields\":[{\"name\":\"channelId\",\"type\":\"long\"},{\"name\":\"removeReason\",\"type\":[\"null\",\"string\"]}],\"messageType\":\"8\",\"protocol\":\"1\",\"senderRole\":\"producer\",\"protocolRoles\":\"producer,consumer\"}")
}