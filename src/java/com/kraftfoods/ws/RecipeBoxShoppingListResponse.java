
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipeBoxShoppingListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipeBoxShoppingListResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kraftfoods.com/ws/}StatusResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecipeBoxRecipeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RecipeBoxStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShoppingListStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipeBoxShoppingListResponse", propOrder = {
    "recipeBoxRecipeId",
    "recipeBoxStatus",
    "shoppingListStatus"
})
public class RecipeBoxShoppingListResponse
    extends StatusResponse
{

    /**
     *
     */
    @XmlElement(name = "RecipeBoxRecipeId")
    protected int recipeBoxRecipeId;

    /**
     *
     */
    @XmlElement(name = "RecipeBoxStatus")
    protected String recipeBoxStatus;

    /**
     *
     */
    @XmlElement(name = "ShoppingListStatus")
    protected String shoppingListStatus;

    /**
     * Gets the value of the recipeBoxRecipeId property.
     * 
     * @return 
     */
    public int getRecipeBoxRecipeId() {
        return recipeBoxRecipeId;
    }

    /**
     * Sets the value of the recipeBoxRecipeId property.
     * 
     * @param value
     */
    public void setRecipeBoxRecipeId(int value) {
        this.recipeBoxRecipeId = value;
    }

    /**
     * Gets the value of the recipeBoxStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipeBoxStatus() {
        return recipeBoxStatus;
    }

    /**
     * Sets the value of the recipeBoxStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipeBoxStatus(String value) {
        this.recipeBoxStatus = value;
    }

    /**
     * Gets the value of the shoppingListStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShoppingListStatus() {
        return shoppingListStatus;
    }

    /**
     * Sets the value of the shoppingListStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShoppingListStatus(String value) {
        this.shoppingListStatus = value;
    }

}
