
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoremetricsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoremetricsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CoremetricsVisitorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CoremetricsSessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoremetricsResponse", propOrder = {
    "coremetricsVisitorID",
    "coremetricsSessionID",
    "status"
})
public class CoremetricsResponse {

    /**
     *
     */
    @XmlElement(name = "CoremetricsVisitorID")
    protected String coremetricsVisitorID;

    /**
     *
     */
    @XmlElement(name = "CoremetricsSessionID")
    protected String coremetricsSessionID;

    /**
     *
     */
    @XmlElement(name = "Status")
    protected String status;

    /**
     * Gets the value of the coremetricsVisitorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoremetricsVisitorID() {
        return coremetricsVisitorID;
    }

    /**
     * Sets the value of the coremetricsVisitorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoremetricsVisitorID(String value) {
        this.coremetricsVisitorID = value;
    }

    /**
     * Gets the value of the coremetricsSessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoremetricsSessionID() {
        return coremetricsSessionID;
    }

    /**
     * Sets the value of the coremetricsSessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoremetricsSessionID(String value) {
        this.coremetricsSessionID = value;
    }

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

}
