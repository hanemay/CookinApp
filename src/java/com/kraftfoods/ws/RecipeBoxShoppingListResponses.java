
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipeBoxShoppingListResponses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipeBoxShoppingListResponses"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kraftfoods.com/ws/}StatusResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RecipeBoxShoppingListResponses" type="{http://www.kraftfoods.com/ws/}ArrayOfRecipeBoxShoppingListResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipeBoxShoppingListResponses", propOrder = {
    "totalCount",
    "recipeBoxShoppingListResponses"
})
public class RecipeBoxShoppingListResponses
    extends StatusResponse
{

    /**
     *
     */
    @XmlElement(name = "TotalCount")
    protected int totalCount;

    /**
     *
     */
    @XmlElement(name = "RecipeBoxShoppingListResponses")
    protected ArrayOfRecipeBoxShoppingListResponse recipeBoxShoppingListResponses;

    /**
     * Gets the value of the totalCount property.
     * 
     * @return 
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     * @param value
     */
    public void setTotalCount(int value) {
        this.totalCount = value;
    }

    /**
     * Gets the value of the recipeBoxShoppingListResponses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipeBoxShoppingListResponse }
     *     
     */
    public ArrayOfRecipeBoxShoppingListResponse getRecipeBoxShoppingListResponses() {
        return recipeBoxShoppingListResponses;
    }

    /**
     * Sets the value of the recipeBoxShoppingListResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipeBoxShoppingListResponse }
     *     
     */
    public void setRecipeBoxShoppingListResponses(ArrayOfRecipeBoxShoppingListResponse value) {
        this.recipeBoxShoppingListResponses = value;
    }

}
