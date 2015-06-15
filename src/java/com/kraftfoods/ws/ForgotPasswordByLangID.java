
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
 *         &lt;element name="sEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iSiteID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iLangId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "sEmail",
    "iSiteID",
    "iLangId"
})
@XmlRootElement(name = "ForgotPasswordByLangID")
public class ForgotPasswordByLangID {

    protected String sEmail;
    protected int iSiteID;
    protected int iLangId;

    /**
     * Gets the value of the sEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEmail() {
        return sEmail;
    }

    /**
     * Sets the value of the sEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEmail(String value) {
        this.sEmail = value;
    }

    /**
     * Gets the value of the iSiteID property.
     * 
     */
    public int getISiteID() {
        return iSiteID;
    }

    /**
     * Sets the value of the iSiteID property.
     * 
     */
    public void setISiteID(int value) {
        this.iSiteID = value;
    }

    /**
     * Gets the value of the iLangId property.
     * 
     */
    public int getILangId() {
        return iLangId;
    }

    /**
     * Sets the value of the iLangId property.
     * 
     */
    public void setILangId(int value) {
        this.iLangId = value;
    }

}
