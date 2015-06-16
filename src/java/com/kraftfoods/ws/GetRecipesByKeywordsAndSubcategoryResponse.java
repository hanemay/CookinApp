
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
 *         &lt;element name="GetRecipesByKeywordsAndSubcategoryResult" type="{http://www.kraftfoods.com/ws/}RecipeSummariesResponse" minOccurs="0"/&gt;
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
    "getRecipesByKeywordsAndSubcategoryResult"
})
@XmlRootElement(name = "GetRecipesByKeywordsAndSubcategoryResponse")
public class GetRecipesByKeywordsAndSubcategoryResponse {

    /**
     *
     */
    @XmlElement(name = "GetRecipesByKeywordsAndSubcategoryResult")
    protected RecipeSummariesResponse getRecipesByKeywordsAndSubcategoryResult;

    /**
     * Gets the value of the getRecipesByKeywordsAndSubcategoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link RecipeSummariesResponse }
     *     
     */
    public RecipeSummariesResponse getGetRecipesByKeywordsAndSubcategoryResult() {
        return getRecipesByKeywordsAndSubcategoryResult;
    }

    /**
     * Sets the value of the getRecipesByKeywordsAndSubcategoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipeSummariesResponse }
     *     
     */
    public void setGetRecipesByKeywordsAndSubcategoryResult(RecipeSummariesResponse value) {
        this.getRecipesByKeywordsAndSubcategoryResult = value;
    }

}
