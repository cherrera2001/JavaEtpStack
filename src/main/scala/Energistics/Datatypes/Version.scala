/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package Energistics.Datatypes

import scala.annotation.switch

case class Version(var major: Int, var minor: Int, var revision: Int, var patch: Int) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(0, 0, 0, 0)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        major
      }.asInstanceOf[AnyRef]
      case 1 => {
        minor
      }.asInstanceOf[AnyRef]
      case 2 => {
        revision
      }.asInstanceOf[AnyRef]
      case 3 => {
        patch
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.major = {
        value
      }.asInstanceOf[Int]
      case 1 => this.minor = {
        value
      }.asInstanceOf[Int]
      case 2 => this.revision = {
        value
      }.asInstanceOf[Int]
      case 3 => this.patch = {
        value
      }.asInstanceOf[Int]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = Version.SCHEMA$
}

object Version {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Version\",\"namespace\":\"Energistics.Datatypes\",\"fields\":[{\"name\":\"major\",\"type\":\"int\"},{\"name\":\"minor\",\"type\":\"int\"},{\"name\":\"revision\",\"type\":\"int\"},{\"name\":\"patch\",\"type\":\"int\"}]}")
}