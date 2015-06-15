
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
 *         &lt;element name="GetRecipeSubCategoriesResult" type="{http://www.kraftfoods.com/ws/}GetRecipeSubCategoryResponse" minOccurs="0"/&gt;
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
    "getRecipeSubCategoriesResult"
})
@XmlRootElement(name = "GetRecipeSubCategoriesResponse")
public class GetRecipeSubCategoriesResponse {

    @XmlElement(name = "GetRecipeSubCategoriesResult")
    protected GetRecipeSubCategoryResponse getRecipeSubCategoriesResult;

    /**
     * Gets the value of the getRecipeSubCategoriesResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetRecipeSubCategoryResponse }
     *     
     */
    public GetRecipeSubCategoryResponse getGetRecipeSubCategoriesResult() {
        return getRecipeSubCategoriesResult;
    }

    /**
     * Sets the value of the getRecipeSubCategoriesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRecipeSubCategoryResponse }
     *     
     */
    public void setGetRecipeSubCategoriesResult(GetRecipeSubCategoryResponse value) {
        this.getRecipeSubCategoriesResult = value;
    }

}
