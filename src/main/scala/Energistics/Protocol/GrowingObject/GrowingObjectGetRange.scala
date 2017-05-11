/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.GrowingObject

import scala.annotation.switch

import Energistics.Datatypes.Object.GrowingObjectIndex

case class GrowingObjectGetRange(var uri: String, var startIndex: GrowingObjectIndex, var endIndex: GrowingObjectIndex, var uom: String, var depthDatum: String) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this("", new GrowingObjectIndex, new GrowingObjectIndex, "", "")
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        uri
      }.asInstanceOf[AnyRef]
      case 1 => {
        startIndex
      }.asInstanceOf[AnyRef]
      case 2 => {
        endIndex
      }.asInstanceOf[AnyRef]
      case 3 => {
        uom
      }.asInstanceOf[AnyRef]
      case 4 => {
        depthDatum
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.uri = {
        value.toString
      }.asInstanceOf[String]
      case 1 => this.startIndex = {
        value
      }.asInstanceOf[GrowingObjectIndex]
      case 2 => this.endIndex = {
        value
      }.asInstanceOf[GrowingObjectIndex]
      case 3 => this.uom = {
        value.toString
      }.asInstanceOf[String]
      case 4 => this.depthDatum = {
        value.toString
      }.asInstanceOf[String]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = GrowingObjectGetRange.SCHEMA$
}

object GrowingObjectGetRange {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GrowingObjectGetRange\",\"namespace\":\"Energistics.Protocol.GrowingObject\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"startIndex\",\"type\":{\"type\":\"record\",\"name\":\"GrowingObjectIndex\",\"namespace\":\"Energistics.Datatypes.Object\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"long\",\"double\"]}]}},{\"name\":\"endIndex\",\"type\":\"Energistics.Datatypes.Object.GrowingObjectIndex\"},{\"name\":\"uom\",\"type\":\"string\"},{\"name\":\"depthDatum\",\"type\":\"string\"}],\"messageType\":\"4\",\"protocol\":\"6\",\"senderRole\":\"customer\",\"protocolRoles\":\"store,customer\"}")
}