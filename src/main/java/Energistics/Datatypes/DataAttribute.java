/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Datatypes;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DataAttribute extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 470169257327632275L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DataAttribute\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"attributeId\",\"type\":\"int\"},{\"name\":\"attributeValue\",\"type\":{\"type\":\"record\",\"name\":\"DataValue\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"double\",\"float\",\"int\",\"long\",{\"type\":\"string\",\"avro.java.string\":\"String\"},{\"type\":\"record\",\"name\":\"ArrayOfDouble\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]},\"boolean\",\"bytes\"]}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public int attributeId;
  @Deprecated public Energistics.Datatypes.DataValue attributeValue;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DataAttribute() {}

  /**
   * All-args constructor.
   * @param attributeId The new value for attributeId
   * @param attributeValue The new value for attributeValue
   */
  public DataAttribute(java.lang.Integer attributeId, Energistics.Datatypes.DataValue attributeValue) {
    this.attributeId = attributeId;
    this.attributeValue = attributeValue;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return attributeId;
    case 1: return attributeValue;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: attributeId = (java.lang.Integer)value$; break;
    case 1: attributeValue = (Energistics.Datatypes.DataValue)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'attributeId' field.
   * @return The value of the 'attributeId' field.
   */
  public java.lang.Integer getAttributeId() {
    return attributeId;
  }

  /**
   * Sets the value of the 'attributeId' field.
   * @param value the value to set.
   */
  public void setAttributeId(java.lang.Integer value) {
    this.attributeId = value;
  }

  /**
   * Gets the value of the 'attributeValue' field.
   * @return The value of the 'attributeValue' field.
   */
  public Energistics.Datatypes.DataValue getAttributeValue() {
    return attributeValue;
  }

  /**
   * Sets the value of the 'attributeValue' field.
   * @param value the value to set.
   */
  public void setAttributeValue(Energistics.Datatypes.DataValue value) {
    this.attributeValue = value;
  }

  /**
   * Creates a new DataAttribute RecordBuilder.
   * @return A new DataAttribute RecordBuilder
   */
  public static Energistics.Datatypes.DataAttribute.Builder newBuilder() {
    return new Energistics.Datatypes.DataAttribute.Builder();
  }

  /**
   * Creates a new DataAttribute RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DataAttribute RecordBuilder
   */
  public static Energistics.Datatypes.DataAttribute.Builder newBuilder(Energistics.Datatypes.DataAttribute.Builder other) {
    return new Energistics.Datatypes.DataAttribute.Builder(other);
  }

  /**
   * Creates a new DataAttribute RecordBuilder by copying an existing DataAttribute instance.
   * @param other The existing instance to copy.
   * @return A new DataAttribute RecordBuilder
   */
  public static Energistics.Datatypes.DataAttribute.Builder newBuilder(Energistics.Datatypes.DataAttribute other) {
    return new Energistics.Datatypes.DataAttribute.Builder(other);
  }

  /**
   * RecordBuilder for DataAttribute instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DataAttribute>
    implements org.apache.avro.data.RecordBuilder<DataAttribute> {

    private int attributeId;
    private Energistics.Datatypes.DataValue attributeValue;
    private Energistics.Datatypes.DataValue.Builder attributeValueBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Datatypes.DataAttribute.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.attributeId)) {
        this.attributeId = data().deepCopy(fields()[0].schema(), other.attributeId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.attributeValue)) {
        this.attributeValue = data().deepCopy(fields()[1].schema(), other.attributeValue);
        fieldSetFlags()[1] = true;
      }
      if (other.hasAttributeValueBuilder()) {
        this.attributeValueBuilder = Energistics.Datatypes.DataValue.newBuilder(other.getAttributeValueBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing DataAttribute instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Datatypes.DataAttribute other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.attributeId)) {
        this.attributeId = data().deepCopy(fields()[0].schema(), other.attributeId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.attributeValue)) {
        this.attributeValue = data().deepCopy(fields()[1].schema(), other.attributeValue);
        fieldSetFlags()[1] = true;
      }
      this.attributeValueBuilder = null;
    }

    /**
      * Gets the value of the 'attributeId' field.
      * @return The value.
      */
    public java.lang.Integer getAttributeId() {
      return attributeId;
    }

    /**
      * Sets the value of the 'attributeId' field.
      * @param value The value of 'attributeId'.
      * @return This builder.
      */
    public Energistics.Datatypes.DataAttribute.Builder setAttributeId(int value) {
      validate(fields()[0], value);
      this.attributeId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'attributeId' field has been set.
      * @return True if the 'attributeId' field has been set, false otherwise.
      */
    public boolean hasAttributeId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'attributeId' field.
      * @return This builder.
      */
    public Energistics.Datatypes.DataAttribute.Builder clearAttributeId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'attributeValue' field.
      * @return The value.
      */
    public Energistics.Datatypes.DataValue getAttributeValue() {
      return attributeValue;
    }

    /**
      * Sets the value of the 'attributeValue' field.
      * @param value The value of 'attributeValue'.
      * @return This builder.
      */
    public Energistics.Datatypes.DataAttribute.Builder setAttributeValue(Energistics.Datatypes.DataValue value) {
      validate(fields()[1], value);
      this.attributeValueBuilder = null;
      this.attributeValue = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'attributeValue' field has been set.
      * @return True if the 'attributeValue' field has been set, false otherwise.
      */
    public boolean hasAttributeValue() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'attributeValue' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public Energistics.Datatypes.DataValue.Builder getAttributeValueBuilder() {
      if (attributeValueBuilder == null) {
        if (hasAttributeValue()) {
          setAttributeValueBuilder(Energistics.Datatypes.DataValue.newBuilder(attributeValue));
        } else {
          setAttributeValueBuilder(Energistics.Datatypes.DataValue.newBuilder());
        }
      }
      return attributeValueBuilder;
    }

    /**
     * Sets the Builder instance for the 'attributeValue' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public Energistics.Datatypes.DataAttribute.Builder setAttributeValueBuilder(Energistics.Datatypes.DataValue.Builder value) {
      clearAttributeValue();
      attributeValueBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'attributeValue' field has an active Builder instance
     * @return True if the 'attributeValue' field has an active Builder instance
     */
    public boolean hasAttributeValueBuilder() {
      return attributeValueBuilder != null;
    }

    /**
      * Clears the value of the 'attributeValue' field.
      * @return This builder.
      */
    public Energistics.Datatypes.DataAttribute.Builder clearAttributeValue() {
      attributeValue = null;
      attributeValueBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public DataAttribute build() {
      try {
        DataAttribute record = new DataAttribute();
        record.attributeId = fieldSetFlags()[0] ? this.attributeId : (java.lang.Integer) defaultValue(fields()[0]);
        if (attributeValueBuilder != null) {
          record.attributeValue = this.attributeValueBuilder.build();
        } else {
          record.attributeValue = fieldSetFlags()[1] ? this.attributeValue : (Energistics.Datatypes.DataValue) defaultValue(fields()[1]);
        }
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
