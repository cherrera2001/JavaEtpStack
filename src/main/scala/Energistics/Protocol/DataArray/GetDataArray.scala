/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.DataArray

import scala.annotation.switch

case class GetDataArray(var uri: String) extends org.apache.avro.specific.SpecificRecordBase {
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
  def getSchema: org.apache.avro.Schema = GetDataArray.SCHEMA$
}

object GetDataArray {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GetDataArray\",\"namespace\":\"Energistics.Protocol.DataArray\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"}],\"messageType\":\"2\",\"protocol\":\"7\",\"senderRole\":\"customer\",\"protocolRoles\":\"store,customer\"}")
}