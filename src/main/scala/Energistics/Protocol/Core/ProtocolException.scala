/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.Core

import scala.annotation.switch

case class ProtocolException(var errorCode: Int, var errorMessage: String) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(0, "")
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        errorCode
      }.asInstanceOf[AnyRef]
      case 1 => {
        errorMessage
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.errorCode = {
        value
      }.asInstanceOf[Int]
      case 1 => this.errorMessage = {
        value.toString
      }.asInstanceOf[String]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = ProtocolException.SCHEMA$
}

object ProtocolException {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ProtocolException\",\"namespace\":\"Energistics.Protocol.Core\",\"fields\":[{\"name\":\"errorCode\",\"type\":\"int\"},{\"name\":\"errorMessage\",\"type\":\"string\"}],\"messageType\":\"1000\",\"protocol\":\"0\",\"senderRole\":\"*\",\"protocolRoles\":\"client,server\"}")
}