
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PollResultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PollResultDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PollResultID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnswerHelp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PollResultLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PollResultLinkText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResultCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PercentSelected" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PollResultDetail", propOrder = {
    "pollResultID",
    "answer",
    "answerHelp",
    "pollResultLink",
    "pollResultLinkText",
    "resultCount",
    "percentSelected"
})
public class PollResultDetail {

    /**
     *
     */
    @XmlElement(name = "PollResultID")
    protected int pollResultID;

    /**
     *
     */
    @XmlElement(name = "Answer")
    protected String answer;

    /**
     *
     */
    @XmlElement(name = "AnswerHelp")
    protected String answerHelp;

    /**
     *
     */
    @XmlElement(name = "PollResultLink")
    protected String pollResultLink;

    /**
     *
     */
    @XmlElement(name = "PollResultLinkText")
    protected String pollResultLinkText;

    /**
     *
     */
    @XmlElement(name = "ResultCount")
    protected int resultCount;

    /**
     *
     */
    @XmlElement(name = "PercentSelected")
    protected int percentSelected;

    /**
     * Gets the value of the pollResultID property.
     * 
     * @return 
     */
    public int getPollResultID() {
        return pollResultID;
    }

    /**
     * Sets the value of the pollResultID property.
     * 
     * @param value
     */
    public void setPollResultID(int value) {
        this.pollResultID = value;
    }

    /**
     * Gets the value of the answer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Sets the value of the answer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswer(String value) {
        this.answer = value;
    }

    /**
     * Gets the value of the answerHelp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerHelp() {
        return answerHelp;
    }

    /**
     * Sets the value of the answerHelp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerHelp(String value) {
        this.answerHelp = value;
    }

    /**
     * Gets the value of the pollResultLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPollResultLink() {
        return pollResultLink;
    }

    /**
     * Sets the value of the pollResultLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPollResultLink(String value) {
        this.pollResultLink = value;
    }

    /**
     * Gets the value of the pollResultLinkText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPollResultLinkText() {
        return pollResultLinkText;
    }

    /**
     * Sets the value of the pollResultLinkText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPollResultLinkText(String value) {
        this.pollResultLinkText = value;
    }

    /**
     * Gets the value of the resultCount property.
     * 
     * @return 
     */
    public int getResultCount() {
        return resultCount;
    }

    /**
     * Sets the value of the resultCount property.
     * 
     * @param value
     */
    public void setResultCount(int value) {
        this.resultCount = value;
    }

    /**
     * Gets the value of the percentSelected property.
     * 
     * @return 
     */
    public int getPercentSelected() {
        return percentSelected;
    }

    /**
     * Sets the value of the percentSelected property.
     * 
     * @param value
     */
    public void setPercentSelected(int value) {
        this.percentSelected = value;
    }

}
