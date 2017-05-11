/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.WitsmlSoap

import scala.annotation.switch

case class WMLS_GetBaseMsg(var ReturnValueIn: Int) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(0)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        ReturnValueIn
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.ReturnValueIn = {
        value
      }.asInstanceOf[Int]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = WMLS_GetBaseMsg.SCHEMA$
}

object WMLS_GetBaseMsg {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"WMLS_GetBaseMsg\",\"namespace\":\"Energistics.Protocol.WitsmlSoap\",\"fields\":[{\"name\":\"ReturnValueIn\",\"type\":\"int\"}],\"messageType\":\"5\",\"protocol\":\"8\",\"senderRole\":\"customer\",\"protocolRoles\":\"store,customer\"}")
}