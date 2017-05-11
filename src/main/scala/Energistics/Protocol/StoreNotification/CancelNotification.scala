/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.StoreNotification

import scala.annotation.switch

case class CancelNotification(var requestUuid: String) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this("")
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        requestUuid
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.requestUuid = {
        value.toString
      }.asInstanceOf[String]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = CancelNotification.SCHEMA$
}

object CancelNotification {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CancelNotification\",\"namespace\":\"Energistics.Protocol.StoreNotification\",\"fields\":[{\"name\":\"requestUuid\",\"type\":\"string\"}],\"messageType\":\"4\",\"protocol\":\"5\",\"senderRole\":\"customer\",\"protocolRoles\":\"store,customer\"}")
}