
package com.kraftfoods.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRecipeTipDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRecipeTipDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecipeTipDetail" type="{http://www.kraftfoods.com/ws/}RecipeTipDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRecipeTipDetail", propOrder = {
    "recipeTipDetail"
})
public class ArrayOfRecipeTipDetail {

    @XmlElement(name = "RecipeTipDetail", nillable = true)
    protected List<RecipeTipDetail> recipeTipDetail;

    /**
     * Gets the value of the recipeTipDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipeTipDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipeTipDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecipeTipDetail }
     * 
     * 
     */
    public List<RecipeTipDetail> getRecipeTipDetail() {
        if (recipeTipDetail == null) {
            recipeTipDetail = new ArrayList<RecipeTipDetail>();
        }
        return this.recipeTipDetail;
    }

}
