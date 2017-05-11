/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.ChannelStreaming

import scala.annotation.switch

import Energistics.Datatypes.ChannelData.ChannelStatuses

case class ChannelStatusChange(var channelId: Long, var status: ChannelStatuses) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(0L, null)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        channelId
      }.asInstanceOf[AnyRef]
      case 1 => {
        status
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.channelId = {
        value
      }.asInstanceOf[Long]
      case 1 => this.status = {
        value
      }.asInstanceOf[ChannelStatuses]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = ChannelStatusChange.SCHEMA$
}

object ChannelStatusChange {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ChannelStatusChange\",\"namespace\":\"Energistics.Protocol.ChannelStreaming\",\"fields\":[{\"name\":\"channelId\",\"type\":\"long\"},{\"name\":\"status\",\"type\":{\"type\":\"enum\",\"name\":\"ChannelStatuses\",\"namespace\":\"Energistics.Datatypes.ChannelData\",\"symbols\":[\"Active\",\"Inactive\",\"Closed\"]}}],\"messageType\":\"10\",\"protocol\":\"1\",\"senderRole\":\"producer\",\"protocolRoles\":\"producer,consumer\"}")
}