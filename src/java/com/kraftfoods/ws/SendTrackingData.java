
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="sVisitorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sSessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iSessionType" type="{http://www.kraftfoods.com/ws/}SessionType"/&gt;
 *         &lt;element name="iTagID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sPageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sCategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bIsTestData" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "sVisitorID",
    "sSessionID",
    "iSessionType",
    "iTagID",
    "sPageID",
    "sCategoryID",
    "bIsTestData"
})
@XmlRootElement(name = "SendTrackingData")
public class SendTrackingData {

    /**
     *
     */
    protected String sVisitorID;

    /**
     *
     */
    protected String sSessionID;

    /**
     *
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SessionType iSessionType;

    /**
     *
     */
    protected int iTagID;

    /**
     *
     */
    protected String sPageID;

    /**
     *
     */
    protected String sCategoryID;

    /**
     *
     */
    protected boolean bIsTestData;

    /**
     * Gets the value of the sVisitorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVisitorID() {
        return sVisitorID;
    }

    /**
     * Sets the value of the sVisitorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVisitorID(String value) {
        this.sVisitorID = value;
    }

    /**
     * Gets the value of the sSessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSessionID() {
        return sSessionID;
    }

    /**
     * Sets the value of the sSessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSessionID(String value) {
        this.sSessionID = value;
    }

    /**
     * Gets the value of the iSessionType property.
     * 
     * @return
     *     possible object is
     *     {@link SessionType }
     *     
     */
    public SessionType getISessionType() {
        return iSessionType;
    }

    /**
     * Sets the value of the iSessionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionType }
     *     
     */
    public void setISessionType(SessionType value) {
        this.iSessionType = value;
    }

    /**
     * Gets the value of the iTagID property.
     * 
     * @return 
     */
    public int getITagID() {
        return iTagID;
    }

    /**
     * Sets the value of the iTagID property.
     * 
     * @param value
     */
    public void setITagID(int value) {
        this.iTagID = value;
    }

    /**
     * Gets the value of the sPageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPageID() {
        return sPageID;
    }

    /**
     * Sets the value of the sPageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPageID(String value) {
        this.sPageID = value;
    }

    /**
     * Gets the value of the sCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCategoryID() {
        return sCategoryID;
    }

    /**
     * Sets the value of the sCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCategoryID(String value) {
        this.sCategoryID = value;
    }

    /**
     * Gets the value of the bIsTestData property.
     * 
     * @return 
     */
    public boolean isBIsTestData() {
        return bIsTestData;
    }

    /**
     * Sets the value of the bIsTestData property.
     * 
     * @param value
     */
    public void setBIsTestData(boolean value) {
        this.bIsTestData = value;
    }

}
