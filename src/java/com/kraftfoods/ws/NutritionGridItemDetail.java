
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NutritionGridItemDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NutritionGridItemDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NutritionExchangeItemDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NutritionItemDetails" type="{http://www.kraftfoods.com/ws/}ArrayOfNutritionItemDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NutritionGridItemDetail", propOrder = {
    "nutritionExchangeItemDesc",
    "nutritionItemDetails"
})
public class NutritionGridItemDetail {

    /**
     *
     */
    @XmlElement(name = "NutritionExchangeItemDesc")
    protected String nutritionExchangeItemDesc;

    /**
     *
     */
    @XmlElement(name = "NutritionItemDetails")
    protected ArrayOfNutritionItemDetail nutritionItemDetails;

    /**
     * Gets the value of the nutritionExchangeItemDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNutritionExchangeItemDesc() {
        return nutritionExchangeItemDesc;
    }

    /**
     * Sets the value of the nutritionExchangeItemDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutritionExchangeItemDesc(String value) {
        this.nutritionExchangeItemDesc = value;
    }

    /**
     * Gets the value of the nutritionItemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNutritionItemDetail }
     *     
     */
    public ArrayOfNutritionItemDetail getNutritionItemDetails() {
        return nutritionItemDetails;
    }

    /**
     * Sets the value of the nutritionItemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNutritionItemDetail }
     *     
     */
    public void setNutritionItemDetails(ArrayOfNutritionItemDetail value) {
        this.nutritionItemDetails = value;
    }

}
