
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
 *         &lt;element name="bThirdPartyLogout" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="iLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "bThirdPartyLogout",
    "iLang"
})
@XmlRootElement(name = "LogoutUserAndReturnCookie")
public class LogoutUserAndReturnCookie {

    protected boolean bThirdPartyLogout;
    protected String iLang;

    /**
     * Gets the value of the bThirdPartyLogout property.
     * 
     */
    public boolean isBThirdPartyLogout() {
        return bThirdPartyLogout;
    }

    /**
     * Sets the value of the bThirdPartyLogout property.
     * 
     */
    public void setBThirdPartyLogout(boolean value) {
        this.bThirdPartyLogout = value;
    }

    /**
     * Gets the value of the iLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getILang() {
        return iLang;
    }

    /**
     * Sets the value of the iLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setILang(String value) {
        this.iLang = value;
    }

}
