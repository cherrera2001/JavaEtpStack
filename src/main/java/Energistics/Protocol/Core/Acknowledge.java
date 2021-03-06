/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Protocol.Core;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Acknowledge extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7729668943716991958L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Acknowledge\",\"namespace\":\"Energistics.Protocol.Core\",\"fields\":[],\"messageType\":\"1001\",\"protocol\":\"0\",\"senderRole\":\"*\",\"protocolRoles\":\"client,server\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Creates a new Acknowledge RecordBuilder.
   * @return A new Acknowledge RecordBuilder
   */
  public static Energistics.Protocol.Core.Acknowledge.Builder newBuilder() {
    return new Energistics.Protocol.Core.Acknowledge.Builder();
  }

  /**
   * Creates a new Acknowledge RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Acknowledge RecordBuilder
   */
  public static Energistics.Protocol.Core.Acknowledge.Builder newBuilder(Energistics.Protocol.Core.Acknowledge.Builder other) {
    return new Energistics.Protocol.Core.Acknowledge.Builder(other);
  }

  /**
   * Creates a new Acknowledge RecordBuilder by copying an existing Acknowledge instance.
   * @param other The existing instance to copy.
   * @return A new Acknowledge RecordBuilder
   */
  public static Energistics.Protocol.Core.Acknowledge.Builder newBuilder(Energistics.Protocol.Core.Acknowledge other) {
    return new Energistics.Protocol.Core.Acknowledge.Builder(other);
  }

  /**
   * RecordBuilder for Acknowledge instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Acknowledge>
    implements org.apache.avro.data.RecordBuilder<Acknowledge> {


    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Protocol.Core.Acknowledge.Builder other) {
      super(other);
    }

    /**
     * Creates a Builder by copying an existing Acknowledge instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Protocol.Core.Acknowledge other) {
            super(SCHEMA$);
    }

    @Override
    public Acknowledge build() {
      try {
        Acknowledge record = new Acknowledge();
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
