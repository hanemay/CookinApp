
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortedShoppingListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SortedShoppingListResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kraftfoods.com/ws/}StatusResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShoppingListItems" type="{http://www.kraftfoods.com/ws/}ArrayOfShoppingListItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SortedShoppingListResponse", propOrder = {
    "shoppingListItems"
})
public class SortedShoppingListResponse
    extends StatusResponse
{

    /**
     *
     */
    @XmlElement(name = "ShoppingListItems")
    protected ArrayOfShoppingListItem shoppingListItems;

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
