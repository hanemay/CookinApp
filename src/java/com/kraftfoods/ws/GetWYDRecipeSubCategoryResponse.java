
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
 *         &lt;element name="GetWYDRecipeSubCategoryResult" type="{http://www.kraftfoods.com/ws/}RecipeSubCategoryResponse" minOccurs="0"/&gt;
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
    "getWYDRecipeSubCategoryResult"
})
@XmlRootElement(name = "GetWYDRecipeSubCategoryResponse")
public class GetWYDRecipeSubCategoryResponse {

    @XmlElement(name = "GetWYDRecipeSubCategoryResult")
    protected RecipeSubCategoryResponse getWYDRecipeSubCategoryResult;

    /**
     * Gets the value of the getWYDRecipeSubCategoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link RecipeSubCategoryResponse }
     *     
     */
    public RecipeSubCategoryResponse getGetWYDRecipeSubCategoryResult() {
        return getWYDRecipeSubCategoryResult;
    }

    /**
     * Sets the value of the getWYDRecipeSubCategoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipeSubCategoryResponse }
     *     
     */
    public void setGetWYDRecipeSubCategoryResult(RecipeSubCategoryResponse value) {
        this.getWYDRecipeSubCategoryResult = value;
    }

}
