
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
 *         &lt;element name="GetWYDRecipesResult" type="{http://www.kraftfoods.com/ws/}RecipeSummariesResponse" minOccurs="0"/&gt;
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
    "getWYDRecipesResult"
})
@XmlRootElement(name = "GetWYDRecipesResponse")
public class GetWYDRecipesResponse {

    @XmlElement(name = "GetWYDRecipesResult")
    protected RecipeSummariesResponse getWYDRecipesResult;

    /**
     * Gets the value of the getWYDRecipesResult property.
     * 
     * @return
     *     possible object is
     *     {@link RecipeSummariesResponse }
     *     
     */
    public RecipeSummariesResponse getGetWYDRecipesResult() {
        return getWYDRecipesResult;
    }

    /**
     * Sets the value of the getWYDRecipesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipeSummariesResponse }
     *     
     */
    public void setGetWYDRecipesResult(RecipeSummariesResponse value) {
        this.getWYDRecipesResult = value;
    }

}
