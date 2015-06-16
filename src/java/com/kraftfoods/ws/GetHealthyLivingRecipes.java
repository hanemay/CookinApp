
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
 *         &lt;element name="bIsRecipePhotoRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "bIsRecipePhotoRequired",
    "iBrandID",
    "iLangID",
    "iStartRow",
    "iEndRow"
})
@XmlRootElement(name = "GetHealthyLivingRecipes")
public class GetHealthyLivingRecipes {

    /**
     *
     */
    protected boolean bIsRecipePhotoRequired;

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
