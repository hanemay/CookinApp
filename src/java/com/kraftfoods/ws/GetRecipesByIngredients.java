
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
 *         &lt;element name="sIngredient1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sIngredient2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sIngredient3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bIsRecipePhotoRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "sIngredient1",
    "sIngredient2",
    "sIngredient3",
    "bIsRecipePhotoRequired",
    "sSortField",
    "sSortDirection",
    "iBrandID",
    "iLangID",
    "iStartRow",
    "iEndRow"
})
@XmlRootElement(name = "GetRecipesByIngredients")
public class GetRecipesByIngredients {

    protected String sIngredient1;
    protected String sIngredient2;
    protected String sIngredient3;
    protected boolean bIsRecipePhotoRequired;
    protected String sSortField;
    protected String sSortDirection;
    protected int iBrandID;
    protected int iLangID;
    protected int iStartRow;
    protected int iEndRow;

    /**
     * Gets the value of the sIngredient1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIngredient1() {
        return sIngredient1;
    }

    /**
     * Sets the value of the sIngredient1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIngredient1(String value) {
        this.sIngredient1 = value;
    }

    /**
     * Gets the value of the sIngredient2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIngredient2() {
        return sIngredient2;
    }

    /**
     * Sets the value of the sIngredient2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIngredient2(String value) {
        this.sIngredient2 = value;
    }

    /**
     * Gets the value of the sIngredient3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIngredient3() {
        return sIngredient3;
    }

    /**
     * Sets the value of the sIngredient3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIngredient3(String value) {
        this.sIngredient3 = value;
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
