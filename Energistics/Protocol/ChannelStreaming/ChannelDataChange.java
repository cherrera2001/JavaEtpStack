/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Protocol.ChannelStreaming;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ChannelDataChange extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4385353668615663148L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ChannelDataChange\",\"namespace\":\"Energistics.Protocol.ChannelStreaming\",\"fields\":[{\"name\":\"channelId\",\"type\":\"long\"},{\"name\":\"startIndex\",\"type\":\"long\"},{\"name\":\"endIndex\",\"type\":\"long\"},{\"name\":\"data\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"DataItem\",\"namespace\":\"Energistics.Datatypes.ChannelData\",\"fields\":[{\"name\":\"indexes\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"channelId\",\"type\":\"long\"},{\"name\":\"value\",\"type\":{\"type\":\"record\",\"name\":\"DataValue\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"double\",\"float\",\"int\",\"long\",\"string\",{\"type\":\"record\",\"name\":\"ArrayOfDouble\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]},\"boolean\",\"bytes\"]}]}},{\"name\":\"valueAttributes\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"DataAttribute\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"attributeId\",\"type\":\"int\"},{\"name\":\"attributeValue\",\"type\":\"DataValue\"}]}}}]}}}],\"messageType\":\"6\",\"protocol\":\"1\",\"senderRole\":\"producer\",\"protocolRoles\":\"producer,consumer\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public long channelId;
  @Deprecated public long startIndex;
  @Deprecated public long endIndex;
  @Deprecated public java.util.List<Energistics.Datatypes.ChannelData.DataItem> data;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ChannelDataChange() {}

  /**
   * All-args constructor.
   * @param channelId The new value for channelId
   * @param startIndex The new value for startIndex
   * @param endIndex The new value for endIndex
   * @param data The new value for data
   */
  public ChannelDataChange(java.lang.Long channelId, java.lang.Long startIndex, java.lang.Long endIndex, java.util.List<Energistics.Datatypes.ChannelData.DataItem> data) {
    this.channelId = channelId;
    this.startIndex = startIndex;
    this.endIndex = endIndex;
    this.data = data;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return channelId;
    case 1: return startIndex;
    case 2: return endIndex;
    case 3: return data;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: channelId = (java.lang.Long)value$; break;
    case 1: startIndex = (java.lang.Long)value$; break;
    case 2: endIndex = (java.lang.Long)value$; break;
    case 3: data = (java.util.List<Energistics.Datatypes.ChannelData.DataItem>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'channelId' field.
   * @return The value of the 'channelId' field.
   */
  public java.lang.Long getChannelId() {
    return channelId;
  }

  /**
   * Sets the value of the 'channelId' field.
   * @param value the value to set.
   */
  public void setChannelId(java.lang.Long value) {
    this.channelId = value;
  }

  /**
   * Gets the value of the 'startIndex' field.
   * @return The value of the 'startIndex' field.
   */
  public java.lang.Long getStartIndex() {
    return startIndex;
  }

  /**
   * Sets the value of the 'startIndex' field.
   * @param value the value to set.
   */
  public void setStartIndex(java.lang.Long value) {
    this.startIndex = value;
  }

  /**
   * Gets the value of the 'endIndex' field.
   * @return The value of the 'endIndex' field.
   */
  public java.lang.Long getEndIndex() {
    return endIndex;
  }

  /**
   * Sets the value of the 'endIndex' field.
   * @param value the value to set.
   */
  public void setEndIndex(java.lang.Long value) {
    this.endIndex = value;
  }

  /**
   * Gets the value of the 'data' field.
   * @return The value of the 'data' field.
   */
  public java.util.List<Energistics.Datatypes.ChannelData.DataItem> getData() {
    return data;
  }

  /**
   * Sets the value of the 'data' field.
   * @param value the value to set.
   */
  public void setData(java.util.List<Energistics.Datatypes.ChannelData.DataItem> value) {
    this.data = value;
  }

  /**
   * Creates a new ChannelDataChange RecordBuilder.
   * @return A new ChannelDataChange RecordBuilder
   */
  public static Energistics.Protocol.ChannelStreaming.ChannelDataChange.Builder newBuilder() {
    return new Energistics.Protocol.ChannelStreaming.ChannelDataChange.Builder();
  }

  /**
   * Creates a new ChannelDataChange RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ChannelDataChange RecordBuilder
   */
  public static Energistics.Protocol.ChannelStreaming.ChannelDataChange.Builder newBuilder(Energistics.Protocol.ChannelStreaming.ChannelDataChange.Builder other) {
    return new Energistics.Protocol.ChannelStreaming.ChannelDataChange.Builder(other);
  }

  /**
   * Creates a new ChannelDataChange RecordBuilder by copying an existing ChannelDataChange instance.
   * @param other The existing instance to copy.
   * @return A new ChannelDataChange RecordBuilder
   */
  public static Energistics.Protocol.ChannelStreaming.ChannelDataChange.Builder newBuilder(Energistics.Protocol.ChannelStreaming.ChannelDataChange other) {
    return new Energistics.Protocol.ChannelStreaming.ChannelDataChange.Builder(other);
  }

  /**
   * RecordBuilder for ChannelDataChange instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ChannelDataChange>
    implements org.apache.avro.data.RecordBuilder<ChannelDataChange> {

    private long channelId;
    private long startIndex;
    private long endIndex;
    private java.util.List<Energistics.Datatypes.ChannelData.DataItem> data;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Protocol.ChannelStreaming.ChannelDataChange.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.channelId)) {
        this.channelId = data().deepCopy(fields()[0].schema(), other.channelId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.startIndex)) {
        this.startIndex = data().deepCopy(fields()[1].schema(), other.startIndex);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.endIndex)) {
        this.endIndex = data().deepCopy(fields()[2].schema(), other.endIndex);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.data)) {
        this.data = data().deepCopy(fields()[3].schema(), other.data);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ChannelDataChange instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Protocol.ChannelStreaming.ChannelDataChange other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.channelId)) {
        this.channelId = data().deepCopy(fields()[0].schema(), other.channelId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.startIndex)) {
        this.startIndex = data().deepCopy(fields()[1].schema(), other.startIndex);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.endIndex)) {
        this.endIndex = data().deepCopy(fields()[2].schema(), other.endIndex);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.data)) {
        this.data = data().deepCopy(fields()[3].schema(), other.data);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'channelId' field.
      * @return The value.
      */
    public java.lang.Long getChannelId() {
      return channelId;
    }

    /**
      * Sets the value of the 'channelId' field.
      * @param value The value of 'channelId'.
      * @return This builder.
      */
    public Energistics.Protocol.ChannelStreaming.ChannelDataChange.Builder setChannelId(long value) {
      validate(fields()[0], value);
      this.channelId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'channelId' field has been set.
      * @return True if the 'channelId' field has been set, false otherwise.
      */
    public boolean hasChannelId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'channelId' field.
      * @return This builder.
      */
    public Energistics.Protocol.ChannelStreaming.ChannelDataChange.Builder clearChannelId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'startIndex' field.
      * @return The value.
      */
    public java.lang.Long getStartIndex() {
      return startIndex;
    }

    /**
      * Sets the value of the 'startIndex' field.
      * @param value The value of 'startIndex'.
      * @return This builder.
      */
    public Energistics.Protocol.ChannelStreaming.ChannelDataChange.Builder setStartIndex(long value) {
      validate(fields()[1], value);
      this.startIndex = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'startIndex' field has been set.
      * @return True if the 'startIndex' field has been set, false otherwise.
      */
    public boolean hasStartIndex() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'startIndex' field.
      * @return This builder.
      */
    public Energistics.Protocol.ChannelStreaming.ChannelDataChange.Builder clearStartIndex() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'endIndex' field.
      * @return The value.
      */
    public java.lang.Long getEndIndex() {
      return endIndex;
    }

    /**
      * Sets the value of the 'endIndex' field.
      * @param value The value of 'endIndex'.
      * @return This builder.
      */
    public Energistics.Protocol.ChannelStreaming.ChannelDataChange.Builder setEndIndex(long value) {
      validate(fields()[2], value);
      this.endIndex = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'endIndex' field has been set.
      * @return True if the 'endIndex' field has been set, false otherwise.
      */
    public boolean hasEndIndex() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'endIndex' field.
      * @return This builder.
      */
    public Energistics.Protocol.ChannelStreaming.ChannelDataChange.Builder clearEndIndex() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'data' field.
      * @return The value.
      */
    public java.util.List<Energistics.Datatypes.ChannelData.DataItem> getData() {
      return data;
    }

    /**
      * Sets the value of the 'data' field.
      * @param value The value of 'data'.
      * @return This builder.
      */
    public Energistics.Protocol.ChannelStreaming.ChannelDataChange.Builder setData(java.util.List<Energistics.Datatypes.ChannelData.DataItem> value) {
      validate(fields()[3], value);
      this.data = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'data' field has been set.
      * @return True if the 'data' field has been set, false otherwise.
      */
    public boolean hasData() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'data' field.
      * @return This builder.
      */
    public Energistics.Protocol.ChannelStreaming.ChannelDataChange.Builder clearData() {
      data = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public ChannelDataChange build() {
      try {
        ChannelDataChange record = new ChannelDataChange();
        record.channelId = fieldSetFlags()[0] ? this.channelId : (java.lang.Long) defaultValue(fields()[0]);
        record.startIndex = fieldSetFlags()[1] ? this.startIndex : (java.lang.Long) defaultValue(fields()[1]);
        record.endIndex = fieldSetFlags()[2] ? this.endIndex : (java.lang.Long) defaultValue(fields()[2]);
        record.data = fieldSetFlags()[3] ? this.data : (java.util.List<Energistics.Datatypes.ChannelData.DataItem>) defaultValue(fields()[3]);
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
