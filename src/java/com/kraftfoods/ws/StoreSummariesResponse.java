
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreSummariesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreSummariesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StoreSummaries" type="{http://www.kraftfoods.com/ws/}ArrayOfStoreSummary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreSummariesResponse", propOrder = {
    "status",
    "totalCount",
    "storeSummaries"
})
public class StoreSummariesResponse {

    /**
     *
     */
    @XmlElement(name = "Status")
    protected String status;

    /**
     *
     */
    @XmlElement(name = "TotalCount")
    protected int totalCount;

    /**
     *
     */
    @XmlElement(name = "StoreSummaries")
    protected ArrayOfStoreSummary storeSummaries;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the totalCount property.
     * 
     * @return 
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     * @param value
     */
    public void setTotalCount(int value) {
        this.totalCount = value;
    }

    /**
     * Gets the value of the storeSummaries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStoreSummary }
     *     
     */
    public ArrayOfStoreSummary getStoreSummaries() {
        return storeSummaries;
    }

    /**
     * Sets the value of the storeSummaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStoreSummary }
     *     
     */
    public void setStoreSummaries(ArrayOfStoreSummary value) {
        this.storeSummaries = value;
    }

}
