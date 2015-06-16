
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
 *         &lt;element name="GetRecipesByDatesResult" type="{http://www.kraftfoods.com/ws/}RecipeSummaryDetailsResponse" minOccurs="0"/&gt;
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
    "getRecipesByDatesResult"
})
@XmlRootElement(name = "GetRecipesByDatesResponse")
public class GetRecipesByDatesResponse {

    /**
     *
     */
    @XmlElement(name = "GetRecipesByDatesResult")
    protected RecipeSummaryDetailsResponse getRecipesByDatesResult;

    /**
     * Gets the value of the getRecipesByDatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link RecipeSummaryDetailsResponse }
     *     
     */
    public RecipeSummaryDetailsResponse getGetRecipesByDatesResult() {
        return getRecipesByDatesResult;
    }

    /**
     * Sets the value of the getRecipesByDatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipeSummaryDetailsResponse }
     *     
     */
    public void setGetRecipesByDatesResult(RecipeSummaryDetailsResponse value) {
        this.getRecipesByDatesResult = value;
    }

}
