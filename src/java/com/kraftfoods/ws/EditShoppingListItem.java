
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
 *         &lt;element name="iListItemId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iAisleID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iShoppingListID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "iListItemId",
    "sQuantity",
    "iAisleID",
    "iShoppingListID"
})
@XmlRootElement(name = "EditShoppingListItem")
public class EditShoppingListItem {

    protected int iListItemId;
    protected String sQuantity;
    protected int iAisleID;
    protected int iShoppingListID;

    /**
     * Gets the value of the iListItemId property.
     * 
     */
    public int getIListItemId() {
        return iListItemId;
    }

    /**
     * Sets the value of the iListItemId property.
     * 
     */
    public void setIListItemId(int value) {
        this.iListItemId = value;
    }

    /**
     * Gets the value of the sQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSQuantity() {
        return sQuantity;
    }

    /**
     * Sets the value of the sQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSQuantity(String value) {
        this.sQuantity = value;
    }

    /**
     * Gets the value of the iAisleID property.
     * 
     */
    public int getIAisleID() {
        return iAisleID;
    }

    /**
     * Sets the value of the iAisleID property.
     * 
     */
    public void setIAisleID(int value) {
        this.iAisleID = value;
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

}
