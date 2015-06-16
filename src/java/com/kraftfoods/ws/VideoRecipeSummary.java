
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoRecipeSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoRecipeSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PointToType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipeSummary" type="{http://www.kraftfoods.com/ws/}RecipeSummary" minOccurs="0"/&gt;
 *         &lt;element name="CookingVideoAds" type="{http://www.kraftfoods.com/ws/}ArrayOfCookingVideoAd" minOccurs="0"/&gt;
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VideoImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VideoPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VideoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Video_TabletURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoRecipeSummary", propOrder = {
    "pointToType",
    "recipeSummary",
    "cookingVideoAds",
    "duration",
    "videoImage",
    "videoPath",
    "videoUrl",
    "videoTabletURL"
})
public class VideoRecipeSummary {

    /**
     *
     */
    @XmlElement(name = "PointToType")
    protected String pointToType;

    /**
     *
     */
    @XmlElement(name = "RecipeSummary")
    protected RecipeSummary recipeSummary;

    /**
     *
     */
    @XmlElement(name = "CookingVideoAds")
    protected ArrayOfCookingVideoAd cookingVideoAds;

    /**
     *
     */
    @XmlElement(name = "Duration")
    protected String duration;

    /**
     *
     */
    @XmlElement(name = "VideoImage")
    protected String videoImage;

    /**
     *
     */
    @XmlElement(name = "VideoPath")
    protected String videoPath;

    /**
     *
     */
    @XmlElement(name = "VideoUrl")
    protected String videoUrl;

    /**
     *
     */
    @XmlElement(name = "Video_TabletURL")
    protected String videoTabletURL;

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
     * Gets the value of the recipeSummary property.
     * 
     * @return
     *     possible object is
     *     {@link RecipeSummary }
     *     
     */
    public RecipeSummary getRecipeSummary() {
        return recipeSummary;
    }

    /**
     * Sets the value of the recipeSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipeSummary }
     *     
     */
    public void setRecipeSummary(RecipeSummary value) {
        this.recipeSummary = value;
    }

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
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the videoImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoImage() {
        return videoImage;
    }

    /**
     * Sets the value of the videoImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoImage(String value) {
        this.videoImage = value;
    }

    /**
     * Gets the value of the videoPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoPath() {
        return videoPath;
    }

    /**
     * Sets the value of the videoPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoPath(String value) {
        this.videoPath = value;
    }

    /**
     * Gets the value of the videoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    /**
     * Sets the value of the videoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoUrl(String value) {
        this.videoUrl = value;
    }

    /**
     * Gets the value of the videoTabletURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoTabletURL() {
        return videoTabletURL;
    }

    /**
     * Sets the value of the videoTabletURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoTabletURL(String value) {
        this.videoTabletURL = value;
    }

}
