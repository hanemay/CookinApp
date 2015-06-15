
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IngredientDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IngredientDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecipeIngredientID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IngredientID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IngredientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuantityText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuantityNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuantityUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostPreparation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrePreparation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LinkURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LinkText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Headline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RolloverHTML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipeIngredientGridHeaderDetails" type="{http://www.kraftfoods.com/ws/}ArrayOfRecipeIngredientGridHeaderDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IngredientDetail", propOrder = {
    "recipeIngredientID",
    "ingredientID",
    "ingredientName",
    "quantityText",
    "quantityNum",
    "quantityUnit",
    "postPreparation",
    "prePreparation",
    "linkURL",
    "linkText",
    "headline",
    "imageURL",
    "description",
    "rolloverHTML",
    "recipeIngredientGridHeaderDetails"
})
public class IngredientDetail {

    @XmlElement(name = "RecipeIngredientID")
    protected int recipeIngredientID;
    @XmlElement(name = "IngredientID")
    protected int ingredientID;
    @XmlElement(name = "IngredientName")
    protected String ingredientName;
    @XmlElement(name = "QuantityText")
    protected String quantityText;
    @XmlElement(name = "QuantityNum")
    protected String quantityNum;
    @XmlElement(name = "QuantityUnit")
    protected String quantityUnit;
    @XmlElement(name = "PostPreparation")
    protected String postPreparation;
    @XmlElement(name = "PrePreparation")
    protected String prePreparation;
    @XmlElement(name = "LinkURL")
    protected String linkURL;
    @XmlElement(name = "LinkText")
    protected String linkText;
    @XmlElement(name = "Headline")
    protected String headline;
    @XmlElement(name = "ImageURL")
    protected String imageURL;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "RolloverHTML")
    protected String rolloverHTML;
    @XmlElement(name = "RecipeIngredientGridHeaderDetails")
    protected ArrayOfRecipeIngredientGridHeaderDetail recipeIngredientGridHeaderDetails;

    /**
     * Gets the value of the recipeIngredientID property.
     * 
     */
    public int getRecipeIngredientID() {
        return recipeIngredientID;
    }

    /**
     * Sets the value of the recipeIngredientID property.
     * 
     */
    public void setRecipeIngredientID(int value) {
        this.recipeIngredientID = value;
    }

    /**
     * Gets the value of the ingredientID property.
     * 
     */
    public int getIngredientID() {
        return ingredientID;
    }

    /**
     * Sets the value of the ingredientID property.
     * 
     */
    public void setIngredientID(int value) {
        this.ingredientID = value;
    }

    /**
     * Gets the value of the ingredientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngredientName() {
        return ingredientName;
    }

    /**
     * Sets the value of the ingredientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngredientName(String value) {
        this.ingredientName = value;
    }

    /**
     * Gets the value of the quantityText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityText() {
        return quantityText;
    }

    /**
     * Sets the value of the quantityText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityText(String value) {
        this.quantityText = value;
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
     * Gets the value of the postPreparation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostPreparation() {
        return postPreparation;
    }

    /**
     * Sets the value of the postPreparation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostPreparation(String value) {
        this.postPreparation = value;
    }

    /**
     * Gets the value of the prePreparation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrePreparation() {
        return prePreparation;
    }

    /**
     * Sets the value of the prePreparation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrePreparation(String value) {
        this.prePreparation = value;
    }

    /**
     * Gets the value of the linkURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkURL() {
        return linkURL;
    }

    /**
     * Sets the value of the linkURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkURL(String value) {
        this.linkURL = value;
    }

    /**
     * Gets the value of the linkText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkText() {
        return linkText;
    }

    /**
     * Sets the value of the linkText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkText(String value) {
        this.linkText = value;
    }

    /**
     * Gets the value of the headline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadline() {
        return headline;
    }

    /**
     * Sets the value of the headline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadline(String value) {
        this.headline = value;
    }

    /**
     * Gets the value of the imageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageURL() {
        return imageURL;
    }

    /**
     * Sets the value of the imageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageURL(String value) {
        this.imageURL = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the rolloverHTML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolloverHTML() {
        return rolloverHTML;
    }

    /**
     * Sets the value of the rolloverHTML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolloverHTML(String value) {
        this.rolloverHTML = value;
    }

    /**
     * Gets the value of the recipeIngredientGridHeaderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipeIngredientGridHeaderDetail }
     *     
     */
    public ArrayOfRecipeIngredientGridHeaderDetail getRecipeIngredientGridHeaderDetails() {
        return recipeIngredientGridHeaderDetails;
    }

    /**
     * Sets the value of the recipeIngredientGridHeaderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipeIngredientGridHeaderDetail }
     *     
     */
    public void setRecipeIngredientGridHeaderDetails(ArrayOfRecipeIngredientGridHeaderDetail value) {
        this.recipeIngredientGridHeaderDetails = value;
    }

}
