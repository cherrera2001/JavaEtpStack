/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Protocol.ChannelStreaming;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ChannelStreamingStop extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5088258908594478553L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ChannelStreamingStop\",\"namespace\":\"Energistics.Protocol.ChannelStreaming\",\"fields\":[{\"name\":\"channels\",\"type\":{\"type\":\"array\",\"items\":\"long\"}}],\"messageType\":\"5\",\"protocol\":\"1\",\"senderRole\":\"consumer\",\"protocolRoles\":\"producer,consumer\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.List<java.lang.Long> channels;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ChannelStreamingStop() {}

  /**
   * All-args constructor.
   * @param channels The new value for channels
   */
  public ChannelStreamingStop(java.util.List<java.lang.Long> channels) {
    this.channels = channels;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return channels;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: channels = (java.util.List<java.lang.Long>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'channels' field.
   * @return The value of the 'channels' field.
   */
  public java.util.List<java.lang.Long> getChannels() {
    return channels;
  }

  /**
   * Sets the value of the 'channels' field.
   * @param value the value to set.
   */
  public void setChannels(java.util.List<java.lang.Long> value) {
    this.channels = value;
  }

  /**
   * Creates a new ChannelStreamingStop RecordBuilder.
   * @return A new ChannelStreamingStop RecordBuilder
   */
  public static Energistics.Protocol.ChannelStreaming.ChannelStreamingStop.Builder newBuilder() {
    return new Energistics.Protocol.ChannelStreaming.ChannelStreamingStop.Builder();
  }

  /**
   * Creates a new ChannelStreamingStop RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ChannelStreamingStop RecordBuilder
   */
  public static Energistics.Protocol.ChannelStreaming.ChannelStreamingStop.Builder newBuilder(Energistics.Protocol.ChannelStreaming.ChannelStreamingStop.Builder other) {
    return new Energistics.Protocol.ChannelStreaming.ChannelStreamingStop.Builder(other);
  }

  /**
   * Creates a new ChannelStreamingStop RecordBuilder by copying an existing ChannelStreamingStop instance.
   * @param other The existing instance to copy.
   * @return A new ChannelStreamingStop RecordBuilder
   */
  public static Energistics.Protocol.ChannelStreaming.ChannelStreamingStop.Builder newBuilder(Energistics.Protocol.ChannelStreaming.ChannelStreamingStop other) {
    return new Energistics.Protocol.ChannelStreaming.ChannelStreamingStop.Builder(other);
  }

  /**
   * RecordBuilder for ChannelStreamingStop instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ChannelStreamingStop>
    implements org.apache.avro.data.RecordBuilder<ChannelStreamingStop> {

    private java.util.List<java.lang.Long> channels;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Protocol.ChannelStreaming.ChannelStreamingStop.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.channels)) {
        this.channels = data().deepCopy(fields()[0].schema(), other.channels);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ChannelStreamingStop instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Protocol.ChannelStreaming.ChannelStreamingStop other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.channels)) {
        this.channels = data().deepCopy(fields()[0].schema(), other.channels);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'channels' field.
      * @return The value.
      */
    public java.util.List<java.lang.Long> getChannels() {
      return channels;
    }

    /**
      * Sets the value of the 'channels' field.
      * @param value The value of 'channels'.
      * @return This builder.
      */
    public Energistics.Protocol.ChannelStreaming.ChannelStreamingStop.Builder setChannels(java.util.List<java.lang.Long> value) {
      validate(fields()[0], value);
      this.channels = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'channels' field has been set.
      * @return True if the 'channels' field has been set, false otherwise.
      */
    public boolean hasChannels() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'channels' field.
      * @return This builder.
      */
    public Energistics.Protocol.ChannelStreaming.ChannelStreamingStop.Builder clearChannels() {
      channels = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public ChannelStreamingStop build() {
      try {
        ChannelStreamingStop record = new ChannelStreamingStop();
        record.channels = fieldSetFlags()[0] ? this.channels : (java.util.List<java.lang.Long>) defaultValue(fields()[0]);
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