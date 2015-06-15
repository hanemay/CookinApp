
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
 *         &lt;element name="GetRecipeCategoriesResult" type="{http://www.kraftfoods.com/ws/}GetRecipeCategoryResponse" minOccurs="0"/&gt;
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
    "getRecipeCategoriesResult"
})
@XmlRootElement(name = "GetRecipeCategoriesResponse")
public class GetRecipeCategoriesResponse {

    @XmlElement(name = "GetRecipeCategoriesResult")
    protected GetRecipeCategoryResponse getRecipeCategoriesResult;

    /**
     * Gets the value of the getRecipeCategoriesResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetRecipeCategoryResponse }
     *     
     */
    public GetRecipeCategoryResponse getGetRecipeCategoriesResult() {
        return getRecipeCategoriesResult;
    }

    /**
     * Sets the value of the getRecipeCategoriesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRecipeCategoryResponse }
     *     
     */
    public void setGetRecipeCategoriesResult(GetRecipeCategoryResponse value) {
        this.getRecipeCategoriesResult = value;
    }

}
