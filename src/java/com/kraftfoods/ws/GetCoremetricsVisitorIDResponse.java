
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
 *         &lt;element name="GetCoremetricsVisitorIDResult" type="{http://www.kraftfoods.com/ws/}CoremetricsResponse" minOccurs="0"/&gt;
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
    "getCoremetricsVisitorIDResult"
})
@XmlRootElement(name = "GetCoremetricsVisitorIDResponse")
public class GetCoremetricsVisitorIDResponse {

    /**
     *
     */
    @XmlElement(name = "GetCoremetricsVisitorIDResult")
    protected CoremetricsResponse getCoremetricsVisitorIDResult;

    /**
     * Gets the value of the getCoremetricsVisitorIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link CoremetricsResponse }
     *     
     */
    public CoremetricsResponse getGetCoremetricsVisitorIDResult() {
        return getCoremetricsVisitorIDResult;
    }

    /**
     * Sets the value of the getCoremetricsVisitorIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoremetricsResponse }
     *     
     */
    public void setGetCoremetricsVisitorIDResult(CoremetricsResponse value) {
        this.getCoremetricsVisitorIDResult = value;
    }

}
