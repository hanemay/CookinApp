
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShoppingListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShoppingListItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShoppingListItemID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AisleID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RecipeBoxRecipeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuantityNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuantityUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AisleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingListItem", propOrder = {
    "shoppingListItemID",
    "aisleID",
    "recipeBoxRecipeID",
    "name",
    "quantity",
    "quantityNum",
    "quantityUnit",
    "recipeName",
    "aisleName",
    "recipeID"
})
public class ShoppingListItem {

    /**
     *
     */
    @XmlElement(name = "ShoppingListItemID")
    protected int shoppingListItemID;

    /**
     *
     */
    @XmlElement(name = "AisleID")
    protected int aisleID;

    /**
     *
     */
    @XmlElement(name = "RecipeBoxRecipeID")
    protected int recipeBoxRecipeID;

    /**
     *
     */
    @XmlElement(name = "Name")
    protected String name;

    /**
     *
     */
    @XmlElement(name = "Quantity")
    protected String quantity;

    /**
     *
     */
    @XmlElement(name = "QuantityNum")
    protected String quantityNum;

    /**
     *
     */
    @XmlElement(name = "QuantityUnit")
    protected String quantityUnit;

    /**
     *
     */
    @XmlElement(name = "RecipeName")
    protected String recipeName;

    /**
     *
     */
    @XmlElement(name = "AisleName")
    protected String aisleName;

    /**
     *
     */
    @XmlElement(name = "RecipeID")
    protected int recipeID;

    /**
     * Gets the value of the shoppingListItemID property.
     * 
     * @return 
     */
    public int getShoppingListItemID() {
        return shoppingListItemID;
    }

    /**
     * Sets the value of the shoppingListItemID property.
     * 
     * @param value
     */
    public void setShoppingListItemID(int value) {
        this.shoppingListItemID = value;
    }

    /**
     * Gets the value of the aisleID property.
     * 
     * @return 
     */
    public int getAisleID() {
        return aisleID;
    }

    /**
     * Sets the value of the aisleID property.
     * 
     * @param value
     */
    public void setAisleID(int value) {
        this.aisleID = value;
    }

    /**
     * Gets the value of the recipeBoxRecipeID property.
     * 
     * @return 
     */
    public int getRecipeBoxRecipeID() {
        return recipeBoxRecipeID;
    }

    /**
     * Sets the value of the recipeBoxRecipeID property.
     * 
     * @param value
     */
    public void setRecipeBoxRecipeID(int value) {
        this.recipeBoxRecipeID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the quantityNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityNum() {
        return quantityNum;
    }

    /**
     * Sets the value of the quantityNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityNum(String value) {
        this.quantityNum = value;
    }

    /**
     * Gets the value of the quantityUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityUnit() {
        return quantityUnit;
    }

    /**
     * Sets the value of the quantityUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityUnit(String value) {
        this.quantityUnit = value;
    }

    /**
     * Gets the value of the recipeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipeName() {
        return recipeName;
    }

    /**
     * Sets the value of the recipeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipeName(String value) {
        this.recipeName = value;
    }

    /**
     * Gets the value of the aisleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAisleName() {
        return aisleName;
    }

    /**
     * Sets the value of the aisleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAisleName(String value) {
        this.aisleName = value;
    }

    /**
     * Gets the value of the recipeID property.
     * 
     * @return 
     */
    public int getRecipeID() {
        return recipeID;
    }

    /**
     * Sets the value of the recipeID property.
     * 
     * @param value
     */
    public void setRecipeID(int value) {
        this.recipeID = value;
    }

}
