
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
 *         &lt;element name="iShoppingListID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sSortField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "iShoppingListID",
    "sSortField",
    "bSortAscending"
})
@XmlRootElement(name = "GetShoppingListSorted")
public class GetShoppingListSorted {

    protected int iSiteUserID;
    protected int iShoppingListID;
    protected String sSortField;
    protected boolean bSortAscending;

    /**
     * Gets the value of the iSiteUserID property.
     * 
     */
    public int getISiteUserID() {
        return iSiteUserID;
    }

    /**
     * Sets the value of the iSiteUserID property.
     * 
     */
    public void setISiteUserID(int value) {
        this.iSiteUserID = value;
    }

    /**
     * Gets the value of the iShoppingListID property.
     * 
     */
    public int getIShoppingListID() {
        return iShoppingListID;
    }

    /**
     * Sets the value of the iShoppingListID property.
     * 
     */
    public void setIShoppingListID(int value) {
        this.iShoppingListID = value;
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
     * Gets the value of the bSortAscending property.
     * 
     */
    public boolean isBSortAscending() {
        return bSortAscending;
    }

    /**
     * Sets the value of the bSortAscending property.
     * 
     */
    public void setBSortAscending(boolean value) {
        this.bSortAscending = value;
    }

}
