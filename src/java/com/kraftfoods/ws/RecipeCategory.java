
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipeCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipeCategory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubCategoryID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SubCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CategoryRank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipeCategory", propOrder = {
    "categoryID",
    "categoryName",
    "subCategoryID",
    "subCategoryName",
    "categoryRank"
})
public class RecipeCategory {

    /**
     *
     */
    @XmlElement(name = "CategoryID")
    protected int categoryID;

    /**
     *
     */
    @XmlElement(name = "CategoryName")
    protected String categoryName;

    /**
     *
     */
    @XmlElement(name = "SubCategoryID")
    protected int subCategoryID;

    /**
     *
     */
    @XmlElement(name = "SubCategoryName")
    protected String subCategoryName;

    /**
     *
     */
    @XmlElement(name = "CategoryRank")
    protected String categoryRank;

    /**
     * Gets the value of the categoryID property.
     * 
     * @return 
     */
    public int getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     */
    public void setCategoryID(int value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the categoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Sets the value of the categoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryName(String value) {
        this.categoryName = value;
    }

    /**
     * Gets the value of the subCategoryID property.
     * 
     * @return 
     */
    public int getSubCategoryID() {
        return subCategoryID;
    }

    /**
     * Sets the value of the subCategoryID property.
     * 
     * @param value
     */
    public void setSubCategoryID(int value) {
        this.subCategoryID = value;
    }

    /**
     * Gets the value of the subCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCategoryName() {
        return subCategoryName;
    }

    /**
     * Sets the value of the subCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCategoryName(String value) {
        this.subCategoryName = value;
    }

    /**
     * Gets the value of the categoryRank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryRank() {
        return categoryRank;
    }

    /**
     * Sets the value of the categoryRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryRank(String value) {
        this.categoryRank = value;
    }

}
