
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
 *         &lt;element name="iSiteUserID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iRecipeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "iSiteUserID",
    "iRecipeID",
    "iShoppingListID"
})
@XmlRootElement(name = "AddRecipeToRecipeBoxShoppingList")
public class AddRecipeToRecipeBoxShoppingList {

    protected int iSiteUserID;
    protected int iRecipeID;
    protected int iShoppingListID;

    /**
     * Gets the value of the iSiteUserID property.
     * 
     */
    public int getISiteUserID() {
        return iSiteUserID;
    }

    /**
     * Sets the value of the iSiteUserID property.
     * 
     */
    public void setISiteUserID(int value) {
        this.iSiteUserID = value;
    }

    /**
     * Gets the value of the iRecipeID property.
     * 
     */
    public int getIRecipeID() {
        return iRecipeID;
    }

    /**
     * Sets the value of the iRecipeID property.
     * 
     */
    public void setIRecipeID(int value) {
        this.iRecipeID = value;
    }

    /**
     * Gets the value of the iShoppingListID property.
     * 
     */
    public int getIShoppingListID() {
        return iShoppingListID;
    }

    /**
     * Sets the value of the iShoppingListID property.
     * 
     */
    public void setIShoppingListID(int value) {
        this.iShoppingListID = value;
    }

}
