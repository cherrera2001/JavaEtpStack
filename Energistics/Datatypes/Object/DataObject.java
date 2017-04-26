/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Datatypes.Object;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DataObject extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5148321941544844104L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DataObject\",\"namespace\":\"Energistics.Datatypes.Object\",\"fields\":[{\"name\":\"resource\",\"type\":{\"type\":\"record\",\"name\":\"Resource\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"contentType\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"channelSubscribable\",\"type\":\"boolean\"},{\"name\":\"customData\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"hasChildren\",\"type\":\"int\"},{\"name\":\"uuid\",\"type\":[\"null\",\"string\"]},{\"name\":\"lastChanged\",\"type\":\"long\"},{\"name\":\"objectNotifiable\",\"type\":\"boolean\"}]}},{\"name\":\"contentEncoding\",\"type\":\"string\"},{\"name\":\"data\",\"type\":\"bytes\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public Energistics.Datatypes.Object.Resource resource;
  @Deprecated public java.lang.CharSequence contentEncoding;
  @Deprecated public java.nio.ByteBuffer data;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DataObject() {}

  /**
   * All-args constructor.
   * @param resource The new value for resource
   * @param contentEncoding The new value for contentEncoding
   * @param data The new value for data
   */
  public DataObject(Energistics.Datatypes.Object.Resource resource, java.lang.CharSequence contentEncoding, java.nio.ByteBuffer data) {
    this.resource = resource;
    this.contentEncoding = contentEncoding;
    this.data = data;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return resource;
    case 1: return contentEncoding;
    case 2: return data;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: resource = (Energistics.Datatypes.Object.Resource)value$; break;
    case 1: contentEncoding = (java.lang.CharSequence)value$; break;
    case 2: data = (java.nio.ByteBuffer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'resource' field.
   * @return The value of the 'resource' field.
   */
  public Energistics.Datatypes.Object.Resource getResource() {
    return resource;
  }

  /**
   * Sets the value of the 'resource' field.
   * @param value the value to set.
   */
  public void setResource(Energistics.Datatypes.Object.Resource value) {
    this.resource = value;
  }

  /**
   * Gets the value of the 'contentEncoding' field.
   * @return The value of the 'contentEncoding' field.
   */
  public java.lang.CharSequence getContentEncoding() {
    return contentEncoding;
  }

  /**
   * Sets the value of the 'contentEncoding' field.
   * @param value the value to set.
   */
  public void setContentEncoding(java.lang.CharSequence value) {
    this.contentEncoding = value;
  }

  /**
   * Gets the value of the 'data' field.
   * @return The value of the 'data' field.
   */
  public java.nio.ByteBuffer getData() {
    return data;
  }

  /**
   * Sets the value of the 'data' field.
   * @param value the value to set.
   */
  public void setData(java.nio.ByteBuffer value) {
    this.data = value;
  }

  /**
   * Creates a new DataObject RecordBuilder.
   * @return A new DataObject RecordBuilder
   */
  public static Energistics.Datatypes.Object.DataObject.Builder newBuilder() {
    return new Energistics.Datatypes.Object.DataObject.Builder();
  }

  /**
   * Creates a new DataObject RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DataObject RecordBuilder
   */
  public static Energistics.Datatypes.Object.DataObject.Builder newBuilder(Energistics.Datatypes.Object.DataObject.Builder other) {
    return new Energistics.Datatypes.Object.DataObject.Builder(other);
  }

  /**
   * Creates a new DataObject RecordBuilder by copying an existing DataObject instance.
   * @param other The existing instance to copy.
   * @return A new DataObject RecordBuilder
   */
  public static Energistics.Datatypes.Object.DataObject.Builder newBuilder(Energistics.Datatypes.Object.DataObject other) {
    return new Energistics.Datatypes.Object.DataObject.Builder(other);
  }

  /**
   * RecordBuilder for DataObject instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DataObject>
    implements org.apache.avro.data.RecordBuilder<DataObject> {

    private Energistics.Datatypes.Object.Resource resource;
    private Energistics.Datatypes.Object.Resource.Builder resourceBuilder;
    private java.lang.CharSequence contentEncoding;
    private java.nio.ByteBuffer data;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Datatypes.Object.DataObject.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.resource)) {
        this.resource = data().deepCopy(fields()[0].schema(), other.resource);
        fieldSetFlags()[0] = true;
      }
      if (other.hasResourceBuilder()) {
        this.resourceBuilder = Energistics.Datatypes.Object.Resource.newBuilder(other.getResourceBuilder());
      }
      if (isValidValue(fields()[1], other.contentEncoding)) {
        this.contentEncoding = data().deepCopy(fields()[1].schema(), other.contentEncoding);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.data)) {
        this.data = data().deepCopy(fields()[2].schema(), other.data);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing DataObject instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Datatypes.Object.DataObject other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.resource)) {
        this.resource = data().deepCopy(fields()[0].schema(), other.resource);
        fieldSetFlags()[0] = true;
      }
      this.resourceBuilder = null;
      if (isValidValue(fields()[1], other.contentEncoding)) {
        this.contentEncoding = data().deepCopy(fields()[1].schema(), other.contentEncoding);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.data)) {
        this.data = data().deepCopy(fields()[2].schema(), other.data);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'resource' field.
      * @return The value.
      */
    public Energistics.Datatypes.Object.Resource getResource() {
      return resource;
    }

    /**
      * Sets the value of the 'resource' field.
      * @param value The value of 'resource'.
      * @return This builder.
      */
    public Energistics.Datatypes.Object.DataObject.Builder setResource(Energistics.Datatypes.Object.Resource value) {
      validate(fields()[0], value);
      this.resourceBuilder = null;
      this.resource = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'resource' field has been set.
      * @return True if the 'resource' field has been set, false otherwise.
      */
    public boolean hasResource() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'resource' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public Energistics.Datatypes.Object.Resource.Builder getResourceBuilder() {
      if (resourceBuilder == null) {
        if (hasResource()) {
          setResourceBuilder(Energistics.Datatypes.Object.Resource.newBuilder(resource));
        } else {
          setResourceBuilder(Energistics.Datatypes.Object.Resource.newBuilder());
        }
      }
      return resourceBuilder;
    }

    /**
     * Sets the Builder instance for the 'resource' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public Energistics.Datatypes.Object.DataObject.Builder setResourceBuilder(Energistics.Datatypes.Object.Resource.Builder value) {
      clearResource();
      resourceBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'resource' field has an active Builder instance
     * @return True if the 'resource' field has an active Builder instance
     */
    public boolean hasResourceBuilder() {
      return resourceBuilder != null;
    }

    /**
      * Clears the value of the 'resource' field.
      * @return This builder.
      */
    public Energistics.Datatypes.Object.DataObject.Builder clearResource() {
      resource = null;
      resourceBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'contentEncoding' field.
      * @return The value.
      */
    public java.lang.CharSequence getContentEncoding() {
      return contentEncoding;
    }

    /**
      * Sets the value of the 'contentEncoding' field.
      * @param value The value of 'contentEncoding'.
      * @return This builder.
      */
    public Energistics.Datatypes.Object.DataObject.Builder setContentEncoding(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.contentEncoding = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'contentEncoding' field has been set.
      * @return True if the 'contentEncoding' field has been set, false otherwise.
      */
    public boolean hasContentEncoding() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'contentEncoding' field.
      * @return This builder.
      */
    public Energistics.Datatypes.Object.DataObject.Builder clearContentEncoding() {
      contentEncoding = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'data' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getData() {
      return data;
    }

    /**
      * Sets the value of the 'data' field.
      * @param value The value of 'data'.
      * @return This builder.
      */
    public Energistics.Datatypes.Object.DataObject.Builder setData(java.nio.ByteBuffer value) {
      validate(fields()[2], value);
      this.data = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'data' field has been set.
      * @return True if the 'data' field has been set, false otherwise.
      */
    public boolean hasData() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'data' field.
      * @return This builder.
      */
    public Energistics.Datatypes.Object.DataObject.Builder clearData() {
      data = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public DataObject build() {
      try {
        DataObject record = new DataObject();
        if (resourceBuilder != null) {
          record.resource = this.resourceBuilder.build();
        } else {
          record.resource = fieldSetFlags()[0] ? this.resource : (Energistics.Datatypes.Object.Resource) defaultValue(fields()[0]);
        }
        record.contentEncoding = fieldSetFlags()[1] ? this.contentEncoding : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.data = fieldSetFlags()[2] ? this.data : (java.nio.ByteBuffer) defaultValue(fields()[2]);
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
