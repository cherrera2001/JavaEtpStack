/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Datatypes.Object

import scala.annotation.switch

case class GrowingObjectIndex(var item: AnyVal) extends org.apache.avro.specific.SpecificRecordBase {
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
  def getSchema: org.apache.avro.Schema = GrowingObjectIndex.SCHEMA$
}

object GrowingObjectIndex {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GrowingObjectIndex\",\"namespace\":\"Energistics.Datatypes.Object\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"long\",\"double\"]}]}")
}