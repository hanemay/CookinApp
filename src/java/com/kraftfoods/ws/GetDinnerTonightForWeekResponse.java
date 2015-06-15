
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
 *         &lt;element name="GetDinnerTonightForWeekResult" type="{http://www.kraftfoods.com/ws/}DTSummariesResponse" minOccurs="0"/&gt;
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
    "getDinnerTonightForWeekResult"
})
@XmlRootElement(name = "GetDinnerTonightForWeekResponse")
public class GetDinnerTonightForWeekResponse {

    @XmlElement(name = "GetDinnerTonightForWeekResult")
    protected DTSummariesResponse getDinnerTonightForWeekResult;

    /**
     * Gets the value of the getDinnerTonightForWeekResult property.
     * 
     * @return
     *     possible object is
     *     {@link DTSummariesResponse }
     *     
     */
    public DTSummariesResponse getGetDinnerTonightForWeekResult() {
        return getDinnerTonightForWeekResult;
    }

    /**
     * Sets the value of the getDinnerTonightForWeekResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTSummariesResponse }
     *     
     */
    public void setGetDinnerTonightForWeekResult(DTSummariesResponse value) {
        this.getDinnerTonightForWeekResult = value;
    }

}
