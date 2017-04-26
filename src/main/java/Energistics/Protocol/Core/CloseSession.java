/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Protocol.Core;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CloseSession extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4001924043819995519L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CloseSession\",\"namespace\":\"Energistics.Protocol.Core\",\"fields\":[{\"name\":\"reason\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}],\"messageType\":\"5\",\"protocol\":\"0\",\"senderRole\":\"client,server\",\"protocolRoles\":\"client,server\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String reason;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CloseSession() {}

  /**
   * All-args constructor.
   * @param reason The new value for reason
   */
  public CloseSession(java.lang.String reason) {
    this.reason = reason;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return reason;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: reason = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'reason' field.
   * @return The value of the 'reason' field.
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * Sets the value of the 'reason' field.
   * @param value the value to set.
   */
  public void setReason(java.lang.String value) {
    this.reason = value;
  }

  /**
   * Creates a new CloseSession RecordBuilder.
   * @return A new CloseSession RecordBuilder
   */
  public static Energistics.Protocol.Core.CloseSession.Builder newBuilder() {
    return new Energistics.Protocol.Core.CloseSession.Builder();
  }

  /**
   * Creates a new CloseSession RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CloseSession RecordBuilder
   */
  public static Energistics.Protocol.Core.CloseSession.Builder newBuilder(Energistics.Protocol.Core.CloseSession.Builder other) {
    return new Energistics.Protocol.Core.CloseSession.Builder(other);
  }

  /**
   * Creates a new CloseSession RecordBuilder by copying an existing CloseSession instance.
   * @param other The existing instance to copy.
   * @return A new CloseSession RecordBuilder
   */
  public static Energistics.Protocol.Core.CloseSession.Builder newBuilder(Energistics.Protocol.Core.CloseSession other) {
    return new Energistics.Protocol.Core.CloseSession.Builder(other);
  }

  /**
   * RecordBuilder for CloseSession instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CloseSession>
    implements org.apache.avro.data.RecordBuilder<CloseSession> {

    private java.lang.String reason;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Protocol.Core.CloseSession.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.reason)) {
        this.reason = data().deepCopy(fields()[0].schema(), other.reason);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing CloseSession instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Protocol.Core.CloseSession other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.reason)) {
        this.reason = data().deepCopy(fields()[0].schema(), other.reason);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'reason' field.
      * @return The value.
      */
    public java.lang.String getReason() {
      return reason;
    }

    /**
      * Sets the value of the 'reason' field.
      * @param value The value of 'reason'.
      * @return This builder.
      */
    public Energistics.Protocol.Core.CloseSession.Builder setReason(java.lang.String value) {
      validate(fields()[0], value);
      this.reason = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'reason' field has been set.
      * @return True if the 'reason' field has been set, false otherwise.
      */
    public boolean hasReason() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'reason' field.
      * @return This builder.
      */
    public Energistics.Protocol.Core.CloseSession.Builder clearReason() {
      reason = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public CloseSession build() {
      try {
        CloseSession record = new CloseSession();
        record.reason = fieldSetFlags()[0] ? this.reason : (java.lang.String) defaultValue(fields()[0]);
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
