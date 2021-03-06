/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.DataArray

import scala.annotation.switch

import Energistics.Datatypes.{AnyArray, ArrayOfBoolean, ArrayOfInt, ArrayOfLong, ArrayOfFloat, ArrayOfDouble}

case class PutDataArraySlice(var uri: String, var data: AnyArray, var dimensions: List[Long], var start: List[Long], var count: List[Long]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this("", new AnyArray, List.empty, List.empty, List.empty)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        uri
      }.asInstanceOf[AnyRef]
      case 1 => {
        data
      }.asInstanceOf[AnyRef]
      case 2 => {
        scala.collection.JavaConverters.bufferAsJavaListConverter({
          dimensions map { x =>
            x
          }
        }.toBuffer).asJava
      }.asInstanceOf[AnyRef]
      case 3 => {
        scala.collection.JavaConverters.bufferAsJavaListConverter({
          start map { x =>
            x
          }
        }.toBuffer).asJava
      }.asInstanceOf[AnyRef]
      case 4 => {
        scala.collection.JavaConverters.bufferAsJavaListConverter({
          count map { x =>
            x
          }
        }.toBuffer).asJava
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.uri = {
        value.toString
      }.asInstanceOf[String]
      case 1 => this.data = {
        value
      }.asInstanceOf[AnyArray]
      case 2 => this.dimensions = {
        value match {
          case (array: java.util.List[_]) => {
            List((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
              x
            }: _*))
          }
        }
      }.asInstanceOf[List[Long]]
      case 3 => this.start = {
        value match {
          case (array: java.util.List[_]) => {
            List((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
              x
            }: _*))
          }
        }
      }.asInstanceOf[List[Long]]
      case 4 => this.count = {
        value match {
          case (array: java.util.List[_]) => {
            List((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
              x
            }: _*))
          }
        }
      }.asInstanceOf[List[Long]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = PutDataArraySlice.SCHEMA$
}

object PutDataArraySlice {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PutDataArraySlice\",\"namespace\":\"Energistics.Protocol.DataArray\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"data\",\"type\":{\"type\":\"record\",\"name\":\"AnyArray\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ArrayOfBoolean\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"boolean\"}}]},\"bytes\",{\"type\":\"record\",\"name\":\"ArrayOfInt\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"int\"}}]},{\"type\":\"record\",\"name\":\"ArrayOfLong\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"long\"}}]},{\"type\":\"record\",\"name\":\"ArrayOfFloat\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"float\"}}]},{\"type\":\"record\",\"name\":\"ArrayOfDouble\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]}]}]}},{\"name\":\"dimensions\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"start\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"count\",\"type\":{\"type\":\"array\",\"items\":\"long\"}}],\"messageType\":\"5\",\"protocol\":\"7\",\"senderRole\":\"customer\",\"protocolRoles\":\"store,customer\"}")
}