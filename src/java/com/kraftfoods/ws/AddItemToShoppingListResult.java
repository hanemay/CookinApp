
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddItemToShoppingListResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddItemToShoppingListResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddItemToShoppingListResult", propOrder = {
    "itemListID"
})
public class AddItemToShoppingListResult {

    @XmlElement(name = "ItemListID")
    protected String itemListID;

    /**
     * Gets the value of the itemListID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemListID() {
        return itemListID;
    }

    /**
     * Sets the value of the itemListID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemListID(String value) {
        this.itemListID = value;
    }

}
