
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
 *         &lt;element name="iSiteUserID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iRecipeTypes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iBrandID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iLangID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iStartRow" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iEndRow" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="bSortAscending" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "iSiteUserID",
    "iRecipeTypes",
    "iBrandID",
    "iLangID",
    "iStartRow",
    "iEndRow",
    "bSortAscending"
})
@XmlRootElement(name = "GetRecipesFromRecipeBox")
public class GetRecipesFromRecipeBox {

    /**
     *
     */
    protected int iSiteUserID;

    /**
     *
     */
    protected int iRecipeTypes;

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
    protected boolean bSortAscending;

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
     * Gets the value of the iRecipeTypes property.
     * 
     * @return 
     */
    public int getIRecipeTypes() {
        return iRecipeTypes;
    }

    /**
     * Sets the value of the iRecipeTypes property.
     * 
     * @param value
     */
    public void setIRecipeTypes(int value) {
        this.iRecipeTypes = value;
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
     * Gets the value of the bSortAscending property.
     * 
     * @return 
     */
    public boolean isBSortAscending() {
        return bSortAscending;
    }

    /**
     * Sets the value of the bSortAscending property.
     * 
     * @param value
     */
    public void setBSortAscending(boolean value) {
        this.bSortAscending = value;
    }

}
