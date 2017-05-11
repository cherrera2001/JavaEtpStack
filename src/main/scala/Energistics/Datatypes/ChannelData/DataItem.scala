/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Datatypes.ChannelData

import scala.annotation.switch

import Energistics.Datatypes.{DataValue, ArrayOfDouble, DataAttribute}

case class DataItem(var indexes: List[Long], var channelId: Long, var value: DataValue, var valueAttributes: List[DataAttribute]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(List.empty, 0L, new DataValue, List.empty)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        scala.collection.JavaConverters.bufferAsJavaListConverter({
          indexes map { x =>
            x
          }
        }.toBuffer).asJava
      }.asInstanceOf[AnyRef]
      case 1 => {
        channelId
      }.asInstanceOf[AnyRef]
      case 2 => {
        value
      }.asInstanceOf[AnyRef]
      case 3 => {
        scala.collection.JavaConverters.bufferAsJavaListConverter({
          valueAttributes map { x =>
            x
          }
        }.toBuffer).asJava
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.indexes = {
        value match {
          case (array: java.util.List[_]) => {
            List((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
              x
            }: _*))
          }
        }
      }.asInstanceOf[List[Long]]
      case 1 => this.channelId = {
        value
      }.asInstanceOf[Long]
      case 2 => this.value = {
        value
      }.asInstanceOf[DataValue]
      case 3 => this.valueAttributes = {
        value match {
          case (array: java.util.List[_]) => {
            List((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
              x
            }: _*))
          }
        }
      }.asInstanceOf[List[DataAttribute]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = DataItem.SCHEMA$
}

object DataItem {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DataItem\",\"namespace\":\"Energistics.Datatypes.ChannelData\",\"fields\":[{\"name\":\"indexes\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"channelId\",\"type\":\"long\"},{\"name\":\"value\",\"type\":{\"type\":\"record\",\"name\":\"DataValue\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"double\",\"float\",\"int\",\"long\",\"string\",{\"type\":\"record\",\"name\":\"ArrayOfDouble\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]},\"boolean\",\"bytes\"]}]}},{\"name\":\"valueAttributes\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"DataAttribute\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"attributeId\",\"type\":\"int\"},{\"name\":\"attributeValue\",\"type\":\"DataValue\"}]}}}]}")
}