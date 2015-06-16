
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
 *         &lt;element name="GetRecipeByRecipeIDResult" type="{http://www.kraftfoods.com/ws/}RecipeDetailResponse" minOccurs="0"/&gt;
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
    "getRecipeByRecipeIDResult"
})
@XmlRootElement(name = "GetRecipeByRecipeIDResponse")
public class GetRecipeByRecipeIDResponse {

    /**
     *
     */
    @XmlElement(name = "GetRecipeByRecipeIDResult")
    protected RecipeDetailResponse getRecipeByRecipeIDResult;

    /**
     * Gets the value of the getRecipeByRecipeIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link RecipeDetailResponse }
     *     
     */
    public RecipeDetailResponse getGetRecipeByRecipeIDResult() {
        return getRecipeByRecipeIDResult;
    }

    /**
     * Sets the value of the getRecipeByRecipeIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipeDetailResponse }
     *     
     */
    public void setGetRecipeByRecipeIDResult(RecipeDetailResponse value) {
        this.getRecipeByRecipeIDResult = value;
    }

}
