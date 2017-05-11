/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.Core

import scala.annotation.switch

case class RenewSecurityToken(var token: String) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this("")
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        token
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.token = {
        value.toString
      }.asInstanceOf[String]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = RenewSecurityToken.SCHEMA$
}

object RenewSecurityToken {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RenewSecurityToken\",\"namespace\":\"Energistics.Protocol.Core\",\"fields\":[{\"name\":\"token\",\"type\":\"string\"}],\"messageType\":\"6\",\"protocol\":\"0\",\"senderRole\":\"client\",\"protocolRoles\":\"client,server\"}")
}