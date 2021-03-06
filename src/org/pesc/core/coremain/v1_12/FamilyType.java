//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 05:40:47 PM PST 
//


package org.pesc.core.coremain.v1_12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Family Type
 * 
 * <p>Java class for FamilyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FamilyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Father" type="{urn:org:pesc:core:CoreMain:v1.12.0}PersonType" minOccurs="0"/>
 *         &lt;element name="Mother" type="{urn:org:pesc:core:CoreMain:v1.12.0}PersonType" minOccurs="0"/>
 *         &lt;element name="ParentsMaritalStatusCode" type="{urn:org:pesc:core:CoreMain:v1.12.0}ParentsMaritalStatusCodeType" minOccurs="0"/>
 *         &lt;element name="NoteMessage" type="{urn:org:pesc:core:CoreMain:v1.12.0}NoteMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyType", propOrder = {
    "father",
    "mother",
    "parentsMaritalStatusCode",
    "noteMessage"
})
public class FamilyType {

    @XmlElement(name = "Father")
    protected PersonType father;
    @XmlElement(name = "Mother")
    protected PersonType mother;
    @XmlElement(name = "ParentsMaritalStatusCode")
    protected ParentsMaritalStatusCodeType parentsMaritalStatusCode;
    @XmlElement(name = "NoteMessage")
    protected List<String> noteMessage;

    /**
     * Gets the value of the father property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getFather() {
        return father;
    }

    /**
     * Sets the value of the father property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setFather(PersonType value) {
        this.father = value;
    }

    /**
     * Gets the value of the mother property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getMother() {
        return mother;
    }

    /**
     * Sets the value of the mother property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setMother(PersonType value) {
        this.mother = value;
    }

    /**
     * Gets the value of the parentsMaritalStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ParentsMaritalStatusCodeType }
     *     
     */
    public ParentsMaritalStatusCodeType getParentsMaritalStatusCode() {
        return parentsMaritalStatusCode;
    }

    /**
     * Sets the value of the parentsMaritalStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentsMaritalStatusCodeType }
     *     
     */
    public void setParentsMaritalStatusCode(ParentsMaritalStatusCodeType value) {
        this.parentsMaritalStatusCode = value;
    }

    /**
     * Gets the value of the noteMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noteMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoteMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNoteMessage() {
        if (noteMessage == null) {
            noteMessage = new ArrayList<String>();
        }
        return this.noteMessage;
    }

}
