
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
 *         &lt;element name="GetCoremetricsSessionIDResult" type="{http://www.kraftfoods.com/ws/}CoremetricsResponse" minOccurs="0"/&gt;
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
    "getCoremetricsSessionIDResult"
})
@XmlRootElement(name = "GetCoremetricsSessionIDResponse")
public class GetCoremetricsSessionIDResponse {

    @XmlElement(name = "GetCoremetricsSessionIDResult")
    protected CoremetricsResponse getCoremetricsSessionIDResult;

    /**
     * Gets the value of the getCoremetricsSessionIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link CoremetricsResponse }
     *     
     */
    public CoremetricsResponse getGetCoremetricsSessionIDResult() {
        return getCoremetricsSessionIDResult;
    }

    /**
     * Sets the value of the getCoremetricsSessionIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoremetricsResponse }
     *     
     */
    public void setGetCoremetricsSessionIDResult(CoremetricsResponse value) {
        this.getCoremetricsSessionIDResult = value;
    }

}
