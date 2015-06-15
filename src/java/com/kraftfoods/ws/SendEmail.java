
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="sMessageFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sMessageTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sMessageSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sMessageBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bIsMessageTypeHTML" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "sMessageFrom",
    "sMessageTo",
    "sMessageSubject",
    "sMessageBody",
    "bIsMessageTypeHTML"
})
@XmlRootElement(name = "SendEmail")
public class SendEmail {

    protected String sMessageFrom;
    protected String sMessageTo;
    protected String sMessageSubject;
    protected String sMessageBody;
    protected boolean bIsMessageTypeHTML;

    /**
     * Gets the value of the sMessageFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMessageFrom() {
        return sMessageFrom;
    }

    /**
     * Sets the value of the sMessageFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMessageFrom(String value) {
        this.sMessageFrom = value;
    }

    /**
     * Gets the value of the sMessageTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMessageTo() {
        return sMessageTo;
    }

    /**
     * Sets the value of the sMessageTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMessageTo(String value) {
        this.sMessageTo = value;
    }

    /**
     * Gets the value of the sMessageSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMessageSubject() {
        return sMessageSubject;
    }

    /**
     * Sets the value of the sMessageSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMessageSubject(String value) {
        this.sMessageSubject = value;
    }

    /**
     * Gets the value of the sMessageBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMessageBody() {
        return sMessageBody;
    }

    /**
     * Sets the value of the sMessageBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMessageBody(String value) {
        this.sMessageBody = value;
    }

    /**
     * Gets the value of the bIsMessageTypeHTML property.
     * 
     */
    public boolean isBIsMessageTypeHTML() {
        return bIsMessageTypeHTML;
    }

    /**
     * Sets the value of the bIsMessageTypeHTML property.
     * 
     */
    public void setBIsMessageTypeHTML(boolean value) {
        this.bIsMessageTypeHTML = value;
    }

}
