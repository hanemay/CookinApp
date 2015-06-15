
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
 *         &lt;element name="SendSMSMessageResult" type="{http://www.kraftfoods.com/ws/}StatusResponse" minOccurs="0"/&gt;
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
    "sendSMSMessageResult"
})
@XmlRootElement(name = "SendSMSMessageResponse")
public class SendSMSMessageResponse {

    @XmlElement(name = "SendSMSMessageResult")
    protected StatusResponse sendSMSMessageResult;

    /**
     * Gets the value of the sendSMSMessageResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatusResponse }
     *     
     */
    public StatusResponse getSendSMSMessageResult() {
        return sendSMSMessageResult;
    }

    /**
     * Sets the value of the sendSMSMessageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusResponse }
     *     
     */
    public void setSendSMSMessageResult(StatusResponse value) {
        this.sendSMSMessageResult = value;
    }

}
