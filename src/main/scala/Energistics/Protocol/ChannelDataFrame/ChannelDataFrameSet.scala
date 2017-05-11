/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.ChannelDataFrame

import scala.annotation.switch

import Energistics.Datatypes.{DataValue, ArrayOfDouble}

import Energistics.Datatypes.ChannelData.DataFrame

case class ChannelDataFrameSet(var channels: List[Long], var data: List[DataFrame]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(List.empty, List.empty)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        scala.collection.JavaConverters.bufferAsJavaListConverter({
          channels map { x =>
            x
          }
        }.toBuffer).asJava
      }.asInstanceOf[AnyRef]
      case 1 => {
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
      case 0 => this.channels = {
        value match {
          case (array: java.util.List[_]) => {
            List((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
              x
            }: _*))
          }
        }
      }.asInstanceOf[List[Long]]
      case 1 => this.data = {
        value match {
          case (array: java.util.List[_]) => {
            List((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
              x
            }: _*))
          }
        }
      }.asInstanceOf[List[DataFrame]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = ChannelDataFrameSet.SCHEMA$
}

object ChannelDataFrameSet {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ChannelDataFrameSet\",\"namespace\":\"Energistics.Protocol.ChannelDataFrame\",\"fields\":[{\"name\":\"channels\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"data\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"DataFrame\",\"namespace\":\"Energistics.Datatypes.ChannelData\",\"fields\":[{\"name\":\"index\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"data\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"DataValue\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"double\",\"float\",\"int\",\"long\",\"string\",{\"type\":\"record\",\"name\":\"ArrayOfDouble\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]},\"boolean\",\"bytes\"]}]}}}]}}}],\"messageType\":\"4\",\"protocol\":\"2\",\"senderRole\":\"producer\",\"protocolRoles\":\"producer,consumer\"}")
}