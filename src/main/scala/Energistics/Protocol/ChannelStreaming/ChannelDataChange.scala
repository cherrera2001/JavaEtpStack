/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.ChannelStreaming

import scala.annotation.switch

import Energistics.Datatypes.{DataValue, ArrayOfDouble, DataAttribute}

import Energistics.Datatypes.ChannelData.DataItem

case class ChannelDataChange(var channelId: Long, var startIndex: Long, var endIndex: Long, var data: List[DataItem]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(0L, 0L, 0L, List.empty)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        channelId
      }.asInstanceOf[AnyRef]
      case 1 => {
        startIndex
      }.asInstanceOf[AnyRef]
      case 2 => {
        endIndex
      }.asInstanceOf[AnyRef]
      case 3 => {
        scala.collection.JavaConverters.bufferAsJavaListConverter({
          data map { x =>
            x
          }
        }.toBuffer).asJava
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
      }.asInstanceOf[Long]
      case 2 => this.endIndex = {
        value
      }.asInstanceOf[Long]
      case 3 => this.data = {
        value match {
          case (array: java.util.List[_]) => {
            List((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
              x
            }: _*))
          }
        }
      }.asInstanceOf[List[DataItem]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = ChannelDataChange.SCHEMA$
}

object ChannelDataChange {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ChannelDataChange\",\"namespace\":\"Energistics.Protocol.ChannelStreaming\",\"fields\":[{\"name\":\"channelId\",\"type\":\"long\"},{\"name\":\"startIndex\",\"type\":\"long\"},{\"name\":\"endIndex\",\"type\":\"long\"},{\"name\":\"data\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"DataItem\",\"namespace\":\"Energistics.Datatypes.ChannelData\",\"fields\":[{\"name\":\"indexes\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"channelId\",\"type\":\"long\"},{\"name\":\"value\",\"type\":{\"type\":\"record\",\"name\":\"DataValue\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"double\",\"float\",\"int\",\"long\",\"string\",{\"type\":\"record\",\"name\":\"ArrayOfDouble\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]},\"boolean\",\"bytes\"]}]}},{\"name\":\"valueAttributes\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"DataAttribute\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"attributeId\",\"type\":\"int\"},{\"name\":\"attributeValue\",\"type\":\"DataValue\"}]}}}]}}}],\"messageType\":\"6\",\"protocol\":\"1\",\"senderRole\":\"producer\",\"protocolRoles\":\"producer,consumer\"}")
}