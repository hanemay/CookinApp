
package com.kraftfoods.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRecipeBoxRecipeSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRecipeBoxRecipeSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecipeBoxRecipeSummary" type="{http://www.kraftfoods.com/ws/}RecipeBoxRecipeSummary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRecipeBoxRecipeSummary", propOrder = {
    "recipeBoxRecipeSummary"
})
public class ArrayOfRecipeBoxRecipeSummary {

    /**
     *
     */
    @XmlElement(name = "RecipeBoxRecipeSummary", nillable = true)
    protected List<RecipeBoxRecipeSummary> recipeBoxRecipeSummary;

    /**
     * Gets the value of the recipeBoxRecipeSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipeBoxRecipeSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipeBoxRecipeSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecipeBoxRecipeSummary }
     * 
     * 
     * @return 
     */
    public List<RecipeBoxRecipeSummary> getRecipeBoxRecipeSummary() {
        if (recipeBoxRecipeSummary == null) {
            recipeBoxRecipeSummary = new ArrayList<RecipeBoxRecipeSummary>();
        }
        return this.recipeBoxRecipeSummary;
    }

}
