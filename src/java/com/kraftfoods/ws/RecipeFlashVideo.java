
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipeFlashVideo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipeFlashVideo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VideoImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VideoPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VideoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipeFlashVideo", propOrder = {
    "videoImage",
    "videoPath",
    "videoUrl"
})
public class RecipeFlashVideo {

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

}
