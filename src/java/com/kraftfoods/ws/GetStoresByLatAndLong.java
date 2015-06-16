
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
 *         &lt;element name="iAppID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dLatitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="dLongitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="iRadius" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iRadiusType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iLangID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iCountryID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iPageNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iPageSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "iAppID",
    "dLatitude",
    "dLongitude",
    "iRadius",
    "iRadiusType",
    "iLangID",
    "iCountryID",
    "iPageNum",
    "iPageSize"
})
@XmlRootElement(name = "GetStoresByLatAndLong")
public class GetStoresByLatAndLong {

    /**
     *
     */
    protected int iAppID;

    /**
     *
     */
    protected double dLatitude;

    /**
     *
     */
    protected double dLongitude;

    /**
     *
     */
    protected int iRadius;

    /**
     *
     */
    protected int iRadiusType;

    /**
     *
     */
    protected int iLangID;

    /**
     *
     */
    protected int iCountryID;

    /**
     *
     */
    protected int iPageNum;

    /**
     *
     */
    protected int iPageSize;

    /**
     * Gets the value of the iAppID property.
     * 
     * @return 
     */
    public int getIAppID() {
        return iAppID;
    }

    /**
     * Sets the value of the iAppID property.
     * 
     * @param value
     */
    public void setIAppID(int value) {
        this.iAppID = value;
    }

    /**
     * Gets the value of the dLatitude property.
     * 
     * @return 
     */
    public double getDLatitude() {
        return dLatitude;
    }

    /**
     * Sets the value of the dLatitude property.
     * 
     * @param value
     */
    public void setDLatitude(double value) {
        this.dLatitude = value;
    }

    /**
     * Gets the value of the dLongitude property.
     * 
     * @return 
     */
    public double getDLongitude() {
        return dLongitude;
    }

    /**
     * Sets the value of the dLongitude property.
     * 
     * @param value
     */
    public void setDLongitude(double value) {
        this.dLongitude = value;
    }

    /**
     * Gets the value of the iRadius property.
     * 
     * @return 
     */
    public int getIRadius() {
        return iRadius;
    }

    /**
     * Sets the value of the iRadius property.
     * 
     * @param value
     */
    public void setIRadius(int value) {
        this.iRadius = value;
    }

    /**
     * Gets the value of the iRadiusType property.
     * 
     * @return 
     */
    public int getIRadiusType() {
        return iRadiusType;
    }

    /**
     * Sets the value of the iRadiusType property.
     * 
     * @param value
     */
    public void setIRadiusType(int value) {
        this.iRadiusType = value;
    }

    /**
     * Gets the value of the iLangID property.
     * 
     * @return 
     */
    public int getILangID() {
        return iLangID;
    }

    /**
     * Sets the value of the iLangID property.
     * 
     * @param value
     */
    public void setILangID(int value) {
        this.iLangID = value;
    }

    /**
     * Gets the value of the iCountryID property.
     * 
     * @return 
     */
    public int getICountryID() {
        return iCountryID;
    }

    /**
     * Sets the value of the iCountryID property.
     * 
     * @param value
     */
    public void setICountryID(int value) {
        this.iCountryID = value;
    }

    /**
     * Gets the value of the iPageNum property.
     * 
     * @return 
     */
    public int getIPageNum() {
        return iPageNum;
    }

    /**
     * Sets the value of the iPageNum property.
     * 
     * @param value
     */
    public void setIPageNum(int value) {
        this.iPageNum = value;
    }

    /**
     * Gets the value of the iPageSize property.
     * 
     * @return 
     */
    public int getIPageSize() {
        return iPageSize;
    }

    /**
     * Sets the value of the iPageSize property.
     * 
     * @param value
     */
    public void setIPageSize(int value) {
        this.iPageSize = value;
    }

}
