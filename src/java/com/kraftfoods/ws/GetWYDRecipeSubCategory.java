
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
 *         &lt;element name="iCatID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "iCatID"
})
@XmlRootElement(name = "GetWYDRecipeSubCategory")
public class GetWYDRecipeSubCategory {

    /**
     *
     */
    protected int iCatID;

    /**
     * Gets the value of the iCatID property.
     * 
     * @return 
     */
    public int getICatID() {
        return iCatID;
    }

    /**
     * Sets the value of the iCatID property.
     * 
     * @param value
     */
    public void setICatID(int value) {
        this.iCatID = value;
    }

}
