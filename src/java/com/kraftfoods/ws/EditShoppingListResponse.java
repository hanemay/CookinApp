
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
 *         &lt;element name="EditShoppingListResult" type="{http://www.kraftfoods.com/ws/}ShoppingListResponse" minOccurs="0"/&gt;
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
    "editShoppingListResult"
})
@XmlRootElement(name = "EditShoppingListResponse")
public class EditShoppingListResponse {

    @XmlElement(name = "EditShoppingListResult")
    protected ShoppingListResponse editShoppingListResult;

    /**
     * Gets the value of the editShoppingListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingListResponse }
     *     
     */
    public ShoppingListResponse getEditShoppingListResult() {
        return editShoppingListResult;
    }

    /**
     * Sets the value of the editShoppingListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingListResponse }
     *     
     */
    public void setEditShoppingListResult(ShoppingListResponse value) {
        this.editShoppingListResult = value;
    }

}
