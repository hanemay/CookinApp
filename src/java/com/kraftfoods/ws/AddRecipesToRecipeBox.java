
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
 *         &lt;element name="strRecipeIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iSiteUserID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "strRecipeIDs",
    "iSiteUserID"
})
@XmlRootElement(name = "AddRecipesToRecipeBox")
public class AddRecipesToRecipeBox {

    /**
     *
     */
    protected String strRecipeIDs;

    /**
     *
     */
    protected int iSiteUserID;

    /**
     * Gets the value of the strRecipeIDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrRecipeIDs() {
        return strRecipeIDs;
    }

    /**
     * Sets the value of the strRecipeIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrRecipeIDs(String value) {
        this.strRecipeIDs = value;
    }

    /**
     * Gets the value of the iSiteUserID property.
     * 
     * @return 
     */
    public int getISiteUserID() {
        return iSiteUserID;
    }

    /**
     * Sets the value of the iSiteUserID property.
     * 
     * @param value
     */
    public void setISiteUserID(int value) {
        this.iSiteUserID = value;
    }

}
