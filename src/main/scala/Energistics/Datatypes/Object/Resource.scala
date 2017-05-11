/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Datatypes.Object

import scala.annotation.switch

case class Resource(var uri: String, var contentType: String, var name: String, var channelSubscribable: Boolean, var customData: Map[String, String], var resourceType: String, var hasChildren: Int, var uuid: Option[String], var lastChanged: Long, var objectNotifiable: Boolean) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this("", "", "", false, Map("" -> ""), "", 0, None, 0L, false)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        uri
      }.asInstanceOf[AnyRef]
      case 1 => {
        contentType
      }.asInstanceOf[AnyRef]
      case 2 => {
        name
      }.asInstanceOf[AnyRef]
      case 3 => {
        channelSubscribable
      }.asInstanceOf[AnyRef]
      case 4 => {
        val map: java.util.HashMap[String, Any] = new java.util.HashMap[String, Any]
        customData foreach { kvp =>
          val key = kvp._1
          val value = kvp._2
          map.put(key, value)
        }
        map
      }.asInstanceOf[AnyRef]
      case 5 => {
        resourceType
      }.asInstanceOf[AnyRef]
      case 6 => {
        hasChildren
      }.asInstanceOf[AnyRef]
      case 7 => {
        uuid match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 8 => {
        lastChanged
      }.asInstanceOf[AnyRef]
      case 9 => {
        objectNotifiable
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.uri = {
        value.toString
      }.asInstanceOf[String]
      case 1 => this.contentType = {
        value.toString
      }.asInstanceOf[String]
      case 2 => this.name = {
        value.toString
      }.asInstanceOf[String]
      case 3 => this.channelSubscribable = {
        value
      }.asInstanceOf[Boolean]
      case 4 => this.customData = {
        value match {
          case (map: java.util.Map[_,_]) => {
            scala.collection.JavaConverters.mapAsScalaMapConverter(map).asScala.toMap map { kvp =>
              val key = kvp._1.toString
              val value = kvp._2
              (key, value.toString)
            }
          }
        }
      }.asInstanceOf[Map[String, String]]
      case 5 => this.resourceType = {
        value.toString
      }.asInstanceOf[String]
      case 6 => this.hasChildren = {
        value
      }.asInstanceOf[Int]
      case 7 => this.uuid = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 8 => this.lastChanged = {
        value
      }.asInstanceOf[Long]
      case 9 => this.objectNotifiable = {
        value
      }.asInstanceOf[Boolean]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = Resource.SCHEMA$
}

object Resource {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Resource\",\"namespace\":\"Energistics.Datatypes.Object\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"contentType\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"channelSubscribable\",\"type\":\"boolean\"},{\"name\":\"customData\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"hasChildren\",\"type\":\"int\"},{\"name\":\"uuid\",\"type\":[\"null\",\"string\"]},{\"name\":\"lastChanged\",\"type\":\"long\"},{\"name\":\"objectNotifiable\",\"type\":\"boolean\"}]}")
}