
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
 *         &lt;element name="isSiteID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isLangID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sSectionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bsIsLowBandwidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bsIsRecipePhotoRequired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bsIsReadyIn30Mins" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bsIsOnlyHealthyRecipe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sSortField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sSortDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sCategoryList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isStartRow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isEndRow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "isSiteID",
    "isLangID",
    "sSectionType",
    "bsIsLowBandwidth",
    "bsIsRecipePhotoRequired",
    "bsIsReadyIn30Mins",
    "bsIsOnlyHealthyRecipe",
    "sSortField",
    "sSortDirection",
    "sCategoryList",
    "isStartRow",
    "isEndRow"
})
@XmlRootElement(name = "GetNodesByCategoryList")
public class GetNodesByCategoryList {

    /**
     *
     */
    protected String isSiteID;

    /**
     *
     */
    protected String isLangID;

    /**
     *
     */
    protected String sSectionType;

    /**
     *
     */
    protected String bsIsLowBandwidth;

    /**
     *
     */
    protected String bsIsRecipePhotoRequired;

    /**
     *
     */
    protected String bsIsReadyIn30Mins;

    /**
     *
     */
    protected String bsIsOnlyHealthyRecipe;

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
    protected String sCategoryList;

    /**
     *
     */
    protected String isStartRow;

    /**
     *
     */
    protected String isEndRow;

    /**
     * Gets the value of the isSiteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSiteID() {
        return isSiteID;
    }

    /**
     * Sets the value of the isSiteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSiteID(String value) {
        this.isSiteID = value;
    }

    /**
     * Gets the value of the isLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsLangID() {
        return isLangID;
    }

    /**
     * Sets the value of the isLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsLangID(String value) {
        this.isLangID = value;
    }

    /**
     * Gets the value of the sSectionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSectionType() {
        return sSectionType;
    }

    /**
     * Sets the value of the sSectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSectionType(String value) {
        this.sSectionType = value;
    }

    /**
     * Gets the value of the bsIsLowBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBsIsLowBandwidth() {
        return bsIsLowBandwidth;
    }

    /**
     * Sets the value of the bsIsLowBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBsIsLowBandwidth(String value) {
        this.bsIsLowBandwidth = value;
    }

    /**
     * Gets the value of the bsIsRecipePhotoRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBsIsRecipePhotoRequired() {
        return bsIsRecipePhotoRequired;
    }

    /**
     * Sets the value of the bsIsRecipePhotoRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBsIsRecipePhotoRequired(String value) {
        this.bsIsRecipePhotoRequired = value;
    }

    /**
     * Gets the value of the bsIsReadyIn30Mins property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBsIsReadyIn30Mins() {
        return bsIsReadyIn30Mins;
    }

    /**
     * Sets the value of the bsIsReadyIn30Mins property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBsIsReadyIn30Mins(String value) {
        this.bsIsReadyIn30Mins = value;
    }

    /**
     * Gets the value of the bsIsOnlyHealthyRecipe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBsIsOnlyHealthyRecipe() {
        return bsIsOnlyHealthyRecipe;
    }

    /**
     * Sets the value of the bsIsOnlyHealthyRecipe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBsIsOnlyHealthyRecipe(String value) {
        this.bsIsOnlyHealthyRecipe = value;
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
     * Gets the value of the sCategoryList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCategoryList() {
        return sCategoryList;
    }

    /**
     * Sets the value of the sCategoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCategoryList(String value) {
        this.sCategoryList = value;
    }

    /**
     * Gets the value of the isStartRow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsStartRow() {
        return isStartRow;
    }

    /**
     * Sets the value of the isStartRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsStartRow(String value) {
        this.isStartRow = value;
    }

    /**
     * Gets the value of the isEndRow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsEndRow() {
        return isEndRow;
    }

    /**
     * Sets the value of the isEndRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsEndRow(String value) {
        this.isEndRow = value;
    }

}
