
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
 *         &lt;element name="iRecipeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iMax" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "iRecipeId",
    "iMax"
})
@XmlRootElement(name = "GetRecipeVideos")
public class GetRecipeVideos {

    protected int iRecipeId;
    protected int iMax;

    /**
     * Gets the value of the iRecipeId property.
     * 
     */
    public int getIRecipeId() {
        return iRecipeId;
    }

    /**
     * Sets the value of the iRecipeId property.
     * 
     */
    public void setIRecipeId(int value) {
        this.iRecipeId = value;
    }

    /**
     * Gets the value of the iMax property.
     * 
     */
    public int getIMax() {
        return iMax;
    }

    /**
     * Sets the value of the iMax property.
     * 
     */
    public void setIMax(int value) {
        this.iMax = value;
    }

}
