
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
 *         &lt;element name="SendRecipeToEmailResult" type="{http://www.kraftfoods.com/ws/}StatusResponse" minOccurs="0"/&gt;
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
    "sendRecipeToEmailResult"
})
@XmlRootElement(name = "SendRecipeToEmailResponse")
public class SendRecipeToEmailResponse {

    /**
     *
     */
    @XmlElement(name = "SendRecipeToEmailResult")
    protected StatusResponse sendRecipeToEmailResult;

    /**
     * Gets the value of the sendRecipeToEmailResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatusResponse }
     *     
     */
    public StatusResponse getSendRecipeToEmailResult() {
        return sendRecipeToEmailResult;
    }

    /**
     * Sets the value of the sendRecipeToEmailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusResponse }
     *     
     */
    public void setSendRecipeToEmailResult(StatusResponse value) {
        this.sendRecipeToEmailResult = value;
    }

}
