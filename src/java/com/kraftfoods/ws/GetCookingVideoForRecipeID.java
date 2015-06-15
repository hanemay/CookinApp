
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="iRecipeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bIsLowBandwidth" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="iSiteID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iLangID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "iRecipeID",
    "bIsLowBandwidth",
    "iSiteID",
    "iLangID"
})
@XmlRootElement(name = "GetCookingVideoForRecipeID")
public class GetCookingVideoForRecipeID {

    protected String iRecipeID;
    protected boolean bIsLowBandwidth;
    protected String iSiteID;
    protected String iLangID;

    /**
     * Gets the value of the iRecipeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIRecipeID() {
        return iRecipeID;
    }

    /**
     * Sets the value of the iRecipeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIRecipeID(String value) {
        this.iRecipeID = value;
    }

    /**
     * Gets the value of the bIsLowBandwidth property.
     * 
     */
    public boolean isBIsLowBandwidth() {
        return bIsLowBandwidth;
    }

    /**
     * Sets the value of the bIsLowBandwidth property.
     * 
     */
    public void setBIsLowBandwidth(boolean value) {
        this.bIsLowBandwidth = value;
    }

    /**
     * Gets the value of the iSiteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISiteID() {
        return iSiteID;
    }

    /**
     * Sets the value of the iSiteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISiteID(String value) {
        this.iSiteID = value;
    }

    /**
     * Gets the value of the iLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getILangID() {
        return iLangID;
    }

    /**
     * Sets the value of the iLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setILangID(String value) {
        this.iLangID = value;
    }

}
