
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipeSummariesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipeSummariesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RecipeSummaries" type="{http://www.kraftfoods.com/ws/}ArrayOfRecipeSummary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipeSummariesResponse", propOrder = {
    "status",
    "title",
    "totalCount",
    "recipeSummaries"
})
public class RecipeSummariesResponse {

    /**
     *
     */
    @XmlElement(name = "Status")
    protected String status;

    /**
     *
     */
    @XmlElement(name = "Title")
    protected String title;

    /**
     *
     */
    @XmlElement(name = "TotalCount")
    protected int totalCount;

    /**
     *
     */
    @XmlElement(name = "RecipeSummaries")
    protected ArrayOfRecipeSummary recipeSummaries;

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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
     * Gets the value of the recipeSummaries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipeSummary }
     *     
     */
    public ArrayOfRecipeSummary getRecipeSummaries() {
        return recipeSummaries;
    }

    /**
     * Sets the value of the recipeSummaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipeSummary }
     *     
     */
    public void setRecipeSummaries(ArrayOfRecipeSummary value) {
        this.recipeSummaries = value;
    }

}
