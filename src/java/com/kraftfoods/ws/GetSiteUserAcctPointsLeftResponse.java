
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
 *         &lt;element name="GetSiteUserAcctPointsLeftResult" type="{http://www.kraftfoods.com/ws/}SiteUserAcctPointsLeftResponse" minOccurs="0"/&gt;
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
    "getSiteUserAcctPointsLeftResult"
})
@XmlRootElement(name = "GetSiteUserAcctPointsLeftResponse")
public class GetSiteUserAcctPointsLeftResponse {

    /**
     *
     */
    @XmlElement(name = "GetSiteUserAcctPointsLeftResult")
    protected SiteUserAcctPointsLeftResponse getSiteUserAcctPointsLeftResult;

    /**
     * Gets the value of the getSiteUserAcctPointsLeftResult property.
     * 
     * @return
     *     possible object is
     *     {@link SiteUserAcctPointsLeftResponse }
     *     
     */
    public SiteUserAcctPointsLeftResponse getGetSiteUserAcctPointsLeftResult() {
        return getSiteUserAcctPointsLeftResult;
    }

    /**
     * Sets the value of the getSiteUserAcctPointsLeftResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteUserAcctPointsLeftResponse }
     *     
     */
    public void setGetSiteUserAcctPointsLeftResult(SiteUserAcctPointsLeftResponse value) {
        this.getSiteUserAcctPointsLeftResult = value;
    }

}
