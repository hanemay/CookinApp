
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
 *         &lt;element name="UserOptinUpdateResult" type="{http://www.kraftfoods.com/ws/}OptinSummaryResponse" minOccurs="0"/&gt;
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
    "userOptinUpdateResult"
})
@XmlRootElement(name = "UserOptinUpdateResponse")
public class UserOptinUpdateResponse {

    @XmlElement(name = "UserOptinUpdateResult")
    protected OptinSummaryResponse userOptinUpdateResult;

    /**
     * Gets the value of the userOptinUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link OptinSummaryResponse }
     *     
     */
    public OptinSummaryResponse getUserOptinUpdateResult() {
        return userOptinUpdateResult;
    }

    /**
     * Sets the value of the userOptinUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptinSummaryResponse }
     *     
     */
    public void setUserOptinUpdateResult(OptinSummaryResponse value) {
        this.userOptinUpdateResult = value;
    }

}
