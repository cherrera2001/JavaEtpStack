/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.Discovery

import scala.annotation.switch

case class GetResources(var uri: String) extends org.apache.avro.specific.SpecificRecordBase {
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
  def getSchema: org.apache.avro.Schema = GetResources.SCHEMA$
}

object GetResources {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GetResources\",\"namespace\":\"Energistics.Protocol.Discovery\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"}],\"messageType\":\"1\",\"protocol\":\"3\",\"senderRole\":\"customer\",\"protocolRoles\":\"store,customer\"}")
}