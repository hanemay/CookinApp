
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoRecipeSummariesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoRecipeSummariesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="VideoRecipeSummaries" type="{http://www.kraftfoods.com/ws/}ArrayOfVideoRecipeSummary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoRecipeSummariesResponse", propOrder = {
    "status",
    "totalCount",
    "videoRecipeSummaries"
})
public class VideoRecipeSummariesResponse {

    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "TotalCount")
    protected int totalCount;
    @XmlElement(name = "VideoRecipeSummaries")
    protected ArrayOfVideoRecipeSummary videoRecipeSummaries;

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
     * Gets the value of the videoRecipeSummaries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVideoRecipeSummary }
     *     
     */
    public ArrayOfVideoRecipeSummary getVideoRecipeSummaries() {
        return videoRecipeSummaries;
    }

    /**
     * Sets the value of the videoRecipeSummaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVideoRecipeSummary }
     *     
     */
    public void setVideoRecipeSummaries(ArrayOfVideoRecipeSummary value) {
        this.videoRecipeSummaries = value;
    }

}
