
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
 *         &lt;element name="AddRecipeToRecipeBoxShoppingListResult" type="{http://www.kraftfoods.com/ws/}RecipeBoxShoppingListResponse" minOccurs="0"/&gt;
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
    "addRecipeToRecipeBoxShoppingListResult"
})
@XmlRootElement(name = "AddRecipeToRecipeBoxShoppingListResponse")
public class AddRecipeToRecipeBoxShoppingListResponse {

    /**
     *
     */
    @XmlElement(name = "AddRecipeToRecipeBoxShoppingListResult")
    protected RecipeBoxShoppingListResponse addRecipeToRecipeBoxShoppingListResult;

    /**
     * Gets the value of the addRecipeToRecipeBoxShoppingListResult property.
     * 
     * @return
     *     possible object is
     *     {@link RecipeBoxShoppingListResponse }
     *     
     */
    public RecipeBoxShoppingListResponse getAddRecipeToRecipeBoxShoppingListResult() {
        return addRecipeToRecipeBoxShoppingListResult;
    }

    /**
     * Sets the value of the addRecipeToRecipeBoxShoppingListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipeBoxShoppingListResponse }
     *     
     */
    public void setAddRecipeToRecipeBoxShoppingListResult(RecipeBoxShoppingListResponse value) {
        this.addRecipeToRecipeBoxShoppingListResult = value;
    }

}
