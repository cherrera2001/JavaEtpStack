/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Datatypes.ChannelData;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class StreamingStartIndex extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3239201266694818949L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"StreamingStartIndex\",\"namespace\":\"Energistics.Datatypes.ChannelData\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"int\",\"long\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.Object item;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public StreamingStartIndex() {}

  /**
   * All-args constructor.
   * @param item The new value for item
   */
  public StreamingStartIndex(java.lang.Object item) {
    this.item = item;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return item;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: item = (java.lang.Object)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'item' field.
   * @return The value of the 'item' field.
   */
  public java.lang.Object getItem() {
    return item;
  }

  /**
   * Sets the value of the 'item' field.
   * @param value the value to set.
   */
  public void setItem(java.lang.Object value) {
    this.item = value;
  }

  /**
   * Creates a new StreamingStartIndex RecordBuilder.
   * @return A new StreamingStartIndex RecordBuilder
   */
  public static Energistics.Datatypes.ChannelData.StreamingStartIndex.Builder newBuilder() {
    return new Energistics.Datatypes.ChannelData.StreamingStartIndex.Builder();
  }

  /**
   * Creates a new StreamingStartIndex RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new StreamingStartIndex RecordBuilder
   */
  public static Energistics.Datatypes.ChannelData.StreamingStartIndex.Builder newBuilder(Energistics.Datatypes.ChannelData.StreamingStartIndex.Builder other) {
    return new Energistics.Datatypes.ChannelData.StreamingStartIndex.Builder(other);
  }

  /**
   * Creates a new StreamingStartIndex RecordBuilder by copying an existing StreamingStartIndex instance.
   * @param other The existing instance to copy.
   * @return A new StreamingStartIndex RecordBuilder
   */
  public static Energistics.Datatypes.ChannelData.StreamingStartIndex.Builder newBuilder(Energistics.Datatypes.ChannelData.StreamingStartIndex other) {
    return new Energistics.Datatypes.ChannelData.StreamingStartIndex.Builder(other);
  }

  /**
   * RecordBuilder for StreamingStartIndex instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<StreamingStartIndex>
    implements org.apache.avro.data.RecordBuilder<StreamingStartIndex> {

    private java.lang.Object item;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Datatypes.ChannelData.StreamingStartIndex.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.item)) {
        this.item = data().deepCopy(fields()[0].schema(), other.item);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing StreamingStartIndex instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Datatypes.ChannelData.StreamingStartIndex other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.item)) {
        this.item = data().deepCopy(fields()[0].schema(), other.item);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'item' field.
      * @return The value.
      */
    public java.lang.Object getItem() {
      return item;
    }

    /**
      * Sets the value of the 'item' field.
      * @param value The value of 'item'.
      * @return This builder.
      */
    public Energistics.Datatypes.ChannelData.StreamingStartIndex.Builder setItem(java.lang.Object value) {
      validate(fields()[0], value);
      this.item = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'item' field has been set.
      * @return True if the 'item' field has been set, false otherwise.
      */
    public boolean hasItem() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'item' field.
      * @return This builder.
      */
    public Energistics.Datatypes.ChannelData.StreamingStartIndex.Builder clearItem() {
      item = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public StreamingStartIndex build() {
      try {
        StreamingStartIndex record = new StreamingStartIndex();
        record.item = fieldSetFlags()[0] ? this.item : (java.lang.Object) defaultValue(fields()[0]);
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
