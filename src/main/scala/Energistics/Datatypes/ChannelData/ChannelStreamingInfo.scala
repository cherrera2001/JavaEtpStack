/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Datatypes.ChannelData

import scala.annotation.switch

case class ChannelStreamingInfo(var channelId: Long, var startIndex: StreamingStartIndex, var receiveChangeNotification: Boolean) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(0L, new StreamingStartIndex, false)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        channelId
      }.asInstanceOf[AnyRef]
      case 1 => {
        startIndex
      }.asInstanceOf[AnyRef]
      case 2 => {
        receiveChangeNotification
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.channelId = {
        value
      }.asInstanceOf[Long]
      case 1 => this.startIndex = {
        value
      }.asInstanceOf[StreamingStartIndex]
      case 2 => this.receiveChangeNotification = {
        value
      }.asInstanceOf[Boolean]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = ChannelStreamingInfo.SCHEMA$
}

object ChannelStreamingInfo {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ChannelStreamingInfo\",\"namespace\":\"Energistics.Datatypes.ChannelData\",\"fields\":[{\"name\":\"channelId\",\"type\":\"long\"},{\"name\":\"startIndex\",\"type\":{\"type\":\"record\",\"name\":\"StreamingStartIndex\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"int\",\"long\"]}]}},{\"name\":\"receiveChangeNotification\",\"type\":\"boolean\"}]}")
}