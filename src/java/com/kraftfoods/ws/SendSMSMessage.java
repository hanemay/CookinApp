
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
 *         &lt;element name="sRecipeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sRecipeURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sSenderEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sDestPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "sRecipeName",
    "sRecipeURL",
    "sSenderEmail",
    "sDestPhoneNumber"
})
@XmlRootElement(name = "SendSMSMessage")
public class SendSMSMessage {

    /**
     *
     */
    protected String sRecipeName;

    /**
     *
     */
    protected String sRecipeURL;

    /**
     *
     */
    protected String sSenderEmail;

    /**
     *
     */
    protected String sDestPhoneNumber;

    /**
     * Gets the value of the sRecipeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRecipeName() {
        return sRecipeName;
    }

    /**
     * Sets the value of the sRecipeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRecipeName(String value) {
        this.sRecipeName = value;
    }

    /**
     * Gets the value of the sRecipeURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRecipeURL() {
        return sRecipeURL;
    }

    /**
     * Sets the value of the sRecipeURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRecipeURL(String value) {
        this.sRecipeURL = value;
    }

    /**
     * Gets the value of the sSenderEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSenderEmail() {
        return sSenderEmail;
    }

    /**
     * Sets the value of the sSenderEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSenderEmail(String value) {
        this.sSenderEmail = value;
    }

    /**
     * Gets the value of the sDestPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDestPhoneNumber() {
        return sDestPhoneNumber;
    }

    /**
     * Sets the value of the sDestPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDestPhoneNumber(String value) {
        this.sDestPhoneNumber = value;
    }

}
