
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
 *         &lt;element name="GetShoppingListSortedResult" type="{http://www.kraftfoods.com/ws/}SortedShoppingListResponse" minOccurs="0"/&gt;
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
    "getShoppingListSortedResult"
})
@XmlRootElement(name = "GetShoppingListSortedResponse")
public class GetShoppingListSortedResponse {

    @XmlElement(name = "GetShoppingListSortedResult")
    protected SortedShoppingListResponse getShoppingListSortedResult;

    /**
     * Gets the value of the getShoppingListSortedResult property.
     * 
     * @return
     *     possible object is
     *     {@link SortedShoppingListResponse }
     *     
     */
    public SortedShoppingListResponse getGetShoppingListSortedResult() {
        return getShoppingListSortedResult;
    }

    /**
     * Sets the value of the getShoppingListSortedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortedShoppingListResponse }
     *     
     */
    public void setGetShoppingListSortedResult(SortedShoppingListResponse value) {
        this.getShoppingListSortedResult = value;
    }

}
