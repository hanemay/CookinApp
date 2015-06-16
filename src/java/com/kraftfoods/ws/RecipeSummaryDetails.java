
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipeSummaryDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipeSummaryDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kraftfoods.com/ws/}RecipeSummary"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IngredientDetails" type="{http://www.kraftfoods.com/ws/}ArrayOfIngredientDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipeSummaryDetails", propOrder = {
    "ingredientDetails"
})
public class RecipeSummaryDetails
    extends RecipeSummary
{

    /**
     *
     */
    @XmlElement(name = "IngredientDetails")
    protected ArrayOfIngredientDetail ingredientDetails;

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

}
