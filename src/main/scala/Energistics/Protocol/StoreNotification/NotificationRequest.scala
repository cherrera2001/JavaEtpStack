/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.StoreNotification

import scala.annotation.switch

import Energistics.Datatypes.Object.NotificationRequestRecord

case class NotificationRequest(var request: NotificationRequestRecord) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(new NotificationRequestRecord)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        request
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.request = {
        value
      }.asInstanceOf[NotificationRequestRecord]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = NotificationRequest.SCHEMA$
}

object NotificationRequest {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"NotificationRequest\",\"namespace\":\"Energistics.Protocol.StoreNotification\",\"fields\":[{\"name\":\"request\",\"type\":{\"type\":\"record\",\"name\":\"NotificationRequestRecord\",\"namespace\":\"Energistics.Datatypes.Object\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"uuid\",\"type\":\"string\"},{\"name\":\"includeObjectData\",\"type\":\"boolean\"},{\"name\":\"startTime\",\"type\":\"long\"},{\"name\":\"objectTypes\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}]}}],\"messageType\":\"1\",\"protocol\":\"5\",\"senderRole\":\"customer\",\"protocolRoles\":\"store,customer\"}")
}