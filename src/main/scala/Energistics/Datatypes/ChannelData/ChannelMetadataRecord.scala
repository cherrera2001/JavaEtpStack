/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Datatypes.ChannelData

import scala.annotation.switch

import Energistics.Datatypes.{DataValue, ArrayOfDouble}

import Energistics.Datatypes.Object.{DataObject, Resource}

case class ChannelMetadataRecord(var channelUri: String, var channelId: Long, var indexes: List[IndexMetadataRecord], var channelName: String, var dataType: String, var uom: String, var startIndex: Option[Long], var endIndex: Option[Long], var description: String, var status: ChannelStatuses, var contentType: Option[String], var source: String, var measureClass: String, var uuid: Option[String], var customData: Map[String, DataValue], var domainObject: Option[DataObject]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this("", 0L, List.empty, "", "", "", None, None, "", null, None, "", "", None, Map("" -> new DataValue), None)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        channelUri
      }.asInstanceOf[AnyRef]
      case 1 => {
        channelId
      }.asInstanceOf[AnyRef]
      case 2 => {
        scala.collection.JavaConverters.bufferAsJavaListConverter({
          indexes map { x =>
            x
          }
        }.toBuffer).asJava
      }.asInstanceOf[AnyRef]
      case 3 => {
        channelName
      }.asInstanceOf[AnyRef]
      case 4 => {
        dataType
      }.asInstanceOf[AnyRef]
      case 5 => {
        uom
      }.asInstanceOf[AnyRef]
      case 6 => {
        startIndex match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 7 => {
        endIndex match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 8 => {
        description
      }.asInstanceOf[AnyRef]
      case 9 => {
        status
      }.asInstanceOf[AnyRef]
      case 10 => {
        contentType match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 11 => {
        source
      }.asInstanceOf[AnyRef]
      case 12 => {
        measureClass
      }.asInstanceOf[AnyRef]
      case 13 => {
        uuid match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 14 => {
        val map: java.util.HashMap[String, Any] = new java.util.HashMap[String, Any]
        customData foreach { kvp =>
          val key = kvp._1
          val value = kvp._2
          map.put(key, value)
        }
        map
      }.asInstanceOf[AnyRef]
      case 15 => {
        domainObject match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.channelUri = {
        value.toString
      }.asInstanceOf[String]
      case 1 => this.channelId = {
        value
      }.asInstanceOf[Long]
      case 2 => this.indexes = {
        value match {
          case (array: java.util.List[_]) => {
            List((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
              x
            }: _*))
          }
        }
      }.asInstanceOf[List[IndexMetadataRecord]]
      case 3 => this.channelName = {
        value.toString
      }.asInstanceOf[String]
      case 4 => this.dataType = {
        value.toString
      }.asInstanceOf[String]
      case 5 => this.uom = {
        value.toString
      }.asInstanceOf[String]
      case 6 => this.startIndex = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Long]]
      case 7 => this.endIndex = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Long]]
      case 8 => this.description = {
        value.toString
      }.asInstanceOf[String]
      case 9 => this.status = {
        value
      }.asInstanceOf[ChannelStatuses]
      case 10 => this.contentType = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 11 => this.source = {
        value.toString
      }.asInstanceOf[String]
      case 12 => this.measureClass = {
        value.toString
      }.asInstanceOf[String]
      case 13 => this.uuid = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 14 => this.customData = {
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
      case 15 => this.domainObject = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[DataObject]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = ChannelMetadataRecord.SCHEMA$
}

object ChannelMetadataRecord {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ChannelMetadataRecord\",\"namespace\":\"Energistics.Datatypes.ChannelData\",\"fields\":[{\"name\":\"channelUri\",\"type\":\"string\"},{\"name\":\"channelId\",\"type\":\"long\"},{\"name\":\"indexes\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"IndexMetadataRecord\",\"fields\":[{\"name\":\"indexType\",\"type\":{\"type\":\"enum\",\"name\":\"ChannelIndexTypes\",\"symbols\":[\"Time\",\"Depth\"]}},{\"name\":\"uom\",\"type\":\"string\"},{\"name\":\"depthDatum\",\"type\":[\"null\",\"string\"]},{\"name\":\"direction\",\"type\":{\"type\":\"enum\",\"name\":\"IndexDirections\",\"symbols\":[\"Increasing\",\"Decreasing\"]}},{\"name\":\"mnemonic\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"uri\",\"type\":[\"null\",\"string\"]},{\"name\":\"customData\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"DataValue\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"double\",\"float\",\"int\",\"long\",\"string\",{\"type\":\"record\",\"name\":\"ArrayOfDouble\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]},\"boolean\",\"bytes\"]}]}}},{\"name\":\"scale\",\"type\":\"int\"},{\"name\":\"timeDatum\",\"type\":[\"null\",\"string\"]}]}}},{\"name\":\"channelName\",\"type\":\"string\"},{\"name\":\"dataType\",\"type\":\"string\"},{\"name\":\"uom\",\"type\":\"string\"},{\"name\":\"startIndex\",\"type\":[\"null\",\"long\"]},{\"name\":\"endIndex\",\"type\":[\"null\",\"long\"]},{\"name\":\"description\",\"type\":\"string\"},{\"name\":\"status\",\"type\":{\"type\":\"enum\",\"name\":\"ChannelStatuses\",\"symbols\":[\"Active\",\"Inactive\",\"Closed\"]}},{\"name\":\"contentType\",\"type\":[\"null\",\"string\"]},{\"name\":\"source\",\"type\":\"string\"},{\"name\":\"measureClass\",\"type\":\"string\"},{\"name\":\"uuid\",\"type\":[\"null\",\"string\"]},{\"name\":\"customData\",\"type\":{\"type\":\"map\",\"values\":\"Energistics.Datatypes.DataValue\"}},{\"name\":\"domainObject\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"DataObject\",\"namespace\":\"Energistics.Datatypes.Object\",\"fields\":[{\"name\":\"resource\",\"type\":{\"type\":\"record\",\"name\":\"Resource\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"contentType\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"channelSubscribable\",\"type\":\"boolean\"},{\"name\":\"customData\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"hasChildren\",\"type\":\"int\"},{\"name\":\"uuid\",\"type\":[\"null\",\"string\"]},{\"name\":\"lastChanged\",\"type\":\"long\"},{\"name\":\"objectNotifiable\",\"type\":\"boolean\"}]}},{\"name\":\"contentEncoding\",\"type\":\"string\"},{\"name\":\"data\",\"type\":\"bytes\"}]}]}]}")
}