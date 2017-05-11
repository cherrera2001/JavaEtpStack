/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.StoreNotification

import scala.annotation.switch

import Energistics.Datatypes.Object.{ObjectChange, ObjectChangeTypes, DataObject, Resource}

case class DeleteNotification(var delete: ObjectChange) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(new ObjectChange)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        delete
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.delete = {
        value
      }.asInstanceOf[ObjectChange]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = DeleteNotification.SCHEMA$
}

object DeleteNotification {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DeleteNotification\",\"namespace\":\"Energistics.Protocol.StoreNotification\",\"fields\":[{\"name\":\"delete\",\"type\":{\"type\":\"record\",\"name\":\"ObjectChange\",\"namespace\":\"Energistics.Datatypes.Object\",\"fields\":[{\"name\":\"changeType\",\"type\":{\"type\":\"enum\",\"name\":\"ObjectChangeTypes\",\"symbols\":[\"Upsert\",\"Delete\"]}},{\"name\":\"changeTime\",\"type\":\"long\"},{\"name\":\"dataObject\",\"type\":{\"type\":\"record\",\"name\":\"DataObject\",\"fields\":[{\"name\":\"resource\",\"type\":{\"type\":\"record\",\"name\":\"Resource\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"contentType\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"channelSubscribable\",\"type\":\"boolean\"},{\"name\":\"customData\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"hasChildren\",\"type\":\"int\"},{\"name\":\"uuid\",\"type\":[\"null\",\"string\"]},{\"name\":\"lastChanged\",\"type\":\"long\"},{\"name\":\"objectNotifiable\",\"type\":\"boolean\"}]}},{\"name\":\"contentEncoding\",\"type\":\"string\"},{\"name\":\"data\",\"type\":\"bytes\"}]}}]}}],\"messageType\":\"3\",\"protocol\":\"5\",\"senderRole\":\"store\",\"protocolRoles\":\"store,customer\"}")
}