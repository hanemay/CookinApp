
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
 *         &lt;element name="GetCookingVideosResult" type="{http://www.kraftfoods.com/ws/}VideoRecipeSummariesResponse" minOccurs="0"/&gt;
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
    "getCookingVideosResult"
})
@XmlRootElement(name = "GetCookingVideosResponse")
public class GetCookingVideosResponse {

    /**
     *
     */
    @XmlElement(name = "GetCookingVideosResult")
    protected VideoRecipeSummariesResponse getCookingVideosResult;

    /**
     * Gets the value of the getCookingVideosResult property.
     * 
     * @return
     *     possible object is
     *     {@link VideoRecipeSummariesResponse }
     *     
     */
    public VideoRecipeSummariesResponse getGetCookingVideosResult() {
        return getCookingVideosResult;
    }

    /**
     * Sets the value of the getCookingVideosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoRecipeSummariesResponse }
     *     
     */
    public void setGetCookingVideosResult(VideoRecipeSummariesResponse value) {
        this.getCookingVideosResult = value;
    }

}
