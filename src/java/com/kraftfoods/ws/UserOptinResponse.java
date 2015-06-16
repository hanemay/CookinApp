
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
 *         &lt;element name="UserOptinResult" type="{http://www.kraftfoods.com/ws/}OptinSummaryResponse" minOccurs="0"/&gt;
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
    "userOptinResult"
})
@XmlRootElement(name = "UserOptinResponse")
public class UserOptinResponse {

    /**
     *
     */
    @XmlElement(name = "UserOptinResult")
    protected OptinSummaryResponse userOptinResult;

    /**
     * Gets the value of the userOptinResult property.
     * 
     * @return
     *     possible object is
     *     {@link OptinSummaryResponse }
     *     
     */
    public OptinSummaryResponse getUserOptinResult() {
        return userOptinResult;
    }

    /**
     * Sets the value of the userOptinResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptinSummaryResponse }
     *     
     */
    public void setUserOptinResult(OptinSummaryResponse value) {
        this.userOptinResult = value;
    }

}
