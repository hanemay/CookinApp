
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipeBoxRecipeSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipeBoxRecipeSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kraftfoods.com/ws/}RecipeSummary"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecipeBoxRecipeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Categories" type="{http://www.kraftfoods.com/ws/}ArrayOfString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipeBoxRecipeSummary", propOrder = {
    "recipeBoxRecipeID",
    "categories"
})
public class RecipeBoxRecipeSummary
    extends RecipeSummary
{

    /**
     *
     */
    @XmlElement(name = "RecipeBoxRecipeID")
    protected int recipeBoxRecipeID;

    /**
     *
     */
    @XmlElement(name = "Categories")
    protected ArrayOfString categories;

    /**
     * Gets the value of the recipeBoxRecipeID property.
     * 
     * @return 
     */
    public int getRecipeBoxRecipeID() {
        return recipeBoxRecipeID;
    }

    /**
     * Sets the value of the recipeBoxRecipeID property.
     * 
     * @param value
     */
    public void setRecipeBoxRecipeID(int value) {
        this.recipeBoxRecipeID = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCategories(ArrayOfString value) {
        this.categories = value;
    }

}
