
package com.kraftfoods.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPreparationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPreparationDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PreparationDetail" type="{http://www.kraftfoods.com/ws/}PreparationDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPreparationDetail", propOrder = {
    "preparationDetail"
})
public class ArrayOfPreparationDetail {

    /**
     *
     */
    @XmlElement(name = "PreparationDetail", nillable = true)
    protected List<PreparationDetail> preparationDetail;

    /**
     * Gets the value of the preparationDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preparationDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreparationDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreparationDetail }
     * 
     * 
     * @return 
     */
    public List<PreparationDetail> getPreparationDetail() {
        if (preparationDetail == null) {
            preparationDetail = new ArrayList<PreparationDetail>();
        }
        return this.preparationDetail;
    }

}
