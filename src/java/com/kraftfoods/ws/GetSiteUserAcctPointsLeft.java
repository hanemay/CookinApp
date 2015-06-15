
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
 *         &lt;element name="iSiteUserID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iSiteAccountID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iIncreaseCountBy" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="bIncreaseCount" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "iSiteUserID",
    "iSiteAccountID",
    "iIncreaseCountBy",
    "bIncreaseCount"
})
@XmlRootElement(name = "GetSiteUserAcctPointsLeft")
public class GetSiteUserAcctPointsLeft {

    protected int iSiteUserID;
    protected int iSiteAccountID;
    protected int iIncreaseCountBy;
    protected boolean bIncreaseCount;

    /**
     * Gets the value of the iSiteUserID property.
     * 
     */
    public int getISiteUserID() {
        return iSiteUserID;
    }

    /**
     * Sets the value of the iSiteUserID property.
     * 
     */
    public void setISiteUserID(int value) {
        this.iSiteUserID = value;
    }

    /**
     * Gets the value of the iSiteAccountID property.
     * 
     */
    public int getISiteAccountID() {
        return iSiteAccountID;
    }

    /**
     * Sets the value of the iSiteAccountID property.
     * 
     */
    public void setISiteAccountID(int value) {
        this.iSiteAccountID = value;
    }

    /**
     * Gets the value of the iIncreaseCountBy property.
     * 
     */
    public int getIIncreaseCountBy() {
        return iIncreaseCountBy;
    }

    /**
     * Sets the value of the iIncreaseCountBy property.
     * 
     */
    public void setIIncreaseCountBy(int value) {
        this.iIncreaseCountBy = value;
    }

    /**
     * Gets the value of the bIncreaseCount property.
     * 
     */
    public boolean isBIncreaseCount() {
        return bIncreaseCount;
    }

    /**
     * Sets the value of the bIncreaseCount property.
     * 
     */
    public void setBIncreaseCount(boolean value) {
        this.bIncreaseCount = value;
    }

}
