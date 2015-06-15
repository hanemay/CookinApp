
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kraftfoods.com/ws/}RecipeSummary"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisplayDateJS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTSummary", propOrder = {
    "displayDateJS"
})
public class DTSummary
    extends RecipeSummary
{

    @XmlElement(name = "DisplayDateJS")
    protected String displayDateJS;

    /**
     * Gets the value of the displayDateJS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayDateJS() {
        return displayDateJS;
    }

    /**
     * Sets the value of the displayDateJS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayDateJS(String value) {
        this.displayDateJS = value;
    }

}
