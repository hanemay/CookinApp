
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
 *         &lt;element name="GetPollsByRelationIDResult" type="{http://www.kraftfoods.com/ws/}PollDetailsResponse" minOccurs="0"/&gt;
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
    "getPollsByRelationIDResult"
})
@XmlRootElement(name = "GetPollsByRelationIDResponse")
public class GetPollsByRelationIDResponse {

    /**
     *
     */
    @XmlElement(name = "GetPollsByRelationIDResult")
    protected PollDetailsResponse getPollsByRelationIDResult;

    /**
     * Gets the value of the getPollsByRelationIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link PollDetailsResponse }
     *     
     */
    public PollDetailsResponse getGetPollsByRelationIDResult() {
        return getPollsByRelationIDResult;
    }

    /**
     * Sets the value of the getPollsByRelationIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PollDetailsResponse }
     *     
     */
    public void setGetPollsByRelationIDResult(PollDetailsResponse value) {
        this.getPollsByRelationIDResult = value;
    }

}
