
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ROTDSummariesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ROTDSummariesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ROTDSummaries" type="{http://www.kraftfoods.com/ws/}ArrayOfROTDSummary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ROTDSummariesResponse", propOrder = {
    "status",
    "rotdSummaries"
})
public class ROTDSummariesResponse {

    /**
     *
     */
    @XmlElement(name = "Status")
    protected String status;

    /**
     *
     */
    @XmlElement(name = "ROTDSummaries")
    protected ArrayOfROTDSummary rotdSummaries;

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
     * Gets the value of the rotdSummaries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfROTDSummary }
     *     
     */
    public ArrayOfROTDSummary getROTDSummaries() {
        return rotdSummaries;
    }

    /**
     * Sets the value of the rotdSummaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfROTDSummary }
     *     
     */
    public void setROTDSummaries(ArrayOfROTDSummary value) {
        this.rotdSummaries = value;
    }

}
