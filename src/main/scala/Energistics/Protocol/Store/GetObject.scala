/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.Store

import scala.annotation.switch

case class GetObject(var uri: String) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this("")
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        uri
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.uri = {
        value.toString
      }.asInstanceOf[String]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = GetObject.SCHEMA$
}

object GetObject {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GetObject\",\"namespace\":\"Energistics.Protocol.Store\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"}],\"messageType\":\"1\",\"protocol\":\"4\",\"senderRole\":\"customer\",\"protocolRoles\":\"store,customer\"}")
}