
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
 *         &lt;element name="iBrandID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iLangID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iCatGroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sIsHealthyLiving" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sFilterDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "iBrandID",
    "iLangID",
    "iCatGroupID",
    "sIsHealthyLiving",
    "sFilterDays"
})
@XmlRootElement(name = "GetTopTenRecipesByCategory")
public class GetTopTenRecipesByCategory {

    /**
     *
     */
    protected int iBrandID;

    /**
     *
     */
    protected int iLangID;

    /**
     *
     */
    protected String iCatGroupID;

    /**
     *
     */
    protected String sIsHealthyLiving;

    /**
     *
     */
    protected String sFilterDays;

    /**
     * Gets the value of the iBrandID property.
     * 
     * @return 
     */
    public int getIBrandID() {
        return iBrandID;
    }

    /**
     * Sets the value of the iBrandID property.
     * 
     * @param value
     */
    public void setIBrandID(int value) {
        this.iBrandID = value;
    }

    /**
     * Gets the value of the iLangID property.
     * 
     * @return 
     */
    public int getILangID() {
        return iLangID;
    }

    /**
     * Sets the value of the iLangID property.
     * 
     * @param value
     */
    public void setILangID(int value) {
        this.iLangID = value;
    }

    /**
     * Gets the value of the iCatGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICatGroupID() {
        return iCatGroupID;
    }

    /**
     * Sets the value of the iCatGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICatGroupID(String value) {
        this.iCatGroupID = value;
    }

    /**
     * Gets the value of the sIsHealthyLiving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIsHealthyLiving() {
        return sIsHealthyLiving;
    }

    /**
     * Sets the value of the sIsHealthyLiving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIsHealthyLiving(String value) {
        this.sIsHealthyLiving = value;
    }

    /**
     * Gets the value of the sFilterDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFilterDays() {
        return sFilterDays;
    }

    /**
     * Sets the value of the sFilterDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFilterDays(String value) {
        this.sFilterDays = value;
    }

}
