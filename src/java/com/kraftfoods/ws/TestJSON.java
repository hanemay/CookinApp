
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Parmeter1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Parmeter2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "parmeter1",
    "parmeter2"
})
@XmlRootElement(name = "TestJSON")
public class TestJSON {

    @XmlElement(name = "Parmeter1")
    protected String parmeter1;
    @XmlElement(name = "Parmeter2")
    protected String parmeter2;

    /**
     * Gets the value of the parmeter1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParmeter1() {
        return parmeter1;
    }

    /**
     * Sets the value of the parmeter1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParmeter1(String value) {
        this.parmeter1 = value;
    }

    /**
     * Gets the value of the parmeter2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParmeter2() {
        return parmeter2;
    }

    /**
     * Sets the value of the parmeter2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParmeter2(String value) {
        this.parmeter2 = value;
    }

}
