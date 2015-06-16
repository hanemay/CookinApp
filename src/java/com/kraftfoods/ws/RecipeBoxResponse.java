
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipeBoxResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipeBoxResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kraftfoods.com/ws/}StatusResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecipeBoxRecipeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipeBoxResponse", propOrder = {
    "recipeBoxRecipeId"
})
public class RecipeBoxResponse
    extends StatusResponse
{

    /**
     *
     */
    @XmlElement(name = "RecipeBoxRecipeId")
    protected int recipeBoxRecipeId;

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

}
