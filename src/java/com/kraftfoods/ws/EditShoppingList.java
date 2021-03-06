
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
 *         &lt;element name="iShoppingListId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iSiteUserID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sShoppingListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "iShoppingListId",
    "iSiteUserID",
    "sShoppingListName"
})
@XmlRootElement(name = "EditShoppingList")
public class EditShoppingList {

    /**
     *
     */
    protected int iShoppingListId;

    /**
     *
     */
    protected int iSiteUserID;

    /**
     *
     */
    protected String sShoppingListName;

    /**
     * Gets the value of the iShoppingListId property.
     * 
     * @return 
     */
    public int getIShoppingListId() {
        return iShoppingListId;
    }

    /**
     * Sets the value of the iShoppingListId property.
     * 
     * @param value
     */
    public void setIShoppingListId(int value) {
        this.iShoppingListId = value;
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

    /**
     * Gets the value of the sShoppingListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSShoppingListName() {
        return sShoppingListName;
    }

    /**
     * Sets the value of the sShoppingListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSShoppingListName(String value) {
        this.sShoppingListName = value;
    }

}
