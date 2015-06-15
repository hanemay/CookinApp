
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RatingsPagedResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatingsPagedResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kraftfoods.com/ws/}StatusResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvgRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RatingDetails" type="{http://www.kraftfoods.com/ws/}ArrayOfRatingDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatingsPagedResponse", propOrder = {
    "totalCount",
    "avgRating",
    "ratingDetails"
})
public class RatingsPagedResponse
    extends StatusResponse
{

    @XmlElement(name = "TotalCount")
    protected String totalCount;
    @XmlElement(name = "AvgRating")
    protected String avgRating;
    @XmlElement(name = "RatingDetails")
    protected ArrayOfRatingDetail ratingDetails;

    /**
     * Gets the value of the totalCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCount(String value) {
        this.totalCount = value;
    }

    /**
     * Gets the value of the avgRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvgRating() {
        return avgRating;
    }

    /**
     * Sets the value of the avgRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvgRating(String value) {
        this.avgRating = value;
    }

    /**
     * Gets the value of the ratingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRatingDetail }
     *     
     */
    public ArrayOfRatingDetail getRatingDetails() {
        return ratingDetails;
    }

    /**
     * Sets the value of the ratingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRatingDetail }
     *     
     */
    public void setRatingDetails(ArrayOfRatingDetail value) {
        this.ratingDetails = value;
    }

}
