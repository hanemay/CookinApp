
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddItemToShoppingListResponseNew complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddItemToShoppingListResponseNew"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kraftfoods.com/ws/}StatusResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddItemToShoppingListResults" type="{http://www.kraftfoods.com/ws/}ArrayOfAddItemToShoppingListResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddItemToShoppingListResponseNew", propOrder = {
    "addItemToShoppingListResults"
})
public class AddItemToShoppingListResponseNew
    extends StatusResponse
{

    /**
     *
     */
    @XmlElement(name = "AddItemToShoppingListResults")
    protected ArrayOfAddItemToShoppingListResult addItemToShoppingListResults;

    /**
     * Gets the value of the addItemToShoppingListResults property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAddItemToShoppingListResult }
     *     
     */
    public ArrayOfAddItemToShoppingListResult getAddItemToShoppingListResults() {
        return addItemToShoppingListResults;
    }

    /**
     * Sets the value of the addItemToShoppingListResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddItemToShoppingListResult }
     *     
     */
    public void setAddItemToShoppingListResults(ArrayOfAddItemToShoppingListResult value) {
        this.addItemToShoppingListResults = value;
    }

}
