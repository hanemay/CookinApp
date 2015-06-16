
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="AddItemsToShoppingListReturnItemListIdsResult" type="{http://www.kraftfoods.com/ws/}AddItemToShoppingListResponseNew" minOccurs="0"/&gt;
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
    "addItemsToShoppingListReturnItemListIdsResult"
})
@XmlRootElement(name = "AddItemsToShoppingListReturnItemListIdsResponse")
public class AddItemsToShoppingListReturnItemListIdsResponse {

    /**
     *
     */
    @XmlElement(name = "AddItemsToShoppingListReturnItemListIdsResult")
    protected AddItemToShoppingListResponseNew addItemsToShoppingListReturnItemListIdsResult;

    /**
     * Gets the value of the addItemsToShoppingListReturnItemListIdsResult property.
     * 
     * @return
     *     possible object is
     *     {@link AddItemToShoppingListResponseNew }
     *     
     */
    public AddItemToShoppingListResponseNew getAddItemsToShoppingListReturnItemListIdsResult() {
        return addItemsToShoppingListReturnItemListIdsResult;
    }

    /**
     * Sets the value of the addItemsToShoppingListReturnItemListIdsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddItemToShoppingListResponseNew }
     *     
     */
    public void setAddItemsToShoppingListReturnItemListIdsResult(AddItemToShoppingListResponseNew value) {
        this.addItemsToShoppingListReturnItemListIdsResult = value;
    }

}
