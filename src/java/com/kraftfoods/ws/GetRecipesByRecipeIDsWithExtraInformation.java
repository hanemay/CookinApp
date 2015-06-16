
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
 *         &lt;element name="sRecipeIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iBrandID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iLangID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="bIncludeExtraInformation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "sRecipeIDs",
    "iBrandID",
    "iLangID",
    "bIncludeExtraInformation"
})
@XmlRootElement(name = "GetRecipesByRecipeIDsWithExtraInformation")
public class GetRecipesByRecipeIDsWithExtraInformation {

    /**
     *
     */
    protected String sRecipeIDs;

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
    protected boolean bIncludeExtraInformation;

    /**
     * Gets the value of the sRecipeIDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRecipeIDs() {
        return sRecipeIDs;
    }

    /**
     * Sets the value of the sRecipeIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRecipeIDs(String value) {
        this.sRecipeIDs = value;
    }

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
     * Gets the value of the bIncludeExtraInformation property.
     * 
     * @return 
     */
    public boolean isBIncludeExtraInformation() {
        return bIncludeExtraInformation;
    }

    /**
     * Sets the value of the bIncludeExtraInformation property.
     * 
     * @param value
     */
    public void setBIncludeExtraInformation(boolean value) {
        this.bIncludeExtraInformation = value;
    }

}
