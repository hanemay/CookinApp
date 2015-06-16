
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
 *         &lt;element name="iRecipeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iSiteUserID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iBrandID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iLangID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="bDisplayName" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="iRating" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iRateItemTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="bTryItem" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="bGetAgain" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="bApprovedFoulLang" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="bApprovedCompetitor" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "iRecipeID",
    "iSiteUserID",
    "iBrandID",
    "iLangID",
    "bDisplayName",
    "iRating",
    "iRateItemTypeID",
    "sComments",
    "bActive",
    "bTryItem",
    "bGetAgain",
    "bApprovedFoulLang",
    "bApprovedCompetitor"
})
@XmlRootElement(name = "RateRecipe")
public class RateRecipe {

    /**
     *
     */
    protected int iRecipeID;

    /**
     *
     */
    protected int iSiteUserID;

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
    protected boolean bDisplayName;

    /**
     *
     */
    protected int iRating;

    /**
     *
     */
    protected int iRateItemTypeID;

    /**
     *
     */
    protected String sComments;

    /**
     *
     */
    protected boolean bActive;

    /**
     *
     */
    protected boolean bTryItem;

    /**
     *
     */
    protected boolean bGetAgain;

    /**
     *
     */
    protected boolean bApprovedFoulLang;

    /**
     *
     */
    protected boolean bApprovedCompetitor;

    /**
     * Gets the value of the iRecipeID property.
     * 
     * @return 
     */
    public int getIRecipeID() {
        return iRecipeID;
    }

    /**
     * Sets the value of the iRecipeID property.
     * 
     * @param value
     */
    public void setIRecipeID(int value) {
        this.iRecipeID = value;
    }

    /**
     * Gets the value of the iSiteUserID property.
     * 
     * @return 
     */
    public int getISiteUserID() {
        return iSiteUserID;
    }

    /**
     * Sets the value of the iSiteUserID property.
     * 
     * @param value
     */
    public void setISiteUserID(int value) {
        this.iSiteUserID = value;
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
     * Gets the value of the bDisplayName property.
     * 
     * @return 
     */
    public boolean isBDisplayName() {
        return bDisplayName;
    }

    /**
     * Sets the value of the bDisplayName property.
     * 
     * @param value
     */
    public void setBDisplayName(boolean value) {
        this.bDisplayName = value;
    }

    /**
     * Gets the value of the iRating property.
     * 
     * @return 
     */
    public int getIRating() {
        return iRating;
    }

    /**
     * Sets the value of the iRating property.
     * 
     * @param value
     */
    public void setIRating(int value) {
        this.iRating = value;
    }

    /**
     * Gets the value of the iRateItemTypeID property.
     * 
     * @return 
     */
    public int getIRateItemTypeID() {
        return iRateItemTypeID;
    }

    /**
     * Sets the value of the iRateItemTypeID property.
     * 
     * @param value
     */
    public void setIRateItemTypeID(int value) {
        this.iRateItemTypeID = value;
    }

    /**
     * Gets the value of the sComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSComments() {
        return sComments;
    }

    /**
     * Sets the value of the sComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSComments(String value) {
        this.sComments = value;
    }

    /**
     * Gets the value of the bActive property.
     * 
     * @return 
     */
    public boolean isBActive() {
        return bActive;
    }

    /**
     * Sets the value of the bActive property.
     * 
     * @param value
     */
    public void setBActive(boolean value) {
        this.bActive = value;
    }

    /**
     * Gets the value of the bTryItem property.
     * 
     * @return 
     */
    public boolean isBTryItem() {
        return bTryItem;
    }

    /**
     * Sets the value of the bTryItem property.
     * 
     * @param value
     */
    public void setBTryItem(boolean value) {
        this.bTryItem = value;
    }

    /**
     * Gets the value of the bGetAgain property.
     * 
     * @return 
     */
    public boolean isBGetAgain() {
        return bGetAgain;
    }

    /**
     * Sets the value of the bGetAgain property.
     * 
     * @param value
     */
    public void setBGetAgain(boolean value) {
        this.bGetAgain = value;
    }

    /**
     * Gets the value of the bApprovedFoulLang property.
     * 
     * @return 
     */
    public boolean isBApprovedFoulLang() {
        return bApprovedFoulLang;
    }

    /**
     * Sets the value of the bApprovedFoulLang property.
     * 
     * @param value
     */
    public void setBApprovedFoulLang(boolean value) {
        this.bApprovedFoulLang = value;
    }

    /**
     * Gets the value of the bApprovedCompetitor property.
     * 
     * @return 
     */
    public boolean isBApprovedCompetitor() {
        return bApprovedCompetitor;
    }

    /**
     * Sets the value of the bApprovedCompetitor property.
     * 
     * @param value
     */
    public void setBApprovedCompetitor(boolean value) {
        this.bApprovedCompetitor = value;
    }

}
