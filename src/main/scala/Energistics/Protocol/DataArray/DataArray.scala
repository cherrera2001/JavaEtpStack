/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.DataArray

import scala.annotation.switch

import Energistics.Datatypes.{AnyArray, ArrayOfBoolean, ArrayOfInt, ArrayOfLong, ArrayOfFloat, ArrayOfDouble}

case class DataArray(var dimensions: List[Long], var data: AnyArray) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(List.empty, new AnyArray)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        scala.collection.JavaConverters.bufferAsJavaListConverter({
          dimensions map { x =>
            x
          }
        }.toBuffer).asJava
      }.asInstanceOf[AnyRef]
      case 1 => {
        data
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.dimensions = {
        value match {
          case (array: java.util.List[_]) => {
            List((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
              x
            }: _*))
          }
        }
      }.asInstanceOf[List[Long]]
      case 1 => this.data = {
        value
      }.asInstanceOf[AnyArray]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = DataArray.SCHEMA$
}

object DataArray {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DataArray\",\"namespace\":\"Energistics.Protocol.DataArray\",\"fields\":[{\"name\":\"dimensions\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"data\",\"type\":{\"type\":\"record\",\"name\":\"AnyArray\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ArrayOfBoolean\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"boolean\"}}]},\"bytes\",{\"type\":\"record\",\"name\":\"ArrayOfInt\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"int\"}}]},{\"type\":\"record\",\"name\":\"ArrayOfLong\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"long\"}}]},{\"type\":\"record\",\"name\":\"ArrayOfFloat\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"float\"}}]},{\"type\":\"record\",\"name\":\"ArrayOfDouble\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]}]}]}}],\"messageType\":\"1\",\"protocol\":\"7\",\"senderRole\":\"store\",\"protocolRoles\":\"store,customer\"}")
}