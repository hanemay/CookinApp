
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CookieResponseEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CookieResponseEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CookiePairs" type="{http://www.kraftfoods.com/ws/}CookiePairs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CookieResponseEntity", propOrder = {
    "cookiePairs"
})
public class CookieResponseEntity {

    /**
     *
     */
    @XmlElement(name = "CookiePairs")
    protected CookiePairs cookiePairs;

    /**
     * Gets the value of the cookiePairs property.
     * 
     * @return
     *     possible object is
     *     {@link CookiePairs }
     *     
     */
    public CookiePairs getCookiePairs() {
        return cookiePairs;
    }

    /**
     * Sets the value of the cookiePairs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CookiePairs }
     *     
     */
    public void setCookiePairs(CookiePairs value) {
        this.cookiePairs = value;
    }

}
