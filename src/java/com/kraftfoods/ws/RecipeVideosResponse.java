
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipeVideosResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipeVideosResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kraftfoods.com/ws/}StatusResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CookingVideoAds" type="{http://www.kraftfoods.com/ws/}ArrayOfCookingVideoAd" minOccurs="0"/&gt;
 *         &lt;element name="RecipeFlashVideos" type="{http://www.kraftfoods.com/ws/}ArrayOfRecipeFlashVideo" minOccurs="0"/&gt;
 *         &lt;element name="Recipe3GPVideo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipeMP4Video" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipeTabletVideo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipeVideosResponse", propOrder = {
    "cookingVideoAds",
    "recipeFlashVideos",
    "recipe3GPVideo",
    "recipeMP4Video",
    "recipeTabletVideo"
})
public class RecipeVideosResponse
    extends StatusResponse
{

    @XmlElement(name = "CookingVideoAds")
    protected ArrayOfCookingVideoAd cookingVideoAds;
    @XmlElement(name = "RecipeFlashVideos")
    protected ArrayOfRecipeFlashVideo recipeFlashVideos;
    @XmlElement(name = "Recipe3GPVideo")
    protected String recipe3GPVideo;
    @XmlElement(name = "RecipeMP4Video")
    protected String recipeMP4Video;
    @XmlElement(name = "RecipeTabletVideo")
    protected String recipeTabletVideo;

    /**
     * Gets the value of the cookingVideoAds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCookingVideoAd }
     *     
     */
    public ArrayOfCookingVideoAd getCookingVideoAds() {
        return cookingVideoAds;
    }

    /**
     * Sets the value of the cookingVideoAds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCookingVideoAd }
     *     
     */
    public void setCookingVideoAds(ArrayOfCookingVideoAd value) {
        this.cookingVideoAds = value;
    }

    /**
     * Gets the value of the recipeFlashVideos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipeFlashVideo }
     *     
     */
    public ArrayOfRecipeFlashVideo getRecipeFlashVideos() {
        return recipeFlashVideos;
    }

    /**
     * Sets the value of the recipeFlashVideos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipeFlashVideo }
     *     
     */
    public void setRecipeFlashVideos(ArrayOfRecipeFlashVideo value) {
        this.recipeFlashVideos = value;
    }

    /**
     * Gets the value of the recipe3GPVideo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipe3GPVideo() {
        return recipe3GPVideo;
    }

    /**
     * Sets the value of the recipe3GPVideo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipe3GPVideo(String value) {
        this.recipe3GPVideo = value;
    }

    /**
     * Gets the value of the recipeMP4Video property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipeMP4Video() {
        return recipeMP4Video;
    }

    /**
     * Sets the value of the recipeMP4Video property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipeMP4Video(String value) {
        this.recipeMP4Video = value;
    }

    /**
     * Gets the value of the recipeTabletVideo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipeTabletVideo() {
        return recipeTabletVideo;
    }

    /**
     * Sets the value of the recipeTabletVideo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipeTabletVideo(String value) {
        this.recipeTabletVideo = value;
    }

}
