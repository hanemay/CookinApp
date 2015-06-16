
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipeBoxRecipeSummariesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipeBoxRecipeSummariesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CategoryCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RecipeBoxRecipeSummaries" type="{http://www.kraftfoods.com/ws/}ArrayOfRecipeBoxRecipeSummary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipeBoxRecipeSummariesResponse", propOrder = {
    "status",
    "totalCount",
    "categoryCount",
    "recipeBoxRecipeSummaries"
})
public class RecipeBoxRecipeSummariesResponse {

    /**
     *
     */
    @XmlElement(name = "Status")
    protected String status;

    /**
     *
     */
    @XmlElement(name = "TotalCount")
    protected int totalCount;

    /**
     *
     */
    @XmlElement(name = "CategoryCount")
    protected int categoryCount;

    /**
     *
     */
    @XmlElement(name = "RecipeBoxRecipeSummaries")
    protected ArrayOfRecipeBoxRecipeSummary recipeBoxRecipeSummaries;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the totalCount property.
     * 
     * @return 
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     * @param value
     */
    public void setTotalCount(int value) {
        this.totalCount = value;
    }

    /**
     * Gets the value of the categoryCount property.
     * 
     * @return 
     */
    public int getCategoryCount() {
        return categoryCount;
    }

    /**
     * Sets the value of the categoryCount property.
     * 
     * @param value
     */
    public void setCategoryCount(int value) {
        this.categoryCount = value;
    }

    /**
     * Gets the value of the recipeBoxRecipeSummaries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipeBoxRecipeSummary }
     *     
     */
    public ArrayOfRecipeBoxRecipeSummary getRecipeBoxRecipeSummaries() {
        return recipeBoxRecipeSummaries;
    }

    /**
     * Sets the value of the recipeBoxRecipeSummaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipeBoxRecipeSummary }
     *     
     */
    public void setRecipeBoxRecipeSummaries(ArrayOfRecipeBoxRecipeSummary value) {
        this.recipeBoxRecipeSummaries = value;
    }

}
