/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Datatypes.Object

import scala.annotation.switch

case class ObjectChange(var changeType: ObjectChangeTypes, var changeTime: Long, var dataObject: DataObject) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(null, 0L, new DataObject)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        changeType
      }.asInstanceOf[AnyRef]
      case 1 => {
        changeTime
      }.asInstanceOf[AnyRef]
      case 2 => {
        dataObject
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.changeType = {
        value
      }.asInstanceOf[ObjectChangeTypes]
      case 1 => this.changeTime = {
        value
      }.asInstanceOf[Long]
      case 2 => this.dataObject = {
        value
      }.asInstanceOf[DataObject]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = ObjectChange.SCHEMA$
}

object ObjectChange {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ObjectChange\",\"namespace\":\"Energistics.Datatypes.Object\",\"fields\":[{\"name\":\"changeType\",\"type\":{\"type\":\"enum\",\"name\":\"ObjectChangeTypes\",\"symbols\":[\"Upsert\",\"Delete\"]}},{\"name\":\"changeTime\",\"type\":\"long\"},{\"name\":\"dataObject\",\"type\":{\"type\":\"record\",\"name\":\"DataObject\",\"fields\":[{\"name\":\"resource\",\"type\":{\"type\":\"record\",\"name\":\"Resource\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"contentType\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"channelSubscribable\",\"type\":\"boolean\"},{\"name\":\"customData\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"hasChildren\",\"type\":\"int\"},{\"name\":\"uuid\",\"type\":[\"null\",\"string\"]},{\"name\":\"lastChanged\",\"type\":\"long\"},{\"name\":\"objectNotifiable\",\"type\":\"boolean\"}]}},{\"name\":\"contentEncoding\",\"type\":\"string\"},{\"name\":\"data\",\"type\":\"bytes\"}]}}]}")
}