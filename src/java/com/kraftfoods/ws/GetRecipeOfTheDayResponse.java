
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
 *         &lt;element name="GetRecipeOfTheDayResult" type="{http://www.kraftfoods.com/ws/}ROTDSummariesResponse" minOccurs="0"/&gt;
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
    "getRecipeOfTheDayResult"
})
@XmlRootElement(name = "GetRecipeOfTheDayResponse")
public class GetRecipeOfTheDayResponse {

    @XmlElement(name = "GetRecipeOfTheDayResult")
    protected ROTDSummariesResponse getRecipeOfTheDayResult;

    /**
     * Gets the value of the getRecipeOfTheDayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ROTDSummariesResponse }
     *     
     */
    public ROTDSummariesResponse getGetRecipeOfTheDayResult() {
        return getRecipeOfTheDayResult;
    }

    /**
     * Sets the value of the getRecipeOfTheDayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ROTDSummariesResponse }
     *     
     */
    public void setGetRecipeOfTheDayResult(ROTDSummariesResponse value) {
        this.getRecipeOfTheDayResult = value;
    }

}
