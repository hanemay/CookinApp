
package com.kraftfoods.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfShoppingList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfShoppingList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShoppingList" type="{http://www.kraftfoods.com/ws/}ShoppingList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfShoppingList", propOrder = {
    "shoppingList"
})
public class ArrayOfShoppingList {

    @XmlElement(name = "ShoppingList", nillable = true)
    protected List<ShoppingList> shoppingList;

    /**
     * Gets the value of the shoppingList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shoppingList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShoppingList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShoppingList }
     * 
     * 
     */
    public List<ShoppingList> getShoppingList() {
        if (shoppingList == null) {
            shoppingList = new ArrayList<ShoppingList>();
        }
        return this.shoppingList;
    }

}
