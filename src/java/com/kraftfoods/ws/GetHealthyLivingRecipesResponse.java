
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
 *         &lt;element name="GetHealthyLivingRecipesResult" type="{http://www.kraftfoods.com/ws/}RecipeSummariesResponse" minOccurs="0"/&gt;
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
    "getHealthyLivingRecipesResult"
})
@XmlRootElement(name = "GetHealthyLivingRecipesResponse")
public class GetHealthyLivingRecipesResponse {

    /**
     *
     */
    @XmlElement(name = "GetHealthyLivingRecipesResult")
    protected RecipeSummariesResponse getHealthyLivingRecipesResult;

    /**
     * Gets the value of the getHealthyLivingRecipesResult property.
     * 
     * @return
     *     possible object is
     *     {@link RecipeSummariesResponse }
     *     
     */
    public RecipeSummariesResponse getGetHealthyLivingRecipesResult() {
        return getHealthyLivingRecipesResult;
    }

    /**
     * Sets the value of the getHealthyLivingRecipesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipeSummariesResponse }
     *     
     */
    public void setGetHealthyLivingRecipesResult(RecipeSummariesResponse value) {
        this.getHealthyLivingRecipesResult = value;
    }

}
