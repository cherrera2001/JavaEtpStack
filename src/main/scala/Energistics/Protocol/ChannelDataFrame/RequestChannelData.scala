/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.ChannelDataFrame

import scala.annotation.switch

case class RequestChannelData(var uri: String, var fromIndex: Option[Long], var toIndex: Option[Long]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this("", None, None)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        uri
      }.asInstanceOf[AnyRef]
      case 1 => {
        fromIndex match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 2 => {
        toIndex match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.uri = {
        value.toString
      }.asInstanceOf[String]
      case 1 => this.fromIndex = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Long]]
      case 2 => this.toIndex = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Long]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = RequestChannelData.SCHEMA$
}

object RequestChannelData {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RequestChannelData\",\"namespace\":\"Energistics.Protocol.ChannelDataFrame\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"fromIndex\",\"type\":[\"null\",\"long\"]},{\"name\":\"toIndex\",\"type\":[\"null\",\"long\"]}],\"messageType\":\"1\",\"protocol\":\"2\",\"senderRole\":\"consumer\",\"protocolRoles\":\"producer,consumer\"}")
}