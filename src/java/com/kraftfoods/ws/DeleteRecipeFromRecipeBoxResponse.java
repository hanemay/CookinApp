
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
 *         &lt;element name="DeleteRecipeFromRecipeBoxResult" type="{http://www.kraftfoods.com/ws/}StatusResponse" minOccurs="0"/&gt;
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
    "deleteRecipeFromRecipeBoxResult"
})
@XmlRootElement(name = "DeleteRecipeFromRecipeBoxResponse")
public class DeleteRecipeFromRecipeBoxResponse {

    /**
     *
     */
    @XmlElement(name = "DeleteRecipeFromRecipeBoxResult")
    protected StatusResponse deleteRecipeFromRecipeBoxResult;

    /**
     * Gets the value of the deleteRecipeFromRecipeBoxResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatusResponse }
     *     
     */
    public StatusResponse getDeleteRecipeFromRecipeBoxResult() {
        return deleteRecipeFromRecipeBoxResult;
    }

    /**
     * Sets the value of the deleteRecipeFromRecipeBoxResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusResponse }
     *     
     */
    public void setDeleteRecipeFromRecipeBoxResult(StatusResponse value) {
        this.deleteRecipeFromRecipeBoxResult = value;
    }

}
