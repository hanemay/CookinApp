
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
 *         &lt;element name="sUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sEncryptedPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iSiteID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="bRememberMe" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="sOptInIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "sUserName",
    "sEncryptedPassword",
    "iSiteID",
    "bRememberMe",
    "sOptInIDs"
})
@XmlRootElement(name = "LoginUserAndReturnCookieWithEncryptedPassword")
public class LoginUserAndReturnCookieWithEncryptedPassword {

    /**
     *
     */
    protected String sUserName;

    /**
     *
     */
    protected String sEncryptedPassword;

    /**
     *
     */
    protected int iSiteID;

    /**
     *
     */
    protected boolean bRememberMe;

    /**
     *
     */
    protected String sOptInIDs;

    /**
     * Gets the value of the sUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUserName() {
        return sUserName;
    }

    /**
     * Sets the value of the sUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUserName(String value) {
        this.sUserName = value;
    }

    /**
     * Gets the value of the sEncryptedPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEncryptedPassword() {
        return sEncryptedPassword;
    }

    /**
     * Sets the value of the sEncryptedPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEncryptedPassword(String value) {
        this.sEncryptedPassword = value;
    }

    /**
     * Gets the value of the iSiteID property.
     * 
     * @return 
     */
    public int getISiteID() {
        return iSiteID;
    }

    /**
     * Sets the value of the iSiteID property.
     * 
     * @param value
     */
    public void setISiteID(int value) {
        this.iSiteID = value;
    }

    /**
     * Gets the value of the bRememberMe property.
     * 
     * @return 
     */
    public boolean isBRememberMe() {
        return bRememberMe;
    }

    /**
     * Sets the value of the bRememberMe property.
     * 
     * @param value
     */
    public void setBRememberMe(boolean value) {
        this.bRememberMe = value;
    }

    /**
     * Gets the value of the sOptInIDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOptInIDs() {
        return sOptInIDs;
    }

    /**
     * Sets the value of the sOptInIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOptInIDs(String value) {
        this.sOptInIDs = value;
    }

}
