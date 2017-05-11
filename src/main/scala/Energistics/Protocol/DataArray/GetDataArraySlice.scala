/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.DataArray

import scala.annotation.switch

case class GetDataArraySlice(var uri: String, var start: List[Long], var count: List[Long]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this("", List.empty, List.empty)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        uri
      }.asInstanceOf[AnyRef]
      case 1 => {
        scala.collection.JavaConverters.bufferAsJavaListConverter({
          start map { x =>
            x
          }
        }.toBuffer).asJava
      }.asInstanceOf[AnyRef]
      case 2 => {
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
      case 1 => this.start = {
        value match {
          case (array: java.util.List[_]) => {
            List((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
              x
            }: _*))
          }
        }
      }.asInstanceOf[List[Long]]
      case 2 => this.count = {
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
  def getSchema: org.apache.avro.Schema = GetDataArraySlice.SCHEMA$
}

object GetDataArraySlice {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GetDataArraySlice\",\"namespace\":\"Energistics.Protocol.DataArray\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"start\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"count\",\"type\":{\"type\":\"array\",\"items\":\"long\"}}],\"messageType\":\"3\",\"protocol\":\"7\",\"senderRole\":\"customer\",\"protocolRoles\":\"store,customer\"}")
}