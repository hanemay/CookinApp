
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShoppingListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShoppingListResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kraftfoods.com/ws/}StatusResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShoppingListId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingListResponse", propOrder = {
    "shoppingListId",
    "errorCode"
})
public class ShoppingListResponse
    extends StatusResponse
{

    @XmlElement(name = "ShoppingListId")
    protected int shoppingListId;
    @XmlElement(name = "ErrorCode")
    protected int errorCode;

    /**
     * Gets the value of the shoppingListId property.
     * 
     */
    public int getShoppingListId() {
        return shoppingListId;
    }

    /**
     * Sets the value of the shoppingListId property.
     * 
     */
    public void setShoppingListId(int value) {
        this.shoppingListId = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     */
    public void setErrorCode(int value) {
        this.errorCode = value;
    }

}
