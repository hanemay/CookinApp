
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
 *         &lt;element name="GetRecipesFromRecipeBoxResult" type="{http://www.kraftfoods.com/ws/}RecipeBoxRecipeSummariesResponse" minOccurs="0"/&gt;
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
    "getRecipesFromRecipeBoxResult"
})
@XmlRootElement(name = "GetRecipesFromRecipeBoxResponse")
public class GetRecipesFromRecipeBoxResponse {

    /**
     *
     */
    @XmlElement(name = "GetRecipesFromRecipeBoxResult")
    protected RecipeBoxRecipeSummariesResponse getRecipesFromRecipeBoxResult;

    /**
     * Gets the value of the getRecipesFromRecipeBoxResult property.
     * 
     * @return
     *     possible object is
     *     {@link RecipeBoxRecipeSummariesResponse }
     *     
     */
    public RecipeBoxRecipeSummariesResponse getGetRecipesFromRecipeBoxResult() {
        return getRecipesFromRecipeBoxResult;
    }

    /**
     * Sets the value of the getRecipesFromRecipeBoxResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipeBoxRecipeSummariesResponse }
     *     
     */
    public void setGetRecipesFromRecipeBoxResult(RecipeBoxRecipeSummariesResponse value) {
        this.getRecipesFromRecipeBoxResult = value;
    }

}
