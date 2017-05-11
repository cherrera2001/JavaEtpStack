/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Datatypes

import scala.annotation.switch

case class SupportedProtocol(var protocol: Int, var protocolVersion: Version, var role: String, var protocolCapabilities: Map[String, DataValue]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(0, new Version, "", Map("" -> new DataValue))
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        protocol
      }.asInstanceOf[AnyRef]
      case 1 => {
        protocolVersion
      }.asInstanceOf[AnyRef]
      case 2 => {
        role
      }.asInstanceOf[AnyRef]
      case 3 => {
        val map: java.util.HashMap[String, Any] = new java.util.HashMap[String, Any]
        protocolCapabilities foreach { kvp =>
          val key = kvp._1
          val value = kvp._2
          map.put(key, value)
        }
        map
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.protocol = {
        value
      }.asInstanceOf[Int]
      case 1 => this.protocolVersion = {
        value
      }.asInstanceOf[Version]
      case 2 => this.role = {
        value.toString
      }.asInstanceOf[String]
      case 3 => this.protocolCapabilities = {
        value match {
          case (map: java.util.Map[_,_]) => {
            scala.collection.JavaConverters.mapAsScalaMapConverter(map).asScala.toMap map { kvp =>
              val key = kvp._1.toString
              val value = kvp._2
              (key, value)
            }
          }
        }
      }.asInstanceOf[Map[String, DataValue]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = SupportedProtocol.SCHEMA$
}

object SupportedProtocol {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SupportedProtocol\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"protocol\",\"type\":\"int\"},{\"name\":\"protocolVersion\",\"type\":{\"type\":\"record\",\"name\":\"Version\",\"fields\":[{\"name\":\"major\",\"type\":\"int\"},{\"name\":\"minor\",\"type\":\"int\"},{\"name\":\"revision\",\"type\":\"int\"},{\"name\":\"patch\",\"type\":\"int\"}]}},{\"name\":\"role\",\"type\":\"string\"},{\"name\":\"protocolCapabilities\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"DataValue\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"double\",\"float\",\"int\",\"long\",\"string\",{\"type\":\"record\",\"name\":\"ArrayOfDouble\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]},\"boolean\",\"bytes\"]}]}}}]}")
}