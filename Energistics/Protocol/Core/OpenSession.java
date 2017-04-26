/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Protocol.Core;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class OpenSession extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3007908091687717683L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OpenSession\",\"namespace\":\"Energistics.Protocol.Core\",\"fields\":[{\"name\":\"applicationName\",\"type\":\"string\"},{\"name\":\"applicationVersion\",\"type\":\"string\"},{\"name\":\"sessionId\",\"type\":\"string\"},{\"name\":\"supportedProtocols\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"SupportedProtocol\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"protocol\",\"type\":\"int\"},{\"name\":\"protocolVersion\",\"type\":{\"type\":\"record\",\"name\":\"Version\",\"fields\":[{\"name\":\"major\",\"type\":\"int\"},{\"name\":\"minor\",\"type\":\"int\"},{\"name\":\"revision\",\"type\":\"int\"},{\"name\":\"patch\",\"type\":\"int\"}]}},{\"name\":\"role\",\"type\":\"string\"},{\"name\":\"protocolCapabilities\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"DataValue\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"double\",\"float\",\"int\",\"long\",\"string\",{\"type\":\"record\",\"name\":\"ArrayOfDouble\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]},\"boolean\",\"bytes\"]}]}}}]}}},{\"name\":\"supportedObjects\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}],\"messageType\":\"2\",\"protocol\":\"0\",\"senderRole\":\"server\",\"protocolRoles\":\"client,server\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence applicationName;
  @Deprecated public java.lang.CharSequence applicationVersion;
  @Deprecated public java.lang.CharSequence sessionId;
  @Deprecated public java.util.List<Energistics.Datatypes.SupportedProtocol> supportedProtocols;
  @Deprecated public java.util.List<java.lang.CharSequence> supportedObjects;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public OpenSession() {}

  /**
   * All-args constructor.
   * @param applicationName The new value for applicationName
   * @param applicationVersion The new value for applicationVersion
   * @param sessionId The new value for sessionId
   * @param supportedProtocols The new value for supportedProtocols
   * @param supportedObjects The new value for supportedObjects
   */
  public OpenSession(java.lang.CharSequence applicationName, java.lang.CharSequence applicationVersion, java.lang.CharSequence sessionId, java.util.List<Energistics.Datatypes.SupportedProtocol> supportedProtocols, java.util.List<java.lang.CharSequence> supportedObjects) {
    this.applicationName = applicationName;
    this.applicationVersion = applicationVersion;
    this.sessionId = sessionId;
    this.supportedProtocols = supportedProtocols;
    this.supportedObjects = supportedObjects;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return applicationName;
    case 1: return applicationVersion;
    case 2: return sessionId;
    case 3: return supportedProtocols;
    case 4: return supportedObjects;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: applicationName = (java.lang.CharSequence)value$; break;
    case 1: applicationVersion = (java.lang.CharSequence)value$; break;
    case 2: sessionId = (java.lang.CharSequence)value$; break;
    case 3: supportedProtocols = (java.util.List<Energistics.Datatypes.SupportedProtocol>)value$; break;
    case 4: supportedObjects = (java.util.List<java.lang.CharSequence>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'applicationName' field.
   * @return The value of the 'applicationName' field.
   */
  public java.lang.CharSequence getApplicationName() {
    return applicationName;
  }

  /**
   * Sets the value of the 'applicationName' field.
   * @param value the value to set.
   */
  public void setApplicationName(java.lang.CharSequence value) {
    this.applicationName = value;
  }

  /**
   * Gets the value of the 'applicationVersion' field.
   * @return The value of the 'applicationVersion' field.
   */
  public java.lang.CharSequence getApplicationVersion() {
    return applicationVersion;
  }

  /**
   * Sets the value of the 'applicationVersion' field.
   * @param value the value to set.
   */
  public void setApplicationVersion(java.lang.CharSequence value) {
    this.applicationVersion = value;
  }

  /**
   * Gets the value of the 'sessionId' field.
   * @return The value of the 'sessionId' field.
   */
  public java.lang.CharSequence getSessionId() {
    return sessionId;
  }

  /**
   * Sets the value of the 'sessionId' field.
   * @param value the value to set.
   */
  public void setSessionId(java.lang.CharSequence value) {
    this.sessionId = value;
  }

  /**
   * Gets the value of the 'supportedProtocols' field.
   * @return The value of the 'supportedProtocols' field.
   */
  public java.util.List<Energistics.Datatypes.SupportedProtocol> getSupportedProtocols() {
    return supportedProtocols;
  }

  /**
   * Sets the value of the 'supportedProtocols' field.
   * @param value the value to set.
   */
  public void setSupportedProtocols(java.util.List<Energistics.Datatypes.SupportedProtocol> value) {
    this.supportedProtocols = value;
  }

  /**
   * Gets the value of the 'supportedObjects' field.
   * @return The value of the 'supportedObjects' field.
   */
  public java.util.List<java.lang.CharSequence> getSupportedObjects() {
    return supportedObjects;
  }

  /**
   * Sets the value of the 'supportedObjects' field.
   * @param value the value to set.
   */
  public void setSupportedObjects(java.util.List<java.lang.CharSequence> value) {
    this.supportedObjects = value;
  }

  /**
   * Creates a new OpenSession RecordBuilder.
   * @return A new OpenSession RecordBuilder
   */
  public static Energistics.Protocol.Core.OpenSession.Builder newBuilder() {
    return new Energistics.Protocol.Core.OpenSession.Builder();
  }

  /**
   * Creates a new OpenSession RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new OpenSession RecordBuilder
   */
  public static Energistics.Protocol.Core.OpenSession.Builder newBuilder(Energistics.Protocol.Core.OpenSession.Builder other) {
    return new Energistics.Protocol.Core.OpenSession.Builder(other);
  }

  /**
   * Creates a new OpenSession RecordBuilder by copying an existing OpenSession instance.
   * @param other The existing instance to copy.
   * @return A new OpenSession RecordBuilder
   */
  public static Energistics.Protocol.Core.OpenSession.Builder newBuilder(Energistics.Protocol.Core.OpenSession other) {
    return new Energistics.Protocol.Core.OpenSession.Builder(other);
  }

  /**
   * RecordBuilder for OpenSession instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OpenSession>
    implements org.apache.avro.data.RecordBuilder<OpenSession> {

    private java.lang.CharSequence applicationName;
    private java.lang.CharSequence applicationVersion;
    private java.lang.CharSequence sessionId;
    private java.util.List<Energistics.Datatypes.SupportedProtocol> supportedProtocols;
    private java.util.List<java.lang.CharSequence> supportedObjects;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Protocol.Core.OpenSession.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.applicationName)) {
        this.applicationName = data().deepCopy(fields()[0].schema(), other.applicationName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.applicationVersion)) {
        this.applicationVersion = data().deepCopy(fields()[1].schema(), other.applicationVersion);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.sessionId)) {
        this.sessionId = data().deepCopy(fields()[2].schema(), other.sessionId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.supportedProtocols)) {
        this.supportedProtocols = data().deepCopy(fields()[3].schema(), other.supportedProtocols);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.supportedObjects)) {
        this.supportedObjects = data().deepCopy(fields()[4].schema(), other.supportedObjects);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing OpenSession instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Protocol.Core.OpenSession other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.applicationName)) {
        this.applicationName = data().deepCopy(fields()[0].schema(), other.applicationName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.applicationVersion)) {
        this.applicationVersion = data().deepCopy(fields()[1].schema(), other.applicationVersion);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.sessionId)) {
        this.sessionId = data().deepCopy(fields()[2].schema(), other.sessionId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.supportedProtocols)) {
        this.supportedProtocols = data().deepCopy(fields()[3].schema(), other.supportedProtocols);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.supportedObjects)) {
        this.supportedObjects = data().deepCopy(fields()[4].schema(), other.supportedObjects);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'applicationName' field.
      * @return The value.
      */
    public java.lang.CharSequence getApplicationName() {
      return applicationName;
    }

    /**
      * Sets the value of the 'applicationName' field.
      * @param value The value of 'applicationName'.
      * @return This builder.
      */
    public Energistics.Protocol.Core.OpenSession.Builder setApplicationName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.applicationName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'applicationName' field has been set.
      * @return True if the 'applicationName' field has been set, false otherwise.
      */
    public boolean hasApplicationName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'applicationName' field.
      * @return This builder.
      */
    public Energistics.Protocol.Core.OpenSession.Builder clearApplicationName() {
      applicationName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'applicationVersion' field.
      * @return The value.
      */
    public java.lang.CharSequence getApplicationVersion() {
      return applicationVersion;
    }

    /**
      * Sets the value of the 'applicationVersion' field.
      * @param value The value of 'applicationVersion'.
      * @return This builder.
      */
    public Energistics.Protocol.Core.OpenSession.Builder setApplicationVersion(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.applicationVersion = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'applicationVersion' field has been set.
      * @return True if the 'applicationVersion' field has been set, false otherwise.
      */
    public boolean hasApplicationVersion() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'applicationVersion' field.
      * @return This builder.
      */
    public Energistics.Protocol.Core.OpenSession.Builder clearApplicationVersion() {
      applicationVersion = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'sessionId' field.
      * @return The value.
      */
    public java.lang.CharSequence getSessionId() {
      return sessionId;
    }

    /**
      * Sets the value of the 'sessionId' field.
      * @param value The value of 'sessionId'.
      * @return This builder.
      */
    public Energistics.Protocol.Core.OpenSession.Builder setSessionId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.sessionId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'sessionId' field has been set.
      * @return True if the 'sessionId' field has been set, false otherwise.
      */
    public boolean hasSessionId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'sessionId' field.
      * @return This builder.
      */
    public Energistics.Protocol.Core.OpenSession.Builder clearSessionId() {
      sessionId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'supportedProtocols' field.
      * @return The value.
      */
    public java.util.List<Energistics.Datatypes.SupportedProtocol> getSupportedProtocols() {
      return supportedProtocols;
    }

    /**
      * Sets the value of the 'supportedProtocols' field.
      * @param value The value of 'supportedProtocols'.
      * @return This builder.
      */
    public Energistics.Protocol.Core.OpenSession.Builder setSupportedProtocols(java.util.List<Energistics.Datatypes.SupportedProtocol> value) {
      validate(fields()[3], value);
      this.supportedProtocols = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'supportedProtocols' field has been set.
      * @return True if the 'supportedProtocols' field has been set, false otherwise.
      */
    public boolean hasSupportedProtocols() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'supportedProtocols' field.
      * @return This builder.
      */
    public Energistics.Protocol.Core.OpenSession.Builder clearSupportedProtocols() {
      supportedProtocols = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'supportedObjects' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getSupportedObjects() {
      return supportedObjects;
    }

    /**
      * Sets the value of the 'supportedObjects' field.
      * @param value The value of 'supportedObjects'.
      * @return This builder.
      */
    public Energistics.Protocol.Core.OpenSession.Builder setSupportedObjects(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[4], value);
      this.supportedObjects = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'supportedObjects' field has been set.
      * @return True if the 'supportedObjects' field has been set, false otherwise.
      */
    public boolean hasSupportedObjects() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'supportedObjects' field.
      * @return This builder.
      */
    public Energistics.Protocol.Core.OpenSession.Builder clearSupportedObjects() {
      supportedObjects = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public OpenSession build() {
      try {
        OpenSession record = new OpenSession();
        record.applicationName = fieldSetFlags()[0] ? this.applicationName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.applicationVersion = fieldSetFlags()[1] ? this.applicationVersion : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.sessionId = fieldSetFlags()[2] ? this.sessionId : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.supportedProtocols = fieldSetFlags()[3] ? this.supportedProtocols : (java.util.List<Energistics.Datatypes.SupportedProtocol>) defaultValue(fields()[3]);
        record.supportedObjects = fieldSetFlags()[4] ? this.supportedObjects : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[4]);
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
