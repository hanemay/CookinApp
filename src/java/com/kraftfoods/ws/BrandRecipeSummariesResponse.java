
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrandRecipeSummariesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrandRecipeSummariesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BrandRecipeSummary" type="{http://www.kraftfoods.com/ws/}ArrayOfBrandRecipeSummary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrandRecipeSummariesResponse", propOrder = {
    "status",
    "totalCount",
    "brandRecipeSummary"
})
public class BrandRecipeSummariesResponse {

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
    @XmlElement(name = "BrandRecipeSummary")
    protected ArrayOfBrandRecipeSummary brandRecipeSummary;

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
     * Gets the value of the brandRecipeSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBrandRecipeSummary }
     *     
     */
    public ArrayOfBrandRecipeSummary getBrandRecipeSummary() {
        return brandRecipeSummary;
    }

    /**
     * Sets the value of the brandRecipeSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBrandRecipeSummary }
     *     
     */
    public void setBrandRecipeSummary(ArrayOfBrandRecipeSummary value) {
        this.brandRecipeSummary = value;
    }

}
