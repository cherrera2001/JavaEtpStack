/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Datatypes.Object

import scala.annotation.switch

case class NotificationRequestRecord(var uri: String, var uuid: String, var includeObjectData: Boolean, var startTime: Long, var objectTypes: List[String]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this("", "", false, 0L, List.empty)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        uri
      }.asInstanceOf[AnyRef]
      case 1 => {
        uuid
      }.asInstanceOf[AnyRef]
      case 2 => {
        includeObjectData
      }.asInstanceOf[AnyRef]
      case 3 => {
        startTime
      }.asInstanceOf[AnyRef]
      case 4 => {
        scala.collection.JavaConverters.bufferAsJavaListConverter({
          objectTypes map { x =>
            x
          }
        }.toBuffer).asJava
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.uri = {
        value.toString
      }.asInstanceOf[String]
      case 1 => this.uuid = {
        value.toString
      }.asInstanceOf[String]
      case 2 => this.includeObjectData = {
        value
      }.asInstanceOf[Boolean]
      case 3 => this.startTime = {
        value
      }.asInstanceOf[Long]
      case 4 => this.objectTypes = {
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
  def getSchema: org.apache.avro.Schema = NotificationRequestRecord.SCHEMA$
}

object NotificationRequestRecord {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"NotificationRequestRecord\",\"namespace\":\"Energistics.Datatypes.Object\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"uuid\",\"type\":\"string\"},{\"name\":\"includeObjectData\",\"type\":\"boolean\"},{\"name\":\"startTime\",\"type\":\"long\"},{\"name\":\"objectTypes\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}]}")
}