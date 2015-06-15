
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CookingVideoAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CookingVideoAd"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CookingVideoAd", propOrder = {
    "adType",
    "adName",
    "adURL"
})
public class CookingVideoAd {

    @XmlElement(name = "AdType")
    protected String adType;
    @XmlElement(name = "AdName")
    protected String adName;
    @XmlElement(name = "AdURL")
    protected String adURL;

    /**
     * Gets the value of the adType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdType() {
        return adType;
    }

    /**
     * Sets the value of the adType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdType(String value) {
        this.adType = value;
    }

    /**
     * Gets the value of the adName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdName() {
        return adName;
    }

    /**
     * Sets the value of the adName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdName(String value) {
        this.adName = value;
    }

    /**
     * Gets the value of the adURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdURL() {
        return adURL;
    }

    /**
     * Sets the value of the adURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdURL(String value) {
        this.adURL = value;
    }

}
