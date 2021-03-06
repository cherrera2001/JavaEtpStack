/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Datatypes.ChannelData;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DataItem extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7854708394595511477L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DataItem\",\"namespace\":\"Energistics.Datatypes.ChannelData\",\"fields\":[{\"name\":\"indexes\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"channelId\",\"type\":\"long\"},{\"name\":\"value\",\"type\":{\"type\":\"record\",\"name\":\"DataValue\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"double\",\"float\",\"int\",\"long\",{\"type\":\"string\",\"avro.java.string\":\"String\"},{\"type\":\"record\",\"name\":\"ArrayOfDouble\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]},\"boolean\",\"bytes\"]}]}},{\"name\":\"valueAttributes\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"DataAttribute\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"attributeId\",\"type\":\"int\"},{\"name\":\"attributeValue\",\"type\":\"DataValue\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.List<java.lang.Long> indexes;
  @Deprecated public long channelId;
  @Deprecated public Energistics.Datatypes.DataValue value;
  @Deprecated public java.util.List<Energistics.Datatypes.DataAttribute> valueAttributes;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DataItem() {}

  /**
   * All-args constructor.
   * @param indexes The new value for indexes
   * @param channelId The new value for channelId
   * @param value The new value for value
   * @param valueAttributes The new value for valueAttributes
   */
  public DataItem(java.util.List<java.lang.Long> indexes, java.lang.Long channelId, Energistics.Datatypes.DataValue value, java.util.List<Energistics.Datatypes.DataAttribute> valueAttributes) {
    this.indexes = indexes;
    this.channelId = channelId;
    this.value = value;
    this.valueAttributes = valueAttributes;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return indexes;
    case 1: return channelId;
    case 2: return value;
    case 3: return valueAttributes;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: indexes = (java.util.List<java.lang.Long>)value$; break;
    case 1: channelId = (java.lang.Long)value$; break;
    case 2: value = (Energistics.Datatypes.DataValue)value$; break;
    case 3: valueAttributes = (java.util.List<Energistics.Datatypes.DataAttribute>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'indexes' field.
   * @return The value of the 'indexes' field.
   */
  public java.util.List<java.lang.Long> getIndexes() {
    return indexes;
  }

  /**
   * Sets the value of the 'indexes' field.
   * @param value the value to set.
   */
  public void setIndexes(java.util.List<java.lang.Long> value) {
    this.indexes = value;
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
   * Gets the value of the 'value' field.
   * @return The value of the 'value' field.
   */
  public Energistics.Datatypes.DataValue getValue() {
    return value;
  }

  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(Energistics.Datatypes.DataValue value) {
    this.value = value;
  }

  /**
   * Gets the value of the 'valueAttributes' field.
   * @return The value of the 'valueAttributes' field.
   */
  public java.util.List<Energistics.Datatypes.DataAttribute> getValueAttributes() {
    return valueAttributes;
  }

  /**
   * Sets the value of the 'valueAttributes' field.
   * @param value the value to set.
   */
  public void setValueAttributes(java.util.List<Energistics.Datatypes.DataAttribute> value) {
    this.valueAttributes = value;
  }

  /**
   * Creates a new DataItem RecordBuilder.
   * @return A new DataItem RecordBuilder
   */
  public static Energistics.Datatypes.ChannelData.DataItem.Builder newBuilder() {
    return new Energistics.Datatypes.ChannelData.DataItem.Builder();
  }

  /**
   * Creates a new DataItem RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DataItem RecordBuilder
   */
  public static Energistics.Datatypes.ChannelData.DataItem.Builder newBuilder(Energistics.Datatypes.ChannelData.DataItem.Builder other) {
    return new Energistics.Datatypes.ChannelData.DataItem.Builder(other);
  }

  /**
   * Creates a new DataItem RecordBuilder by copying an existing DataItem instance.
   * @param other The existing instance to copy.
   * @return A new DataItem RecordBuilder
   */
  public static Energistics.Datatypes.ChannelData.DataItem.Builder newBuilder(Energistics.Datatypes.ChannelData.DataItem other) {
    return new Energistics.Datatypes.ChannelData.DataItem.Builder(other);
  }

  /**
   * RecordBuilder for DataItem instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DataItem>
    implements org.apache.avro.data.RecordBuilder<DataItem> {

    private java.util.List<java.lang.Long> indexes;
    private long channelId;
    private Energistics.Datatypes.DataValue value;
    private Energistics.Datatypes.DataValue.Builder valueBuilder;
    private java.util.List<Energistics.Datatypes.DataAttribute> valueAttributes;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Datatypes.ChannelData.DataItem.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.indexes)) {
        this.indexes = data().deepCopy(fields()[0].schema(), other.indexes);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.channelId)) {
        this.channelId = data().deepCopy(fields()[1].schema(), other.channelId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.value)) {
        this.value = data().deepCopy(fields()[2].schema(), other.value);
        fieldSetFlags()[2] = true;
      }
      if (other.hasValueBuilder()) {
        this.valueBuilder = Energistics.Datatypes.DataValue.newBuilder(other.getValueBuilder());
      }
      if (isValidValue(fields()[3], other.valueAttributes)) {
        this.valueAttributes = data().deepCopy(fields()[3].schema(), other.valueAttributes);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing DataItem instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Datatypes.ChannelData.DataItem other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.indexes)) {
        this.indexes = data().deepCopy(fields()[0].schema(), other.indexes);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.channelId)) {
        this.channelId = data().deepCopy(fields()[1].schema(), other.channelId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.value)) {
        this.value = data().deepCopy(fields()[2].schema(), other.value);
        fieldSetFlags()[2] = true;
      }
      this.valueBuilder = null;
      if (isValidValue(fields()[3], other.valueAttributes)) {
        this.valueAttributes = data().deepCopy(fields()[3].schema(), other.valueAttributes);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'indexes' field.
      * @return The value.
      */
    public java.util.List<java.lang.Long> getIndexes() {
      return indexes;
    }

    /**
      * Sets the value of the 'indexes' field.
      * @param value The value of 'indexes'.
      * @return This builder.
      */
    public Energistics.Datatypes.ChannelData.DataItem.Builder setIndexes(java.util.List<java.lang.Long> value) {
      validate(fields()[0], value);
      this.indexes = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'indexes' field has been set.
      * @return True if the 'indexes' field has been set, false otherwise.
      */
    public boolean hasIndexes() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'indexes' field.
      * @return This builder.
      */
    public Energistics.Datatypes.ChannelData.DataItem.Builder clearIndexes() {
      indexes = null;
      fieldSetFlags()[0] = false;
      return this;
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
    public Energistics.Datatypes.ChannelData.DataItem.Builder setChannelId(long value) {
      validate(fields()[1], value);
      this.channelId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'channelId' field has been set.
      * @return True if the 'channelId' field has been set, false otherwise.
      */
    public boolean hasChannelId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'channelId' field.
      * @return This builder.
      */
    public Energistics.Datatypes.ChannelData.DataItem.Builder clearChannelId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'value' field.
      * @return The value.
      */
    public Energistics.Datatypes.DataValue getValue() {
      return value;
    }

    /**
      * Sets the value of the 'value' field.
      * @param value The value of 'value'.
      * @return This builder.
      */
    public Energistics.Datatypes.ChannelData.DataItem.Builder setValue(Energistics.Datatypes.DataValue value) {
      validate(fields()[2], value);
      this.valueBuilder = null;
      this.value = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'value' field has been set.
      * @return True if the 'value' field has been set, false otherwise.
      */
    public boolean hasValue() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'value' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public Energistics.Datatypes.DataValue.Builder getValueBuilder() {
      if (valueBuilder == null) {
        if (hasValue()) {
          setValueBuilder(Energistics.Datatypes.DataValue.newBuilder(value));
        } else {
          setValueBuilder(Energistics.Datatypes.DataValue.newBuilder());
        }
      }
      return valueBuilder;
    }

    /**
     * Sets the Builder instance for the 'value' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public Energistics.Datatypes.ChannelData.DataItem.Builder setValueBuilder(Energistics.Datatypes.DataValue.Builder value) {
      clearValue();
      valueBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'value' field has an active Builder instance
     * @return True if the 'value' field has an active Builder instance
     */
    public boolean hasValueBuilder() {
      return valueBuilder != null;
    }

    /**
      * Clears the value of the 'value' field.
      * @return This builder.
      */
    public Energistics.Datatypes.ChannelData.DataItem.Builder clearValue() {
      value = null;
      valueBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'valueAttributes' field.
      * @return The value.
      */
    public java.util.List<Energistics.Datatypes.DataAttribute> getValueAttributes() {
      return valueAttributes;
    }

    /**
      * Sets the value of the 'valueAttributes' field.
      * @param value The value of 'valueAttributes'.
      * @return This builder.
      */
    public Energistics.Datatypes.ChannelData.DataItem.Builder setValueAttributes(java.util.List<Energistics.Datatypes.DataAttribute> value) {
      validate(fields()[3], value);
      this.valueAttributes = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'valueAttributes' field has been set.
      * @return True if the 'valueAttributes' field has been set, false otherwise.
      */
    public boolean hasValueAttributes() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'valueAttributes' field.
      * @return This builder.
      */
    public Energistics.Datatypes.ChannelData.DataItem.Builder clearValueAttributes() {
      valueAttributes = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public DataItem build() {
      try {
        DataItem record = new DataItem();
        record.indexes = fieldSetFlags()[0] ? this.indexes : (java.util.List<java.lang.Long>) defaultValue(fields()[0]);
        record.channelId = fieldSetFlags()[1] ? this.channelId : (java.lang.Long) defaultValue(fields()[1]);
        if (valueBuilder != null) {
          record.value = this.valueBuilder.build();
        } else {
          record.value = fieldSetFlags()[2] ? this.value : (Energistics.Datatypes.DataValue) defaultValue(fields()[2]);
        }
        record.valueAttributes = fieldSetFlags()[3] ? this.valueAttributes : (java.util.List<Energistics.Datatypes.DataAttribute>) defaultValue(fields()[3]);
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
