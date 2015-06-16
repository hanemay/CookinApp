
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MemberRecipeSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberRecipeSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LanguageID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UserRecipeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UserRecipeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedByUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserNBR" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TotalTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvgRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfRatings" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfIngredients" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ingredients" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreparationDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Makes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberRecipeSummary", propOrder = {
    "languageID",
    "userRecipeID",
    "userRecipeName",
    "createdByUser",
    "userNBR",
    "totalTime",
    "notes",
    "avgRating",
    "numberOfRatings",
    "numberOfIngredients",
    "ingredients",
    "preparationDetails",
    "makes",
    "category",
    "subCategory"
})
@XmlSeeAlso({
    MemberRecipeDetail.class
})
public class MemberRecipeSummary {

    /**
     *
     */
    @XmlElement(name = "LanguageID")
    protected int languageID;

    /**
     *
     */
    @XmlElement(name = "UserRecipeID")
    protected int userRecipeID;

    /**
     *
     */
    @XmlElement(name = "UserRecipeName")
    protected String userRecipeName;

    /**
     *
     */
    @XmlElement(name = "CreatedByUser")
    protected String createdByUser;

    /**
     *
     */
    @XmlElement(name = "UserNBR")
    protected int userNBR;

    /**
     *
     */
    @XmlElement(name = "TotalTime")
    protected String totalTime;

    /**
     *
     */
    @XmlElement(name = "Notes")
    protected String notes;

    /**
     *
     */
    @XmlElement(name = "AvgRating")
    protected String avgRating;

    /**
     *
     */
    @XmlElement(name = "NumberOfRatings")
    protected String numberOfRatings;

    /**
     *
     */
    @XmlElement(name = "NumberOfIngredients")
    protected String numberOfIngredients;

    /**
     *
     */
    @XmlElement(name = "Ingredients")
    protected String ingredients;

    /**
     *
     */
    @XmlElement(name = "PreparationDetails")
    protected String preparationDetails;

    /**
     *
     */
    @XmlElement(name = "Makes")
    protected String makes;

    /**
     *
     */
    @XmlElement(name = "Category")
    protected String category;

    /**
     *
     */
    @XmlElement(name = "SubCategory")
    protected String subCategory;

    /**
     * Gets the value of the languageID property.
     * 
     * @return 
     */
    public int getLanguageID() {
        return languageID;
    }

    /**
     * Sets the value of the languageID property.
     * 
     * @param value
     */
    public void setLanguageID(int value) {
        this.languageID = value;
    }

    /**
     * Gets the value of the userRecipeID property.
     * 
     * @return 
     */
    public int getUserRecipeID() {
        return userRecipeID;
    }

    /**
     * Sets the value of the userRecipeID property.
     * 
     * @param value
     */
    public void setUserRecipeID(int value) {
        this.userRecipeID = value;
    }

    /**
     * Gets the value of the userRecipeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRecipeName() {
        return userRecipeName;
    }

    /**
     * Sets the value of the userRecipeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRecipeName(String value) {
        this.userRecipeName = value;
    }

    /**
     * Gets the value of the createdByUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedByUser() {
        return createdByUser;
    }

    /**
     * Sets the value of the createdByUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedByUser(String value) {
        this.createdByUser = value;
    }

    /**
     * Gets the value of the userNBR property.
     * 
     * @return 
     */
    public int getUserNBR() {
        return userNBR;
    }

    /**
     * Sets the value of the userNBR property.
     * 
     * @param value
     */
    public void setUserNBR(int value) {
        this.userNBR = value;
    }

    /**
     * Gets the value of the totalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTime() {
        return totalTime;
    }

    /**
     * Sets the value of the totalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTime(String value) {
        this.totalTime = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the avgRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvgRating() {
        return avgRating;
    }

    /**
     * Sets the value of the avgRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvgRating(String value) {
        this.avgRating = value;
    }

    /**
     * Gets the value of the numberOfRatings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfRatings() {
        return numberOfRatings;
    }

    /**
     * Sets the value of the numberOfRatings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfRatings(String value) {
        this.numberOfRatings = value;
    }

    /**
     * Gets the value of the numberOfIngredients property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfIngredients() {
        return numberOfIngredients;
    }

    /**
     * Sets the value of the numberOfIngredients property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfIngredients(String value) {
        this.numberOfIngredients = value;
    }

    /**
     * Gets the value of the ingredients property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngredients() {
        return ingredients;
    }

    /**
     * Sets the value of the ingredients property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngredients(String value) {
        this.ingredients = value;
    }

    /**
     * Gets the value of the preparationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreparationDetails() {
        return preparationDetails;
    }

    /**
     * Sets the value of the preparationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreparationDetails(String value) {
        this.preparationDetails = value;
    }

    /**
     * Gets the value of the makes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakes() {
        return makes;
    }

    /**
     * Sets the value of the makes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakes(String value) {
        this.makes = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the subCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCategory() {
        return subCategory;
    }

    /**
     * Sets the value of the subCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCategory(String value) {
        this.subCategory = value;
    }

}
