/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.ChannelStreaming

import scala.annotation.switch

import Energistics.Datatypes.{DataValue, ArrayOfDouble, DataAttribute}

import Energistics.Datatypes.ChannelData.DataItem

case class ChannelData(var data: List[DataItem]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(List.empty)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
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
      case 0 => this.data = {
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
  def getSchema: org.apache.avro.Schema = ChannelData.SCHEMA$
}

object ChannelData {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ChannelData\",\"namespace\":\"Energistics.Protocol.ChannelStreaming\",\"fields\":[{\"name\":\"data\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"DataItem\",\"namespace\":\"Energistics.Datatypes.ChannelData\",\"fields\":[{\"name\":\"indexes\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"channelId\",\"type\":\"long\"},{\"name\":\"value\",\"type\":{\"type\":\"record\",\"name\":\"DataValue\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"double\",\"float\",\"int\",\"long\",\"string\",{\"type\":\"record\",\"name\":\"ArrayOfDouble\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]},\"boolean\",\"bytes\"]}]}},{\"name\":\"valueAttributes\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"DataAttribute\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"attributeId\",\"type\":\"int\"},{\"name\":\"attributeValue\",\"type\":\"DataValue\"}]}}}]}}}],\"messageType\":\"3\",\"protocol\":\"1\",\"senderRole\":\"producer\",\"protocolRoles\":\"producer,consumer\"}")
}