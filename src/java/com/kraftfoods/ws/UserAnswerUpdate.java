
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
 *         &lt;element name="iSiteUserId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iQuestionID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iLanguageID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iChoiceID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iAnswerActivityID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "iSiteUserId",
    "iQuestionID",
    "sAnswer",
    "iLanguageID",
    "iChoiceID",
    "iAnswerActivityID"
})
@XmlRootElement(name = "UserAnswerUpdate")
public class UserAnswerUpdate {

    protected int iSiteUserId;
    protected int iQuestionID;
    protected String sAnswer;
    protected int iLanguageID;
    protected int iChoiceID;
    protected int iAnswerActivityID;

    /**
     * Gets the value of the iSiteUserId property.
     * 
     */
    public int getISiteUserId() {
        return iSiteUserId;
    }

    /**
     * Sets the value of the iSiteUserId property.
     * 
     */
    public void setISiteUserId(int value) {
        this.iSiteUserId = value;
    }

    /**
     * Gets the value of the iQuestionID property.
     * 
     */
    public int getIQuestionID() {
        return iQuestionID;
    }

    /**
     * Sets the value of the iQuestionID property.
     * 
     */
    public void setIQuestionID(int value) {
        this.iQuestionID = value;
    }

    /**
     * Gets the value of the sAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAnswer() {
        return sAnswer;
    }

    /**
     * Sets the value of the sAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAnswer(String value) {
        this.sAnswer = value;
    }

    /**
     * Gets the value of the iLanguageID property.
     * 
     */
    public int getILanguageID() {
        return iLanguageID;
    }

    /**
     * Sets the value of the iLanguageID property.
     * 
     */
    public void setILanguageID(int value) {
        this.iLanguageID = value;
    }

    /**
     * Gets the value of the iChoiceID property.
     * 
     */
    public int getIChoiceID() {
        return iChoiceID;
    }

    /**
     * Sets the value of the iChoiceID property.
     * 
     */
    public void setIChoiceID(int value) {
        this.iChoiceID = value;
    }

    /**
     * Gets the value of the iAnswerActivityID property.
     * 
     */
    public int getIAnswerActivityID() {
        return iAnswerActivityID;
    }

    /**
     * Sets the value of the iAnswerActivityID property.
     * 
     */
    public void setIAnswerActivityID(int value) {
        this.iAnswerActivityID = value;
    }

}
