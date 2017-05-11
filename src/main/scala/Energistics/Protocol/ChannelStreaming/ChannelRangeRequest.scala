/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.ChannelStreaming

import scala.annotation.switch

import Energistics.Datatypes.ChannelData.ChannelRangeInfo

case class ChannelRangeRequest(var channelRanges: List[ChannelRangeInfo]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(List.empty)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        scala.collection.JavaConverters.bufferAsJavaListConverter({
          channelRanges map { x =>
            x
          }
        }.toBuffer).asJava
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.channelRanges = {
        value match {
          case (array: java.util.List[_]) => {
            List((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
              x
            }: _*))
          }
        }
      }.asInstanceOf[List[ChannelRangeInfo]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = ChannelRangeRequest.SCHEMA$
}

object ChannelRangeRequest {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ChannelRangeRequest\",\"namespace\":\"Energistics.Protocol.ChannelStreaming\",\"fields\":[{\"name\":\"channelRanges\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ChannelRangeInfo\",\"namespace\":\"Energistics.Datatypes.ChannelData\",\"fields\":[{\"name\":\"channelId\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"startIndex\",\"type\":\"long\"},{\"name\":\"endIndex\",\"type\":\"long\"}]}}}],\"messageType\":\"9\",\"protocol\":\"1\",\"senderRole\":\"consumer\",\"protocolRoles\":\"producer,consumer\"}")
}