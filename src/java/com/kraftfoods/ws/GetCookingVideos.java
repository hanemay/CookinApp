
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
 *         &lt;element name="iCatID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iSubCatID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="bIsLowBandwidth" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="sSortField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sSortDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iBrandID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iLangID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iStartRow" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iEndRow" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "iCatID",
    "iSubCatID",
    "bIsLowBandwidth",
    "sSortField",
    "sSortDirection",
    "iBrandID",
    "iLangID",
    "iStartRow",
    "iEndRow"
})
@XmlRootElement(name = "GetCookingVideos")
public class GetCookingVideos {

    /**
     *
     */
    protected int iCatID;

    /**
     *
     */
    protected int iSubCatID;

    /**
     *
     */
    protected boolean bIsLowBandwidth;

    /**
     *
     */
    protected String sSortField;

    /**
     *
     */
    protected String sSortDirection;

    /**
     *
     */
    protected int iBrandID;

    /**
     *
     */
    protected int iLangID;

    /**
     *
     */
    protected int iStartRow;

    /**
     *
     */
    protected int iEndRow;

    /**
     * Gets the value of the iCatID property.
     * 
     * @return 
     */
    public int getICatID() {
        return iCatID;
    }

    /**
     * Sets the value of the iCatID property.
     * 
     * @param value
     */
    public void setICatID(int value) {
        this.iCatID = value;
    }

    /**
     * Gets the value of the iSubCatID property.
     * 
     * @return 
     */
    public int getISubCatID() {
        return iSubCatID;
    }

    /**
     * Sets the value of the iSubCatID property.
     * 
     * @param value
     */
    public void setISubCatID(int value) {
        this.iSubCatID = value;
    }

    /**
     * Gets the value of the bIsLowBandwidth property.
     * 
     * @return 
     */
    public boolean isBIsLowBandwidth() {
        return bIsLowBandwidth;
    }

    /**
     * Sets the value of the bIsLowBandwidth property.
     * 
     * @param value
     */
    public void setBIsLowBandwidth(boolean value) {
        this.bIsLowBandwidth = value;
    }

    /**
     * Gets the value of the sSortField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSortField() {
        return sSortField;
    }

    /**
     * Sets the value of the sSortField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSortField(String value) {
        this.sSortField = value;
    }

    /**
     * Gets the value of the sSortDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSortDirection() {
        return sSortDirection;
    }

    /**
     * Sets the value of the sSortDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSortDirection(String value) {
        this.sSortDirection = value;
    }

    /**
     * Gets the value of the iBrandID property.
     * 
     * @return 
     */
    public int getIBrandID() {
        return iBrandID;
    }

    /**
     * Sets the value of the iBrandID property.
     * 
     * @param value
     */
    public void setIBrandID(int value) {
        this.iBrandID = value;
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

    /**
     * Gets the value of the iStartRow property.
     * 
     * @return 
     */
    public int getIStartRow() {
        return iStartRow;
    }

    /**
     * Sets the value of the iStartRow property.
     * 
     * @param value
     */
    public void setIStartRow(int value) {
        this.iStartRow = value;
    }

    /**
     * Gets the value of the iEndRow property.
     * 
     * @return 
     */
    public int getIEndRow() {
        return iEndRow;
    }

    /**
     * Sets the value of the iEndRow property.
     * 
     * @param value
     */
    public void setIEndRow(int value) {
        this.iEndRow = value;
    }

}
