/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.Store

import scala.annotation.switch

import Energistics.Datatypes.Object.{DataObject, Resource}

case class Object(var dataObject: DataObject) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(new DataObject)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        dataObject
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.dataObject = {
        value
      }.asInstanceOf[DataObject]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = Object.SCHEMA$
}

object Object {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Object\",\"namespace\":\"Energistics.Protocol.Store\",\"fields\":[{\"name\":\"dataObject\",\"type\":{\"type\":\"record\",\"name\":\"DataObject\",\"namespace\":\"Energistics.Datatypes.Object\",\"fields\":[{\"name\":\"resource\",\"type\":{\"type\":\"record\",\"name\":\"Resource\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"contentType\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"channelSubscribable\",\"type\":\"boolean\"},{\"name\":\"customData\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"hasChildren\",\"type\":\"int\"},{\"name\":\"uuid\",\"type\":[\"null\",\"string\"]},{\"name\":\"lastChanged\",\"type\":\"long\"},{\"name\":\"objectNotifiable\",\"type\":\"boolean\"}]}},{\"name\":\"contentEncoding\",\"type\":\"string\"},{\"name\":\"data\",\"type\":\"bytes\"}]}}],\"messageType\":\"4\",\"protocol\":\"4\",\"senderRole\":\"store\",\"protocolRoles\":\"store,customer\"}")
}