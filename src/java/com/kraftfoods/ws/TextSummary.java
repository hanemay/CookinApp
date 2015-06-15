
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PointToType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Heading" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextSummary", propOrder = {
    "pointToType",
    "heading",
    "subText"
})
public class TextSummary {

    @XmlElement(name = "PointToType")
    protected String pointToType;
    @XmlElement(name = "Heading")
    protected String heading;
    @XmlElement(name = "SubText")
    protected String subText;

    /**
     * Gets the value of the pointToType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointToType() {
        return pointToType;
    }

    /**
     * Sets the value of the pointToType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointToType(String value) {
        this.pointToType = value;
    }

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeading(String value) {
        this.heading = value;
    }

    /**
     * Gets the value of the subText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubText() {
        return subText;
    }

    /**
     * Sets the value of the subText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubText(String value) {
        this.subText = value;
    }

}
