/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Protocol.ChannelDataFrame

import scala.annotation.switch

import Energistics.Datatypes.{DataValue, ArrayOfDouble}

import Energistics.Datatypes.ChannelData.{ChannelMetadataRecord, IndexMetadataRecord, ChannelIndexTypes, IndexDirections, ChannelStatuses}

import Energistics.Datatypes.Object.{DataObject, Resource}

case class ChannelMetadata(var channels: List[ChannelMetadataRecord]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(List.empty)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        scala.collection.JavaConverters.bufferAsJavaListConverter({
          channels map { x =>
            x
          }
        }.toBuffer).asJava
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.channels = {
        value match {
          case (array: java.util.List[_]) => {
            List((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
              x
            }: _*))
          }
        }
      }.asInstanceOf[List[ChannelMetadataRecord]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = ChannelMetadata.SCHEMA$
}

object ChannelMetadata {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ChannelMetadata\",\"namespace\":\"Energistics.Protocol.ChannelDataFrame\",\"fields\":[{\"name\":\"channels\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ChannelMetadataRecord\",\"namespace\":\"Energistics.Datatypes.ChannelData\",\"fields\":[{\"name\":\"channelUri\",\"type\":\"string\"},{\"name\":\"channelId\",\"type\":\"long\"},{\"name\":\"indexes\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"IndexMetadataRecord\",\"fields\":[{\"name\":\"indexType\",\"type\":{\"type\":\"enum\",\"name\":\"ChannelIndexTypes\",\"symbols\":[\"Time\",\"Depth\"]}},{\"name\":\"uom\",\"type\":\"string\"},{\"name\":\"depthDatum\",\"type\":[\"null\",\"string\"]},{\"name\":\"direction\",\"type\":{\"type\":\"enum\",\"name\":\"IndexDirections\",\"symbols\":[\"Increasing\",\"Decreasing\"]}},{\"name\":\"mnemonic\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"uri\",\"type\":[\"null\",\"string\"]},{\"name\":\"customData\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"DataValue\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"double\",\"float\",\"int\",\"long\",\"string\",{\"type\":\"record\",\"name\":\"ArrayOfDouble\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]},\"boolean\",\"bytes\"]}]}}},{\"name\":\"scale\",\"type\":\"int\"},{\"name\":\"timeDatum\",\"type\":[\"null\",\"string\"]}]}}},{\"name\":\"channelName\",\"type\":\"string\"},{\"name\":\"dataType\",\"type\":\"string\"},{\"name\":\"uom\",\"type\":\"string\"},{\"name\":\"startIndex\",\"type\":[\"null\",\"long\"]},{\"name\":\"endIndex\",\"type\":[\"null\",\"long\"]},{\"name\":\"description\",\"type\":\"string\"},{\"name\":\"status\",\"type\":{\"type\":\"enum\",\"name\":\"ChannelStatuses\",\"symbols\":[\"Active\",\"Inactive\",\"Closed\"]}},{\"name\":\"contentType\",\"type\":[\"null\",\"string\"]},{\"name\":\"source\",\"type\":\"string\"},{\"name\":\"measureClass\",\"type\":\"string\"},{\"name\":\"uuid\",\"type\":[\"null\",\"string\"]},{\"name\":\"customData\",\"type\":{\"type\":\"map\",\"values\":\"Energistics.Datatypes.DataValue\"}},{\"name\":\"domainObject\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"DataObject\",\"namespace\":\"Energistics.Datatypes.Object\",\"fields\":[{\"name\":\"resource\",\"type\":{\"type\":\"record\",\"name\":\"Resource\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"contentType\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"channelSubscribable\",\"type\":\"boolean\"},{\"name\":\"customData\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"hasChildren\",\"type\":\"int\"},{\"name\":\"uuid\",\"type\":[\"null\",\"string\"]},{\"name\":\"lastChanged\",\"type\":\"long\"},{\"name\":\"objectNotifiable\",\"type\":\"boolean\"}]}},{\"name\":\"contentEncoding\",\"type\":\"string\"},{\"name\":\"data\",\"type\":\"bytes\"}]}]}]}}}],\"messageType\":\"3\",\"protocol\":\"2\",\"senderRole\":\"producer\",\"protocolRoles\":\"producer,consumer\"}")
}