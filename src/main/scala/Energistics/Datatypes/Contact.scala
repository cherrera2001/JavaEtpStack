/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Datatypes

import scala.annotation.switch

case class Contact(var organizationName: Option[String], var contactName: Option[String], var contactPhone: Option[String], var contactEmail: Option[String]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(None, None, None, None)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        organizationName match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 1 => {
        contactName match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 2 => {
        contactPhone match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 3 => {
        contactEmail match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.organizationName = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 1 => this.contactName = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 2 => this.contactPhone = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 3 => this.contactEmail = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = Contact.SCHEMA$
}

object Contact {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Contact\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"organizationName\",\"type\":[\"null\",\"string\"]},{\"name\":\"contactName\",\"type\":[\"null\",\"string\"]},{\"name\":\"contactPhone\",\"type\":[\"null\",\"string\"]},{\"name\":\"contactEmail\",\"type\":[\"null\",\"string\"]}]}")
}