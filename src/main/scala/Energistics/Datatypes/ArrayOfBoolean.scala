/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Datatypes

import scala.annotation.switch

case class ArrayOfBoolean(var values: List[Boolean]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(List.empty)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        scala.collection.JavaConverters.bufferAsJavaListConverter({
          values map { x =>
            x
          }
        }.toBuffer).asJava
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.values = {
        value match {
          case (array: java.util.List[_]) => {
            List((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
              x
            }: _*))
          }
        }
      }.asInstanceOf[List[Boolean]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = ArrayOfBoolean.SCHEMA$
}

object ArrayOfBoolean {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ArrayOfBoolean\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"boolean\"}}]}")
}