/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.Discovery

import scala.annotation.switch

import Energistics.Datatypes.Object.Resource

case class GetResourcesResponse(var resource: Resource) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(new Resource)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        resource
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.resource = {
        value
      }.asInstanceOf[Resource]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = GetResourcesResponse.SCHEMA$
}

object GetResourcesResponse {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GetResourcesResponse\",\"namespace\":\"Energistics.Protocol.Discovery\",\"fields\":[{\"name\":\"resource\",\"type\":{\"type\":\"record\",\"name\":\"Resource\",\"namespace\":\"Energistics.Datatypes.Object\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"contentType\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"channelSubscribable\",\"type\":\"boolean\"},{\"name\":\"customData\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"hasChildren\",\"type\":\"int\"},{\"name\":\"uuid\",\"type\":[\"null\",\"string\"]},{\"name\":\"lastChanged\",\"type\":\"long\"},{\"name\":\"objectNotifiable\",\"type\":\"boolean\"}]}}],\"messageType\":\"2\",\"protocol\":\"3\",\"senderRole\":\"store\",\"protocolRoles\":\"store,customer\"}")
}