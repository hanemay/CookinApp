
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipeSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipeSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarbChoices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipeType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LanguageID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PreparationPretext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PointToType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WebPageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RecipeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrepTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfServings" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfIngredients" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvgRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfRatings" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsHealthy" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PhotoURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipeClassifications" type="{http://www.kraftfoods.com/ws/}ArrayOfRecipeClassification" minOccurs="0"/&gt;
 *         &lt;element name="RecipeCategories" type="{http://www.kraftfoods.com/ws/}ArrayOfRecipeCategory" minOccurs="0"/&gt;
 *         &lt;element name="DisplayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipeSummary", propOrder = {
    "carbChoices",
    "recipeType",
    "languageID",
    "preparationPretext",
    "pointToType",
    "webPageName",
    "recipeID",
    "recipeName",
    "prepTime",
    "totalTime",
    "numberOfServings",
    "numberOfIngredients",
    "avgRating",
    "numberOfRatings",
    "isHealthy",
    "photoURL",
    "recipeClassifications",
    "recipeCategories",
    "displayDate"
})
@XmlSeeAlso({
    ROTDSummary.class,
    RecipeDetail.class,
    RecipeBoxRecipeSummary.class,
    DTSummary.class,
    RecipeSummaryDetails.class
})
public class RecipeSummary {

    /**
     *
     */
    @XmlElement(name = "CarbChoices")
    protected String carbChoices;

    /**
     *
     */
    @XmlElement(name = "RecipeType")
    protected int recipeType;

    /**
     *
     */
    @XmlElement(name = "LanguageID")
    protected int languageID;

    /**
     *
     */
    @XmlElement(name = "PreparationPretext")
    protected String preparationPretext;

    /**
     *
     */
    @XmlElement(name = "PointToType")
    protected String pointToType;

    /**
     *
     */
    @XmlElement(name = "WebPageName")
    protected String webPageName;

    /**
     *
     */
    @XmlElement(name = "RecipeID")
    protected int recipeID;

    /**
     *
     */
    @XmlElement(name = "RecipeName")
    protected String recipeName;

    /**
     *
     */
    @XmlElement(name = "PrepTime")
    protected String prepTime;

    /**
     *
     */
    @XmlElement(name = "TotalTime")
    protected String totalTime;

    /**
     *
     */
    @XmlElement(name = "NumberOfServings")
    protected String numberOfServings;

    /**
     *
     */
    @XmlElement(name = "NumberOfIngredients")
    protected String numberOfIngredients;

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
    @XmlElement(name = "IsHealthy")
    protected boolean isHealthy;

    /**
     *
     */
    @XmlElement(name = "PhotoURL")
    protected String photoURL;

    /**
     *
     */
    @XmlElement(name = "RecipeClassifications")
    protected ArrayOfRecipeClassification recipeClassifications;

    /**
     *
     */
    @XmlElement(name = "RecipeCategories")
    protected ArrayOfRecipeCategory recipeCategories;

    /**
     *
     */
    @XmlElement(name = "DisplayDate")
    protected String displayDate;

    /**
     * Gets the value of the carbChoices property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarbChoices() {
        return carbChoices;
    }

    /**
     * Sets the value of the carbChoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarbChoices(String value) {
        this.carbChoices = value;
    }

    /**
     * Gets the value of the recipeType property.
     * 
     * @return 
     */
    public int getRecipeType() {
        return recipeType;
    }

    /**
     * Sets the value of the recipeType property.
     * 
     * @param value
     */
    public void setRecipeType(int value) {
        this.recipeType = value;
    }

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
     * Gets the value of the preparationPretext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreparationPretext() {
        return preparationPretext;
    }

    /**
     * Sets the value of the preparationPretext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreparationPretext(String value) {
        this.preparationPretext = value;
    }

    /**
     * Gets the value of the pointToType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointToType() {
        return pointToType;
    }

    /**
     * Sets the value of the pointToType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointToType(String value) {
        this.pointToType = value;
    }

    /**
     * Gets the value of the webPageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebPageName() {
        return webPageName;
    }

    /**
     * Sets the value of the webPageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebPageName(String value) {
        this.webPageName = value;
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
     * Gets the value of the prepTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepTime() {
        return prepTime;
    }

    /**
     * Sets the value of the prepTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepTime(String value) {
        this.prepTime = value;
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
     * Gets the value of the numberOfServings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfServings() {
        return numberOfServings;
    }

    /**
     * Sets the value of the numberOfServings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfServings(String value) {
        this.numberOfServings = value;
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
     * Gets the value of the isHealthy property.
     * 
     * @return 
     */
    public boolean isIsHealthy() {
        return isHealthy;
    }

    /**
     * Sets the value of the isHealthy property.
     * 
     * @param value
     */
    public void setIsHealthy(boolean value) {
        this.isHealthy = value;
    }

    /**
     * Gets the value of the photoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoURL() {
        return photoURL;
    }

    /**
     * Sets the value of the photoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoURL(String value) {
        this.photoURL = value;
    }

    /**
     * Gets the value of the recipeClassifications property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipeClassification }
     *     
     */
    public ArrayOfRecipeClassification getRecipeClassifications() {
        return recipeClassifications;
    }

    /**
     * Sets the value of the recipeClassifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipeClassification }
     *     
     */
    public void setRecipeClassifications(ArrayOfRecipeClassification value) {
        this.recipeClassifications = value;
    }

    /**
     * Gets the value of the recipeCategories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipeCategory }
     *     
     */
    public ArrayOfRecipeCategory getRecipeCategories() {
        return recipeCategories;
    }

    /**
     * Sets the value of the recipeCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipeCategory }
     *     
     */
    public void setRecipeCategories(ArrayOfRecipeCategory value) {
        this.recipeCategories = value;
    }

    /**
     * Gets the value of the displayDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayDate() {
        return displayDate;
    }

    /**
     * Sets the value of the displayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayDate(String value) {
        this.displayDate = value;
    }

}
