
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrandRecipeSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrandRecipeSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PointToType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrandId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Aisleid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpecialCatId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThumbImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThumbImgUrlDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrandRecipeSummary", propOrder = {
    "pointToType",
    "brandId",
    "aisleid",
    "specialCatId",
    "name",
    "mainImageUrl",
    "thumbImageUrl",
    "thumbImgUrlDesc"
})
public class BrandRecipeSummary {

    /**
     *
     */
    @XmlElement(name = "PointToType")
    protected String pointToType;

    /**
     *
     */
    @XmlElement(name = "BrandId")
    protected String brandId;

    /**
     *
     */
    @XmlElement(name = "Aisleid")
    protected String aisleid;

    /**
     *
     */
    @XmlElement(name = "SpecialCatId")
    protected String specialCatId;

    /**
     *
     */
    @XmlElement(name = "Name")
    protected String name;

    /**
     *
     */
    @XmlElement(name = "MainImageUrl")
    protected String mainImageUrl;

    /**
     *
     */
    @XmlElement(name = "ThumbImageUrl")
    protected String thumbImageUrl;

    /**
     *
     */
    @XmlElement(name = "ThumbImgUrlDesc")
    protected String thumbImgUrlDesc;

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
     * Gets the value of the brandId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandId() {
        return brandId;
    }

    /**
     * Sets the value of the brandId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandId(String value) {
        this.brandId = value;
    }

    /**
     * Gets the value of the aisleid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAisleid() {
        return aisleid;
    }

    /**
     * Sets the value of the aisleid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAisleid(String value) {
        this.aisleid = value;
    }

    /**
     * Gets the value of the specialCatId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialCatId() {
        return specialCatId;
    }

    /**
     * Sets the value of the specialCatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialCatId(String value) {
        this.specialCatId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the mainImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainImageUrl() {
        return mainImageUrl;
    }

    /**
     * Sets the value of the mainImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainImageUrl(String value) {
        this.mainImageUrl = value;
    }

    /**
     * Gets the value of the thumbImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbImageUrl() {
        return thumbImageUrl;
    }

    /**
     * Sets the value of the thumbImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbImageUrl(String value) {
        this.thumbImageUrl = value;
    }

    /**
     * Gets the value of the thumbImgUrlDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbImgUrlDesc() {
        return thumbImgUrlDesc;
    }

    /**
     * Sets the value of the thumbImgUrlDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbImgUrlDesc(String value) {
        this.thumbImgUrlDesc = value;
    }

}
