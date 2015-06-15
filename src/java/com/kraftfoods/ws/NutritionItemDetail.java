
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NutritionItemDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NutritionItemDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NutritionItemID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NutritionItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NutritionItemDetail", propOrder = {
    "nutritionItemID",
    "nutritionItemName",
    "quantity",
    "unit",
    "displayOrder"
})
public class NutritionItemDetail {

    @XmlElement(name = "NutritionItemID")
    protected int nutritionItemID;
    @XmlElement(name = "NutritionItemName")
    protected String nutritionItemName;
    @XmlElement(name = "Quantity")
    protected String quantity;
    @XmlElement(name = "Unit")
    protected String unit;
    @XmlElement(name = "DisplayOrder")
    protected int displayOrder;

    /**
     * Gets the value of the nutritionItemID property.
     * 
     */
    public int getNutritionItemID() {
        return nutritionItemID;
    }

    /**
     * Sets the value of the nutritionItemID property.
     * 
     */
    public void setNutritionItemID(int value) {
        this.nutritionItemID = value;
    }

    /**
     * Gets the value of the nutritionItemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNutritionItemName() {
        return nutritionItemName;
    }

    /**
     * Sets the value of the nutritionItemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutritionItemName(String value) {
        this.nutritionItemName = value;
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
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the displayOrder property.
     * 
     */
    public int getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Sets the value of the displayOrder property.
     * 
     */
    public void setDisplayOrder(int value) {
        this.displayOrder = value;
    }

}
