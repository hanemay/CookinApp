
package com.kraftfoods.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfROTDSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfROTDSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ROTDSummary" type="{http://www.kraftfoods.com/ws/}ROTDSummary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfROTDSummary", propOrder = {
    "rotdSummary"
})
public class ArrayOfROTDSummary {

    @XmlElement(name = "ROTDSummary", nillable = true)
    protected List<ROTDSummary> rotdSummary;

    /**
     * Gets the value of the rotdSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rotdSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getROTDSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ROTDSummary }
     * 
     * 
     */
    public List<ROTDSummary> getROTDSummary() {
        if (rotdSummary == null) {
            rotdSummary = new ArrayList<ROTDSummary>();
        }
        return this.rotdSummary;
    }

}
