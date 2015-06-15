
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
 *         &lt;element name="iSiteID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iLanguageID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sSearchTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sScopes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sClassifications" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sCategories" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sSubCategories" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iPrepStartTime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iPrepEndTime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iTotalStartTime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iTotalEndTime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iPageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iPageSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sSortColumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sSortDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sIgnoreWords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bPhoto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "iSiteID",
    "iLanguageID",
    "sSearchTerm",
    "sScopes",
    "sClassifications",
    "sCategories",
    "sSubCategories",
    "iPrepStartTime",
    "iPrepEndTime",
    "iTotalStartTime",
    "iTotalEndTime",
    "iPageNumber",
    "iPageSize",
    "sSortColumn",
    "sSortDirection",
    "sIgnoreWords",
    "bPhoto"
})
@XmlRootElement(name = "ExecuteRecipeSearch")
public class ExecuteRecipeSearch {

    protected int iSiteID;
    protected int iLanguageID;
    protected String sSearchTerm;
    protected String sScopes;
    protected String sClassifications;
    protected String sCategories;
    protected String sSubCategories;
    protected int iPrepStartTime;
    protected int iPrepEndTime;
    protected int iTotalStartTime;
    protected int iTotalEndTime;
    protected int iPageNumber;
    protected int iPageSize;
    protected String sSortColumn;
    protected String sSortDirection;
    protected String sIgnoreWords;
    protected String bPhoto;

    /**
     * Gets the value of the iSiteID property.
     * 
     */
    public int getISiteID() {
        return iSiteID;
    }

    /**
     * Sets the value of the iSiteID property.
     * 
     */
    public void setISiteID(int value) {
        this.iSiteID = value;
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
     * Gets the value of the sSearchTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSearchTerm() {
        return sSearchTerm;
    }

    /**
     * Sets the value of the sSearchTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSearchTerm(String value) {
        this.sSearchTerm = value;
    }

    /**
     * Gets the value of the sScopes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSScopes() {
        return sScopes;
    }

    /**
     * Sets the value of the sScopes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSScopes(String value) {
        this.sScopes = value;
    }

    /**
     * Gets the value of the sClassifications property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSClassifications() {
        return sClassifications;
    }

    /**
     * Sets the value of the sClassifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSClassifications(String value) {
        this.sClassifications = value;
    }

    /**
     * Gets the value of the sCategories property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCategories() {
        return sCategories;
    }

    /**
     * Sets the value of the sCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCategories(String value) {
        this.sCategories = value;
    }

    /**
     * Gets the value of the sSubCategories property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSubCategories() {
        return sSubCategories;
    }

    /**
     * Sets the value of the sSubCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSubCategories(String value) {
        this.sSubCategories = value;
    }

    /**
     * Gets the value of the iPrepStartTime property.
     * 
     */
    public int getIPrepStartTime() {
        return iPrepStartTime;
    }

    /**
     * Sets the value of the iPrepStartTime property.
     * 
     */
    public void setIPrepStartTime(int value) {
        this.iPrepStartTime = value;
    }

    /**
     * Gets the value of the iPrepEndTime property.
     * 
     */
    public int getIPrepEndTime() {
        return iPrepEndTime;
    }

    /**
     * Sets the value of the iPrepEndTime property.
     * 
     */
    public void setIPrepEndTime(int value) {
        this.iPrepEndTime = value;
    }

    /**
     * Gets the value of the iTotalStartTime property.
     * 
     */
    public int getITotalStartTime() {
        return iTotalStartTime;
    }

    /**
     * Sets the value of the iTotalStartTime property.
     * 
     */
    public void setITotalStartTime(int value) {
        this.iTotalStartTime = value;
    }

    /**
     * Gets the value of the iTotalEndTime property.
     * 
     */
    public int getITotalEndTime() {
        return iTotalEndTime;
    }

    /**
     * Sets the value of the iTotalEndTime property.
     * 
     */
    public void setITotalEndTime(int value) {
        this.iTotalEndTime = value;
    }

    /**
     * Gets the value of the iPageNumber property.
     * 
     */
    public int getIPageNumber() {
        return iPageNumber;
    }

    /**
     * Sets the value of the iPageNumber property.
     * 
     */
    public void setIPageNumber(int value) {
        this.iPageNumber = value;
    }

    /**
     * Gets the value of the iPageSize property.
     * 
     */
    public int getIPageSize() {
        return iPageSize;
    }

    /**
     * Sets the value of the iPageSize property.
     * 
     */
    public void setIPageSize(int value) {
        this.iPageSize = value;
    }

    /**
     * Gets the value of the sSortColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSortColumn() {
        return sSortColumn;
    }

    /**
     * Sets the value of the sSortColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSortColumn(String value) {
        this.sSortColumn = value;
    }

    /**
     * Gets the value of the sSortDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSortDirection() {
        return sSortDirection;
    }

    /**
     * Sets the value of the sSortDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSortDirection(String value) {
        this.sSortDirection = value;
    }

    /**
     * Gets the value of the sIgnoreWords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIgnoreWords() {
        return sIgnoreWords;
    }

    /**
     * Sets the value of the sIgnoreWords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIgnoreWords(String value) {
        this.sIgnoreWords = value;
    }

    /**
     * Gets the value of the bPhoto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPhoto() {
        return bPhoto;
    }

    /**
     * Sets the value of the bPhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPhoto(String value) {
        this.bPhoto = value;
    }

}
