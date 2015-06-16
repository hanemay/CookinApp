
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
 *         &lt;element name="sEventID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iActionType" type="{http://www.kraftfoods.com/ws/}ConversionActionType"/&gt;
 *         &lt;element name="sOptionalCategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dConversionPoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="sCustomData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sVisitorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sSessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iSessionType" type="{http://www.kraftfoods.com/ws/}SessionType"/&gt;
 *         &lt;element name="iTagID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "sEventID",
    "iActionType",
    "sOptionalCategoryID",
    "dConversionPoints",
    "sCustomData",
    "sVisitorID",
    "sSessionID",
    "iSessionType",
    "iTagID",
    "bIsTestData"
})
@XmlRootElement(name = "SendConversionEventTrackingData")
public class SendConversionEventTrackingData {

    /**
     *
     */
    protected String sEventID;

    /**
     *
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ConversionActionType iActionType;

    /**
     *
     */
    protected String sOptionalCategoryID;

    /**
     *
     */
    protected double dConversionPoints;

    /**
     *
     */
    protected String sCustomData;

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
    protected boolean bIsTestData;

    /**
     * Gets the value of the sEventID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEventID() {
        return sEventID;
    }

    /**
     * Sets the value of the sEventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEventID(String value) {
        this.sEventID = value;
    }

    /**
     * Gets the value of the iActionType property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionActionType }
     *     
     */
    public ConversionActionType getIActionType() {
        return iActionType;
    }

    /**
     * Sets the value of the iActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionActionType }
     *     
     */
    public void setIActionType(ConversionActionType value) {
        this.iActionType = value;
    }

    /**
     * Gets the value of the sOptionalCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOptionalCategoryID() {
        return sOptionalCategoryID;
    }

    /**
     * Sets the value of the sOptionalCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOptionalCategoryID(String value) {
        this.sOptionalCategoryID = value;
    }

    /**
     * Gets the value of the dConversionPoints property.
     * 
     * @return 
     */
    public double getDConversionPoints() {
        return dConversionPoints;
    }

    /**
     * Sets the value of the dConversionPoints property.
     * 
     * @param value
     */
    public void setDConversionPoints(double value) {
        this.dConversionPoints = value;
    }

    /**
     * Gets the value of the sCustomData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCustomData() {
        return sCustomData;
    }

    /**
     * Sets the value of the sCustomData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCustomData(String value) {
        this.sCustomData = value;
    }

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
