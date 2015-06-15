
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
 *         &lt;element name="iShoppingListID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sShoppingListItemIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "iShoppingListID",
    "sShoppingListItemIDs"
})
@XmlRootElement(name = "DeleteItemsFromShoppingList")
public class DeleteItemsFromShoppingList {

    protected int iShoppingListID;
    protected String sShoppingListItemIDs;

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
     * Gets the value of the sShoppingListItemIDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSShoppingListItemIDs() {
        return sShoppingListItemIDs;
    }

    /**
     * Sets the value of the sShoppingListItemIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSShoppingListItemIDs(String value) {
        this.sShoppingListItemIDs = value;
    }

}
