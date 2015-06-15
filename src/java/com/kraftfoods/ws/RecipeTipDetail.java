
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipeTipDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipeTipDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecipeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TipID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipeTipDetail", propOrder = {
    "recipeID",
    "tipID",
    "tipType",
    "tipName",
    "tipDescription",
    "sequence"
})
public class RecipeTipDetail {

    @XmlElement(name = "RecipeID")
    protected int recipeID;
    @XmlElement(name = "TipID")
    protected int tipID;
    @XmlElement(name = "TipType")
    protected String tipType;
    @XmlElement(name = "TipName")
    protected String tipName;
    @XmlElement(name = "TipDescription")
    protected String tipDescription;
    @XmlElement(name = "Sequence")
    protected int sequence;

    /**
     * Gets the value of the recipeID property.
     * 
     */
    public int getRecipeID() {
        return recipeID;
    }

    /**
     * Sets the value of the recipeID property.
     * 
     */
    public void setRecipeID(int value) {
        this.recipeID = value;
    }

    /**
     * Gets the value of the tipID property.
     * 
     */
    public int getTipID() {
        return tipID;
    }

    /**
     * Sets the value of the tipID property.
     * 
     */
    public void setTipID(int value) {
        this.tipID = value;
    }

    /**
     * Gets the value of the tipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipType() {
        return tipType;
    }

    /**
     * Sets the value of the tipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipType(String value) {
        this.tipType = value;
    }

    /**
     * Gets the value of the tipName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipName() {
        return tipName;
    }

    /**
     * Sets the value of the tipName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipName(String value) {
        this.tipName = value;
    }

    /**
     * Gets the value of the tipDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipDescription() {
        return tipDescription;
    }

    /**
     * Sets the value of the tipDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipDescription(String value) {
        this.tipDescription = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     */
    public int getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     */
    public void setSequence(int value) {
        this.sequence = value;
    }

}
