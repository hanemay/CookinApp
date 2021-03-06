
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
 *         &lt;element name="AddRecipeToShoppingListResult" type="{http://www.kraftfoods.com/ws/}StatusResponse" minOccurs="0"/&gt;
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
    "addRecipeToShoppingListResult"
})
@XmlRootElement(name = "AddRecipeToShoppingListResponse")
public class AddRecipeToShoppingListResponse {

    /**
     *
     */
    @XmlElement(name = "AddRecipeToShoppingListResult")
    protected StatusResponse addRecipeToShoppingListResult;

    /**
     * Gets the value of the addRecipeToShoppingListResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatusResponse }
     *     
     */
    public StatusResponse getAddRecipeToShoppingListResult() {
        return addRecipeToShoppingListResult;
    }

    /**
     * Sets the value of the addRecipeToShoppingListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusResponse }
     *     
     */
    public void setAddRecipeToShoppingListResult(StatusResponse value) {
        this.addRecipeToShoppingListResult = value;
    }

}
