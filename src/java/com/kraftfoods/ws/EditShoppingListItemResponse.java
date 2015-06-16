
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
 *         &lt;element name="EditShoppingListItemResult" type="{http://www.kraftfoods.com/ws/}EditShoppingListItemResponseNew" minOccurs="0"/&gt;
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
    "editShoppingListItemResult"
})
@XmlRootElement(name = "EditShoppingListItemResponse")
public class EditShoppingListItemResponse {

    /**
     *
     */
    @XmlElement(name = "EditShoppingListItemResult")
    protected EditShoppingListItemResponseNew editShoppingListItemResult;

    /**
     * Gets the value of the editShoppingListItemResult property.
     * 
     * @return
     *     possible object is
     *     {@link EditShoppingListItemResponseNew }
     *     
     */
    public EditShoppingListItemResponseNew getEditShoppingListItemResult() {
        return editShoppingListItemResult;
    }

    /**
     * Sets the value of the editShoppingListItemResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditShoppingListItemResponseNew }
     *     
     */
    public void setEditShoppingListItemResult(EditShoppingListItemResponseNew value) {
        this.editShoppingListItemResult = value;
    }

}
