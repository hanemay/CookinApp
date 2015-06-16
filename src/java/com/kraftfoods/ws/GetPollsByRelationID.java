
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
 *         &lt;element name="iRelationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iLangID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "iRelationId",
    "iLangID"
})
@XmlRootElement(name = "GetPollsByRelationID")
public class GetPollsByRelationID {

    /**
     *
     */
    protected int iSiteId;

    /**
     *
     */
    protected int iRelationId;

    /**
     *
     */
    protected int iLangID;

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
     * Gets the value of the iRelationId property.
     * 
     * @return 
     */
    public int getIRelationId() {
        return iRelationId;
    }

    /**
     * Sets the value of the iRelationId property.
     * 
     * @param value
     */
    public void setIRelationId(int value) {
        this.iRelationId = value;
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

}
