/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.GrowingObject

import scala.annotation.switch

case class ObjectFragment(var uri: String, var contentType: String, var contentEncoding: String, var data: Array[Byte]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this("", "", "", null)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        uri
      }.asInstanceOf[AnyRef]
      case 1 => {
        contentType
      }.asInstanceOf[AnyRef]
      case 2 => {
        contentEncoding
      }.asInstanceOf[AnyRef]
      case 3 => {
        java.nio.ByteBuffer.wrap(data)
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.uri = {
        value.toString
      }.asInstanceOf[String]
      case 1 => this.contentType = {
        value.toString
      }.asInstanceOf[String]
      case 2 => this.contentEncoding = {
        value.toString
      }.asInstanceOf[String]
      case 3 => this.data = {
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
  def getSchema: org.apache.avro.Schema = ObjectFragment.SCHEMA$
}

object ObjectFragment {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ObjectFragment\",\"namespace\":\"Energistics.Protocol.GrowingObject\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"contentType\",\"type\":\"string\"},{\"name\":\"contentEncoding\",\"type\":\"string\"},{\"name\":\"data\",\"type\":\"bytes\"}],\"messageType\":\"6\",\"protocol\":\"6\",\"senderRole\":\"store\",\"protocolRoles\":\"store,customer\"}")
}