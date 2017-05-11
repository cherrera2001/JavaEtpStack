/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Datatypes

import scala.annotation.switch

case class DataAttribute(var attributeId: Int, var attributeValue: DataValue) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(0, new DataValue)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        attributeId
      }.asInstanceOf[AnyRef]
      case 1 => {
        attributeValue
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.attributeId = {
        value
      }.asInstanceOf[Int]
      case 1 => this.attributeValue = {
        value
      }.asInstanceOf[DataValue]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = DataAttribute.SCHEMA$
}

object DataAttribute {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DataAttribute\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"attributeId\",\"type\":\"int\"},{\"name\":\"attributeValue\",\"type\":{\"type\":\"record\",\"name\":\"DataValue\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"double\",\"float\",\"int\",\"long\",\"string\",{\"type\":\"record\",\"name\":\"ArrayOfDouble\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]},\"boolean\",\"bytes\"]}]}}]}")
}