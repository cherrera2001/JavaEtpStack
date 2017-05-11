/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.GrowingObject

import scala.annotation.switch

case class GrowingObjectDelete(var uri: String, var uid: String) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this("", "")
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        uri
      }.asInstanceOf[AnyRef]
      case 1 => {
        uid
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.uri = {
        value.toString
      }.asInstanceOf[String]
      case 1 => this.uid = {
        value.toString
      }.asInstanceOf[String]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = GrowingObjectDelete.SCHEMA$
}

object GrowingObjectDelete {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GrowingObjectDelete\",\"namespace\":\"Energistics.Protocol.GrowingObject\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"uid\",\"type\":\"string\"}],\"messageType\":\"1\",\"protocol\":\"6\",\"senderRole\":\"customer\",\"protocolRoles\":\"store,customer\"}")
}