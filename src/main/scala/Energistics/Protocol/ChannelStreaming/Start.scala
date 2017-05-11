/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.ChannelStreaming

import scala.annotation.switch

case class Start(var maxMessageRate: Int, var maxDataItems: Int) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(0, 0)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        maxMessageRate
      }.asInstanceOf[AnyRef]
      case 1 => {
        maxDataItems
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.maxMessageRate = {
        value
      }.asInstanceOf[Int]
      case 1 => this.maxDataItems = {
        value
      }.asInstanceOf[Int]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = Start.SCHEMA$
}

object Start {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Start\",\"namespace\":\"Energistics.Protocol.ChannelStreaming\",\"fields\":[{\"name\":\"maxMessageRate\",\"type\":\"int\"},{\"name\":\"maxDataItems\",\"type\":\"int\"}],\"messageType\":\"0\",\"protocol\":\"1\",\"senderRole\":\"consumer\",\"protocolRoles\":\"producer,consumer\"}")
}