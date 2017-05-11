/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Datatypes

import scala.annotation.switch

case class ServerCapabilities(var applicationName: String, var applicationVersion: String, var supportedProtocols: List[SupportedProtocol], var supportedObjects: List[String], var contactInformation: Contact, var supportedEncodings: String) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this("", "", List.empty, List.empty, new Contact, "")
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        applicationName
      }.asInstanceOf[AnyRef]
      case 1 => {
        applicationVersion
      }.asInstanceOf[AnyRef]
      case 2 => {
        scala.collection.JavaConverters.bufferAsJavaListConverter({
          supportedProtocols map { x =>
            x
          }
        }.toBuffer).asJava
      }.asInstanceOf[AnyRef]
      case 3 => {
        scala.collection.JavaConverters.bufferAsJavaListConverter({
          supportedObjects map { x =>
            x
          }
        }.toBuffer).asJava
      }.asInstanceOf[AnyRef]
      case 4 => {
        contactInformation
      }.asInstanceOf[AnyRef]
      case 5 => {
        supportedEncodings
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.applicationName = {
        value.toString
      }.asInstanceOf[String]
      case 1 => this.applicationVersion = {
        value.toString
      }.asInstanceOf[String]
      case 2 => this.supportedProtocols = {
        value match {
          case (array: java.util.List[_]) => {
            List((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
              x
            }: _*))
          }
        }
      }.asInstanceOf[List[SupportedProtocol]]
      case 3 => this.supportedObjects = {
        value match {
          case (array: java.util.List[_]) => {
            List((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
              x.toString
            }: _*))
          }
        }
      }.asInstanceOf[List[String]]
      case 4 => this.contactInformation = {
        value
      }.asInstanceOf[Contact]
      case 5 => this.supportedEncodings = {
        value.toString
      }.asInstanceOf[String]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = ServerCapabilities.SCHEMA$
}

object ServerCapabilities {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ServerCapabilities\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"applicationName\",\"type\":\"string\"},{\"name\":\"applicationVersion\",\"type\":\"string\"},{\"name\":\"supportedProtocols\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"SupportedProtocol\",\"fields\":[{\"name\":\"protocol\",\"type\":\"int\"},{\"name\":\"protocolVersion\",\"type\":{\"type\":\"record\",\"name\":\"Version\",\"fields\":[{\"name\":\"major\",\"type\":\"int\"},{\"name\":\"minor\",\"type\":\"int\"},{\"name\":\"revision\",\"type\":\"int\"},{\"name\":\"patch\",\"type\":\"int\"}]}},{\"name\":\"role\",\"type\":\"string\"},{\"name\":\"protocolCapabilities\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"DataValue\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"double\",\"float\",\"int\",\"long\",\"string\",{\"type\":\"record\",\"name\":\"ArrayOfDouble\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]},\"boolean\",\"bytes\"]}]}}}]}}},{\"name\":\"supportedObjects\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"contactInformation\",\"type\":{\"type\":\"record\",\"name\":\"Contact\",\"fields\":[{\"name\":\"organizationName\",\"type\":[\"null\",\"string\"]},{\"name\":\"contactName\",\"type\":[\"null\",\"string\"]},{\"name\":\"contactPhone\",\"type\":[\"null\",\"string\"]},{\"name\":\"contactEmail\",\"type\":[\"null\",\"string\"]}]}},{\"name\":\"supportedEncodings\",\"type\":\"string\"}]}")
}