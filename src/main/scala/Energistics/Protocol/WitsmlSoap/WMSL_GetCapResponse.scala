/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.WitsmlSoap

import scala.annotation.switch

case class WMSL_GetCapResponse(var Result: Int, var CapabilitiesOut: String, var SuppMsgOut: String) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(0, "", "")
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        Result
      }.asInstanceOf[AnyRef]
      case 1 => {
        CapabilitiesOut
      }.asInstanceOf[AnyRef]
      case 2 => {
        SuppMsgOut
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.Result = {
        value
      }.asInstanceOf[Int]
      case 1 => this.CapabilitiesOut = {
        value.toString
      }.asInstanceOf[String]
      case 2 => this.SuppMsgOut = {
        value.toString
      }.asInstanceOf[String]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = WMSL_GetCapResponse.SCHEMA$
}

object WMSL_GetCapResponse {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"WMSL_GetCapResponse\",\"namespace\":\"Energistics.Protocol.WitsmlSoap\",\"fields\":[{\"name\":\"Result\",\"type\":\"int\"},{\"name\":\"CapabilitiesOut\",\"type\":\"string\"},{\"name\":\"SuppMsgOut\",\"type\":\"string\"}],\"messageType\":\"8\",\"protocol\":\"8\",\"senderRole\":\"store\",\"protocolRoles\":\"store,customer\"}")
}