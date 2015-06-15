
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShoppingList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShoppingList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShoppingListID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ShoppingListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShoppingListItems" type="{http://www.kraftfoods.com/ws/}ArrayOfShoppingListItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingList", propOrder = {
    "shoppingListID",
    "shoppingListName",
    "shoppingListItems"
})
public class ShoppingList {

    @XmlElement(name = "ShoppingListID")
    protected int shoppingListID;
    @XmlElement(name = "ShoppingListName")
    protected String shoppingListName;
    @XmlElement(name = "ShoppingListItems")
    protected ArrayOfShoppingListItem shoppingListItems;

    /**
     * Gets the value of the shoppingListID property.
     * 
     */
    public int getShoppingListID() {
        return shoppingListID;
    }

    /**
     * Sets the value of the shoppingListID property.
     * 
     */
    public void setShoppingListID(int value) {
        this.shoppingListID = value;
    }

    /**
     * Gets the value of the shoppingListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShoppingListName() {
        return shoppingListName;
    }

    /**
     * Sets the value of the shoppingListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShoppingListName(String value) {
        this.shoppingListName = value;
    }

    /**
     * Gets the value of the shoppingListItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfShoppingListItem }
     *     
     */
    public ArrayOfShoppingListItem getShoppingListItems() {
        return shoppingListItems;
    }

    /**
     * Sets the value of the shoppingListItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfShoppingListItem }
     *     
     */
    public void setShoppingListItems(ArrayOfShoppingListItem value) {
        this.shoppingListItems = value;
    }

}
