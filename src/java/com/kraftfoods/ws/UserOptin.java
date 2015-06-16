
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
 *         &lt;element name="iSiteId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iUserId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iLanguageId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "iSiteId",
    "iUserId",
    "iLanguageId"
})
@XmlRootElement(name = "UserOptin")
public class UserOptin {

    /**
     *
     */
    protected int iSiteId;

    /**
     *
     */
    protected int iUserId;

    /**
     *
     */
    protected int iLanguageId;

    /**
     * Gets the value of the iSiteId property.
     * 
     * @return 
     */
    public int getISiteId() {
        return iSiteId;
    }

    /**
     * Sets the value of the iSiteId property.
     * 
     * @param value
     */
    public void setISiteId(int value) {
        this.iSiteId = value;
    }

    /**
     * Gets the value of the iUserId property.
     * 
     * @return 
     */
    public int getIUserId() {
        return iUserId;
    }

    /**
     * Sets the value of the iUserId property.
     * 
     * @param value
     */
    public void setIUserId(int value) {
        this.iUserId = value;
    }

    /**
     * Gets the value of the iLanguageId property.
     * 
     * @return 
     */
    public int getILanguageId() {
        return iLanguageId;
    }

    /**
     * Sets the value of the iLanguageId property.
     * 
     * @param value
     */
    public void setILanguageId(int value) {
        this.iLanguageId = value;
    }

}
