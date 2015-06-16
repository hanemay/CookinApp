
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="LogoutUserAndReturnCookieResult" type="{http://www.kraftfoods.com/ws/}LogoutResponse" minOccurs="0"/&gt;
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
    "logoutUserAndReturnCookieResult"
})
@XmlRootElement(name = "LogoutUserAndReturnCookieResponse")
public class LogoutUserAndReturnCookieResponse {

    /**
     *
     */
    @XmlElement(name = "LogoutUserAndReturnCookieResult")
    protected LogoutResponse logoutUserAndReturnCookieResult;

    /**
     * Gets the value of the logoutUserAndReturnCookieResult property.
     * 
     * @return
     *     possible object is
     *     {@link LogoutResponse }
     *     
     */
    public LogoutResponse getLogoutUserAndReturnCookieResult() {
        return logoutUserAndReturnCookieResult;
    }

    /**
     * Sets the value of the logoutUserAndReturnCookieResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogoutResponse }
     *     
     */
    public void setLogoutUserAndReturnCookieResult(LogoutResponse value) {
        this.logoutUserAndReturnCookieResult = value;
    }

}
