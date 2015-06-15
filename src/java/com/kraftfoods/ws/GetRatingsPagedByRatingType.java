
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
 *         &lt;element name="sExternalIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iRatingItemTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "sExternalIdentifier",
    "iRatingItemTypeID",
    "iPageNumber",
    "iPageSize"
})
@XmlRootElement(name = "GetRatingsPagedByRatingType")
public class GetRatingsPagedByRatingType {

    protected String sExternalIdentifier;
    protected int iRatingItemTypeID;
    protected int iPageNumber;
    protected int iPageSize;

    /**
     * Gets the value of the sExternalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSExternalIdentifier() {
        return sExternalIdentifier;
    }

    /**
     * Sets the value of the sExternalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSExternalIdentifier(String value) {
        this.sExternalIdentifier = value;
    }

    /**
     * Gets the value of the iRatingItemTypeID property.
     * 
     */
    public int getIRatingItemTypeID() {
        return iRatingItemTypeID;
    }

    /**
     * Sets the value of the iRatingItemTypeID property.
     * 
     */
    public void setIRatingItemTypeID(int value) {
        this.iRatingItemTypeID = value;
    }

    /**
     * Gets the value of the iPageNumber property.
     * 
     */
    public int getIPageNumber() {
        return iPageNumber;
    }

    /**
     * Sets the value of the iPageNumber property.
     * 
     */
    public void setIPageNumber(int value) {
        this.iPageNumber = value;
    }

    /**
     * Gets the value of the iPageSize property.
     * 
     */
    public int getIPageSize() {
        return iPageSize;
    }

    /**
     * Sets the value of the iPageSize property.
     * 
     */
    public void setIPageSize(int value) {
        this.iPageSize = value;
    }

}
