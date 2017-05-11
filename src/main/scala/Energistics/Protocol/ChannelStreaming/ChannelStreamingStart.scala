/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.ChannelStreaming

import scala.annotation.switch

import Energistics.Datatypes.ChannelData.{ChannelStreamingInfo, StreamingStartIndex}

case class ChannelStreamingStart(var channels: List[ChannelStreamingInfo]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(List.empty)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        scala.collection.JavaConverters.bufferAsJavaListConverter({
          channels map { x =>
            x
          }
        }.toBuffer).asJava
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.channels = {
        value match {
          case (array: java.util.List[_]) => {
            List((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
              x
            }: _*))
          }
        }
      }.asInstanceOf[List[ChannelStreamingInfo]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = ChannelStreamingStart.SCHEMA$
}

object ChannelStreamingStart {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ChannelStreamingStart\",\"namespace\":\"Energistics.Protocol.ChannelStreaming\",\"fields\":[{\"name\":\"channels\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ChannelStreamingInfo\",\"namespace\":\"Energistics.Datatypes.ChannelData\",\"fields\":[{\"name\":\"channelId\",\"type\":\"long\"},{\"name\":\"startIndex\",\"type\":{\"type\":\"record\",\"name\":\"StreamingStartIndex\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"int\",\"long\"]}]}},{\"name\":\"receiveChangeNotification\",\"type\":\"boolean\"}]}}}],\"messageType\":\"4\",\"protocol\":\"1\",\"senderRole\":\"consumer\",\"protocolRoles\":\"producer,consumer\"}")
}