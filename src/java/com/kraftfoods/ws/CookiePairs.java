
package com.kraftfoods.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CookiePairs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CookiePairs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CookiePair" type="{http://www.kraftfoods.com/ws/}CookiePair" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CookiePairs", propOrder = {
    "cookiePair"
})
public class CookiePairs {

    /**
     *
     */
    @XmlElement(name = "CookiePair")
    protected List<CookiePair> cookiePair;

    /**
     * Gets the value of the cookiePair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cookiePair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCookiePair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CookiePair }
     * 
     * 
     * @return 
     */
    public List<CookiePair> getCookiePair() {
        if (cookiePair == null) {
            cookiePair = new ArrayList<CookiePair>();
        }
        return this.cookiePair;
    }

}
