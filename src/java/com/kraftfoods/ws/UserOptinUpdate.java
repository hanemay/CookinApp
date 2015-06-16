
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
 *         &lt;element name="iSiteId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iSiteUserId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sOptinIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sOptOutIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iLanguageID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sOptinSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "iSiteId",
    "iSiteUserId",
    "sOptinIds",
    "sOptOutIds",
    "iLanguageID",
    "sOptinSource"
})
@XmlRootElement(name = "UserOptinUpdate")
public class UserOptinUpdate {

    /**
     *
     */
    protected int iSiteId;

    /**
     *
     */
    protected int iSiteUserId;

    /**
     *
     */
    protected String sOptinIds;

    /**
     *
     */
    protected String sOptOutIds;

    /**
     *
     */
    protected int iLanguageID;

    /**
     *
     */
    protected String sOptinSource;

    /**
     * Gets the value of the iSiteId property.
     * 
     * @return 
     */
    public int getISiteId() {
        return iSiteId;
    }

    /**
     * Sets the value of the iSiteId property.
     * 
     * @param value
     */
    public void setISiteId(int value) {
        this.iSiteId = value;
    }

    /**
     * Gets the value of the iSiteUserId property.
     * 
     * @return 
     */
    public int getISiteUserId() {
        return iSiteUserId;
    }

    /**
     * Sets the value of the iSiteUserId property.
     * 
     * @param value
     */
    public void setISiteUserId(int value) {
        this.iSiteUserId = value;
    }

    /**
     * Gets the value of the sOptinIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOptinIds() {
        return sOptinIds;
    }

    /**
     * Sets the value of the sOptinIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOptinIds(String value) {
        this.sOptinIds = value;
    }

    /**
     * Gets the value of the sOptOutIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOptOutIds() {
        return sOptOutIds;
    }

    /**
     * Sets the value of the sOptOutIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOptOutIds(String value) {
        this.sOptOutIds = value;
    }

    /**
     * Gets the value of the iLanguageID property.
     * 
     * @return 
     */
    public int getILanguageID() {
        return iLanguageID;
    }

    /**
     * Sets the value of the iLanguageID property.
     * 
     * @param value
     */
    public void setILanguageID(int value) {
        this.iLanguageID = value;
    }

    /**
     * Gets the value of the sOptinSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOptinSource() {
        return sOptinSource;
    }

    /**
     * Sets the value of the sOptinSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOptinSource(String value) {
        this.sOptinSource = value;
    }

}
