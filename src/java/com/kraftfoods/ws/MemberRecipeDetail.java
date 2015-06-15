
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MemberRecipeDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberRecipeDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kraftfoods.com/ws/}MemberRecipeSummary"&gt;
 *       &lt;sequence&gt;
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
@XmlType(name = "MemberRecipeDetail", propOrder = {
    "ratingDetails"
})
public class MemberRecipeDetail
    extends MemberRecipeSummary
{

    @XmlElement(name = "RatingDetails")
    protected ArrayOfRatingDetail ratingDetails;

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
