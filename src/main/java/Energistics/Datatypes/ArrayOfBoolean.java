/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Datatypes;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ArrayOfBoolean extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3693568606577455920L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ArrayOfBoolean\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"boolean\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.List<java.lang.Boolean> values;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ArrayOfBoolean() {}

  /**
   * All-args constructor.
   * @param values The new value for values
   */
  public ArrayOfBoolean(java.util.List<java.lang.Boolean> values) {
    this.values = values;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return values;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: values = (java.util.List<java.lang.Boolean>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'values' field.
   * @return The value of the 'values' field.
   */
  public java.util.List<java.lang.Boolean> getValues() {
    return values;
  }

  /**
   * Sets the value of the 'values' field.
   * @param value the value to set.
   */
  public void setValues(java.util.List<java.lang.Boolean> value) {
    this.values = value;
  }

  /**
   * Creates a new ArrayOfBoolean RecordBuilder.
   * @return A new ArrayOfBoolean RecordBuilder
   */
  public static Energistics.Datatypes.ArrayOfBoolean.Builder newBuilder() {
    return new Energistics.Datatypes.ArrayOfBoolean.Builder();
  }

  /**
   * Creates a new ArrayOfBoolean RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ArrayOfBoolean RecordBuilder
   */
  public static Energistics.Datatypes.ArrayOfBoolean.Builder newBuilder(Energistics.Datatypes.ArrayOfBoolean.Builder other) {
    return new Energistics.Datatypes.ArrayOfBoolean.Builder(other);
  }

  /**
   * Creates a new ArrayOfBoolean RecordBuilder by copying an existing ArrayOfBoolean instance.
   * @param other The existing instance to copy.
   * @return A new ArrayOfBoolean RecordBuilder
   */
  public static Energistics.Datatypes.ArrayOfBoolean.Builder newBuilder(Energistics.Datatypes.ArrayOfBoolean other) {
    return new Energistics.Datatypes.ArrayOfBoolean.Builder(other);
  }

  /**
   * RecordBuilder for ArrayOfBoolean instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ArrayOfBoolean>
    implements org.apache.avro.data.RecordBuilder<ArrayOfBoolean> {

    private java.util.List<java.lang.Boolean> values;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Datatypes.ArrayOfBoolean.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.values)) {
        this.values = data().deepCopy(fields()[0].schema(), other.values);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ArrayOfBoolean instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Datatypes.ArrayOfBoolean other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.values)) {
        this.values = data().deepCopy(fields()[0].schema(), other.values);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'values' field.
      * @return The value.
      */
    public java.util.List<java.lang.Boolean> getValues() {
      return values;
    }

    /**
      * Sets the value of the 'values' field.
      * @param value The value of 'values'.
      * @return This builder.
      */
    public Energistics.Datatypes.ArrayOfBoolean.Builder setValues(java.util.List<java.lang.Boolean> value) {
      validate(fields()[0], value);
      this.values = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'values' field has been set.
      * @return True if the 'values' field has been set, false otherwise.
      */
    public boolean hasValues() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'values' field.
      * @return This builder.
      */
    public Energistics.Datatypes.ArrayOfBoolean.Builder clearValues() {
      values = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public ArrayOfBoolean build() {
      try {
        ArrayOfBoolean record = new ArrayOfBoolean();
        record.values = fieldSetFlags()[0] ? this.values : (java.util.List<java.lang.Boolean>) defaultValue(fields()[0]);
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
