
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipeIngredientGridHeaderDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipeIngredientGridHeaderDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GridColumnHeadingText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipeIngredientGridDetails" type="{http://www.kraftfoods.com/ws/}ArrayOfRecipeIngredientGridDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipeIngredientGridHeaderDetail", propOrder = {
    "gridColumnHeadingText",
    "recipeIngredientGridDetails"
})
public class RecipeIngredientGridHeaderDetail {

    /**
     *
     */
    @XmlElement(name = "GridColumnHeadingText")
    protected String gridColumnHeadingText;

    /**
     *
     */
    @XmlElement(name = "RecipeIngredientGridDetails")
    protected ArrayOfRecipeIngredientGridDetail recipeIngredientGridDetails;

    /**
     * Gets the value of the gridColumnHeadingText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGridColumnHeadingText() {
        return gridColumnHeadingText;
    }

    /**
     * Sets the value of the gridColumnHeadingText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGridColumnHeadingText(String value) {
        this.gridColumnHeadingText = value;
    }

    /**
     * Gets the value of the recipeIngredientGridDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipeIngredientGridDetail }
     *     
     */
    public ArrayOfRecipeIngredientGridDetail getRecipeIngredientGridDetails() {
        return recipeIngredientGridDetails;
    }

    /**
     * Sets the value of the recipeIngredientGridDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipeIngredientGridDetail }
     *     
     */
    public void setRecipeIngredientGridDetails(ArrayOfRecipeIngredientGridDetail value) {
        this.recipeIngredientGridDetails = value;
    }

}
