
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
 *         &lt;element name="iSubCatID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sSortField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sSortDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bIsRecipePhotoRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="bIsReadyIn30Mins" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="bOnlyHealthyRecipes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="iBrandID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iLangID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iStartRow" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iEndRow" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="bIncludeExtraInformation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "iSubCatID",
    "sSortField",
    "sSortDirection",
    "bIsRecipePhotoRequired",
    "bIsReadyIn30Mins",
    "bOnlyHealthyRecipes",
    "iBrandID",
    "iLangID",
    "iStartRow",
    "iEndRow",
    "bIncludeExtraInformation"
})
@XmlRootElement(name = "GetRecipesBySubcategoryWithExtraInformation")
public class GetRecipesBySubcategoryWithExtraInformation {

    /**
     *
     */
    protected int iSubCatID;

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
    protected boolean bIsRecipePhotoRequired;

    /**
     *
     */
    protected boolean bIsReadyIn30Mins;

    /**
     *
     */
    protected boolean bOnlyHealthyRecipes;

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
     *
     */
    protected boolean bIncludeExtraInformation;

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
     * @return 
     */
    public boolean isBIsRecipePhotoRequired() {
        return bIsRecipePhotoRequired;
    }

    /**
     * Sets the value of the bIsRecipePhotoRequired property.
     * 
     * @param value
     */
    public void setBIsRecipePhotoRequired(boolean value) {
        this.bIsRecipePhotoRequired = value;
    }

    /**
     * Gets the value of the bIsReadyIn30Mins property.
     * 
     * @return 
     */
    public boolean isBIsReadyIn30Mins() {
        return bIsReadyIn30Mins;
    }

    /**
     * Sets the value of the bIsReadyIn30Mins property.
     * 
     * @param value
     */
    public void setBIsReadyIn30Mins(boolean value) {
        this.bIsReadyIn30Mins = value;
    }

    /**
     * Gets the value of the bOnlyHealthyRecipes property.
     * 
     * @return 
     */
    public boolean isBOnlyHealthyRecipes() {
        return bOnlyHealthyRecipes;
    }

    /**
     * Sets the value of the bOnlyHealthyRecipes property.
     * 
     * @param value
     */
    public void setBOnlyHealthyRecipes(boolean value) {
        this.bOnlyHealthyRecipes = value;
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

    /**
     * Gets the value of the bIncludeExtraInformation property.
     * 
     * @return 
     */
    public boolean isBIncludeExtraInformation() {
        return bIncludeExtraInformation;
    }

    /**
     * Sets the value of the bIncludeExtraInformation property.
     * 
     * @param value
     */
    public void setBIncludeExtraInformation(boolean value) {
        this.bIncludeExtraInformation = value;
    }

}
