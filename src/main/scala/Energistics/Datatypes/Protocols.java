/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Datatypes;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public enum Protocols { 
  Core, ChannelStreaming, ChannelDataFrame, Discovery, Store, StoreNotification, GrowingObject, DataArray, WitsmlSoap  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"Protocols\",\"namespace\":\"Energistics.Datatypes\",\"symbols\":[\"Core\",\"ChannelStreaming\",\"ChannelDataFrame\",\"Discovery\",\"Store\",\"StoreNotification\",\"GrowingObject\",\"DataArray\",\"WitsmlSoap\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}
