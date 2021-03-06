/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Protocol.ChannelStreaming;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ChannelRangeRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3464723031446514702L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ChannelRangeRequest\",\"namespace\":\"Energistics.Protocol.ChannelStreaming\",\"fields\":[{\"name\":\"channelRanges\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ChannelRangeInfo\",\"namespace\":\"Energistics.Datatypes.ChannelData\",\"fields\":[{\"name\":\"channelId\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"startIndex\",\"type\":\"long\"},{\"name\":\"endIndex\",\"type\":\"long\"}]}}}],\"messageType\":\"9\",\"protocol\":\"1\",\"senderRole\":\"consumer\",\"protocolRoles\":\"producer,consumer\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.List<Energistics.Datatypes.ChannelData.ChannelRangeInfo> channelRanges;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ChannelRangeRequest() {}

  /**
   * All-args constructor.
   * @param channelRanges The new value for channelRanges
   */
  public ChannelRangeRequest(java.util.List<Energistics.Datatypes.ChannelData.ChannelRangeInfo> channelRanges) {
    this.channelRanges = channelRanges;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return channelRanges;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: channelRanges = (java.util.List<Energistics.Datatypes.ChannelData.ChannelRangeInfo>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'channelRanges' field.
   * @return The value of the 'channelRanges' field.
   */
  public java.util.List<Energistics.Datatypes.ChannelData.ChannelRangeInfo> getChannelRanges() {
    return channelRanges;
  }

  /**
   * Sets the value of the 'channelRanges' field.
   * @param value the value to set.
   */
  public void setChannelRanges(java.util.List<Energistics.Datatypes.ChannelData.ChannelRangeInfo> value) {
    this.channelRanges = value;
  }

  /**
   * Creates a new ChannelRangeRequest RecordBuilder.
   * @return A new ChannelRangeRequest RecordBuilder
   */
  public static Energistics.Protocol.ChannelStreaming.ChannelRangeRequest.Builder newBuilder() {
    return new Energistics.Protocol.ChannelStreaming.ChannelRangeRequest.Builder();
  }

  /**
   * Creates a new ChannelRangeRequest RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ChannelRangeRequest RecordBuilder
   */
  public static Energistics.Protocol.ChannelStreaming.ChannelRangeRequest.Builder newBuilder(Energistics.Protocol.ChannelStreaming.ChannelRangeRequest.Builder other) {
    return new Energistics.Protocol.ChannelStreaming.ChannelRangeRequest.Builder(other);
  }

  /**
   * Creates a new ChannelRangeRequest RecordBuilder by copying an existing ChannelRangeRequest instance.
   * @param other The existing instance to copy.
   * @return A new ChannelRangeRequest RecordBuilder
   */
  public static Energistics.Protocol.ChannelStreaming.ChannelRangeRequest.Builder newBuilder(Energistics.Protocol.ChannelStreaming.ChannelRangeRequest other) {
    return new Energistics.Protocol.ChannelStreaming.ChannelRangeRequest.Builder(other);
  }

  /**
   * RecordBuilder for ChannelRangeRequest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ChannelRangeRequest>
    implements org.apache.avro.data.RecordBuilder<ChannelRangeRequest> {

    private java.util.List<Energistics.Datatypes.ChannelData.ChannelRangeInfo> channelRanges;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Protocol.ChannelStreaming.ChannelRangeRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.channelRanges)) {
        this.channelRanges = data().deepCopy(fields()[0].schema(), other.channelRanges);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ChannelRangeRequest instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Protocol.ChannelStreaming.ChannelRangeRequest other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.channelRanges)) {
        this.channelRanges = data().deepCopy(fields()[0].schema(), other.channelRanges);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'channelRanges' field.
      * @return The value.
      */
    public java.util.List<Energistics.Datatypes.ChannelData.ChannelRangeInfo> getChannelRanges() {
      return channelRanges;
    }

    /**
      * Sets the value of the 'channelRanges' field.
      * @param value The value of 'channelRanges'.
      * @return This builder.
      */
    public Energistics.Protocol.ChannelStreaming.ChannelRangeRequest.Builder setChannelRanges(java.util.List<Energistics.Datatypes.ChannelData.ChannelRangeInfo> value) {
      validate(fields()[0], value);
      this.channelRanges = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'channelRanges' field has been set.
      * @return True if the 'channelRanges' field has been set, false otherwise.
      */
    public boolean hasChannelRanges() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'channelRanges' field.
      * @return This builder.
      */
    public Energistics.Protocol.ChannelStreaming.ChannelRangeRequest.Builder clearChannelRanges() {
      channelRanges = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public ChannelRangeRequest build() {
      try {
        ChannelRangeRequest record = new ChannelRangeRequest();
        record.channelRanges = fieldSetFlags()[0] ? this.channelRanges : (java.util.List<Energistics.Datatypes.ChannelData.ChannelRangeInfo>) defaultValue(fields()[0]);
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
