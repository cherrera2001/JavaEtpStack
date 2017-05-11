/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Datatypes.ChannelData

import scala.annotation.switch

case class ChannelRangeInfo(var channelId: List[Long], var startIndex: Long, var endIndex: Long) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(List.empty, 0L, 0L)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        scala.collection.JavaConverters.bufferAsJavaListConverter({
          channelId map { x =>
            x
          }
        }.toBuffer).asJava
      }.asInstanceOf[AnyRef]
      case 1 => {
        startIndex
      }.asInstanceOf[AnyRef]
      case 2 => {
        endIndex
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.channelId = {
        value match {
          case (array: java.util.List[_]) => {
            List((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
              x
            }: _*))
          }
        }
      }.asInstanceOf[List[Long]]
      case 1 => this.startIndex = {
        value
      }.asInstanceOf[Long]
      case 2 => this.endIndex = {
        value
      }.asInstanceOf[Long]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = ChannelRangeInfo.SCHEMA$
}

object ChannelRangeInfo {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ChannelRangeInfo\",\"namespace\":\"Energistics.Datatypes.ChannelData\",\"fields\":[{\"name\":\"channelId\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"startIndex\",\"type\":\"long\"},{\"name\":\"endIndex\",\"type\":\"long\"}]}")
}