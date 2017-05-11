/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.WitsmlSoap

import scala.annotation.switch

case class WMSL_DeleteFromStoreResponse(var Result: Int, var SuppMsgOut: String) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(0, "")
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        Result
      }.asInstanceOf[AnyRef]
      case 1 => {
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
      case 1 => this.SuppMsgOut = {
        value.toString
      }.asInstanceOf[String]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = WMSL_DeleteFromStoreResponse.SCHEMA$
}

object WMSL_DeleteFromStoreResponse {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"WMSL_DeleteFromStoreResponse\",\"namespace\":\"Energistics.Protocol.WitsmlSoap\",\"fields\":[{\"name\":\"Result\",\"type\":\"int\"},{\"name\":\"SuppMsgOut\",\"type\":\"string\"}],\"messageType\":\"4\",\"protocol\":\"8\",\"senderRole\":\"store\",\"protocolRoles\":\"store,customer\"}")
}