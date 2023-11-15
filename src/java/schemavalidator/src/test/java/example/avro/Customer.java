/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package example.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Customer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1705892140586283933L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Customer\",\"namespace\":\"example.avro\",\"fields\":[{\"name\":\"customer_account_no\",\"type\":\"int\",\"doc\":\"customer account number\"},{\"name\":\"first_name\",\"type\":\"string\"},{\"name\":\"middle_name\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"last_name\",\"type\":\"string\"},{\"name\":\"email_addresses\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}]},{\"name\":\"customer_address\",\"type\":\"string\",\"doc\":\"customer address\"},{\"name\":\"mode_of_payment\",\"type\":{\"type\":\"enum\",\"name\":\"ModeOfPayment\",\"symbols\":[\"CARD\",\"CASH\"]},\"default\":\"CARD\"},{\"name\":\"customer_rating\",\"type\":[\"null\",\"int\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Customer> ENCODER =
      new BinaryMessageEncoder<Customer>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Customer> DECODER =
      new BinaryMessageDecoder<Customer>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Customer> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Customer> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Customer> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Customer>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Customer to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Customer from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Customer instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Customer fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** customer account number */
   private int customer_account_no;
   private java.lang.CharSequence first_name;
   private java.lang.CharSequence middle_name;
   private java.lang.CharSequence last_name;
   private java.util.List<java.lang.CharSequence> email_addresses;
  /** customer address */
   private java.lang.CharSequence customer_address;
   private example.avro.ModeOfPayment mode_of_payment;
   private java.lang.Integer customer_rating;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Customer() {}

  /**
   * All-args constructor.
   * @param customer_account_no customer account number
   * @param first_name The new value for first_name
   * @param middle_name The new value for middle_name
   * @param last_name The new value for last_name
   * @param email_addresses The new value for email_addresses
   * @param customer_address customer address
   * @param mode_of_payment The new value for mode_of_payment
   * @param customer_rating The new value for customer_rating
   */
  public Customer(java.lang.Integer customer_account_no, java.lang.CharSequence first_name, java.lang.CharSequence middle_name, java.lang.CharSequence last_name, java.util.List<java.lang.CharSequence> email_addresses, java.lang.CharSequence customer_address, example.avro.ModeOfPayment mode_of_payment, java.lang.Integer customer_rating) {
    this.customer_account_no = customer_account_no;
    this.first_name = first_name;
    this.middle_name = middle_name;
    this.last_name = last_name;
    this.email_addresses = email_addresses;
    this.customer_address = customer_address;
    this.mode_of_payment = mode_of_payment;
    this.customer_rating = customer_rating;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return customer_account_no;
    case 1: return first_name;
    case 2: return middle_name;
    case 3: return last_name;
    case 4: return email_addresses;
    case 5: return customer_address;
    case 6: return mode_of_payment;
    case 7: return customer_rating;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: customer_account_no = (java.lang.Integer)value$; break;
    case 1: first_name = (java.lang.CharSequence)value$; break;
    case 2: middle_name = (java.lang.CharSequence)value$; break;
    case 3: last_name = (java.lang.CharSequence)value$; break;
    case 4: email_addresses = (java.util.List<java.lang.CharSequence>)value$; break;
    case 5: customer_address = (java.lang.CharSequence)value$; break;
    case 6: mode_of_payment = (example.avro.ModeOfPayment)value$; break;
    case 7: customer_rating = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'customer_account_no' field.
   * @return customer account number
   */
  public int getCustomerAccountNo() {
    return customer_account_no;
  }


  /**
   * Sets the value of the 'customer_account_no' field.
   * customer account number
   * @param value the value to set.
   */
  public void setCustomerAccountNo(int value) {
    this.customer_account_no = value;
  }

  /**
   * Gets the value of the 'first_name' field.
   * @return The value of the 'first_name' field.
   */
  public java.lang.CharSequence getFirstName() {
    return first_name;
  }


  /**
   * Sets the value of the 'first_name' field.
   * @param value the value to set.
   */
  public void setFirstName(java.lang.CharSequence value) {
    this.first_name = value;
  }

  /**
   * Gets the value of the 'middle_name' field.
   * @return The value of the 'middle_name' field.
   */
  public java.lang.CharSequence getMiddleName() {
    return middle_name;
  }


  /**
   * Sets the value of the 'middle_name' field.
   * @param value the value to set.
   */
  public void setMiddleName(java.lang.CharSequence value) {
    this.middle_name = value;
  }

  /**
   * Gets the value of the 'last_name' field.
   * @return The value of the 'last_name' field.
   */
  public java.lang.CharSequence getLastName() {
    return last_name;
  }


  /**
   * Sets the value of the 'last_name' field.
   * @param value the value to set.
   */
  public void setLastName(java.lang.CharSequence value) {
    this.last_name = value;
  }

  /**
   * Gets the value of the 'email_addresses' field.
   * @return The value of the 'email_addresses' field.
   */
  public java.util.List<java.lang.CharSequence> getEmailAddresses() {
    return email_addresses;
  }


  /**
   * Sets the value of the 'email_addresses' field.
   * @param value the value to set.
   */
  public void setEmailAddresses(java.util.List<java.lang.CharSequence> value) {
    this.email_addresses = value;
  }

  /**
   * Gets the value of the 'customer_address' field.
   * @return customer address
   */
  public java.lang.CharSequence getCustomerAddress() {
    return customer_address;
  }


  /**
   * Sets the value of the 'customer_address' field.
   * customer address
   * @param value the value to set.
   */
  public void setCustomerAddress(java.lang.CharSequence value) {
    this.customer_address = value;
  }

  /**
   * Gets the value of the 'mode_of_payment' field.
   * @return The value of the 'mode_of_payment' field.
   */
  public example.avro.ModeOfPayment getModeOfPayment() {
    return mode_of_payment;
  }


  /**
   * Sets the value of the 'mode_of_payment' field.
   * @param value the value to set.
   */
  public void setModeOfPayment(example.avro.ModeOfPayment value) {
    this.mode_of_payment = value;
  }

  /**
   * Gets the value of the 'customer_rating' field.
   * @return The value of the 'customer_rating' field.
   */
  public java.lang.Integer getCustomerRating() {
    return customer_rating;
  }


  /**
   * Sets the value of the 'customer_rating' field.
   * @param value the value to set.
   */
  public void setCustomerRating(java.lang.Integer value) {
    this.customer_rating = value;
  }

  /**
   * Creates a new Customer RecordBuilder.
   * @return A new Customer RecordBuilder
   */
  public static example.avro.Customer.Builder newBuilder() {
    return new example.avro.Customer.Builder();
  }

  /**
   * Creates a new Customer RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Customer RecordBuilder
   */
  public static example.avro.Customer.Builder newBuilder(example.avro.Customer.Builder other) {
    if (other == null) {
      return new example.avro.Customer.Builder();
    } else {
      return new example.avro.Customer.Builder(other);
    }
  }

  /**
   * Creates a new Customer RecordBuilder by copying an existing Customer instance.
   * @param other The existing instance to copy.
   * @return A new Customer RecordBuilder
   */
  public static example.avro.Customer.Builder newBuilder(example.avro.Customer other) {
    if (other == null) {
      return new example.avro.Customer.Builder();
    } else {
      return new example.avro.Customer.Builder(other);
    }
  }

  /**
   * RecordBuilder for Customer instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Customer>
    implements org.apache.avro.data.RecordBuilder<Customer> {

    /** customer account number */
    private int customer_account_no;
    private java.lang.CharSequence first_name;
    private java.lang.CharSequence middle_name;
    private java.lang.CharSequence last_name;
    private java.util.List<java.lang.CharSequence> email_addresses;
    /** customer address */
    private java.lang.CharSequence customer_address;
    private example.avro.ModeOfPayment mode_of_payment;
    private java.lang.Integer customer_rating;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(example.avro.Customer.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.customer_account_no)) {
        this.customer_account_no = data().deepCopy(fields()[0].schema(), other.customer_account_no);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.first_name)) {
        this.first_name = data().deepCopy(fields()[1].schema(), other.first_name);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.middle_name)) {
        this.middle_name = data().deepCopy(fields()[2].schema(), other.middle_name);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.last_name)) {
        this.last_name = data().deepCopy(fields()[3].schema(), other.last_name);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.email_addresses)) {
        this.email_addresses = data().deepCopy(fields()[4].schema(), other.email_addresses);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.customer_address)) {
        this.customer_address = data().deepCopy(fields()[5].schema(), other.customer_address);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.mode_of_payment)) {
        this.mode_of_payment = data().deepCopy(fields()[6].schema(), other.mode_of_payment);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.customer_rating)) {
        this.customer_rating = data().deepCopy(fields()[7].schema(), other.customer_rating);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
    }

    /**
     * Creates a Builder by copying an existing Customer instance
     * @param other The existing instance to copy.
     */
    private Builder(example.avro.Customer other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.customer_account_no)) {
        this.customer_account_no = data().deepCopy(fields()[0].schema(), other.customer_account_no);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.first_name)) {
        this.first_name = data().deepCopy(fields()[1].schema(), other.first_name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.middle_name)) {
        this.middle_name = data().deepCopy(fields()[2].schema(), other.middle_name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.last_name)) {
        this.last_name = data().deepCopy(fields()[3].schema(), other.last_name);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.email_addresses)) {
        this.email_addresses = data().deepCopy(fields()[4].schema(), other.email_addresses);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.customer_address)) {
        this.customer_address = data().deepCopy(fields()[5].schema(), other.customer_address);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.mode_of_payment)) {
        this.mode_of_payment = data().deepCopy(fields()[6].schema(), other.mode_of_payment);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.customer_rating)) {
        this.customer_rating = data().deepCopy(fields()[7].schema(), other.customer_rating);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'customer_account_no' field.
      * customer account number
      * @return The value.
      */
    public int getCustomerAccountNo() {
      return customer_account_no;
    }


    /**
      * Sets the value of the 'customer_account_no' field.
      * customer account number
      * @param value The value of 'customer_account_no'.
      * @return This builder.
      */
    public example.avro.Customer.Builder setCustomerAccountNo(int value) {
      validate(fields()[0], value);
      this.customer_account_no = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'customer_account_no' field has been set.
      * customer account number
      * @return True if the 'customer_account_no' field has been set, false otherwise.
      */
    public boolean hasCustomerAccountNo() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'customer_account_no' field.
      * customer account number
      * @return This builder.
      */
    public example.avro.Customer.Builder clearCustomerAccountNo() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'first_name' field.
      * @return The value.
      */
    public java.lang.CharSequence getFirstName() {
      return first_name;
    }


    /**
      * Sets the value of the 'first_name' field.
      * @param value The value of 'first_name'.
      * @return This builder.
      */
    public example.avro.Customer.Builder setFirstName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.first_name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'first_name' field has been set.
      * @return True if the 'first_name' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'first_name' field.
      * @return This builder.
      */
    public example.avro.Customer.Builder clearFirstName() {
      first_name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'middle_name' field.
      * @return The value.
      */
    public java.lang.CharSequence getMiddleName() {
      return middle_name;
    }


    /**
      * Sets the value of the 'middle_name' field.
      * @param value The value of 'middle_name'.
      * @return This builder.
      */
    public example.avro.Customer.Builder setMiddleName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.middle_name = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'middle_name' field has been set.
      * @return True if the 'middle_name' field has been set, false otherwise.
      */
    public boolean hasMiddleName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'middle_name' field.
      * @return This builder.
      */
    public example.avro.Customer.Builder clearMiddleName() {
      middle_name = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'last_name' field.
      * @return The value.
      */
    public java.lang.CharSequence getLastName() {
      return last_name;
    }


    /**
      * Sets the value of the 'last_name' field.
      * @param value The value of 'last_name'.
      * @return This builder.
      */
    public example.avro.Customer.Builder setLastName(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.last_name = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'last_name' field has been set.
      * @return True if the 'last_name' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'last_name' field.
      * @return This builder.
      */
    public example.avro.Customer.Builder clearLastName() {
      last_name = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'email_addresses' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getEmailAddresses() {
      return email_addresses;
    }


    /**
      * Sets the value of the 'email_addresses' field.
      * @param value The value of 'email_addresses'.
      * @return This builder.
      */
    public example.avro.Customer.Builder setEmailAddresses(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[4], value);
      this.email_addresses = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'email_addresses' field has been set.
      * @return True if the 'email_addresses' field has been set, false otherwise.
      */
    public boolean hasEmailAddresses() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'email_addresses' field.
      * @return This builder.
      */
    public example.avro.Customer.Builder clearEmailAddresses() {
      email_addresses = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'customer_address' field.
      * customer address
      * @return The value.
      */
    public java.lang.CharSequence getCustomerAddress() {
      return customer_address;
    }


    /**
      * Sets the value of the 'customer_address' field.
      * customer address
      * @param value The value of 'customer_address'.
      * @return This builder.
      */
    public example.avro.Customer.Builder setCustomerAddress(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.customer_address = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'customer_address' field has been set.
      * customer address
      * @return True if the 'customer_address' field has been set, false otherwise.
      */
    public boolean hasCustomerAddress() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'customer_address' field.
      * customer address
      * @return This builder.
      */
    public example.avro.Customer.Builder clearCustomerAddress() {
      customer_address = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'mode_of_payment' field.
      * @return The value.
      */
    public example.avro.ModeOfPayment getModeOfPayment() {
      return mode_of_payment;
    }


    /**
      * Sets the value of the 'mode_of_payment' field.
      * @param value The value of 'mode_of_payment'.
      * @return This builder.
      */
    public example.avro.Customer.Builder setModeOfPayment(example.avro.ModeOfPayment value) {
      validate(fields()[6], value);
      this.mode_of_payment = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'mode_of_payment' field has been set.
      * @return True if the 'mode_of_payment' field has been set, false otherwise.
      */
    public boolean hasModeOfPayment() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'mode_of_payment' field.
      * @return This builder.
      */
    public example.avro.Customer.Builder clearModeOfPayment() {
      mode_of_payment = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'customer_rating' field.
      * @return The value.
      */
    public java.lang.Integer getCustomerRating() {
      return customer_rating;
    }


    /**
      * Sets the value of the 'customer_rating' field.
      * @param value The value of 'customer_rating'.
      * @return This builder.
      */
    public example.avro.Customer.Builder setCustomerRating(java.lang.Integer value) {
      validate(fields()[7], value);
      this.customer_rating = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'customer_rating' field has been set.
      * @return True if the 'customer_rating' field has been set, false otherwise.
      */
    public boolean hasCustomerRating() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'customer_rating' field.
      * @return This builder.
      */
    public example.avro.Customer.Builder clearCustomerRating() {
      customer_rating = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Customer build() {
      try {
        Customer record = new Customer();
        record.customer_account_no = fieldSetFlags()[0] ? this.customer_account_no : (java.lang.Integer) defaultValue(fields()[0]);
        record.first_name = fieldSetFlags()[1] ? this.first_name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.middle_name = fieldSetFlags()[2] ? this.middle_name : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.last_name = fieldSetFlags()[3] ? this.last_name : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.email_addresses = fieldSetFlags()[4] ? this.email_addresses : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[4]);
        record.customer_address = fieldSetFlags()[5] ? this.customer_address : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.mode_of_payment = fieldSetFlags()[6] ? this.mode_of_payment : (example.avro.ModeOfPayment) defaultValue(fields()[6]);
        record.customer_rating = fieldSetFlags()[7] ? this.customer_rating : (java.lang.Integer) defaultValue(fields()[7]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Customer>
    WRITER$ = (org.apache.avro.io.DatumWriter<Customer>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Customer>
    READER$ = (org.apache.avro.io.DatumReader<Customer>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.customer_account_no);

    out.writeString(this.first_name);

    if (this.middle_name == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.middle_name);
    }

    out.writeString(this.last_name);

    if (this.email_addresses == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      long size0 = this.email_addresses.size();
      out.writeArrayStart();
      out.setItemCount(size0);
      long actualSize0 = 0;
      for (java.lang.CharSequence e0: this.email_addresses) {
        actualSize0++;
        out.startItem();
        out.writeString(e0);
      }
      out.writeArrayEnd();
      if (actualSize0 != size0)
        throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");
    }

    out.writeString(this.customer_address);

    out.writeEnum(this.mode_of_payment.ordinal());

    if (this.customer_rating == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeInt(this.customer_rating);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.customer_account_no = in.readInt();

      this.first_name = in.readString(this.first_name instanceof Utf8 ? (Utf8)this.first_name : null);

      if (in.readIndex() != 1) {
        in.readNull();
        this.middle_name = null;
      } else {
        this.middle_name = in.readString(this.middle_name instanceof Utf8 ? (Utf8)this.middle_name : null);
      }

      this.last_name = in.readString(this.last_name instanceof Utf8 ? (Utf8)this.last_name : null);

      if (in.readIndex() != 1) {
        in.readNull();
        this.email_addresses = null;
      } else {
        long size0 = in.readArrayStart();
        java.util.List<java.lang.CharSequence> a0 = this.email_addresses;
        if (a0 == null) {
          a0 = new SpecificData.Array<java.lang.CharSequence>((int)size0, SCHEMA$.getField("email_addresses").schema().getTypes().get(1));
          this.email_addresses = a0;
        } else a0.clear();
        SpecificData.Array<java.lang.CharSequence> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.CharSequence>)a0 : null);
        for ( ; 0 < size0; size0 = in.arrayNext()) {
          for ( ; size0 != 0; size0--) {
            java.lang.CharSequence e0 = (ga0 != null ? ga0.peek() : null);
            e0 = in.readString(e0 instanceof Utf8 ? (Utf8)e0 : null);
            a0.add(e0);
          }
        }
      }

      this.customer_address = in.readString(this.customer_address instanceof Utf8 ? (Utf8)this.customer_address : null);

      this.mode_of_payment = example.avro.ModeOfPayment.values()[in.readEnum()];

      if (in.readIndex() != 1) {
        in.readNull();
        this.customer_rating = null;
      } else {
        this.customer_rating = in.readInt();
      }

    } else {
      for (int i = 0; i < 8; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.customer_account_no = in.readInt();
          break;

        case 1:
          this.first_name = in.readString(this.first_name instanceof Utf8 ? (Utf8)this.first_name : null);
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.middle_name = null;
          } else {
            this.middle_name = in.readString(this.middle_name instanceof Utf8 ? (Utf8)this.middle_name : null);
          }
          break;

        case 3:
          this.last_name = in.readString(this.last_name instanceof Utf8 ? (Utf8)this.last_name : null);
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.email_addresses = null;
          } else {
            long size0 = in.readArrayStart();
            java.util.List<java.lang.CharSequence> a0 = this.email_addresses;
            if (a0 == null) {
              a0 = new SpecificData.Array<java.lang.CharSequence>((int)size0, SCHEMA$.getField("email_addresses").schema().getTypes().get(1));
              this.email_addresses = a0;
            } else a0.clear();
            SpecificData.Array<java.lang.CharSequence> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.CharSequence>)a0 : null);
            for ( ; 0 < size0; size0 = in.arrayNext()) {
              for ( ; size0 != 0; size0--) {
                java.lang.CharSequence e0 = (ga0 != null ? ga0.peek() : null);
                e0 = in.readString(e0 instanceof Utf8 ? (Utf8)e0 : null);
                a0.add(e0);
              }
            }
          }
          break;

        case 5:
          this.customer_address = in.readString(this.customer_address instanceof Utf8 ? (Utf8)this.customer_address : null);
          break;

        case 6:
          this.mode_of_payment = example.avro.ModeOfPayment.values()[in.readEnum()];
          break;

        case 7:
          if (in.readIndex() != 1) {
            in.readNull();
            this.customer_rating = null;
          } else {
            this.customer_rating = in.readInt();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










