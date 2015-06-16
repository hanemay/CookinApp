
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipeDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipeDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kraftfoods.com/ws/}RecipeSummary"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IngredientDetails" type="{http://www.kraftfoods.com/ws/}ArrayOfIngredientDetail" minOccurs="0"/&gt;
 *         &lt;element name="PreparationDetails" type="{http://www.kraftfoods.com/ws/}ArrayOfPreparationDetail" minOccurs="0"/&gt;
 *         &lt;element name="NutritionItemDetails" type="{http://www.kraftfoods.com/ws/}ArrayOfNutritionItemDetail" minOccurs="0"/&gt;
 *         &lt;element name="NutritionGridItemDetails" type="{http://www.kraftfoods.com/ws/}ArrayOfNutritionGridItemDetail" minOccurs="0"/&gt;
 *         &lt;element name="RatingDetails" type="{http://www.kraftfoods.com/ws/}ArrayOfRatingDetail" minOccurs="0"/&gt;
 *         &lt;element name="ComplimentaryRecipes" type="{http://www.kraftfoods.com/ws/}ArrayOfRecipeSummary" minOccurs="0"/&gt;
 *         &lt;element name="RecipeTipDetails" type="{http://www.kraftfoods.com/ws/}ArrayOfRecipeTipDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipeDetail", propOrder = {
    "ingredientDetails",
    "preparationDetails",
    "nutritionItemDetails",
    "nutritionGridItemDetails",
    "ratingDetails",
    "complimentaryRecipes",
    "recipeTipDetails"
})
public class RecipeDetail
    extends RecipeSummary
{

    /**
     *
     */
    @XmlElement(name = "IngredientDetails")
    protected ArrayOfIngredientDetail ingredientDetails;

    /**
     *
     */
    @XmlElement(name = "PreparationDetails")
    protected ArrayOfPreparationDetail preparationDetails;

    /**
     *
     */
    @XmlElement(name = "NutritionItemDetails")
    protected ArrayOfNutritionItemDetail nutritionItemDetails;

    /**
     *
     */
    @XmlElement(name = "NutritionGridItemDetails")
    protected ArrayOfNutritionGridItemDetail nutritionGridItemDetails;

    /**
     *
     */
    @XmlElement(name = "RatingDetails")
    protected ArrayOfRatingDetail ratingDetails;

    /**
     *
     */
    @XmlElement(name = "ComplimentaryRecipes")
    protected ArrayOfRecipeSummary complimentaryRecipes;

    /**
     *
     */
    @XmlElement(name = "RecipeTipDetails")
    protected ArrayOfRecipeTipDetail recipeTipDetails;

    /**
     * Gets the value of the ingredientDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIngredientDetail }
     *     
     */
    public ArrayOfIngredientDetail getIngredientDetails() {
        return ingredientDetails;
    }

    /**
     * Sets the value of the ingredientDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIngredientDetail }
     *     
     */
    public void setIngredientDetails(ArrayOfIngredientDetail value) {
        this.ingredientDetails = value;
    }

    /**
     * Gets the value of the preparationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPreparationDetail }
     *     
     */
    public ArrayOfPreparationDetail getPreparationDetails() {
        return preparationDetails;
    }

    /**
     * Sets the value of the preparationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPreparationDetail }
     *     
     */
    public void setPreparationDetails(ArrayOfPreparationDetail value) {
        this.preparationDetails = value;
    }

    /**
     * Gets the value of the nutritionItemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNutritionItemDetail }
     *     
     */
    public ArrayOfNutritionItemDetail getNutritionItemDetails() {
        return nutritionItemDetails;
    }

    /**
     * Sets the value of the nutritionItemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNutritionItemDetail }
     *     
     */
    public void setNutritionItemDetails(ArrayOfNutritionItemDetail value) {
        this.nutritionItemDetails = value;
    }

    /**
     * Gets the value of the nutritionGridItemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNutritionGridItemDetail }
     *     
     */
    public ArrayOfNutritionGridItemDetail getNutritionGridItemDetails() {
        return nutritionGridItemDetails;
    }

    /**
     * Sets the value of the nutritionGridItemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNutritionGridItemDetail }
     *     
     */
    public void setNutritionGridItemDetails(ArrayOfNutritionGridItemDetail value) {
        this.nutritionGridItemDetails = value;
    }

    /**
     * Gets the value of the ratingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRatingDetail }
     *     
     */
    public ArrayOfRatingDetail getRatingDetails() {
        return ratingDetails;
    }

    /**
     * Sets the value of the ratingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRatingDetail }
     *     
     */
    public void setRatingDetails(ArrayOfRatingDetail value) {
        this.ratingDetails = value;
    }

    /**
     * Gets the value of the complimentaryRecipes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipeSummary }
     *     
     */
    public ArrayOfRecipeSummary getComplimentaryRecipes() {
        return complimentaryRecipes;
    }

    /**
     * Sets the value of the complimentaryRecipes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipeSummary }
     *     
     */
    public void setComplimentaryRecipes(ArrayOfRecipeSummary value) {
        this.complimentaryRecipes = value;
    }

    /**
     * Gets the value of the recipeTipDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipeTipDetail }
     *     
     */
    public ArrayOfRecipeTipDetail getRecipeTipDetails() {
        return recipeTipDetails;
    }

    /**
     * Sets the value of the recipeTipDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipeTipDetail }
     *     
     */
    public void setRecipeTipDetails(ArrayOfRecipeTipDetail value) {
        this.recipeTipDetails = value;
    }

}
