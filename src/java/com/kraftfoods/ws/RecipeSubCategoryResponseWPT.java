
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipeSubCategoryResponseWPT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipeSubCategoryResponseWPT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RecipeSubCategories" type="{http://www.kraftfoods.com/ws/}ArrayOfRecipeSubCategoryWPT" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipeSubCategoryResponseWPT", propOrder = {
    "status",
    "title",
    "totalCount",
    "recipeSubCategories"
})
public class RecipeSubCategoryResponseWPT {

    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "TotalCount")
    protected int totalCount;
    @XmlElement(name = "RecipeSubCategories")
    protected ArrayOfRecipeSubCategoryWPT recipeSubCategories;

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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
     * Gets the value of the recipeSubCategories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipeSubCategoryWPT }
     *     
     */
    public ArrayOfRecipeSubCategoryWPT getRecipeSubCategories() {
        return recipeSubCategories;
    }

    /**
     * Sets the value of the recipeSubCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipeSubCategoryWPT }
     *     
     */
    public void setRecipeSubCategories(ArrayOfRecipeSubCategoryWPT value) {
        this.recipeSubCategories = value;
    }

}
