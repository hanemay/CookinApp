
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
 *         &lt;element name="IsRecipeInRecipeBoxResult" type="{http://www.kraftfoods.com/ws/}RecipeInRecipeBoxResponse" minOccurs="0"/&gt;
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
    "isRecipeInRecipeBoxResult"
})
@XmlRootElement(name = "IsRecipeInRecipeBoxResponse")
public class IsRecipeInRecipeBoxResponse {

    /**
     *
     */
    @XmlElement(name = "IsRecipeInRecipeBoxResult")
    protected RecipeInRecipeBoxResponse isRecipeInRecipeBoxResult;

    /**
     * Gets the value of the isRecipeInRecipeBoxResult property.
     * 
     * @return
     *     possible object is
     *     {@link RecipeInRecipeBoxResponse }
     *     
     */
    public RecipeInRecipeBoxResponse getIsRecipeInRecipeBoxResult() {
        return isRecipeInRecipeBoxResult;
    }

    /**
     * Sets the value of the isRecipeInRecipeBoxResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipeInRecipeBoxResponse }
     *     
     */
    public void setIsRecipeInRecipeBoxResult(RecipeInRecipeBoxResponse value) {
        this.isRecipeInRecipeBoxResult = value;
    }

}
