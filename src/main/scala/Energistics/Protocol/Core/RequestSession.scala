/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.Core

import scala.annotation.switch

import Energistics.Datatypes.{SupportedProtocol, Version, DataValue, ArrayOfDouble}

case class RequestSession(var applicationName: String, var applicationVersion: String, var requestedProtocols: List[SupportedProtocol], var supportedObjects: List[String]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this("", "", List.empty, List.empty)
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
          requestedProtocols map { x =>
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
      case 2 => this.requestedProtocols = {
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
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = RequestSession.SCHEMA$
}

object RequestSession {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RequestSession\",\"namespace\":\"Energistics.Protocol.Core\",\"fields\":[{\"name\":\"applicationName\",\"type\":\"string\"},{\"name\":\"applicationVersion\",\"type\":\"string\"},{\"name\":\"requestedProtocols\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"SupportedProtocol\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"protocol\",\"type\":\"int\"},{\"name\":\"protocolVersion\",\"type\":{\"type\":\"record\",\"name\":\"Version\",\"fields\":[{\"name\":\"major\",\"type\":\"int\"},{\"name\":\"minor\",\"type\":\"int\"},{\"name\":\"revision\",\"type\":\"int\"},{\"name\":\"patch\",\"type\":\"int\"}]}},{\"name\":\"role\",\"type\":\"string\"},{\"name\":\"protocolCapabilities\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"DataValue\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"double\",\"float\",\"int\",\"long\",\"string\",{\"type\":\"record\",\"name\":\"ArrayOfDouble\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]},\"boolean\",\"bytes\"]}]}}}]}}},{\"name\":\"supportedObjects\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}],\"messageType\":\"1\",\"protocol\":\"0\",\"senderRole\":\"client\",\"protocolRoles\":\"client,server\"}")
}