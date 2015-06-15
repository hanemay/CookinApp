
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
 *         &lt;element name="LoginUserAndReturnCookieWithEncryptedPasswordResult" type="{http://www.kraftfoods.com/ws/}LoginResponse" minOccurs="0"/&gt;
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
    "loginUserAndReturnCookieWithEncryptedPasswordResult"
})
@XmlRootElement(name = "LoginUserAndReturnCookieWithEncryptedPasswordResponse")
public class LoginUserAndReturnCookieWithEncryptedPasswordResponse {

    @XmlElement(name = "LoginUserAndReturnCookieWithEncryptedPasswordResult")
    protected LoginResponse loginUserAndReturnCookieWithEncryptedPasswordResult;

    /**
     * Gets the value of the loginUserAndReturnCookieWithEncryptedPasswordResult property.
     * 
     * @return
     *     possible object is
     *     {@link LoginResponse }
     *     
     */
    public LoginResponse getLoginUserAndReturnCookieWithEncryptedPasswordResult() {
        return loginUserAndReturnCookieWithEncryptedPasswordResult;
    }

    /**
     * Sets the value of the loginUserAndReturnCookieWithEncryptedPasswordResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginResponse }
     *     
     */
    public void setLoginUserAndReturnCookieWithEncryptedPasswordResult(LoginResponse value) {
        this.loginUserAndReturnCookieWithEncryptedPasswordResult = value;
    }

}
