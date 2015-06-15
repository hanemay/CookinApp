
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
 *         &lt;element name="iRecipeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="bStripHTML" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "iRecipeID",
    "bStripHTML",
    "iBrandID",
    "iLangID",
    "bIncludeExtraInformation"
})
@XmlRootElement(name = "GetRecipeByRecipeIDWithExtraInformation")
public class GetRecipeByRecipeIDWithExtraInformation {

    protected int iRecipeID;
    protected boolean bStripHTML;
    protected int iBrandID;
    protected int iLangID;
    protected boolean bIncludeExtraInformation;

    /**
     * Gets the value of the iRecipeID property.
     * 
     */
    public int getIRecipeID() {
        return iRecipeID;
    }

    /**
     * Sets the value of the iRecipeID property.
     * 
     */
    public void setIRecipeID(int value) {
        this.iRecipeID = value;
    }

    /**
     * Gets the value of the bStripHTML property.
     * 
     */
    public boolean isBStripHTML() {
        return bStripHTML;
    }

    /**
     * Sets the value of the bStripHTML property.
     * 
     */
    public void setBStripHTML(boolean value) {
        this.bStripHTML = value;
    }

    /**
     * Gets the value of the iBrandID property.
     * 
     */
    public int getIBrandID() {
        return iBrandID;
    }

    /**
     * Sets the value of the iBrandID property.
     * 
     */
    public void setIBrandID(int value) {
        this.iBrandID = value;
    }

    /**
     * Gets the value of the iLangID property.
     * 
     */
    public int getILangID() {
        return iLangID;
    }

    /**
     * Sets the value of the iLangID property.
     * 
     */
    public void setILangID(int value) {
        this.iLangID = value;
    }

    /**
     * Gets the value of the bIncludeExtraInformation property.
     * 
     */
    public boolean isBIncludeExtraInformation() {
        return bIncludeExtraInformation;
    }

    /**
     * Sets the value of the bIncludeExtraInformation property.
     * 
     */
    public void setBIncludeExtraInformation(boolean value) {
        this.bIncludeExtraInformation = value;
    }

}
