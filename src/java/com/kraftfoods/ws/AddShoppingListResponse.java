
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
 *         &lt;element name="AddShoppingListResult" type="{http://www.kraftfoods.com/ws/}ShoppingListResponse" minOccurs="0"/&gt;
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
    "addShoppingListResult"
})
@XmlRootElement(name = "AddShoppingListResponse")
public class AddShoppingListResponse {

    @XmlElement(name = "AddShoppingListResult")
    protected ShoppingListResponse addShoppingListResult;

    /**
     * Gets the value of the addShoppingListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingListResponse }
     *     
     */
    public ShoppingListResponse getAddShoppingListResult() {
        return addShoppingListResult;
    }

    /**
     * Sets the value of the addShoppingListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingListResponse }
     *     
     */
    public void setAddShoppingListResult(ShoppingListResponse value) {
        this.addShoppingListResult = value;
    }

}
