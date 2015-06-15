
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
 *         &lt;element name="sKeyword1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sKeyword2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sKeyword3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sKeyword4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sKeyword5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sKeyword6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iCatGroupID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sSortField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sSortDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bIsRecipePhotoRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="bIsReadyIn30Mins" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "sKeyword1",
    "sKeyword2",
    "sKeyword3",
    "sKeyword4",
    "sKeyword5",
    "sKeyword6",
    "iCatGroupID",
    "sSortField",
    "sSortDirection",
    "bIsRecipePhotoRequired",
    "bIsReadyIn30Mins",
    "iBrandID",
    "iLangID",
    "iStartRow",
    "iEndRow"
})
@XmlRootElement(name = "GetRecipesByKeywordsAndCategoryGroup")
public class GetRecipesByKeywordsAndCategoryGroup {

    protected String sKeyword1;
    protected String sKeyword2;
    protected String sKeyword3;
    protected String sKeyword4;
    protected String sKeyword5;
    protected String sKeyword6;
    protected int iCatGroupID;
    protected String sSortField;
    protected String sSortDirection;
    protected boolean bIsRecipePhotoRequired;
    protected boolean bIsReadyIn30Mins;
    protected int iBrandID;
    protected int iLangID;
    protected int iStartRow;
    protected int iEndRow;

    /**
     * Gets the value of the sKeyword1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKeyword1() {
        return sKeyword1;
    }

    /**
     * Sets the value of the sKeyword1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKeyword1(String value) {
        this.sKeyword1 = value;
    }

    /**
     * Gets the value of the sKeyword2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKeyword2() {
        return sKeyword2;
    }

    /**
     * Sets the value of the sKeyword2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKeyword2(String value) {
        this.sKeyword2 = value;
    }

    /**
     * Gets the value of the sKeyword3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKeyword3() {
        return sKeyword3;
    }

    /**
     * Sets the value of the sKeyword3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKeyword3(String value) {
        this.sKeyword3 = value;
    }

    /**
     * Gets the value of the sKeyword4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKeyword4() {
        return sKeyword4;
    }

    /**
     * Sets the value of the sKeyword4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKeyword4(String value) {
        this.sKeyword4 = value;
    }

    /**
     * Gets the value of the sKeyword5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKeyword5() {
        return sKeyword5;
    }

    /**
     * Sets the value of the sKeyword5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKeyword5(String value) {
        this.sKeyword5 = value;
    }

    /**
     * Gets the value of the sKeyword6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKeyword6() {
        return sKeyword6;
    }

    /**
     * Sets the value of the sKeyword6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKeyword6(String value) {
        this.sKeyword6 = value;
    }

    /**
     * Gets the value of the iCatGroupID property.
     * 
     */
    public int getICatGroupID() {
        return iCatGroupID;
    }

    /**
     * Sets the value of the iCatGroupID property.
     * 
     */
    public void setICatGroupID(int value) {
        this.iCatGroupID = value;
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
     * Gets the value of the bIsRecipePhotoRequired property.
     * 
     */
    public boolean isBIsRecipePhotoRequired() {
        return bIsRecipePhotoRequired;
    }

    /**
     * Sets the value of the bIsRecipePhotoRequired property.
     * 
     */
    public void setBIsRecipePhotoRequired(boolean value) {
        this.bIsRecipePhotoRequired = value;
    }

    /**
     * Gets the value of the bIsReadyIn30Mins property.
     * 
     */
    public boolean isBIsReadyIn30Mins() {
        return bIsReadyIn30Mins;
    }

    /**
     * Sets the value of the bIsReadyIn30Mins property.
     * 
     */
    public void setBIsReadyIn30Mins(boolean value) {
        this.bIsReadyIn30Mins = value;
    }

    /**
     * Gets the value of the iBrandID property.
     * 
     */
    public int getIBrandID() {
        return iBrandID;
    }

    /**
     * Sets the value of the iBrandID property.
     * 
     */
    public void setIBrandID(int value) {
        this.iBrandID = value;
    }

    /**
     * Gets the value of the iLangID property.
     * 
     */
    public int getILangID() {
        return iLangID;
    }

    /**
     * Sets the value of the iLangID property.
     * 
     */
    public void setILangID(int value) {
        this.iLangID = value;
    }

    /**
     * Gets the value of the iStartRow property.
     * 
     */
    public int getIStartRow() {
        return iStartRow;
    }

    /**
     * Sets the value of the iStartRow property.
     * 
     */
    public void setIStartRow(int value) {
        this.iStartRow = value;
    }

    /**
     * Gets the value of the iEndRow property.
     * 
     */
    public int getIEndRow() {
        return iEndRow;
    }

    /**
     * Sets the value of the iEndRow property.
     * 
     */
    public void setIEndRow(int value) {
        this.iEndRow = value;
    }

}
