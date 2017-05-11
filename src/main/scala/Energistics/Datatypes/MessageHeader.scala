/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Datatypes

import scala.annotation.switch

case class MessageHeader(var protocol: Int, var messageType: Int, var correlationId: Long, var messageId: Long, var messageFlags: Int) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(0, 0, 0L, 0L, 0)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        protocol
      }.asInstanceOf[AnyRef]
      case 1 => {
        messageType
      }.asInstanceOf[AnyRef]
      case 2 => {
        correlationId
      }.asInstanceOf[AnyRef]
      case 3 => {
        messageId
      }.asInstanceOf[AnyRef]
      case 4 => {
        messageFlags
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.protocol = {
        value
      }.asInstanceOf[Int]
      case 1 => this.messageType = {
        value
      }.asInstanceOf[Int]
      case 2 => this.correlationId = {
        value
      }.asInstanceOf[Long]
      case 3 => this.messageId = {
        value
      }.asInstanceOf[Long]
      case 4 => this.messageFlags = {
        value
      }.asInstanceOf[Int]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = MessageHeader.SCHEMA$
}

object MessageHeader {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MessageHeader\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"protocol\",\"type\":\"int\"},{\"name\":\"messageType\",\"type\":\"int\"},{\"name\":\"correlationId\",\"type\":\"long\"},{\"name\":\"messageId\",\"type\":\"long\"},{\"name\":\"messageFlags\",\"type\":\"int\"}]}")
}