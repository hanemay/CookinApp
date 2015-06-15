
package com.kraftfoods.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRecipeCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRecipeCategory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecipeCategory" type="{http://www.kraftfoods.com/ws/}RecipeCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRecipeCategory", propOrder = {
    "recipeCategory"
})
public class ArrayOfRecipeCategory {

    @XmlElement(name = "RecipeCategory", nillable = true)
    protected List<RecipeCategory> recipeCategory;

    /**
     * Gets the value of the recipeCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipeCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipeCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecipeCategory }
     * 
     * 
     */
    public List<RecipeCategory> getRecipeCategory() {
        if (recipeCategory == null) {
            recipeCategory = new ArrayList<RecipeCategory>();
        }
        return this.recipeCategory;
    }

}
