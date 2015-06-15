
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
 *         &lt;element name="GetDinnerTonightResult" type="{http://www.kraftfoods.com/ws/}DTSummariesResponse" minOccurs="0"/&gt;
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
    "getDinnerTonightResult"
})
@XmlRootElement(name = "GetDinnerTonightResponse")
public class GetDinnerTonightResponse {

    @XmlElement(name = "GetDinnerTonightResult")
    protected DTSummariesResponse getDinnerTonightResult;

    /**
     * Gets the value of the getDinnerTonightResult property.
     * 
     * @return
     *     possible object is
     *     {@link DTSummariesResponse }
     *     
     */
    public DTSummariesResponse getGetDinnerTonightResult() {
        return getDinnerTonightResult;
    }

    /**
     * Sets the value of the getDinnerTonightResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTSummariesResponse }
     *     
     */
    public void setGetDinnerTonightResult(DTSummariesResponse value) {
        this.getDinnerTonightResult = value;
    }

}
