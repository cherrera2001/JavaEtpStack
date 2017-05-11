/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.Core

import scala.annotation.switch

case class Acknowledge() extends org.apache.avro.specific.SpecificRecordBase {
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
  def getSchema: org.apache.avro.Schema = Acknowledge.SCHEMA$
}

object Acknowledge {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Acknowledge\",\"namespace\":\"Energistics.Protocol.Core\",\"fields\":[],\"messageType\":\"1001\",\"protocol\":\"0\",\"senderRole\":\"*\",\"protocolRoles\":\"client,server\"}")
}