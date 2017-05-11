/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.WitsmlSoap

import scala.annotation.switch

case class WMLS_GetVersion() extends org.apache.avro.specific.SpecificRecordBase {
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = WMLS_GetVersion.SCHEMA$
}

object WMLS_GetVersion {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"WMLS_GetVersion\",\"namespace\":\"Energistics.Protocol.WitsmlSoap\",\"fields\":[],\"messageType\":\"11\",\"protocol\":\"8\",\"senderRole\":\"customer\",\"protocolRoles\":\"store,customer\"}")
}