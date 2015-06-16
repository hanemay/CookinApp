
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
 *         &lt;element name="iShoppingListItemID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "iShoppingListItemID",
    "iShoppingListID"
})
@XmlRootElement(name = "DeleteItemFromShoppingList")
public class DeleteItemFromShoppingList {

    /**
     *
     */
    protected int iShoppingListItemID;

    /**
     *
     */
    protected int iShoppingListID;

    /**
     * Gets the value of the iShoppingListItemID property.
     * 
     * @return 
     */
    public int getIShoppingListItemID() {
        return iShoppingListItemID;
    }

    /**
     * Sets the value of the iShoppingListItemID property.
     * 
     * @param value
     */
    public void setIShoppingListItemID(int value) {
        this.iShoppingListItemID = value;
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
