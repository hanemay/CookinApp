
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRecipeCategoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRecipeCategoryResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RecipeCategories" type="{http://www.kraftfoods.com/ws/}ArrayOfRecipeCategory" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRecipeCategoryResponse", propOrder = {
    "status",
    "totalCount",
    "recipeCategories"
})
public class GetRecipeCategoryResponse {

    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "TotalCount")
    protected int totalCount;
    @XmlElement(name = "RecipeCategories")
    protected ArrayOfRecipeCategory recipeCategories;

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
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     */
    public void setTotalCount(int value) {
        this.totalCount = value;
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

}
