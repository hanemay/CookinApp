
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SessionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SessionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NewVisitorNewSession"/&gt;
 *     &lt;enumeration value="ExistingVisitorNewSession"/&gt;
 *     &lt;enumeration value="ExistingVisitorExistingSession"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SessionType")
@XmlEnum
public enum SessionType {

    /**
     *
     */
    @XmlEnumValue("NewVisitorNewSession")
    NEW_VISITOR_NEW_SESSION("NewVisitorNewSession"),

    /**
     *
     */
    @XmlEnumValue("ExistingVisitorNewSession")
    EXISTING_VISITOR_NEW_SESSION("ExistingVisitorNewSession"),

    /**
     *
     */
    @XmlEnumValue("ExistingVisitorExistingSession")
    EXISTING_VISITOR_EXISTING_SESSION("ExistingVisitorExistingSession");
    private final String value;

    SessionType(String v) {
        value = v;
    }

    /**
     *
     * @return
     */
    public String value() {
        return value;
    }

    /**
     *
     * @param v
     * @return
     */
    public static SessionType fromValue(String v) {
        for (SessionType c: SessionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
