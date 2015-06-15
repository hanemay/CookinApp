
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
 *         &lt;element name="iPollID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iPollResultID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iLangID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "iPollID",
    "iPollResultID",
    "iLangID"
})
@XmlRootElement(name = "AnswerPoll")
public class AnswerPoll {

    protected int iPollID;
    protected int iPollResultID;
    protected int iLangID;

    /**
     * Gets the value of the iPollID property.
     * 
     */
    public int getIPollID() {
        return iPollID;
    }

    /**
     * Sets the value of the iPollID property.
     * 
     */
    public void setIPollID(int value) {
        this.iPollID = value;
    }

    /**
     * Gets the value of the iPollResultID property.
     * 
     */
    public int getIPollResultID() {
        return iPollResultID;
    }

    /**
     * Sets the value of the iPollResultID property.
     * 
     */
    public void setIPollResultID(int value) {
        this.iPollResultID = value;
    }

    /**
     * Gets the value of the iLangID property.
     * 
     */
    public int getILangID() {
        return iLangID;
    }

    /**
     * Sets the value of the iLangID property.
     * 
     */
    public void setILangID(int value) {
        this.iLangID = value;
    }

}
