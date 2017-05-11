/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Datatypes

import scala.annotation.switch

case class AnyArray(var item: AnyVal) extends org.apache.avro.specific.SpecificRecordBase {
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
  def getSchema: org.apache.avro.Schema = AnyArray.SCHEMA$
}

object AnyArray {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AnyArray\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ArrayOfBoolean\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"boolean\"}}]},\"bytes\",{\"type\":\"record\",\"name\":\"ArrayOfInt\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"int\"}}]},{\"type\":\"record\",\"name\":\"ArrayOfLong\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"long\"}}]},{\"type\":\"record\",\"name\":\"ArrayOfFloat\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"float\"}}]},{\"type\":\"record\",\"name\":\"ArrayOfDouble\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]}]}]}")
}