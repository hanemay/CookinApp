
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogoutResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogoutResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsSuccessful" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SiteUserID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CookieResponse" type="{http://www.kraftfoods.com/ws/}CookieResponseEntity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogoutResponse", propOrder = {
    "status",
    "isSuccessful",
    "errorCode",
    "errorMessage",
    "siteUserID",
    "email",
    "cookieResponse"
})
public class LogoutResponse {

    /**
     *
     */
    @XmlElement(name = "Status")
    protected String status;

    /**
     *
     */
    @XmlElement(name = "IsSuccessful")
    protected boolean isSuccessful;

    /**
     *
     */
    @XmlElement(name = "ErrorCode")
    protected int errorCode;

    /**
     *
     */
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;

    /**
     *
     */
    @XmlElement(name = "SiteUserID")
    protected int siteUserID;

    /**
     *
     */
    @XmlElement(name = "Email")
    protected String email;

    /**
     *
     */
    @XmlElement(name = "CookieResponse")
    protected CookieResponseEntity cookieResponse;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the isSuccessful property.
     * 
     * @return 
     */
    public boolean isIsSuccessful() {
        return isSuccessful;
    }

    /**
     * Sets the value of the isSuccessful property.
     * 
     * @param value
     */
    public void setIsSuccessful(boolean value) {
        this.isSuccessful = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return 
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     */
    public void setErrorCode(int value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the siteUserID property.
     * 
     * @return 
     */
    public int getSiteUserID() {
        return siteUserID;
    }

    /**
     * Sets the value of the siteUserID property.
     * 
     * @param value
     */
    public void setSiteUserID(int value) {
        this.siteUserID = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the cookieResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CookieResponseEntity }
     *     
     */
    public CookieResponseEntity getCookieResponse() {
        return cookieResponse;
    }

    /**
     * Sets the value of the cookieResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CookieResponseEntity }
     *     
     */
    public void setCookieResponse(CookieResponseEntity value) {
        this.cookieResponse = value;
    }

}
