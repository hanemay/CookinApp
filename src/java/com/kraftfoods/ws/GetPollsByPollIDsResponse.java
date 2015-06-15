
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
 *         &lt;element name="GetPollsByPollIDsResult" type="{http://www.kraftfoods.com/ws/}PollDetailsResponse" minOccurs="0"/&gt;
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
    "getPollsByPollIDsResult"
})
@XmlRootElement(name = "GetPollsByPollIDsResponse")
public class GetPollsByPollIDsResponse {

    @XmlElement(name = "GetPollsByPollIDsResult")
    protected PollDetailsResponse getPollsByPollIDsResult;

    /**
     * Gets the value of the getPollsByPollIDsResult property.
     * 
     * @return
     *     possible object is
     *     {@link PollDetailsResponse }
     *     
     */
    public PollDetailsResponse getGetPollsByPollIDsResult() {
        return getPollsByPollIDsResult;
    }

    /**
     * Sets the value of the getPollsByPollIDsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PollDetailsResponse }
     *     
     */
    public void setGetPollsByPollIDsResult(PollDetailsResponse value) {
        this.getPollsByPollIDsResult = value;
    }

}
