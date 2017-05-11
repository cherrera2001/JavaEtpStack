/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Datatypes

import scala.annotation.switch

case class DataValue(var item: AnyVal) extends org.apache.avro.specific.SpecificRecordBase {
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
  def getSchema: org.apache.avro.Schema = DataValue.SCHEMA$
}

object DataValue {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DataValue\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"double\",\"float\",\"int\",\"long\",\"string\",{\"type\":\"record\",\"name\":\"ArrayOfDouble\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]},\"boolean\",\"bytes\"]}]}")
}