/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.ChannelStreaming

import scala.annotation.switch

case class ChannelDescribe(var uris: List[String]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(List.empty)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        scala.collection.JavaConverters.bufferAsJavaListConverter({
          uris map { x =>
            x
          }
        }.toBuffer).asJava
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.uris = {
        value match {
          case (array: java.util.List[_]) => {
            List((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
              x.toString
            }: _*))
          }
        }
      }.asInstanceOf[List[String]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = ChannelDescribe.SCHEMA$
}

object ChannelDescribe {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ChannelDescribe\",\"namespace\":\"Energistics.Protocol.ChannelStreaming\",\"fields\":[{\"name\":\"uris\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}],\"messageType\":\"1\",\"protocol\":\"1\",\"senderRole\":\"consumer\",\"protocolRoles\":\"producer,consumer\"}")
}