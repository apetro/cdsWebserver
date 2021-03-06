//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 05:40:47 PM PST 
//


package org.pesc.core.coremain.v1_12;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcademicAwardEarnedPriorToAdmissionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AcademicAwardEarnedPriorToAdmissionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AssociateDegree"/>
 *     &lt;enumeration value="BaccalaureateDegree"/>
 *     &lt;enumeration value="Doctorate"/>
 *     &lt;enumeration value="MastersDegree"/>
 *     &lt;enumeration value="ProfessionalDegree"/>
 *     &lt;enumeration value="TwoYearCollegeDiploma"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AcademicAwardEarnedPriorToAdmissionCodeType")
@XmlEnum
public enum AcademicAwardEarnedPriorToAdmissionCodeType {

    @XmlEnumValue("AssociateDegree")
    ASSOCIATE_DEGREE("AssociateDegree"),
    @XmlEnumValue("BaccalaureateDegree")
    BACCALAUREATE_DEGREE("BaccalaureateDegree"),
    @XmlEnumValue("Doctorate")
    DOCTORATE("Doctorate"),
    @XmlEnumValue("MastersDegree")
    MASTERS_DEGREE("MastersDegree"),
    @XmlEnumValue("ProfessionalDegree")
    PROFESSIONAL_DEGREE("ProfessionalDegree"),
    @XmlEnumValue("TwoYearCollegeDiploma")
    TWO_YEAR_COLLEGE_DIPLOMA("TwoYearCollegeDiploma");
    private final String value;

    AcademicAwardEarnedPriorToAdmissionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AcademicAwardEarnedPriorToAdmissionCodeType fromValue(String v) {
        for (AcademicAwardEarnedPriorToAdmissionCodeType c: AcademicAwardEarnedPriorToAdmissionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
