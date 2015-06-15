
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversionActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Initiation"/&gt;
 *     &lt;enumeration value="Completion"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConversionActionType")
@XmlEnum
public enum ConversionActionType {

    @XmlEnumValue("Initiation")
    INITIATION("Initiation"),
    @XmlEnumValue("Completion")
    COMPLETION("Completion");
    private final String value;

    ConversionActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConversionActionType fromValue(String v) {
        for (ConversionActionType c: ConversionActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
