//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 05:40:47 PM PST 
//


package org.pesc.sector.academicrecord.v1_7;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.pesc.core.coremain.v1_12.GPAType;


/**
 * The academic area that is being reported
 * 
 * <p>Java class for SelfReportedSubjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelfReportedSubjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubjectAreaName" type="{urn:org:pesc:core:CoreMain:v1.12.0}SubjectAreaNameType"/>
 *         &lt;element name="NumberCourses" type="{urn:org:pesc:core:CoreMain:v1.12.0}NumberCoursesType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="GPA" type="{urn:org:pesc:core:CoreMain:v1.12.0}GPAType"/>
 *           &lt;element name="SubjectAverageGrade" type="{urn:org:pesc:sector:AcademicRecord:v1.7.0}CourseGradeType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelfReportedSubjectType", propOrder = {
    "subjectAreaName",
    "numberCourses",
    "gpa",
    "subjectAverageGrade"
})
public class SelfReportedSubjectType {

    @XmlElement(name = "SubjectAreaName", required = true)
    protected String subjectAreaName;
    @XmlElement(name = "NumberCourses")
    protected BigInteger numberCourses;
    @XmlElement(name = "GPA")
    protected GPAType gpa;
    @XmlElement(name = "SubjectAverageGrade")
    protected CourseGradeType subjectAverageGrade;

    /**
     * Gets the value of the subjectAreaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectAreaName() {
        return subjectAreaName;
    }

    /**
     * Sets the value of the subjectAreaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectAreaName(String value) {
        this.subjectAreaName = value;
    }

    /**
     * Gets the value of the numberCourses property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberCourses() {
        return numberCourses;
    }

    /**
     * Sets the value of the numberCourses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberCourses(BigInteger value) {
        this.numberCourses = value;
    }

    /**
     * Gets the value of the gpa property.
     * 
     * @return
     *     possible object is
     *     {@link GPAType }
     *     
     */
    public GPAType getGPA() {
        return gpa;
    }

    /**
     * Sets the value of the gpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPAType }
     *     
     */
    public void setGPA(GPAType value) {
        this.gpa = value;
    }

    /**
     * Gets the value of the subjectAverageGrade property.
     * 
     * @return
     *     possible object is
     *     {@link CourseGradeType }
     *     
     */
    public CourseGradeType getSubjectAverageGrade() {
        return subjectAverageGrade;
    }

    /**
     * Sets the value of the subjectAverageGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseGradeType }
     *     
     */
    public void setSubjectAverageGrade(CourseGradeType value) {
        this.subjectAverageGrade = value;
    }

}
