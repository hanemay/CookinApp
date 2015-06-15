
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SiteUserID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RecipeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "siteUserID",
    "recipeID"
})
@XmlRootElement(name = "IsRecipeInRecipeBox")
public class IsRecipeInRecipeBox {

    @XmlElement(name = "SiteUserID")
    protected int siteUserID;
    @XmlElement(name = "RecipeID")
    protected int recipeID;

    /**
     * Gets the value of the siteUserID property.
     * 
     */
    public int getSiteUserID() {
        return siteUserID;
    }

    /**
     * Sets the value of the siteUserID property.
     * 
     */
    public void setSiteUserID(int value) {
        this.siteUserID = value;
    }

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

}
