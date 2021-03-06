//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 05:40:47 PM PST 
//


package org.pesc.cds.edexchange.v1_7;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpeedCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpeedCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Fast"/>
 *     &lt;enumeration value="Fastest"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpeedCodeType")
@XmlEnum
public enum SpeedCodeType {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Fast")
    FAST("Fast"),
    @XmlEnumValue("Fastest")
    FASTEST("Fastest");
    private final String value;

    SpeedCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpeedCodeType fromValue(String v) {
        for (SpeedCodeType c: SpeedCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
