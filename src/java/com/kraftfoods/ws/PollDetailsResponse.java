
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PollDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PollDetailsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PollDetails" type="{http://www.kraftfoods.com/ws/}ArrayOfPollDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PollDetailsResponse", propOrder = {
    "status",
    "totalCount",
    "pollDetails"
})
public class PollDetailsResponse {

    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "TotalCount")
    protected int totalCount;
    @XmlElement(name = "PollDetails")
    protected ArrayOfPollDetail pollDetails;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the totalCount property.
     * 
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     */
    public void setTotalCount(int value) {
        this.totalCount = value;
    }

    /**
     * Gets the value of the pollDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPollDetail }
     *     
     */
    public ArrayOfPollDetail getPollDetails() {
        return pollDetails;
    }

    /**
     * Sets the value of the pollDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPollDetail }
     *     
     */
    public void setPollDetails(ArrayOfPollDetail value) {
        this.pollDetails = value;
    }

}
