
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
 *         &lt;element name="ForgotPasswordByLangIDResult" type="{http://www.kraftfoods.com/ws/}ForgotPasswordCallResponse" minOccurs="0"/&gt;
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
    "forgotPasswordByLangIDResult"
})
@XmlRootElement(name = "ForgotPasswordByLangIDResponse")
public class ForgotPasswordByLangIDResponse {

    /**
     *
     */
    @XmlElement(name = "ForgotPasswordByLangIDResult")
    protected ForgotPasswordCallResponse forgotPasswordByLangIDResult;

    /**
     * Gets the value of the forgotPasswordByLangIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link ForgotPasswordCallResponse }
     *     
     */
    public ForgotPasswordCallResponse getForgotPasswordByLangIDResult() {
        return forgotPasswordByLangIDResult;
    }

    /**
     * Sets the value of the forgotPasswordByLangIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForgotPasswordCallResponse }
     *     
     */
    public void setForgotPasswordByLangIDResult(ForgotPasswordCallResponse value) {
        this.forgotPasswordByLangIDResult = value;
    }

}
