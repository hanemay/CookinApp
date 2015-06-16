
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
 *         &lt;element name="DeleteItemFromShoppingListResult" type="{http://www.kraftfoods.com/ws/}StatusResponse" minOccurs="0"/&gt;
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
    "deleteItemFromShoppingListResult"
})
@XmlRootElement(name = "DeleteItemFromShoppingListResponse")
public class DeleteItemFromShoppingListResponse {

    /**
     *
     */
    @XmlElement(name = "DeleteItemFromShoppingListResult")
    protected StatusResponse deleteItemFromShoppingListResult;

    /**
     * Gets the value of the deleteItemFromShoppingListResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatusResponse }
     *     
     */
    public StatusResponse getDeleteItemFromShoppingListResult() {
        return deleteItemFromShoppingListResult;
    }

    /**
     * Sets the value of the deleteItemFromShoppingListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusResponse }
     *     
     */
    public void setDeleteItemFromShoppingListResult(StatusResponse value) {
        this.deleteItemFromShoppingListResult = value;
    }

}
