
package com.kraftfoods.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRecipeSummaryDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRecipeSummaryDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecipeSummaryDetails" type="{http://www.kraftfoods.com/ws/}RecipeSummaryDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRecipeSummaryDetails", propOrder = {
    "recipeSummaryDetails"
})
public class ArrayOfRecipeSummaryDetails {

    @XmlElement(name = "RecipeSummaryDetails", nillable = true)
    protected List<RecipeSummaryDetails> recipeSummaryDetails;

    /**
     * Gets the value of the recipeSummaryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipeSummaryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipeSummaryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecipeSummaryDetails }
     * 
     * 
     */
    public List<RecipeSummaryDetails> getRecipeSummaryDetails() {
        if (recipeSummaryDetails == null) {
            recipeSummaryDetails = new ArrayList<RecipeSummaryDetails>();
        }
        return this.recipeSummaryDetails;
    }

}
