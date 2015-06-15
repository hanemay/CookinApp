
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
 *         &lt;element name="GetTraditionalRecipesByDatesResult" type="{http://www.kraftfoods.com/ws/}RecipeDetailResponses" minOccurs="0"/&gt;
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
    "getTraditionalRecipesByDatesResult"
})
@XmlRootElement(name = "GetTraditionalRecipesByDatesResponse")
public class GetTraditionalRecipesByDatesResponse {

    @XmlElement(name = "GetTraditionalRecipesByDatesResult")
    protected RecipeDetailResponses getTraditionalRecipesByDatesResult;

    /**
     * Gets the value of the getTraditionalRecipesByDatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link RecipeDetailResponses }
     *     
     */
    public RecipeDetailResponses getGetTraditionalRecipesByDatesResult() {
        return getTraditionalRecipesByDatesResult;
    }

    /**
     * Sets the value of the getTraditionalRecipesByDatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipeDetailResponses }
     *     
     */
    public void setGetTraditionalRecipesByDatesResult(RecipeDetailResponses value) {
        this.getTraditionalRecipesByDatesResult = value;
    }

}
