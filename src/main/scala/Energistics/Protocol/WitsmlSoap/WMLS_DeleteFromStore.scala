/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.WitsmlSoap

import scala.annotation.switch

case class WMLS_DeleteFromStore(var WMLtypeIn: String, var XMLin: String, var OptionsIn: String, var CapabilitiesIn: String) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this("", "", "", "")
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        WMLtypeIn
      }.asInstanceOf[AnyRef]
      case 1 => {
        XMLin
      }.asInstanceOf[AnyRef]
      case 2 => {
        OptionsIn
      }.asInstanceOf[AnyRef]
      case 3 => {
        CapabilitiesIn
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.WMLtypeIn = {
        value.toString
      }.asInstanceOf[String]
      case 1 => this.XMLin = {
        value.toString
      }.asInstanceOf[String]
      case 2 => this.OptionsIn = {
        value.toString
      }.asInstanceOf[String]
      case 3 => this.CapabilitiesIn = {
        value.toString
      }.asInstanceOf[String]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = WMLS_DeleteFromStore.SCHEMA$
}

object WMLS_DeleteFromStore {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"WMLS_DeleteFromStore\",\"namespace\":\"Energistics.Protocol.WitsmlSoap\",\"fields\":[{\"name\":\"WMLtypeIn\",\"type\":\"string\"},{\"name\":\"XMLin\",\"type\":\"string\"},{\"name\":\"OptionsIn\",\"type\":\"string\"},{\"name\":\"CapabilitiesIn\",\"type\":\"string\"}],\"messageType\":\"3\",\"protocol\":\"8\",\"senderRole\":\"customer\",\"protocolRoles\":\"store,customer\"}")
}