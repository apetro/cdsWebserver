//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 05:40:47 PM PST 
//


package org.pesc.sector.academicrecord.v1_7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.pesc.core.coremain.v1_12.UserDefinedExtensionsType;


/**
 * The various activities and accomplishments of a student
 * 
 * <p>Java class for StudentActivitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentActivitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalStudentAchievements" type="{urn:org:pesc:sector:AcademicRecord:v1.7.0}AdditionalStudentAchievementsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExtracurricularActivitity" type="{urn:org:pesc:sector:AcademicRecord:v1.7.0}ExtracurricularActivityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserDefinedExtensions" type="{urn:org:pesc:core:CoreMain:v1.12.0}UserDefinedExtensionsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentActivitiesType", propOrder = {
    "additionalStudentAchievements",
    "extracurricularActivitity",
    "userDefinedExtensions"
})
public class StudentActivitiesType {

    @XmlElement(name = "AdditionalStudentAchievements")
    protected List<AdditionalStudentAchievementsType> additionalStudentAchievements;
    @XmlElement(name = "ExtracurricularActivitity")
    protected List<ExtracurricularActivityType> extracurricularActivitity;
    @XmlElement(name = "UserDefinedExtensions")
    protected List<UserDefinedExtensionsType> userDefinedExtensions;

    /**
     * Gets the value of the additionalStudentAchievements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalStudentAchievements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalStudentAchievements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalStudentAchievementsType }
     * 
     * 
     */
    public List<AdditionalStudentAchievementsType> getAdditionalStudentAchievements() {
        if (additionalStudentAchievements == null) {
            additionalStudentAchievements = new ArrayList<AdditionalStudentAchievementsType>();
        }
        return this.additionalStudentAchievements;
    }

    /**
     * Gets the value of the extracurricularActivitity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extracurricularActivitity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtracurricularActivitity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtracurricularActivityType }
     * 
     * 
     */
    public List<ExtracurricularActivityType> getExtracurricularActivitity() {
        if (extracurricularActivitity == null) {
            extracurricularActivitity = new ArrayList<ExtracurricularActivityType>();
        }
        return this.extracurricularActivitity;
    }

    /**
     * Gets the value of the userDefinedExtensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedExtensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedExtensionsType }
     * 
     * 
     */
    public List<UserDefinedExtensionsType> getUserDefinedExtensions() {
        if (userDefinedExtensions == null) {
            userDefinedExtensions = new ArrayList<UserDefinedExtensionsType>();
        }
        return this.userDefinedExtensions;
    }

}
