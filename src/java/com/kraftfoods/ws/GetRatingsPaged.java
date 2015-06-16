
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
 *         &lt;element name="iPageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iPageSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "iPageNumber",
    "iPageSize"
})
@XmlRootElement(name = "GetRatingsPaged")
public class GetRatingsPaged {

    /**
     *
     */
    protected int iRecipeID;

    /**
     *
     */
    protected int iPageNumber;

    /**
     *
     */
    protected int iPageSize;

    /**
     * Gets the value of the iRecipeID property.
     * 
     * @return 
     */
    public int getIRecipeID() {
        return iRecipeID;
    }

    /**
     * Sets the value of the iRecipeID property.
     * 
     * @param value
     */
    public void setIRecipeID(int value) {
        this.iRecipeID = value;
    }

    /**
     * Gets the value of the iPageNumber property.
     * 
     * @return 
     */
    public int getIPageNumber() {
        return iPageNumber;
    }

    /**
     * Sets the value of the iPageNumber property.
     * 
     * @param value
     */
    public void setIPageNumber(int value) {
        this.iPageNumber = value;
    }

    /**
     * Gets the value of the iPageSize property.
     * 
     * @return 
     */
    public int getIPageSize() {
        return iPageSize;
    }

    /**
     * Sets the value of the iPageSize property.
     * 
     * @param value
     */
    public void setIPageSize(int value) {
        this.iPageSize = value;
    }

}
