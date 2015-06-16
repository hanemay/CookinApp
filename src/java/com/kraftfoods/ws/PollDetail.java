
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PollDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PollDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PollID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PollName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PollDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Question" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuestionHelp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuestionIntro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuestionLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuestionLinkText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SponsoredByLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SponsoredByLinkText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PollResults" type="{http://www.kraftfoods.com/ws/}ArrayOfPollResultDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PollDetail", propOrder = {
    "pollID",
    "pollName",
    "pollDescription",
    "question",
    "questionHelp",
    "questionIntro",
    "questionLink",
    "questionLinkText",
    "sponsoredByLink",
    "sponsoredByLinkText",
    "pollResults"
})
public class PollDetail {

    /**
     *
     */
    @XmlElement(name = "PollID")
    protected int pollID;

    /**
     *
     */
    @XmlElement(name = "PollName")
    protected String pollName;

    /**
     *
     */
    @XmlElement(name = "PollDescription")
    protected String pollDescription;

    /**
     *
     */
    @XmlElement(name = "Question")
    protected String question;

    /**
     *
     */
    @XmlElement(name = "QuestionHelp")
    protected String questionHelp;

    /**
     *
     */
    @XmlElement(name = "QuestionIntro")
    protected String questionIntro;

    /**
     *
     */
    @XmlElement(name = "QuestionLink")
    protected String questionLink;

    /**
     *
     */
    @XmlElement(name = "QuestionLinkText")
    protected String questionLinkText;

    /**
     *
     */
    @XmlElement(name = "SponsoredByLink")
    protected String sponsoredByLink;

    /**
     *
     */
    @XmlElement(name = "SponsoredByLinkText")
    protected String sponsoredByLinkText;

    /**
     *
     */
    @XmlElement(name = "PollResults")
    protected ArrayOfPollResultDetail pollResults;

    /**
     * Gets the value of the pollID property.
     * 
     * @return 
     */
    public int getPollID() {
        return pollID;
    }

    /**
     * Sets the value of the pollID property.
     * 
     * @param value
     */
    public void setPollID(int value) {
        this.pollID = value;
    }

    /**
     * Gets the value of the pollName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPollName() {
        return pollName;
    }

    /**
     * Sets the value of the pollName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPollName(String value) {
        this.pollName = value;
    }

    /**
     * Gets the value of the pollDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPollDescription() {
        return pollDescription;
    }

    /**
     * Sets the value of the pollDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPollDescription(String value) {
        this.pollDescription = value;
    }

    /**
     * Gets the value of the question property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Sets the value of the question property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestion(String value) {
        this.question = value;
    }

    /**
     * Gets the value of the questionHelp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionHelp() {
        return questionHelp;
    }

    /**
     * Sets the value of the questionHelp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionHelp(String value) {
        this.questionHelp = value;
    }

    /**
     * Gets the value of the questionIntro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionIntro() {
        return questionIntro;
    }

    /**
     * Sets the value of the questionIntro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionIntro(String value) {
        this.questionIntro = value;
    }

    /**
     * Gets the value of the questionLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionLink() {
        return questionLink;
    }

    /**
     * Sets the value of the questionLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionLink(String value) {
        this.questionLink = value;
    }

    /**
     * Gets the value of the questionLinkText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionLinkText() {
        return questionLinkText;
    }

    /**
     * Sets the value of the questionLinkText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionLinkText(String value) {
        this.questionLinkText = value;
    }

    /**
     * Gets the value of the sponsoredByLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsoredByLink() {
        return sponsoredByLink;
    }

    /**
     * Sets the value of the sponsoredByLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsoredByLink(String value) {
        this.sponsoredByLink = value;
    }

    /**
     * Gets the value of the sponsoredByLinkText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsoredByLinkText() {
        return sponsoredByLinkText;
    }

    /**
     * Sets the value of the sponsoredByLinkText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsoredByLinkText(String value) {
        this.sponsoredByLinkText = value;
    }

    /**
     * Gets the value of the pollResults property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPollResultDetail }
     *     
     */
    public ArrayOfPollResultDetail getPollResults() {
        return pollResults;
    }

    /**
     * Sets the value of the pollResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPollResultDetail }
     *     
     */
    public void setPollResults(ArrayOfPollResultDetail value) {
        this.pollResults = value;
    }

}
