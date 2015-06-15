
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
 *         &lt;element name="iSiteID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "iSiteID"
})
@XmlRootElement(name = "LoginUser")
public class LoginUser {

    protected String sUserName;
    protected String sPassword;
    protected int iSiteID;

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

}
