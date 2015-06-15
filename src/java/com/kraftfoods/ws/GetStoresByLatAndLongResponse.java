
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
 *         &lt;element name="GetStoresByLatAndLongResult" type="{http://www.kraftfoods.com/ws/}StoreSummariesResponse" minOccurs="0"/&gt;
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
    "getStoresByLatAndLongResult"
})
@XmlRootElement(name = "GetStoresByLatAndLongResponse")
public class GetStoresByLatAndLongResponse {

    @XmlElement(name = "GetStoresByLatAndLongResult")
    protected StoreSummariesResponse getStoresByLatAndLongResult;

    /**
     * Gets the value of the getStoresByLatAndLongResult property.
     * 
     * @return
     *     possible object is
     *     {@link StoreSummariesResponse }
     *     
     */
    public StoreSummariesResponse getGetStoresByLatAndLongResult() {
        return getStoresByLatAndLongResult;
    }

    /**
     * Sets the value of the getStoresByLatAndLongResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreSummariesResponse }
     *     
     */
    public void setGetStoresByLatAndLongResult(StoreSummariesResponse value) {
        this.getStoresByLatAndLongResult = value;
    }

}
