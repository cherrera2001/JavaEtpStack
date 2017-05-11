/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.WitsmlSoap

import scala.annotation.switch

case class WMSL_GetFromStoreResponse(var Result: Int, var XMLout: String, var SuppMsgOut: String) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(0, "", "")
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        Result
      }.asInstanceOf[AnyRef]
      case 1 => {
        XMLout
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
      case 1 => this.XMLout = {
        value.toString
      }.asInstanceOf[String]
      case 2 => this.SuppMsgOut = {
        value.toString
      }.asInstanceOf[String]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = WMSL_GetFromStoreResponse.SCHEMA$
}

object WMSL_GetFromStoreResponse {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"WMSL_GetFromStoreResponse\",\"namespace\":\"Energistics.Protocol.WitsmlSoap\",\"fields\":[{\"name\":\"Result\",\"type\":\"int\"},{\"name\":\"XMLout\",\"type\":\"string\"},{\"name\":\"SuppMsgOut\",\"type\":\"string\"}],\"messageType\":\"10\",\"protocol\":\"8\",\"senderRole\":\"store\",\"protocolRoles\":\"store,customer\"}")
}