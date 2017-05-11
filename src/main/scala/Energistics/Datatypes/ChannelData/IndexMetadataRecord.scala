/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Datatypes.ChannelData

import scala.annotation.switch

import Energistics.Datatypes.{DataValue, ArrayOfDouble}

case class IndexMetadataRecord(var indexType: ChannelIndexTypes, var uom: String, var depthDatum: Option[String], var direction: IndexDirections, var mnemonic: Option[String], var description: Option[String], var uri: Option[String], var customData: Map[String, DataValue], var scale: Int, var timeDatum: Option[String]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(null, "", None, null, None, None, None, Map("" -> new DataValue), 0, None)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        indexType
      }.asInstanceOf[AnyRef]
      case 1 => {
        uom
      }.asInstanceOf[AnyRef]
      case 2 => {
        depthDatum match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 3 => {
        direction
      }.asInstanceOf[AnyRef]
      case 4 => {
        mnemonic match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 5 => {
        description match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 6 => {
        uri match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 7 => {
        val map: java.util.HashMap[String, Any] = new java.util.HashMap[String, Any]
        customData foreach { kvp =>
          val key = kvp._1
          val value = kvp._2
          map.put(key, value)
        }
        map
      }.asInstanceOf[AnyRef]
      case 8 => {
        scale
      }.asInstanceOf[AnyRef]
      case 9 => {
        timeDatum match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.indexType = {
        value
      }.asInstanceOf[ChannelIndexTypes]
      case 1 => this.uom = {
        value.toString
      }.asInstanceOf[String]
      case 2 => this.depthDatum = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 3 => this.direction = {
        value
      }.asInstanceOf[IndexDirections]
      case 4 => this.mnemonic = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 5 => this.description = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 6 => this.uri = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 7 => this.customData = {
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
      case 8 => this.scale = {
        value
      }.asInstanceOf[Int]
      case 9 => this.timeDatum = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = IndexMetadataRecord.SCHEMA$
}

object IndexMetadataRecord {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"IndexMetadataRecord\",\"namespace\":\"Energistics.Datatypes.ChannelData\",\"fields\":[{\"name\":\"indexType\",\"type\":{\"type\":\"enum\",\"name\":\"ChannelIndexTypes\",\"symbols\":[\"Time\",\"Depth\"]}},{\"name\":\"uom\",\"type\":\"string\"},{\"name\":\"depthDatum\",\"type\":[\"null\",\"string\"]},{\"name\":\"direction\",\"type\":{\"type\":\"enum\",\"name\":\"IndexDirections\",\"symbols\":[\"Increasing\",\"Decreasing\"]}},{\"name\":\"mnemonic\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"uri\",\"type\":[\"null\",\"string\"]},{\"name\":\"customData\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"DataValue\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"double\",\"float\",\"int\",\"long\",\"string\",{\"type\":\"record\",\"name\":\"ArrayOfDouble\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]},\"boolean\",\"bytes\"]}]}}},{\"name\":\"scale\",\"type\":\"int\"},{\"name\":\"timeDatum\",\"type\":[\"null\",\"string\"]}]}")
}