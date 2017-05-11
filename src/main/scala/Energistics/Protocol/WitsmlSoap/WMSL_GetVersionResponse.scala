/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.WitsmlSoap

import scala.annotation.switch

case class WMSL_GetVersionResponse(var Result: String) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this("")
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        Result
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.Result = {
        value.toString
      }.asInstanceOf[String]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = WMSL_GetVersionResponse.SCHEMA$
}

object WMSL_GetVersionResponse {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"WMSL_GetVersionResponse\",\"namespace\":\"Energistics.Protocol.WitsmlSoap\",\"fields\":[{\"name\":\"Result\",\"type\":\"string\"}],\"messageType\":\"12\",\"protocol\":\"8\",\"senderRole\":\"store\",\"protocolRoles\":\"store,customer\"}")
}