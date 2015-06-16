
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
 *         &lt;element name="GetRecipeVideosResult" type="{http://www.kraftfoods.com/ws/}RecipeVideosResponse" minOccurs="0"/&gt;
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
    "getRecipeVideosResult"
})
@XmlRootElement(name = "GetRecipeVideosResponse")
public class GetRecipeVideosResponse {

    /**
     *
     */
    @XmlElement(name = "GetRecipeVideosResult")
    protected RecipeVideosResponse getRecipeVideosResult;

    /**
     * Gets the value of the getRecipeVideosResult property.
     * 
     * @return
     *     possible object is
     *     {@link RecipeVideosResponse }
     *     
     */
    public RecipeVideosResponse getGetRecipeVideosResult() {
        return getRecipeVideosResult;
    }

    /**
     * Sets the value of the getRecipeVideosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipeVideosResponse }
     *     
     */
    public void setGetRecipeVideosResult(RecipeVideosResponse value) {
        this.getRecipeVideosResult = value;
    }

}
