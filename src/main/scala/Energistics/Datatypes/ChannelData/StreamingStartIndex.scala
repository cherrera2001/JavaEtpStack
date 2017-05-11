/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Datatypes.ChannelData

import scala.annotation.switch

case class StreamingStartIndex(var item: AnyVal) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(None)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        item match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.item = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[AnyVal]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = StreamingStartIndex.SCHEMA$
}

object StreamingStartIndex {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"StreamingStartIndex\",\"namespace\":\"Energistics.Datatypes.ChannelData\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"int\",\"long\"]}]}")
}