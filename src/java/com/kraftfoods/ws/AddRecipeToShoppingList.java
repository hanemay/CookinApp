
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="iRecipeBoxRecipeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iShoppingListID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "iRecipeBoxRecipeID",
    "iShoppingListID"
})
@XmlRootElement(name = "AddRecipeToShoppingList")
public class AddRecipeToShoppingList {

    /**
     *
     */
    protected int iRecipeBoxRecipeID;

    /**
     *
     */
    protected int iShoppingListID;

    /**
     * Gets the value of the iRecipeBoxRecipeID property.
     * 
     * @return 
     */
    public int getIRecipeBoxRecipeID() {
        return iRecipeBoxRecipeID;
    }

    /**
     * Sets the value of the iRecipeBoxRecipeID property.
     * 
     * @param value
     */
    public void setIRecipeBoxRecipeID(int value) {
        this.iRecipeBoxRecipeID = value;
    }

    /**
     * Gets the value of the iShoppingListID property.
     * 
     * @return 
     */
    public int getIShoppingListID() {
        return iShoppingListID;
    }

    /**
     * Sets the value of the iShoppingListID property.
     * 
     * @param value
     */
    public void setIShoppingListID(int value) {
        this.iShoppingListID = value;
    }

}
