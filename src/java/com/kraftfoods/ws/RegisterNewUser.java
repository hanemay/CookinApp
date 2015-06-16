
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
 *         &lt;element name="sPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iRegistrationActivityID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sRegistrationSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bIsRegistrationComplete" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="bAddOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="iOptInID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iSiteID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iLangID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "sPassword",
    "sEmail",
    "iRegistrationActivityID",
    "sRegistrationSource",
    "bIsRegistrationComplete",
    "bAddOptIn",
    "iOptInID",
    "iSiteID",
    "iLangID"
})
@XmlRootElement(name = "RegisterNewUser")
public class RegisterNewUser {

    /**
     *
     */
    protected String sUserName;

    /**
     *
     */
    protected String sPassword;

    /**
     *
     */
    protected String sEmail;

    /**
     *
     */
    protected int iRegistrationActivityID;

    /**
     *
     */
    protected String sRegistrationSource;

    /**
     *
     */
    protected boolean bIsRegistrationComplete;

    /**
     *
     */
    protected boolean bAddOptIn;

    /**
     *
     */
    protected int iOptInID;

    /**
     *
     */
    protected int iSiteID;

    /**
     *
     */
    protected int iLangID;

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
     * Gets the value of the sPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPassword() {
        return sPassword;
    }

    /**
     * Sets the value of the sPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPassword(String value) {
        this.sPassword = value;
    }

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
     * Gets the value of the iRegistrationActivityID property.
     * 
     * @return 
     */
    public int getIRegistrationActivityID() {
        return iRegistrationActivityID;
    }

    /**
     * Sets the value of the iRegistrationActivityID property.
     * 
     * @param value
     */
    public void setIRegistrationActivityID(int value) {
        this.iRegistrationActivityID = value;
    }

    /**
     * Gets the value of the sRegistrationSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRegistrationSource() {
        return sRegistrationSource;
    }

    /**
     * Sets the value of the sRegistrationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRegistrationSource(String value) {
        this.sRegistrationSource = value;
    }

    /**
     * Gets the value of the bIsRegistrationComplete property.
     * 
     * @return 
     */
    public boolean isBIsRegistrationComplete() {
        return bIsRegistrationComplete;
    }

    /**
     * Sets the value of the bIsRegistrationComplete property.
     * 
     * @param value
     */
    public void setBIsRegistrationComplete(boolean value) {
        this.bIsRegistrationComplete = value;
    }

    /**
     * Gets the value of the bAddOptIn property.
     * 
     * @return 
     */
    public boolean isBAddOptIn() {
        return bAddOptIn;
    }

    /**
     * Sets the value of the bAddOptIn property.
     * 
     * @param value
     */
    public void setBAddOptIn(boolean value) {
        this.bAddOptIn = value;
    }

    /**
     * Gets the value of the iOptInID property.
     * 
     * @return 
     */
    public int getIOptInID() {
        return iOptInID;
    }

    /**
     * Sets the value of the iOptInID property.
     * 
     * @param value
     */
    public void setIOptInID(int value) {
        this.iOptInID = value;
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
     * Gets the value of the iLangID property.
     * 
     * @return 
     */
    public int getILangID() {
        return iLangID;
    }

    /**
     * Sets the value of the iLangID property.
     * 
     * @param value
     */
    public void setILangID(int value) {
        this.iLangID = value;
    }

}
