/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Datatypes.Object

import scala.annotation.switch

case class DataObject(var resource: Resource, var contentEncoding: String, var data: Array[Byte]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(new Resource, "", null)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        resource
      }.asInstanceOf[AnyRef]
      case 1 => {
        contentEncoding
      }.asInstanceOf[AnyRef]
      case 2 => {
        java.nio.ByteBuffer.wrap(data)
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.resource = {
        value
      }.asInstanceOf[Resource]
      case 1 => this.contentEncoding = {
        value.toString
      }.asInstanceOf[String]
      case 2 => this.data = {
        value match {
          case (buffer: java.nio.ByteBuffer) => {
            buffer.array()
          }
        }
      }.asInstanceOf[Array[Byte]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = DataObject.SCHEMA$
}

object DataObject {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DataObject\",\"namespace\":\"Energistics.Datatypes.Object\",\"fields\":[{\"name\":\"resource\",\"type\":{\"type\":\"record\",\"name\":\"Resource\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"contentType\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"channelSubscribable\",\"type\":\"boolean\"},{\"name\":\"customData\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"hasChildren\",\"type\":\"int\"},{\"name\":\"uuid\",\"type\":[\"null\",\"string\"]},{\"name\":\"lastChanged\",\"type\":\"long\"},{\"name\":\"objectNotifiable\",\"type\":\"boolean\"}]}},{\"name\":\"contentEncoding\",\"type\":\"string\"},{\"name\":\"data\",\"type\":\"bytes\"}]}")
}