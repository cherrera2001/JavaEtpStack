/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Datatypes;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Contact extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1279327395218543652L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Contact\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"organizationName\",\"type\":[\"null\",\"string\"]},{\"name\":\"contactName\",\"type\":[\"null\",\"string\"]},{\"name\":\"contactPhone\",\"type\":[\"null\",\"string\"]},{\"name\":\"contactEmail\",\"type\":[\"null\",\"string\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence organizationName;
  @Deprecated public java.lang.CharSequence contactName;
  @Deprecated public java.lang.CharSequence contactPhone;
  @Deprecated public java.lang.CharSequence contactEmail;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Contact() {}

  /**
   * All-args constructor.
   * @param organizationName The new value for organizationName
   * @param contactName The new value for contactName
   * @param contactPhone The new value for contactPhone
   * @param contactEmail The new value for contactEmail
   */
  public Contact(java.lang.CharSequence organizationName, java.lang.CharSequence contactName, java.lang.CharSequence contactPhone, java.lang.CharSequence contactEmail) {
    this.organizationName = organizationName;
    this.contactName = contactName;
    this.contactPhone = contactPhone;
    this.contactEmail = contactEmail;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return organizationName;
    case 1: return contactName;
    case 2: return contactPhone;
    case 3: return contactEmail;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: organizationName = (java.lang.CharSequence)value$; break;
    case 1: contactName = (java.lang.CharSequence)value$; break;
    case 2: contactPhone = (java.lang.CharSequence)value$; break;
    case 3: contactEmail = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'organizationName' field.
   * @return The value of the 'organizationName' field.
   */
  public java.lang.CharSequence getOrganizationName() {
    return organizationName;
  }

  /**
   * Sets the value of the 'organizationName' field.
   * @param value the value to set.
   */
  public void setOrganizationName(java.lang.CharSequence value) {
    this.organizationName = value;
  }

  /**
   * Gets the value of the 'contactName' field.
   * @return The value of the 'contactName' field.
   */
  public java.lang.CharSequence getContactName() {
    return contactName;
  }

  /**
   * Sets the value of the 'contactName' field.
   * @param value the value to set.
   */
  public void setContactName(java.lang.CharSequence value) {
    this.contactName = value;
  }

  /**
   * Gets the value of the 'contactPhone' field.
   * @return The value of the 'contactPhone' field.
   */
  public java.lang.CharSequence getContactPhone() {
    return contactPhone;
  }

  /**
   * Sets the value of the 'contactPhone' field.
   * @param value the value to set.
   */
  public void setContactPhone(java.lang.CharSequence value) {
    this.contactPhone = value;
  }

  /**
   * Gets the value of the 'contactEmail' field.
   * @return The value of the 'contactEmail' field.
   */
  public java.lang.CharSequence getContactEmail() {
    return contactEmail;
  }

  /**
   * Sets the value of the 'contactEmail' field.
   * @param value the value to set.
   */
  public void setContactEmail(java.lang.CharSequence value) {
    this.contactEmail = value;
  }

  /**
   * Creates a new Contact RecordBuilder.
   * @return A new Contact RecordBuilder
   */
  public static Energistics.Datatypes.Contact.Builder newBuilder() {
    return new Energistics.Datatypes.Contact.Builder();
  }

  /**
   * Creates a new Contact RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Contact RecordBuilder
   */
  public static Energistics.Datatypes.Contact.Builder newBuilder(Energistics.Datatypes.Contact.Builder other) {
    return new Energistics.Datatypes.Contact.Builder(other);
  }

  /**
   * Creates a new Contact RecordBuilder by copying an existing Contact instance.
   * @param other The existing instance to copy.
   * @return A new Contact RecordBuilder
   */
  public static Energistics.Datatypes.Contact.Builder newBuilder(Energistics.Datatypes.Contact other) {
    return new Energistics.Datatypes.Contact.Builder(other);
  }

  /**
   * RecordBuilder for Contact instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Contact>
    implements org.apache.avro.data.RecordBuilder<Contact> {

    private java.lang.CharSequence organizationName;
    private java.lang.CharSequence contactName;
    private java.lang.CharSequence contactPhone;
    private java.lang.CharSequence contactEmail;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Datatypes.Contact.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.organizationName)) {
        this.organizationName = data().deepCopy(fields()[0].schema(), other.organizationName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.contactName)) {
        this.contactName = data().deepCopy(fields()[1].schema(), other.contactName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.contactPhone)) {
        this.contactPhone = data().deepCopy(fields()[2].schema(), other.contactPhone);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.contactEmail)) {
        this.contactEmail = data().deepCopy(fields()[3].schema(), other.contactEmail);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Contact instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Datatypes.Contact other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.organizationName)) {
        this.organizationName = data().deepCopy(fields()[0].schema(), other.organizationName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.contactName)) {
        this.contactName = data().deepCopy(fields()[1].schema(), other.contactName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.contactPhone)) {
        this.contactPhone = data().deepCopy(fields()[2].schema(), other.contactPhone);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.contactEmail)) {
        this.contactEmail = data().deepCopy(fields()[3].schema(), other.contactEmail);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'organizationName' field.
      * @return The value.
      */
    public java.lang.CharSequence getOrganizationName() {
      return organizationName;
    }

    /**
      * Sets the value of the 'organizationName' field.
      * @param value The value of 'organizationName'.
      * @return This builder.
      */
    public Energistics.Datatypes.Contact.Builder setOrganizationName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.organizationName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'organizationName' field has been set.
      * @return True if the 'organizationName' field has been set, false otherwise.
      */
    public boolean hasOrganizationName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'organizationName' field.
      * @return This builder.
      */
    public Energistics.Datatypes.Contact.Builder clearOrganizationName() {
      organizationName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'contactName' field.
      * @return The value.
      */
    public java.lang.CharSequence getContactName() {
      return contactName;
    }

    /**
      * Sets the value of the 'contactName' field.
      * @param value The value of 'contactName'.
      * @return This builder.
      */
    public Energistics.Datatypes.Contact.Builder setContactName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.contactName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'contactName' field has been set.
      * @return True if the 'contactName' field has been set, false otherwise.
      */
    public boolean hasContactName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'contactName' field.
      * @return This builder.
      */
    public Energistics.Datatypes.Contact.Builder clearContactName() {
      contactName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'contactPhone' field.
      * @return The value.
      */
    public java.lang.CharSequence getContactPhone() {
      return contactPhone;
    }

    /**
      * Sets the value of the 'contactPhone' field.
      * @param value The value of 'contactPhone'.
      * @return This builder.
      */
    public Energistics.Datatypes.Contact.Builder setContactPhone(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.contactPhone = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'contactPhone' field has been set.
      * @return True if the 'contactPhone' field has been set, false otherwise.
      */
    public boolean hasContactPhone() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'contactPhone' field.
      * @return This builder.
      */
    public Energistics.Datatypes.Contact.Builder clearContactPhone() {
      contactPhone = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'contactEmail' field.
      * @return The value.
      */
    public java.lang.CharSequence getContactEmail() {
      return contactEmail;
    }

    /**
      * Sets the value of the 'contactEmail' field.
      * @param value The value of 'contactEmail'.
      * @return This builder.
      */
    public Energistics.Datatypes.Contact.Builder setContactEmail(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.contactEmail = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'contactEmail' field has been set.
      * @return True if the 'contactEmail' field has been set, false otherwise.
      */
    public boolean hasContactEmail() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'contactEmail' field.
      * @return This builder.
      */
    public Energistics.Datatypes.Contact.Builder clearContactEmail() {
      contactEmail = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Contact build() {
      try {
        Contact record = new Contact();
        record.organizationName = fieldSetFlags()[0] ? this.organizationName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.contactName = fieldSetFlags()[1] ? this.contactName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.contactPhone = fieldSetFlags()[2] ? this.contactPhone : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.contactEmail = fieldSetFlags()[3] ? this.contactEmail : (java.lang.CharSequence) defaultValue(fields()[3]);
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
