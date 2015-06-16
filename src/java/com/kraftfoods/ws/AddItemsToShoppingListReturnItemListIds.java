
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
 *         &lt;element name="sItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sAisleID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "sItemName",
    "sQuantity",
    "sAisleID",
    "iShoppingListID"
})
@XmlRootElement(name = "AddItemsToShoppingListReturnItemListIds")
public class AddItemsToShoppingListReturnItemListIds {

    /**
     *
     */
    protected String sItemName;

    /**
     *
     */
    protected String sQuantity;

    /**
     *
     */
    protected String sAisleID;

    /**
     *
     */
    protected int iShoppingListID;

    /**
     * Gets the value of the sItemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSItemName() {
        return sItemName;
    }

    /**
     * Sets the value of the sItemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSItemName(String value) {
        this.sItemName = value;
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
     * Gets the value of the sAisleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAisleID() {
        return sAisleID;
    }

    /**
     * Sets the value of the sAisleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAisleID(String value) {
        this.sAisleID = value;
    }

    /**
     * Gets the value of the iShoppingListID property.
     * 
     * @return 
     */
    public int getIShoppingListID() {
        return iShoppingListID;
    }

    /**
     * Sets the value of the iShoppingListID property.
     * 
     * @param value
     */
    public void setIShoppingListID(int value) {
        this.iShoppingListID = value;
    }

}
