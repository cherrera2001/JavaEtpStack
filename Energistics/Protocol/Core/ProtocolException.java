/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Protocol.Core;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ProtocolException extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5320561064085790929L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ProtocolException\",\"namespace\":\"Energistics.Protocol.Core\",\"fields\":[{\"name\":\"errorCode\",\"type\":\"int\"},{\"name\":\"errorMessage\",\"type\":\"string\"}],\"messageType\":\"1000\",\"protocol\":\"0\",\"senderRole\":\"*\",\"protocolRoles\":\"client,server\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public int errorCode;
  @Deprecated public java.lang.CharSequence errorMessage;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ProtocolException() {}

  /**
   * All-args constructor.
   * @param errorCode The new value for errorCode
   * @param errorMessage The new value for errorMessage
   */
  public ProtocolException(java.lang.Integer errorCode, java.lang.CharSequence errorMessage) {
    this.errorCode = errorCode;
    this.errorMessage = errorMessage;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return errorCode;
    case 1: return errorMessage;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: errorCode = (java.lang.Integer)value$; break;
    case 1: errorMessage = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'errorCode' field.
   * @return The value of the 'errorCode' field.
   */
  public java.lang.Integer getErrorCode() {
    return errorCode;
  }

  /**
   * Sets the value of the 'errorCode' field.
   * @param value the value to set.
   */
  public void setErrorCode(java.lang.Integer value) {
    this.errorCode = value;
  }

  /**
   * Gets the value of the 'errorMessage' field.
   * @return The value of the 'errorMessage' field.
   */
  public java.lang.CharSequence getErrorMessage() {
    return errorMessage;
  }

  /**
   * Sets the value of the 'errorMessage' field.
   * @param value the value to set.
   */
  public void setErrorMessage(java.lang.CharSequence value) {
    this.errorMessage = value;
  }

  /**
   * Creates a new ProtocolException RecordBuilder.
   * @return A new ProtocolException RecordBuilder
   */
  public static Energistics.Protocol.Core.ProtocolException.Builder newBuilder() {
    return new Energistics.Protocol.Core.ProtocolException.Builder();
  }

  /**
   * Creates a new ProtocolException RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ProtocolException RecordBuilder
   */
  public static Energistics.Protocol.Core.ProtocolException.Builder newBuilder(Energistics.Protocol.Core.ProtocolException.Builder other) {
    return new Energistics.Protocol.Core.ProtocolException.Builder(other);
  }

  /**
   * Creates a new ProtocolException RecordBuilder by copying an existing ProtocolException instance.
   * @param other The existing instance to copy.
   * @return A new ProtocolException RecordBuilder
   */
  public static Energistics.Protocol.Core.ProtocolException.Builder newBuilder(Energistics.Protocol.Core.ProtocolException other) {
    return new Energistics.Protocol.Core.ProtocolException.Builder(other);
  }

  /**
   * RecordBuilder for ProtocolException instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ProtocolException>
    implements org.apache.avro.data.RecordBuilder<ProtocolException> {

    private int errorCode;
    private java.lang.CharSequence errorMessage;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Protocol.Core.ProtocolException.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.errorCode)) {
        this.errorCode = data().deepCopy(fields()[0].schema(), other.errorCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.errorMessage)) {
        this.errorMessage = data().deepCopy(fields()[1].schema(), other.errorMessage);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ProtocolException instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Protocol.Core.ProtocolException other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.errorCode)) {
        this.errorCode = data().deepCopy(fields()[0].schema(), other.errorCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.errorMessage)) {
        this.errorMessage = data().deepCopy(fields()[1].schema(), other.errorMessage);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'errorCode' field.
      * @return The value.
      */
    public java.lang.Integer getErrorCode() {
      return errorCode;
    }

    /**
      * Sets the value of the 'errorCode' field.
      * @param value The value of 'errorCode'.
      * @return This builder.
      */
    public Energistics.Protocol.Core.ProtocolException.Builder setErrorCode(int value) {
      validate(fields()[0], value);
      this.errorCode = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'errorCode' field has been set.
      * @return True if the 'errorCode' field has been set, false otherwise.
      */
    public boolean hasErrorCode() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'errorCode' field.
      * @return This builder.
      */
    public Energistics.Protocol.Core.ProtocolException.Builder clearErrorCode() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'errorMessage' field.
      * @return The value.
      */
    public java.lang.CharSequence getErrorMessage() {
      return errorMessage;
    }

    /**
      * Sets the value of the 'errorMessage' field.
      * @param value The value of 'errorMessage'.
      * @return This builder.
      */
    public Energistics.Protocol.Core.ProtocolException.Builder setErrorMessage(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.errorMessage = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'errorMessage' field has been set.
      * @return True if the 'errorMessage' field has been set, false otherwise.
      */
    public boolean hasErrorMessage() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'errorMessage' field.
      * @return This builder.
      */
    public Energistics.Protocol.Core.ProtocolException.Builder clearErrorMessage() {
      errorMessage = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public ProtocolException build() {
      try {
        ProtocolException record = new ProtocolException();
        record.errorCode = fieldSetFlags()[0] ? this.errorCode : (java.lang.Integer) defaultValue(fields()[0]);
        record.errorMessage = fieldSetFlags()[1] ? this.errorMessage : (java.lang.CharSequence) defaultValue(fields()[1]);
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