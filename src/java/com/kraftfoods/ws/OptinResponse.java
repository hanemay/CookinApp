
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptinResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptinResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OptInID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OptInTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptinResponse", propOrder = {
    "optInID",
    "optInTypeID",
    "name",
    "description",
    "status"
})
public class OptinResponse {

    /**
     *
     */
    @XmlElement(name = "OptInID")
    protected int optInID;

    /**
     *
     */
    @XmlElement(name = "OptInTypeID")
    protected int optInTypeID;

    /**
     *
     */
    @XmlElement(name = "Name")
    protected String name;

    /**
     *
     */
    @XmlElement(name = "Description")
    protected String description;

    /**
     *
     */
    @XmlElement(name = "Status")
    protected int status;

    /**
     * Gets the value of the optInID property.
     * 
     * @return 
     */
    public int getOptInID() {
        return optInID;
    }

    /**
     * Sets the value of the optInID property.
     * 
     * @param value
     */
    public void setOptInID(int value) {
        this.optInID = value;
    }

    /**
     * Gets the value of the optInTypeID property.
     * 
     * @return 
     */
    public int getOptInTypeID() {
        return optInTypeID;
    }

    /**
     * Sets the value of the optInTypeID property.
     * 
     * @param value
     */
    public void setOptInTypeID(int value) {
        this.optInTypeID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     */
    public void setStatus(int value) {
        this.status = value;
    }

}
